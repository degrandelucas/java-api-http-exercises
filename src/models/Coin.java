package models;

import dto.CoinSelect;
import dto.Quotation;

public class Coin {
    private double valueDollar;

    public Coin(CoinSelect jsonCoinResponse, String readCoin) {
        Quotation quote = jsonCoinResponse.coins().get(readCoin);
        this.valueDollar = Double.parseDouble(quote.usd());
    }

    @Override
    public String toString() {
        return "Coin{" +
                "Cotacao Dollar=" + valueDollar +
                '}';
    }
}
