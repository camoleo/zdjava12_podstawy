package Obiekty.Library.app;

import java.util.Scanner;

public class Reader {
    Scanner scanner = new Scanner(System.in);

    private int readerId;
    private String readerName;

    private static int readerIdCounter = 0;

    public static int getReaderIdCounter() {
        return readerIdCounter;
    }
    public static int getIdCounter() {
        return readerIdCounter;
    }

    public Reader() {
        readerId = 0;
        readerName = null;
    }

    public Reader( String readerName) {
        this.readerId = readerIdCounter;
        readerIdCounter++;
        this.readerName = readerName;
    }

    public int getReaderId() {

        return readerId;
    }

    public String getReaderName() {

        return readerName;
    }

    public void setReaderId(int readerId) {

        this.readerId = readerId;
    }

    public void setReaderName(String readerName) {

        this.readerName = readerName;
    }

    @Override
    public String toString() {
        return
                "\nReader ID: " + readerId + " \nName: " + readerName + "\n";
    }
}