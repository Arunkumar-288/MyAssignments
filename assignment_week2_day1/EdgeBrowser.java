package assignment_week2_day1;

import learnsel_week2_day1.Browser;

public class EdgeBrowser {

    public static void main(String[] args) {
        Browser obj = new Browser();
        String name = obj.launchBrowser("Edge");
        System.out.println("Launched Browser: " + name);
        obj.loadUrl();
    }
}

