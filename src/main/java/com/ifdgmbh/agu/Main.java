package com.ifdgmbh.agu;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            Path font = Paths.get("acrobatic.flf");
            String asciiArt = FigletFont.convertOneLine(font.toFile(), input);
            System.out.println(asciiArt);

            Path path = Path.of("C:\\Users\\agu\\Documents\\out.txt");
            Path filePath = Files.writeString(path,asciiArt);
        }
    }
}