# navesEspaciales
Hola, este es mi proyecto de naves espaciales.
La única instrucción que hay que tener en cuenta, es la ubicación de mi base de datos, por lo que simplemente se copia la ruta completa 
de mi base de datos en archivo Conexion.java de esta manera:

```
package javaapplication1.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    public static Connection conectar() throws Exception{
        Connection con = null;
        con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\yolve\\OneDrive\\Documentos\\NetBeansProjects\\JavaApplication1\\src\\javaapplication1\\Conexion\\BaseNaves.db");
        return con;
    }
}
```

Espero disfrutes de este pequeño programa.
Autor: Yolver Jiménez Ibáñez
