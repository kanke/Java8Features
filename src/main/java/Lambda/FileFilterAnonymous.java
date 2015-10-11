package lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by kanke on 11/10/2015.
 */
public class FileFilterAnonymous {
    public static void main(String[] args) {


        //TODO Replace with Lambda
        FileFilter fileFilter = new FileFilter() {

            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".html");
            }
        };


        //change location to your location where you have any HTML file
        File folder = new File("/Users/kanke/Desktop");
        File[] listOfFiles = folder.listFiles(fileFilter);


        for (File file : listOfFiles) {
            System.out.println(file);
        }

    }



    /**Lamnda's are functional interfaces that belong to the java.util package
     *
     * TO be deleted : For coaches to understand, Take parameter name, add lambda syntax and then return statement = lambda expression
     */
    // FileFilter fileFilterLambda = (pathname) -> pathname.getName().endsWith(".html");


}
