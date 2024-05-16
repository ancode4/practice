package com.example.designpatterns.strategy;

import java.io.File;

public class JsonFileReadStrategy implements FileReadStrategy{
    @Override
    public String getFileContents(File file) {
        // logic to parse json from file

        return "";
    }
}
