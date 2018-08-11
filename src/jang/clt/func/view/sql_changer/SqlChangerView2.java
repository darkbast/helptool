package jang.clt.func.view.sql_changer;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class SqlChangerView2 extends JFrame {
    private static final long serialVersionUID = 1L;
    public JTextArea txtaQuery = null;
    public JTextArea txtaParam = null;
    public JTextArea txtaRegExp = null;
    public JTextArea txtaResult = null;
    public JButton btnResult = null;


    public SqlChangerView2(){
        setPreferredSize(new Dimension(600, 480));
        setMinimumSize(new Dimension(10, 400));
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{480};
        gridBagLayout.rowHeights = new int[]{1, 3, 1, 3, 1, 3, 1, 3, 1};
        gridBagLayout.columnWeights = new double[]{0.0};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        setLayout(gridBagLayout);

        JPanel panelRegExp_1 = new JPanel();
        GridBagConstraints gbc_panelRegExp_1 = new GridBagConstraints();
        gbc_panelRegExp_1.fill = GridBagConstraints.BOTH;
        gbc_panelRegExp_1.insets = new Insets(0, 0, 5, 0);
        gbc_panelRegExp_1.gridx = 0;
        gbc_panelRegExp_1.gridy = 0;
        add(panelRegExp_1, gbc_panelRegExp_1);
        panelRegExp_1.setLayout(new BoxLayout(panelRegExp_1, BoxLayout.X_AXIS));
        JLabel lblRegExp = new JLabel("RegExp");
        panelRegExp_1.add(lblRegExp);
        lblRegExp.setHorizontalTextPosition(SwingConstants.LEFT);
        lblRegExp.setHorizontalAlignment(SwingConstants.LEFT);

        JPanel panelRegExp_2 = new JPanel();
        panelRegExp_2.setMinimumSize(new Dimension(10, 50));
        GridBagConstraints gbc_panelRegExp_2 = new GridBagConstraints();
        gbc_panelRegExp_2.fill = GridBagConstraints.BOTH;
        gbc_panelRegExp_2.insets = new Insets(0, 0, 5, 0);
        gbc_panelRegExp_2.gridx = 0;
        gbc_panelRegExp_2.gridy = 1;
        add(panelRegExp_2, gbc_panelRegExp_2);
        panelRegExp_2.setLayout(new BoxLayout(panelRegExp_2, BoxLayout.Y_AXIS));

        JScrollPane scrollPane = new JScrollPane();
        panelRegExp_2.add(scrollPane);

        txtaRegExp = new JTextArea();
        txtaRegExp.setMaximumSize(new Dimension(32767, 32767));
        scrollPane.setViewportView(txtaRegExp);

        txtaRegExp.setColumns(50);
        txtaRegExp.setRows(3);
        txtaRegExp.setLineWrap(true);

        JPanel panelQuery_1 = new JPanel();
        GridBagConstraints gbc_panelQuery_1 = new GridBagConstraints();
        gbc_panelQuery_1.fill = GridBagConstraints.BOTH;
        gbc_panelQuery_1.insets = new Insets(0, 0, 5, 0);
        gbc_panelQuery_1.gridx = 0;
        gbc_panelQuery_1.gridy = 2;
        add(panelQuery_1, gbc_panelQuery_1);
        panelQuery_1.setLayout(new BoxLayout(panelQuery_1, BoxLayout.X_AXIS));

        JLabel lblQuery = new JLabel("Query");
        lblQuery.setHorizontalTextPosition(SwingConstants.LEFT);
        lblQuery.setHorizontalAlignment(SwingConstants.LEFT);
        panelQuery_1.add(lblQuery);

        JPanel panelQuery_2 = new JPanel();
        GridBagConstraints gbc_panelQuery_2 = new GridBagConstraints();
        gbc_panelQuery_2.fill = GridBagConstraints.BOTH;
        gbc_panelQuery_2.insets = new Insets(0, 0, 5, 0);
        gbc_panelQuery_2.gridx = 0;
        gbc_panelQuery_2.gridy = 3;
        add(panelQuery_2, gbc_panelQuery_2);
        panelQuery_2.setLayout(new BoxLayout(panelQuery_2, BoxLayout.Y_AXIS));

        JScrollPane scrollPane_1 = new JScrollPane();
        panelQuery_2.add(scrollPane_1);

        txtaQuery = new JTextArea();
        scrollPane_1.setViewportView(txtaQuery);
        txtaQuery.setMinimumSize(new Dimension(4, 50));
        txtaQuery.setColumns(5);
        txtaQuery.setRows(3);
        txtaQuery.setLineWrap(true);
       
        JPanel panelParam_1 = new JPanel();
        GridBagConstraints gbc_panelParam_1 = new GridBagConstraints();
        gbc_panelParam_1.fill = GridBagConstraints.BOTH;
        gbc_panelParam_1.insets = new Insets(0, 0, 5, 0);
        gbc_panelParam_1.gridx = 0;
        gbc_panelParam_1.gridy = 4;
        add(panelParam_1, gbc_panelParam_1);
        panelParam_1.setLayout(new BoxLayout(panelParam_1, BoxLayout.Y_AXIS));

        JLabel lblParam = new JLabel("ParameTer");
        panelParam_1.add(lblParam);

        JPanel panelParam_2 = new JPanel();
        GridBagConstraints gbc_panelParam_2 = new GridBagConstraints();
        gbc_panelParam_2.fill = GridBagConstraints.BOTH;
        gbc_panelParam_2.insets = new Insets(0, 0, 5, 0);
        gbc_panelParam_2.gridx = 0;
        gbc_panelParam_2.gridy = 5;
        add(panelParam_2, gbc_panelParam_2);
        panelParam_2.setLayout(new BoxLayout(panelParam_2, BoxLayout.Y_AXIS));

        JScrollPane scrollPane_2 = new JScrollPane();
        panelParam_2.add(scrollPane_2);

        txtaParam = new JTextArea();
        scrollPane_2.setViewportView(txtaParam);
        txtaParam.setMinimumSize(new Dimension(4, 50));
        txtaParam.setColumns(50);
        txtaParam.setRows(3);
        txtaParam.setLineWrap(true);
       
        JPanel panelResult_1 = new JPanel();
        GridBagConstraints gbc_panelResult_1 = new GridBagConstraints();
        gbc_panelResult_1.fill = GridBagConstraints.BOTH;
        gbc_panelResult_1.insets = new Insets(0, 0, 5, 0);
        gbc_panelResult_1.gridx = 0;
        gbc_panelResult_1.gridy = 6;
        add(panelResult_1, gbc_panelResult_1);
        panelResult_1.setLayout(new BoxLayout(panelResult_1, BoxLayout.Y_AXIS));

        JLabel lblResult = new JLabel("Result");
        panelResult_1.add(lblResult);

        JPanel panelResult_2 = new JPanel();
        GridBagConstraints gbc_panelResult_2 = new GridBagConstraints();
        gbc_panelResult_2.fill = GridBagConstraints.BOTH;
        gbc_panelResult_2.insets = new Insets(0, 0, 5, 0);
        gbc_panelResult_2.gridx = 0;
        gbc_panelResult_2.gridy = 7;
        add(panelResult_2, gbc_panelResult_2);
        panelResult_2.setLayout(new BoxLayout(panelResult_2, BoxLayout.Y_AXIS));

        JScrollPane scrollPane_3 = new JScrollPane();
        panelResult_2.add(scrollPane_3);

        txtaResult = new JTextArea();
        txtaResult.setRows(3);
        txtaResult.setColumns(50);
        txtaResult.setLineWrap(true);
       
        scrollPane_3.setViewportView(txtaResult);
        txtaResult.setMinimumSize(new Dimension(4, 50));

        JPanel panelResult_3 = new JPanel();
        GridBagConstraints gbc_panelResult_3 = new GridBagConstraints();
        gbc_panelResult_3.fill = GridBagConstraints.BOTH;
        gbc_panelResult_3.gridx = 0;
        gbc_panelResult_3.gridy = 8;
        add(panelResult_3, gbc_panelResult_3);

        btnResult = new JButton("Result");
        panelResult_3.add(btnResult);   
    }

    public JTextArea getTxtaQuery() {
        return txtaQuery;
    }

    public void setTxtaQuery(JTextArea txtaQuery) {
        this.txtaQuery = txtaQuery;
    }

    public JTextArea getTxtaParam() {
        return txtaParam;
    }

    public void setTxtaParam(JTextArea txtaParam) {
        this.txtaParam = txtaParam;
    }

    public JTextArea getTxtaRegExp() {
        return txtaRegExp;
    }

    public void setTxtaRegExp(JTextArea txtaRegExp) {
        this.txtaRegExp = txtaRegExp;
    }

    public JTextArea getTxtaResult() {
        return txtaResult;
    }

    public void setTxtaResult(JTextArea txtaResult) {
        this.txtaResult = txtaResult;
    }

    public JButton getBtnResult() {
        return btnResult;
    }

    public void setBtnResult(JButton btnResult) {
        this.btnResult = btnResult;
    }

}
