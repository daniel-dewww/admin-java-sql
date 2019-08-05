package taxicontigoproto1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;

public class JF_Principal extends javax.swing.JFrame {

    public JF_Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmiIngreso = new javax.swing.JMenuItem();
        jmi_Lista = new javax.swing.JMenuItem();
        jmi_Consultar = new javax.swing.JMenuItem();
        jmiEliminar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmi_ConsultarUsuaria = new javax.swing.JMenuItem();
        jmi_EliminarUsuaria = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jmi_Total = new javax.swing.JMenuItem();
        jmi_Autos = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jmi_UsuariasListaCompleta = new javax.swing.JMenuItem();
        jmi_Viajes = new javax.swing.JMenuItem();
        jmi_Pagos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jDesktopPane1.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1);

        jMenu2.setText("Archivo");

        jMenuItem1.setText("jMenuItem1");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu2.add(jMenuItem2);
        jMenu2.add(jSeparator2);

        jmiSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jMenu2.add(jmiSalir);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Conductoras");

        jmiIngreso.setBackground(new java.awt.Color(255, 204, 255));
        jmiIngreso.setText("Nuevo Ingreso");
        jmiIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiIngresoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiIngreso);

        jmi_Lista.setBackground(new java.awt.Color(255, 204, 255));
        jmi_Lista.setText("Lista");
        jmi_Lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ListaActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_Lista);

        jmi_Consultar.setBackground(new java.awt.Color(255, 204, 255));
        jmi_Consultar.setText("Consultar - Modificar");
        jmi_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ConsultarActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_Consultar);

        jmiEliminar.setBackground(new java.awt.Color(255, 204, 255));
        jmiEliminar.setText("Eliminar");
        jmiEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiEliminar);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Usuarias");

        jmi_ConsultarUsuaria.setText("Consultar - Modificar");
        jmi_ConsultarUsuaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ConsultarUsuariaActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_ConsultarUsuaria);

        jmi_EliminarUsuaria.setText("Eliminar");
        jmi_EliminarUsuaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_EliminarUsuariaActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_EliminarUsuaria);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Reportes");

        jMenu5.setText("Conductoras");

        jmi_Total.setText("Total");
        jmi_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_TotalActionPerformed(evt);
            }
        });
        jMenu5.add(jmi_Total);

        jmi_Autos.setText("Autos - Conductoras");
        jmi_Autos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AutosActionPerformed(evt);
            }
        });
        jMenu5.add(jmi_Autos);

        jMenu4.add(jMenu5);

        jMenu6.setText("Usuarias");

        jmi_UsuariasListaCompleta.setText("Lista Completa");
        jmi_UsuariasListaCompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_UsuariasListaCompletaActionPerformed(evt);
            }
        });
        jMenu6.add(jmi_UsuariasListaCompleta);

        jMenu4.add(jMenu6);

        jmi_Viajes.setText("Viajes");
        jmi_Viajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ViajesActionPerformed(evt);
            }
        });
        jMenu4.add(jmi_Viajes);

        jmi_Pagos.setText("Pagos");
        jmi_Pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_PagosActionPerformed(evt);
            }
        });
        jMenu4.add(jmi_Pagos);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiIngresoActionPerformed
        JIF_Ingreso jif = new JIF_Ingreso();
        jDesktopPane1.add(jif);
    }//GEN-LAST:event_jmiIngresoActionPerformed

    private void jmiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarActionPerformed
        JIF_Eliminar jif2 = new JIF_Eliminar();
        jDesktopPane1.add(jif2);
    }//GEN-LAST:event_jmiEliminarActionPerformed

    private void jmi_ListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ListaActionPerformed
        JIF_Listar jif3 = new JIF_Listar();
        jDesktopPane1.add(jif3);
    }//GEN-LAST:event_jmi_ListaActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jmi_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ConsultarActionPerformed
        JIF_Consultar jif4 = new JIF_Consultar();
        jDesktopPane1.add(jif4);
    }//GEN-LAST:event_jmi_ConsultarActionPerformed

    private void jmi_EliminarUsuariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_EliminarUsuariaActionPerformed
        JIF_EliminarUsuaria jif5 = new JIF_EliminarUsuaria();
        jDesktopPane1.add(jif5);
    }//GEN-LAST:event_jmi_EliminarUsuariaActionPerformed

    private void jmi_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_TotalActionPerformed
        String[] ArregloTitulo = {"DNI","NOMBRE","APELLIDO PATERNO","APELLIDO MATERNO","CELULAR","CALIFICACIÓN"};
        Reporte("REPORTE DE CONDUCTORAS", 
                ArregloTitulo, 
                "SELECT docConductor,nomConductor,apepConductor,apemConductor,celConductor,calConductor FROM tbl_Conductores",
                "ReporteConductoras");
        
    }//GEN-LAST:event_jmi_TotalActionPerformed

    private void jmi_UsuariasListaCompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_UsuariasListaCompletaActionPerformed
        String[] ArregloTitulo2 = {"DNI","NOMBRE","APELLIDO PATERNO","APELLIDO MATERNO","DIRECCIÓN","FECHA DE NACIMIENTO","CALIFICACIÓN","CORREO ELECTRÓNICO","CELULAR","NÚMERO DE LOGEOS"};
        Reporte("REPORTE DE USUARIAS", 
                ArregloTitulo2, 
                "SELECT docUsuario,nomUsuario,apepUsuario,apemUsuario,dirUsuario,nacUsuario,calUsuario,mailUsuario,celUsuario,numLogeo FROM tbl_Usuarios",
                "ReporteUsuarias");
    }//GEN-LAST:event_jmi_UsuariasListaCompletaActionPerformed

    private void jmi_ConsultarUsuariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ConsultarUsuariaActionPerformed
        JIF_ConsultarUsuaria jif6 = new JIF_ConsultarUsuaria();
        jDesktopPane1.add(jif6);
    }//GEN-LAST:event_jmi_ConsultarUsuariaActionPerformed

    private void jmi_ViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ViajesActionPerformed
        String[] ArregloTitulo2 = {"DNI","NOMBRE","APELLIDO PATERNO","APELLIDO MATERNO","DIRECCIÓN","FECHA DE NACIMIENTO","CALIFICACIÓN","CORREO ELECTRÓNICO","CELULAR","NÚMERO DE LOGEOS"};
        Reporte("REPORTE DE USUARIAS", 
                ArregloTitulo2, 
                "SELECT docUsuario,nomUsuario,apepUsuario,apemUsuario,dirUsuario,nacUsuario,calUsuario,mailUsuario,celUsuario,numLogeo FROM tbl_Usuarios",
                "ReporteUsuarias");
    }//GEN-LAST:event_jmi_ViajesActionPerformed

    private void jmi_PagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_PagosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_PagosActionPerformed

    private void jmi_AutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AutosActionPerformed
        String[] ArregloTitulo2 = {"DNI","NOMBRE","APELLIDO PATERNO","APELLIDO MATERNO","PLACA DE AUTO","MODELO DE AUTO","MARCA DE AUTO"};
        Reporte("REPORTE DE CONDUCTORAS Y AUTOS", 
                ArregloTitulo2, 
                "SELECT c.docConductor,c.nomConductor,c.apepConductor,c.apemConductor,a.placaAuto,m.nomModeloAuto,s.nomMarcaAuto\n" +
                "FROM tbl_Conductores AS c\n" +
                "JOIN tbl_AutosConductor AS a ON c.placaAuto = a.placaAuto\n" +
                "JOIN tbl_ModeloAuto AS m ON m.codModeloAuto = a.codModeloAuto\n" +
                "JOIN tbl_MarcasAuto AS s ON s.codMarcaAuto = m.codMarcaAuto",
                "ReporteConductorasAutos");
    }//GEN-LAST:event_jmi_AutosActionPerformed

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
            java.util.logging.Logger.getLogger(JF_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Principal().setVisible(true);
            }
        });
    }
    
    Connection con;
    Statement stmt;
    ResultSet rs;
       
    //String connectionURL = "jdbc:sqlserver://JOSE-PC:1433;databaseName=DB_TAXICONTIGO_PROT1";
    String connectionURL = "jdbc:sqlserver://DESKTOP-5E85M15:1433;databaseName=DB_TAXICONTIGO_PROT1";
    
    public void Reporte (String Titulo,String[] cabecera,String sSQL,String nomArchivo){
    try {
                 
            Workbook Libro = new HSSFWorkbook();
            Sheet sheet = Libro.createSheet(nomArchivo);
            
            CellStyle tituloEstilo = Libro.createCellStyle();
            
            tituloEstilo.setAlignment(HorizontalAlignment.CENTER);
            tituloEstilo.setVerticalAlignment(VerticalAlignment.CENTER);
            tituloEstilo.setFillBackgroundColor(IndexedColors.TURQUOISE.getIndex());
            Font fuenteEstilo = Libro.createFont();
            fuenteEstilo.setFontName("Calibri");
            fuenteEstilo.setBold(true);
            fuenteEstilo.setColor(IndexedColors.DARK_BLUE.getIndex());
            fuenteEstilo.setFontHeightInPoints((short)20);
            
            tituloEstilo.setFont(fuenteEstilo);
            
            Row filaTitulo = sheet.createRow(1);
            
            Cell celdaTitulo = filaTitulo.createCell(1);
            celdaTitulo.setCellStyle(tituloEstilo);
            celdaTitulo.setCellValue(Titulo);
            
            sheet.addMergedRegion(new org.apache.poi.ss.util.CellRangeAddress(1, 3, 1, cabecera.length));

            //String[] cabecera = new String[]{Cabecera1};    
            Row filaEncabezados = sheet.createRow(4);
            
            CellStyle cabeceraEstilo = Libro.createCellStyle();
            cabeceraEstilo.setAlignment(HorizontalAlignment.CENTER);
            cabeceraEstilo.setVerticalAlignment(VerticalAlignment.CENTER);
            cabeceraEstilo.setFillBackgroundColor(IndexedColors.TURQUOISE.getIndex());
            cabeceraEstilo.setBorderTop(BorderStyle.THIN);
            cabeceraEstilo.setBorderBottom(BorderStyle.THIN);
            cabeceraEstilo.setBorderLeft(BorderStyle.THIN);
            cabeceraEstilo.setBorderRight(BorderStyle.THIN);

            Font fuenteCabecera = Libro.createFont();
            fuenteCabecera.setFontName("Calibri");
            fuenteCabecera.setBold(true);
            fuenteCabecera.setFontHeightInPoints((short)14);
            cabeceraEstilo.setFont(fuenteCabecera);
         
            
            for (int i = 0; i< cabecera.length; i++){
                Cell celdaEncabezado = filaEncabezados.createCell(i+1);
                celdaEncabezado.setCellValue(cabecera[i]);
                celdaEncabezado.setCellStyle(cabeceraEstilo);
            }
          
            int numFilaDatos = 5;
            
                CellStyle datosEstilo = Libro.createCellStyle();
                datosEstilo.setAlignment(HorizontalAlignment.CENTER);
                datosEstilo.setVerticalAlignment(VerticalAlignment.CENTER);
                datosEstilo.setFillBackgroundColor(IndexedColors.TURQUOISE.getIndex());
                datosEstilo.setBorderTop(BorderStyle.THIN);
                datosEstilo.setBorderBottom(BorderStyle.THIN);
                datosEstilo.setBorderLeft(BorderStyle.THIN);
                datosEstilo.setBorderRight(BorderStyle.THIN);
                
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionURL,"sa","12345");
            
            String SQL = sSQL;
            
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);

            int numCol = rs.getMetaData().getColumnCount();
                
            while (rs.next()){
                Row FilaDatos = sheet.createRow(numFilaDatos);
                for (int a = 0; a < numCol; a++){
                    Cell CeldaDatos = FilaDatos.createCell(a+1);
                    CeldaDatos.setCellStyle(datosEstilo);
                    CeldaDatos.setCellValue(rs.getString(a+1));    
                }
                numFilaDatos++;                
            }
            
            //Mediante un bucle se ajusta el tamaño de cada columna:
            for (int i=0; i<numCol; i++){sheet.autoSizeColumn(i+1);}
            
            Calendar c = Calendar.getInstance();
        
            FileOutputStream fileout = new FileOutputStream("E:\\"+nomArchivo+" "+Integer.toString(c.get(Calendar.DATE))+
                                                            "-"+Integer.toString(c.get(Calendar.MONTH))+
                                                            "-"+Integer.toString(c.get(Calendar.YEAR))+".xls");
            
            Libro.write(fileout);
            fileout.close();
            
        } catch (FileNotFoundException ex) {Logger.getLogger(JF_Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {Logger.getLogger(JF_Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage());}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem jmiEliminar;
    private javax.swing.JMenuItem jmiIngreso;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JMenuItem jmi_Autos;
    private javax.swing.JMenuItem jmi_Consultar;
    private javax.swing.JMenuItem jmi_ConsultarUsuaria;
    private javax.swing.JMenuItem jmi_EliminarUsuaria;
    private javax.swing.JMenuItem jmi_Lista;
    private javax.swing.JMenuItem jmi_Pagos;
    private javax.swing.JMenuItem jmi_Total;
    private javax.swing.JMenuItem jmi_UsuariasListaCompleta;
    private javax.swing.JMenuItem jmi_Viajes;
    // End of variables declaration//GEN-END:variables
}
