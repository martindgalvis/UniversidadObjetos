/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author mdgalvis
 */
public class Curso {

    private int nrc;
    private Profesor profesor;

    public int getNrc() {
        return nrc;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        if (this.profesor == null) {
            this.profesor = profesor;
        }

    }

    public Curso(int nrc) {
        this.nrc = nrc;

    }

}
