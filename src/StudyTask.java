public class StudyTask implements ITask{
    private String predmet;
    private int hodinCelkem;
    private int odpracovano;
    private boolean hotovo;

    public StudyTask(String predmet, int hodinCelkem) {
        this.predmet = predmet;
        this.hodinCelkem = hodinCelkem;
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
        System.out.println("Studijní úkol: " + predmet + ", Celkem: " + hodinCelkem + ", Odpracováno: " + odpracovano + ", Hotovo: " + hotovo);
    }
}
