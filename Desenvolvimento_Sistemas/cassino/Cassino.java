/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win10
 */
public class Principal extends javax.swing.JFrame {
    int moeda;
    int pontos;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_titulo_moeda = new javax.swing.JLabel();
        lbl_resultado_moeda = new javax.swing.JLabel();
        lbl_resultado_pontuacao = new javax.swing.JLabel();
        lbl_titulo_pontuacao = new javax.swing.JLabel();
        bt_2 = new javax.swing.JButton();
        bt_1 = new javax.swing.JButton();
        bt_3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Placar Geral"));

        lbl_titulo_moeda.setText("Quantidade de Moeda");

        lbl_resultado_moeda.setText("Pontuação..................:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_resultado_moeda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(lbl_resultado_pontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_titulo_moeda)
                .addGap(18, 18, 18)
                .addComponent(lbl_titulo_pontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_titulo_moeda)
                    .addComponent(lbl_titulo_pontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_resultado_pontuacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_resultado_moeda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        bt_2.setText("Novo Jogo");
        bt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_2ActionPerformed(evt);
            }
        });

        bt_1.setText("Apostar");
        bt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_1ActionPerformed(evt);
            }
        });

        bt_3.setText("Sair");
        bt_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_2)
                        .addGap(18, 18, 18)
                        .addComponent(bt_1)
                        .addGap(18, 18, 18)
                        .addComponent(bt_3)))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_2)
                    .addComponent(bt_1)
                    .addComponent(bt_3))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
     public void checarjogo(int a, int b, int c){
        if((a == 7) && (b == 7) && (c == 7))
        {
            moeda = moeda +100;
            pontos = pontos +100;
            JOptionPane.showMessageDialog(rootPane, "Parabéns, Você é o Vencedor!");
            lbl_titulo_moeda.setText(String.valueOf(moeda));
            lbl_titulo_pontuacao.setText(String.valueOf(pontos));
            bt_1.setEnabled(false);
            bt_2.setEnabled(false);
            bt_3.setEnabled(false);
        }
        else {
            if(((a == 7) && (b == 7)) || ((a == 7) && (c == 7)) || ((b == 7) && (c == 7)))
            {
               moeda = moeda + 2;
               pontos = pontos + 2;
               lbl_titulo_moeda.setText(String.valueOf(moeda));
               lbl_titulo_pontuacao.setText(String.valueOf(pontos));        
                
        }
        else
            {
                if((a == 7) || (b == 7) || (c == 7))
                {
                    moeda = moeda + 1;
                    pontos = pontos + 1;
                    lbl_titulo_moeda.setText(String.valueOf(moeda));
                    lbl_titulo_pontuacao.setText(String.valueOf(pontos));
                }
                else
                {
                    if((a != 7) && (b != 7) && (c != 7))
                    {
                        moeda = moeda - 1;
                        lbl_titulo_moeda.setText(String.valueOf(moeda));
                        lbl_titulo_pontuacao.setText(String.valueOf(pontos));
                        if((moeda == 0))
                        {
                            JOptionPane.showMessageDialog(rootPane, "Você Perdeu!");
                            bt_1.setEnabled(false);
                            bt_2.setEnabled(false);
                            bt_3.setEnabled(false);
                            jPanel1.setEnabled(false);
                        }
                    }
                }
                    
            }
                
        }
     }
    private void bt_2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        moeda = 20;
        pontos = 0;
        bt_1.setEnabled(true);
        bt_2.setEnabled(true);
        bt_3.setEnabled(true);
        jPanel1.setEnabled(true);
        lbl_titulo_moeda.setText(String.valueOf(moeda));
        lbl_titulo_pontuacao.setText(String.valueOf(pontos));
    }                                    

    private void bt_3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        System.exit(0);
    }                                    

    private void bt_1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        int i1, i2, i3;
        Random r1 = new Random();
        Random r2 = new Random();
        Random r3 = new Random();
        i1 = r1.nextInt(10);
        i2 = r2.nextInt(10);
        i3 = r3.nextInt(10);
        bt_1.setText(String.valueOf(i1));
        bt_2.setText(String.valueOf(i2));
        bt_3.setText(String.valueOf(i3));
        checarjogo(i1, i2, i3);
    }                                    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton bt_1;
    private javax.swing.JButton bt_2;
    private javax.swing.JButton bt_3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_resultado_moeda;
    private javax.swing.JLabel lbl_resultado_pontuacao;
    private javax.swing.JLabel lbl_titulo_moeda;
    private javax.swing.JLabel lbl_titulo_pontuacao;
    // End of variables declaration                   
}



class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}



import java.util.Calendar;
import java.util.Random;

public class Random3 {
public int k;


    public static void main(String[] args) {

        //instância um objeto da classe Random especificando a semente
        Random gerador = new Random(19700621);

        //imprime sequência de 10 números inteiros aleatórios entre 0 e 25
        int k = random.nextInt();
    }
}



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Confirmador {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);

    public static String leString() throws IOException {
        String x;
        x = br.readLine();
        return x;

    }

    public static int leInt() throws IOException {
        String x = leString();
        return Integer.parseInt(x);
    }

    public static double leDouble() throws IOException {
        String x = leString();
        return Double.parseDouble(x);

    }
}






public class Dado extends java.lang.Object {
    
    public Dado(int lados) {
        this.lados = lados;
    }

    public Dado() {
        this.lados = 6;
    }

    int lados;
    public int ultimoLancamento;

    private static Random resultado = new Random();

    public int rolar() {
        ultimoLancamento = (resultado.getIntRand(this.lados) + 1);
        return this.ultimoLancamento;
    }

    public int getLado() {
        return ultimoLancamento;
    }


    @Override
    public String toString() {
        switch (ultimoLancamento) {
            case 1:
                return "+-----+" +
                        "|     |" +
                        "|  *  |" +
                        "|     |" +
                        "+-----+";
            case 2:
                return "+-----+" +
                        "|*    |" +
                        "|     |" +
                        "|    *|" +
                        "+-----+";
            case 3:
                return "+-----+" +
                        "|*    |" +
                        "|  *  |" +
                        "|    *|" +
                        "+-----+";
            case 4:
                return "+-----+" +
                        "|*   *|" +
                        "|     |" +
                        "|*   *|" +
                        "+-----+";
            case 5:
                return "+-----+" +
                        "|*   *|" +
                        "|  *  |" +
                        "|*   *|" +
                        "+-----+";
            case 6:
                return "+-----+" +
                        "|*   *|" +
                        "|*   *|" +
                        "|*   *|" +
                        "+-----+";
        }
        return null;
    }
}



import java.lang.Integer;
import java.lang.String;

public class RolaDados {
    public RolaDados (int n) {
        this.numeroDeDados = n;
        listaDeDados = new Dado[n];
        for (int i = 0; i < n; i++) {
            listaDeDados[i] = new Dado();
        }
    }
    Dado listaDeDados[];
    int numeroDeDados;

    /**Rola todos os dados usando uma classe que gera números aleatórios
     * @return vetor de inteiros com os valores das faces para cima dos dados*/
    public int[] rolar () {
        int resultado[];
        resultado = new int[numeroDeDados];
        for (int i = 0; i < numeroDeDados; i++) {
            resultado[i] = listaDeDados[i].rolar();
        }
        return resultado;
    }

    /**Rola alguns dados usando uma classe que gera números aleatórios
     * @param quais vetor de booleanos que indica quais dados devem ser rolados
     * @return vetor de inteiros com o valor das faces para cima
     * */
    public int [] rolar (boolean[] quais) {
        int resultado[];
        resultado = new int[numeroDeDados];
        for (int i = 0; i < numeroDeDados; i++) {
            if (quais[i]) {
                resultado[i] = listaDeDados[i].rolar();
            } else {
                resultado[i] = listaDeDados[i].getLado();
            }
        }
        return resultado;
    }
    
    public int [] rolar (String s) {
        int resultado[], auxiliar[];
        resultado = new int[numeroDeDados];
        String separados[];
        separados = s.split(" ");
        int tam = separados.length;
        auxiliar = new int[tam];
        for (int i = 0; i < tam; i++) {
            auxiliar[i] = Integer.parseInt(separados[i]) - 1;
        }

        for (int i = 0; i < tam; i++) {
            listaDeDados[auxiliar[i]].rolar();
        }

        for (int i = 0; i < numeroDeDados; i++) {
            resultado[i] = listaDeDados[i].getLado();
        }
        return resultado;
    }

    @Override
    public String toString () {

        String result = " 1        2        3        4        5\n+-----+  +-----+  +-----+  +-----+  +-----+\n";
        for(int i=0; i< 5; i++) {
            if (listaDeDados[i].getLado() == 1) result +="|     |  ";
            else if (listaDeDados[i].getLado() == 2 || listaDeDados[i].getLado() == 3) result+="|*    |  ";
            else result+="|*   *|  ";
            if (i == 4) result+="\n";
        }

        for(int i=0; i< 5; i++) {
            if (listaDeDados[i].getLado() == 1 || listaDeDados[i].getLado() == 3 || listaDeDados[i].getLado() == 5) result+="|  *  |  ";
            else if (listaDeDados[i].getLado() == 6) result+="|*   *|  ";
            else result+="|     |  ";
            if (i == 4) result+="\n";
        }

        for(int i=0; i< 5; i++) {
            if (listaDeDados[i].getLado() == 2 || listaDeDados[i].getLado() == 3) result+="|    *|  ";
            else if (listaDeDados[i].getLado() == 1) result+="|     |  ";
            else result+="|*   *|  ";
            if (i == 4) result+="\n";
        }

        result+="+-----+  +-----+  +-----+  +-----+  +-----+\n";
        return result;
    }
}



import java.util.Scanner;
/**
 *
 * @author Clayton
 */
public class Casino {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double carteira = 100.00; //Começar carteira com R$ 100.00.
        double aposta ;     //valor Aposta Jogador.
        double resultado ; //Armazenar os ganhos e as perdas de cada jogo.
        String entrada ; //Usar para entrada
        //Criar instâcia do jogo Roleta
        Roleta jogo = new Roleta();
        do{
            System.out.print("Quanto você gostaria de Apostar?.....: ");
            aposta = console.nextDouble();
            carteira = carteira - aposta;
             if(carteira < 0){
                System.out.println(" ***ATENÇÂO ACABARAM OS CREDITOS*** ");
                break;
            }
            //Jogue uma Partida e armazenar os resultados
            resultado = jogo.Apostar(console, aposta);
            //Imprimir Resulatado
            jogo.Imprimir();
            //Liberar o buffer
            console.nextLine();
            //Quantidade de Atualização do valor da carteira e Avisar o Jogador.
            carteira = carteira + resultado;
            System.out.println("Voce tem R$"+ carteira +" em sua Carteira.");
            System.out.print("Apostar Mais uma vez? (S)Sim ou (N)Não.....: ");
            entrada = console.nextLine();      
        }while(!entrada.equalsIgnoreCase("N"));
    }// fim main
}//end class



public class Placar {
    int placar[];

    public Placar () {
        placar = new int[10];
        for (int i = 0; i < 10; i++) placar[i] = -1;
    }

    public void add (int posicao, int[] dados) throws java.lang.IllegalArgumentException {

        if (posicao > 0 && posicao < 11) {
            switch (posicao) {
                case 1:
                    if (placar[0] != -1) throw new IllegalArgumentException("Essa posição está ocupada.");
                    else {
                        int result = 0;
                        for(int i = 0; i<5; i++){
                            if(dados[i] == 1) result += 1;
                        }
                        placar[0] = result;
                    }
                    break;

                case 2:
                    if (placar[1] != -1) throw new IllegalArgumentException("Essa posição está ocupada.");
                    else {
                        int result = 0;
                        for(int i = 0; i<5; i++){
                            if(dados[i] == 2) result += 2;
                        }
                        placar[1] = result;
                    }
                    break;

                case 3:
                    if (placar[2] != -1) throw new IllegalArgumentException("Essa posição está ocupada.");
                    else {
                        int result = 0;
                        for(int i = 0; i<5; i++){
                            if(dados[i] == 3) result += 3;
                        }
                        placar[2] = result;
                    }
                    break;

                case 4:
                    if (placar[3] != -1) throw new IllegalArgumentException("Essa posição está ocupada.");
                    else {
                        int result = 0;
                        for(int i = 0; i<5; i++){
                            if(dados[i] == 4) result += 4;
                        }
                        placar[3] = result;
                    }
                    break;

                case 5:
                    if (placar[4] != -1) throw new IllegalArgumentException("Essa posição está ocupada.");
                    else {
                        int result = 0;
                        for(int i = 0; i<5; i++){
                            if(dados[i] == 5) result += 5;
                        }
                        placar[4] = result;
                    }
                    break;

                case 6:
                    if (placar[5] != -1) throw new IllegalArgumentException("Essa posição está ocupada.");
                    else {
                        int result = 0;
                        for(int i = 0; i<5; i++){
                            if(dados[i] == 6) result += 6;
                        }
                        placar[5] = result;
                    }
                    break;

                case 7: 
                    int flagFull = 0, flag3 = 0, flag2 = 0;
                    int fullHand[];
                    fullHand = new int[6];
                    for(int i=0; i<5; i++) fullHand[dados[i] - 1]++;

                    for(int i=0; i<6; i++){
                        if(fullHand[i] == 3) flag3 = 1;
                        if(fullHand[i] == 2) flag2 = 1;
                        if(fullHand[i] == 5) flagFull = 1;
                    }

                    if(flag2 == 1 && flag3 == 1) placar[6] = 15;
                    else if(flagFull == 1) placar[6] = 15;
                    else placar[6] = 0;

                    break;
                case 8: 
                    int sequencia[];
                    sequencia = new int[6];
                    for(int i=0; i<5; i++) sequencia[dados[i] - 1]++;

                    for(int i=0; i<6; i++){
                        if(sequencia[i] > 1) placar[7] = 0;
                    }
                    if(placar[7] != 0) placar[7] = 20;

                    break;

                case 9: 
                    int quadra[];
                    quadra = new int[6];
                    for(int i=0; i<5; i++) quadra[dados[i] - 1]++;

                    for(int i=0; i<6; i++){
                        if(quadra[i] >= 4) placar[8] = 30;
                    }
                    if(placar[8] != 30) placar[8] = 0;

                    break;
                case 10: 
                    int general[];
                    general = new int[6];
                    for(int i=0; i<5; i++) general[dados[i] - 1]++;

                    for(int i=0; i<6; i++){
                        if(general[i] == 5) placar[9] = 40;
                    }
                    if(placar[9] != 40) placar[9] = 0;

                    break;
            }
        } else {
            throw new IllegalArgumentException("Essa posição do placar não existe\n");
        }
    }

    public int getScore(){
        int resultado = 0;
        for(int i = 0; i<10; i++) resultado += placar[i];
        return resultado;
    }
    public String toString () {
        return  " "+(placar[0] == -1 ? "(1)" : placar[0])+"     " +
                "|   "+(placar[6] == -1 ? "(7)" : placar[6])+"     " +
                "|    "+(placar[3] == -1 ? "(4)" : placar[3])+"  \n" +
                " --------------------------\n" +
                " "+(placar[1] == -1 ? "(2)" : placar[1])+"     " +
                "|    "+(placar[7] == -1 ? "(8)" : placar[7])+"    " +
                "|    "+(placar[4] == -1 ? "(5)" : placar[4])+"  \n" +
                " --------------------------\n" +
                " "+(placar[2] == -1 ? "(3)" : placar[2])+"     " +
                "|   "+(placar[8] == -1 ? "(9)" : placar[8])+"     " +
                "|    "+(placar[5] == -1 ? "(6)" : placar[5])+"  \n" +
                "--------------------------\n" +
                "        |    "+(placar[9] == -1 ? "(10)" : placar[9])+"    |\n" +
                "        +----------+ ";
    }

}



import java.util.Random;
import java.util.Scanner;
public class Roleta { // Primeira Vez
        double resultado = 0; //Variável que recebera o resultado do sorteio randomico.
        int cor; // Variável de entrada Cor a escolher 0)Vermelho ou 1)Preto.
        String corEsc = null; //Variável pra Guardar Cor Escolhida como int em String
        String corRan = null; //Variável pra Guardar Cor Sortiada como int em String
        int aposta; // Variável de Aposta
        int numeroRandom;
        int corRandom;
    public double Apostar(Scanner semValor,double valorAposta){ // Abre Segunda Scanner semValor
        Scanner console = new Scanner(System.in);
        Random r = new Random();//Gerar Numeros Aleatórios.
        this.numeroRandom = r.nextInt(36);// Variavel que recebe um Numero Randomico de 0 a 36
        this.corRandom = r.nextInt(1);//Variável que recebe Cor Randomica 0)Vermelho ou 2)Preto
        System.out.print("Ecolha o Numero entre ( 0 a 36).......:");
        this.aposta = console.nextInt();
        System.out.print("Voce quer Apostar 0) Vermelho ou 1) Preto? ...:");
        this.cor = console.nextInt();
        if(this.cor == 0){
            this.corEsc = "VERMELHO";
        }else{
            this.corEsc = "PRETO";
        }
        System.out.println("");
         if(this.corRandom == 0){
             this.corRan = "VERMELHO";
         }else{
             this.corRan = "PRETO";
         }
        //Verifica se o Numero Sortiado Randomico é 0 e se Numero Apostado é 0
        if((this.aposta == 0)&&( this.numeroRandom == 0)||(this.aposta == this.numeroRandom)){
            this.resultado = valorAposta * 5;// Se for 0 ganha 5x o valor apostado.
            this.corEsc = "";
            this.corRan = "";
            System.out.println("Ganhou 5x o Valor da Aposta R$"+resultado);
        }
        else if((cor == corRandom)||(numeroRandom != aposta)){
                resultado = valorAposta - valorAposta ; //Perde Valor Apostado
            System.out.println("Perdeu Playboy !!!");
        }
        else if((cor == corRandom)||(numeroRandom == aposta)){
                resultado = valorAposta * 3; //se for Numero igual ganha 3x o Valor Apostado.  
             System.out.println("Ganhou 3x o Valor R$"+resultado);
        }
        else if((cor != corRandom)&&(numeroRandom != aposta)){
                resultado = valorAposta - valorAposta ; //Perde Valor Apostado
            System.out.println("Perdeu Playboy !!!");
        }
        else if((cor != corRandom)||(numeroRandom == aposta)){
                resultado = valorAposta + valorAposta; //se for Numero igual ganha 1x o Valor Apostado.  
             System.out.println("Ganhou 1x o Valor R$"+resultado);
        }
        return resultado;
    }
    public void Imprimir(){
        System.out.println("");
 System.out.println("************************************************************");
        System.out.println("");
        System.out.println("Cor Apostada => "+corEsc+"    Cor Aleatorio   => "+corRan);
        System.out.println("Valor Apostado=> "+aposta+"        Valor Aleatorio => "+numeroRandom);
        System.out.println("");
 System.out.println("************************************************************");
    }
}



import com.sun.org.apache.xpath.internal.functions.FuncStringLength;

import java.io.IOException;

public class General {
    public static void main (String[] args) throws IOException{

        RolaDados dados;
        dados = new RolaDados(5);
        Placar placar;
        placar = new Placar();

        int numeroRodadas = 10;
        System.out.printf("Bem vindo ao General!\n");
        System.out.printf("==================\n");

        while (numeroRodadas > 0) {
            System.out.printf("Digite ENTER para iniciar a rodada\n");
            String enter = Confirmador.leString();

            int resultados[] = dados.rolar();
            int counterDado = 0;
            System.out.println(dados);
            System.out.printf("Escolha os dados a serem rolados novamente ou digite ENTER para finalizar a rodada\n");
            String ASeremRolados = Confirmador.leString();
            if (!ASeremRolados.equals("")) {
                resultados = dados.rolar(ASeremRolados);
                System.out.println(dados);

                System.out.printf("Escolha os dados a serem rolados novamente ou digite ENTER para finalizar a rodada\n");
                ASeremRolados = Confirmador.leString();

                if (!ASeremRolados.equals("")) {

                    resultados = dados.rolar(ASeremRolados);

                }
                System.out.println(dados);
            } else System.out.println(dados);

            System.out.println(placar);
            System.out.printf("Escolha uma posicao de 1 a 10 para ser ocupada\n");
            int pos = Confirmador.leInt();

            try {
                placar.add(pos, resultados);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Escolha uma posicao VALIDA para ser ocupada");
                pos = Confirmador.leInt();
                placar.add(pos, resultados);
            }
                System.out.println(placar);

            numeroRodadas--;
        }

        System.out.println("Você obteve " + placar.getScore() + " pontos!\n");

    }
}
