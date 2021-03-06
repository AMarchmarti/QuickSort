package org.lasencinas;

public class Tarea {

    /* ---- Properties ---- */
    private int initPos = 0;
    private int finalPos = 0;


    /* ---- Constructor ---- */
    public Tarea(int initPos, int finalPos) {
        this.initPos = initPos;
        this.finalPos = finalPos;
    }


    /* ---- Getters ---- */
    public int getInitPos() {
        return initPos;
    }

    public int getFinalPos() {
        return finalPos;
    }


    /* ---- Setters ---- */
    public void setInitPos(int initPos) {
        this.initPos = initPos;
    }

    public void setFinalPos(int finalPos) {
        this.finalPos = finalPos;
    }
}
