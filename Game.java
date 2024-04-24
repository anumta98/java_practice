package rockpaperscissorsGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class Game extends JFrame{
	private JButton  rockButton, paperButton, scissorsButton;
    private JLabel resultLabel;

    public   Game() {
        setTitle("Rock, Paper, Scissors");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        rockButton = new JButton("Rock");
        paperButton = new JButton("Paper");
        scissorsButton = new JButton("Scissors");
        resultLabel = new JLabel();

        add(rockButton);
        add(paperButton);
        add(scissorsButton);
        add(resultLabel);

        rockButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                play("Rock");
            }
        });

        paperButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                play("Paper");
            }
        });

        scissorsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                play("Scissors");
            }
        });

        setVisible(true);
    }

    private void play(String playerChoice) {
        Random random = new Random();
        int computerChoice = random.nextInt(3); // 0 = Rock, 1 = Paper, 2 = Scissors

        String computerChoiceStr = "";
        switch (computerChoice) {
            case 0:
                computerChoiceStr = "Rock";
                break;
            case 1:
                computerChoiceStr = "Paper";
                break;
            case 2:
                computerChoiceStr = "Scissors";
                break;
        }

        resultLabel.setText("Computer chooses: " + computerChoiceStr);

        if (playerChoice.equals(computerChoiceStr)) {
            resultLabel.setText(resultLabel.getText() + ". It's a tie!");
        } else if ((playerChoice.equals("Rock") && computerChoiceStr.equals("Scissors")) ||
                   (playerChoice.equals("Paper") && computerChoiceStr.equals("Rock")) ||
                   (playerChoice.equals("Scissors") && computerChoiceStr.equals("Paper"))) {
            resultLabel.setText(resultLabel.getText() + ". You win!");
        } else {
            resultLabel.setText(resultLabel.getText() + ". Computer wins!");
        }
    }

    public static void main(String[] args) {
    	SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Game(); // Create an instance of the Game class
            }
        });
    }
}


