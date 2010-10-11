/*
 * WheelEncoderGeneratorView.java
 */

package wheelencodergenerator;

import org.jdesktop.application.Action;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerModel;
import java.awt.event.*;
import java.awt.print.*;
import java.awt.*;

/**
 * The application's main frame.
 */
public class WheelEncoderGeneratorView extends FrameView {

    private WheelEncoder encoder;

    public WheelEncoderGeneratorView(SingleFrameApplication app) {
        super(app);

        initComponents();

        encoder = new WheelEncoder();

        encoderPanel.setWheelEncoder(encoder);

        // Simulate "preview" click to generate initial image
        showPreview();

    }

    @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = WheelEncoderGeneratorApp.getApplication().getMainFrame();
            aboutBox = new WheelEncoderGeneratorAboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        WheelEncoderGeneratorApp.getApplication().show(aboutBox);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainPanel = new javax.swing.JPanel();
        encoderPanel = new wheelencodergenerator.EncoderPanel();
        controlPanel = new javax.swing.JPanel();
        diameterPanel = new javax.swing.JPanel();
        innerDiameterLabel = new javax.swing.JLabel();
        innerDiameter = new javax.swing.JTextField();
        outerDiameterLabel = new javax.swing.JLabel();
        outerDiameter = new javax.swing.JTextField();
        mmButton = new javax.swing.JRadioButton();
        inchButton = new javax.swing.JRadioButton();
        encoderTabbedPane = new javax.swing.JTabbedPane();
        standardPanel = new javax.swing.JPanel();
        resolutionLabel1 = new javax.swing.JLabel();
        resolutionSpinner = new javax.swing.JSpinner();
        quadratureCheckBox = new javax.swing.JCheckBox();
        indexCheckBox = new javax.swing.JCheckBox();
        absolutePanel = new javax.swing.JPanel();
        grayCodeRadioButton = new javax.swing.JRadioButton();
        binaryCodeRadioButton = new javax.swing.JRadioButton();
        resolutionLabel2 = new javax.swing.JLabel();
        absoluteResolutionComboBox = new javax.swing.JComboBox();
        buttonPanel = new javax.swing.JPanel();
        printButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        exportButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        printMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        javax.swing.JMenuItem exitMenuItem = new javax.swing.JMenuItem();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();

        mainPanel.setMinimumSize(new java.awt.Dimension(760, 600));
        mainPanel.setName("mainPanel"); // NOI18N
        mainPanel.setPreferredSize(new java.awt.Dimension(760, 600));
        mainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainPanelMouseClicked(evt);
            }
        });

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(wheelencodergenerator.WheelEncoderGeneratorApp.class).getContext().getResourceMap(WheelEncoderGeneratorView.class);
        encoderPanel.setBackground(resourceMap.getColor("encoderPanel.background")); // NOI18N
        encoderPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(resourceMap.getColor("encoderPanel.border.highlightColor"), null)); // NOI18N
        encoderPanel.setMaximumSize(new java.awt.Dimension(200, 200));
        encoderPanel.setMinimumSize(new java.awt.Dimension(200, 200));
        encoderPanel.setName("encoderPanel"); // NOI18N
        encoderPanel.setPreferredSize(new java.awt.Dimension(200, 200));
        encoderPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encoderPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout encoderPanelLayout = new javax.swing.GroupLayout(encoderPanel);
        encoderPanel.setLayout(encoderPanelLayout);
        encoderPanelLayout.setHorizontalGroup(
            encoderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        encoderPanelLayout.setVerticalGroup(
            encoderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );

        controlPanel.setName("controlPanel"); // NOI18N
        controlPanel.setLayout(new java.awt.BorderLayout(0, 8));

        diameterPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        diameterPanel.setName("diameterPanel"); // NOI18N
        diameterPanel.setLayout(new java.awt.GridBagLayout());

        innerDiameterLabel.setLabelFor(innerDiameter);
        innerDiameterLabel.setText(resourceMap.getString("innerDiameterLabel.text")); // NOI18N
        innerDiameterLabel.setName("innerDiameterLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        diameterPanel.add(innerDiameterLabel, gridBagConstraints);

        innerDiameter.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        innerDiameter.setText(resourceMap.getString("innerDiameter.text")); // NOI18N
        innerDiameter.setName("innerDiameter"); // NOI18N
        innerDiameter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                innerDiameterFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        diameterPanel.add(innerDiameter, gridBagConstraints);

        outerDiameterLabel.setLabelFor(outerDiameter);
        outerDiameterLabel.setText(resourceMap.getString("outerDiameterLabel.text")); // NOI18N
        outerDiameterLabel.setName("outerDiameterLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        diameterPanel.add(outerDiameterLabel, gridBagConstraints);

        outerDiameter.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        outerDiameter.setText(resourceMap.getString("outerDiameter.text")); // NOI18N
        outerDiameter.setMinimumSize(new java.awt.Dimension(20, 20));
        outerDiameter.setName("outerDiameter"); // NOI18N
        outerDiameter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                outerDiameterFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        diameterPanel.add(outerDiameter, gridBagConstraints);

        buttonGroup1.add(mmButton);
        mmButton.setSelected(true);
        mmButton.setText(resourceMap.getString("mmButton.text")); // NOI18N
        mmButton.setName("mmButton"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 10, 0);
        diameterPanel.add(mmButton, gridBagConstraints);

        buttonGroup1.add(inchButton);
        inchButton.setText(resourceMap.getString("inchButton.text")); // NOI18N
        inchButton.setEnabled(false);
        inchButton.setName("inchButton"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 10, 0);
        diameterPanel.add(inchButton, gridBagConstraints);

        controlPanel.add(diameterPanel, java.awt.BorderLayout.CENTER);

        encoderTabbedPane.setMinimumSize(new java.awt.Dimension(198, 177));
        encoderTabbedPane.setName("encoderTabbedPane"); // NOI18N
        encoderTabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encoderTabbedPaneMouseClicked(evt);
            }
        });

        standardPanel.setName("standardPanel"); // NOI18N
        standardPanel.setLayout(new java.awt.GridBagLayout());

        resolutionLabel1.setLabelFor(resolutionSpinner);
        resolutionLabel1.setText(resourceMap.getString("resolutionLabel1.text")); // NOI18N
        resolutionLabel1.setName("resolutionLabel1"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        standardPanel.add(resolutionLabel1, gridBagConstraints);

        resolutionSpinner.setModel((SpinnerModel) resolutionSpinnerModel);
        resolutionSpinner.setMinimumSize(new java.awt.Dimension(30, 20));
        resolutionSpinner.setName("resolutionSpinner"); // NOI18N
        resolutionSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                resolutionSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        standardPanel.add(resolutionSpinner, gridBagConstraints);

        quadratureCheckBox.setText(resourceMap.getString("quadratureCheckBox.text")); // NOI18N
        quadratureCheckBox.setName("quadratureCheckBox"); // NOI18N
        quadratureCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                quadratureCheckBoxItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        standardPanel.add(quadratureCheckBox, gridBagConstraints);

        indexCheckBox.setText(resourceMap.getString("indexCheckBox.text")); // NOI18N
        indexCheckBox.setName("indexCheckBox"); // NOI18N
        indexCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                indexCheckBoxItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        standardPanel.add(indexCheckBox, gridBagConstraints);

        encoderTabbedPane.addTab(resourceMap.getString("standardPanel.TabConstraints.tabTitle"), standardPanel); // NOI18N

        absolutePanel.setName("absolutePanel"); // NOI18N
        absolutePanel.setLayout(new java.awt.GridBagLayout());

        buttonGroup2.add(grayCodeRadioButton);
        grayCodeRadioButton.setSelected(true);
        grayCodeRadioButton.setText(resourceMap.getString("grayCodeRadioButton.text")); // NOI18N
        grayCodeRadioButton.setName("grayCodeRadioButton"); // NOI18N
        grayCodeRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                grayCodeRadioButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 6;
        absolutePanel.add(grayCodeRadioButton, gridBagConstraints);

        buttonGroup2.add(binaryCodeRadioButton);
        binaryCodeRadioButton.setText(resourceMap.getString("binaryCodeRadioButton.text")); // NOI18N
        binaryCodeRadioButton.setName("binaryCodeRadioButton"); // NOI18N
        binaryCodeRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                binaryCodeRadioButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        absolutePanel.add(binaryCodeRadioButton, gridBagConstraints);

        resolutionLabel2.setLabelFor(absoluteResolutionComboBox);
        resolutionLabel2.setText(resourceMap.getString("resolutionLabel2.text")); // NOI18N
        resolutionLabel2.setName("resolutionLabel2"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 8);
        absolutePanel.add(resolutionLabel2, gridBagConstraints);

        absoluteResolutionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "4", "8", "16", "32", "64", "128", "256", "512", "1024", "2048", "4096" }));
        absoluteResolutionComboBox.setSelectedIndex(3);
        absoluteResolutionComboBox.setName("absoluteResolutionComboBox"); // NOI18N
        absoluteResolutionComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                absoluteResolutionComboBoxItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 10);
        absolutePanel.add(absoluteResolutionComboBox, gridBagConstraints);

        encoderTabbedPane.addTab(resourceMap.getString("absolutePanel.TabConstraints.tabTitle"), absolutePanel); // NOI18N

        controlPanel.add(encoderTabbedPane, java.awt.BorderLayout.PAGE_START);

        buttonPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buttonPanel.setName("buttonPanel"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(wheelencodergenerator.WheelEncoderGeneratorApp.class).getContext().getActionMap(WheelEncoderGeneratorView.class, this);
        printButton.setAction(actionMap.get("printEncoder")); // NOI18N
        printButton.setText(resourceMap.getString("printButton.text")); // NOI18N
        printButton.setName("printButton"); // NOI18N
        printButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printButtonMouseClicked(evt);
            }
        });

        saveButton.setText(resourceMap.getString("saveButton.text")); // NOI18N
        saveButton.setEnabled(false);
        saveButton.setName("saveButton"); // NOI18N

        exportButton.setText(resourceMap.getString("exportButton.text")); // NOI18N
        exportButton.setEnabled(false);
        exportButton.setName("exportButton"); // NOI18N

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(printButton, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(exportButton, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(printButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exportButton)
                .addContainerGap())
        );

        controlPanel.add(buttonPanel, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(encoderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(encoderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        menuBar.setName("menuBar"); // NOI18N
        menuBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBarMouseClicked(evt);
            }
        });

        fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N
        fileMenu.setName("fileMenu"); // NOI18N

        jMenuItem1.setText(resourceMap.getString("jMenuItem1.text")); // NOI18N
        jMenuItem1.setEnabled(false);
        jMenuItem1.setName("jMenuItem1"); // NOI18N
        fileMenu.add(jMenuItem1);

        jMenuItem2.setText(resourceMap.getString("jMenuItem2.text")); // NOI18N
        jMenuItem2.setEnabled(false);
        jMenuItem2.setName("jMenuItem2"); // NOI18N
        fileMenu.add(jMenuItem2);

        jSeparator3.setName("jSeparator3"); // NOI18N
        fileMenu.add(jSeparator3);

        jMenuItem3.setText(resourceMap.getString("jMenuItem3.text")); // NOI18N
        jMenuItem3.setEnabled(false);
        jMenuItem3.setName("jMenuItem3"); // NOI18N
        fileMenu.add(jMenuItem3);

        jMenuItem4.setText(resourceMap.getString("jMenuItem4.text")); // NOI18N
        jMenuItem4.setEnabled(false);
        jMenuItem4.setName("jMenuItem4"); // NOI18N
        fileMenu.add(jMenuItem4);

        jSeparator1.setName("jSeparator1"); // NOI18N
        fileMenu.add(jSeparator1);

        printMenuItem.setAction(actionMap.get("printEncoder")); // NOI18N
        printMenuItem.setText(resourceMap.getString("printMenuItem.text")); // NOI18N
        printMenuItem.setName("printMenuItem"); // NOI18N
        fileMenu.add(printMenuItem);

        jSeparator2.setName("jSeparator2"); // NOI18N
        fileMenu.add(jSeparator2);

        exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
        exitMenuItem.setName("exitMenuItem"); // NOI18N
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
        helpMenu.setName("helpMenu"); // NOI18N

        aboutMenuItem.setAction(actionMap.get("showAboutBox")); // NOI18N
        aboutMenuItem.setName("aboutMenuItem"); // NOI18N
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setComponent(mainPanel);
        setMenuBar(menuBar);
    }// </editor-fold>//GEN-END:initComponents

    private void quadratureCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_quadratureCheckBoxItemStateChanged
        encoder.setQuadratureTrack(evt.getStateChange() == ItemEvent.SELECTED);
        showPreview();
    }//GEN-LAST:event_quadratureCheckBoxItemStateChanged

    private void outerDiameterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_outerDiameterFocusLost
        showPreview();
    }//GEN-LAST:event_outerDiameterFocusLost

    private void innerDiameterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_innerDiameterFocusLost
        showPreview();
    }//GEN-LAST:event_innerDiameterFocusLost

    private void indexCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_indexCheckBoxItemStateChanged
        encoder.setIndexTrack(evt.getStateChange() == ItemEvent.SELECTED);
        showPreview();
    }//GEN-LAST:event_indexCheckBoxItemStateChanged

    private void encoderPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encoderPanelMouseClicked
        showPreview();
    }//GEN-LAST:event_encoderPanelMouseClicked

    private void mainPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMouseClicked
        showPreview();
    }//GEN-LAST:event_mainPanelMouseClicked

    private void menuBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarMouseClicked
        showPreview();
    }//GEN-LAST:event_menuBarMouseClicked

    private void printButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printButtonMouseClicked
        showPreview();
    }//GEN-LAST:event_printButtonMouseClicked

    private void resolutionSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_resolutionSpinnerStateChanged
        showPreview();
    }//GEN-LAST:event_resolutionSpinnerStateChanged

    private void absoluteResolutionComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_absoluteResolutionComboBoxItemStateChanged
        showPreview();
    }//GEN-LAST:event_absoluteResolutionComboBoxItemStateChanged

    private void grayCodeRadioButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grayCodeRadioButtonMouseReleased
        showPreview();
    }//GEN-LAST:event_grayCodeRadioButtonMouseReleased

    private void binaryCodeRadioButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_binaryCodeRadioButtonMouseReleased
        showPreview();
    }//GEN-LAST:event_binaryCodeRadioButtonMouseReleased

    private void encoderTabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encoderTabbedPaneMouseClicked
        showPreview();
    }//GEN-LAST:event_encoderTabbedPaneMouseClicked

    // TODO: Deal with improperly formatted numbers
    private boolean errorCheck()
    {
        boolean result=true;
        if ( Integer.parseInt(innerDiameter.getText()) >= Integer.parseInt(outerDiameter.getText()) ) {
            outerDiameterLabel.setForeground(Color.red);
            innerDiameterLabel.setForeground(Color.red);
            result = false;
        }
        else {
            outerDiameterLabel.setForeground(Color.black);
            innerDiameterLabel.setForeground(Color.black);
        }

        // Is resolution even (ok), or odd (not ok) ?
        if ( (Integer.parseInt(resolutionSpinner.getModel().getValue().toString()) % 2) > 0 ) {
            resolutionLabel2.setForeground(Color.red);
            result = false;
        }
        else {
            resolutionLabel2.setForeground(Color.black);
        }
        printButton.setEnabled(result);
        return result;
    }

    @Action
    public void showPreview()
    {
        encoder.setInnerDiameter(Integer.parseInt(innerDiameter.getText()));
        encoder.setOuterDiameter(Integer.parseInt(outerDiameter.getText()));

        // Absolute Encoder
        if (encoderTabbedPane.getSelectedIndex() == encoderTabbedPane.indexOfTab("Absolute")) {
            encoder.setType(encoder.ABSOLUTE);
            if (grayCodeRadioButton.isSelected() == true)
                encoder.setNumbering(encoder.GRAY);
            else if (binaryCodeRadioButton.isSelected() == true)
                encoder.setNumbering(encoder.BINARY);

            // ComboBox menu is set up so that # of tracks corresponds to selected index + 1
            encoder.setResolution(absoluteResolutionComboBox.getSelectedIndex()+1);
            System.out.println("Track count: " + Integer.toString(encoder.getResolution()) + "\n");
        }
        else if (encoderTabbedPane.getSelectedIndex() == encoderTabbedPane.indexOfTab("Standard")) {
            encoder.setType(encoder.STANDARD);
            encoder.setResolution(Integer.parseInt(resolutionSpinner.getModel().getValue().toString()));
        }
        if (errorCheck())
            encoderPanel.repaint();
    }

    // TODO: make sure there are no errors before printing
    @Action
    public void printEncoder() {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(encoderPanel);
        boolean doPrint = job.printDialog();
        if (doPrint) {
            try {
                job.print();
            } catch (PrinterException e) {
                // The job did not successfully complete
            }
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel absolutePanel;
    private javax.swing.JComboBox absoluteResolutionComboBox;
    private javax.swing.JRadioButton binaryCodeRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel diameterPanel;
    private wheelencodergenerator.EncoderPanel encoderPanel;
    private javax.swing.JTabbedPane encoderTabbedPane;
    private javax.swing.JButton exportButton;
    private javax.swing.JRadioButton grayCodeRadioButton;
    private javax.swing.JRadioButton inchButton;
    private javax.swing.JCheckBox indexCheckBox;
    private javax.swing.JTextField innerDiameter;
    private javax.swing.JLabel innerDiameterLabel;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JRadioButton mmButton;
    private javax.swing.JTextField outerDiameter;
    private javax.swing.JLabel outerDiameterLabel;
    private javax.swing.JButton printButton;
    private javax.swing.JMenuItem printMenuItem;
    private javax.swing.JCheckBox quadratureCheckBox;
    private javax.swing.JLabel resolutionLabel1;
    private javax.swing.JLabel resolutionLabel2;
    private javax.swing.JSpinner resolutionSpinner;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel standardPanel;
    // End of variables declaration//GEN-END:variables

    private SpinnerNumberModel resolutionSpinnerModel = new SpinnerNumberModel(16, 4, 36000, 2);
    private SpinnerNumberModel absoluteSpinnerModel = new SpinnerNumberModel(4, 2, 8, 1);
    private JDialog aboutBox;
}
