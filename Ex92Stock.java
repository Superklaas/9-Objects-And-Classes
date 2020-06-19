package be.vdab;

class Stock {
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

public class Ex92Stock {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle") ;
        System.out.println("stock name: " + stock.name);
        System.out.println("stock symbol: " + stock.symbol);
        System.out.println("price-change percentage: " + stock.getChangePercent(34.5, 34.35));
    }
}
