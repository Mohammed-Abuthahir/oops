// Clients should not be forced to depend on interfaces they do not use
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface Fax {
    void fax();
}

class BasicPrinter implements Printer {
    public void print() {
        System.out.println("Printing");
    }
}

class AdvancedPrinter implements Printer, Scanner, Fax {
    public void print() {}
    public void scan() {}
    public void fax() {}
}