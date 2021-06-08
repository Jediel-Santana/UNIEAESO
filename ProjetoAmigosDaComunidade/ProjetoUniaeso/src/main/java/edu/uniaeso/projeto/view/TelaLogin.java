/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniaeso.projeto.view;

import edu.uniaeso.projeto.dao.LoginDAO;
import edu.uniaeso.projeto.exceptions.NaoEncontrado;
import edu.uniaeso.projeto.embutiveis.Contato;
import edu.uniaeso.projeto.modelo.Login;
import edu.uniaeso.projeto.embutiveis.Sexo;
import edu.uniaeso.projeto.modelo.Usuario;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;


public class TelaLogin extends javax.swing.JDialog {

 
    
    private static DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private boolean autorizado = false;
    private Usuario usuarioLogado = null;
    
    public TelaLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.addMetodoAoFechar();
        this.setResizable(false);
        initComponents();
        centreWindow(this);
        //this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);      
        this.setVisible(true);   
        setEditableAll();
       // iconeTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/main/resources/Imagens/logo.png")));
        
    }
    
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        botaoCadastrarUsuario = new javax.swing.JButton();
        botaoEntrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textLogin = new javax.swing.JTextField();
        iconeTelaPrincipal = new javax.swing.JLabel();
        textSenha = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeCadastro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCPFCadastro = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDataDeNascimentoCadastro = new javax.swing.JFormattedTextField();
        comboSexoCadastro = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTelefoneCadastro = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtEmailCadastro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSenhaCadastro = new javax.swing.JPasswordField();
        txtConfirmarSenhaCadastro = new javax.swing.JPasswordField();

        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        botaoCadastrarUsuario.setText("Cadastrar usuario");
        botaoCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarUsuarioActionPerformed(evt);
            }
        });

        botaoEntrar.setText("Entrar");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Senha");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Login");

        textLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLoginActionPerformed(evt);
            }
        });

        iconeTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/uniaeso/projeto/imagens/logo.png"))); // NOI18N

        textSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSenhaActionPerformed(evt);
            }
        });
        textSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textSenhaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(textLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botaoCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(iconeTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(iconeTelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(botaoCadastrarUsuario)
                .addGap(63, 63, 63))
        );

        jPanel1.add(jPanel2, "telaLogin");

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setForeground(new java.awt.Color(102, 204, 255));

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel3.setText("Cadastrar Usu�rio");

        jLabel4.setText("Nome");

        txtNomeCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCadastroActionPerformed(evt);
            }
        });

        jLabel5.setText("CPF");

        try {
            txtCPFCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFCadastroActionPerformed(evt);
            }
        });

        jLabel6.setText("Data de nascimento");

        try {
            txtDataDeNascimentoCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataDeNascimentoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataDeNascimentoCadastroActionPerformed(evt);
            }
        });

        comboSexoCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", "Indefinido" }));

        jLabel7.setText("Sexo");

        jLabel8.setText("Telefone");

        try {
            txtTelefoneCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton3.setText("Cadastrar");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("voltar");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setText("Email");

        txtEmailCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailCadastroActionPerformed(evt);
            }
        });

        jLabel10.setText("Senha");

        jLabel11.setText("Confirmar senha");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(txtTelefoneCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(txtSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(txtConfirmarSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmailCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(104, 104, 104)
                                .addComponent(jLabel11))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel7))
                            .addComponent(txtCPFCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtDataDeNascimentoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(comboSexoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(txtCPFCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataDeNascimentoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSexoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(2, 2, 2)
                .addComponent(txtTelefoneCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(3, 3, 3)
                .addComponent(txtEmailCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfirmarSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, "telaCadastro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarUsuarioActionPerformed

        CardLayout cl = (CardLayout) jPanel1.getLayout();
        cl.show(jPanel1, "telaCadastro");

    }//GEN-LAST:event_botaoCadastrarUsuarioActionPerformed
    
    private void addMetodoAoFechar(){
        
        this.addWindowListener(new WindowAdapter(){
            
            
            @Override
            public void windowClosing(WindowEvent e) {
                TelaPrincipal.getEm().close();
                System.out.println("tela login closing");
                System.exit(0);
            }
            
    });
        
        
    }
    
    
    
    
    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        
        String login = textLogin.getText();
        char[] senha = textSenha.getPassword();
        
        String senhaString = new String(senha);
        
        if(login.trim().isEmpty() || senhaString.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "INSIRA O LOGIN E A SENHA", "EM BRANCO", 2);
            return;
        }
        
        try{
            
            Usuario usuario = checkLogin(login, senhaString);
            if(usuario != null){
                usuarioLogado = usuario;
                textLogin.setText("");
                textSenha.setText("");
                this.setAutorizado(true);
                TelaPrincipal.setUsuarioLogado(usuarioLogado);
                this.dispose();
        }
                   
        } catch(NaoEncontrado e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "N�O ENCONTRADO", 2);
        }
       
    }//GEN-LAST:event_botaoEntrarActionPerformed
    
    
    
    public boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }
    
    public boolean getAutorizado(){
        return this.autorizado;
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
    
    
    public static void centreWindow(Window frame) {
        frame.setSize(430, 620);
        
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
        
        
    }
    
    private Usuario checkLogin(String nome, String senha) throws NaoEncontrado{
        
        LoginDAO dao = TelaPrincipal.getLoginDAO();
        Usuario usuario = dao.existeLogin(nome, senha);
              
        return usuario;
    }
    
    
    private void txtNomeCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCadastroActionPerformed

    private void txtCPFCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFCadastroActionPerformed

    private void txtDataDeNascimentoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataDeNascimentoCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataDeNascimentoCadastroActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        CardLayout cl = (CardLayout) jPanel1.getLayout();
        cl.show(jPanel1, "telaLogin");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtEmailCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailCadastroActionPerformed

    private void textSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSenhaKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String login = textLogin.getText();
            char[] senha = textSenha.getPassword();
        
            try{
            
                Usuario usuario = checkLogin(login, new String(senha));
                if(usuario != null){
                    usuarioLogado = usuario;
                    textLogin.setText("");
                    textSenha.setText("");
                    this.setAutorizado(true);
                    TelaPrincipal.setUsuarioLogado(usuarioLogado);
                    this.dispose();
        }
                   
        } catch(NaoEncontrado e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "N�O ENCONTRADO", 1);
        }
       
        
        }
    }//GEN-LAST:event_textSenhaKeyPressed
    
    private void setEditableAll(){
        txtCPFCadastro.setEditable(true);
        txtDataDeNascimentoCadastro.setEditable(true);
        comboSexoCadastro.setEditable(true);
        txtTelefoneCadastro.setEditable(true);
        txtEmailCadastro.setEditable(true);
        txtSenhaCadastro.setEditable(true);
        txtConfirmarSenhaCadastro.setEditable(true);
    
    }
    private boolean cadastrado(String CPF){
        
       CPF = CPF.replace(".", "");
       CPF = CPF.replace("-", "");
       boolean isCadastrado = TelaPrincipal.getFachada().isUsuarioCadastrado(Long.valueOf(CPF));
       
       
       return isCadastrado;
      
    }
    
    private boolean isEmailCadastrado(String email){
        return TelaPrincipal.getLoginDAO().isEmailCadastrado(email);
    }
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        
        
        
        
        String nome = txtNomeCadastro.getText().trim();
        String CPF = txtCPFCadastro.getText().trim();
        String comboSexo = comboSexoCadastro.getSelectedItem().toString();
        String dataNascimento = txtDataDeNascimentoCadastro.getText().trim();
        String telefone = txtTelefoneCadastro.getText().trim();
        String email = txtEmailCadastro.getText().trim();
        
        String senha = new String(txtSenhaCadastro.getPassword());
        String confirmarSenha = new String(txtConfirmarSenhaCadastro.getPassword());
        
        
       
        LocalDate dataDeNascimentoFormatada = null;
        
        
        
       senha = senha.trim();
       confirmarSenha = confirmarSenha.trim();
        
        System.out.println(senha);
        System.out.println(confirmarSenha);
        
        if( nome.isEmpty() ||
            CPF.length() != 14 ||
            dataNascimento.length() != 10 ||
            comboSexo.equals("Selecione") ||
            telefone.length() != 15 ||
            email.isEmpty() ||
            senha.isEmpty() ||
            confirmarSenha.isEmpty() ){
            
            JOptionPane.showMessageDialog(this, "TODOS OS CAMPOS DEVEM SER PREENCHIDOS!", "PREENCHER TODOS OS CAMPOS", 2);
            
        } else{
            boolean cadastroAutorizado = true;
            
            if(cadastrado(CPF)){
                 JOptionPane.showMessageDialog(this, "CPF: " + CPF + " j� est� cadastrado!", "CPF CADASTRADO", 2);
                 cadastroAutorizado = false;
            }
            
            if(isEmailCadastrado(email)){
                JOptionPane.showMessageDialog(this, "Email: " + email + " j� est� cadastrado!", "EMAIL CADASTRADO", 2);
                cadastroAutorizado = false;
            }
            
            if(!senha.equals(confirmarSenha)){
                JOptionPane.showMessageDialog(this, "As senhas n�o coincidem!", "SENHA N�O COINCIDE", 2);
                cadastroAutorizado = false;
            }
            
            try{
               dataDeNascimentoFormatada = LocalDate.parse(dataNascimento, formatoData);
            } catch(DateTimeParseException | NullPointerException e){
               JOptionPane.showMessageDialog(this, "DATA DE NASCIMENTO INCORRETA!", "DATA DE NASCIMENTO INCORRETA", 2);
               cadastroAutorizado = false;
            }
            
            if(!dataIsValida(dataDeNascimentoFormatada)){
                JOptionPane.showMessageDialog(this, "DATA DE NASCIMENTO INCORRETA!", "DATA DE NASCIMENTO INCORRETA", 2);
                cadastroAutorizado = false;
            }
            
            
            if(cadastroAutorizado){
                //(String nome, Long cpf, LocalDate dataDeNascimento, Sexo sexo, Contato contato, Login login)
                
                String cpfFormatado = CPF.replace(".", "");
                cpfFormatado = cpfFormatado.replace("-", "");

                String telefoneFormatado = telefone.replace("(", "");
                telefoneFormatado = telefoneFormatado.replace(")", "");
                telefoneFormatado = telefoneFormatado.replace("-", "");
                telefoneFormatado = telefoneFormatado.replace(" ", ";");
                   
                
                
                String[] telefoneComDDD = telefoneFormatado.split(";");
                
                Integer DDD = Integer.valueOf(telefoneComDDD[0]);
                Long numero = Long.valueOf(telefoneComDDD[1]);
                
                System.out.println(DDD);
                System.out.println(numero);
                
                
                Sexo sexo = Sexo.valueOf(String.valueOf(comboSexo));
                Login login = new Login(email, senha);
                
                
                
                Contato contato = new Contato(DDD, numero);
                
                
                //int cadastro = JOptionPane.showConfirmDialog(this, "Desejar realizar o cadastro?" , "Confirmar cadastro",JOptionPane.YES_NO_OPTION);
                
                
                int confirmar = JOptionPane.showConfirmDialog(this, "Desejar realizar o cadastro?" , "Confirmar cadastro",JOptionPane.YES_NO_OPTION);
                
                if(confirmar == 0){
                    Usuario usuario = new Usuario(nome, Long.valueOf(cpfFormatado), dataDeNascimentoFormatada, sexo, contato, login);
                    
                    TelaPrincipal.getEm().getTransaction().begin();
                    TelaPrincipal.getFachada().cadastarUsuario(usuario);
                    TelaPrincipal.getEm().getTransaction().commit();
                    
                    JOptionPane.showMessageDialog(this, "CADASTRADO COM SUCESSO!");
                    limpaFormCadastro();
                }
                
            }
            
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private boolean dataIsValida(LocalDate data){
        
        int ano = data.getYear();
        
        if(ano >= 1950){
            return true;
        } else{
        return false;
        }
        
    }
    
    private void limpaFormCadastro(){
        txtNomeCadastro.setText("");
        txtCPFCadastro.setText("");
        txtDataDeNascimentoCadastro.setText("");
        comboSexoCadastro.setSelectedItem("Selecione");
        txtTelefoneCadastro.setText("");
        txtEmailCadastro.setText("");
        txtSenhaCadastro.setText("");
        txtConfirmarSenhaCadastro.setText("");
    }
    
    private Sexo verificaSexo(String sexo){
        
        if(sexo.equals("Feminino")){
            return Sexo.Feminino;
        }
        
        if(sexo.equals("Masculino")){
            return Sexo.Masculino;
        }
        
        if(sexo.equals("Indefinido")){
            return Sexo.Indefinido;
        }
        
        return null;
    }
    
    
    
    private void textSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSenhaActionPerformed

    private void textLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLoginActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaLogin dialog = new TelaLogin(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarUsuario;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JComboBox<String> comboSexoCadastro;
    private javax.swing.JLabel iconeTelaPrincipal;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField textLogin;
    private javax.swing.JPasswordField textSenha;
    private javax.swing.JFormattedTextField txtCPFCadastro;
    private javax.swing.JPasswordField txtConfirmarSenhaCadastro;
    private javax.swing.JFormattedTextField txtDataDeNascimentoCadastro;
    private javax.swing.JTextField txtEmailCadastro;
    private javax.swing.JTextField txtNomeCadastro;
    private javax.swing.JPasswordField txtSenhaCadastro;
    private javax.swing.JFormattedTextField txtTelefoneCadastro;
    // End of variables declaration//GEN-END:variables

    
}
