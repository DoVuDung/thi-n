/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doancanhanjava;

import java.util.ArrayList;

/**
 *
 * @author anonymous
 */
public class DSSACH {

    ArrayList<SACH> sach;

    public DSSACH() {
        sach = new ArrayList<>();
    }

    public ArrayList<SACH> getSach() {
        return sach;
    }

    public void setSach(ArrayList<SACH> sach) {
        this.sach = sach;
    }

    public void them(SACH X) {
        sach.add(X);
    }

    public void xoa(int i) {

        sach.remove(i);

    }

    public void capnhat(int i, SACH X) {
        sach.set(i, X);
    }

    public void hienthi(SACH X) {
        sach.get(0);

    }
    public void tongTien(){
        
    }

    public SACH tim(String masach) {
        for (int i = 0; i < sach.size(); i++) {
            if (sach.get(i).masach.equalsIgnoreCase(masach)) {
                return sach.get(i);
            }
        }
        return null;
    }
     public int size(){
        return sach.size();
    }
     public SACH get(int i){
        return sach.get(i);
    }

}
