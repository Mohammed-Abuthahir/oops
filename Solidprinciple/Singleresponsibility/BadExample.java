// A class should have only one reason to change, meaning it should have only one responsibility.

class InvoiceService {
    public void calculateTotal() {
        // calculation logic
    }

    public void saveToDatabase() {
        // database logic
    }

    public void sendEmail() {
        // email logic
    }
}
class BadExample{
    public static void main(String[] args){

    }
}