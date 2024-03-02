package org.example.server.service;

import jakarta.jws.WebService;
import org.example.server.repository.DataRepository;

import java.util.concurrent.atomic.AtomicInteger;

@WebService(endpointInterface = "org.example.server.service.DataService")
public class DataServiceImpl implements DataService {
    private static final String GET_DATA_KEY = "get";

    @Override
    public String getData(String request) {
        return ">>Server response:\n" + fetchData(request);

    }

    public String fetchData(String request) {
        if (request.equals(GET_DATA_KEY)) {
            AtomicInteger cnt = new AtomicInteger(0);
            StringBuilder sb = new StringBuilder();
            new DataRepository().fetchData().forEach(value ->
                    sb.append(cnt.incrementAndGet())
                            .append(") ")
                            .append(value.toString()));
            return sb.toString();
        } else return "No data";
    }
}
