import javax.swing.JOptionPane;

public class Caverna{

    public static void main(String[] args) throws Exception {
        String[] tipos = {"Slime", "Esqueleto", "Rato", "Lobo"};
        boolean run = true;
        
        Player Jogador = new Player(JOptionPane.showInputDialog(null, "Qual será o nome do heroi?"), 5, 100);

        while (run){
            var numMonstros = gerarNumAleatorio(1, 10);
            var Gerador = new Gerador(numMonstros, tipos);
            var input = JOptionPane.showInputDialog(null, "Apareceram "+numMonstros+" monstro(s)!%nOque deseja fazer?");
            var temp = Integer.parseInt(input);

            if (temp == 0){
                input = JOptionPane.showInputDialog(null, "Qual monstro deseja atacar? ("+numMontros+" Monstros restantes)");
                temp = Integer.parseInt(input);

                var monstrosTemp = Gerador.getMonstros(); 
                Jogador.darDano(monstrosTemp[temp]);
                Gerador.setMontros(monstrosTemp);

                 if (Gerador.getMonstros()[temp].getVida() <= 0){
                    Gerador.setMonstros(removerMonstros(Gerador.getMosntros(), temp));
                }
            }
            else if (temp == 1){
                Jogador.curar(10);
            }
            else if (temp == 2){
                var monstros = Gerador.getMonstros();
                var out = "";

                for (var i: monstros){
                    out += i.getTipo()+"%n";
                }

                JOptionPane.showMessageDialog(null, out);
            }

            for (var i=0; i<Gerador.getMonstros().length; i++){
                var monstros = Gerador.getMonstros();

                for (var j: monstros){
                    j.darDano(Jogador);
                }
            }

            if (Jogador.getVida() <= 0){
                JOptionPane.showMessageDialog(null, "Pereceu...");
                run = false;
            }
        }
    }

    static int gerarNumAleatorio(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

    static monstros[] removermonstros(monstros[] monstros, int index){
        monstros[] temp = new monstros [monstros.length-1];

        for (int i=0, k=0; i<monstros.length; i++){
            if (i == index){
                continue;
            }

            temp[k++] = monstros[i];
        }

        return temp;
    }
}