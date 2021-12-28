package com.nouvelle.nftviewer.controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

import com.nouvelle.nftviewer.repository.NftRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/nft")    // 자동 import -> Alt Shift O
public class NftViewController {
    //App name : Nftify

    @Autowired
    NftRepository nftRepository;

    //@PostMapping("/view")
    @GetMapping("/view")
    public @ResponseBody String viewNft(){
        //String nftId = param.get("nftId");
		//String nftName = param.get("nftName");
        //String nftEtc = param.get("nftEtc");

		HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://api.opensea.io/api/v1/assets?order_direction=desc&offset=0&limit=20"))
        .method("GET", HttpRequest.BodyPublishers.noBody())
        .build();
        HttpResponse<String> response = null;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println(response.body());
		
		return response.body().toString();
    }
    
}
