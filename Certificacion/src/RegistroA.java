
import Clases.Conexion;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.sql.Date;
import java.time.Instant;
import java.util.Calendar;
import javax.swing.JOptionPane;


public class RegistroA extends javax.swing.JFrame {

    public RegistroA() {
        initComponents();
    }
    
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
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(400, 10));
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro Alumnos");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("DNI: ");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellidos:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nombres:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Dirección:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Teléfono:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Fecha nacimiento:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("E-mail:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Tutor:");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Completar sólo en el caso que el alumno sea menor");

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

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Día:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Mes:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Año:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010" }));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Curso1:");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manualidades", "Literatura", "Dibujo", "Música", " " }));
        jComboBox5.setSelectedIndex(-1);
        jComboBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox5ItemStateChanged(evt);
            }
        });

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manualidades", "Literatura", "Dibujo", "Música" }));
        jComboBox6.setSelectedIndex(-1);
        jComboBox6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox6ItemStateChanged(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Curso2:");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manualidades", "Literatura", "Dibujo", "Música" }));
        jComboBox7.setSelectedIndex(-1);
        jComboBox7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox7ItemStateChanged(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Curso3:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6)
                            .addComponent(jTextField8)
                            .addComponent(jTextField9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 247, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox6, 0, 151, Short.MAX_VALUE)
                                    .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jButton2)
                .addGap(75, 75, 75)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(65, Short.MAX_VALUE))
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
    
    String valor1 = "";
    String valor2 = "";
    String valor3 = "";
    String valor4 = "";
    String valor5 = "";
    String valor6 = "";
    String valor7 = "";
    String valor8 = "";
    String valor9 = "";

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Registro de alumnos
        
         //DNI
         String au1 = jTextField2.getText();
         
         //Apellido
         String au2 = jTextField3.getText();
         
         //Nombre
         String au3 = jTextField4.getText();
         
         //Direccion
         String au4 = jTextField5.getText();
         
         //Telefono
         String au5 = jTextField6.getText();
         
         //Fecha de nacimiento
         String au6 = jComboBox1.getSelectedItem() + "/" + jComboBox2.getSelectedItem() + "/" + jComboBox3.getSelectedItem();
         
         //email
         String au7 = jTextField8.getText();
         
         //Tutor
         String au8 = jTextField9.getText();
         
         String curso1;
         String curso2;
         String curso3;
         
         try
         {
            curso1 = jComboBox5.getSelectedItem().toString(); 
         }
         catch(Exception e)
         {
            curso1 = "";      
         }

         try
         {
            curso2 = jComboBox6.getSelectedItem().toString(); 
         }
         catch(Exception e)
         {
            curso2 = "";      
         }
         
         try
         {
            curso3 = jComboBox7.getSelectedItem().toString(); 
         }
         catch(Exception e)
         {
            curso3 = "";      
         }
        
        String aux9;
        String aux10 = "";
        String aux11 = "";
        if(au1.length() > 0 && au2.length() > 0 && au3.length() > 0 && au4.length() > 0 & au5.length() > 0 && au6.length() > 3 && au7.length() > 0 && curso1.length() > 0)
        {
            if(au1.length() == 8)
            {
                if(isnumeric(au1) == true)
                {
                    Conexion nuevo = new Conexion();
                    nuevo.conectar();
                    boolean cargado = false;
                    String cupo1;
                    String cupo2;
                    String cupo3;

                    if (nuevo.buscar(au1) == false) {
                        int a = Integer.parseInt(jComboBox3.getSelectedItem().toString());
                        Calendar fecha = Calendar.getInstance();
                        int b = fecha.get(Calendar.YEAR);
                        int c = b - a;
                        if (c > 18) {
                            if (nuevo.buscarcurso(curso1) == true) {
                                cupo1 = nuevo.obtenercupo(curso1);
                                int r1 = nuevo.cantalumnos(curso1, "curso1");
                                int u = nuevo.cantalumnos(curso1, "curso2");
                                int n = nuevo.cantalumnos(curso1, "curso3");
                                int r = r1+u+n;
                                int h = Integer.parseInt(cupo1);
                                if (r > h) {
                                    aux9 = "En espera";
                                    JOptionPane.showMessageDialog(null, "No hay cupo disponible para el curso " + curso1 + ", pero el alumno fue registrado y debe ser convocado en caso de alguna baja de alumnos");
                                } else {
                                    aux9 = "registrado";
                                }
                                
                                //jLabel17.setText("Curso " + curso1 + ": Duración: " + valor1 + " meses|" + "Carga horaria: " + valor2 + "hs/semanales|" + "Aula: " + valor3 + "| " + "Inicio: " + valor4 + "| " + "Profesor: " + valor5 + ", " + valor6 + "| Cupo: " + valor7);
                                int novo = nuevo.obtenerid(curso1);
                                String mensaje = String.valueOf(novo) + au1;
                                nuevo.cargardatosA(au1, au2, au3, au4, au5, au6, au7, au8, curso1, curso2, curso3, mensaje);

                                nuevo.cargarjoinAC(novo, au1, null, mensaje, aux9);

                                if (curso2.length() != 0) {
                                    if (nuevo.buscarcurso(curso2) == true) {
                                        int novo2 = nuevo.obtenerid(curso2);

                                        cupo2 = nuevo.obtenercupo(curso2);
                                        int g = nuevo.cantalumnos(curso2, "curso1");
                                        int g1 = nuevo.cantalumnos(curso2, "curso2");
                                        int g2 = nuevo.cantalumnos(curso2, "curso3");
                                        int t = Integer.parseInt(cupo2);
                                        int g3 = g+g1+g2;
                                        if (g3 > t) {
                                            aux10 = "En espera";
                                            JOptionPane.showMessageDialog(null, "No hay cupo disponible para el curso " + curso2 + ", pero el alumno fue registrado y debe ser convocado en caso de alguna baja de alumnos");
                                        } else {
                                            aux10 = "registrado";
                                        }

                                        nuevo.cargarjoinAC(novo2, au1, null, mensaje, aux10);
                                        
                                        //jLabel17.setText("Curso " + curso2 + ": Duración: " + valor1 + " meses|" + "Carga horaria: " + valor2 + "hs/semanales|" + "Aula: " + valor3 + "| " + "Inicio: " + valor4 + "| " + "Profesor: " + valor5 + ", " + valor6 + "| Cupo: " + valor7);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "El curso " + curso2 + " aún no fue gestionado", "CUIDADO", JOptionPane.INFORMATION_MESSAGE);
                                    }

                                }
                                
                                if (curso3.length() != 0) {
                                    if (nuevo.buscarcurso(curso3) == true) {
                                        int novo3 = nuevo.obtenerid(curso3);

                                        cupo3 = nuevo.obtenercupo(curso3);
                                        int g = nuevo.cantalumnos(curso3, "curso1");
                                        int g1 = nuevo.cantalumnos(curso3, "curso2");
                                        int g2 = nuevo.cantalumnos(curso3, "curso3");

                                        int t = Integer.parseInt(cupo3);
                                        int r2 = g+g1+g2;
                                        if (r2 > t) {
                                            aux11 = "En espera";
                                            JOptionPane.showMessageDialog(null, "No hay cupo disponible para el curso " + curso3 + ", pero el alumno fue registrado y debe ser convocado en caso de alguna baja de alumnos");
                                        } else {
                                            aux11 = "registrado";
                                        }

                                        nuevo.cargarjoinAC(novo3, au1, null, mensaje, aux11);
                                        
                                        //jLabel17.setText("Curso " + curso3 + ": Duración: " + valor1 + " meses|" + "Carga horaria: " + valor2 + "hs/semanales|" + "Aula: " + valor3 + "| " + "Inicio: " + valor4 + "| " + "Profesor: " + valor5 + ", " + valor6 + "| Cupo: " + valor7);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "El curso " + curso3 + " aún no fue gestionado", "CUIDADO", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }

                                if (nuevo.cargadato(cargado) == true) {
                                    Form1 main = new Form1();
                                    main.setVisible(true);
                                    this.dispose();
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "El curso " + curso1 + " aún no fue gestionado", "CUIDADO", JOptionPane.INFORMATION_MESSAGE);
                            }

                        } else {
                            if (au8.length() == 0) {
                                JOptionPane.showMessageDialog(null, "Debe ingresar nombre y apellido del tutor ya que el alumno es menor", "OBSERVACIÓN", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                if (nuevo.buscarcurso(curso1) == true) {
                                    cupo1 = nuevo.obtenercupo(curso1);
                                    int r = nuevo.cantalumnos(curso1, "curso1");
                                    int g1 = nuevo.cantalumnos(curso1, "curso2");
                                    int g2 = nuevo.cantalumnos(curso1, "curso3");
                                    int r2 = r+g1+g2;
                                    int h = Integer.parseInt(cupo1);
                                    if (r2 > h) {
                                        aux9 = "En espera";
                                        JOptionPane.showMessageDialog(null, "No hay cupo disponible para el curso " + curso1 + ", pero el alumno fue registrado y debe ser convocado en caso de alguna baja de alumnos");
                                    } else {
                                        aux9 = "registrado";
                                    }

                                    int novo = nuevo.obtenerid(curso1);
                                    String mensaje = String.valueOf(novo) + au1;
                                    nuevo.cargardatosA(au1, au2, au3, au4, au5, au6, au7, au8, curso1, curso2, curso3, mensaje);
                                    

                                    nuevo.cargarjoinAC(novo, au1, null, mensaje, aux9);

                                    //jLabel17.setText("Curso " + curso1 + ": Duración: " + valor1 + " meses|" + "Carga horaria: " + valor2 + "hs/semanales|" + "Aula: " + valor3 + "| " + "Inicio: " + valor4 + "| " + "Profesor: " + valor5 + ", " + valor6 + "| Cupo: " + valor7);
                                    if (curso2.length() != 0) {
                                        if (nuevo.buscarcurso(curso2) == true) {
                                            int novo2 = nuevo.obtenerid(curso2);
                                            cupo2 = nuevo.obtenercupo(curso2);
                                            int g = nuevo.cantalumnos(curso2, "curso1");
                                            int g3 = nuevo.cantalumnos(curso2, "curso2");
                                            int g4 = nuevo.cantalumnos(curso2, "curso3");

                                            int t = Integer.parseInt(cupo2);
                                            int g5 = g+g3+g4;
                                            if (g5 > t) {
                                                aux10 = "En espera";
                                                JOptionPane.showMessageDialog(null, "No hay cupo disponible para el curso " + curso2 + ", pero el alumno fue registrado y debe ser convocado en caso de alguna baja de alumnos");
                                            } else {
                                                aux10 = "registrado";
                                            }
                                            nuevo.cargarjoinAC(novo2, au1, null, mensaje, aux10);
                                           
                                            //jLabel17.setText("Curso " + curso2 + ": Duración: " + valor1 + " meses|" + "Carga horaria: " + valor2 + "hs/semanales|" + "Aula: " + valor3 + "| " + "Inicio: " + valor4 + "| " + "Profesor: " + valor5 + ", " + valor6 + "| Cupo: " + valor7);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "El curso " + curso2 + " aún no fue gestionado", "CUIDADO", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    }
                                    if (curso3.length() != 0) {
                                        if (nuevo.buscarcurso(curso3) == true) {
                                            int novo3 = nuevo.obtenerid(curso3);
                                            cupo3 = nuevo.obtenercupo(curso3);
                                            int g = nuevo.cantalumnos(curso3, "curso1");
                                            int g5 = nuevo.cantalumnos(curso3, "curso2");
                                            int g6 = nuevo.cantalumnos(curso3, "curso3");

                                            int t = Integer.parseInt(cupo3);
                                            int g7 = g+g5+g6;
                                            if (g7 > t) {
                                                aux11 = "En espera";
                                                JOptionPane.showMessageDialog(null, "No hay cupo disponible para el curso " + curso3 + ", pero el alumno fue registrado y debe ser convocado en caso de alguna baja de alumnos");
                                            } else {
                                                aux11 = "registrado";
                                            }

                                            nuevo.cargarjoinAC(novo3, au1, null, mensaje, aux11);
                                            
                                        } else {
                                            JOptionPane.showMessageDialog(null, "El curso " + curso3 + " aún no fue gestionado", "CUIDADO", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    }

                                    if (nuevo.cargadato(cargado) == true) {
                                        Form1 main = new Form1();
                                        main.setVisible(true);
                                        this.dispose();
                                    }
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null, "El curso " + curso1 + " aún no fue gestionado", "CUIDADO", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        }
                    } else {
                        jTextField2.setForeground(Color.RED);
                        jTextField3.setForeground(Color.RED);
                        jTextField4.setForeground(Color.RED);
                        jTextField5.setForeground(Color.RED);
                        jTextField6.setForeground(Color.RED);
                        jTextField8.setForeground(Color.RED);
                        jTextField9.setForeground(Color.RED);
                        JOptionPane.showMessageDialog(null, "USUARIO YA REGISTRADO", "ESPERE...", JOptionPane.CLOSED_OPTION);
                    }
                    nuevo.desconectar();
                } else {
                    jTextField2.setForeground(Color.red);
                    JOptionPane.showMessageDialog(null, "El DNI debe ser un valor numérico sin puntos ni coma", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                jTextField2.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, "El número de DNI debe constar de 8 digítos", "OBSERVACIÓN", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos obligatorios", "OBSERVACIÓN", JOptionPane.ERROR_MESSAGE);
        }
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox5ItemStateChanged
        
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String curso1;
            Conexion nuevo = new Conexion();
            nuevo.conectar();

            curso1 = jComboBox5.getSelectedItem().toString();
            if (nuevo.buscarcurso(curso1) == true) {
                String cupo1 = nuevo.obtenercupo(curso1);
                int r = nuevo.cantalumnos(curso1, "curso1");
                int g1 = nuevo.cantalumnos(curso1, "curso2");
                int g2 = nuevo.cantalumnos(curso1, "curso3");
                int r2 = r+g1+g2;
                int h = Integer.parseInt(cupo1);
                if (r2 > h) {
                    valor6 = "SIN CUPO";
                    JOptionPane.showMessageDialog(null, "Puede registrarse y aguardar alguna baja");
                } else {
                    int disponible = h - r2;
                    valor6 = String.valueOf(disponible);
                }

                valor1 = nuevo.duracionC(curso1, valor1);
                valor2 = nuevo.cargaC(curso1, valor2);
                valor3 = nuevo.aulaC(curso1, valor3);
                valor4 = nuevo.fechaC(curso1, valor4);
                valor5 = nuevo.profeC(curso1, valor5);

                JOptionPane.showMessageDialog(null, "Curso " + curso1 + ": Duración: " + valor1 + " meses| " + "Carga horaria: " + valor2 + "hs/semanales| " + "Aula: " + valor3 + "| " + "Inicio: " + valor4 + "| " + "Profesor: " + valor5 + "| Cupo: " + valor6, "DETALLES", JOptionPane.INFORMATION_MESSAGE);
                nuevo.desconectar();
            } else {
                jComboBox5.setSelectedIndex(-1);
                JOptionPane.showMessageDialog(null, "El curso aún no fue gestionado", "CUIDADO", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jComboBox5ItemStateChanged

    private void jComboBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox6ItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if(jComboBox5.getSelectedIndex() == -1)
            {
                jComboBox6.setSelectedIndex(-1);
                JOptionPane.showMessageDialog(null, "Ingrese primer curso");
            }
            else
            {
                String curso1;
                Conexion nuevo = new Conexion();
                nuevo.conectar();
                curso1 = jComboBox6.getSelectedItem().toString();
                if(curso1.equals(jComboBox5.getSelectedItem().toString()))
                {
                    jComboBox6.setSelectedIndex(-1);
                    JOptionPane.showMessageDialog(null, "Curso ya ingresado");
                }
                else
                {
                    if (nuevo.buscarcurso(curso1) == true) {
                        String cupo1 = nuevo.obtenercupo(curso1);
                        int r = nuevo.cantalumnos(curso1, "curso1");
                        int g1 = nuevo.cantalumnos(curso1, "curso2");
                        int g2 = nuevo.cantalumnos(curso1, "curso3");
                        int r2 = r + g1 + g2;
                        int h = Integer.parseInt(cupo1);
                        if (r2 > h) {
                            valor6 = "SIN CUPO";
                            JOptionPane.showMessageDialog(null, "Puede registrarse y aguardar alguna baja");
                        } else {
                            int disponible = h - r2;
                            valor6 = String.valueOf(disponible);
                        }

                        valor1 = nuevo.duracionC(curso1, valor1);
                        valor2 = nuevo.cargaC(curso1, valor2);
                        valor3 = nuevo.aulaC(curso1, valor3);
                        valor4 = nuevo.fechaC(curso1, valor4);
                        valor5 = nuevo.profeC(curso1, valor5);

                        JOptionPane.showMessageDialog(null, "Curso " + curso1 + ": Duración: " + valor1 + " meses| " + "Carga horaria: " + valor2 + "hs/semanales| " + "Aula: " + valor3 + "| " + "Inicio: " + valor4 + "| " + "Profesor: " + valor5 + "| Cupo: " + valor6, "OBSERVACIÓN", JOptionPane.INFORMATION_MESSAGE);
                        nuevo.desconectar();
                    } else {
                        jComboBox6.setSelectedIndex(-1);
                        JOptionPane.showMessageDialog(null, "El curso aún no fue gestionado", "CUIDADO", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_jComboBox6ItemStateChanged

    private void jComboBox7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox7ItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if(jComboBox6.getSelectedIndex() == -1)
            {
                jComboBox7.setSelectedIndex(-1);
                JOptionPane.showMessageDialog(null, "Ingrese segundo curso");
            }
            else
            {
                String curso1;
                Conexion nuevo = new Conexion();
                nuevo.conectar();
                curso1 = jComboBox7.getSelectedItem().toString();
                if(curso1.equals(jComboBox6.getSelectedItem().toString()))
                {
                    jComboBox7.setSelectedIndex(-1);
                    JOptionPane.showMessageDialog(null, "Curso ya ingresado");
                }
                else if(curso1.equals(jComboBox5.getSelectedItem().toString()))
                {
                    jComboBox7.setSelectedIndex(-1);
                    JOptionPane.showMessageDialog(null, "Curso ya ingresado");
                }
                else
                {
                    if (nuevo.buscarcurso(curso1) == true) {
                        String cupo1 = nuevo.obtenercupo(curso1);
                        int r = nuevo.cantalumnos(curso1, "curso1");
                        int g1 = nuevo.cantalumnos(curso1, "curso2");
                        int g2 = nuevo.cantalumnos(curso1, "curso3");
                        int r2 = r + g1 + g2;
                        int h = Integer.parseInt(cupo1);
                        if (r2 > h) {
                            valor6 = "SIN CUPO";
                            JOptionPane.showMessageDialog(null, "Puede registrarse y aguardar alguna baja");
                        } else {
                            int disponible = h - r2;
                            valor6 = String.valueOf(disponible);
                        }

                        valor1 = nuevo.duracionC(curso1, valor1);
                        valor2 = nuevo.cargaC(curso1, valor2);
                        valor3 = nuevo.aulaC(curso1, valor3);
                        valor4 = nuevo.fechaC(curso1, valor4);
                        valor5 = nuevo.profeC(curso1, valor5);

                        JOptionPane.showMessageDialog(null, "Curso " + curso1 + ": Duración: " + valor1 + " meses| " + "Carga horaria: " + valor2 + "hs/semanales| " + "Aula: " + valor3 + "| " + "Inicio: " + valor4 + "| " + "Profesor: " + valor5 + "| Cupo: " + valor6, "OBSERVACIÓN", JOptionPane.INFORMATION_MESSAGE);
                        nuevo.desconectar();
                    } else {
                        jComboBox7.setSelectedIndex(-1);
                        JOptionPane.showMessageDialog(null, "El curso aún no fue gestionado", "CUIDADO", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_jComboBox7ItemStateChanged

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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
