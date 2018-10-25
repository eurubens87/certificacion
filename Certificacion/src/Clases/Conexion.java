
package Clases;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Rubens
 */
public class Conexion {
    
    Connection con = null;
    public static String driver = "com.mysql.jdbc.Driver";
    public static String path = "jdbc:mysql://localhost:3306/111mil?autoReconnect=true&useSSL=false";
    public static String user = "root";
    public static String pass = "riverplate";
    
    public void conectar()
    {
        try
        {
            Class.forName(driver);
            con = DriverManager.getConnection(path, user, pass);
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(), "ERROR DE CONEXIÓN", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void desconectar()
    {
        try
        {
            con.close();
            con = null;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(), "NO EXISTE UNA CONEXIÓN ACTIVA", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean cargadato(boolean dato)
    {
        dato = true;
        return true;
    }
    
    public String[] informesC(String id) {
        String[] cursos = new String[10];
        int a = 1;
        String dato = "SELECT `cursos`.`Duracion`,\n" +
"    `cursos`.`Carga_horaria`,\n" +
"    `cursos`.`Informe`,\n" +
"    `cursos`.`Materia`,\n" +
"    `cursos`.`Profesor_DNI`,\n" +
"    `cursos`.`Aula_idAula`,\n" +
"    `cursos`.`fecha_ini`,\n" +
"    `cursos`.`fecha_fin`,\n" +
"    `cursos`.`habilitado`\n" +
"FROM `111mil`.`cursos` where `Informe`='no presentado' and `cursos`.`idCursos`=" + id + ";";
        try (Statement st = (Statement) con.createStatement()) {
            ResultSet rs = st.executeQuery(dato);
          
            while(rs.next())
            {
                cursos[a] = rs.getString(1);

                a = a+1;
            }
            st.close();
            return cursos;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return cursos;
    }
    
    public String[] obtenerdatosC() {
        String[] cursos = new String[10];
        int a = 1;
        String dato = "SELECT `cursos`.`idCursos` FROM `111mil`.`cursos` where `Informe`='no presentado';";
        try (Statement st = (Statement) con.createStatement()) {
            ResultSet rs = st.executeQuery(dato);
          
            while(rs.next())
            {
                cursos[1] = rs.getString(1);

                a = a+1;
            }
            st.close();
            return cursos;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return cursos;
    }
    
    public String[] obteneridC()
    {
        String[] cursos = new String[9];
        int a = 1;
        String dato = "SELECT `cursos`.`idCursos`\n" +
           "FROM `111mil`.`cursos` where `habilitado`='habilitado';";
        try(Statement st = (Statement)con.createStatement())
        {
            ResultSet rs = st.executeQuery(dato);
          
            while(rs.next())
            {
                cursos[a] = String.valueOf(rs.getInt(1));
            }
            st.close();
            return cursos;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return cursos;
    }
    
    public int cantidadCursos()
    {
        int a = 0;
        String dato = "SELECT `cursos`.`idCursos` FROM `111mil`.`cursos` where `habilitado`='habilitado';";
        try(Statement st = (Statement)con.createStatement())
        {
            ResultSet rs = st.executeQuery(dato);
          
            while(rs.next())
            {
                a = a+1;
            }
            st.close();
            return a;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return a;
    }
    
    public void actualizaC(String id)
    {
        String datos = "UPDATE `111mil`.`cursos` SET `habilitado` = 'deshabilitado' WHERE `idCursos` = " + id + ";";

        try {
            Statement st = (Statement) con.createStatement();
            st.executeUpdate(datos);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public String obtieneF(String id)
    {
        String fecha = "";
        String dato = "SELECT `cursos`.`fecha_fin` FROM `111mil`.`cursos` where `idCursos`='" + id + "';";
        try(Statement st = (Statement)con.createStatement())
        {
            ResultSet rs = st.executeQuery(dato);
          
            while(rs.next())
            {
                fecha = rs.getString(1);
            }
            st.close();
            return fecha;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return fecha;
    }
    
    public int cantalumnos(String auxiliar, String curso)
    {
        int a = 0;
        String dato = "SELECT `alumnos`.`DNI` FROM `111mil`.`alumnos` where `" + curso + "`='" + auxiliar + "';";
        try(Statement st = (Statement)con.createStatement())
        {
            ResultSet rs = st.executeQuery(dato);
          
            while(rs.next())
            {
                a = a+1;
            }
            st.close();
            return a;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return a;
    }
    
    public String obtenercupo(String materia)
    {
        String ver = "";
        String dato = "SELECT `cursos`.`Cupo` FROM `111mil`.`cursos` where `Materia`='" + materia + "' and `habilitado`='si';";
        try(Statement st = (Statement)con.createStatement())
        {
            ResultSet rs = st.executeQuery(dato);
            if(rs.next())
            {
                ver = rs.getString(1);
            }
            st.close();
            return ver;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return ver;
    }
    
    public String duracionC(String materia, String aux1)
    {
        String dato = "SELECT `cursos`.`Duracion` FROM `111mil`.`cursos` where `cursos`.`Materia`='" + materia + "';";
        try(Statement st = (Statement)con.createStatement())
        {
            ResultSet rs = st.executeQuery(dato);
            if(rs.next())
            {
                aux1 = rs.getString(1);
            }
            st.close();
            return aux1;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return aux1;
    }
    
    public String cargaC(String materia, String aux1)
    {
        String dato = "SELECT `cursos`.`Carga_horaria` FROM `111mil`.`cursos` where `cursos`.`Materia`='" + materia + "';";
        try(Statement st = (Statement)con.createStatement())
        {
            ResultSet rs = st.executeQuery(dato);
            if(rs.next())
            {
                aux1 = rs.getString(1);
            }
            st.close();
            return aux1;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return aux1;
    }
    
    public String aulaC(String materia, String aux1)
    {
        String dato = "SELECT `cursos`.`Aula_idAula` FROM `111mil`.`cursos` where `cursos`.`Materia`='" + materia + "';";
        try(Statement st = (Statement)con.createStatement())
        {
            ResultSet rs = st.executeQuery(dato);
            if(rs.next())
            {
                aux1 = rs.getString(1);
            }
            st.close();
            return aux1;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return aux1;
    } 
     
    public String fechaC(String materia, String aux1)
    {
        String dato = "SELECT `cursos`.`fecha_ini` FROM `111mil`.`cursos` where `cursos`.`Materia`='" + materia + "';";
        try(Statement st = (Statement)con.createStatement())
        {
            ResultSet rs = st.executeQuery(dato);
            if(rs.next())
            {
                aux1 = rs.getString(1);
            }
            st.close();
            return aux1;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return aux1;
    } 
    
    public String profeC(String materia, String aux1)
    {
        String dato = "SELECT `profesor`.`apellido`," + "\n" +
"`profesor`.`nombre`" + "\n" +
"FROM `111mil`.`cursos` join `111mil`.`profesor` on `cursos`.`Materia`='" + materia + "';";
        try(Statement st = (Statement)con.createStatement())
        {
            ResultSet rs = st.executeQuery(dato);
            if(rs.next())
            {
                aux1 = rs.getString(1) + ", " + rs.getString(2);
            }
            st.close();
            return aux1;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return aux1;
    } 
    
    public String dniP(String id)
    {
        String aux1 = "";
        String dato = "SELECT `cursos`.`Profesor_DNI`\n" +
"FROM `111mil`.`cursos` where `idCursos`=" + id + ";";
        try(Statement st = (Statement)con.createStatement())
        {
            ResultSet rs = st.executeQuery(dato);
            if(rs.next())
            {
                aux1 = rs.getString(1);
            }
            st.close();
            return aux1;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return aux1;
    } 
    
    public int obtenerid(String materia)
    {
        int fe = 0;
        String dato = "SELECT `cursos`.`idCursos` FROM `111mil`.`cursos` where `Materia`='" + materia + "' and `habilitado`='si';";
        try(Statement st = (Statement)con.createStatement())
        {
            ResultSet rs = st.executeQuery(dato);
            if(rs.next())
            {
                fe = rs.getInt(1);
            }
            st.close();
            return fe;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return fe;
    }
    
    public void cargarjoinAC(int idcurso, String idalumno, String nota, String inscrip, String estado)
    {
        String datos = "INSERT INTO `111mil`.`cursos_has_alumnos` (`Cursos_idCursos`,`Alumnos_DNI`,`Nota`,`Num_inscripcion`,`estado`) VALUES (" + idcurso + ",'" + idalumno + "','" + nota + "','" + inscrip + "','" + estado + "');";

        try
        {
            Statement st = (Statement)con.createStatement();
            st.executeUpdate(datos);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(), "", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actualizaP(String dni)
    {
        String datos = "UPDATE `111mil`.`profesor`\n" +
"SET\n" +
"`estado` = 'NO'\n" +
"WHERE `DNI` = '" + dni + "';";

        try
        {
            Statement st = (Statement)con.createStatement();
            st.executeUpdate(datos);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(), "", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //cargar datos de alumnos
    public void cargardatosA(String aux1, String aux2, String aux3, String aux4, String aux5, String aux6, String aux7, String aux8, String curso1, String curso2, String curso3, String mensaje)
    {
        String datos = "INSERT INTO `111mil`.`alumnos`(`DNI`,`Apellido`,`Nombre`,`Direccion`,`Telefono`,`Fecha_nacimiento`,`e_mail`,`Tutor`,`Curso1`,`Curso2`,`Curso3`) VALUES ('" + aux1 + "','" + aux2 + "','" + aux3 + "','" + aux4 + "','" + aux5 + "','" + aux6 + "','" + aux7 + "','" + aux8 + "','" + curso1 + "','" + curso2 + "','" + curso3 + "');";

        try
        {
            Statement st = (Statement)con.createStatement();
            st.executeUpdate(datos);
            
            if(curso2.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Alumno registrado correctamente al curso: " + curso1 + " con el número de inscripción: " + mensaje, "", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (curso3.equals("")) {
                    JOptionPane.showMessageDialog(null, "Alumno registrado correctamente a los cursos: " + curso1 + " y " + curso2 + " con el número de inscripción: " + mensaje, "", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Alumno registrado correctamente a los cursos: " + curso1 + ", " + curso2 + " y " + curso3 + " con el número de inscripción: " + mensaje, "", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(), "", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cargardatosCurso(String aux1, String aux2, String aux3, String aux4, String aux5, String aux6, String aux7, String aux8, String aux9, String aux10)
    {
        String datos = "INSERT INTO `111mil`.`cursos` (`Duracion`,`Carga_horaria`,`Cupo`,`Examen`,`Informe`,`Materia`,`Profesor_DNI`,`Aula_idAula`,`fecha_ini`,`fecha_fin`,`habilitado`) VALUES ('" + aux1 + "','" + aux2 + "','" + aux3 + "','" + aux4 + "','" + aux5 + "','" + aux6 + "','" + aux7 + "','" + aux8 + "','" + aux9 + "','" + aux10 + "','si');";

        try
        {
            Statement st = (Statement)con.createStatement();
            st.executeUpdate(datos);
            JOptionPane.showMessageDialog(null, "Curso registrado correctamente", "", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(), "", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void ocuparaula(int id) {
        String datos = "UPDATE `111mil`.`aula` SET `ocupado` = 'O' WHERE `idAula` = " + id + ";";

        try {
            Statement st = (Statement) con.createStatement();
            st.executeUpdate(datos);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void usardocente(String dni)
    {
        String datos = "UPDATE `111mil`.`profesor` SET `estado` = 'SI' WHERE `DNI` = '" + dni + "';";

        try
        {
            Statement st = (Statement)con.createStatement();
            st.executeUpdate(datos);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(), "", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cargardatosP(String aux1, String aux2, String aux3, String aux4, String aux5, String aux6, String aux7)
    {
        String datos = "INSERT INTO `111mil`.`profesor`(`DNI`,`Apellido`,`Nombre`,`Materia`,`direccion`,`telefono`,`email`,`estado`) VALUES ('" + aux1 + "','" + aux2 + "','" + aux3 + "','" + aux4 + "','" + aux5 + "','" + aux6 + "','" + aux7 + "','NO');";

        try
        {
            Statement st = (Statement)con.createStatement();
            st.executeUpdate(datos);
            JOptionPane.showMessageDialog(null, "Profesor registrado correctamente", "", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(), "", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    public boolean admin(String aux1, String aux2)
    {
        Boolean vr = false;
        String dato = "SELECT `administrador`.`Usuario`,\n" +
"    `administrador`.`pass`\n" +
"FROM `111mil`.`administrador` where `Usuario`='" + aux1 + "' and `pass`='" + aux2 + "';";
        try(Statement st = (Statement)con.createStatement())
        {
            
            ResultSet rs = st.executeQuery(dato);
            
            while(rs.next())
            {
                vr = true;
            }
            st.close();
            return vr;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return vr;  
    }
    
    public boolean buscarcurso(String aux)
    {
        Boolean vr = false;
        String dato = "SELECT `cursos`.`idCursos` FROM `111mil`.`cursos` where `Materia`='" + aux + "' and `habilitado`='si';";
        try(Statement st = (Statement)con.createStatement())
        {
            
            ResultSet rs = st.executeQuery(dato);
            
            while(rs.next())
            {
                vr = true;
            }
            st.close();
            return vr;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return vr;  
    }
    
    public boolean buscarP(String auxP)
    {
        Boolean vr = false;
        String dato = "SELECT * FROM 111mil.profesor;";
        try(Statement st = (Statement)con.createStatement())
        {
            
            ResultSet rs = st.executeQuery(dato);
            
            while(rs.next())
            {
                if(auxP.equals(rs.getString(1)))
                {
                    vr = true;
                }
            }
            st.close();
            return vr;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return vr;  
    }
    
    public boolean buscar(String aux)
    {
        Boolean vr = false;
        String dato = "SELECT * FROM 111mil.alumnos;";
        try(Statement st = (Statement)con.createStatement())
        {
            
            ResultSet rs = st.executeQuery(dato);
            
            while(rs.next())
            {
                if(aux.equals(rs.getString(1)))
                {
                    vr = true;
                }
            }
            st.close();
            return vr;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return vr; 
    }
    
}
