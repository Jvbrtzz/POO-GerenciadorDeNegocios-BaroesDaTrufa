/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;
import Modelos.Comida;
import Estoque.ControleDeEstoque;
import Modelos.Bebida;
/**
 *
 * @author jonat
 */
public class MenuPrincipal extends javax.swing.JFrame {
     double cont;
     int dec;
     double total1;
     double total2;
     double total3;
     double total4;
     double total5;
     double total6;
     double total7;
     double total8;
     double totalGeral;
     
     Recibo recibo = new Recibo();
     Comida StrogonoffdeFrango =  new Comida("01", "SrogonoffFrango", 22.00);
     Comida StrogonoffdeCarne =  new Comida("02", "SrogonoffCarne", 25.00);
     Comida CarneAssada = new Comida("03", "Carne Assada", 27.00);
     Comida BifeComFritas = new Comida("04", "Bife com fritas", 25.00);
     Bebida RefrigeranteLata = new Bebida("05","Refrigerante Lata", 5.00);
     Bebida Refrigerante600 = new Bebida("06","Refrigerante 600ml", 8.00);
     Bebida SucoDaFruta = new Bebida("07","Suco da Fruta", 10.00);
     Bebida AguaMineral = new Bebida("08","Água Mineral", 3.00);
     ControleDeEstoque teste = new ControleDeEstoque();
    
    //ler de arquivo
    //classe só pra tratar aqruivos
    //ler comidas do arquivo
    //retornar listas de comida do arquivo 
    //atualizar quando fechar arquivo
     
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        
        teste.estoqueComida();
        jqtdProduto1.setVisible(false);
        jqtdProduto2.setVisible(false);
        jqtdProduto3.setVisible(false);
        jqtdProduto4.setVisible(false);
        jqtdProduto5.setVisible(false);
        jqtdProduto6.setVisible(false);
        jqtdProduto7.setVisible(false);
        jqtdProduto8.setVisible(false);
       
               
        }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jqtdProduto8 = new javax.swing.JComboBox<>();
        jCheckBox8 = new javax.swing.JCheckBox();
        jqtdProduto6 = new javax.swing.JComboBox<>();
        jCheckBox7 = new javax.swing.JCheckBox();
        jqtdProduto7 = new javax.swing.JComboBox<>();
        jCheckBox6 = new javax.swing.JCheckBox();
        jqtdProduto5 = new javax.swing.JComboBox<>();
        jCheckBox3 = new javax.swing.JCheckBox();
        jqtdProduto4 = new javax.swing.JComboBox<>();
        jCheckBox4 = new javax.swing.JCheckBox();
        jqtdProduto3 = new javax.swing.JComboBox<>();
        jCheckBox5 = new javax.swing.JCheckBox();
        jqtdProduto2 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jqtdProduto1 = new javax.swing.JComboBox<>();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTextField8 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jFerramentas = new javax.swing.JMenu();
        jFerramentaFinalizar = new javax.swing.JMenuItem();
        jFerramentasAtualizar = new javax.swing.JMenuItem();
        JFerramentasSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jqtdProduto8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jqtdProduto8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jqtdProduto8ActionPerformed(evt);
            }
        });
        getContentPane().add(jqtdProduto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 780, 200, 30));

        jCheckBox8.setFont(new java.awt.Font("Lobster 1.4", 0, 20)); // NOI18N
        jCheckBox8.setText("Água Mineral");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 780, 230, -1));

        jqtdProduto6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jqtdProduto6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jqtdProduto6ActionPerformed(evt);
            }
        });
        getContentPane().add(jqtdProduto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 430, 200, 30));

        jCheckBox7.setFont(new java.awt.Font("Lobster 1.4", 0, 20)); // NOI18N
        jCheckBox7.setText("Refrigerante 600ml");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 430, 230, -1));

        jqtdProduto7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jqtdProduto7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jqtdProduto7ActionPerformed(evt);
            }
        });
        getContentPane().add(jqtdProduto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 610, 200, 30));

        jCheckBox6.setFont(new java.awt.Font("Lobster 1.4", 0, 20)); // NOI18N
        jCheckBox6.setText("Suco da Fruta");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 610, 230, -1));

        jqtdProduto5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jqtdProduto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jqtdProduto5ActionPerformed(evt);
            }
        });
        getContentPane().add(jqtdProduto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 260, 200, 30));

        jCheckBox3.setFont(new java.awt.Font("Lobster 1.4", 0, 20)); // NOI18N
        jCheckBox3.setText("Refrigerante Lata");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, 230, -1));

        jqtdProduto4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jqtdProduto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jqtdProduto4ActionPerformed(evt);
            }
        });
        getContentPane().add(jqtdProduto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 780, 200, 30));

        jCheckBox4.setFont(new java.awt.Font("Lobster 1.4", 0, 20)); // NOI18N
        jCheckBox4.setText("Bife com batata Fritas");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 780, 230, -1));

        jqtdProduto3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jqtdProduto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jqtdProduto3ActionPerformed(evt);
            }
        });
        getContentPane().add(jqtdProduto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 200, 30));

        jCheckBox5.setFont(new java.awt.Font("Lobster 1.4", 0, 20)); // NOI18N
        jCheckBox5.setText("Carne Assada com Batata");
        jCheckBox5.setToolTipText("");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 260, -1));

        jqtdProduto2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jqtdProduto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jqtdProduto2ActionPerformed(evt);
            }
        });
        getContentPane().add(jqtdProduto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 200, 30));

        jCheckBox1.setFont(new java.awt.Font("Lobster 1.4", 0, 20)); // NOI18N
        jCheckBox1.setText("Strogonoff de Carne ");
        jCheckBox1.setActionCommand("Strogonoff de Carne R$,00");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 240, -1));

        jqtdProduto1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jqtdProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jqtdProduto1ActionPerformed(evt);
            }
        });
        getContentPane().add(jqtdProduto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 200, 30));

        jCheckBox2.setFont(new java.awt.Font("Lobster 1.4", 0, 20)); // NOI18N
        jCheckBox2.setText("Strogonoff de Frango");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 230, -1));

        jTextField8.setText("Água Mineral");
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 830, 530, 70));

        jTextField7.setText("Suco da Fruta(Morango, Maracuja, Uva e Abacaxi com Hortelã)");
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 660, 530, 70));

        jTextField6.setText("Refrigerante 600ml(Coca-Cola, Coca-Zero, Sprit,Fanta Uva e Fanta Laranja)");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 480, 530, 70));

        jTextField5.setText("Refrigerante Lata(Coca-Cola, Coca-Zero, Sprit,Fanta Uva e Fanta Laranja, Fanta guarana)");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, 530, 70));

        jTextField4.setText("Bife com Fritas, acompanhado de arroz e salada.");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 830, 530, 70));

        jTextField3.setText("Carne Assada acompanhada com batatas, uma porção de arroz, farofa ou salada.");
        jTextField3.setToolTipText("");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 530, 70));

        jTextField2.setText(" Strogonoff de Carne cremoso e cheio de sabo, acompanhado de uma porção de arroz e batata palha.");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 530, 70));

        jTextField1.setText("Strogonoff de Frango cremoso e cheio de sabo, acompanhado de uma porção de arroz e batata palha.");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 530, 70));

        jLabel19.setFont(new java.awt.Font("Lobster 1.4", 0, 20)); // NOI18N
        jLabel19.setText("R$3,00");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 900, 90, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/imagens/icons/Aguamineral.jpg"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 790, 190, 160));

        jLabel17.setFont(new java.awt.Font("Lobster 1.4", 0, 20)); // NOI18N
        jLabel17.setText("R$10,00");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 730, 90, 40));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/imagens/icons/Sucos.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 610, 200, 140));

        jLabel15.setFont(new java.awt.Font("Lobster 1.4", 0, 20)); // NOI18N
        jLabel15.setText("R$8,00");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 550, 90, 40));

        jLabel14.setFont(new java.awt.Font("Lobster 1.4", 0, 20)); // NOI18N
        jLabel14.setText("R$5,00");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 380, 90, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/imagens/icons/refrigerante.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 430, 200, 140));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/imagens/icons/bifecomfritas.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 780, 200, 140));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/imagens/icons/carneassadacombatata.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 600, 200, 140));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/imagens/icons/strogonoffdecarne.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 200, 140));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/imagens/icons/refrigeranteslata.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 280, 200, 140));

        jLabel8.setFont(new java.awt.Font("Lobster 1.4", 0, 20)); // NOI18N
        jLabel8.setText("R$25,00");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 900, 100, 40));

        jLabel7.setFont(new java.awt.Font("Lobster 1.4", 0, 20)); // NOI18N
        jLabel7.setText("R$22,00");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 90, 40));

        jLabel6.setFont(new java.awt.Font("Lobster 1.4", 0, 20)); // NOI18N
        jLabel6.setText("R$27,00");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 700, 100, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/imagens/icons/strogonoffdefrango.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 200, 140));

        jLabel4.setFont(new java.awt.Font("Lobster 1.4", 0, 20)); // NOI18N
        jLabel4.setText("R$25,00");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 100, 40));

        jLabel3.setFont(new java.awt.Font("Garbata Trial Black", 0, 48)); // NOI18N
        jLabel3.setText("Bebidas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, -1, 60));

        jLabel2.setFont(new java.awt.Font("Garbata Trial Black", 0, 48)); // NOI18N
        jLabel2.setText("Refeições");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/imagens/fundoMP-fina1l.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1920, 1020));

        jFerramentas.setText("Ferramentas");

        jFerramentaFinalizar.setText("Finalizar");
        jFerramentaFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFerramentaFinalizarActionPerformed(evt);
            }
        });
        jFerramentas.add(jFerramentaFinalizar);

        jFerramentasAtualizar.setText("Atualizar");
        jFerramentasAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFerramentasAtualizarActionPerformed(evt);
            }
        });
        jFerramentas.add(jFerramentasAtualizar);

        JFerramentasSair.setText("Sair");
        JFerramentasSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFerramentasSairActionPerformed(evt);
            }
        });
        jFerramentas.add(JFerramentasSair);

        jMenuBar1.add(jFerramentas);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
       if (jCheckBox1.isSelected()) {
             cont = cont += StrogonoffdeCarne.getValor(); 
             jqtdProduto2.setVisible(true);
             
            
        } else {
            jqtdProduto2.setVisible(false);
             cont = 0;
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
         if (jCheckBox2.isSelected()) {
             cont = cont += StrogonoffdeFrango.getValor();
             jqtdProduto1.setVisible(true);
            
             
             
            
        } else {
             jqtdProduto1.setVisible(false);
             cont = 0;
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
         if (jCheckBox4.isSelected()) {
             cont = cont += BifeComFritas.getValor();
             jqtdProduto4.setVisible(true);
             
             
        } else {
             jqtdProduto4.setVisible(false);
             cont = 0;
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
         if (jCheckBox5.isSelected()) {
             cont = cont += CarneAssada.getValor();
             jqtdProduto3.setVisible(true);
             
             
             
        } else {
             jqtdProduto3.setVisible(false);
             cont = 0;
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jFerramentaFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFerramentaFinalizarActionPerformed
                 
        recibo.setVisible(true);
       
        
        
         totalGeral = total1 + total2 + total3 + total4 + total5  + total6  + total7  + total8;
//         System.out.println(total1);
//         System.out.println(total2);
//         System.out.println(total3); 
//         System.out.println(total4);  
//         System.out.println(total5); 
//         System.out.println(total6); 
//         System.out.println(total7); 
//         System.out.println(total8); 
        
         System.out.println(totalGeral);

        
                      
              
    }//GEN-LAST:event_jFerramentaFinalizarActionPerformed

    private void jFerramentasAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFerramentasAtualizarActionPerformed
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        
        
        jqtdProduto1.setVisible(false);
        jqtdProduto2.setVisible(false);
        jqtdProduto3.setVisible(false);
        jqtdProduto4.setVisible(false);
        jqtdProduto5.setVisible(false);
        jqtdProduto6.setVisible(false);
        jqtdProduto7.setVisible(false);
        jqtdProduto8.setVisible(false);        
        
        total1 = 0;
        total2 = 0;
        total3 = 0;
        total4 = 0;
        total5 = 0;
        total6 = 0;
        total7 = 0;
        total8 = 0;
        
        cont = 0;
    }//GEN-LAST:event_jFerramentasAtualizarActionPerformed

    private void JFerramentasSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFerramentasSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JFerramentasSairActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if (jCheckBox3.isSelected()) {
             cont = cont += RefrigeranteLata.getValor();
             jqtdProduto5.setVisible(true);
             
             
        } else {
             jqtdProduto5.setVisible(false);
             cont = 0;
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        if (jCheckBox6.isSelected()) {
             cont = cont += SucoDaFruta.getValor();
             jqtdProduto7.setVisible(true);
             
        } else {
             jqtdProduto7.setVisible(false);
             cont = 0;
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed
 
    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        if (jCheckBox7.isSelected()) {
             cont = cont += Refrigerante600.getValor();
             jqtdProduto6.setVisible(true);
            
        } else {
             jqtdProduto6.setVisible(false);
             cont = 0;
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        if (jCheckBox8.isSelected()) {
             cont = cont += AguaMineral.getValor();
             
             jqtdProduto8.setVisible(true);
             
        } else {
             jqtdProduto8.setVisible(false);
             cont = 0;
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jqtdProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jqtdProduto1ActionPerformed
         Object temp = jqtdProduto1.getSelectedItem();
         Integer qtde = new Integer(temp.toString());
         total1 = qtde*StrogonoffdeFrango.getValor();
    }//GEN-LAST:event_jqtdProduto1ActionPerformed

    private void jqtdProduto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jqtdProduto2ActionPerformed
        Object temp = jqtdProduto2.getSelectedItem();
             Integer qtde = new Integer(temp.toString());
             
             total2 = qtde*StrogonoffdeCarne.getValor();
             
    }//GEN-LAST:event_jqtdProduto2ActionPerformed

    private void jqtdProduto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jqtdProduto3ActionPerformed
        Object temp = jqtdProduto3.getSelectedItem();
             Integer qtde = new Integer(temp.toString());
             total4 = qtde*CarneAssada.getValor();
    }//GEN-LAST:event_jqtdProduto3ActionPerformed

    private void jqtdProduto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jqtdProduto4ActionPerformed
        Object temp = jqtdProduto4.getSelectedItem();
             Integer qtde = new Integer(temp.toString());
             total3 = qtde*BifeComFritas.getValor();
    }//GEN-LAST:event_jqtdProduto4ActionPerformed

    private void jqtdProduto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jqtdProduto5ActionPerformed
        Object temp = jqtdProduto5.getSelectedItem();
             Integer qtde = new Integer(temp.toString());
             total5 = qtde*RefrigeranteLata.getValor();
    }//GEN-LAST:event_jqtdProduto5ActionPerformed

    private void jqtdProduto6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jqtdProduto6ActionPerformed
         Object temp = jqtdProduto6.getSelectedItem();
             Integer qtde = new Integer(temp.toString());
             total7 = qtde*Refrigerante600.getValor();
    }//GEN-LAST:event_jqtdProduto6ActionPerformed

    private void jqtdProduto7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jqtdProduto7ActionPerformed
        Object temp = jqtdProduto7.getSelectedItem();
             Integer qtde = new Integer(temp.toString());
             total6 = qtde*SucoDaFruta.getValor();
    }//GEN-LAST:event_jqtdProduto7ActionPerformed

    private void jqtdProduto8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jqtdProduto8ActionPerformed
        Object temp = jqtdProduto8.getSelectedItem();
             Integer qtde = new Integer(temp.toString());
             total8 = qtde*AguaMineral.getValor();
    }//GEN-LAST:event_jqtdProduto8ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JFerramentasSair;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JMenuItem jFerramentaFinalizar;
    private javax.swing.JMenu jFerramentas;
    private javax.swing.JMenuItem jFerramentasAtualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JComboBox<String> jqtdProduto1;
    private javax.swing.JComboBox<String> jqtdProduto2;
    private javax.swing.JComboBox<String> jqtdProduto3;
    private javax.swing.JComboBox<String> jqtdProduto4;
    private javax.swing.JComboBox<String> jqtdProduto5;
    private javax.swing.JComboBox<String> jqtdProduto6;
    private javax.swing.JComboBox<String> jqtdProduto7;
    private javax.swing.JComboBox<String> jqtdProduto8;
    // End of variables declaration//GEN-END:variables
}
