public class CurrencyConverter {

    double[] exchangeRates = {63.0, 3.0, 3.0, 595.0, 18.0, 107.0, 2.0};
//    double[] exchangeRates;

    void setExchangeRates(double[] rates){
        exchangeRates = rates;
    }

    void updateExchangeRates(int arrayIndex, double newValue){
        exchangeRates[arrayIndex] = newValue;
    }

    double getExchangeRates(int arrayIndex){
        return exchangeRates[arrayIndex];
    }

    double computeTransferAmount(int arrayIndex, double dollars){
        return getExchangeRates(arrayIndex) * dollars;
    }

    void printCurrencies(){
        System.out.println("rupee: " + exchangeRates[0]);
        System.out.println("dirham: " + exchangeRates[1]);
        System.out.println("real: " + exchangeRates[2]);
        System.out.println("chilean peso: " + exchangeRates[3]);
        System.out.println("mexican peso: " + exchangeRates[4]);
        System.out.println("_yen: " + exchangeRates[5]);
        System.out.println("australian: " + exchangeRates[6] + "\n");
    }

//    public static void main(String[] args){
//        CurrencyConverter cc = new CurrencyConverter();
//
//        // Jan 1
//        double[] rates = {63.0, 3.0, 3.0, 595.0, 18.0, 107.0, 2.0};
//        cc.setExchangeRates(rates);
//        cc.printCurrencies();
//
//        // Jan 2
//        rates = new double[]{65.0, 4.0, 3.0, 595.0, 18.0, 108.0, 2.0};
//        cc.setExchangeRates(rates);
//        cc.printCurrencies();
//
//        cc.updateExchangeRates(0,66.0);
//        cc.printCurrencies();
//
//        double amount = cc.computeTransferAmount(0,1000);
//
//        System.out.println("Transferred Amount: " + amount);
//
//    }
}
