/**
 
 ------------------------------------------------
|            ESTE ES EL CODIGO MAIN!!!|          |
 ------------------------------------------------ 
 
 */

package javaapplication1;
import static java.lang.String.valueOf;
import javaapplication1.Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.ResultSet;

public class NavesEspaciales {
    public static void insertar(String sql, String nombreNave, Integer tipoNave, Integer tipoCombustible, Double velocidad, Double potencia, Double peso){
            try {
                Connection con = Conexion.conectar();
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setString(1, nombreNave);
                ps.setInt(2, tipoNave);
                ps.setInt(3, tipoCombustible);
                ps.setDouble(4, velocidad);
                ps.setDouble(5, potencia);
                ps.setDouble(6, peso);
                
                ps.execute();

                con.close();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    
    public static void consultas(String sql, String nombreNave){
            try {
            Connection con = Conexion.conectar();
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombreNave);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                String nombre = rs.getString("nombre");
                Integer tipo = rs.getInt("tipo");
                Integer combust = rs.getInt("combustible");
                Double velocidad = rs.getDouble("velocidad");
                Double potencia = rs.getDouble("potencia");
                Double peso = rs.getDouble("peso");
                
                ps = con.prepareStatement("SELECT * FROM tiposNaves WHERE ID = " + valueOf(tipo));
                rs = ps.executeQuery();
                String tipoNave = rs.getString("nombre");
                Boolean orbita = rs.getBoolean("orbita");
                Integer pasajeros = rs.getInt("pasajeros");
                        
                ps = con.prepareStatement("SELECT * FROM combustibles WHERE ID = " + valueOf(combust));
                rs = ps.executeQuery();
                String nombreComb = rs.getString("nombreC");
                String tipoComb = rs.getString("tipo");
                String calidad = rs.getString("calidad");
                
                

                
                System.out.println("\nLa informacion de la nave es: ");
                System.out.println("Nombre: " + nombre);
                System.out.println("Tipo: " + tipoNave);
                
                System.out.println("Orbita: " + orbita);
                
                System.out.println("Capacidad de pasajeros: " + pasajeros);
                System.out.println("Velocidad: " + velocidad);
                System.out.println("Potencia: " + potencia);
                System.out.println("Peso: " + peso);
                
                System.out.println("Nombre de combustible: " + nombreComb);
                System.out.println("Tipo de combustible: " + tipoComb);
                System.out.println("Calidad de combustible: " + calidad);

            }

            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }

    public static void main(String[] args) {
        Scanner sc;
        String nombreNave;
        Integer tipoNave;
        Integer tipoCombust;
        Double velocidad;
        Double potencia;
        Double peso;
        
        Integer op = -1;
        
        sc = new Scanner(System.in);
        
        
        while(op != 0){
            System.out.println("\nBienvenido al programa para crear tu propia nave espacial!\n" +
"\n" +
" Escoge una de las siguientes opciones para empezar:\n" +
" 1 - Crear una nave desde cero.\n" +
" 2 - Verificar la informacion de una nave existente.\n" +
" 0 - Salir del sistema.");
            
            op = Integer.parseInt(sc.nextLine());
            
            if (op == 1){
                System.out.println("\nLos siguientes son los parametros para crear tu nave espacial personalizada.\n" +
"Para empezar debes ingresar el nombre que le vas a asignar a tu nave espacial.\n" +
"\n" +
"Por favor, ingresa el nombre a continuación:");
        
                nombreNave = sc.nextLine();

                System.out.println(""
+ "\nAhora, deberas ingresar el tipo de nave que deseas crear, selecciona una de las siguientes opciones:\n" +
"1 - Lanzadera.\n" +
"2 - No tripulada.\n" +
"3 - Tripulada"
                );

                tipoNave = Integer.parseInt(sc.nextLine());
                
                System.out.println("\nEl proximo dato es el tipo de combustible que usa. Para ello selecciona una de las siguientes opciones:\n" +
"0 - No combustible.\n" +
"1 - Queroseno.\n" +
"2 - Aerozina 50\n" +
"3 - NOH4+N2H4+He"
                                   
                                   );
                tipoCombust = Integer.parseInt(sc.nextLine());
               
                System.out.println("\nA continuación escriba la velocidad que lleva su nave espacial personaslizada: ");
                velocidad = Double.parseDouble(sc.nextLine());
                
                System.out.println("\nDe igual manera escriba la potencia de su nave: ");
                potencia = Double.parseDouble(sc.nextLine());
                
                System.out.println("\nFinalmente escriba el peso que tiene su nave espacial: ");
                peso = Double.parseDouble(sc.nextLine());
                
                switch (tipoNave) {
                    case 1:
                        {
                            Lanzadera naveUsuario = new Lanzadera(nombreNave, tipoNave, tipoCombust, velocidad, potencia, peso);
                            System.out.println("");
                            naveUsuario.crearNave();
                            String sql = "INSERT INTO inventarioNaves (nombre, tipo, combustible, velocidad, potencia, peso) VALUES (?,?,?,?,?,?)";
                            insertar(sql, nombreNave, tipoNave, tipoCombust, velocidad, potencia, peso);
                            naveUsuario.operacion();
                            break;
                        }
                    case 2:
                        {
                            NoTripulada naveUsuario = new NoTripulada(nombreNave, tipoNave, tipoCombust, velocidad, potencia, peso);
                            System.out.println("");
                            naveUsuario.crearNave();
                            String sql = "INSERT INTO inventarioNaves (nombre, tipo, combustible, velocidad, potencia, peso) VALUES (?,?,?,?,?,?)";
                            insertar(sql, nombreNave, tipoNave, tipoCombust, velocidad, potencia, peso);
                            naveUsuario.operacion();
                            break;
                        }
                    case 3:
                        {
                            Tripuladas naveUsuario = new Tripuladas(nombreNave, tipoNave, tipoCombust, velocidad, potencia, peso);
                            System.out.println("");
                            naveUsuario.crearNave();
                            String sql = "INSERT INTO inventarioNaves (nombre, tipo, combustible, velocidad, potencia, peso) VALUES (?,?,?,?,?,?)";
                            insertar(sql, nombreNave, tipoNave, tipoCombust, velocidad, potencia, peso);
                            naveUsuario.operacion();
                            break;
                        }
                    default:
                        break;
                    
                }
            }
            
            else if (op == 2){
                System.out.println("\nPara hacer la consulta de la nave por favor ingrese el nombre de la misma: ");
                
                String buscar = sc.nextLine();
                        
                String sql = "SELECT * FROM inventarioNaves WHERE nombre = ?";
                consultas(sql, buscar);
                                
            }
            
            else if (op == 0){
                System.out.println("\n EL PROGRAMA HA FINALIZADO, VUELVA PRONTO.");
            }
        }
        
    }
}
