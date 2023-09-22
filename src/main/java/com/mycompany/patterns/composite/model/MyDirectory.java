package com.mycompany.patterns.composite.model;

import com.mycompany.patterns.composite.FileSystemComponent;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class MyDirectory implements FileSystemComponent {
    private final String name;
    private final List<FileSystemComponent> components;
    private static final int NUMBER_OF_INDENT = 3;

    public MyDirectory(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    @Override
    public void display(int baseIndent) {
        String line = " ".repeat(baseIndent) + name;
        System.out.println(line);

        components.forEach(component ->
                component.display(baseIndent + NUMBER_OF_INDENT));
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }
}
