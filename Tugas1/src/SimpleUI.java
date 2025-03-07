import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleUI {
    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("Aplikasi UI Sederhana");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Membuat label
        JLabel label = new JLabel("Klik tombol untuk melihat pesan");
        frame.add(label);

        // Membuat tombol
        JButton button = new JButton("Klik Saya");
        frame.add(button);

        // Menambahkan event listener ke tombol
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Halo! saya belum mandi.");
            }
        });

        // Menampilkan frame
        frame.setVisible(true);
    }
}