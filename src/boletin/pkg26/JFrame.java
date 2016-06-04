package boletin.pkg26;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class JFrame extends javax.swing.JFrame {


    public JFrame() {
        initComponents();
    
    }
     static int CONTADOR=0;
     ArrayList<Integer> Seleccionados = new ArrayList<Integer>();
     ArrayList<Integer> Aleatorios = new ArrayList<Integer>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton10 = new javax.swing.JButton();
        boton11 = new javax.swing.JButton();
        boton12 = new javax.swing.JButton();
        boton13 = new javax.swing.JButton();
        boton14 = new javax.swing.JButton();
        boton15 = new javax.swing.JButton();
        boton16 = new javax.swing.JButton();
        boton21 = new javax.swing.JButton();
        boton27 = new javax.swing.JButton();
        boton22 = new javax.swing.JButton();
        boton17 = new javax.swing.JButton();
        boton18 = new javax.swing.JButton();
        boton23 = new javax.swing.JButton();
        boton28 = new javax.swing.JButton();
        boton29 = new javax.swing.JButton();
        boton24 = new javax.swing.JButton();
        boton19 = new javax.swing.JButton();
        boton20 = new javax.swing.JButton();
        boton25 = new javax.swing.JButton();
        boton30 = new javax.swing.JButton();
        boton38 = new javax.swing.JButton();
        boton45 = new javax.swing.JButton();
        boton40 = new javax.swing.JButton();
        boton43 = new javax.swing.JButton();
        boton39 = new javax.swing.JButton();
        boton31 = new javax.swing.JButton();
        boton32 = new javax.swing.JButton();
        boton33 = new javax.swing.JButton();
        boton37 = new javax.swing.JButton();
        boton34 = new javax.swing.JButton();
        boton35 = new javax.swing.JButton();
        boton44 = new javax.swing.JButton();
        boton42 = new javax.swing.JButton();
        boton36 = new javax.swing.JButton();
        boton41 = new javax.swing.JButton();
        boton26 = new javax.swing.JButton();
        boton46 = new javax.swing.JButton();
        boton48 = new javax.swing.JButton();
        boton47 = new javax.swing.JButton();
        boton49 = new javax.swing.JButton();
        field = new javax.swing.JTextField();
        desmarcar = new javax.swing.JToggleButton();
        Field2 = new javax.swing.JTextField();
        generar = new javax.swing.JButton();
        validar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });

        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });

        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });

        boton10.setText("10");
        boton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton10ActionPerformed(evt);
            }
        });

        boton11.setText("11");
        boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton11ActionPerformed(evt);
            }
        });

        boton12.setText("12");
        boton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton12ActionPerformed(evt);
            }
        });

        boton13.setText("13");
        boton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton13ActionPerformed(evt);
            }
        });

        boton14.setText("14");
        boton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton14ActionPerformed(evt);
            }
        });

        boton15.setText("15");
        boton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton15ActionPerformed(evt);
            }
        });

        boton16.setText("16");
        boton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton16ActionPerformed(evt);
            }
        });

        boton21.setText("21");
        boton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton21ActionPerformed(evt);
            }
        });

        boton27.setText("27");
        boton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton27ActionPerformed(evt);
            }
        });

        boton22.setText("22");
        boton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton22ActionPerformed(evt);
            }
        });

        boton17.setText("17");
        boton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton17ActionPerformed(evt);
            }
        });

        boton18.setText("18");
        boton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton18ActionPerformed(evt);
            }
        });

        boton23.setText("23");
        boton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton23ActionPerformed(evt);
            }
        });

        boton28.setText("28");
        boton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton28ActionPerformed(evt);
            }
        });

        boton29.setText("29");
        boton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton29ActionPerformed(evt);
            }
        });

        boton24.setText("24");
        boton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton24ActionPerformed(evt);
            }
        });

        boton19.setText("19");
        boton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton19ActionPerformed(evt);
            }
        });

        boton20.setText("20");
        boton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton20ActionPerformed(evt);
            }
        });

        boton25.setText("25");
        boton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton25ActionPerformed(evt);
            }
        });

        boton30.setText("30");
        boton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton30ActionPerformed(evt);
            }
        });

        boton38.setText("38");
        boton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton38ActionPerformed(evt);
            }
        });

        boton45.setText("45");
        boton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton45ActionPerformed(evt);
            }
        });

        boton40.setText("40");
        boton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton40ActionPerformed(evt);
            }
        });

        boton43.setText("43");
        boton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton43ActionPerformed(evt);
            }
        });

        boton39.setText("39");
        boton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton39ActionPerformed(evt);
            }
        });

        boton31.setText("31");
        boton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton31ActionPerformed(evt);
            }
        });

        boton32.setText("32");
        boton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton32ActionPerformed(evt);
            }
        });

        boton33.setText("33");
        boton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton33ActionPerformed(evt);
            }
        });

        boton37.setText("37");
        boton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton37ActionPerformed(evt);
            }
        });

        boton34.setText("34");
        boton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton34ActionPerformed(evt);
            }
        });

        boton35.setText("35");
        boton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton35ActionPerformed(evt);
            }
        });

        boton44.setText("44");
        boton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton44ActionPerformed(evt);
            }
        });

        boton42.setText("42");
        boton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton42ActionPerformed(evt);
            }
        });

        boton36.setText("36");
        boton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton36ActionPerformed(evt);
            }
        });

        boton41.setText("41");
        boton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton41ActionPerformed(evt);
            }
        });

        boton26.setText("26");
        boton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton26ActionPerformed(evt);
            }
        });

        boton46.setText("46");
        boton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton46ActionPerformed(evt);
            }
        });

        boton48.setText("48");
        boton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton48ActionPerformed(evt);
            }
        });

        boton47.setText("47");
        boton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton47ActionPerformed(evt);
            }
        });

        boton49.setText("49");
        boton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton49ActionPerformed(evt);
            }
        });

        desmarcar.setText("Desmarcar");
        desmarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desmarcarActionPerformed(evt);
            }
        });

        generar.setText("Generar");
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });

        validar.setText("Validar");
        validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(field, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))
                            .addComponent(boton16, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton26, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton31, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton36, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton41, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton46, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boton27)
                            .addComponent(boton32)
                            .addComponent(boton37)
                            .addComponent(boton42)
                            .addComponent(boton47)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(boton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(boton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(boton38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(boton28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(boton33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(boton48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                                .addComponent(boton43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(170, 170, 170)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(boton40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(boton30, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                                        .addComponent(boton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(boton23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(170, 170, 170)
                                        .addComponent(boton25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(45, 45, 45))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(boton13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(boton18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Field2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boton19)
                                            .addComponent(boton24)
                                            .addComponent(boton29)
                                            .addComponent(boton34)
                                            .addComponent(boton39)
                                            .addComponent(boton44)
                                            .addComponent(boton49)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(boton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(boton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(56, 56, 56)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(boton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(boton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                            .addComponent(boton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(boton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(desmarcar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(validar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(generar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                    .addComponent(boton21, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(boton3)
                                        .addComponent(boton4)
                                        .addComponent(boton5)
                                        .addComponent(generar))
                                    .addComponent(boton2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(boton8)
                                    .addComponent(boton7)
                                    .addComponent(boton9)
                                    .addComponent(boton10)
                                    .addComponent(validar)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(boton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton11)
                            .addComponent(boton12)
                            .addComponent(boton13)
                            .addComponent(boton14)
                            .addComponent(boton15)
                            .addComponent(desmarcar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boton16)
                                .addComponent(boton17))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boton18)
                                .addComponent(boton19)
                                .addComponent(boton20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton24)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boton21)
                                .addComponent(boton22))
                            .addComponent(boton23, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton25)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton29)
                            .addComponent(boton30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton34)
                            .addComponent(boton35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton39)
                            .addComponent(boton40)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton26)
                            .addComponent(boton27)
                            .addComponent(boton28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton31)
                            .addComponent(boton32)
                            .addComponent(boton33))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton36)
                            .addComponent(boton37)
                            .addComponent(boton38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton41)
                            .addComponent(boton42)
                            .addComponent(boton43)
                            .addComponent(boton44)
                            .addComponent(boton45))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton46)
                            .addComponent(boton47)
                            .addComponent(boton48)
                            .addComponent(boton49))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton18ActionPerformed
         boton(boton18);
         Seleccionados.add(18); CONTADOR++;
          
         
    }//GEN-LAST:event_boton18ActionPerformed

    private void boton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton15ActionPerformed
         boton(boton15);
         Seleccionados.add(15); CONTADOR++;
         
    }//GEN-LAST:event_boton15ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed

        boton(boton4);
        Seleccionados.add(4); CONTADOR++;
         
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
      boton(boton1);
      Seleccionados.add(1);CONTADOR++;
       
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
       boton(boton2);
       Seleccionados.add(2);CONTADOR++;
       
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
     boton(boton3);
     Seleccionados.add(3);CONTADOR++;
      
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
     boton(boton5);
     Seleccionados.add(5);CONTADOR++;
      
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
     boton(boton6);     
     Seleccionados.add(6);CONTADOR++;
      
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
       boton(boton7);
       Seleccionados.add(7);CONTADOR++;
       
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        boton(boton8);
        Seleccionados.add(8);CONTADOR++;
         
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
         boton(boton9);
         Seleccionados.add(9);CONTADOR++;
          
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton10ActionPerformed
         boton(boton10);
         Seleccionados.add(10);CONTADOR++;
          
    }//GEN-LAST:event_boton10ActionPerformed

    private void boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton11ActionPerformed
         boton(boton11);
         Seleccionados.add(11);CONTADOR++;
          
    }//GEN-LAST:event_boton11ActionPerformed

    private void boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton12ActionPerformed
         boton(boton12);
         Seleccionados.add(12);CONTADOR++;
         
    }//GEN-LAST:event_boton12ActionPerformed

    private void boton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton13ActionPerformed
         boton(boton13);
         Seleccionados.add(13);CONTADOR++;
          
    }//GEN-LAST:event_boton13ActionPerformed

    private void boton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton14ActionPerformed
         boton(boton14);
         Seleccionados.add(14);CONTADOR++;
         
    }//GEN-LAST:event_boton14ActionPerformed

    private void boton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton16ActionPerformed
         boton(boton16);
         Seleccionados.add(16);CONTADOR++;
         
    }//GEN-LAST:event_boton16ActionPerformed

    private void boton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton17ActionPerformed
         boton(boton17);
         Seleccionados.add(17);CONTADOR++;
          
    }//GEN-LAST:event_boton17ActionPerformed

    private void boton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton19ActionPerformed
        boton(boton19);
        Seleccionados.add(19);CONTADOR++;
        
    }//GEN-LAST:event_boton19ActionPerformed

    private void boton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton20ActionPerformed
        boton(boton20);
         Seleccionados.add(20);CONTADOR++;
          
    }//GEN-LAST:event_boton20ActionPerformed

    private void boton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton21ActionPerformed
       boton(boton21);
        Seleccionados.add(21);CONTADOR++;
         
    }//GEN-LAST:event_boton21ActionPerformed

    private void boton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton22ActionPerformed
        boton(boton22);
         Seleccionados.add(22);CONTADOR++;
        
    }//GEN-LAST:event_boton22ActionPerformed

    private void boton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton23ActionPerformed
        boton(boton23);
         Seleccionados.add(23);CONTADOR++;
          
    }//GEN-LAST:event_boton23ActionPerformed

    private void boton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton24ActionPerformed
         boton(boton24);
          Seleccionados.add(24);CONTADOR++;
          
    }//GEN-LAST:event_boton24ActionPerformed

    private void boton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton25ActionPerformed
        boton(boton25);
         Seleccionados.add(25);CONTADOR++;
          
    }//GEN-LAST:event_boton25ActionPerformed

    private void boton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton26ActionPerformed
        boton(boton26);
         Seleccionados.add(26);CONTADOR++;
          
    }//GEN-LAST:event_boton26ActionPerformed

    private void boton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton27ActionPerformed
        boton(boton27);
        Seleccionados.add(27);CONTADOR++;
         
    }//GEN-LAST:event_boton27ActionPerformed

    private void boton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton28ActionPerformed
         boton(boton28);
         Seleccionados.add(28);CONTADOR++;
          
    }//GEN-LAST:event_boton28ActionPerformed

    private void boton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton29ActionPerformed
         boton(boton29);
         Seleccionados.add(29);CONTADOR++;
         
    }//GEN-LAST:event_boton29ActionPerformed

    private void boton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton30ActionPerformed
         boton(boton30);
         Seleccionados.add(30);CONTADOR++;
         
    }//GEN-LAST:event_boton30ActionPerformed

    private void boton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton31ActionPerformed
        boton(boton31);
        Seleccionados.add(31);CONTADOR++;
        
    }//GEN-LAST:event_boton31ActionPerformed

    private void boton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton32ActionPerformed
       boton(boton32);
       Seleccionados.add(32);CONTADOR++;
       
    }//GEN-LAST:event_boton32ActionPerformed

    private void boton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton33ActionPerformed
         boton(boton33);
         Seleccionados.add(33);CONTADOR++;
         
    }//GEN-LAST:event_boton33ActionPerformed

    private void boton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton34ActionPerformed
        boton(boton34);
        Seleccionados.add(34);CONTADOR++;
        
    }//GEN-LAST:event_boton34ActionPerformed

    private void boton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton35ActionPerformed
         boton(boton35);
        Seleccionados.add(35);CONTADOR++;
        
    }//GEN-LAST:event_boton35ActionPerformed

    private void boton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton36ActionPerformed
        boton(boton36);
        Seleccionados.add(36);CONTADOR++;
        
    }//GEN-LAST:event_boton36ActionPerformed

    private void boton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton37ActionPerformed
        boton(boton37);
        Seleccionados.add(37);CONTADOR++;
        
    }//GEN-LAST:event_boton37ActionPerformed

    private void boton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton38ActionPerformed
         boton(boton38);
        Seleccionados.add(38);CONTADOR++;
        
    }//GEN-LAST:event_boton38ActionPerformed

    private void boton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton39ActionPerformed
        boton(boton39);
         Seleccionados.add(39);CONTADOR++;
         
    }//GEN-LAST:event_boton39ActionPerformed

    private void boton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton40ActionPerformed
         boton(boton40);
          Seleccionados.add(40);CONTADOR++;
          
    }//GEN-LAST:event_boton40ActionPerformed

    private void boton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton41ActionPerformed
        boton(boton41);
         Seleccionados.add(41);CONTADOR++;
         
    }//GEN-LAST:event_boton41ActionPerformed

    private void boton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton42ActionPerformed
        boton(boton42);
        Seleccionados.add(42);CONTADOR++;
        
    }//GEN-LAST:event_boton42ActionPerformed

    private void boton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton43ActionPerformed
        boton(boton43);
         Seleccionados.add(43);CONTADOR++;
         
    }//GEN-LAST:event_boton43ActionPerformed

    private void boton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton44ActionPerformed
        boton(boton44);
        Seleccionados.add(44);CONTADOR++;
       
    }//GEN-LAST:event_boton44ActionPerformed

    private void boton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton45ActionPerformed
         boton(boton45);
          Seleccionados.add(45);CONTADOR++;
          
    }//GEN-LAST:event_boton45ActionPerformed

    private void boton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton46ActionPerformed
        boton(boton46);
        Seleccionados.add(46);CONTADOR++;
        
    }//GEN-LAST:event_boton46ActionPerformed

    private void boton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton47ActionPerformed
        boton(boton47);
         Seleccionados.add(47);CONTADOR++;
         
    }//GEN-LAST:event_boton47ActionPerformed

    private void boton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton48ActionPerformed
       boton(boton48);
       Seleccionados.add(48);CONTADOR++;
       
       
    }//GEN-LAST:event_boton48ActionPerformed

    private void boton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton49ActionPerformed
        boton(boton49);
         Seleccionados.add(49);CONTADOR++;
         
         
    }//GEN-LAST:event_boton49ActionPerformed

    private void desmarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desmarcarActionPerformed
       desmarcar(boton1);desmarcar(boton2);desmarcar(boton3);
       desmarcar(boton4);desmarcar(boton5);desmarcar(boton6);
       desmarcar(boton7);desmarcar(boton8);desmarcar(boton9);
       desmarcar(boton10);desmarcar(boton11);desmarcar(boton12);
       desmarcar(boton13);desmarcar(boton14);desmarcar(boton15);
       desmarcar(boton16);desmarcar(boton17);desmarcar(boton18);
       desmarcar(boton19);desmarcar(boton20);desmarcar(boton21);
       desmarcar(boton22);desmarcar(boton23);desmarcar(boton24);
       desmarcar(boton25);desmarcar(boton26);desmarcar(boton27);
       desmarcar(boton28);desmarcar(boton29);desmarcar(boton30);
       desmarcar(boton31);desmarcar(boton32);desmarcar(boton33);
       desmarcar(boton34);desmarcar(boton35);desmarcar(boton36);
       desmarcar(boton37);desmarcar(boton38);desmarcar(boton39);
       desmarcar(boton40);desmarcar(boton41);desmarcar(boton42);
       desmarcar(boton43);desmarcar(boton44);desmarcar(boton45);
       desmarcar(boton46);desmarcar(boton47);desmarcar(boton48);
       desmarcar(boton49);
    }//GEN-LAST:event_desmarcarActionPerformed

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
       generarAlea(generar);
       for(int i=0;i<Aleatorios.size();i++){
       Field2.setText(Field2.getText()+"  "+Aleatorios.get(i));
       
       }
    }//GEN-LAST:event_generarActionPerformed

    private void validarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validarActionPerformed
       comparar(validar);
    }//GEN-LAST:event_validarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Field2;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton10;
    private javax.swing.JButton boton11;
    private javax.swing.JButton boton12;
    private javax.swing.JButton boton13;
    private javax.swing.JButton boton14;
    private javax.swing.JButton boton15;
    private javax.swing.JButton boton16;
    private javax.swing.JButton boton17;
    private javax.swing.JButton boton18;
    private javax.swing.JButton boton19;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton20;
    private javax.swing.JButton boton21;
    private javax.swing.JButton boton22;
    private javax.swing.JButton boton23;
    private javax.swing.JButton boton24;
    private javax.swing.JButton boton25;
    private javax.swing.JButton boton26;
    private javax.swing.JButton boton27;
    private javax.swing.JButton boton28;
    private javax.swing.JButton boton29;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton30;
    private javax.swing.JButton boton31;
    private javax.swing.JButton boton32;
    private javax.swing.JButton boton33;
    private javax.swing.JButton boton34;
    private javax.swing.JButton boton35;
    private javax.swing.JButton boton36;
    private javax.swing.JButton boton37;
    private javax.swing.JButton boton38;
    private javax.swing.JButton boton39;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton40;
    private javax.swing.JButton boton41;
    private javax.swing.JButton boton42;
    private javax.swing.JButton boton43;
    private javax.swing.JButton boton44;
    private javax.swing.JButton boton45;
    private javax.swing.JButton boton46;
    private javax.swing.JButton boton47;
    private javax.swing.JButton boton48;
    private javax.swing.JButton boton49;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JToggleButton desmarcar;
    private javax.swing.JTextField field;
    private javax.swing.JButton generar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton validar;
    // End of variables declaration//GEN-END:variables
public void boton(JButton boton){
    if(CONTADOR<6){
        boton.setEnabled(false);
    field.setText(field.getText()+"  "+boton.getText());}
    
}
public void desmarcar(JButton desmarcar){
     desmarcar.setEnabled(true);
     field.setText("");
     Field2.setText("");
     Seleccionados.removeAll(Seleccionados);
     Aleatorios.removeAll(Aleatorios);
     CONTADOR=0;
     
}
    public void generarAlea(JButton generar){
        int valores;
       
        for(int i = 0;i<6;i++){
            valores = (int) Math.floor(Math.random() * 49 )+1;
            while(Aleatorios.contains(valores)){
                valores = (int) Math.floor(Math.random() * 49 )+1;
            }
            Aleatorios.add(valores);
        }
    }

    public void comparar(JButton validar){
        if(Seleccionados.equals(Aleatorios)){
            JOptionPane.showMessageDialog(null,"Has ganado");
        }
        else
            JOptionPane.showMessageDialog(null,"Has perdido");
    
    }
}

