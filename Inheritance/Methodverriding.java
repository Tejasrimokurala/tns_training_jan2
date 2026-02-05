class Bank {
    int getRateOfInterest() {
        return 5;
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

public class Methodverriding {
    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println("Rate of Interest: " + b.getRateOfInterest());
    }
}
