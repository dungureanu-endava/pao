package ro.unibuc.gui.frame;

import ro.unibuc.gui.model.GameReview;
import ro.unibuc.gui.model.GameType;
import ro.unibuc.gui.service.GameReviewsService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

    private final GameReviewsService service;
    private final DefaultListModel<GameReview> listModel;

    private JTextField gameNameTextField;
    private JTextField scoreTextField;
    private JComboBox<String> gameTypeComboBox;
    private JTextField developerTextField;

    private JList gameReviewsList;
    private DefaultTableModel gameReviewsTableModel;

    public MainFrame() {
        initComponents();
        service = new GameReviewsService();
        listModel = new DefaultListModel<>();
        gameReviewsList.setModel(listModel);
        displayGameReviews();
    }

    private void initComponents() {
        setTitle("Game Reviews");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));

        //======== Menu Bar ========
        setJMenuBar(createMenuBar());

        //======== Root Panel ========
        contentPane.add(createRootPanel());

        pack();
        setLocationRelativeTo(getOwner());
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        {
            //======== Menu ========
            JMenu menu = new JMenu();
            menu.setText("Menu");

            //---- About Menu Item ----
            JMenuItem aboutMenuItem = new JMenuItem();
            aboutMenuItem.setText("About");
            aboutMenuItem.addActionListener(this::aboutMenuItemAction);
            menu.add(aboutMenuItem);

            //---- Exit Menu Item ----
            JMenuItem exitMenuItem = new JMenuItem();
            exitMenuItem.setText("Exit");
            exitMenuItem.addActionListener(this::exitMenuItemAction);
            menu.add(exitMenuItem);

            menuBar.add(menu);
        }

        return menuBar;
    }

    private JPanel createRootPanel() {
        JPanel rootPanel = new JPanel();

        rootPanel.setPreferredSize(new Dimension(1000, 500));
        rootPanel.setLayout(new GridLayout(1, 2));

        //======== Form Panel ========
        rootPanel.add(createFormPanel());

        //======== View Panel ========
        rootPanel.add(createViewPanel());

        return rootPanel;
    }

    private JPanel createFormPanel() {
        JPanel formPanel = new JPanel();
        //======== formPanel ========

        formPanel.setLayout(new GridLayout(10, 1));

        {
            //======== Game Name Input Panel ========
            JPanel gameNameInputPanel = new JPanel();
            gameNameInputPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

            //---- Game Name Input Label ----
            JLabel gameNameInputLabel = new JLabel();
            gameNameInputLabel.setText("Game Name:");
            gameNameInputPanel.add(gameNameInputLabel);

            //---- Game Name Text Field ----
            gameNameTextField = new JTextField();
            gameNameTextField.setColumns(20);
            gameNameInputPanel.add(gameNameTextField);

            formPanel.add(gameNameInputPanel);
        }

        {
            //======== Rating Input Panel ========
            JPanel ratingInputPanel = new JPanel();
            ratingInputPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

            //---- Rating Input Label ----
            JLabel ratingInputLabel = new JLabel();
            ratingInputLabel.setText("Rating:");
            ratingInputPanel.add(ratingInputLabel);

            //---- Score Text Field ----
            scoreTextField = new JTextField();
            scoreTextField.setColumns(6);
            ratingInputPanel.add(scoreTextField);

            //---- Rating Start Label ----
            JLabel ratingStartLabel = new JLabel();
            ratingStartLabel.setText("*");
            ratingInputPanel.add(ratingStartLabel);

            formPanel.add(ratingInputPanel);
        }

        {
            //======== Game Type Combo Panel ========
            JPanel gameTypeComboPanel = new JPanel();
            gameTypeComboPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

            //---- Game Type Combo Label ----
            JLabel gameTypeComboLabel = new JLabel();
            gameTypeComboLabel.setText("Game Type:");
            gameTypeComboPanel.add(gameTypeComboLabel);

            //---- Game Type Combo Box ----
            gameTypeComboBox = new JComboBox<>();
            gameTypeComboBox.setModel(new DefaultComboBoxModel<>(new String[]{
                    "ACTION",
                    "RPG",
                    "ADVENTURE"
            }));
            gameTypeComboBox.setEditable(false);
            gameTypeComboPanel.add(gameTypeComboBox);

            formPanel.add(gameTypeComboPanel);
        }

        {
            //======== Developer Input Panel ========
            JPanel developerInputPanel = new JPanel();
            developerInputPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

            //---- Developer Input Label ----
            JLabel developerInputLabel = new JLabel();
            developerInputLabel.setText("Developer:");
            developerInputPanel.add(developerInputLabel);

            //---- Developer Text Field ----
            developerTextField = new JTextField();
            developerTextField.setColumns(20);
            developerInputPanel.add(developerTextField);

            formPanel.add(developerInputPanel);
        }

        {
            //======== Add Button Panel ========
            JPanel addButtonPanel = new JPanel();
            addButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

            //---- Add Game Review Button ----
            JButton addGameReviewButton = new JButton();
            addGameReviewButton.setText("Add Game Review");
            addGameReviewButton.addActionListener(this::addGameReviewButtonAction);
            addButtonPanel.add(addGameReviewButton);

            formPanel.add(addButtonPanel);
        }

        return formPanel;
    }

    private JPanel createViewPanel() {
        JPanel viewPanel = new JPanel();
        viewPanel.setLayout(new GridLayout(2, 1));

        {
            //======== List View Panel ========
            JScrollPane listViewPanel = new JScrollPane();
            gameReviewsList = new JList();
            listViewPanel.setViewportView(gameReviewsList);

            viewPanel.add(listViewPanel);
        }

        {
            //======== Table View Panel ========
            JScrollPane tableViewPanel = new JScrollPane();

            String[] columnNames = {"Game", "Score", "Type", "Developer"};

            gameReviewsTableModel = new DefaultTableModel();
            gameReviewsTableModel.setColumnIdentifiers(columnNames);
            JTable gameReviewsTable = new JTable(gameReviewsTableModel);

            tableViewPanel.setViewportView(gameReviewsTable);

            viewPanel.add(tableViewPanel);
        }

        return viewPanel;
    }

    private void addGameReviewButtonAction(ActionEvent e) {
        String gameName = gameNameTextField.getText().toUpperCase();
        double score = Double.parseDouble(scoreTextField.getText());
        GameType type = GameType.valueOf(gameTypeComboBox.getSelectedItem().toString());
        String developer = developerTextField.getText();
        service.addGameReview(new GameReview(gameName, score, type, developer));

        JOptionPane.showMessageDialog(this, "The game review was added.", "Info",
                JOptionPane.PLAIN_MESSAGE);

        clearFields();
        displayGameReviews();
    }

    private void clearFields() {
        gameNameTextField.setText("");
        scoreTextField.setText("");
        gameTypeComboBox.setSelectedIndex(0);
        developerTextField.setText("");
    }

    private void displayGameReviews() {
        listModel.clear();
        service.getAllReviews().forEach(listModel::addElement);

        gameReviewsTableModel.setRowCount(0);
        service.getAllReviews().forEach(gameReview -> gameReviewsTableModel.insertRow(gameReviewsTableModel.getRowCount(), gameReview.getArray()));
    }

    private void exitMenuItemAction(ActionEvent event) {
        System.exit(0);
    }

    private void aboutMenuItemAction(ActionEvent event) {
        JOptionPane.showMessageDialog(this, "Details about the application!");
    }

}
