package com.example.hellojava.demo;

import com.example.hellojava.entity.demo.Res;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Restful {
    private void getRestful() {
        String url = "https://jsonplaceholder.typicode.com/users";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Res>>(){}.getType();
        List<Res> resList = gson.fromJson(response.getBody(), listType);
        if (resList != null) {
            resList.forEach(System.out::println);
        }
    }

    public static void main(String[] args) {
        Restful restful = new Restful();
        restful.getRestful();
    }
}
