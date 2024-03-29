/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleprodutos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yuris
 */
public class DialogProdutos extends javax.swing.JDialog {
    
    static Connection con;

    /**
     * Creates new form DialogProdutos
     */
    public DialogProdutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        lblPrecoCusto = new javax.swing.JLabel();
        txtPrecoCusto = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        lblFornecedor = new javax.swing.JLabel();
        cbMarca = new javax.swing.JComboBox<>();
        lblVendedor = new javax.swing.JLabel();
        txtVendedor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblDadosProdutos = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtData1 = new javax.swing.JFormattedTextField();
        btnNovo = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblEstadoProduto = new javax.swing.JLabel();
        cbEstadoProduto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro dos produtos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Marca", "Vendedor", "Preço Unitário", "Quantidade", "Data", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaDados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, 630, 100));

        lblNome.setText("Nome do Produto:");
        getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        txtNome.setToolTipText("Digite o nome do produto");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 310, -1));

        lblCategoria.setText("Categoria do Produto:");
        getContentPane().add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Periféricos", "Componentes de Computador", "Televisores", "Projetores", "Cabos", "Ferramentas", " ", " " }));
        cbCategoria.setToolTipText("Escolha a categoria do produto");
        getContentPane().add(cbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 190, -1));

        lblPrecoCusto.setText("Preço Unitário");
        getContentPane().add(lblPrecoCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        txtPrecoCusto.setToolTipText("Informe o preço de custo");
        getContentPane().add(txtPrecoCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 150, -1));

        lblData.setText("Data:");
        getContentPane().add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        lblQuantidade.setText("Quantidade:");
        getContentPane().add(lblQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        txtQuantidade.setToolTipText("Informe a quantidade");
        getContentPane().add(txtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 150, -1));

        lblFornecedor.setText("Marca:");
        getContentPane().add(lblFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        cbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Intel", "Logitech", "Dell", "Asus", "Samsung" }));
        cbMarca.setToolTipText("Informe a marca");
        getContentPane().add(cbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 190, -1));

        lblVendedor.setText("Vendedor:");
        getContentPane().add(lblVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));
        getContentPane().add(txtVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 150, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        lblDescricao.setText("Descrição:");
        getContentPane().add(lblDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        txtDescricao.setToolTipText("Descrição do produto");
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 310, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 150, -1));

        lblEmail.setText("Email do Vendedor:");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        lblTelefone.setText("Telefone do Vendedor:");
        getContentPane().add(lblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));
        getContentPane().add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 150, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 142, 630, 10));

        lblDadosProdutos.setForeground(new java.awt.Color(0, 0, 255));
        lblDadosProdutos.setText("Dados Produto:");
        getContentPane().add(lblDadosProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 124, -1, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 322, 630, 10));

        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Dados do Fornecedor:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        lblCidade.setText("Cidade:");
        getContentPane().add(lblCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));
        getContentPane().add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 150, -1));

        txtData1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        getContentPane().add(txtData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 150, -1));

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controleprodutos/ícones/icons8-password-reset-24.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 100, -1));

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controleprodutos/ícones/icons8-save-close-24.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnIncluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 100, -1));

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controleprodutos/ícones/icons8-change-24.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 100, -1));

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controleprodutos/ícones/icons8-trash-can-24.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 100, -1));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controleprodutos/ícones/icons8-printer-maintenance-24.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 110, -1));

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controleprodutos/ícones/icons8-close-window-24.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, -1, -1));

        lblEstadoProduto.setText("Estado do produto:");
        getContentPane().add(lblEstadoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        cbEstadoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Novo", "Usado", "Conservado", "Antigo" }));
        getContentPane().add(cbEstadoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 190, -1));

        setSize(new java.awt.Dimension(670, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
        con = DriverManager.getConnection("jdbc:sqlite:dadosAlmoxarifado.db");
        mostrarDados();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        // TODO add your handling code here:
        if (validarCampos() == true) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO produtos (nome, descricao, categoria, marca, quantidade, data, precocusto, vendedor, email, telefone, cidade, estadoproduto) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            ps.setString(1, txtNome.getText());
            ps.setString(2, txtDescricao.getText());
            ps.setInt(3,cbCategoria.getSelectedIndex());
            ps.setInt(4, cbMarca.getSelectedIndex());
            ps.setInt(5, Integer.parseInt(txtQuantidade.getText()));
            ps.setString(6, txtData1.getText());        
            ps.setDouble(7, Double.parseDouble(txtPrecoCusto.getText()));
            ps.setString(8, txtVendedor.getText());
            ps.setString(9, txtEmail.getText());
            ps.setString(10, txtTelefone.getText());
            ps.setString(11, txtCidade.getText());
            ps.setInt(12,cbEstadoProduto.getSelectedIndex());
            
            ps.execute();
            ps.close();
            mostrarDados();
            
            JOptionPane.showMessageDialog(null, "Produto adicionado!");
            limparCampos();
        } catch (Exception e) {
            e.printStackTrace();
        }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        int linha = tabelaDados.getSelectedRow();
        if ( (validarCampos() == true) && (linha >= 0) ) {
            try {
            PreparedStatement ps = con.prepareStatement("UPDATE produtos SET nome=?, descricao=?, categoria=?, marca=?, quantidade=?, data=?, precocusto=?, vendedor=?, email=?, telefone=?, cidade=?, estadoproduto=? WHERE id=?");
 
            ps.setString(1, txtNome.getText());
            ps.setString(2, txtDescricao.getText());
            ps.setInt(3,cbCategoria.getSelectedIndex());
            ps.setInt(4, cbMarca.getSelectedIndex());
            ps.setInt(5, Integer.parseInt(txtQuantidade.getText()));
            ps.setString(6, txtData1.getText());        
            ps.setDouble(7, Double.parseDouble(txtPrecoCusto.getText()));
            ps.setString(8, txtVendedor.getText());
            ps.setString(9, txtEmail.getText());
            ps.setString(10, txtTelefone.getText());
            ps.setString(11, txtCidade.getText());
            ps.setInt(12,cbEstadoProduto.getSelectedIndex());
            
            ps.setString(13, tabelaDados.getValueAt(linha, 0).toString());
                    
            ps.execute();
            ps.close();
            mostrarDados();
            
            JOptionPane.showMessageDialog(null, "Produto alterado!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        } else { 
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados!");
        } 
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tabelaDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDadosMouseClicked
        // TODO add your handling code here:
        int linha = tabelaDados.getSelectedRow();
        if (linha >= 0){
            try {
                PreparedStatement ps = con.prepareStatement("SELECT * FROM produtos WHERE id=?");
                ps.setString(1, tabelaDados.getValueAt(linha, 0).toString());
                ResultSet rs = ps.executeQuery();
                
                String id = rs.getString("id");
                txtNome.setText(rs.getString("nome"));
                txtDescricao.setText(rs.getString("descricao"));
                cbCategoria.setSelectedIndex(rs.getInt("categoria"));
                cbEstadoProduto.setSelectedIndex(rs.getInt("estadoproduto"));
                cbMarca.setSelectedIndex(rs.getInt("marca"));
                txtQuantidade.setText(rs.getString("quantidade"));
                txtData1.setText(rs.getString("data"));
                txtPrecoCusto.setText(rs.getString("precocusto"));
                txtVendedor.setText(rs.getString("vendedor"));
                txtEmail.setText(rs.getString("email"));
                txtTelefone.setText(rs.getString("telefone"));
                txtCidade.setText(rs.getString("cidade"));
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_tabelaDadosMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        int linha = tabelaDados.getSelectedRow();
        if (linha >= 0) {
            if (JOptionPane.showConfirmDialog(null, "Deseja excluir o(s) produtos(s) selecionado(s)?", "Excluir", JOptionPane.YES_NO_OPTION) == 0){
                try {
                    PreparedStatement ps = con.prepareStatement("DELETE FROM produtos WHERE id=?");
                    ps.setString(1, tabelaDados.getValueAt(linha, 0).toString());
                    ps.execute();
                    ps.close();
                    mostrarDados();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        try {
        tabelaDados.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DialogProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogProdutos dialog = new DialogProdutos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    private void limparCampos() { 
        txtNome.setText("");
        txtDescricao.setText("");
        cbCategoria.setSelectedIndex(-1);
        cbEstadoProduto.setSelectedIndex(-1);
        cbMarca.setSelectedIndex(-1);
        txtQuantidade.setText("");
        txtData1.setText("");
        txtPrecoCusto.setText("");
        txtVendedor.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        txtCidade.setText("");
        txtNome.grabFocus();
    }
    
    private boolean validarCampos() {
        if ((txtNome.getText().trim().length() == 0)||
                (txtDescricao.getText().trim().length() == 0) ||
                (cbCategoria.getSelectedIndex() < 0) ||
                (cbEstadoProduto.getSelectedIndex() < 0) ||
                (cbMarca.getSelectedIndex() < 0) ||
                (txtQuantidade.getText().trim().length() == 0) ||
                (txtData1.getText().trim().length() == 0) ||
                (txtPrecoCusto.getText().trim().length() == 0) ||
                (txtVendedor.getText().trim().length() == 0) ||
                (txtCidade.getText().trim().length() == 0)) {
            return false;
        }
        
        try{
            double custo = Double.parseDouble(txtPrecoCusto.getText());
            int qtde = Integer.parseInt(txtQuantidade.getText());
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    private void mostrarDados() {
        DecimalFormat df = new DecimalFormat("0.00");
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM produtos");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tabelaDados.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                Object linha[] = {rs.getString("id"), rs.getString("nome"), 
                                  cbMarca.getItemAt(rs.getInt("marca")), rs.getString("vendedor"),
                                  df.format(rs.getDouble("precocusto")), rs.getString("quantidade"),
                                  rs.getString("data"), cbEstadoProduto.getItemAt(rs.getInt("estadoproduto"))};
                model.addRow(linha);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String getNomeMarca(int idMarca) {
        return cbMarca.getItemAt(idMarca);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbEstadoProduto;
    private javax.swing.JComboBox<String> cbMarca;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblDadosProdutos;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstadoProduto;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPrecoCusto;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblVendedor;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtData1;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPrecoCusto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables
}
