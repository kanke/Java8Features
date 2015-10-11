package Lambda.Service;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by kanke on 11/10/2015.
 *
 * Creating a service that implements the fileFilter api
 */

public class FileFilterService implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(".html");
    }
}
