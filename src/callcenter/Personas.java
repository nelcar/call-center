
package callcenter;

import java.util.ArrayList;


public class Personas {
    String primerNombre;
    String segundoNombre;
    int edad;
    String genero;
    String numberTelefono;
    String correo;
    ArrayList <Personas> conocidos;

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNumberTelefono() {
        return numberTelefono;
    }

    public void setNumberTelefono(String numberTelefono) {
        this.numberTelefono = numberTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Personas> getConocidos() {
        return conocidos;
    }

    public void setConocidos(ArrayList<Personas> conocidos) {
        this.conocidos = conocidos;
    }
}
