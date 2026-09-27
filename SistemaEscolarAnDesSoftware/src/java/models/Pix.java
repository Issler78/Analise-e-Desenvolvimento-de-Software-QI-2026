/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author issler
 */
public class Pix implements MetodoPagamento {
    String qr_code;

    public Pix(String qr_code) {
        this.qr_code = qr_code;
    }

    public Pix() {
    }

    public String getQr_code() {
        return qr_code;
    }

    public void setQr_code(String qr_code) {
        this.qr_code = qr_code;
    }
    
}
