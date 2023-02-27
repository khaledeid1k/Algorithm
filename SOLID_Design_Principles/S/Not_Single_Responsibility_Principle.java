package SOLID_Design_Principles.S;

public class Not_Single_Responsibility_Principle {
    public class BankService {

        public long deposit(long amount, String accountNo) {
            //deposit amount
            return 0;
        }
    
        public long withDraw(long amount, String accountNo) {
            //withdraw amount
            return 0;
        }
    
        public void printPassbook() {
            //update transaction info in passbook
        }
        
        public void getLoanInterestInfo(String loanType) {
            if (loanType.equals("homeLoan")) {
                //do some job
            }
            if (loanType.equals("personalLoan")) {
                //do some job
            }
            if (loanType.equals("car")) {
                //do some job
            }
        }
    
        public void sendOTP(String medium) {
            if (medium.equals("email")) {
                //write email related logic
                //use JavaMailSenderAPI
            }
        }
    
    } 
}
