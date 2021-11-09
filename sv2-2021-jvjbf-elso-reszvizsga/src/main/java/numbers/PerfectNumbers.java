package numbers;

public class PerfectNumbers {
    public boolean isPerfectNumber(int number){
        int szum=1; // mert 2 vel kezdtem a for ciklust, hisz az 1 -et fölösleges ellenőrizni mint osztót
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                szum+=i;
            }
        }
        return szum==number;

    }
}
