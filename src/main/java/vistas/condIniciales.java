package vistas;

import controlador.SimulacionDisparo;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.*;
import service.ReporteCondicionesIniciales;
import util.dataUtil;

public class condIniciales extends javax.swing.JInternalFrame {
    static int cont=1000;
//    int conFilter = 0;

    private List<CondicionesIniciales> listaCond;
    SimulacionDisparo s = new SimulacionDisparo();
//    ReporteCondicionesIniciales reporteCondicionesIniciales =  new ReporteCondicionesIniciales();
    dataUtil reporteCondicionesIniciales = new dataUtil();
    Disparo d =  new Disparo();

    public condIniciales() {
        initComponents();
        
        busquedaPorNombre("");
        
    }
    
    void muestra() {
        DefaultTableModel dt = (DefaultTableModel) tabla1.getModel();
        dt.setRowCount(0);
        System.out.println("Imprimir Resultado disparos!");
        reporteCondicionesIniciales.getListCondIni().forEach(r -> System.out.println(r));
     
        for (CondicionesIniciales x : reporteCondicionesIniciales.getListCondIni()) {
            Object v[] = {x.getId(), x.getNombreAutor(), x.getCanon().getPotencia(), x.getProyectil().getMasa(),x.getAmbiente().getResistenciaAire(),x.getAmbiente().getDensidadAire(), x.getAngulo()};
            dt.addRow(v);
        }
//        cont =0;
    }
    
    void busquedaPorNombreConFiltro(String cad){
        DefaultTableModel dt = (DefaultTableModel) tabla1.getModel();
        dt.setRowCount(0);
        reporteCondicionesIniciales.getListCondIni().stream().filter(ci -> ci.getNombreAutor().startsWith(cad)).forEach(x -> 
                dt.addRow(new Object[]{x.getId(), x.getNombreAutor(), x.getCanon().getPotencia(), x.getProyectil().getMasa(),x.getAmbiente().getResistenciaAire(),x.getAmbiente().getDensidadAire(), x.getAngulo()})
        );
    }
    
    void busquedaPorNombre(String nombre){
        System.out.println("Buscar nombre: "+nombre);
        DefaultTableModel dt = (DefaultTableModel) tabla1.getModel();
        dt.setRowCount(0);
        reporteCondicionesIniciales.getListCondIni().stream().filter(ci -> ci.getNombreAutor().equalsIgnoreCase(nombre.trim())).forEach(x -> 
                dt.addRow(new Object[]{x.getId(), x.getNombreAutor(), x.getCanon().getPotencia(), x.getProyectil().getMasa(),x.getAmbiente().getResistenciaAire(),x.getAmbiente().getDensidadAire(), x.getAngulo()})
        );
    }
    
    void buscarPorId(String id){
        DefaultTableModel dt = (DefaultTableModel) tabla1.getModel();
        dt.setRowCount(0);
        int disparoId = Integer.parseInt(id);
        reporteCondicionesIniciales.getListCondIni().stream().filter(ci -> ci.getId()==disparoId).forEach(x -> 
                dt.addRow(new Object[]{x.getId(), x.getNombreAutor(), x.getCanon().getPotencia(), x.getProyectil().getMasa(),x.getAmbiente().getResistenciaAire(),x.getAmbiente().getDensidadAire(), x.getAngulo()})
        );
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIdDisparo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        rbtId = new javax.swing.JRadioButton();
        rbtNombre = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setClosable(true);
        setResizable(true);
        setTitle("Busqueda de condiciones iniciales");

        jPanel2.setBackground(new java.awt.Color(225, 206, 122));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Busqueda de condiciones iniciales");

        txtIdDisparo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdDisparoActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Id Disparo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Autor del disparo:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(66, 75, 84));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Criterio de busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        buttonGroup2.add(rbtId);
        rbtId.setText("porId");

        buttonGroup2.add(rbtNombre);
        rbtNombre.setText("porNombre");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtId)
                    .addComponent(rbtNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbtId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtNombre)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Autor", "Potencia del cañon", "Masa del proy.", "Res. del aire", "Dens. del aire", "Angulo de tiro"
            }
        ));
        jScrollPane1.setViewportView(tabla1);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Recomendaciones:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtIdDisparo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton1))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(141, 141, 141)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdDisparo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jButton1))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdDisparoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdDisparoActionPerformed

    }//GEN-LAST:event_txtIdDisparoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String idDisparo = txtIdDisparo.getText();
        String nombre = txtNombre.getText();
        if(rbtId.isSelected()){
            if(idDisparo!=null&& !(idDisparo.isEmpty())){   
                buscarPorId(idDisparo);
            }
        }else if(rbtNombre.isSelected()){
            if(nombre!=null&& !(nombre.isEmpty())){  
                busquedaPorNombre(nombre);
            }
        }else{
           muestra(); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton rbtId;
    private javax.swing.JRadioButton rbtNombre;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtIdDisparo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

//    void muestra() {
//        DefaultTableModel dt = (DefaultTableModel) tabla1.getModel();
//        dt.setRowCount(0);
//        System.out.println("Imprimir gravedad Gravedad: "+ dataUtil.GRAVEDAD);
//        System.out.println("Imprimir condiciones iniciales!");
//        reporteCondicionesIniciales.getListCondIni().forEach(r -> System.out.println(r));
//        for (CondicionesIniciales x : reporteCondicionesIniciales.getListCondIni()) {
//            Object v[] = {x.getCanon().getPotencia(), x.getProyectil().getMasa(), x.getAmbiente().getResistenciaAire(), x.getAmbiente().getDensidadAire(), x.getAngulo()};
//            dt.addRow(v);
//        }
//    }

}
