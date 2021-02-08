public class Printer {
    private int sheets;

    public Printer(int sheets) {
        this.sheets = sheets;
    }

    public int hasPaper() {
        return this.sheets;
    }

    public int print(int i, int i1) {
        if (this.sheets >= (i * i1)) {
            return this.sheets - (i * i1);
        }
        return System.out.println("Please refill the paper tray!!!");
    }
}
