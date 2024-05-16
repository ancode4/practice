package com.example.designpatterns.strategy;

import java.io.File;

public class FileReaderContext {
    FileReadStrategy fileReadStrategy;
    public FileReaderContext(FileReadStrategy fs){
        fileReadStrategy = fs;
    }
    public String getFileContents(File file){
        return fileReadStrategy.getFileContents(file);
    }
}
