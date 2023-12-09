import java.awt.*;
import java.awt.event.*;

public class AwtJframe extends Frame implements ActionListener {

    private TextField nameField;
    private TextArea addressArea;
    private Choice countryChoice;
    private CheckboxGroup genderGroup;
    private Checkbox maleCheckbox, femaleCheckbox;
    private Button submitButton;

    public AwtJframe() {
        super("Simple Form");

        // Create labels and input fields
        Label nameLabel = new Label("Name:");
        nameField = new TextField(20);

        Label addressLabel = new Label("Address:");
        addressArea = new TextArea(5, 20);

        Label countryLabel = new Label("Country:");
        countryChoice = new Choice();
        countryChoice.add("India");
        countryChoice.add("USA");
        countryChoice.add("Canada");

        Label genderLabel = new Label("Gender:");

        // Create and configure a CheckboxGroup for single selection
        genderGroup = new CheckboxGroup();
        maleCheckbox = new Checkbox("Male", genderGroup, false);
        femaleCheckbox = new Checkbox("Female", genderGroup, false);

        submitButton = new Button("Submit");
        submitButton.addActionListener(this);

        // Set the layout to GridBagLayout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Padding

        // Add components using GridBagConstraints for precise layout
        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(addressLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridheight = 4;
        add(addressArea, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridheight = 1;
        add(countryLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        add(countryChoice, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        add(genderLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        add(maleCheckbox, gbc);

        gbc.gridx = 2;
        gbc.gridy = 6;
         gbc.insets = new Insets(5, 1, 5, 1);
        add(femaleCheckbox, gbc);

        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(submitButton, gbc);

        setSize(400, 300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String address = addressArea.getText();
            String country = countryChoice.getSelectedItem();
            String gender = (maleCheckbox.getState()) ? "Male" : "Female";

            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Country: " + country);
            System.out.println("Gender: " + gender);
        }
    }

    public static void main(String[] args) {
        new AwtJframe();
    }
}
