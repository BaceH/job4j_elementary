package ru.job4j.io;

import java.io.*;
import java.util.function.Predicate;

public class ParseFile {
    private File file;

    public synchronized void setFile(File f) {
        file = f;
    }

    public synchronized File getFile() {
        return file;
    }

    public synchronized String getContent() {
        Predicate<Integer> pred = i -> i > 0;
        return getContent(pred);
    }

    public synchronized String getContentWithoutUnicode() {
        Predicate<Integer> pred = i -> i  < 0x80;
        return getContent(pred);
    }

    public synchronized String getContent(Predicate<Integer> pred) {
        StringBuilder output = new StringBuilder();

        try(InputStream i = new FileInputStream(file)) {
            int data;
            while ((data = i.read()) > 0) {
                if(pred.test(data)) {
                    output.append((char) data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }

    public synchronized void saveContent(String content) {
        try (OutputStream o = new FileOutputStream(file)) {
            for (int i = 0; i < content.length(); i += 1) {
                o.write(content.charAt(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}