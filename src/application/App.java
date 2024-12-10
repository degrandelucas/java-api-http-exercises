package application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dto.JsonBook;
import models.Book;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {

        //API do Google Books
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o novo do livro: ");
        String readBook = read.nextLine();
        String urlBook = "https://www.googleapis.com/books/v1/volumes?q="+ URLEncoder.encode(readBook, StandardCharsets.UTF_8);

        HttpClient clientBook = HttpClient.newHttpClient();
        HttpRequest requestBook = HttpRequest.newBuilder()
                .uri(URI.create(urlBook))
                .build();
        HttpResponse responseBook = clientBook.send(requestBook, HttpResponse.BodyHandlers.ofString());

        Gson gsonBook = new GsonBuilder().serializeNulls().create();
        JsonBook resposta1 = gsonBook.fromJson((String) responseBook.body(), JsonBook.class);

        Book repost = new Book(resposta1);

        System.out.println(repost);

        //API do Coin Gecko
        /*System.out.println("Digite o nome da criptomoeda (exemplo: bitcoin, ethereum): ");
        String readCoin = read.nextLine();
        String urlCoin = "https://api.coingecko.com/api/v3/simple/price?ids=" + URLEncoder.encode(readCoin, StandardCharsets.UTF_8) + "&vs_currencies=usd";

        HttpClient clientCoin = HttpClient.newHttpClient();
        HttpRequest requestCoin = HttpRequest.newBuilder()
                .uri(URI.create(urlCoin))
                .build();
        HttpResponse responseCoin = clientCoin.send(requestCoin, HttpResponse.BodyHandlers.ofString());
        System.out.println(responseCoin.body());
        System.out.println("");

        //API do TheMealDB
        System.out.println("Digite o nome de um prato (exemplo: Strawberries Romanoff, Lamb Pilaf (Plov): ");
        String readMeal = read.nextLine();
        String urlMeal = "https://themealdb.com/api/json/v1/1/search.php?s=" + URLEncoder.encode(readMeal, StandardCharsets.UTF_8);

        HttpClient clientMeal = HttpClient.newHttpClient();
        HttpRequest requestMeal = HttpRequest.newBuilder()
                .uri(URI.create(urlMeal))
                .build();
        HttpResponse responseMeal = clientMeal.send(requestMeal, HttpResponse.BodyHandlers.ofString());
        System.out.println(responseMeal.body()); */
    }
}