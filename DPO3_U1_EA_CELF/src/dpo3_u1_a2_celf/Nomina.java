/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpo3_u1_a2_celf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author osiri
 */
public class Nomina extends javax.swing.JFrame {
File Archivo = new File("");
    /**
     * Creates new form Nomina
     */
    public Nomina() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtArchivo = new javax.swing.JTextArea();
        btnSel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnSelec = new javax.swing.JButton();
        btnElim = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAnterior = new javax.swing.JTextField();
        txtNvoNombre = new javax.swing.JTextField();
        btnCambiar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 800));
        getContentPane().setLayout(null);

        txtArchivo.setColumns(20);
        txtArchivo.setRows(5);
        jScrollPane1.setViewportView(txtArchivo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 430, 380, 90);

        btnSel.setText("Seleccionar archivo");
        btnSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelActionPerformed(evt);
            }
        });
        getContentPane().add(btnSel);
        btnSel.setBounds(130, 540, 150, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 204, 255));
        jLabel3.setText("No. Empleado:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 130, 150, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 204, 255));
        jLabel4.setText("Nombre completo:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 180, 180, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 204, 255));
        jLabel5.setText("RFC:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 230, 100, 22);
        getContentPane().add(txtNum);
        txtNum.setBounds(270, 130, 290, 30);
        getContentPane().add(txtName);
        txtName.setBounds(270, 180, 290, 30);
        getContentPane().add(txtRFC);
        txtRFC.setBounds(270, 240, 290, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Visualizar archivos");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 340, 240, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 204, 255));
        jLabel7.setText("Seleccione la acci??n a realizar:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 390, 220, 17);

        btnEditar.setText("Editar archivo");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(290, 540, 120, 25);

        btnSelec.setText("Seleccionar");
        btnSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelec);
        btnSelec.setBounds(560, 600, 110, 25);

        btnElim.setText("Eliminar archivo");
        btnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimActionPerformed(evt);
            }
        });
        getContentPane().add(btnElim);
        btnElim.setBounds(430, 540, 130, 25);

        btnCrear.setText("Crear archivo");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear);
        btnCrear.setBounds(430, 290, 120, 25);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 204, 255));
        jLabel9.setText("Oprima para crear archivo txt:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 290, 340, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 204, 255));
        jLabel8.setText("Seleccione el archivo a renombrar:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 600, 240, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 204, 255));
        jLabel10.setText("Escriba el nuevo nombre:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 640, 200, 17);
        getContentPane().add(txtAnterior);
        txtAnterior.setBounds(300, 600, 250, 19);
        getContentPane().add(txtNvoNombre);
        txtNvoNombre.setBounds(300, 640, 250, 19);

        btnCambiar.setText("Cambiar");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCambiar);
        btnCambiar.setBounds(560, 640, 110, 25);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("ES1821006013");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(290, 90, 90, 15);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("Celina Elizabeth Luevanos Felix");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(250, 70, 200, 15);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Raleway SemiBold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("NOMINA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 20, 260, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/19994914.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -40, 930, 890);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelActionPerformed
       JFileChooser fc =new JFileChooser();//Nos sirve para declarar la variable fc de tipo file chooser
       fc.showOpenDialog(null);//Aqui especificamos que abra el cuadro de dialogo sin ningun objeto seleccionado
       File archivo = fc.getSelectedFile();//declaramos la variable tipo file de nombre archivo 
       try{
           FileReader fr= new FileReader (archivo);//declaramos la variable como nuevo file 
           BufferedReader br= new BufferedReader (fr);//espacio de memoria para que lo mantenga y luego la presente
           String texto="";//declaramos una variable de tipo string y la inicializamos con cadena vacia
           String linea="";// declaramos variable linea de tipo string y la inicializamos con cadena vacia
           while (((linea = br.readLine())!=null)){//lo usamos para recorrer todo el archivo y cada linea la va a agregar a la variable texto
               texto+=linea+"\n";//que nos lea la primera linea y realice un salto de linea
           }
           txtArchivo.setText(texto);
           JOptionPane.showMessageDialog(null, "Archivo leido correctamente");//pedimos que nos arroje un dialogo que nos indique que se cargo el archivo
       }
       catch (Exception e){
    }
    }//GEN-LAST:event_btnSelActionPerformed
    
    private void btnSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecActionPerformed
       JFileChooser fc= new JFileChooser();//Declaraci??n de la variable para abrir el cuadro de dialogo que nos permita seleccionar el archivo
       fc.showOpenDialog(null);//metodo para abrir el cuadro de dialogo sin seleccionar ningun objeto
       Archivo = fc.getSelectedFile();//creacion de la variable tipo file llamada archivo asignandole el archivo seleccionado en el cuadro de dialogo
       txtAnterior.setText(Archivo.getParent()+"\\"+Archivo.getName());//el campo de texto para presentar lo que contesta nuestra variable 
                                                                      //Archivo concatenando el nombre y las slash de separaci??n
    }//GEN-LAST:event_btnSelecActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
       JFileChooser fc =new JFileChooser();//Nos sirve para declarar la variable fc de tipo file chooser
       fc.showSaveDialog(null);//Especificamos que nos abra un cuadro de dialogo de guardado
       File archivo = fc.getSelectedFile();//declaramos la variable tipo file de nombre archivo 

       try{
           FileWriter fw = new FileWriter (archivo+".txt");//especificamos el nombre del archivo que seleccione el usuario mas la extensi??n txt
           BufferedWriter bw= new BufferedWriter (fw);//declaramos la variable buffered y la nombramos bw igualandola a la fw que es tipo file writer
           String Noempleado = txtNum.getText();//Estos son los campos que queremos en el archivo
           String Nombre = txtName.getText();//Estos son los campos que queremos en el archivo
           String RFC = txtRFC.getText();//Estos son los campos que queremos en el archivo
           
           bw.write("No empleado="+ Noempleado +"\n"+ "Nombre ="+ Nombre +"\n"+"RFC ="+ RFC + "");//pedimos que nos escriba los campos mas un salto de linea
           
           txtNum.setText("");
           txtName.setText("");
           txtRFC.setText("");
           JOptionPane.showMessageDialog(null, "Archivo creado correctamente");
           
           bw.close();
       }catch(IOException e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        String nvo = Archivo.getParent()+"\\"+txtNvoNombre.getText()+ ".txt";//declaramos la variable llamada nuevo del tipo string, la inicializamos con los datos de la 
                                                                            //variable archivo agregando toda la ruta y el texto que el usuario escoja como nuevo nombre
        File f2 = new File (nvo);//incializamos la variable fr de tipo file y se inicialice con un nuevo file con los datos de la variable nvo.
        boolean correcto = Archivo.renameTo(f2);// incializamos una variable de tipo boleano para hacer que la variable Archivo se pase el nuevo nombre que queremos darle
        if (correcto == true){//si el valor asignado es un valor verdadero 
            JOptionPane.showMessageDialog(null, "El archivo se ha renombrado correctamente");//Entonces que muestre un mensaje de renombre correcto
        }
        else{//de lo contrario
            JOptionPane.showMessageDialog(null, "No ha sido posible renombrar el archivo");//muestre un cuadro de dialogo con el renombre no realizado
        }
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed
        JFileChooser fc=new JFileChooser();//Usaremos estos parametros para abrir la ventana para seleccionar el archivo
        fc.showOpenDialog(null);//Usamos la variable declarada para abrir el cuadro de dialogo sin que tenga un objeto seleccionado
        File archivo = fc.getSelectedFile();//le asignamos a la variable el valor del archivo seleccionado
        if (archivo.delete())//si el archivo es eliminado
            JOptionPane.showMessageDialog(null, "El archivo ha sido borrado satisfactoriamente");//Nos manda un mensaje de borrado correctamente
        else//en caso contrario
            JOptionPane.showMessageDialog(null, "El archivo no puede ser borrado");//envie un mensaje de que no fue posible borrar
    }//GEN-LAST:event_btnElimActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       JFileChooser fc =new JFileChooser();//Nos sirve para declarar la variable fc de tipo file chooser
       fc.showSaveDialog(null);//Especificamos que nos abra un cuadro de dialogo de guardado
       File archivo = fc.getSelectedFile();//declaramos la variable tipo file de nombre archivo 

       try{
           FileWriter fw = new FileWriter (archivo+".txt");//especificamos el nombre del archivo que seleccione el usuario mas la extensi??n txt
           BufferedWriter bw= new BufferedWriter (fw);//declaramos la variable buffered y la nombramos bw igualandola a la fw que es tipo file writer
           String Archivoeditado = txtArchivo.getText();//Estos son los campos que queremos en el archivo
           
           bw.write(Archivoeditado);//pedimos que nos escriba los campos mas un salto de linea
           
           JOptionPane.showMessageDialog(null, "Archivo editado correctamente");
           
           bw.close();
       }catch(IOException e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(Nomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nomina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnElim;
    private javax.swing.JButton btnSel;
    private javax.swing.JButton btnSelec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAnterior;
    private javax.swing.JTextArea txtArchivo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtNvoNombre;
    private javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables
}
