/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maytinhbotui;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author truon
 */
public class maytinh extends javax.swing.JFrame {

    /**
     * Creates new form maytinh
     */
    private String pheptoan="";
    private String ketqua="";
    private int dem=0,dem2=0;
    
    public maytinh() {
        initComponents();
        fontchu();
        this.setLocationRelativeTo(null);
        
    }
    public static String removeCharAt(String s, int pos) {
      return s.substring(0, pos) + s.substring(pos + 1);
   }
    public void fontchu(){
        Font font = new Font("",Font.CENTER_BASELINE,20);
        Font font2= new Font("",Font.CENTER_BASELINE,15);
        input.setFont(font);
        output.setFont(font);
        cong.setFont(font2);
        tru.setFont(font2);
        nhan.setFont(font2);
        chia.setFont(font2);
        bang.setFont(font2);
        phay.setFont(font2);
        can.setFont(font2);
        xoa.setFont(font2);
        xoaall.setFont(font2);
        phanso.setFont(font2);
    }
    public float tinhtoan(){
        float kq = 0;
        String a="";
        String b="";
        String bieuthuc =input.getText();
        String loaitru = bieuthuc;
        int dem=0;
        for(int i=0;i<loaitru.length();i++){
            if(loaitru.codePointAt(i)>=48&&loaitru.codePointAt(i)<=57||loaitru.codePointAt(i)==46||loaitru.codePointAt(0)==45){
                
                
               // loaitru  = removeCharAt(loaitru, i);
             if(loaitru.codePointAt(0)==45){
                    dem++;
                    continue;
                }
             a +=loaitru.charAt(i);
              if(dem!=0){
                    kq = -Float.parseFloat(a);
                }
              else  kq = Float.parseFloat(a);
            }
            else{
                if(dem!=0){
                    a = "-"+a;
                }
               if(loaitru.charAt(i)=='+'){
               kq=0;
               for(int j=i+1;j<loaitru.length();j++){
                   if(loaitru.codePointAt(j)>=48&&loaitru.codePointAt(j)<=57||loaitru.codePointAt(i)==46){
                    b +=loaitru.charAt(j);
               }
                   else break;
               }
                kq= Float.parseFloat(a)+Float.parseFloat(b);
              }
               else if(loaitru.charAt(i)=='-'){
                    kq=0;
               for(int j=i+1;j<loaitru.length();j++){
                  if(loaitru.codePointAt(j)>=48&&loaitru.codePointAt(j)<=57||loaitru.codePointAt(i)==46){
                    b +=loaitru.charAt(j);
               }
                   else break;
               }
                if(b.equals("")) b="0";
                kq= Float.parseFloat(a)-Float.parseFloat(b);
         
               }
               else if(loaitru.charAt(i)=='x'){
                    kq=0;
               for(int j=i+1;j<loaitru.length();j++){
                   if(loaitru.codePointAt(j)>=48&&loaitru.codePointAt(j)<=57||loaitru.codePointAt(i)==46){
                    b +=loaitru.charAt(j);
               }
                   else break;
               }
               if(b.equals("0")) b="1";
                kq= Float.parseFloat(a)*Float.parseFloat(b);
               }
               else if(loaitru.charAt(i)=='/'){
                    kq=0;
               for(int j=i+1;j<loaitru.length();j++){
                  if(loaitru.codePointAt(j)>=48&&loaitru.codePointAt(j)<=57||loaitru.codePointAt(i)==46){
                    b +=loaitru.charAt(j);
               }
                   else break;
               }
               if(b.equals("0")) b="1";
                kq= Float.parseFloat(a)/Float.parseFloat(b);
               }
               break;
            }
        }
        /*for(int i=0;i<bieuthuc.length();i++){
            if(bieuthuc.charAt(i)!='+'){
                a +=bieuthuc.charAt(i);
                //pheptoan  = removeCharAt(pheptoan, i);
            }
            else break;
        }
        for(int i=0;i<bieuthuc.length();i++){
            if(bieuthuc.charAt(i)=='+'){
               for(int j=i+1;j<bieuthuc.length();j++){
                    b +=bieuthuc.charAt(j);
               }
               break;
            }
            else continue;
        }*/
        
        //if(b.equals("")) b="0";
        //kq= Float.parseFloat(a)+Float.parseFloat(b);
        return kq;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        so7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        so8 = new javax.swing.JButton();
        so9 = new javax.swing.JButton();
        so4 = new javax.swing.JButton();
        so5 = new javax.swing.JButton();
        so6 = new javax.swing.JButton();
        so1 = new javax.swing.JButton();
        so2 = new javax.swing.JButton();
        so3 = new javax.swing.JButton();
        so0 = new javax.swing.JButton();
        can = new javax.swing.JButton();
        phay = new javax.swing.JButton();
        cong = new javax.swing.JButton();
        tru = new javax.swing.JButton();
        nhan = new javax.swing.JButton();
        chia = new javax.swing.JButton();
        bang = new javax.swing.JButton();
        output = new javax.swing.JLabel();
        xoa = new javax.swing.JButton();
        xoaall = new javax.swing.JButton();
        phanso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        so7.setText("7");
        so7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so7ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nhập phép tinh");

        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        so8.setText("8");
        so8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so8ActionPerformed(evt);
            }
        });

        so9.setText("9");
        so9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so9ActionPerformed(evt);
            }
        });

        so4.setText("4");
        so4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so4ActionPerformed(evt);
            }
        });

        so5.setText("5");
        so5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so5ActionPerformed(evt);
            }
        });

        so6.setText("6");
        so6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so6ActionPerformed(evt);
            }
        });

        so1.setText("1");
        so1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so1ActionPerformed(evt);
            }
        });

        so2.setText("2");
        so2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so2ActionPerformed(evt);
            }
        });

        so3.setText("3");
        so3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so3ActionPerformed(evt);
            }
        });

        so0.setText("0");
        so0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so0ActionPerformed(evt);
            }
        });

        can.setText("√");
        can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canActionPerformed(evt);
            }
        });

        phay.setText(".");
        phay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phayActionPerformed(evt);
            }
        });

        cong.setText("+");
        cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congActionPerformed(evt);
            }
        });

        tru.setText("-");
        tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truActionPerformed(evt);
            }
        });

        nhan.setText("x");
        nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhanActionPerformed(evt);
            }
        });

        chia.setText("/");
        chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiaActionPerformed(evt);
            }
        });

        bang.setText("=");
        bang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangActionPerformed(evt);
            }
        });

        output.setText("0");

        xoa.setText("Del");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        xoaall.setText("C");
        xoaall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaallActionPerformed(evt);
            }
        });

        phanso.setText("1/x");
        phanso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phansoActionPerformed(evt);
            }
        });

        jLabel2.setText("Kết Quả");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(so4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(can, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(so1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                    .addComponent(so7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phanso, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(xoaall, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(cong, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(so2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(so0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(so5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(so3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                            .addComponent(phay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(so6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(so8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(so9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tru, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nhan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phanso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xoaall, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(cong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(so7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(so8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(so9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tru, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(so4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(so5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(so6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(so2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(so1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(so3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(so0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(can, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phay, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void so7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so7ActionPerformed
        // TODO add your handling code here:
        pheptoan+="7";
        input.setText(pheptoan);
    }//GEN-LAST:event_so7ActionPerformed

    private void so0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so0ActionPerformed
        // TODO add your handling code here:
        pheptoan+="0";
        input.setText(pheptoan);
    }//GEN-LAST:event_so0ActionPerformed

    private void truActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truActionPerformed
        // TODO add your handling code here:
        dem2++;
         if(dem2!=0){ 
             output.setText(String.valueOf(tinhtoan()));
        }
        if(dem!=0){
            pheptoan=output.getText()+"-";
             input.setText(pheptoan);
        }
        else{
            pheptoan+="-";
            input.setText(pheptoan);
        }
    }//GEN-LAST:event_truActionPerformed

    private void so1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so1ActionPerformed
        // TODO add your handling code here:
        pheptoan+="1";
        input.setText(pheptoan);
    }//GEN-LAST:event_so1ActionPerformed

    private void so2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so2ActionPerformed
        // TODO add your handling code here:
        pheptoan+="2";
        input.setText(pheptoan);
    }//GEN-LAST:event_so2ActionPerformed

    private void so3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so3ActionPerformed
        // TODO add your handling code here:
        pheptoan+="3";
        input.setText(pheptoan);
    }//GEN-LAST:event_so3ActionPerformed

    private void so4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so4ActionPerformed
        // TODO add your handling code here:
        pheptoan+="4";
        input.setText(pheptoan);
    }//GEN-LAST:event_so4ActionPerformed

    private void so5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so5ActionPerformed
        // TODO add your handling code here:
        pheptoan+="5";
        input.setText(pheptoan);
    }//GEN-LAST:event_so5ActionPerformed

    private void so6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so6ActionPerformed
        // TODO add your handling code here:
        pheptoan+="6";
        input.setText(pheptoan);
    }//GEN-LAST:event_so6ActionPerformed

    private void so8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so8ActionPerformed
        // TODO add your handling code here:
        pheptoan+="8";
        input.setText(pheptoan);
    }//GEN-LAST:event_so8ActionPerformed

    private void so9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so9ActionPerformed
        // TODO add your handling code here:
        pheptoan+="9";
        input.setText(pheptoan);
    }//GEN-LAST:event_so9ActionPerformed

    private void bangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangActionPerformed
        // TODO add your handling code here:
        if(pheptoan.equals(""))
        {
            //output.setText("Chưa nhập dữ liệu");
            JOptionPane.showMessageDialog(this, "Chưa nhập dữ liệu");
        }
        else {
            output.setText(String.valueOf(tinhtoan()));
            dem++;
        }
    }//GEN-LAST:event_bangActionPerformed

    private void phansoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phansoActionPerformed
        // TODO add your handling code here:
        input.setText(output.getText());
        float kqps = (float) 1/(Float.parseFloat(output.getText()));
        output.setText(String.valueOf(kqps));
    }//GEN-LAST:event_phansoActionPerformed

    private void nhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhanActionPerformed
        // TODO add your handling code here:
        dem2++;
         if(dem2!=0){ 
             output.setText(String.valueOf(tinhtoan()));
        }
        if(dem!=0){
            pheptoan=output.getText()+"x";
             input.setText(pheptoan);
        }
        else{
            pheptoan+="x";
            input.setText(pheptoan);
        }
    }//GEN-LAST:event_nhanActionPerformed

    private void congActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congActionPerformed
        // TODO add your handling code here:
        dem2++;
        if(dem2!=0){ 
             output.setText(String.valueOf(tinhtoan()));
        }
        if(dem!=0){
            pheptoan=output.getText()+"+";
             input.setText(pheptoan);
             
        }
        else{
            pheptoan+="+";
            input.setText(pheptoan);
        }
        
    }//GEN-LAST:event_congActionPerformed

    private void chiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiaActionPerformed
        // TODO add your handling code here:
        dem2++;
         if(dem2!=0){ 
             output.setText(String.valueOf(tinhtoan()));
        }
         if(dem!=0){
            pheptoan=output.getText()+"/";
             input.setText(pheptoan);
        }
        else{
            pheptoan+="/";
            input.setText(pheptoan);
        }
    }//GEN-LAST:event_chiaActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        // TODO add your handling code here:
        if(pheptoan.equals("")){
            output.setText("0");
            dem=0;
            dem2=0;
        }
        else {
        pheptoan =removeCharAt(pheptoan,pheptoan.length()-1);
        input.setText(pheptoan);
        }
    }//GEN-LAST:event_xoaActionPerformed

    private void phayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phayActionPerformed
        // TODO add your handling code here:
         pheptoan+=".";
        input.setText(pheptoan);
    }//GEN-LAST:event_phayActionPerformed

    private void xoaallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaallActionPerformed
        // TODO add your handling code here:
        pheptoan="";
        input.setText("");
        output.setText("0");
        dem=0;
        dem2=0;
    }//GEN-LAST:event_xoaallActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canActionPerformed
        // TODO add your handling code here:
        input.setText(output.getText());
        float kqcan = (float) Math.sqrt(Float.parseFloat(output.getText()));
        output.setText(String.valueOf(kqcan));
        
    }//GEN-LAST:event_canActionPerformed

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
            java.util.logging.Logger.getLogger(maytinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(maytinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(maytinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(maytinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new maytinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bang;
    private javax.swing.JButton can;
    private javax.swing.JButton chia;
    private javax.swing.JButton cong;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton nhan;
    private javax.swing.JLabel output;
    private javax.swing.JButton phanso;
    private javax.swing.JButton phay;
    private javax.swing.JButton so0;
    private javax.swing.JButton so1;
    private javax.swing.JButton so2;
    private javax.swing.JButton so3;
    private javax.swing.JButton so4;
    private javax.swing.JButton so5;
    private javax.swing.JButton so6;
    private javax.swing.JButton so7;
    private javax.swing.JButton so8;
    private javax.swing.JButton so9;
    private javax.swing.JButton tru;
    private javax.swing.JButton xoa;
    private javax.swing.JButton xoaall;
    // End of variables declaration//GEN-END:variables
}
