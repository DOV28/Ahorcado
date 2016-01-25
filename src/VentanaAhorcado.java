
import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.random;
import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dovdo
 */
public class VentanaAhorcado extends javax.swing.JFrame {

    
     ;
    //contador para saber el numero de fallos
    int numeroFallos = 0;
    /**
     * Creates new form VentanaAhorcado
     */
    public VentanaAhorcado() {
        initComponents();
        //aqui va el codigo que poniamos en el run en ACM
        eligePalabraOculta();
    }
    private void eligePalabraOculta(){
        
        //Metodo basico de lectura de ficheros en java
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        Random r = new Random();
        fichero = new File("src/lemario-20101017.txt");
        
        try{
            fr = new FileReader(fichero);
            br = new BufferedReader (fr);
            String linea;
            int numeroLineasFichero = 0;
            while((linea=br.readLine())!=null){
                numeroLineasFichero++;
            }
            System.out.println(numeroLineasFichero);
            int lineaSeleccionada = r.nextInt(numeroLineasFichero);
            System.out.println(lineaSeleccionada);
        }
        for(int i=0;i<lineaSeleccionada;i++){
            linea = br.readLine();
        }
        
        String[]listaDePalabras = new String[10];
        Random r =new Random();
        listaDePalabras[0]="cetys";
        listaDePalabras[1]="cocos";
        listaDePalabras[2]="papas";
        listaDePalabras[3]="locos";
        listaDePalabras[4]="oveja";
        listaDePalabras[5]="listo";
        listaDePalabras[6]="error";
        listaDePalabras[7]="raros";
        listaDePalabras[8]="perro";
        listaDePalabras[9]="gatos";
        
        String palabraOculta = listaDePalabras[r.nextInt(9)];
        System.out.println(palabraOculta);
        
        
    }
    
    private void cambiaImagenAhorcado(){
       
    }
            
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g = jLabel1.getGraphics();
        Image miImagen = null;
                
        try {
            //cargamos una imagen
            switch(numeroFallos){
                case 0:miImagen = ImageIO.read(getClass().getResource("/ahorcado_0.png"));break;
                case 1:miImagen = ImageIO.read(getClass().getResource("/ahorcado_1.png"));break;
                case 2:miImagen = ImageIO.read(getClass().getResource("/ahorcado_2.png"));break;
                case 3:miImagen = ImageIO.read(getClass().getResource("/ahorcado_3.png"));break;
                case 4:miImagen = ImageIO.read(getClass().getResource("/ahorcado_4.png"));break;
                case 5:miImagen = ImageIO.read(getClass().getResource("/ahorcado_5.png"));break;
                case 6:miImagen = ImageIO.read(getClass().getResource("/ahorcado_fin.png"));break;
                case -1:miImagen = ImageIO.read(getClass().getResource("/acertasteTodo.png"));break;
                default :miImagen = ImageIO.read(getClass().getResource("/ahorcado_fin.png"));break;
            }
             
        } catch (IOException ex) {
            
        }
        g.drawImage(miImagen, 0, 0, jLabel1.getWidth(), jLabel1.getHeight(),null);
    }
    
    private void chequeaLetra(JButton boton){
        if(boton.isEnabled()){
            
        
        String letra = boton.getText();
        boton.setEnabled(false);
        String palabraConGuiones = JPanel1.getText();
        
        if(palabraOculta.contains(letra)){
            for (int i=0; i< palabraOculta.length();i++){
                if (palabraOculta.charAt(i)==letra.charAt(0)){
                    palabraConGuiones = palabraConGuiones.substring(0, 2*i)
                            + letra
                            +palabraConGuiones.substring(2*i +1);
                }
            }
            JPanel1.setText(palabraConGuiones);
            //compruebo si la palabraConGuiones hay guiones o no
            //si hay todavia algun guion no hago nada porque no he adivinado todavia la partida
            //si no hay guiones, tengo que indicar de alguna forma que he ganado la partida
            if(!palabraConGuiones.contains("_")){
                numeroFallos = -1;
            }
        }
        else{
            numeroFallos++;
            
        }
        } 
        repaint();
    }    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel1 = new javax.swing.JLabel();
        letraA = new javax.swing.JButton();
        letraB = new javax.swing.JButton();
        letraC = new javax.swing.JButton();
        letraD = new javax.swing.JButton();
        letraE = new javax.swing.JButton();
        letraF = new javax.swing.JButton();
        letraG = new javax.swing.JButton();
        letraH = new javax.swing.JButton();
        letraI = new javax.swing.JButton();
        letraJ = new javax.swing.JButton();
        letraK = new javax.swing.JButton();
        letraL = new javax.swing.JButton();
        letraM = new javax.swing.JButton();
        letraN = new javax.swing.JButton();
        letraS = new javax.swing.JButton();
        letraR = new javax.swing.JButton();
        letraQ = new javax.swing.JButton();
        letraO = new javax.swing.JButton();
        letraP = new javax.swing.JButton();
        letraU = new javax.swing.JButton();
        letraT = new javax.swing.JButton();
        letraZ = new javax.swing.JButton();
        letraY = new javax.swing.JButton();
        letraX = new javax.swing.JButton();
        letraV = new javax.swing.JButton();
        letraW = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        JPanel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JPanel1.setText("_ _ _ _ _");
        getContentPane().add(JPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 345, 65));

        letraA.setText("A");
        letraA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraAMousePressed(evt);
            }
        });
        getContentPane().add(letraA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 42, 42));

        letraB.setText("B");
        letraB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraBMousePressed(evt);
            }
        });
        getContentPane().add(letraB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 42, 42));

        letraC.setText("C");
        letraC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraCMousePressed(evt);
            }
        });
        getContentPane().add(letraC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 42, 42));

        letraD.setText("D");
        letraD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraDMousePressed(evt);
            }
        });
        getContentPane().add(letraD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 42, 42));

        letraE.setText("E");
        letraE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraEMousePressed(evt);
            }
        });
        getContentPane().add(letraE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 42, 42));

        letraF.setText("F");
        letraF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraFMousePressed(evt);
            }
        });
        getContentPane().add(letraF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 42, 42));

        letraG.setText("G");
        letraG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraGMousePressed(evt);
            }
        });
        getContentPane().add(letraG, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 42, 42));

        letraH.setText("H");
        letraH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraHMousePressed(evt);
            }
        });
        getContentPane().add(letraH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 42, 42));

        letraI.setText("I");
        letraI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraIMousePressed(evt);
            }
        });
        getContentPane().add(letraI, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 42, 42));

        letraJ.setText("J");
        letraJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraJMousePressed(evt);
            }
        });
        getContentPane().add(letraJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 42, 42));

        letraK.setText("K");
        letraK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraKMousePressed(evt);
            }
        });
        getContentPane().add(letraK, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 42, 42));

        letraL.setText("L");
        letraL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraLMousePressed(evt);
            }
        });
        getContentPane().add(letraL, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 42, 42));

        letraM.setText("M");
        letraM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraMMousePressed(evt);
            }
        });
        getContentPane().add(letraM, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 42, 42));

        letraN.setText("N");
        letraN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraNMousePressed(evt);
            }
        });
        getContentPane().add(letraN, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 42, 42));

        letraS.setText("S");
        letraS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraSMousePressed(evt);
            }
        });
        getContentPane().add(letraS, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 42, 42));

        letraR.setText("R");
        letraR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraRMousePressed(evt);
            }
        });
        getContentPane().add(letraR, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 42, 42));

        letraQ.setText("Q");
        letraQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraQMousePressed(evt);
            }
        });
        getContentPane().add(letraQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 42, 42));

        letraO.setText("O");
        letraO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraOMousePressed(evt);
            }
        });
        getContentPane().add(letraO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 42, 42));

        letraP.setText("P");
        letraP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraPMousePressed(evt);
            }
        });
        getContentPane().add(letraP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 42, 42));

        letraU.setText("U");
        letraU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraUMousePressed(evt);
            }
        });
        getContentPane().add(letraU, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 42, 42));

        letraT.setText("T");
        letraT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraTMousePressed(evt);
            }
        });
        getContentPane().add(letraT, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 42, 42));

        letraZ.setText("Z");
        letraZ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraZMousePressed(evt);
            }
        });
        getContentPane().add(letraZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 42, 42));

        letraY.setText("Y");
        letraY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraYMousePressed(evt);
            }
        });
        getContentPane().add(letraY, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 42, 42));

        letraX.setText("X");
        letraX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraXMousePressed(evt);
            }
        });
        getContentPane().add(letraX, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 42, 42));

        letraV.setText("V");
        letraV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraVMousePressed(evt);
            }
        });
        getContentPane().add(letraV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 42, 42));

        letraW.setText("W");
        letraW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraWMousePressed(evt);
            }
        });
        getContentPane().add(letraW, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 42, 42));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 200, 230));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 556, 330, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void letraAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraAMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraAMousePressed

    private void letraHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraHMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraHMousePressed

    private void letraOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraOMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraOMousePressed

    private void letraVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraVMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraVMousePressed

    private void letraBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraBMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraBMousePressed

    private void letraCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraCMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraCMousePressed

    private void letraDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraDMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraDMousePressed

    private void letraEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraEMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraEMousePressed

    private void letraFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraFMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraFMousePressed

    private void letraGMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraGMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraGMousePressed

    private void letraIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraIMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraIMousePressed

    private void letraJMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraJMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraJMousePressed

    private void letraKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraKMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraKMousePressed

    private void letraLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraLMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraLMousePressed

    private void letraMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraMMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraMMousePressed

    private void letraTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraTMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraTMousePressed

    private void letraWMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraWMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraWMousePressed

    private void letraNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraNMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraNMousePressed

    private void letraPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraPMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraPMousePressed

    private void letraQMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraQMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraQMousePressed

    private void letraRMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraRMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraRMousePressed

    private void letraSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraSMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraSMousePressed

    private void letraUMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraUMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraUMousePressed

    private void letraXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraXMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraXMousePressed

    private void letraYMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraYMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraYMousePressed

    private void letraZMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraZMousePressed
        // TODO add your handling code here:
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_letraZMousePressed

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
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAhorcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton letraA;
    private javax.swing.JButton letraB;
    private javax.swing.JButton letraC;
    private javax.swing.JButton letraD;
    private javax.swing.JButton letraE;
    private javax.swing.JButton letraF;
    private javax.swing.JButton letraG;
    private javax.swing.JButton letraH;
    private javax.swing.JButton letraI;
    private javax.swing.JButton letraJ;
    private javax.swing.JButton letraK;
    private javax.swing.JButton letraL;
    private javax.swing.JButton letraM;
    private javax.swing.JButton letraN;
    private javax.swing.JButton letraO;
    private javax.swing.JButton letraP;
    private javax.swing.JButton letraQ;
    private javax.swing.JButton letraR;
    private javax.swing.JButton letraS;
    private javax.swing.JButton letraT;
    private javax.swing.JButton letraU;
    private javax.swing.JButton letraV;
    private javax.swing.JButton letraW;
    private javax.swing.JButton letraX;
    private javax.swing.JButton letraY;
    private javax.swing.JButton letraZ;
    // End of variables declaration//GEN-END:variables
}
