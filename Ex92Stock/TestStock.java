package be.vdab.Ex92Stock;

public class TestStock {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle") ;
        System.out.println("stock name: " + stock.name);
        System.out.println("stock symbol: " + stock.symbol);
        System.out.println("price-change percentage: " + stock.getChangePercent(34.5, 34.35));
    }
}
