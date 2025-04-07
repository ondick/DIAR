public class PersonalTask implements ITask {
    private String popis;
    private int maxCas;
    private int odpracovano;
    private boolean hotovo;
    public PersonalTask(String popis, int maxCas, int odpracovano, boolean hotovo) {
        this.popis = popis;
        this.maxCas = 0;
        this.odpracovano = 0;
        this.hotovo = false;
    }

    @Override
    public void update(int noveOdpracovano, boolean isDone) {
        this.odpracovano += noveOdpracovano;
        this.hotovo = isDone;
    }

    @Override
    public void display() {
        System.out.println("Popis: " + popis+", Nejvíc času: "+maxCas+", Odpracovano: "+odpracovano+", Hotovo: "+hotovo);
    }
}
