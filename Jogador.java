import javax.swing.JOptionPane;

public class Jogador {
    private String nome;
    private int dano;
    private int vida;
    private int status;

    public Jogador(String nome, int dano, int vida){
        this.nome = nome;
        this.dano = dano;
        this.vida = vida;
        this.status = 0;
    }

    public void darDano(Monstros Monstros){
        vida = Monstros.getVida() - dano;
        Monstros.setVida(vida);
        mensagem(0, this.dano);
    }

    public void curar(int quant){
        this.vida += quant;
        mensagem(1, quant);
    }

    private void mensagem(int tipo, int quant){
        if (tipo == 0){
            JOptionPane.showMessageDialog(null, "Deu "+quant+" de dano no monstro.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Curou "+quant+" de vida.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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