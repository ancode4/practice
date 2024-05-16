package com.example.designpatterns.strategy;

import java.io.File;

public class Main {
    public static void main(String[] args){
        FileReaderContext context = new FileReaderContext(new JsonFileReadStrategy());

        String jsonData = context.getFileContents(new File(""));
    }
}
