/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author unifgimoreira
 */
public class Janela extends javax.swing.JFrame {

    Random gerador = new Random();
    ArrayList<String> frases = new ArrayList<>();
    
    public Janela() {
        initComponents();
        frases.add("Um pequeno jabuti xereta viu dez cegonhas felizes.");
        frases.add("A rápida raposa marrom salta sobre o cão preguiçoso.");
        frases.add("Examinei os pinguins de um jeito que nunca imaginei.");
        frases.add("Gazeta publica um vídeo com o jato e a xaxim.");
        frases.add("Fui à praia e comprei um queijo e um vinho.");
        frases.add("Vovô faz cinco pratos de comida para o jantar.");
        frases.add("Lá no parque, há um gato que adora pular.");
        frases.add("Os maçons que xingam as zebras nunca se esquecem.");
        frases.add("Jovens velhos saem da zona de conforto com um shake.");
        frases.add("Uma vovó muito simpática fez xaxim para as flores.");
        
        int num = gerador.nextInt(9);
        String frase = frases.get(num);
        
        txt1.setText(frase);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnÇ = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnSpace = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtArea.setRows(5);
        txtArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAreaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAreaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtArea);

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn1.setText("1");
        btn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn2.setText("2");
        btn2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn3.setText("3");
        btn3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn4.setText("4");
        btn4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn5.setText("5");
        btn5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn6.setText("6");
        btn6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn0.setBackground(new java.awt.Color(255, 255, 255));
        btn0.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn0.setText("0");
        btn0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnQ.setBackground(new java.awt.Color(255, 255, 255));
        btnQ.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnQ.setText("Q");
        btnQ.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnW.setBackground(new java.awt.Color(255, 255, 255));
        btnW.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnW.setText("W");
        btnW.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn7.setText("7");
        btn7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn8.setText("8");
        btn8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn9.setText("9");
        btn9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnO.setBackground(new java.awt.Color(255, 255, 255));
        btnO.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnO.setText("O");
        btnO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnÇ.setBackground(new java.awt.Color(255, 255, 255));
        btnÇ.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnÇ.setText("Ç");
        btnÇ.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnG.setBackground(new java.awt.Color(255, 255, 255));
        btnG.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnG.setText("G");
        btnG.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnH.setBackground(new java.awt.Color(255, 255, 255));
        btnH.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnH.setText("H");
        btnH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnJ.setBackground(new java.awt.Color(255, 255, 255));
        btnJ.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnJ.setText("J");
        btnJ.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnK.setBackground(new java.awt.Color(255, 255, 255));
        btnK.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnK.setText("K");
        btnK.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnL.setBackground(new java.awt.Color(255, 255, 255));
        btnL.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnL.setText("L");
        btnL.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnR.setBackground(new java.awt.Color(255, 255, 255));
        btnR.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnR.setText("R");
        btnR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnT.setBackground(new java.awt.Color(255, 255, 255));
        btnT.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnT.setText("T");
        btnT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnY.setBackground(new java.awt.Color(255, 255, 255));
        btnY.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnY.setText("Y");
        btnY.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnU.setBackground(new java.awt.Color(255, 255, 255));
        btnU.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnU.setText("U");
        btnU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnI.setBackground(new java.awt.Color(255, 255, 255));
        btnI.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnI.setText("I");
        btnI.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnF.setBackground(new java.awt.Color(255, 255, 255));
        btnF.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnF.setText("F");
        btnF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnN.setBackground(new java.awt.Color(255, 255, 255));
        btnN.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnN.setText("N");
        btnN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnZ.setBackground(new java.awt.Color(255, 255, 255));
        btnZ.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnZ.setText("Z");
        btnZ.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnX.setBackground(new java.awt.Color(255, 255, 255));
        btnX.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnX.setText("X");
        btnX.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnC.setBackground(new java.awt.Color(255, 255, 255));
        btnC.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnC.setText("C");
        btnC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnV.setBackground(new java.awt.Color(255, 255, 255));
        btnV.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnV.setText("V");
        btnV.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnB.setBackground(new java.awt.Color(255, 255, 255));
        btnB.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnB.setText("B");
        btnB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnP.setBackground(new java.awt.Color(255, 255, 255));
        btnP.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnP.setText("P");
        btnP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnE.setBackground(new java.awt.Color(255, 255, 255));
        btnE.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnE.setText("E");
        btnE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnA.setBackground(new java.awt.Color(255, 255, 255));
        btnA.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnA.setText("A");
        btnA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnS.setBackground(new java.awt.Color(255, 255, 255));
        btnS.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnS.setText("S");
        btnS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnD.setBackground(new java.awt.Color(255, 255, 255));
        btnD.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnD.setText("D");
        btnD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSpace.setBackground(new java.awt.Color(255, 255, 255));
        btnSpace.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnSpace.setText(" ");
        btnSpace.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnM.setBackground(new java.awt.Color(255, 255, 255));
        btnM.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnM.setText("M");
        btnM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnBack.setText("Backspace");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnQ)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnW)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnR)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnT))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn4)
                                        .addGap(9, 9, 9)
                                        .addComponent(btn5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnY)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnU)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnI)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnO)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnP))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnS)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnD)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnF)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnG)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnH)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnJ)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnK)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnL)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnÇ))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(btnZ)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnX)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnC)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnV)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnB)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnN)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnM))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(btnSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ, btnÇ});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnBack)
                    .addComponent(btn5)
                    .addComponent(btn6)
                    .addComponent(btn0)
                    .addComponent(btn7)
                    .addComponent(btn8)
                    .addComponent(btn9)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(btn4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQ)
                    .addComponent(btnW)
                    .addComponent(btnE)
                    .addComponent(btnR)
                    .addComponent(btnT)
                    .addComponent(btnY)
                    .addComponent(btnU)
                    .addComponent(btnI)
                    .addComponent(btnO)
                    .addComponent(btnP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnA)
                    .addComponent(btnS)
                    .addComponent(btnD)
                    .addComponent(btnF)
                    .addComponent(btnG)
                    .addComponent(btnH)
                    .addComponent(btnJ)
                    .addComponent(btnK)
                    .addComponent(btnL)
                    .addComponent(btnÇ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZ)
                    .addComponent(btnX)
                    .addComponent(btnC)
                    .addComponent(btnV)
                    .addComponent(btnB)
                    .addComponent(btnN)
                    .addComponent(btnM))
                .addGap(18, 18, 18)
                .addComponent(btnSpace)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ, btnÇ});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaKeyPressed
        if(evt.getKeyCode() == evt.VK_1) {
            cor1 = btn1.getBackground();
            cor2 = btn1.getForeground();
            btn1.setBackground(Color.BLACK);
            btn1.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_2) {
            cor1 = btn2.getBackground();
            cor2 = btn2.getForeground();
            btn2.setBackground(Color.BLACK);
            btn2.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_3) {
            cor1 = btn3.getBackground();
            cor2 = btn3.getForeground();
            btn3.setBackground(Color.BLACK);
            btn3.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_4) {
            cor1 = btn4.getBackground();
            cor2 = btn4.getForeground();
            btn4.setBackground(Color.BLACK);
            btn4.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_5) {
            cor1 = btn5.getBackground();
            cor2 = btn5.getForeground();
            btn5.setBackground(Color.BLACK);
            btn5.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_6) {
            cor1 = btn6.getBackground();
            cor2 = btn6.getForeground();
            btn6.setBackground(Color.BLACK);
            btn6.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_7) {
            cor1 = btn7.getBackground();
            cor2 = btn7.getForeground();
            btn7.setBackground(Color.BLACK);
            btn7.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_8) {
            cor1 = btn8.getBackground();
            cor2 = btn8.getForeground();
            btn8.setBackground(Color.BLACK);
            btn8.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_9) {
            cor1 = btn9.getBackground();
            cor2 = btn9.getForeground();
            btn9.setBackground(Color.BLACK);
            btn9.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_0) {
            cor1 = btn0.getBackground();
            cor2 = btn0.getForeground();
            btn0.setBackground(Color.BLACK);
            btn0.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_Q) {
            cor1 = btnQ.getBackground();
            cor2 = btnQ.getForeground();
            btnQ.setBackground(Color.BLACK);
            btnQ.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_W) {
            cor1 = btnW.getBackground();
            cor2 = btnW.getForeground();
            btnW.setBackground(Color.BLACK);
            btnW.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_E) {
            cor1 = btnE.getBackground();
            cor2 = btnE.getForeground();
            btnE.setBackground(Color.BLACK);
            btnE.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_R) {
            cor1 = btnR.getBackground();
            cor2 = btnR.getForeground();
            btnR.setBackground(Color.BLACK);
            btnR.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_T) {
            cor1 = btnT.getBackground();
            cor2 = btnT.getForeground();
            btnT.setBackground(Color.BLACK);
            btnT.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_Y) {
            cor1 = btnY.getBackground();
            cor2 = btnY.getForeground();
            btnY.setBackground(Color.BLACK);
            btnY.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_U) {
            cor1 = btnU.getBackground();
            cor2 = btnU.getForeground();
            btnU.setBackground(Color.BLACK);
            btnU.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_I) {
            cor1 = btnI.getBackground();
            cor2 = btnI.getForeground();
            btnI.setBackground(Color.BLACK);
            btnI.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_O) {
            cor1 = btnO.getBackground();
            cor2 = btnO.getForeground();
            btnO.setBackground(Color.BLACK);
            btnO.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_P) {
            cor1 = btnP.getBackground();
            cor2 = btnP.getForeground();
            btnP.setBackground(Color.BLACK);
            btnP.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_A) {
            cor1 = btnA.getBackground();
            cor2 = btnA.getForeground();
            btnA.setBackground(Color.BLACK);
            btnA.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_S) {
            cor1 = btnS.getBackground();
            cor2 = btnS.getForeground();
            btnS.setBackground(Color.BLACK);
            btnS.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_D) {
            cor1 = btnD.getBackground();
            cor2 = btnD.getForeground();
            btnD.setBackground(Color.BLACK);
            btnD.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_F) {
            cor1 = btnF.getBackground();
            cor2 = btnF.getForeground();
            btnF.setBackground(Color.BLACK);
            btnF.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_G) {
            cor1 = btnG.getBackground();
            cor2 = btnG.getForeground();
            btnG.setBackground(Color.BLACK);
            btnG.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_H) {
            cor1 = btnH.getBackground();
            cor2 = btnH.getForeground();
            btnH.setBackground(Color.BLACK);
            btnH.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_J) {
            cor1 = btnJ.getBackground();
            cor2 = btnJ.getForeground();
            btnJ.setBackground(Color.BLACK);
            btnJ.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_K) {
            cor1 = btnK.getBackground();
            cor2 = btnK.getForeground();
            btnK.setBackground(Color.BLACK);
            btnK.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_L) {
            cor1 = btnL.getBackground();
            cor2 = btnL.getForeground();
            btnL.setBackground(Color.BLACK);
            btnL.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyChar() == 'Ç' || evt.getKeyChar() == 'ç') {
            cor1 = btnÇ.getBackground();
            cor2 = btnÇ.getForeground();
            btnÇ.setBackground(Color.BLACK);
            btnÇ.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_Z) {
            cor1 = btnZ.getBackground();
            cor2 = btnZ.getForeground();
            btnZ.setBackground(Color.BLACK);
            btnZ.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_X) {
            cor1 = btnX.getBackground();
            cor2 = btnX.getForeground();
            btnX.setBackground(Color.BLACK);
            btnX.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_C) {
            cor1 = btnC.getBackground();
            cor2 = btnC.getForeground();
            btnC.setBackground(Color.BLACK);
            btnC.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_V) {
            cor1 = btnV.getBackground();
            cor2 = btnV.getForeground();
            btnV.setBackground(Color.BLACK);
            btnV.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_B) {
            cor1 = btnB.getBackground();
            cor2 = btnB.getForeground();
            btnB.setBackground(Color.BLACK);
            btnB.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_N) {
            cor1 = btnN.getBackground();
            cor2 = btnN.getForeground();
            btnN.setBackground(Color.BLACK);
            btnN.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_M) {
            cor1 = btnM.getBackground();
            cor2 = btnM.getForeground();
            btnM.setBackground(Color.BLACK);
            btnM.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_SPACE) {
            cor1 = btnSpace.getBackground();
            cor2 = btnSpace.getForeground();
            btnSpace.setBackground(Color.BLACK);
            btnSpace.setForeground(Color.WHITE);
          
        }
        if(evt.getKeyCode() == evt.VK_BACK_SPACE) {
            cor1 = btnBack.getBackground();
            cor2 = btnBack.getForeground();
            btnBack.setBackground(Color.BLACK);
            btnBack.setForeground(Color.WHITE);
          
        }
    }//GEN-LAST:event_txtAreaKeyPressed

    private void txtAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaKeyReleased
        if(evt.getKeyCode() == evt.VK_1) {
            cor1 = btn1.getBackground();
            cor2 = btn1.getForeground();
            btn1.setBackground(Color.WHITE);
            btn1.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_2) {
            cor1 = btn2.getBackground();
            cor2 = btn2.getForeground();
            btn2.setBackground(Color.WHITE);
            btn2.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_3) {
            cor1 = btn3.getBackground();
            cor2 = btn3.getForeground();
            btn3.setBackground(Color.WHITE);
            btn3.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_4) {
            cor1 = btn4.getBackground();
            cor2 = btn4.getForeground();
            btn4.setBackground(Color.WHITE);
            btn4.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_5) {
            cor1 = btn5.getBackground();
            cor2 = btn5.getForeground();
            btn5.setBackground(Color.WHITE);
            btn5.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_6) {
            cor1 = btn6.getBackground();
            cor2 = btn6.getForeground();
            btn6.setBackground(Color.WHITE);
            btn6.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_7) {
            cor1 = btn7.getBackground();
            cor2 = btn7.getForeground();
            btn7.setBackground(Color.WHITE);
            btn7.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_8) {
            cor1 = btn8.getBackground();
            cor2 = btn8.getForeground();
            btn8.setBackground(Color.WHITE);
            btn8.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_9) {
            cor1 = btn9.getBackground();
            cor2 = btn9.getForeground();
            btn9.setBackground(Color.WHITE);
            btn9.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_0) {
            cor1 = btn0.getBackground();
            cor2 = btn0.getForeground();
            btn0.setBackground(Color.WHITE);
            btn0.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_Q) {
            cor1 = btnQ.getBackground();
            cor2 = btnQ.getForeground();
            btnQ.setBackground(Color.WHITE);
            btnQ.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_W) {
            cor1 = btnW.getBackground();
            cor2 = btnW.getForeground();
            btnW.setBackground(Color.WHITE);
            btnW.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_E) {
            cor1 = btnE.getBackground();
            cor2 = btnE.getForeground();
            btnE.setBackground(Color.WHITE);
            btnE.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_R) {
            cor1 = btnR.getBackground();
            cor2 = btnR.getForeground();
            btnR.setBackground(Color.WHITE);
            btnR.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_T) {
            cor1 = btnT.getBackground();
            cor2 = btnT.getForeground();
            btnT.setBackground(Color.WHITE);
            btnT.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_Y) {
            cor1 = btnY.getBackground();
            cor2 = btnY.getForeground();
            btnY.setBackground(Color.WHITE);
            btnY.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_U) {
            cor1 = btnU.getBackground();
            cor2 = btnU.getForeground();
            btnU.setBackground(Color.WHITE);
            btnU.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_I) {
            cor1 = btnI.getBackground();
            cor2 = btnI.getForeground();
            btnI.setBackground(Color.WHITE);
            btnI.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_O) {
            cor1 = btnO.getBackground();
            cor2 = btnO.getForeground();
            btnO.setBackground(Color.WHITE);
            btnO.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_P) {
            cor1 = btnP.getBackground();
            cor2 = btnP.getForeground();
            btnP.setBackground(Color.WHITE);
            btnP.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_A) {
            cor1 = btnA.getBackground();
            cor2 = btnA.getForeground();
            btnA.setBackground(Color.WHITE);
            btnA.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_S) {
            cor1 = btnS.getBackground();
            cor2 = btnS.getForeground();
            btnS.setBackground(Color.WHITE);
            btnS.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_D) {
            cor1 = btnD.getBackground();
            cor2 = btnD.getForeground();
            btnD.setBackground(Color.WHITE);
            btnD.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_F) {
            cor1 = btnF.getBackground();
            cor2 = btnF.getForeground();
            btnF.setBackground(Color.WHITE);
            btnF.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_G) {
            cor1 = btnG.getBackground();
            cor2 = btnG.getForeground();
            btnG.setBackground(Color.WHITE);
            btnG.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_H) {
            cor1 = btnH.getBackground();
            cor2 = btnH.getForeground();
            btnH.setBackground(Color.WHITE);
            btnH.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_J) {
            cor1 = btnJ.getBackground();
            cor2 = btnJ.getForeground();
            btnJ.setBackground(Color.WHITE);
            btnJ.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_K) {
            cor1 = btnK.getBackground();
            cor2 = btnK.getForeground();
            btnK.setBackground(Color.WHITE);
            btnK.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_L) {
            cor1 = btnL.getBackground();
            cor2 = btnL.getForeground();
            btnL.setBackground(Color.WHITE);
            btnL.setForeground(Color.BLACK);
        }
        if(evt.getKeyChar() == 'Ç' || evt.getKeyChar() == 'ç') {
            cor1 = btnÇ.getBackground();
            cor2 = btnÇ.getForeground();
            btnÇ.setBackground(Color.WHITE);
            btnÇ.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_Z) {
            cor1 = btnZ.getBackground();
            cor2 = btnZ.getForeground();
            btnZ.setBackground(Color.WHITE);
            btnZ.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_X) {
            cor1 = btnX.getBackground();
            cor2 = btnX.getForeground();
            btnX.setBackground(Color.WHITE);
            btnX.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_C) {
            cor1 = btnC.getBackground();
            cor2 = btnC.getForeground();
            btnC.setBackground(Color.WHITE);
            btnC.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_V) {
            cor1 = btnV.getBackground();
            cor2 = btnV.getForeground();
            btnV.setBackground(Color.WHITE);
            btnV.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_B) {
            cor1 = btnB.getBackground();
            cor2 = btnB.getForeground();
            btnB.setBackground(Color.WHITE);
            btnB.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_N) {
            cor1 = btnN.getBackground();
            cor2 = btnN.getForeground();
            btnN.setBackground(Color.WHITE);
            btnN.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_M) {
            cor1 = btnM.getBackground();
            cor2 = btnM.getForeground();
            btnM.setBackground(Color.WHITE);
            btnM.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_SPACE) {
            cor1 = btnSpace.getBackground();
            cor2 = btnSpace.getForeground();
            btnSpace.setBackground(Color.WHITE);
            btnSpace.setForeground(Color.BLACK);
        }
        if(evt.getKeyCode() == evt.VK_BACK_SPACE) {
            cor1 = btnBack.getBackground();
            cor2 = btnBack.getForeground();
            btnBack.setBackground(Color.WHITE);
            btnBack.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_txtAreaKeyReleased

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Janela().setVisible(true);
//            }
//        });
//    }

        
    private Color cor1;
    private Color cor2;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnSpace;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JButton btnÇ;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txt1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
