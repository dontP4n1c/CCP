package ex_filme;

import javax.swing.JOptionPane;

public class Janela_Filme extends javax.swing.JFrame {

    Queue fila = new Queue();
    public Janela_Filme() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_titulo1 = new javax.swing.JLabel();
        txt_diretor = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JLabel();
        txt_genero = new javax.swing.JLabel();
        txt_ano = new javax.swing.JLabel();
        txt_pais = new javax.swing.JLabel();
        titulo_digitado = new javax.swing.JTextField();
        diretor_digitado = new javax.swing.JTextField();
        pais_digitado = new javax.swing.JTextField();
        genero_digitado = new javax.swing.JTextField();
        ano_digitado = new javax.swing.JTextField();
        txt_janela = new javax.swing.JLabel();
        btn_cadastrar = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        btn_retirar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        area_texto = new javax.swing.JTextArea();

        txt_titulo1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        txt_titulo1.setText("Título do Filme: ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        txt_diretor.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        txt_diretor.setForeground(new java.awt.Color(0, 0, 51));
        txt_diretor.setText("Diretor do Filme: ");

        txt_titulo.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        txt_titulo.setForeground(new java.awt.Color(0, 0, 51));
        txt_titulo.setText("Título do Filme: ");

        txt_genero.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        txt_genero.setForeground(new java.awt.Color(0, 0, 51));
        txt_genero.setText("Gênero do Filme: ");

        txt_ano.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        txt_ano.setForeground(new java.awt.Color(0, 0, 51));
        txt_ano.setText("Ano de Lançamento:");

        txt_pais.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        txt_pais.setForeground(new java.awt.Color(0, 0, 51));
        txt_pais.setText("País de Origem: ");

        titulo_digitado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        diretor_digitado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        pais_digitado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        genero_digitado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        ano_digitado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txt_janela.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        txt_janela.setForeground(new java.awt.Color(0, 0, 51));
        txt_janela.setText("CADASTRO DE FILMES");

        btn_cadastrar.setBackground(new java.awt.Color(204, 204, 204));
        btn_cadastrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_cadastrar.setForeground(new java.awt.Color(0, 0, 51));
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_consultar.setBackground(new java.awt.Color(204, 204, 204));
        btn_consultar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_consultar.setForeground(new java.awt.Color(0, 0, 51));
        btn_consultar.setText("Consultar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        btn_retirar.setBackground(new java.awt.Color(204, 204, 204));
        btn_retirar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_retirar.setForeground(new java.awt.Color(0, 0, 51));
        btn_retirar.setText("Retirar até achar Filme de Ação");
        btn_retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retirarActionPerformed(evt);
            }
        });

        area_texto.setColumns(20);
        area_texto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        area_texto.setForeground(new java.awt.Color(0, 51, 51));
        area_texto.setRows(5);
        jScrollPane2.setViewportView(area_texto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_retirar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(txt_janela, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_ano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_pais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_genero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_diretor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titulo_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diretor_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pais_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genero_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ano_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_janela, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_diretor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diretor_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genero_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pais_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ano_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_retirar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_retirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retirarActionPerformed
        if(!fila.isEmpty()){
            while(!((Filme)fila.peek()).getGenero().equalsIgnoreCase("ação")){
                JOptionPane.showMessageDialog(null,fila.peek()+" retirado com sucesso!");
                fila.dequeue();
            }
            area_texto.setText(fila.toString());
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "A Fila está Vazia!", "ERROR!", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_btn_retirarActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        String titulo = titulo_digitado.getText();
        String diretor = diretor_digitado.getText();
        String genero = genero_digitado.getText();
        String pais = pais_digitado.getText();
        int ano = Integer.parseInt(ano_digitado.getText());

        fila.enqueue(new Filme(titulo,diretor,genero,pais,ano));
        JOptionPane.showMessageDialog(null,"Filme cadastrado com sucesso!");
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        area_texto.setText(fila.toString());
    }//GEN-LAST:event_btn_consultarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela_Filme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ano_digitado;
    private javax.swing.JTextArea area_texto;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_retirar;
    private javax.swing.JTextField diretor_digitado;
    private javax.swing.JTextField genero_digitado;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pais_digitado;
    private javax.swing.JTextField titulo_digitado;
    private javax.swing.JLabel txt_ano;
    private javax.swing.JLabel txt_diretor;
    private javax.swing.JLabel txt_genero;
    private javax.swing.JLabel txt_janela;
    private javax.swing.JLabel txt_pais;
    private javax.swing.JLabel txt_titulo;
    private javax.swing.JLabel txt_titulo1;
    // End of variables declaration//GEN-END:variables
}
