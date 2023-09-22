package com.mycompany.patterns.composite.model;

import com.mycompany.patterns.composite.FileSystemComponent;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MyFile implements FileSystemComponent {
    private final String name;

    @Override
    public void display(int baseIndent) {
        String line = " ".repeat(baseIndent) + name;
        System.out.println(line);
    }
}
