public class CryptoCurrency {
    
    private String symbol;
    private String name;
    private double priceHistory[] = new double[10];

    public String getSymbol(){
        return this.symbol;
    }

    public String getName(){
        return this.name;
    }

    public void setSymbol(String symbol){
        this.symbol = symbol;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPreviousClosingPrice(){
        return priceHistory[1];
    }

    public double getCurrentPrice(){
        return priceHistory[0];
    }

    public void setCurrentPrice(double currentPrice){
        priceHistory[1] = priceHistory[0];
        priceHistory[0] = currentPrice;
    }

    CryptoCurrency(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent(){
        return (priceHistory[0] - priceHistory[1]) / priceHistory[1];
    }

    public double getAveragePrice(){
        
        double avg = 0;

        for(int i = 0; i < priceHistory.length;i++){
            avg+= priceHistory[i];
        }

        return avg/priceHistory.length;
    }
}
