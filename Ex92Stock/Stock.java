package be.vdab.Ex92Stock;

public class Stock {

        String symbol;
        String name;
        double previousClosingPrice;
        double currentPrice;

        Stock(String currentSymbol, String currentName) {
            symbol = currentSymbol;
            name = currentName;
        }

        double getChangePercent(double previousClosingPrice, double currentPrice)   {
            return 100*(previousClosingPrice-currentPrice)/currentPrice;
        }
}

