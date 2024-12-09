import java.io.IOException;
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
        /*System.out.println("Digite o novo do livro: ");
        String readBook = read.nextLine();
        String urlBook = "https://www.googleapis.com/books/v1/volumes?q="+ URLEncoder.encode(readBook, StandardCharsets.UTF_8);

        HttpClient clientBook = HttpClient.newHttpClient();
        HttpRequest requestBook = HttpRequest.newBuilder()
                .uri(URI.create(urlBook))
                .build();
        HttpResponse responseBook = clientBook.send(requestBook, HttpResponse.BodyHandlers.ofString());
        System.out.println(responseBook.body()); */

        System.out.println("Digite o nome da criptomoeda (exemplo: bitcoin, ethereum): ");
        String readCoin = read.nextLine();
        String urlCoin = "https://api.coingecko.com/api/v3/simple/price?ids=" + URLEncoder.encode(readCoin, StandardCharsets.UTF_8) + "&vs_currencies=usd";


        HttpClient clientCoin = HttpClient.newHttpClient();
        HttpRequest requestCoin = HttpRequest.newBuilder()
                .uri(URI.create(urlCoin))
                .build();
        HttpResponse responseCoin = clientCoin.send(requestCoin, HttpResponse.BodyHandlers.ofString());
        System.out.println(responseCoin.body());

    }
}