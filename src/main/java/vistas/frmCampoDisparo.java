/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.SimulacionDisparo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import model.Ambiente;
import model.Author;
import model.Canon;
import model.CondicionesIniciales;
import model.Disparo;
import model.Proyectil;
import model.ResultadoDisparo;
import service.Calculos;

import util.dataUtil;

public class frmCampoDisparo extends javax.swing.JFrame {

    dataUtil obj = new dataUtil();
    Calculos c = new Calculos();
    SimulacionDisparo simulacionDisparo = new SimulacionDisparo();
    int x = 20;
    int y = 100;
    double giro = 0;
    int ancho = 100;
    int alto = 100;

    private List<Point> points = new ArrayList<Point>();

    private double velocidadInicial;
    private double anguloDisparo;
    private double tiempoTotal;
    private double distanciaMaxima;
    private double alturaMaxima;

    public frmCampoDisparo() {
        this.setContentPane(new Dibujos());

        initComponents();
        spnGrados.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                giro = (int) spnGrados.getValue();
                txtAngulo.setText(giro + "");
                repaint();
            }
        });
        inicio();

    }

    void inicio() {
        llenacbCanon();
        llenacbProy();
        x = (int) campoDisparo.getX();
        y = (int) campoDisparo.getY() + campoDisparo.getHeight() - 10;
        System.out.println("X: " + x + "\t" + "Y: " + y);
//        spnGrados.setValue(giro);
//        txtAngulo.setText(giro+"");
        txtGravedad.setText(dataUtil.GRAVEDAD + "");
        txtDensidadAire.setText("1.01");
        txtResistenciaAire.setText("0.99");
    }

  
    private void vacio() {
        txtAngulo.setText("0.0");
        txtDiametro.setText("0.0");
        txtPotencia.setText("0.0");
        txtMasa.setText("0.0");
        txtAlcance.setText("0.0");
        txtAltura.setText("0.0");
        txtTiempo.setText("0.0");
        spnGrados.setValue(0);
        cbxTipoCanon.setSelectedItem("Elegir");   
        cbxTipoProyectil.setSelectedItem("Elegir");
    }

    /**
     * Método para limpiar el panel de dibujo y los campos de texto.
     */
    private void limpiarCampos() {
        campoDisparo.repaint();
    }

    void mostrarImagen() {
        Graphics2D g2 = (Graphics2D) campoDisparo.getGraphics();
        g2.setColor(Color.BLUE);
        for (Point p : points) {
            g2.drawOval(p.getX(), p.getY(), 1, 1);
        }
    }

    void llenarFormularioConResuelto(ResultadoDisparo resultadoDisparo) {
        // Setear los valores del objeto resultadoDisaparo en los label del formulario. 
        String alcance = Double.toString(resultadoDisparo.getAlcanceMaximo());
        String altura = Double.toString(resultadoDisparo.getAlturaMaximo());
        String tiempo = Double.toString(resultadoDisparo.getTiempoDeVuelo());

        txtTiempo.setText(tiempo+" s");
        txtAltura.setText(altura+" m");
        txtAlcance.setText(alcance+" m");
        System.out.println("resultadoDisparo: " + resultadoDisparo.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoDisparo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtAngulo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtGravedad = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        txtMasa = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtDiametro = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        txtPotencia = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        btnSimular = new javax.swing.JButton();
        cbxTipoProyectil = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbxTipoCanon = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spnGrados = new javax.swing.JSpinner();
        txtDensidadAire = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtResistenciaAire = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAlcance = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JLabel();

        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(225, 206, 122));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(225, 206, 122));

        javax.swing.GroupLayout campoDisparoLayout = new javax.swing.GroupLayout(campoDisparo);
        campoDisparo.setLayout(campoDisparoLayout);
        campoDisparoLayout.setHorizontalGroup(
            campoDisparoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 752, Short.MAX_VALUE)
        );
        campoDisparoLayout.setVerticalGroup(
            campoDisparoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(66, 75, 84));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valores iniciales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Angulo:");

        txtAngulo.setBackground(new java.awt.Color(255, 255, 255));
        txtAngulo.setForeground(new java.awt.Color(255, 255, 255));
        txtAngulo.setText("0.0");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gravedad:");

        txtGravedad.setForeground(new java.awt.Color(255, 255, 255));
        txtGravedad.setText("0.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtGravedad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(txtAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAngulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGravedad)
                            .addComponent(jLabel12)))))
        );

        jPanel6.setBackground(new java.awt.Color(66, 75, 84));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de la bala", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Masa:");

        txtMasa.setForeground(new java.awt.Color(255, 255, 255));
        txtMasa.setText("0.0");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Diametro:");

        txtDiametro.setForeground(new java.awt.Color(255, 255, 255));
        txtDiametro.setText("0.0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtDiametro, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txtMasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtMasa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtDiametro)))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel10.setBackground(new java.awt.Color(66, 75, 84));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información del cañon", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Potencia:");

        txtPotencia.setForeground(new java.awt.Color(255, 255, 255));
        txtPotencia.setText("0.0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32)
                        .addComponent(txtPotencia))
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnSimular.setText("Simular");
        btnSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularActionPerformed(evt);
            }
        });

        cbxTipoProyectil.setBackground(new java.awt.Color(197, 186, 175));
        cbxTipoProyectil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir" }));
        cbxTipoProyectil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoProyectilActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Tipo de proyectil");

        cbxTipoCanon.setBackground(new java.awt.Color(197, 186, 175));
        cbxTipoCanon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir" }));
        cbxTipoCanon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoCanonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Tipo de cañón");

        jLabel3.setText("Grados");

        spnGrados.setModel(new javax.swing.SpinnerNumberModel(0, 0, 90, 1));

        txtDensidadAire.setText("0.99");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Densidad del aire");

        txtResistenciaAire.setText("1.01");
        txtResistenciaAire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResistenciaAireActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Resistencia del aire");

        jLabel7.setText("Alcance máximo:");

        txtAlcance.setText("0.0");

        jLabel8.setText("Altura máxima:");

        txtAltura.setText("0.0");

        jLabel9.setText("Tiempo de vuelo:");

        txtTiempo.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(campoDisparo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(cbxTipoCanon, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnGrados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbxTipoProyectil, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAlcance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSimular, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnReiniciar)))))
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDensidadAire, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResistenciaAire, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAltura)
                    .addComponent(jLabel9)
                    .addComponent(txtTiempo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addComponent(campoDisparo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(spnGrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxTipoCanon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxTipoProyectil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSimular)
                            .addComponent(btnReiniciar))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtResistenciaAire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtAlcance))
                                .addGap(24, 24, 24)))
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDensidadAire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularActionPerformed
        List<Point> points = new ArrayList<>();
        SimulacionDisparo simulacionDisparo = new SimulacionDisparo();
        ResultadoDisparo resultadoDisparo = null;
        Ambiente ambiente=null;
        CondicionesIniciales condicionesIniciales=null;
        Author author = new Author();
        Disparo disparo=null;

        Canon canon = null;

        Proyectil proyectil = null;

        /**
         * Building el objeto Disparo
         */
        //Define ambiente
        double densidad = Double.parseDouble(txtDensidadAire.getText());
        double resistencia = Double.parseDouble(txtResistenciaAire.getText());

        ambiente = new Ambiente(densidad, resistencia);
//        ambiente.setDensidadAire(0.99);
//        ambiente.setResistenciaAire(1.01);

        //Define proyectil
        for (Proyectil p : obj.getProyectil()) {
            if (p.getTipo().equalsIgnoreCase(cbxTipoProyectil.getSelectedItem().toString())) {
                p.calcularMasa();
                proyectil=p;
            }
        }
        String tipo= cbxTipoProyectil.getSelectedItem().toString();
        
        

        //Define Cañon
        for (Canon c : obj.getCanones()) {
            if (c.getTipo().equalsIgnoreCase(cbxTipoCanon.getSelectedItem().toString())) {
                canon = c;
            }
        }

        //Define Condiciones iniciales
        condicionesIniciales =new CondicionesIniciales(canon, ambiente, proyectil, giro);
//        condicionesIniciales.setAmbiente(ambiente);
//        condicionesIniciales.setAngulo(giro);
//        condicionesIniciales.setCanon(canon);
//        condicionesIniciales.setProyectil(proyectil);

        System.out.println("condicionesIniciales: " + condicionesIniciales);

        //Define author : actualmente recupera un dato estatico en DataUtil
        author.setUser(dataUtil.nombreAutor); // esto debe ser reemplazado con el author del login

        disparo = new Disparo(author, condicionesIniciales);
        //Define Disparo
//        disparo.setCi(condicionesIniciales);
//        disparo.setAuthor(author);

        //Ejecutar disparo
        resultadoDisparo = simulacionDisparo.ejecutarDisparo(disparo);

        llenarFormularioConResuelto(resultadoDisparo);

        
        // Dibujar Trayectoria
        DibujarTrayectoria obj = new DibujarTrayectoria();
        points = obj.obtenerPuntos(giro, velocidadInicial);

//        points.forEach(p -> System.out.println(p.toString()));

        DibujarTrayectoria.dibujarTrayectoria(campoDisparo.getGraphics(), points);

        condIniciales iniciales = new condIniciales();

    }//GEN-LAST:event_btnSimularActionPerformed

    private void cbxTipoCanonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoCanonActionPerformed
//        obj.getCanones();
//        String tipoCanon = cbxTipoCanon.getSelectedItem().toString();
//        for(Canon c : obj.getCanones()){
//            if(c.getTipo().contains(tipoCanon)){
//                txtPotencia.setText(c.getPotencia()+"");
//            }
//        }

        String selecCanon = (String) cbxTipoCanon.getSelectedItem();
        Canon cSelect = buscarCanonPorNombre(selecCanon);
        if (cSelect != null) {
            txtPotencia.setText(String.valueOf(cSelect.getPotencia()));
        } else {
            txtPotencia.setText("0.0");
        }
    }//GEN-LAST:event_cbxTipoCanonActionPerformed

    private void cbxTipoProyectilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoProyectilActionPerformed
        String tipoProyectil = cbxTipoProyectil.getSelectedItem().toString();
        if (tipoProyectil.equalsIgnoreCase("Elegir")) {
            txtDiametro.setText("0.0");
            txtMasa.setText("0.0");
        } else {
            for (Proyectil p : obj.getProyectil()) {
                if (p.getTipo().equalsIgnoreCase(tipoProyectil)) {
                    double masa = p.calcularMasa();

                    txtDiametro.setText(p.getDiametro() * 1000 + " mm");
                    txtMasa.setText(p.calcularMasa() + " kg");
                }
            }
        }

//        String selecProy = (String) cbxTipoProyectil.getSelectedItem();
//        System.out.println("selecProy: "+ selecProy);
//        Proyectil cSelect = buscarProyPorNombre(selecProy);
//        if (cSelect != null) {
//            txtDiametro.setText(String.valueOf(cSelect.getDiametro()));
//            txtMasa.setText(dataUtil.getDensidadPorTipo(selecProy.toLowerCase())+"");
//        } else {
//            txtDiametro.setText("");
//        }
    }//GEN-LAST:event_cbxTipoProyectilActionPerformed

    private void txtResistenciaAireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResistenciaAireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResistenciaAireActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        vacio();
    }//GEN-LAST:event_btnReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(frmCampoDisparo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCampoDisparo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCampoDisparo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCampoDisparo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCampoDisparo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSimular;
    private javax.swing.JPanel campoDisparo;
    private javax.swing.JComboBox<String> cbxTipoCanon;
    private javax.swing.JComboBox<String> cbxTipoProyectil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSpinner spnGrados;
    private javax.swing.JLabel txtAlcance;
    private javax.swing.JLabel txtAltura;
    private javax.swing.JLabel txtAngulo;
    private javax.swing.JTextField txtDensidadAire;
    private javax.swing.JLabel txtDiametro;
    private javax.swing.JLabel txtGravedad;
    private javax.swing.JLabel txtMasa;
    private javax.swing.JLabel txtPotencia;
    private javax.swing.JTextField txtResistenciaAire;
    private javax.swing.JLabel txtTiempo;
    // End of variables declaration//GEN-END:variables
    public class Dibujos extends JPanel {

        @Override
        public void paint(Graphics g) {
            super.paint(g); //To change body of generated methods, choose Tools | Templates.
            Graphics2D gd = (Graphics2D) g;

            AffineTransform transform = new AffineTransform();
            transform.rotate(Math.toRadians(-giro), 21, y - 31 + 15);
            AffineTransform old = gd.getTransform();
            gd.transform(transform);
            Dimension d = this.getSize();

//            gd.translate(x, y);
            gd.setColor(Color.BLACK);
            gd.fillOval(x, y - 31, 31, 31);

            Polygon poly = new Polygon();
            poly.addPoint(21, y - 31);
            poly.addPoint(60, y - 31 + 10);
            poly.addPoint(60, y - 31 + 20);
            poly.addPoint(21, y - 31 + 31);
            gd.setColor(Color.BLACK);
            gd.fillPolygon(poly);

            gd.setTransform(old);
            gd.setColor(Color.BLACK);
            gd.fill(new Rectangle2D.Double(x, y, 31, 10));

            gd.setColor(Color.WHITE);

            gd.drawLine(21, 0, 21, (int) d.getHeight());
            gd.drawLine(0, 348, (int) d.getWidth(), 350);
        }
    }

    public class Ovalo extends JPanel {

        @Override
        public void paint(Graphics g) {
            super.paint(g); //To change body of generated methods, choose Tools | Templates.
            Graphics2D gd = (Graphics2D) g;
            gd.setColor(Color.BLACK);

            gd.fillOval(0, 400, 31, 31);
//            gd.fillOval(x, y, 31, 31);
//            Polygon poly = new Polygon();
//            poly.addPoint(15, 400);
//            poly.addPoint(60, 410);
//            poly.addPoint(60, 420);
//            poly.addPoint(15, 431);
//            gd.setColor(Color.BLACK);
//            gd.fillPolygon(poly);
        }

    }

    private void llenacbCanon() {
        for (Canon canon : obj.canones) {
            cbxTipoCanon.addItem(canon.getTipo());
        }
    }

    private void llenacbProy() {
        for (Proyectil proy : obj.proyectil) {
            cbxTipoProyectil.addItem(proy.getTipo());
        }
    }

    private Canon buscarCanonPorNombre(String seleccion) {
        for (Canon c : obj.canones) {
            if (c.getTipo().equals(seleccion)) {
                return c;
            }
        }
        return null;
    }

    private Proyectil buscarProyPorNombre(String seleccion) {
        for (Proyectil c : obj.proyectil) {
            if (c.getTipo().equals(seleccion)) {
                return c;
            }
        }
        return null;
    }

}
