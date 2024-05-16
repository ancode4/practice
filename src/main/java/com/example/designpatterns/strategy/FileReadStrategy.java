package com.example.designpatterns.strategy;

import java.io.File;

public interface FileReadStrategy {
    // strategy pattern used for encapsulating functionality
    // at runtime, you can decide which funcationality you want
    String getFileContents(File file);
}
