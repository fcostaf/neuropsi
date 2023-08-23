package neuropsi;

import javax.swing.JFrame;
import neuropsi.view.telacadastropacientes;

public class Neuropsi {

    public static void main(String[] args) {
        telacadastropacientes t=new telacadastropacientes();
        t.setVisible(true);
        t.setSize(800,800);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
