/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP15DA0023LA
 */
public class Funciones {
    
    public boolean esMp3(String ruta)
    {
        try {
            RandomAccessFile archivo= new RandomAccessFile(ruta,"rw");
            byte[] identificador= new byte[3];
            archivo.read(identificador);
            String identiString= new String(identificador);
            if("ID3".equals(identiString))
            {
                archivo.close();
                return true;
            }
            archivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public Short ObtenerTag(String tag) //aquí es donde entra Tags.MarioRK
    {
        short posicion=-3;
        short regreso=-3;
        String tagN="";
        try {
            RandomAccessFile archivoOT= new RandomAccessFile("Tags.MarioRK","rw");
            posicion= archivoOT.readShort(); 
            while(posicion!=(-2))
            {
                byte[] tagB = new byte[4];
                archivoOT.read(tagB);
                tagN=new String(tagB);
                if(tag.equals(tagN))
                {
                    regreso=posicion;
                }
                posicion= archivoOT.readShort();               
            }
            archivoOT.close();    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return regreso;
    }
    public String TraducirTag(short posicion) //aquí entra TraductoTags.BryanB
    {
        String regreso="";
        try {
            RandomAccessFile traductor= new RandomAccessFile("TraductorTags.BryanBP","rw");
            traductor.seek(posicion);
            short tamaño= traductor.readShort();
            byte[] tagT = new byte[tamaño];
            traductor.read(tagT);
            regreso=new String(tagT);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return regreso;
    }
}
