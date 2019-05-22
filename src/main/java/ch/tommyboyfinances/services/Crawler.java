package ch.tommyboyfinances.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Crawler {

    public Crawler(String urlString) {
        BufferedReader bufferedReader = null;
        InputStreamReader inputStreamReader = null;
        URL url = null;
        String line = null;
        ArrayList<String> allOccurrences = new ArrayList<String>();

        try {
            url = new URL(urlString);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }4w3u6XAHZenE

        try {
            inputStreamReader = new InputStreamReader(url.openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        bufferedReader = new BufferedReader(inputStreamReader);

        try {
            while((line = bufferedReader.readLine()) != null ) {
                if (line.contains("Ghibli")) {
                    allOccurrences.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String occurrence: allOccurrences) {
            System.out.println(occurrence);
        }

    }

}
