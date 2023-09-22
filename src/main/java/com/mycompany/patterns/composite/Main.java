package com.mycompany.patterns.composite;

import com.mycompany.patterns.composite.model.MyDirectory;
import com.mycompany.patterns.composite.model.MyFile;

public class Main {
    public static void main(String[] args) {
        MyFile document1 = new MyFile("Document1.txt");
        MyFile document2 = new MyFile("Document2.txt");
        MyFile image = new MyFile("Image.jpg");

        MyDirectory rootDirectory = new MyDirectory("Root");
        MyDirectory documentsDirectory = new MyDirectory("Documents");

        rootDirectory.addComponent(documentsDirectory);
        rootDirectory.addComponent(image);
        documentsDirectory.addComponent(document1);
        documentsDirectory.addComponent(document2);
        rootDirectory.display(0);
    }
}
