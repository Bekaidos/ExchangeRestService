package Exchange;

import org.jsoup.Jsoup;
import java.io.IOException;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ExchangeRate {
    private Document document;

    public ExchangeRate(){
        connect();
    }
    String info;

    private void connect(){
        try{
            document = Jsoup.connect("https://nationalbank.kz/index.cfm?docid=747&switch=rus").get();

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public String getUSD(){
        Elements elements = document.getElementsByClass("gen7");
        info = elements.text();
        int index = info.indexOf("1 ДОЛЛАР США"); //1 доллар сша usd / kzt 378.8
        info = info.substring(index+23, index+30);
        return info.trim();
    }
    public String getEUR(){
        Elements elements = document.getElementsByClass("gen7");
        info = elements.text();
        int index = info.indexOf("1 ЕВРО"); //1 евро eur / kzt 417.32
        info = info.substring(index+17, index+25);
        return info.trim();
    }
    public String getRUB(){
        Elements elements = document.getElementsByClass("gen7");
        info = elements.text();
        int index = info.indexOf("1 РОССИЙСКИЙ РУБЛЬ");//1 российский рубль rub / kzt 6.02
        info = info.substring(index+29, index+35);
        return info.trim();
    }


}
