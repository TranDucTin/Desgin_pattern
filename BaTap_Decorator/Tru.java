/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaTap_Decorator;

/**
 *
 * @author DELL
 */
public class Tru extends BieuThucDecorator{
    float toanHang;

    public Tru(float toanHang, BieuThuc bieuthuc) {
        super(bieuthuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bieuthuc.giaTri() - toanHang;
    }

    @Override
    public String bieuThuc() {
        return bieuthuc.bieuThuc() + "-" + toanHang;
    }
    
}
