package com.raven.form;

import com.raven.cell.CellAction;
import com.raven.cell.CellAddress;
import com.raven.cell.CellAge;
import com.raven.cell.CellGender;
import com.raven.cell.CellName;
import com.raven.cell.CellTel;
import com.raven.chart.ModelChart;
import com.raven.model.ModelName;
import com.raven.model.ModelStaff;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class FormHome extends javax.swing.JPanel {
 DefaultTableModel model;//untuk jTable1
    public FormHome() {
        initComponents();
        setOpaque(false);
        table1.addTableStyle(jScrollPane1);
        init();
        initDataTable();
    }

    private void init() {
        chart.addLegend("Income", new Color(12, 84, 175), new Color(0, 108, 247));
        chart.addLegend("Expense", new Color(54, 4, 143), new Color(104, 49, 200));
        chart.addLegend("Profit", new Color(5, 125, 0), new Color(95, 209, 69));
        chart.addLegend("Cost", new Color(186, 37, 37), new Color(241, 100, 120));
        chart.addData(new ModelChart("January", new double[]{500, 200, 80, 89}));
        chart.addData(new ModelChart("February", new double[]{1000, 750, 90, 150}));
        chart.addData(new ModelChart("March", new double[]{200, 350, 460, 900}));
        chart.addData(new ModelChart("April", new double[]{480, 150, 750, 700}));
        chart.addData(new ModelChart("May", new double[]{350, 540, 300, 150}));
        chart.addData(new ModelChart("June", new double[]{190, 280, 81, 200}));
        chart.start();
    }

    private void initDataTable() {
         model = (DefaultTableModel)table1.getModel();
        table1.addTableCell(new CellName(), 0);
        table1.addTableCell(new CellGender(), 1);
        table1.addTableCell(new CellAge(), 2);
        table1.addTableCell(new CellAddress(), 3);
        table1.addTableCell(new CellTel(), 4);
        table1.addTableCell(new CellAction(), 5);
        table1.addRow(new ModelStaff(new ModelName("Ra", "Ven", ""), "Male", 18, "Raven123@gmail.com", "010 000 000"), false);  
        table1.addRow(new ModelStaff(new ModelName("Jon", "Cina", ""), "Female", 30, "Raven123@gmail.com", "100 123 123"), false);  
          table1.addRow(new ModelStaff(new ModelName("Ra", "Ven", ""), "Male", 18, "Raven123@gmail.com", "010 000 000"), false);  
        table1.addRow(new ModelStaff(new ModelName("Jon", "Cina", ""), "Female", 30, "Raven123@gmail.com", "100 123 123"), false); 
          table1.addRow(new ModelStaff(new ModelName("Ra", "Ven", ""), "Male", 18, "Raven123@gmail.com", "010 000 000"), false);  
        table1.addRow(new ModelStaff(new ModelName("Jon", "Cina", ""), "Female", 30, "dven123@gmail.com", "100 123 123"), false); 
          table1.addRow(new ModelStaff(new ModelName("Ra", "Ven", ""), "Male", 18, "dven123@gmail.com", "010 000 000"), false);  
        table1.addRow(new ModelStaff(new ModelName("Jon", "Cina", ""), "Female", 30, "daven123@gmail.com", "100 123 123"), false); 
          table1.addRow(new ModelStaff(new ModelName("Ra", "Ven", ""), "Male", 18, "Raven123@gmail.com", "010 000 000"), false);  
        table1.addRow(new ModelStaff(new ModelName("Jon", "Cina", ""), "Female", 30, "daven123@gmail.com", "100 123 123"), false); 
          table1.addRow(new ModelStaff(new ModelName("Ra", "Ven", ""), "Male", 18, "Raven123@gmail.com", "010 000 000"), false);  
        table1.addRow(new ModelStaff(new ModelName("Jon", "Cina", ""), "Female", 30, "daven123@gmail.com", "100 123 123"), false); 
          table1.addRow(new ModelStaff(new ModelName("Ra", "Ven", ""), "Male", 18, "Raven123@gmail.com", "010 000 000"), false);  
        table1.addRow(new ModelStaff(new ModelName("Jon", "Cina", ""), "Female", 30, "daven123@gmail.com", "100 123 123"), false); 
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.raven.swing.RoundPanel();
        chart = new com.raven.chart.CurveChart();
        roundPanel2 = new com.raven.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.raven.swing.Table();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        roundPanel1.setBackground(new java.awt.Color(60, 60, 60));

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundPanel2.setBackground(new java.awt.Color(60, 60, 60));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Gender", "Age", "Email", "Tel", "Action"
            }
        ));
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setPreferredWidth(200);
            table1.getColumnModel().getColumn(4).setPreferredWidth(50);
            table1.getColumnModel().getColumn(5).setMinWidth(75);
            table1.getColumnModel().getColumn(5).setPreferredWidth(75);
            table1.getColumnModel().getColumn(5).setMaxWidth(75);
        }

        jPanel1.setBackground(new java.awt.Color(60, 60, 60));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Title");

        jTextField1.setToolTipText("Search Here...");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/search.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE))
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        String search = jTextField1.getText();
     
            TableRowSorter tr = new TableRowSorter(model);
            table1.setRowSorter(tr);
            //set kolom pencarian (indeks kolom)
            tr.setRowFilter(RowFilter.regexFilter(search));
     
    }//GEN-LAST:event_jTextField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.chart.CurveChart chart;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private com.raven.swing.RoundPanel roundPanel1;
    private com.raven.swing.RoundPanel roundPanel2;
    private com.raven.swing.Table table1;
    // End of variables declaration//GEN-END:variables
}
