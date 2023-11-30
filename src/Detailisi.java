import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Detailisi extends JFrame {
     
    public Detailisi(String catatan) {
        initComponents(catatan);
    }

    private void initComponents(String catatan) {
        detailTextArea = new JTextArea();
        detailTextArea.setText(catatan);
        detailTextArea.setEditable(false);
        
        JScrollPane scrollPane = new JScrollPane(detailTextArea);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        detailTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        detailTextArea.setColumns(20);
        detailTextArea.setRows(5);
        scrollPane.setViewportView(detailTextArea);

        getContentPane().add(scrollPane);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Detailisi("Contoh catatan harian").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea detailTextArea;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables

}

