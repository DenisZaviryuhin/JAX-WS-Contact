package org.example.client.utils;

import org.example.client.api.DataClient;

import java.util.Scanner;

public class ClientRunner {

    private final Scanner scanner = new Scanner(System.in);
    private static final String GET_DATA_KEY = "get";
    private static final String EXIT_KEY = "off";

    public void runClient() throws Exception {
        onClient(makeRequest());
    }

    private String makeRequest() {
        System.out.print(">> To get data, input '" + GET_DATA_KEY + "' or " +
                "\nto close Client, input '" + EXIT_KEY + "': ");
        return scanner.nextLine().trim();
    }

    private String getResponse(String request) throws Exception {
        DataClient client = new DataClient();
        return client.runClient(request);
    }

    private void onClient(String input) throws Exception {
        if (input.equals(EXIT_KEY)) {
            System.out.println(">> Client is off.");
            scanner.close();
            System.exit(0);
        } else {
            getOutput(getResponse(input));
            runClient();
        }
    }

    private void getOutput(String response) {
        System.out.println(response);
    }
}
