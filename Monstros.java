import javax.swing.JOptionPane;

public class Monstros {
    private String tipo;
    private int dano;
    private int vida;
    private int status;

    public void darDano(Player Jogador){
        vida = Jogador.getVida() - dano;
        Jogador.setVida(vida);

        JOptionPane.showMessageDialog(null, "Recebeu "+this.dano+" de dano do monstro "+this.tipo+".");
    }

    private String gerarTipo(String[] tipos){
        return tipos[gerarNumAleatorio(0, tipos.length)];
    }

    private int gerarNumAleatorio(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

    public Monstros(String[] tipos){
        this.tipo = gerarTipo(tipos);
        this.dano = gerarNumAleatorio(1, 10);
        this.vida = gerarNumAleatorio(1, 100);
        this.status = 0;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}