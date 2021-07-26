public class Gerador {
    private Monstros[] monstros;
    private String local;
    private int dificuldade;

    public Gerador(int quantidade, String[] tipos){
        this.monstros = new Monstros [quantidade];
        this.dificuldade = quantidade;

        for (var i=0; i<quantidade; i++){
            this.monstros[i] = new Monstros(tipos);
        }
    }

    public Monstros[] getMonstros() {
        return monstros;
    }

    public void setMonstros(Monstros[] monstros) {
        this.monstros = monstros;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}