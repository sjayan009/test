import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Chess 
{
    private static final int BOARD_SIZE = 8;
    private static final Color LIGHT_SQUARE = new Color(240, 217, 181);
    private static final Color DARK_SQUARE = new Color(181, 136, 99);

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        JFrame frame = new JFrame();
        JPanel mainPanel = new JPanel();
        String playerColor = null;
        String computerColor = null;

        System.out.println("Welcome to Chess!");
        System.out.println("Press enter to continue");
        scanner.nextLine();
    
        System.out.println("Type white or black to choose your color.");

        String color = scanner.nextLine();

        if(color.equals("white") || color.equals("White") || color.equals("WHITE")) 
        {
            System.out.println("You are white.");
            playerColor = "white";
            computerColor = "black";
        }
        else if(color.equals("black") || color.equals("Black") || color.equals("BLACK")) 
        {
            System.out.println("You are black.");
            playerColor = "black";
            computerColor = "white";
        }
        else 
        {
            System.out.println("You had one job. Type white or black. Now restart the program and try again.");
            System.exit(0);
        }

        // Create chess board and chess pieces
        JPanel chessBoard = new JPanel(new GridLayout(BOARD_SIZE, BOARD_SIZE));
        chessBoard.setSize(1000, 1000);
        chessBoard.setPreferredSize(new java.awt.Dimension(1000, 1000));

        ImageIcon BlackRook = new ImageIcon("C:\\Users\\edwin\\CodingProjects\\JavaProjects\\src\\main\\resources\\java\\ChessPieces\\BlackRook.png");
        JLabel BlackRookLabel = new JLabel(BlackRook);
        frame.add(BlackRookLabel);
        frame.pack();
        frame.setVisible(true);

        ImageIcon WhiteRook = new ImageIcon("C:\\Users\\edwin\\CodingProjects\\JavaProjects\\src\\main\\resources\\java\\ChessPieces\\WhiteRook.png");
        JLabel WhiteRookLabel = new JLabel(WhiteRook);
        frame.add(WhiteRookLabel);
        frame.pack();
        frame.setVisible(true);

        ImageIcon BlackKnight = new ImageIcon("C:\\Users\\edwin\\CodingProjects\\JavaProjects\\src\\main\\resources\\java\\ChessPieces\\BlackKnight.png");
        JLabel BlackKnightLabel = new JLabel(BlackKnight);
        frame.add(BlackKnightLabel);
        frame.pack();
        frame.setVisible(true);

        ImageIcon WhiteKnight = new ImageIcon("C:\\Users\\edwin\\CodingProjects\\JavaProjects\\src\\main\\resources\\java\\ChessPieces\\WhiteKnight.png");
        JLabel WhiteKnightLabel = new JLabel(WhiteKnight);
        frame.add(WhiteKnightLabel);
        frame.pack();
        frame.setVisible(true);

        ImageIcon BlackBishop = new ImageIcon("C:\\Users\\edwin\\CodingProjects\\JavaProjects\\src\\main\\resources\\java\\ChessPieces\\BlackBishop.png");
        JLabel BlackBishopLabel = new JLabel(BlackBishop);
        frame.add(BlackBishopLabel);
        frame.pack();
        frame.setVisible(true);

        ImageIcon WhiteBishop = new ImageIcon("C:\\Users\\edwin\\CodingProjects\\JavaProjects\\src\\main\\resources\\java\\ChessPieces\\WhiteBishop.png");
        JLabel WhiteBishopLabel = new JLabel(WhiteBishop);
        frame.add(WhiteBishopLabel);
        frame.pack();
        frame.setVisible(true);

        ImageIcon BlackQueen = new ImageIcon("C:\\Users\\edwin\\CodingProjects\\JavaProjects\\src\\main\\resources\\java\\ChessPieces\\BlackQueen.png");
        JLabel BlackQueenLabel = new JLabel(BlackQueen);
        frame.add(BlackQueenLabel);
        frame.pack();
        frame.setVisible(true);

        ImageIcon WhiteQueen = new ImageIcon("C:\\Users\\edwin\\CodingProjects\\JavaProjects\\src\\main\\resources\\java\\ChessPieces\\WhiteQueen.png");
        JLabel WhiteQueenLabel = new JLabel(WhiteQueen);
        frame.add(WhiteQueenLabel);
        frame.pack();
        frame.setVisible(true);

        ImageIcon BlackKing = new ImageIcon("C:\\Users\\edwin\\CodingProjects\\JavaProjects\\src\\main\\resources\\java\\ChessPieces\\BlackKing.png");
        JLabel BlackKingLabel = new JLabel(BlackKing);
        frame.add(BlackKingLabel);
        frame.pack();
        frame.setVisible(true);

        ImageIcon WhiteKing = new ImageIcon("C:\\Users\\edwin\\CodingProjects\\JavaProjects\\src\\main\\resources\\java\\ChessPieces\\WhiteKing.png");
        JLabel WhiteKingLabel = new JLabel(WhiteKing);
        frame.add(WhiteKingLabel);
        frame.pack();
        frame.setVisible(true);

        // Create squares
        for (int row = 0; row < BOARD_SIZE; row++) 
        {
            for (int col = 0; col < BOARD_SIZE; col++) 
            {
                JPanel square = new JPanel();
                square.setBackground((row + col) % 2 == 0 ? LIGHT_SQUARE : DARK_SQUARE);
                chessBoard.add(square);

                frame.add(WhiteKingLabel);
            }
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(854, 480);
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        mainPanel.setBackground(Color.BLUE);
        mainPanel.add(chessBoard);
        frame.add(mainPanel);

        JLabel title = new JLabel("Chess");
        title.setFont(new Font("Arial", Font.BOLD, 48));
        title.setForeground(Color.WHITE);
        mainPanel.add(title);

        JLabel playerLabel = new JLabel("Player: " + playerColor + "; " + "Computer: " + computerColor);
        mainPanel.add(playerLabel);
    }
} 
