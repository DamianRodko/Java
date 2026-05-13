package games;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MazeGame extends JFrame
{
    private static int rows = 41;
    private static int columns = 41;
    private static int cellSize = 15;
    private int[][] maze = new int[rows][columns];
    private int playerRow;
    private int playerColumn;
    private int exitRow = rows - 2;
    private int exitColumn = columns - 2;
    private MazePanel mazePanel;
    private int score = 0;

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() ->
        {
            MazeGame mazeGame = new MazeGame();
            mazeGame.setVisible(true);
        });
    }
    //create maze
    public MazeGame()
    {
        //create window
        setTitle("Maze Game");
        setSize(cellSize * columns, cellSize * rows + 70);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        mazePanel = new MazePanel();
        add(mazePanel);
        //move player
        addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                movePlayer(e.getKeyCode());
                mazePanel.repaint();
            }
        });
        setFocusable(true);
        resetGame();
    }
    //reset game
    private void resetGame()
    {
        //starting point
        playerRow = 1;
        playerColumn = 1;
        generateMaze();
        mazePanel.repaint();
    }
    //generate maze
    private void generateMaze()
    {
        //generate maze
        for (int row = 0; row < rows; row++)
        {
            for (int col = 0; col < columns; col++)
            {
                maze[row][col] = 1;
            }
        }
        //randomize
        Random rand = new Random();
        Stack<int[]> stack = new Stack<>();
        int[] start = {1, 1};
        maze[1][1] = 0;
        stack.push(start);
        while (!stack.isEmpty())
        {
            int[] current = stack.peek();
            int row = current[0];
            int col = current[1];
            java.util.List<int[]> neighbors = new ArrayList<>();

            if (row > 2 && maze[row - 2][col] == 1)
            {
                neighbors.add(new int[]{row - 2, col});
            }
            if (row < rows - 3 && maze[row + 2][col] == 1)
            
            {
                neighbors.add(new int[]{row + 2, col});
            }
            if (col > 2 && maze[row][col - 2] == 1)
            {
                neighbors.add(new int[]{row, col - 2});
            }
            if (col < columns - 3 && maze[row][col + 2] == 1)
            {
                neighbors.add(new int[]{row, col + 2});
            }
            if (neighbors.isEmpty())
            {
                stack.pop();
            }
            else
            {
                Collections.shuffle(neighbors, rand);
                int[] chosen = neighbors.get(0);
                int newRow = chosen[0];
                int newCol = chosen[1];
                maze[newRow][newCol] = 0;
                maze[(row + newRow) / 2][(col + newCol) / 2] = 0;
                stack.push(chosen);
            }
        }
    }
    //move player
    private void movePlayer(int keyCode)
    {
        int newRow = playerRow;
        int newCol = playerColumn;
        //WASD keyboard listener
        switch (keyCode)
        {
            case KeyEvent.VK_W:
                newRow--;
                break;
            case KeyEvent.VK_S:
                newRow++;
                break;
            case KeyEvent.VK_A:
                newCol--;
                break;
            case KeyEvent.VK_D:
                newCol++;
                break;
        }
        if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < columns && maze[newRow][newCol] != 1)
        {
            playerRow = newRow;
            playerColumn = newCol;
            //check if won
            if (playerRow == exitRow && playerColumn == exitColumn)
            {
                //add score on win
                score++;
                showWinScreen();
            }
        }
    }
    //win screen
    private void showWinScreen()
    {
        JOptionPane.showMessageDialog(this, "Congratulations! You win!\nYour score: " + score, "Win Screen", JOptionPane.INFORMATION_MESSAGE);
        resetGame();
    }
    //color columns
    private class MazePanel extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            for (int row = 0; row < rows; row++)
            {
                for (int col = 0; col < columns; col++)
                {
                    int x = col * cellSize;
                    int y = row * cellSize;

                    if (maze[row][col] == 1)
                    {
                        g.setColor(Color.BLACK);
                        g.fillRect(x, y, cellSize, cellSize);
                    } else if (row == playerRow && col == playerColumn)
                    {
                        g.setColor(Color.RED);
                        g.fillOval(x, y, cellSize, cellSize);
                    } else if (row == exitRow && col == exitColumn)
                    {
                        g.setColor(Color.GREEN);
                        g.fillRect(x, y, cellSize, cellSize);
                    }
                }
            }

            // Display score
            g.setColor(Color.BLACK);
            g.drawString("Score: " + score, 10, cellSize * rows + 20);
        }

        public Dimension getPreferredSize()
        {
            return new Dimension(cellSize * columns, cellSize * rows + 40);  // Adjust for score display
        }
    }
}