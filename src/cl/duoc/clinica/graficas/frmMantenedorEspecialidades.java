/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cl.duoc.clinica.graficas;

import cl.duoc.clinica.entidades.Especialidad;
import cl.duoc.clinica.negocio.negEspecialidad;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Esteb
 */
public class frmMantenedorEspecialidades extends javax.swing.JFrame {

    /**
     * Creates new form MantenedorEspecialidades
     */
    public frmMantenedorEspecialidades() {
        initComponents();
        establecerId();
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenuEspecialidades = new javax.swing.JPanel();
        AgregarButton = new javax.swing.JPanel();
        lblAgregar = new javax.swing.JLabel();
        EliminarButton = new javax.swing.JPanel();
        eliminartxt = new javax.swing.JLabel();
        ModificarButton = new javax.swing.JPanel();
        modificartxt = new javax.swing.JLabel();
        MainMenuME = new javax.swing.JPanel();
        mainmenuMEtxt = new javax.swing.JLabel();
        CerrarSesionME = new javax.swing.JPanel();
        cerrarsesionMEtxt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TitleBG = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        ZonaBg = new javax.swing.JPanel();
        txtIdEspecialidad = new javax.swing.JTextField();
        lblID_Especialidad1 = new javax.swing.JLabel();
        lblnombreEspecialidad = new javax.swing.JLabel();
        txtNombreEspecialidad = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEspecialidad = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 135, 193));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainMenuEspecialidades.setBackground(new java.awt.Color(0, 135, 193));

        AgregarButton.setBackground(new java.awt.Color(0, 0, 255));
        AgregarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgregarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgregarButtonMouseExited(evt);
            }
        });

        lblAgregar.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        lblAgregar.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregar.setText("AGREGAR");

        javax.swing.GroupLayout AgregarButtonLayout = new javax.swing.GroupLayout(AgregarButton);
        AgregarButton.setLayout(AgregarButtonLayout);
        AgregarButtonLayout.setHorizontalGroup(
            AgregarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AgregarButtonLayout.setVerticalGroup(
            AgregarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        EliminarButton.setBackground(new java.awt.Color(0, 0, 255));
        EliminarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminarButtonMouseExited(evt);
            }
        });

        eliminartxt.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        eliminartxt.setForeground(new java.awt.Color(255, 255, 255));
        eliminartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminartxt.setText("ELIMINAR");

        javax.swing.GroupLayout EliminarButtonLayout = new javax.swing.GroupLayout(EliminarButton);
        EliminarButton.setLayout(EliminarButtonLayout);
        EliminarButtonLayout.setHorizontalGroup(
            EliminarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eliminartxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EliminarButtonLayout.setVerticalGroup(
            EliminarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eliminartxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        ModificarButton.setBackground(new java.awt.Color(0, 0, 255));
        ModificarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ModificarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ModificarButtonMouseExited(evt);
            }
        });

        modificartxt.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        modificartxt.setForeground(new java.awt.Color(255, 255, 255));
        modificartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificartxt.setText("MODIFICAR");

        javax.swing.GroupLayout ModificarButtonLayout = new javax.swing.GroupLayout(ModificarButton);
        ModificarButton.setLayout(ModificarButtonLayout);
        ModificarButtonLayout.setHorizontalGroup(
            ModificarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modificartxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ModificarButtonLayout.setVerticalGroup(
            ModificarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modificartxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        MainMenuME.setBackground(new java.awt.Color(204, 0, 153));
        MainMenuME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainMenuMEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MainMenuMEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MainMenuMEMouseExited(evt);
            }
        });

        mainmenuMEtxt.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        mainmenuMEtxt.setForeground(new java.awt.Color(255, 255, 255));
        mainmenuMEtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainmenuMEtxt.setText("MENU PRINCIPAL");

        javax.swing.GroupLayout MainMenuMELayout = new javax.swing.GroupLayout(MainMenuME);
        MainMenuME.setLayout(MainMenuMELayout);
        MainMenuMELayout.setHorizontalGroup(
            MainMenuMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainmenuMEtxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MainMenuMELayout.setVerticalGroup(
            MainMenuMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainmenuMEtxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        CerrarSesionME.setBackground(new java.awt.Color(204, 0, 153));
        CerrarSesionME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionMEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarSesionMEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarSesionMEMouseExited(evt);
            }
        });

        cerrarsesionMEtxt.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        cerrarsesionMEtxt.setForeground(new java.awt.Color(255, 255, 255));
        cerrarsesionMEtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarsesionMEtxt.setText("CERRAR SESION");

        javax.swing.GroupLayout CerrarSesionMELayout = new javax.swing.GroupLayout(CerrarSesionME);
        CerrarSesionME.setLayout(CerrarSesionMELayout);
        CerrarSesionMELayout.setHorizontalGroup(
            CerrarSesionMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrarsesionMEtxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CerrarSesionMELayout.setVerticalGroup(
            CerrarSesionMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrarsesionMEtxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("OPCIONES");

        javax.swing.GroupLayout mainMenuEspecialidadesLayout = new javax.swing.GroupLayout(mainMenuEspecialidades);
        mainMenuEspecialidades.setLayout(mainMenuEspecialidadesLayout);
        mainMenuEspecialidadesLayout.setHorizontalGroup(
            mainMenuEspecialidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AgregarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(EliminarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ModificarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MainMenuME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CerrarSesionME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuEspecialidadesLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(mainMenuEspecialidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuEspecialidadesLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuEspecialidadesLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        mainMenuEspecialidadesLayout.setVerticalGroup(
            mainMenuEspecialidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuEspecialidadesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(AgregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ModificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MainMenuME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CerrarSesionME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(mainMenuEspecialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 410));

        jPanel3.setBackground(new java.awt.Color(0, 135, 193));

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MANTENEDOR ESPECIALIDADES");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbv/images/iconoCLinica.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TitleBGLayout = new javax.swing.GroupLayout(TitleBG);
        TitleBG.setLayout(TitleBGLayout);
        TitleBGLayout.setHorizontalGroup(
            TitleBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TitleBGLayout.setVerticalGroup(
            TitleBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleBGLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(TitleBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 610, 80));

        ZonaBg.setBackground(new java.awt.Color(0, 135, 193));

        txtIdEspecialidad.setEditable(false);
        txtIdEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEspecialidadActionPerformed(evt);
            }
        });

        lblID_Especialidad1.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        lblID_Especialidad1.setForeground(new java.awt.Color(255, 255, 255));
        lblID_Especialidad1.setText("ID_ESPECIALIDAD:");

        lblnombreEspecialidad.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        lblnombreEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        lblnombreEspecialidad.setText("NOMBRE ESPECIALIDAD:");

        txtNombreEspecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreEspecialidadMouseClicked(evt);
            }
        });
        txtNombreEspecialidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEspecialidadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout ZonaBgLayout = new javax.swing.GroupLayout(ZonaBg);
        ZonaBg.setLayout(ZonaBgLayout);
        ZonaBgLayout.setHorizontalGroup(
            ZonaBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ZonaBgLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(ZonaBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblnombreEspecialidad)
                    .addComponent(lblID_Especialidad1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ZonaBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        ZonaBgLayout.setVerticalGroup(
            ZonaBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ZonaBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ZonaBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID_Especialidad1))
                .addGap(39, 39, 39)
                .addGroup(ZonaBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombreEspecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(txtNombreEspecialidad))
                .addGap(32, 32, 32))
        );

        getContentPane().add(ZonaBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 610, 140));

        jPanel1.setBackground(new java.awt.Color(0, 135, 193));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 115, 164)));

        tblEspecialidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_ESPECIALIDAD", "NOMBRE_ESPECIALIDAD"
            }
        ));
        tblEspecialidad.setGridColor(new java.awt.Color(51, 51, 255));
        tblEspecialidad.setSurrendersFocusOnKeystroke(true);
        tblEspecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEspecialidadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEspecialidad);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 610, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarButtonMouseEntered
        AgregarButton.setBackground(Color.ORANGE);
    }//GEN-LAST:event_AgregarButtonMouseEntered

    private void AgregarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarButtonMouseExited
        AgregarButton.setBackground(Color.BLUE);
    }//GEN-LAST:event_AgregarButtonMouseExited

    private void EliminarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarButtonMouseEntered
        EliminarButton.setBackground(Color.ORANGE);
    }//GEN-LAST:event_EliminarButtonMouseEntered

    private void EliminarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarButtonMouseExited
        EliminarButton.setBackground(Color.BLUE);
    }//GEN-LAST:event_EliminarButtonMouseExited

    private void ModificarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarButtonMouseEntered
        ModificarButton.setBackground(Color.ORANGE);
    }//GEN-LAST:event_ModificarButtonMouseEntered

    private void ModificarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarButtonMouseExited
        ModificarButton.setBackground(Color.BLUE);
    }//GEN-LAST:event_ModificarButtonMouseExited

    private void MainMenuMEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainMenuMEMouseEntered
        MainMenuME.setBackground(Color.ORANGE);
    }//GEN-LAST:event_MainMenuMEMouseEntered

    private void MainMenuMEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainMenuMEMouseExited
        MainMenuME.setBackground(new Color(204,0,153));
    }//GEN-LAST:event_MainMenuMEMouseExited

    private void CerrarSesionMEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMEMouseEntered
        CerrarSesionME.setBackground(Color.ORANGE);
    }//GEN-LAST:event_CerrarSesionMEMouseEntered

    private void CerrarSesionMEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMEMouseExited
        CerrarSesionME.setBackground(new Color(204,0,153));
    }//GEN-LAST:event_CerrarSesionMEMouseExited

    private void MainMenuMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainMenuMEMouseClicked
        frmMenuP mm = new frmMenuP();
        mm.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_MainMenuMEMouseClicked

    private void CerrarSesionMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMEMouseClicked
        frmLogin log = new frmLogin();
        log.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_CerrarSesionMEMouseClicked

    private void tblEspecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEspecialidadMouseClicked

        int selectedRow = tblEspecialidad.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una especialidad");
        } else {
            int idEspecialidad = (int) tblEspecialidad.getValueAt(selectedRow, 0);
            String nombreEspecialidad = (String) tblEspecialidad.getValueAt(selectedRow, 1);

            txtIdEspecialidad.setText(String.valueOf(idEspecialidad));
            txtNombreEspecialidad.setText(nombreEspecialidad);
        }
    }//GEN-LAST:event_tblEspecialidadMouseClicked

    private void txtIdEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEspecialidadActionPerformed

    private void txtNombreEspecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreEspecialidadMouseClicked

    }//GEN-LAST:event_txtNombreEspecialidadMouseClicked

    private void txtNombreEspecialidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEspecialidadKeyTyped
        char key = evt.getKeyChar();

        if (Character.isDigit(key)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo letras permitidas en este campo");
        }
    }//GEN-LAST:event_txtNombreEspecialidadKeyTyped

    private void AgregarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarButtonMouseClicked
        String nombreEspecialidad = txtNombreEspecialidad.getText();

        if (!nombreEspecialidad.isEmpty()) {
            negEspecialidad negEsp = new negEspecialidad();
            Especialidad esp = new Especialidad(negEsp.nextId(), nombreEspecialidad);
            if (negEsp.agregar(esp)) {
                JOptionPane.showMessageDialog(this, "Especialidad agregada");
            } else {
                JOptionPane.showMessageDialog(this, "Error al agregar especialidad");
            }
        } else {
            JOptionPane.showMessageDialog(this, "El nombre de la especialidad no debe ser vacio");
        }

        refrescaTabla();
        limpiarDatos();       
    }//GEN-LAST:event_AgregarButtonMouseClicked

    private void EliminarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarButtonMouseClicked

        int id_especialidad = Integer.parseInt(txtIdEspecialidad.getText());

        negEspecialidad neg = new negEspecialidad();
        Especialidad esp = new Especialidad();
        esp.setIdEspecialidad(id_especialidad);

        if (neg.eliminar(esp)) {
            JOptionPane.showMessageDialog(this, "Especialidad eliminada");
            limpiarDatos();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una especialidad");
            limpiarDatos();
        }

        refrescaTabla();
       
    }//GEN-LAST:event_EliminarButtonMouseClicked

    private void ModificarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarButtonMouseClicked
        int idEspecialidad = Integer.parseInt(txtIdEspecialidad.getText()) ;
        String nombreEspecialidad = txtNombreEspecialidad.getText();

        Especialidad esp = new Especialidad(idEspecialidad, nombreEspecialidad);

        negEspecialidad neg = new negEspecialidad();

        if(neg.actualizar(esp)){
            JOptionPane.showMessageDialog(this, "Especialidad modificada");
            limpiarDatos();
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una especialidad");
            limpiarDatos();
        }

        refrescaTabla();        
    }//GEN-LAST:event_ModificarButtonMouseClicked

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
            java.util.logging.Logger.getLogger(frmMantenedorEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMantenedorEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMantenedorEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMantenedorEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMantenedorEspecialidades().setVisible(true);
            }
        });
    }
    
    private void llenarTabla() {
        
        negEspecialidad neg = new negEspecialidad();
        ArrayList<Especialidad> lista = neg.listarTodo();
        
        DefaultTableModel model = (DefaultTableModel) tblEspecialidad.getModel();
        Object[] columnas = new Object[2];
        
        for (Especialidad esp : lista) {
            columnas[0] = esp.getIdEspecialidad();
            columnas[1] = esp.getNombreEspecialidad();
            model.addRow(columnas);
        }
        
        tblEspecialidad.setModel(model);       
    }
    
    private void establecerId() {
        txtIdEspecialidad.setText(String.valueOf(new negEspecialidad().nextId()));
        txtNombreEspecialidad.requestFocus();
    }
    
    private void limpiarDatos() {
        establecerId();
        txtNombreEspecialidad.setText("");
        txtNombreEspecialidad.requestFocus();
    }
    
    private void refrescaTabla()
    {
       DefaultTableModel dm = (DefaultTableModel) tblEspecialidad.getModel();
       dm.getDataVector().removeAllElements();
       llenarTabla();         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgregarButton;
    private javax.swing.JPanel CerrarSesionME;
    private javax.swing.JPanel EliminarButton;
    private javax.swing.JPanel MainMenuME;
    private javax.swing.JPanel ModificarButton;
    private javax.swing.JPanel TitleBG;
    private javax.swing.JPanel ZonaBg;
    private javax.swing.JLabel cerrarsesionMEtxt;
    private javax.swing.JLabel eliminartxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblID_Especialidad1;
    private javax.swing.JLabel lblnombreEspecialidad;
    private javax.swing.JPanel mainMenuEspecialidades;
    private javax.swing.JLabel mainmenuMEtxt;
    private javax.swing.JLabel modificartxt;
    private javax.swing.JTable tblEspecialidad;
    private javax.swing.JTextField txtIdEspecialidad;
    private javax.swing.JTextField txtNombreEspecialidad;
    // End of variables declaration//GEN-END:variables
}