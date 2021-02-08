public class Printer {
    private int sheets;
    private int tonerVolume;

    public Printer(int sheets, int tonerVolume) {
        this.sheets = sheets;
        this.tonerVolume = tonerVolume;
    }

    public int hasPaper() {
        return this.sheets;
    }

    public int print(int i, int i1) {
        if (this.sheets >= (i * i1)) {
            this.sheets -= (i * i1);
            this.tonerVolume -= (i * i1);
        }
        return this.sheets;
    }

    public int getToner() {
        return this.tonerVolume;
    }
}
