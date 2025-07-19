package org.parth.javaspringweb.springlabs.services.fileops;

import java.io.File;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class FileIterationServices {

    private static final Logger logger = LoggerFactory.getLogger(FileIterationServices.class);

    public void printFileNamesInDir(String dir){
        File directory = new File(dir);
        File[] files = directory.listFiles();
        assert files != null;
        logger.info(" Total number of files are {}", Arrays.stream(files).count());
    }
}
   