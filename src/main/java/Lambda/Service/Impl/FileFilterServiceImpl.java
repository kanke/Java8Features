package Lambda.Service.Impl;

import Lambda.Service.FileFilterService;

import java.io.File;

/**
 * Created by kanke on 11/10/2015.
 * <p>
 * Class that implements the fileFilterService interface and creates an
 */
public class FileFilterServiceImpl {

    public static void main(String[] args) {


        FileFilterService filterHtmlFile = new FileFilterService();

        //change location to your location where you have any HTML file
        File folder = new File("/Users/kanke/Desktop");
        File[] listOfFiles = folder.listFiles(filterHtmlFile);


        for (File file : listOfFiles) {
            System.out.println(file);
        }

    }


}