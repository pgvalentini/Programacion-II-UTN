/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Pablo Valentini
 */
public class Lista_Carrera extends javax.swing.JPanel {

    /**
     * Creates new form Lista_Alumnos
     */
    public Lista_Carrera() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPOpciones = new javax.swing.JPanel();
        jBNuevo = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jSCarreras = new javax.swing.JScrollPane();
        jTCarreras = new javax.swing.JTable();

        jPOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jBNuevo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/021-Nuevo.png"))); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBNuevo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jBNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jBEditar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/022-Editar.png"))); // NOI18N
        jBEditar.setText("Editar");
        jBEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBEditar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jBEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jBEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/023-Eliminar.png"))); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBEliminar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jBEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPOpcionesLayout = new javax.swing.GroupLayout(jPOpciones);
        jPOpciones.setLayout(jPOpcionesLayout);
        jPOpcionesLayout.setHorizontalGroup(
            jPOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOpcionesLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jBNuevo)
                .addGap(18, 18, 18)
                .addComponent(jBEditar)
                .addGap(18, 18, 18)
                .addComponent(jBEliminar)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPOpcionesLayout.setVerticalGroup(
            jPOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBEliminar)
                    .addComponent(jBEditar)
                    .addComponent(jBNuevo))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jSCarreras.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTCarreras.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTCarreras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Insc.", "Nombre", "Duración"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jSCarreras.setViewportView(jTCarreras);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSCarreras)
                    .addComponent(jPOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSCarreras, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JPanel jPOpciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jSCarreras;
    private javax.swing.JTable jTCarreras;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getjBEditar() {
        return jBEditar;
    }

    public void setjBEditar(javax.swing.JButton jBEditar) {
        this.jBEditar = jBEditar;
    }

    public javax.swing.JButton getjBEliminar() {
        return jBEliminar;
    }

    public void setjBEliminar(javax.swing.JButton jBEliminar) {
        this.jBEliminar = jBEliminar;
    }

    public javax.swing.JButton getjBNuevo() {
        return jBNuevo;
    }

    public void setjBNuevo(javax.swing.JButton jBNuevo) {
        this.jBNuevo = jBNuevo;
    }

    public javax.swing.JPanel getjPOpciones() {
        return jPOpciones;
    }

    public void setjPOpciones(javax.swing.JPanel jPOpciones) {
        this.jPOpciones = jPOpciones;
    }

    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public javax.swing.JScrollPane getjSCarreras() {
        return jSCarreras;
    }

    public void setjSCarreras(javax.swing.JScrollPane jSCarreras) {
        this.jSCarreras = jSCarreras;
    }

    public javax.swing.JTable getjTCarreras() {
        return jTCarreras;
    }

    public void setjTCarreras(javax.swing.JTable jTCarreras) {
        this.jTCarreras = jTCarreras;
    }
}
