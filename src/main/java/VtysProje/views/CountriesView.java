package VtysProje.views;

import VtysProje.dao.CountryDao;
import VtysProje.model.Country;
import VtysProje.util.DataModelsInitializer;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Created by 12043 on 8.12.2017 part of project vtysProje
 */
public class CountriesView extends javax.swing.JPanel {

    private CountryDao countryDao = new CountryDao();

    private List<Country> countries = new ArrayList<>();

    private void refreshCountries() {
        countries = countryDao.getAll();
        jTable_countries_list.setModel(DataModelsInitializer.initCountriesTableModel(countries));
        jComboBox_countries_edit_select.setModel(DataModelsInitializer.initCountriesComboBoxModel(countries));
    }

    /**
     * Creates new form CountriesView
     */
    public CountriesView() {
        initComponents();
        refreshCountries();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane_countries = new javax.swing.JTabbedPane();
        jPanel_countries_add = new javax.swing.JPanel();
        jTextField_countries_add_name = new javax.swing.JTextField();
        jLabel_countries_add_name = new javax.swing.JLabel();
        jLabel_countries_add_code = new javax.swing.JLabel();
        jButton_countries_add = new javax.swing.JButton();
        jSpinner_countries_add_code = new javax.swing.JSpinner();
        jPanel_countries_list = new javax.swing.JPanel();
        jScrollPane_countries_list = new javax.swing.JScrollPane();
        jTable_countries_list = new javax.swing.JTable();
        jPanel_countries_edit = new javax.swing.JPanel();
        jTextField_countries_edit_name = new javax.swing.JTextField();
        jLabel_countries_edit_name = new javax.swing.JLabel();
        jLabel_countries_edit_code = new javax.swing.JLabel();
        jButton_countries_edit = new javax.swing.JButton();
        jSpinner_countries_edit_code = new javax.swing.JSpinner();
        jComboBox_countries_edit_select = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jLabel_countries_add_name.setText("Country name:");

        jLabel_countries_add_code.setText("Country code:");

        jButton_countries_add.setText("Add");
        jButton_countries_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_countries_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_countries_addLayout = new javax.swing.GroupLayout(jPanel_countries_add);
        jPanel_countries_add.setLayout(jPanel_countries_addLayout);
        jPanel_countries_addLayout.setHorizontalGroup(
                jPanel_countries_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_countries_addLayout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addComponent(jButton_countries_add, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(342, 342, 342))
                        .addGroup(jPanel_countries_addLayout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addGroup(jPanel_countries_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_countries_add_name)
                                        .addComponent(jLabel_countries_add_code))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel_countries_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSpinner_countries_add_code, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                        .addComponent(jTextField_countries_add_name, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                .addGap(280, 280, 280))
        );
        jPanel_countries_addLayout.setVerticalGroup(
                jPanel_countries_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_countries_addLayout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(jPanel_countries_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField_countries_add_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_countries_add_name))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_countries_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_countries_add_code)
                                        .addComponent(jSpinner_countries_add_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton_countries_add)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane_countries.addTab("Add", jPanel_countries_add);

        jTable_countries_list.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null}
                },
                new String[]{
                    "Id", "Name", "Code"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jTable_countries_list.setColumnSelectionAllowed(true);
        jScrollPane_countries_list.setViewportView(jTable_countries_list);

        javax.swing.GroupLayout jPanel_countries_listLayout = new javax.swing.GroupLayout(jPanel_countries_list);
        jPanel_countries_list.setLayout(jPanel_countries_listLayout);
        jPanel_countries_listLayout.setHorizontalGroup(
                jPanel_countries_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_countries_listLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane_countries_list, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel_countries_listLayout.setVerticalGroup(
                jPanel_countries_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_countries_listLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane_countries_list, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane_countries.addTab("List", jPanel_countries_list);

        jLabel_countries_edit_name.setText("Country name:");

        jLabel_countries_edit_code.setText("Country code:");

        jButton_countries_edit.setText("Save");
        jButton_countries_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_countries_editActionPerformed(evt);
            }
        });

        jComboBox_countries_edit_select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Country 1", "Country 2", "Country 3", "Country 4"}));
        jComboBox_countries_edit_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_countries_edit_selectActionPerformed(evt);
            }
        });

        jLabel1.setText("Editing Country:");

        javax.swing.GroupLayout jPanel_countries_editLayout = new javax.swing.GroupLayout(jPanel_countries_edit);
        jPanel_countries_edit.setLayout(jPanel_countries_editLayout);
        jPanel_countries_editLayout.setHorizontalGroup(
                jPanel_countries_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_countries_editLayout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addComponent(jButton_countries_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel_countries_editLayout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addGroup(jPanel_countries_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addGroup(jPanel_countries_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel_countries_edit_name)
                                                .addComponent(jLabel_countries_edit_code)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel_countries_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_countries_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jSpinner_countries_edit_code, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                                .addComponent(jTextField_countries_edit_name, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                        .addComponent(jComboBox_countries_edit_select, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(280, 280, 280))
        );
        jPanel_countries_editLayout.setVerticalGroup(
                jPanel_countries_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_countries_editLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(jPanel_countries_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox_countries_edit_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_countries_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField_countries_edit_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_countries_edit_name))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_countries_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_countries_edit_code)
                                        .addComponent(jSpinner_countries_edit_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton_countries_edit)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane_countries.addTab("Edit", jPanel_countries_edit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane_countries, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane_countries)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_countries_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_countries_addActionPerformed
        String countryName = jTextField_countries_add_name.getText();
        int countryCode = (int) jSpinner_countries_add_code.getValue();

        Country country = new Country();
        country.setName(countryName);
        country.setCode(countryCode);

        if (countryDao.add(country)) {
            JOptionPane.showMessageDialog(this, "Added successfully");
            jTextField_countries_add_name.setText("");
            jSpinner_countries_add_code.setValue(0);
            refreshCountries();
        }
    }//GEN-LAST:event_jButton_countries_addActionPerformed

    private void jButton_countries_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_countries_editActionPerformed
        String countryName = jTextField_countries_edit_name.getText();
        int countryCode = (int) jSpinner_countries_edit_code.getValue();

        Country country = new Country();
        country.setName(countryName);
        country.setCode(countryCode);
        country.setId(countries.get(jComboBox_countries_edit_select.getSelectedIndex() - 1).getId());

        if (countryDao.update(country)) {
            JOptionPane.showMessageDialog(this, "Updated successfully");
            refreshCountries();
        }
    }//GEN-LAST:event_jButton_countries_editActionPerformed

    private void jComboBox_countries_edit_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_countries_edit_selectActionPerformed
        Country country = countries.get(jComboBox_countries_edit_select.getSelectedIndex() - 1);

        jTextField_countries_edit_name.setText(country.getName());
        jSpinner_countries_edit_code.setValue(country.getCode());
    }//GEN-LAST:event_jComboBox_countries_edit_selectActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_countries_add;
    private javax.swing.JButton jButton_countries_edit;
    private javax.swing.JComboBox<String> jComboBox_countries_edit_select;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_countries_add_code;
    private javax.swing.JLabel jLabel_countries_add_name;
    private javax.swing.JLabel jLabel_countries_edit_code;
    private javax.swing.JLabel jLabel_countries_edit_name;
    private javax.swing.JPanel jPanel_countries_add;
    private javax.swing.JPanel jPanel_countries_edit;
    private javax.swing.JPanel jPanel_countries_list;
    private javax.swing.JScrollPane jScrollPane_countries_list;
    private javax.swing.JSpinner jSpinner_countries_add_code;
    private javax.swing.JSpinner jSpinner_countries_edit_code;
    private javax.swing.JTabbedPane jTabbedPane_countries;
    private javax.swing.JTable jTable_countries_list;
    private javax.swing.JTextField jTextField_countries_add_name;
    private javax.swing.JTextField jTextField_countries_edit_name;
    // End of variables declaration//GEN-END:variables
}