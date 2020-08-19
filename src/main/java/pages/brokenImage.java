package pages;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.http.client.HttpClient;
import org.openqa.selenium.remote.http.HttpRequest;
import org.openqa.selenium.remote.http.HttpResponse;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class brokenImage {

    public brokenImage(WebDriver driver){
        this.driver = driver;
    }
    private WebDriver driver;
    private By images = By.cssSelector("div > img");

    public List<WebElement> findImages(){
        List<WebElement> imagesList =  driver.findElements(images);
        return imagesList;
    }

    public void openImages(List<WebElement> imagesList){
        for (WebElement imageUrl : imagesList) {
            if (imageUrl != null) {
                try {
                    var src = imageUrl.getAttribute("src");
                    var url = src.toString();
                    var huc = (HttpURLConnection) (new URL(url).openConnection());
                    huc.setRequestMethod("HEAD");
                    huc.connect();
                    var respCode = huc.getResponseCode();
                    if (respCode >= 400) {
                        System.out.println(url + " is a broken link");
                    } else {
                        System.out.println(url + " is a valid link");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        }
    }

