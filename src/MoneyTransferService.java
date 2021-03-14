public class MoneyTransferService {

    CurrencyConverter cc = new CurrencyConverter();

    double computeTransferAmount(int arrayIndex, double dollars){
        return cc.getExchangeRates(arrayIndex) * dollars;
    }

    double computeTransferFee(int arrayIndex, double dollars){
        return cc.getExchangeRates(arrayIndex) * dollars * 0.02;
    }

    public static void main(String[] args) {
        MoneyTransferService transferService = new MoneyTransferService();
        double transferAmount = transferService.computeTransferAmount(0, 1000);
        double transferFee = transferService.computeTransferFee(0, 1000);

        System.out.println("Transfer Amount: " + transferAmount);
        System.out.println("Transfer Fee: " + transferFee);
    }
}
