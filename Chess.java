import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Chess 
{

    private static final int BOARD_SIZE = 8;
    private static final Color LIGHT_SQUARE = new Color(240, 217, 181);
    private static final Color DARK_SQUARE = new Color(181, 136, 99);

    private static JPanel[] array = new JPanel[64];

    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        JPanel container = new JPanel();
        frame.setVisible(true);
        frame.setSize(1000, 1000);
 

        JPanel chessBoard = new JPanel(new GridLayout(BOARD_SIZE, BOARD_SIZE));
        chessBoard.setSize(400, 400);
        chessBoard.setPreferredSize(new Dimension(800, 800));
        
        int i = -1;
        // Create squares
        for (int row = 0; row < BOARD_SIZE; row++) 
        {
            for (int col = 0; col < BOARD_SIZE; col++) 
            {
                JPanel square = new JPanel();
                square.setBackground((row + col) % 2 == 0 ? LIGHT_SQUARE : DARK_SQUARE);
                array[i+1] = square;
                chessBoard.add(square);
                i = i + 1;
            }
        }

        ImageIcon bPawn = new ImageIcon("C:\\Users\\Jayan Sirikonda\\.vscode\\Dathan_Project\\JavaProjects\\pieces-png\\black-pawn.png");
        JLabel bPawnLabel = new JLabel(bPawn);
        
        bPawnLabel.setPreferredSize(new Dimension(70, 90));


        array[0].add(bPawnLabel);
        

        container.add(chessBoard);

        frame.add(container);      
        frame.setVisible(true);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}
