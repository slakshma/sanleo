package com.sanleo.myretail;

import java.net.URL;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlOption;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSelect;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try
		 {
			
	    	final String APP_URL = 
	    	"http://www.sobeys.com/en/Home.aspx";
	    
	    	WebClient webClient = new WebClient(BrowserVersion.FIREFOX_3);
	    	//DefaultCredentialsProvider creds = (DefaultCredentialsProvider)webClient.getCredentialsProvider();
	    	// Set some example credentials
	    	//creds.addProxyCredentials("", "");
	    	//creds.addNTLMCredentials("", "", null, -1, "", "");
	    	//creds.addCredentials("xxxx", "xxxx");
	    	// And now add the provider to the webClient instance
	    	//webClient.setCredentialsProvider(creds);
	    	//String userAndPassword = "user" + ":" + "xxxx";
	    	//byte[] userAndPasswordBase64 = Base64.encodeBase64(userAndPassword.getBytes());
	    	//String userAndPasswordBase64S = new String(userAndPasswordBase64);
	    	//webClient.addRequestHeader("Proxy-Authorization", "Basic "+userAndPasswordBase64S);
			
	    	webClient.setJavaScriptEnabled(true);
	    	webClient.setThrowExceptionOnFailingStatusCode(false);
			URL url = new URL(APP_URL);
			HtmlPage page = (HtmlPage) webClient.getPage(url);
			 
			HtmlOption option = getOption(page, 
					"//*[@id=\"plcRoot_Layout_zonedropdowns_province_city_store_dropdowns_provincesDDL\"]", "Nova Scotia");
			Thread.sleep(500);
			option = getOption(page, 
					"//*[@id=\"city\"]", "Halifax");
			Thread.sleep(500);
			option = getOption(page, 
					"//*[@id=\"store\"]", "Sobeys - Clayton Park");
			HtmlAnchor anchor = (HtmlAnchor)page.getByXPath("/html/body/form/div[4]/div/div[2]/fieldset/ul/li[9]/div/span/a").get(0);
			page = anchor.click();
			anchor = (HtmlAnchor)page.getByXPath("//*[@id=\"vieaccessibleflyer\"]").get(0); 
			page = anchor.click();
			Thread.sleep(1000); //wait to load all the deals by javascript
			System.out.println("Connected");
			System.out.println(page.asText());
			
			
			
		 } catch (Exception e) {
		        e.printStackTrace();
		 }
    }
    
    public static HtmlOption getOption(HtmlPage page, String xPath, String value) {
    	HtmlSelect choice = (HtmlSelect)page.getByXPath(xPath).get(0);
    	HtmlOption selectedOption = null;
    	for (HtmlElement province : choice.getChildElements()) {
    		if (province.asText().equals(value)) {
    			selectedOption = (HtmlOption) province;
    			break;
    		}
    	}
    	choice.setSelectedAttribute(selectedOption, true);
    	return selectedOption;
    }
}
