public class canhao {

    bala bala;
    double posiçãoFinal;

    public void Disparar(double VelocInicial, double Angulo) {
        posiçãoFinal = VelocInicial * VelocInicial * (Math.sin(Math.toRadians(Angulo) / 9.81));
        System.out.println("Bala disparada");
    }

    public double getAlcanceMaximo() {
        return x;
    }

    public void setBala(bala bala) {
        this.bala = bala;
    }
}
