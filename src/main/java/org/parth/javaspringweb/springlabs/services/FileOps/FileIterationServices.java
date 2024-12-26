package org.parth.javaspringweb.springlabs.services.FileOps;

import org.springframework.stereotype.Component;

import java.io.File;
import java.util.Arrays;

@Component
public class FileIterationServices {

    public void printFileNamesInDir(String dir){
        File directory = new File(dir);
        File[] files = directory.listFiles();
        assert files != null;
        System.out.println(" Total number of files are " + Arrays.stream(files).count());
    }
}
