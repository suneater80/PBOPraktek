// PERBAIKAN 1: Menambahkan 'package'
package week;

// Import library yang kita butuhkan
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.WindowConstants; // PERBAIKAN 4: Import baru

/**
 * Kelas utama aplikasi POS (Point of Sale).
 * Membuat seluruh GUI dan menangani logika tombol.
 * (Versi Clean Code - SonarLint Fixed)
 */
public class POSApp extends JFrame implements ActionListener {

    // --- KOMPONEN KIRI ---
    private JTable productTable;
    private JSpinner quantitySpinner;
    private JButton addToCartButton;

    // --- KOMPONEN KANAN ---
    // PERBAIKAN 2: 'cartTable' dihapus dari sini
    private JLabel totalLabel;
    private JLabel pointsLabel;
    private JButton checkoutButton;
    private JButton printButton;
    private JTextArea receiptArea;

    // --- MODEL TABEL ---
    private DefaultTableModel cartModel;
    private DefaultTableModel productModel;

    // --- FORMATTER ---
    private NumberFormat currencyFormatter;

    // Konstruktor
    public POSApp() {
        // --- Inisialisasi Formatter Mata Uang ---
        // PERBAIKAN 3: Menggunakan Locale.Builder
        currencyFormatter = NumberFormat.getCurrencyInstance(new Locale.Builder().setLanguage("id").setRegion("ID").build());

        // 1. Pengaturan dasar Jendela
        setTitle("Point of Sale");
        setSize(900, 650);
        // PERBAIKAN 4: Menggunakan WindowConstants
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 2. Membuat Menu Bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);

        // 3. Membuat Panel Pembagi (Kiri dan Kanan)
        JSplitPane mainSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        mainSplitPane.setResizeWeight(0.45);

        // 4. Panel kiri
        mainSplitPane.setLeftComponent(createLeftPanel());

        // 5. Panel kanan
        mainSplitPane.setRightComponent(createRightPanel());

        // 6. Tambahkan pembagi utama ke Jendela
        add(mainSplitPane);
    }

    // --- METHOD PEMBUAT PANEL KIRI ---
    private Component createLeftPanel() {
        // ... (Tidak ada perubahan di method ini) ...
        JPanel leftPanel = new JPanel(new BorderLayout(5, 5));

        String[] productCols = {"ID", "Nama Produk", "Harga (Rp)"};
        Object[][] productData = {
                {"P001", "Air Mineral 600ml", 3000},
                {"P002", "Kopi Sachet", 5000},
                {"P003", "Roti isi", 8000},
                {"P004", "Snack Keripik", 6000},
                {"P005", "Minuman Botol", 12000}
        };

        productModel = new DefaultTableModel(productData, productCols) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        productTable = new JTable(productModel);
        JScrollPane productScrollPane = new JScrollPane(productTable);
        productScrollPane.setBorder(new TitledBorder("Produk"));
        leftPanel.add(productScrollPane, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new BorderLayout());
        controlPanel.add(new JLabel("Pilih produk dari tabel di kiri"), BorderLayout.NORTH);

        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        inputPanel.add(new JLabel("Qty:"));
        quantitySpinner = new JSpinner(new SpinnerNumberModel(1, 1, 99, 1));
        quantitySpinner.setPreferredSize(new Dimension(60, 25));
        inputPanel.add(quantitySpinner);
        addToCartButton = new JButton("Add to Cart");
        
        addToCartButton.addActionListener(this); 
        
        inputPanel.add(addToCartButton);

        controlPanel.add(inputPanel, BorderLayout.CENTER);
        leftPanel.add(controlPanel, BorderLayout.SOUTH);

        return leftPanel;
    }

    // --- METHOD PEMBUAT PANEL KANAN ---
    private Component createRightPanel() {
        JSplitPane rightSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        rightSplitPane.setResizeWeight(0.5);
        rightSplitPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        // 1. Bagian ATAS: Tabel Keranjang
        String[] cartCols = {"ID", "Nama Produk", "Qty", "Harga", "Subtotal"};
        cartModel = new DefaultTableModel(cartCols, 0); 
        
        // PERBAIKAN 2: 'cartTable' dideklarasikan sebagai variabel lokal
        JTable cartTable = new JTable(cartModel);

        JScrollPane cartScrollPane = new JScrollPane(cartTable);
        cartScrollPane.setBorder(new TitledBorder("Keranjang"));
        rightSplitPane.setTopComponent(cartScrollPane);

        // 2. Bagian BAWAH: Total dan Struk
        JPanel bottomRightPanel = new JPanel(new BorderLayout(5, 5));

        // 2a. Panel Checkout
        JPanel checkoutPanel = new JPanel();
        checkoutPanel.setLayout(new BoxLayout(checkoutPanel, BoxLayout.Y_AXIS));
        
        totalLabel = new JLabel("Total: Rp0,00");
        totalLabel.setFont(new Font("Arial", Font.BOLD, 20));
        totalLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        pointsLabel = new JLabel("Points: 0");
        pointsLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        checkoutButton = new JButton("Checkout");
        printButton = new JButton("Cetak");

        checkoutButton.addActionListener(this);
        printButton.addActionListener(this);

        buttonPanel.add(checkoutButton);
        buttonPanel.add(printButton);
        buttonPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        checkoutPanel.add(totalLabel);
        checkoutPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        checkoutPanel.add(pointsLabel);
        checkoutPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        checkoutPanel.add(buttonPanel);

        bottomRightPanel.add(checkoutPanel, BorderLayout.NORTH);

        // 2b. Panel Struk
        JPanel receiptPanel = new JPanel(new BorderLayout());
        receiptPanel.add(new JLabel("Struk:"), BorderLayout.NORTH);
        
        receiptArea = new JTextArea();
        receiptArea.setEditable(false);
        receiptArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        
        JScrollPane receiptScrollPane = new JScrollPane(receiptArea);
        receiptPanel.add(receiptScrollPane, BorderLayout.CENTER);

        bottomRightPanel.add(receiptPanel, BorderLayout.CENTER);
        rightSplitPane.setBottomComponent(bottomRightPanel);

        return rightSplitPane;
    }

    // --- LOGIKA UTAMA ---
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addToCartButton) {
            actionAddToCart();
        } else if (e.getSource() == checkoutButton) {
            actionCheckout();
        } else if (e.getSource() == printButton) {
            actionPrint();
        }
    }

    private void actionAddToCart() {
        // ... (Tidak ada perubahan di method ini) ...
        int selectedRow = productTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Silakan pilih produk terlebih dahulu.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String id = (String) productModel.getValueAt(selectedRow, 0);
        String nama = (String) productModel.getValueAt(selectedRow, 1);
        int harga = (int) productModel.getValueAt(selectedRow, 2);
        int qty = (int) quantitySpinner.getValue();
        int subtotal = harga * qty;

        cartModel.addRow(new Object[]{id, nama, qty, harga, subtotal});
        quantitySpinner.setValue(1);
    }

    /**
     * Logika untuk tombol "Checkout".
     * (VERSI CLEAN CODE - PERBAIKAN 5 & 6)
     */
    private void actionCheckout() {
        int total = 0;
        
        // 1. Siapkan struk
        StringBuilder receipt = new StringBuilder();
        // PERBAIKAN 5 & 6: Menggunakan String.format() dengan %n
        receipt.append(String.format("===== POIN OFF-SALES =====%n"));
        receipt.append(String.format("Toko: Demo Toko%n%n"));
        receipt.append(String.format("%-5s %-15s %-3s %s%n", "ID", "Nama", "Qty", "Subtotal"));

        // 2. Hitung total dari semua item di keranjang
        for (int i = 0; i < cartModel.getRowCount(); i++) {
            String id = (String) cartModel.getValueAt(i, 0);
            String nama = (String) cartModel.getValueAt(i, 1);
            int qty = (int) cartModel.getValueAt(i, 2);
            int subtotal = (int) cartModel.getValueAt(i, 4);
            
            total += subtotal;
            
            // PERBAIKAN 5 & 6: Menggunakan %n
            receipt.append(String.format("%-5s %-15s %-3d %s%n", 
                           id, nama, qty, currencyFormatter.format(subtotal)));
        }

        // 3. Hitung poin
        int points = total / 1000;

        // 4. Update label
        totalLabel.setText("Total: " + currencyFormatter.format(total));
        pointsLabel.setText("Points: " + points);

        // 5. Tampilkan struk
        // PERBAIKAN 5 & 6: Menggunakan %n
        receipt.append(String.format("%nTOTAL:\t\t\t%s%n", currencyFormatter.format(total)));
        receipt.append(String.format("POINTS DIDAPAT: %d (1 point per Rp 1000)%n%n", points));
        receipt.append(String.format("Terima kasih! Silakan kunjungi kembali.%n"));
        
        receiptArea.setText(receipt.toString());
        
        // 6. Kosongkan keranjang
        cartModel.setRowCount(0);
    }

    private void actionPrint() {
        // ... (Tidak ada perubahan di method ini) ...
        try {
            if (receiptArea.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Struk masih kosong. Silakan Checkout terlebih dahulu.", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            receiptArea.print();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error saat mencoba mencetak: " + e.getMessage(), "Error Cetak", JOptionPane.ERROR_MESSAGE);
        }
    }

    // --- METHOD MAIN ---
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            POSApp frame = new POSApp();
            frame.setVisible(true);
        });
    }
}