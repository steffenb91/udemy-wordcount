package com.steffenboe;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Text text = args.length > 1 ? new Text(args[0],
                new TextFileStopwordList(args[1])) : new Text(args[0]);
        Metrics metrics = new Metrics(
                new NumberOfWordsMetric(text),
                new NumberOfWordsUniqueMetric(text),
                new AvgWordLengthMetric(text));
        collectAll(metrics);
    }

    private static void collectAll(Metrics metrics) {
        try {
            metrics.collectAll();
        } catch (IOException e) {
            printError(e);
        }
    }

    private static void printError(IOException e) {
        System.err.println(format("Error occurred while trying to read stopword list: %s", e.getMessage()));
    }

    private static String format(String format, Object... args) {
        return String.format(format, args);
    }
}