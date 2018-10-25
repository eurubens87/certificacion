
import Clases.Conexion;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


public final class RegistroC extends javax.swing.JFrame {

    public RegistroC() {
        initComponents();
        buscarcursos();
    }
    //fecha inicio
    String au8;
    String mes;
    String year;
    boolean bandera1;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jComboBox13 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 10));
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administración de Cursos");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Duración (meses):");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Carga horaria (hs semanales):");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cupo:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Con exámen de aprobación:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Nombre curso:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Profesor:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Aula:");

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Fecha inicio:");

        jComboBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox5ItemStateChanged(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Fecha fin:");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20" }));
        jComboBox4.setSelectedIndex(-1);

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "6" }));
        jComboBox8.setSelectedIndex(-1);
        jComboBox8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox8ItemStateChanged(evt);
            }
        });

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        jComboBox10.setSelectedIndex(-1);

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manualidades", "Literatura", "Dibujo", "Música", " " }));
        jComboBox11.setSelectedIndex(-1);
        jComboBox11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox11ItemStateChanged(evt);
            }
        });

        jComboBox13.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox13ItemStateChanged(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButton2)
                        .addGap(75, 75, 75)
                        .addComponent(jButton1)
                        .addGap(0, 93, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox13, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox11, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox12, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Boton cancelar
        Form1 nuevo = new Form1();
        nuevo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    //metodo para determinar si la cadena ingresada es un valor numerico
    public boolean isnumeric(String num)
    {
        try
        {
            int a = Integer.parseInt(num);
            return true;
        }
        catch(NumberFormatException e)
        {
            return false;
        }
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        //duracion
        String au1;
        
        //carga
        String au2;
        
        //aula
        String au3;
        
        //examen
        String au4;
        
        //nombre
        String au5;
        
        //profesor
        String au6;
        
        //cupo
        String au7;
        
        try
        {
            au1 = jComboBox8.getSelectedItem().toString();
        }
        catch(Exception e)
        {
            au1 = "";
        }
        
        try
        {
            au2 = jComboBox4.getSelectedItem().toString();
        }
        catch(Exception e)
        {
            au2 = "";
        }
        
        try
        {
            au3 = jComboBox13.getSelectedItem().toString();
        }
        catch(Exception e)
        {
            au3 = "";
        }
        
        try
        {
            au4 = jComboBox10.getSelectedItem().toString();
        }
        catch(Exception e)
        {
            au4 = "";
        }
        
        try
        {
            au5 = jComboBox11.getSelectedItem().toString();
        }
        catch(Exception e)
        {
            au5 = "";
        }
        
        try
        {
            au6 = jComboBox12.getSelectedItem().toString();
        }
        catch(Exception e)
        {
            au6 = "";
        }
        
        try
        {
            au7 = jComboBox9.getSelectedItem().toString();
        }
        catch(Exception e)
        {
            au7 = "";
        }
        
        try
        {
            au8 = jComboBox5.getSelectedItem().toString();
        }
        catch(Exception e)
        {
            au8 = "";
        }
        if(au1.length() > 0 && au2.length() > 0 && au4.length() > 0 & au5.length() > 0 && au7.length() > 0 && au8.length() > 0)
        {
            if(au6.length() == 0)
            {
                JOptionPane.showMessageDialog(null, "No hay profesores disponibles", "OBSERVACIÓN", JOptionPane.ERROR_MESSAGE);
                Form1 nuevo = new Form1();
                nuevo.setVisible(true);
                this.dispose();
            } else if (au3.length() == 0) {
                JOptionPane.showMessageDialog(null, "No hay aulas disponibles", "OBSERVACIÓN", JOptionPane.ERROR_MESSAGE);
                Form1 nuevo = new Form1();
                nuevo.setVisible(true);
                this.dispose();
            } else {
                Conexion nuevo = new Conexion();
                nuevo.conectar();
                if (nuevo.buscarcurso(au5) == false) {
                    nuevo.cargardatosCurso(au1, au2, au7, au4, "no presentado", au5, au6, au3, au8, jLabel16.getText());
                    nuevo.ocuparaula(Integer.parseInt(au3));
                    nuevo.usardocente(au6);
                    nuevo.desconectar();
                    Form1 main = new Form1();
                    main.setVisible(true);
                    this.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Ya existe el curso: " + au5 + "para este período");
                }
                nuevo.desconectar();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos obligatorios", "OBSERVACIÓN", JOptionPane.ERROR_MESSAGE);
        }
         
    }//GEN-LAST:event_jButton2ActionPerformed

    public void fecha_ini(int a)
    {
        Calendar fecha = Calendar.getInstance();
        int b = fecha.get(Calendar.YEAR);
        int c=1;
        Calendar factual = Calendar.getInstance();
        int fecha2 = factual.get(Calendar.DATE);
        int fecha3 = factual.get(Calendar.MONTH);
        int fecha4 = factual.get(Calendar.YEAR);
        SimpleDateFormat fechar = new SimpleDateFormat("dd/MM/yyyy");
        //fecha ingresada
        java.util.Date fecha1 = null;
        String dato;
        for (int i = 1; i < 31; i++) {
            String m = String.valueOf(c);
            if(m.length() == 1)
            {
                m = "0" + m;
            }
            
            dato = "01" + "/" + m + "/" + String.valueOf(b);
            try {
                fecha1 = fechar.parse(dato);
            } catch (ParseException ex) {
                Logger.getLogger(RegistroC.class.getName()).log(Level.SEVERE, null, ex);
            }

            String Fe = String.valueOf(fecha2) + "/" + String.valueOf(fecha3) + "/" + String.valueOf(fecha4);
            java.util.Date fecha5 = null;
            try {
                fecha5 = fechar.parse(Fe);
            } catch (ParseException ex) {
                Logger.getLogger(RegistroC.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (fecha1.compareTo(fecha5) < 0) {
                
            } else {
                jComboBox5.addItem(dato);
            }
            
            c = c + a;
            if(c == 13)
            {
                b = b + 1;
                c = 1;
            }
        }
    }
    
    private void jComboBox13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox13ItemStateChanged
        jComboBox9.removeAllItems();
        capacidadaula();
    }//GEN-LAST:event_jComboBox13ItemStateChanged

    private void jComboBox11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox11ItemStateChanged
        try {
            jComboBox12.removeAllItems();
            String driver = "com.mysql.jdbc.Driver";
            String path = "jdbc:mysql://localhost:3306/111mil?autoReconnect=true&useSSL=false";
            String user = "root";
            String pass = "riverplate";
            Connection con = null;
            String dato = "SELECT `profesor`.`DNI` FROM `111mil`.`profesor` where `estado`='NO' and `Materia`='" + jComboBox11.getSelectedItem().toString() + "';";
            try {
                Class.forName(driver);
                con = DriverManager.getConnection(path, user, pass);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(dato);

                while (rs.next()) {
                    jComboBox12.addItem(rs.getString(1));
                }
                st.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar primeramente el nombre de la materia", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jComboBox11ItemStateChanged

    private void jComboBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox5ItemStateChanged
        jLabel16.setText("");
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            try {
                au8 = jComboBox5.getSelectedItem().toString();
                SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
                //fecha ingresada
                java.util.Date fecha1 = null;
                try {
                    fecha1 = fecha.parse(au8);
                } catch (ParseException ex) {
                    Logger.getLogger(RegistroC.class.getName()).log(Level.SEVERE, null, ex);
                }

                //fecha actual
                Calendar factual = Calendar.getInstance();
                int fecha2 = factual.get(Calendar.DATE);
                int fecha3 = factual.get(Calendar.MONTH);
                int fecha4 = factual.get(Calendar.YEAR);
                String Fe = String.valueOf(fecha2) + "/" + String.valueOf(fecha3) + "/" + String.valueOf(fecha4);
                java.util.Date fecha5 = null;
                try {
                    fecha5 = fecha.parse(Fe);
                } catch (ParseException ex) {
                    Logger.getLogger(RegistroC.class.getName()).log(Level.SEVERE, null, ex);
                }
       
                if (fecha1.compareTo(fecha5) < 0) {
                    JOptionPane.showMessageDialog(null, "Ingrese una fecha posterior a la fecha actual", "ESPERE", JOptionPane.ERROR_MESSAGE);
                } else {
                    mes = au8.substring(3, 5); //01/01/2018
                    year = au8.substring(6, 10);
                    switch (mes) {
                        case "01":
                            if (bandera1 == true) {
                                jLabel16.setText("30/04/" + year);
                            } else {
                                jLabel16.setText("30/06/" + year);
                            }
                            break;
                        case "05":
                            jLabel16.setText("31/08/" + year);
                            break;
                        case "07":
                            jLabel16.setText("20/12/" + year);
                            break;
                        case "09":
                            jLabel16.setText("20/12/" + year);
                            break;
                    }
                }
            } catch (Exception e) {
                jLabel16.setText("");
                JOptionPane.showMessageDialog(null, "Debe ingresar fecha de inicio", "ESPERE", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jComboBox5ItemStateChanged

    boolean clickea = false;
    private void jComboBox8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox8ItemStateChanged
        if(clickea == true)
        {
            jComboBox5.removeAllItems();
            clickea = false;
        }
        jLabel16.setText("");
        String a = "4";
        String b = "6";
        try {
            if (a.equals(jComboBox8.getSelectedItem().toString())) {
                fecha_ini(4);
                bandera1 = true;
            } else if(b.equals(jComboBox8.getSelectedItem().toString())){
                fecha_ini(6);
                bandera1 = false;
            }
            clickea = true;
        } catch (Exception e) {
            jLabel16.setText("");
            clickea = false;
            JOptionPane.showMessageDialog(null, "Debe ingresar duración del curso", "ESPERE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jComboBox8ItemStateChanged

    public void buscarcursos()
    {

        String driver = "com.mysql.jdbc.Driver";
        String path = "jdbc:mysql://localhost:3306/111mil?autoReconnect=true&useSSL=false";
        String user = "root";
        String pass = "riverplate";
        String dato = "SELECT `aula`.`idAula` FROM `111mil`.`aula` where `aula`.`ocupado` = 'D';";
        Connection con = null;
        try
        {
            Class.forName(driver);
            con = DriverManager.getConnection(path, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(dato);
            
            while(rs.next())
            {
               jComboBox13.addItem(rs.getString(1));
            }
            st.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void capacidadaula()
    {
        String driver = "com.mysql.jdbc.Driver";
        String path = "jdbc:mysql://localhost:3306/111mil?autoReconnect=true&useSSL=false";
        String user = "root";
        String pass = "riverplate";
        Connection con = null;
        String dato = "SELECT `aula`.`Capacidad` FROM `111mil`.`aula` where `aula`.`idAula` = '" + jComboBox13.getSelectedItem().toString() + "'";
        
        
        try
        {
            Class.forName(driver);
            con = DriverManager.getConnection(path, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(dato);
            
            while(rs.next())
            {
               jComboBox9.addItem(rs.getString(1));
            }
            st.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
