/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;


import Interfaz.VentanaInfo;
import javax.swing.JButton;
/**
 *
 * @author HP15DA0023LA
 */
public class Boton extends JButton{
    private String disquera;
    private String artista;
    private String album;
    private String noAlb;
    private String año;
    private String genero;
    private String pista;
    private String path;
    private String duracion;
    private String letraPista;
    private String enlaces;
    private String paginaDelArtista;
    private String paginaDeLaDisquera;
    private String otrasPaginas;
    private String TextoInformativo; 

    public Boton() 
    {
        super();
    }
    
    public void abrirInfo()
    {
        VentanaInfo v= new VentanaInfo();
    }
    public void DiferenciadorTags(String tag, byte[] contenido)
    {
        if("TPUB".equals(tag))
        {
            this.setDisquera(contenido);
        }
        else if("TPE1".equals(tag))
        {
            this.setArtista(contenido);
        }
        else if("TALB".equals(tag))
        {
            this.setAlbum(contenido);
        }
        else if("TPOS".equals(tag))
        {
            this.setNoAlb(contenido);
        }
        else if("TDRC".equals(tag))
        {
            this.setAño(contenido);
        }
        else if("TCON".equals(tag))
        {
            this.setGenero(contenido);
        }
        else if("TIT2".equals(tag))
        {
            this.setPista(contenido);
        }
        else if("PATH".equals(tag))
        {
            this.setPath(contenido);
        }
        else if("TLEN".equals(tag))
        {
            this.setDuracion(contenido);
        }
        else if("TEXT".equals(tag))
        {
            this.setLetraPista(contenido);
        }
        else if("LINK".equals(tag))
        {
            this.setEnlaces(contenido);
        }
        else if("WOAR".equals(tag))
        {
            this.setPaginaDelArtista(contenido);
        }
        else if("WOAS".equals(tag))
        {
            this.setPaginaDeLaDisquera(contenido);
        }
        else if("WPUB".equals(tag))
        {
            this.setOtrasPaginas(contenido);
        }
        else if("TXXX".equals(tag))
        {
            this.setTextoInformativo(contenido);
        }
        
    }
    
    //setters

    public void setDisquera(byte[] contenido) {
        this.disquera=new String(contenido);
    }

    public void setArtista(byte[] contenido) {
        this.artista=new String(contenido);
    }

    public void setAlbum(byte[] contenido) {
        this.album=new String(contenido);
    }

    public void setNoAlb(byte[] contenido) {
        this.noAlb=new String(contenido);
    }

    public void setAño(byte[] contenido) {
       this.año=new String(contenido);
    }

    public void setGenero(byte[] contenido) {
        this.genero=new String(contenido);
    }

    public void setPista(byte[] contenido) {
        this.pista=new String(contenido);
    }

    public void setPath(byte[] contenido) {
        this.path=new String(contenido);
    }

    public void setDuracion(byte[] contenido) {
       this.duracion=new String(contenido);
    }

    public void setLetraPista(byte[] contenido) {
        this.letraPista=new String(contenido);
    }

    public void setEnlaces(byte[] contenido) {
        this.enlaces=new String(contenido);
    }

    public void setPaginaDelArtista(byte[] contenido) {
       this.paginaDelArtista=new String(contenido);
    }

    public void setPaginaDeLaDisquera(byte[] contenido) {
       this.paginaDeLaDisquera=new String(contenido);
    }

    public void setOtrasPaginas(byte[] contenido) {
       this.otrasPaginas=new String(contenido);
    }

    public void setTextoInformativo(byte[] contenido) {
       this.TextoInformativo=new String(contenido);
    }

    //getters
    public String getDisquera() {
        return disquera;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public String getNoAlb() {
        return noAlb;
    }

    public String getAño() {
        return año;
    }

    public String getGenero() {
        return genero;
    }

    public String getPista() {
        return pista;
    }

    public String getPath() {
        return path;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getLetraPista() {
        return letraPista;
    }

    public String getEnlaces() {
        return enlaces;
    }

    public String getPaginaDelArtista() {
        return paginaDelArtista;
    }

    public String getPaginaDeLaDisquera() {
        return paginaDeLaDisquera;
    }

    public String getOtrasPaginas() {
        return otrasPaginas;
    }

    public String getTextoInformativo() {
        return TextoInformativo;
    }
}
