interface Machine {
    void print();
    void scan();
    void fax();
}

class BasicPrinter implements Machine {
    public void print() {}
    public void scan() {}  // Not needed ❌
    public void fax() {}   // Not needed ❌
}
class BadExample{
    public static void main(String[] args){
        
    }
}