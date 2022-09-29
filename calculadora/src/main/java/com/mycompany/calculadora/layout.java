
package com.mycompany.calculadora;


public class layout extends javax.swing.JFrame {

   
    public layout() {
        initComponents();
    }
      //A calculadora funciona com base no Vetor Tela[], ele é usado para armazenar e exibir todos os dados do sistema.
      //Orienta tanto o que esta sendo exibido quanto suas operaçoes
       //O Index [0] será sempre o primeiro número exibido.
       //O Index [1] será sempre o operador da conta.
       //O Index [2] será sempre o segundo número exibido.
       //O Index [3] ainda não tem função, a ser implementado com a expansão do projeto.
       //O Index [4] será sempre o resultado da conta. 
        String tela[] = {"", "", "", "", ""};
       
    //Função que efetua a conta da calculadora e retorna o valor em string para o que for necessário.
    public String fazerResultado(String []tela){
      
        double resultado= 0;
        double numero1=Double.parseDouble(tela[0]) ;
        double numero2=Double.parseDouble(tela[2]) ;
        switch (tela[1]) {
            case "+" -> resultado = numero1 + numero2 ;
            case "-" -> resultado = numero1 - numero2 ;
            case "/" -> resultado = numero1 / numero2 ;
            case "X" -> resultado = numero1 * numero2 ;
            default -> {
            }
        }      
        String solucao= String.valueOf(resultado);
        return solucao;
    }
    //Metodo que recebe o valor do numero e o insere no vetor Tela[] em sua posição correta.
    public void Numeros(String num){
        verificarResultado();
        
        //Verifica a situação do vetor: se não há números e ele é o primeiro; se não for o primeiro, concatenando ao anterior;
        //Se já há operador, assim sendo adicionado como o segundo número da operação;havendo operador e segudno número, concatena com o mesmo.
        if(tela[0].equals("")){                      
            tela[0]=num;          
        }else if((!tela[0].equals(""))&&(tela[1].equals(""))){
        tela[0]=(tela[0]+num);
        }else if(tela[2].equals("")){
            tela[2]=num;           
        }else{
            tela[2]=(tela[2]+num);
        }
        exibirTela(); 
    }    
     //Metodo que recebe o sinal da operação e o insere no vetor Tela[] em sua posição correta.
     public void Operacao(String op){
         verificarResultado();
          
        if(tela[0].equals("")){ 
            //Não faz nada pois não tem o primeiro número, futuramente algum tipo de erro pode ser exibido
      }else{       
        if(tela[1].equals("")){
       tela[1] = op;
        }else if(!(tela[1].equals(""))&&((tela[2].equals("")))){
      //não faz nada pois não tem um segundo número, futuramente algum tipo de erro pode ser exibido
       }else{
       tela[0]=fazerResultado(tela);
       tela[1]=op;
       tela[2]="";
       }
          exibirTela();
       }
    } 
     //Metodo para exibir a tela,
     public void exibirTela(){
         TFtela.setText(tela[0]+tela[1]+tela[2]+tela[3]+tela[4]);
    }
     
     //Metodo para verificar se o que está sendo exibido é um resultado (o qual é guardado na "tela[4]"), 
     //e se sim joga ele para a posição tela[0] para poder usar o resultado da anterior com outra conta.
     public void verificarResultado(){
         if (!tela[4].equals("")){
             if(tela[4].endsWith(".0")){
                 tela [4]= tela[4].replace(".0", "");
             }
             tela[0]=tela[4];
             tela[4]="";
             exibirTela();
        }   
    }
             
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtC = new javax.swing.JButton();
        BtDel = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        BtDividir = new javax.swing.JButton();
        BtX = new javax.swing.JButton();
        BtMenos = new javax.swing.JButton();
        BtIgual = new javax.swing.JButton();
        BtMais = new javax.swing.JButton();
        Bt7 = new javax.swing.JButton();
        Bt8 = new javax.swing.JButton();
        Bt9 = new javax.swing.JButton();
        Bt4 = new javax.swing.JButton();
        Bt5 = new javax.swing.JButton();
        Bt6 = new javax.swing.JButton();
        Bt1 = new javax.swing.JButton();
        Bt2 = new javax.swing.JButton();
        Bt3 = new javax.swing.JButton();
        Bt0 = new javax.swing.JButton();
        BtPonto = new javax.swing.JButton();
        TFtela = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BtC.setText("C");
        BtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCActionPerformed(evt);
            }
        });

        BtDel.setText("DEL");
        BtDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDelActionPerformed(evt);
            }
        });

        jButton3.setText("&");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        BtDividir.setText("/");
        BtDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDividirActionPerformed(evt);
            }
        });

        BtX.setText("X");
        BtX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtXActionPerformed(evt);
            }
        });

        BtMenos.setText("-");
        BtMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMenosActionPerformed(evt);
            }
        });

        BtIgual.setText("=");
        BtIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtIgualActionPerformed(evt);
            }
        });

        BtMais.setText("+");
        BtMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMaisActionPerformed(evt);
            }
        });

        Bt7.setText("7");
        Bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt7ActionPerformed(evt);
            }
        });

        Bt8.setText("8");
        Bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt8ActionPerformed(evt);
            }
        });

        Bt9.setText("9");
        Bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt9ActionPerformed(evt);
            }
        });

        Bt4.setText("4");
        Bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt4ActionPerformed(evt);
            }
        });

        Bt5.setText("5");
        Bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt5ActionPerformed(evt);
            }
        });

        Bt6.setText("6");
        Bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt6ActionPerformed(evt);
            }
        });

        Bt1.setText("1");
        Bt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                apertou(evt);
            }
        });
        Bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt1ActionPerformed(evt);
            }
        });
        Bt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                press(evt);
            }
        });

        Bt2.setText("2");
        Bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt2ActionPerformed(evt);
            }
        });

        Bt3.setText("3");
        Bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt3ActionPerformed(evt);
            }
        });

        Bt0.setText("0");
        Bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt0ActionPerformed(evt);
            }
        });

        BtPonto.setText(".");
        BtPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPontoActionPerformed(evt);
            }
        });

        TFtela.setEditable(false);
        TFtela.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TFtela)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BtC, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BtDel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Bt0, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtX, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtMais, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TFtela, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtDel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtMais, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bt0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Botão que apaga tudo de uma vez.
    private void BtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCActionPerformed
        tela[0] ="";
        tela[1] ="";
        tela[2] ="";
        tela[3] ="";
        tela[4] ="";
        exibirTela();    
    }//GEN-LAST:event_BtCActionPerformed
        //Botão de apagar o ultimo termo inserido
        //Varre o vetor de trás para frente e apaga o ultimo dado inserido.
    private void BtDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDelActionPerformed
        if(!tela[4].equals("")){
            tela[4]="";           
        }else if(!tela[3].equals("")){
             tela[3]="";
        }else if(!tela[2].equals("")){
             tela[2]="";
        }else if(!tela[1].equals("")){
             tela[1]="";    
        }else{
             tela[0]="";       
        }
        exibirTela();
    }//GEN-LAST:event_BtDelActionPerformed
    //botão "&", ainda não implementado
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDividirActionPerformed
        Operacao("/");
    }//GEN-LAST:event_BtDividirActionPerformed

    private void BtXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtXActionPerformed
       Operacao("X");
    }//GEN-LAST:event_BtXActionPerformed

    private void BtMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMenosActionPerformed
        Operacao("-");
    }//GEN-LAST:event_BtMenosActionPerformed
    //Botão de igual, limpa o vetor, insere o resultado chamando a função "fazerResultado", e exibe isso.
    private void BtIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtIgualActionPerformed
       String resultado = fazerResultado(tela);
       if(resultado.endsWith(".0")){
                 resultado= resultado.replace(".0", "");
             }
        tela[0] = "";   
        tela[1] = "";
        tela[2] = "";
        tela[3] = "";
        tela[4] = resultado;
        exibirTela();
    }//GEN-LAST:event_BtIgualActionPerformed

    private void BtMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMaisActionPerformed
         Operacao("+");          
    }//GEN-LAST:event_BtMaisActionPerformed

    private void Bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt7ActionPerformed
        Numeros("7");
    }//GEN-LAST:event_Bt7ActionPerformed

    private void Bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt8ActionPerformed
        Numeros("8");
    }//GEN-LAST:event_Bt8ActionPerformed

    private void Bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt9ActionPerformed
        Numeros("9");
    }//GEN-LAST:event_Bt9ActionPerformed

    private void Bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt4ActionPerformed
        Numeros("4");
    }//GEN-LAST:event_Bt4ActionPerformed

    private void Bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt5ActionPerformed
        Numeros("5");
    }//GEN-LAST:event_Bt5ActionPerformed

    private void Bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt6ActionPerformed
        Numeros("6");
    }//GEN-LAST:event_Bt6ActionPerformed

    private void Bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt1ActionPerformed
        Numeros("1"); 
    }//GEN-LAST:event_Bt1ActionPerformed

    private void Bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt2ActionPerformed
        Numeros("2");
    }//GEN-LAST:event_Bt2ActionPerformed

    private void Bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt3ActionPerformed
       Numeros("3");
    }//GEN-LAST:event_Bt3ActionPerformed

    private void Bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt0ActionPerformed
       Numeros("0");
    }//GEN-LAST:event_Bt0ActionPerformed
    //botão para inserir o "." no valor, fazedo assim os valores decimais poderem serem inseridos.
    private void BtPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPontoActionPerformed
       
        verificarResultado();       
        
        if(tela[0].equals("")){
            tela[0]=("0.");           
        }else if((tela[1].equals(""))){
            if(!tela[0].contains(".")){
            tela[0]=(tela[0]+".");
            }
        }else if((tela[2].equals(""))){
            tela[2]=("0.");
        }else{
            if (!tela[2].contains(".")){
            tela[2]=(tela[2]+".");
            }
        }
        exibirTela(); 
    }//GEN-LAST:event_BtPontoActionPerformed

    private void apertou(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apertou
        // TODO add your handling code here:
    }//GEN-LAST:event_apertou

    private void press(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_press
        
    }//GEN-LAST:event_press

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
            java.util.logging.Logger.getLogger(layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new layout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt0;
    private javax.swing.JButton Bt1;
    private javax.swing.JButton Bt2;
    private javax.swing.JButton Bt3;
    private javax.swing.JButton Bt4;
    private javax.swing.JButton Bt5;
    private javax.swing.JButton Bt6;
    private javax.swing.JButton Bt7;
    private javax.swing.JButton Bt8;
    private javax.swing.JButton Bt9;
    private javax.swing.JButton BtC;
    private javax.swing.JButton BtDel;
    private javax.swing.JButton BtDividir;
    private javax.swing.JButton BtIgual;
    private javax.swing.JButton BtMais;
    private javax.swing.JButton BtMenos;
    private javax.swing.JButton BtPonto;
    private javax.swing.JButton BtX;
    private javax.swing.JTextField TFtela;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
