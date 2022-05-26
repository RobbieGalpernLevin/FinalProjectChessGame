import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.Icon;
import java.awt.event.MouseListener;
import java.awt.GridLayout;

import java.util.Arrays;

public class GUI implements MouseListener
{
    private JFrame frame;
    private JPanel board;
    private ImageIcon WPL;
    private ImageIcon WPD;
    private ImageIcon WRL;
    private ImageIcon WRD;
    private ImageIcon WNL;
    private ImageIcon WND;
    private ImageIcon WBL;
    private ImageIcon WBD;
    private ImageIcon WQL;
    private ImageIcon WQD;
    private ImageIcon WKL;
    private ImageIcon WKD;
    private ImageIcon BPL;
    private ImageIcon BPD;
    private ImageIcon BRL;
    private ImageIcon BRD;
    private ImageIcon BNL;
    private ImageIcon BND;
    private ImageIcon BBL;
    private ImageIcon BBD;
    private ImageIcon BQL;
    private ImageIcon BQD;
    private ImageIcon BKL;
    private ImageIcon BKD;
    private ImageIcon LSQ;
    private ImageIcon DSQ;
    private JLabel a1;
    private JLabel a2;
    private JLabel a3;
    private JLabel a4;
    private JLabel a5;
    private JLabel a6;
    private JLabel a7;
    private JLabel a8;
    private JLabel b1;
    private JLabel b2;
    private JLabel b3;
    private JLabel b4;
    private JLabel b5;
    private JLabel b6;
    private JLabel b7;
    private JLabel b8;
    private JLabel c1;
    private JLabel c2;
    private JLabel c3;
    private JLabel c4;
    private JLabel c5;
    private JLabel c6;
    private JLabel c7;
    private JLabel c8;
    private JLabel d1;
    private JLabel d2;
    private JLabel d3;
    private JLabel d4;
    private JLabel d5;
    private JLabel d6;
    private JLabel d7;
    private JLabel d8;
    private JLabel e1;
    private JLabel e2;
    private JLabel e3;
    private JLabel e4;
    private JLabel e5;
    private JLabel e6;
    private JLabel e7;
    private JLabel e8;
    private JLabel f1;
    private JLabel f2;
    private JLabel f3;
    private JLabel f4;
    private JLabel f5;
    private JLabel f6;
    private JLabel f7;
    private JLabel f8;
    private JLabel g1;
    private JLabel g2;
    private JLabel g3;
    private JLabel g4;
    private JLabel g5;
    private JLabel g6;
    private JLabel g7;
    private JLabel g8;
    private JLabel h1;
    private JLabel h2;
    private JLabel h3;
    private JLabel h4;
    private JLabel h5;
    private JLabel h6;
    private JLabel h7;
    private JLabel h8;

    private Game game;

    public GUI()
    {
        frame = new JFrame("Chess");
        frame.setResizable(false);
        frame.setLocation(700, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board = new JPanel();
        game = new Game();
        WPL = new ImageIcon("src/WPL.png");
        WPD = new ImageIcon("src/WPD.png");
        WRL = new ImageIcon("src/WRL.png");
        WRD = new ImageIcon("src/WRD.png");
        WNL = new ImageIcon("src/WNL.png");
        WND = new ImageIcon("src/WND.png");
        WBL = new ImageIcon("src/WBL.png");
        WBD = new ImageIcon("src/WBD.png");
        WQL = new ImageIcon("src/WQL.png");
        WQD = new ImageIcon("src/WQD.png");
        WKL = new ImageIcon("src/WKL.png");
        WKD = new ImageIcon("src/WKD.png");
        BPL = new ImageIcon("src/BPL.png");
        BPD = new ImageIcon("src/BPD.png");
        BRL = new ImageIcon("src/BRL.png");
        BRD = new ImageIcon("src/BRD.png");
        BNL = new ImageIcon("src/BNL.png");
        BND = new ImageIcon("src/BND.png");
        BBL = new ImageIcon("src/BBL.png");
        BBD = new ImageIcon("src/BBD.png");
        BQL = new ImageIcon("src/BQL.png");
        BQD = new ImageIcon("src/BQD.png");
        BKL = new ImageIcon("src/BKL.png");
        BKD = new ImageIcon("src/BKD.png");
        LSQ = new ImageIcon("src/LSQ.png");
        DSQ = new ImageIcon("src/DSQ.png");

        Image LSQImage = LSQ.getImage();
        Image scaledLSQ = LSQImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        LSQ = new ImageIcon(scaledLSQ);

        Image DSQImage = DSQ.getImage();
        Image scaledDSQ = DSQImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        DSQ = new ImageIcon(scaledDSQ);

        Image WPLImage = WPL.getImage();
        Image scaledWPL = WPLImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        WPL = new ImageIcon(scaledWPL);

        Image WPDImage = WPD.getImage();
        Image scaledWPD = WPDImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        WPD = new ImageIcon(scaledWPD);

        Image WRLImage = WRL.getImage();
        Image scaledWRL = WRLImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        WRL = new ImageIcon(scaledWRL);

        Image WRDImage = WRD.getImage();
        Image scaledWRD = WRDImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        WRD = new ImageIcon(scaledWRD);

        Image WNLImage = WNL.getImage();
        Image scaledWNL = WNLImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        WNL = new ImageIcon(scaledWNL);

        Image WNDImage = WND.getImage();
        Image scaledWND = WNDImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        WND = new ImageIcon(scaledWND);

        Image WBLImage = WBL.getImage();
        Image scaledWBL = WBLImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        WBL = new ImageIcon(scaledWBL);

        Image WBDImage = WBD.getImage();
        Image scaledWBD = WBDImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        WBD = new ImageIcon(scaledWBD);

        Image WQLImage = WQL.getImage();
        Image scaledWQL = WQLImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        WQL = new ImageIcon(scaledWQL);

        Image WQDImage = WQD.getImage();
        Image scaledWQD = WQDImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        WQD = new ImageIcon(scaledWQD);

        Image WKLImage = WKL.getImage();
        Image scaledWKL = WKLImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        WKL = new ImageIcon(scaledWKL);

        Image WKDImage = WKD.getImage();
        Image scaledWKD = WKDImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        WKD = new ImageIcon(scaledWKD);

        Image BPLImage = BPL.getImage();
        Image scaledBPL = BPLImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        BPL = new ImageIcon(scaledBPL);

        Image BPDImage = BPD.getImage();
        Image scaledBPD = BPDImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        BPD = new ImageIcon(scaledBPD);
        Image BRLImage = BRL.getImage();
        Image scaledBRL = BRLImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        BRL = new ImageIcon(scaledBRL);

        Image BRDImage = BRD.getImage();
        Image scaledBRD = BRDImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        BRD = new ImageIcon(scaledBRD);

        Image BNLImage = BNL.getImage();
        Image scaledBNL = BNLImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        BNL = new ImageIcon(scaledBNL);

        Image BNDImage = BND.getImage();
        Image scaledBND = BNDImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        BND = new ImageIcon(scaledBND);

        Image BBLImage = BBL.getImage();
        Image scaledBBL = BBLImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        BBL = new ImageIcon(scaledBBL);

        Image BBDImage = BBD.getImage();
        Image scaledBBD = BBDImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        BBD = new ImageIcon(scaledBBD);

        Image BQLImage = BQL.getImage();
        Image scaledBQL = BQLImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        BQL = new ImageIcon(scaledBQL);

        Image BQDImage = BQD.getImage();
        Image scaledBQD = BQDImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        BQD = new ImageIcon(scaledBQD);

        Image BKLImage = BKL.getImage();
        Image scaledBKL = BKLImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        BKL = new ImageIcon(scaledBKL);

        a8 = new JLabel(BRL);
        b8 = new JLabel(BND);
        c8 = new JLabel(BBL);
        d8 = new JLabel(BQD);
        e8 = new JLabel(BKL);
        f8 = new JLabel(BBD);
        g8 = new JLabel(BNL);
        h8 = new JLabel(BRD);
        a7 = new JLabel(BPD);
        b7 = new JLabel(BPL);
        c7 = new JLabel(BPD);
        d7 = new JLabel(BPL);
        e7 = new JLabel(BPD);
        f7 = new JLabel(BPL);
        g7 = new JLabel(BPD);
        h7 = new JLabel(BPL);
        a6 = new JLabel(LSQ);
        b6 = new JLabel(DSQ);
        c6 = new JLabel(LSQ);
        d6 = new JLabel(DSQ);
        e6 = new JLabel(LSQ);
        f6 = new JLabel(DSQ);
        g6 = new JLabel(LSQ);
        h6 = new JLabel(DSQ);
        a5 = new JLabel(DSQ);
        b5 = new JLabel(LSQ);
        c5 = new JLabel(DSQ);
        d5 = new JLabel(LSQ);
        e5 = new JLabel(DSQ);
        f5 = new JLabel(LSQ);
        g5 = new JLabel(DSQ);
        h5 = new JLabel(LSQ);
        a4 = new JLabel(LSQ);
        b4 = new JLabel(DSQ);
        c4 = new JLabel(LSQ);
        d4 = new JLabel(DSQ);
        e4 = new JLabel(LSQ);
        f4 = new JLabel(DSQ);
        g4 = new JLabel(LSQ);
        h4 = new JLabel(DSQ);
        a3 = new JLabel(DSQ);
        b3 = new JLabel(LSQ);
        c3 = new JLabel(DSQ);
        d3 = new JLabel(LSQ);
        e3 = new JLabel(DSQ);
        f3 = new JLabel(LSQ);
        g3 = new JLabel(DSQ);
        h3 = new JLabel(LSQ);
        a2 = new JLabel(WPL);
        b2 = new JLabel(WPD);
        c2 = new JLabel(WPL);
        d2 = new JLabel(WPD);
        e2 = new JLabel(WPL);
        f2 = new JLabel(WPD);
        g2 = new JLabel(WPL);
        h2 = new JLabel(WPD);
        a1 = new JLabel(WRD);
        b1 = new JLabel(WNL);
        c1 = new JLabel(WBD);
        d1 = new JLabel(WQL);
        e1 = new JLabel(WKD);
        f1 = new JLabel(WBL);
        g1 = new JLabel(WND);
        h1 = new JLabel(WRL);

        game = new Game();

    }

    public void setupGUI()
    {
        board.setLayout(new GridLayout(8, 8));
        board.add(a8);
        board.add(b8);
        board.add(c8);
        board.add(d8);
        board.add(e8);
        board.add(f8);
        board.add(g8);
        board.add(h8);
        board.add(a7);
        board.add(b7);
        board.add(c7);
        board.add(d7);
        board.add(e7);
        board.add(f7);
        board.add(g7);
        board.add(h7);
        board.add(a6);
        board.add(b6);
        board.add(c6);
        board.add(d6);
        board.add(e6);
        board.add(f6);
        board.add(g6);
        board.add(h6);
        board.add(a5);
        board.add(b5);
        board.add(c5);
        board.add(d5);
        board.add(e5);
        board.add(f5);
        board.add(g5);
        board.add(h5);
        board.add(a4);
        board.add(b4);
        board.add(c4);
        board.add(d4);
        board.add(e4);
        board.add(f4);
        board.add(g4);
        board.add(h4);
        board.add(a3);
        board.add(b3);
        board.add(c3);
        board.add(d3);
        board.add(e3);
        board.add(f3);
        board.add(g3);
        board.add(h3);
        board.add(a2);
        board.add(b2);
        board.add(c2);
        board.add(d2);
        board.add(e2);
        board.add(f2);
        board.add(g2);
        board.add(h2);
        board.add(a1);
        board.add(b1);
        board.add(c1);
        board.add(d1);
        board.add(e1);
        board.add(f1);
        board.add(g1);
        board.add(h1);
        board.addMouseListener(this);
        frame.add(board);
        frame.pack();
        frame.setVisible(true);
    }

    public void mouseClicked(MouseEvent e)
    {
        if(game.getPiece().equals(""))
        {
            if(e.getX() <= 50 && e.getY() <= 50)
            {
                System.out.println("first");
                game.setPiece(0, 0);
            }
            else if (e.getX() <= 50 && ((e.getY() > 50) && (e.getY() <= 100)))
            {
                game.setPiece(0, 1);
            }
            else if (e.getX() <= 50 && ((e.getY() > 100) && (e.getY() <= 150)))
            {
                game.setPiece(0, 2);
            }
            else if (e.getX() <= 50 && ((e.getY() > 150) && (e.getY() <= 200)))
            {
                game.setPiece(0, 3);
            }
            else if (e.getX() <= 50 && ((e.getY() > 200) && (e.getY() <= 250)))
            {
                game.setPiece(0, 4);
            }
            else if (e.getX() <= 50 && ((e.getY() > 250) && (e.getY() <= 300)))
            {
                game.setPiece(0, 5);
            }
            else if (e.getX() <= 50 && ((e.getY() > 300) && (e.getY() <= 350)))
            {
                game.setPiece(0, 6);
            }
            else if (e.getX() <= 50 && ((e.getY() > 350) && (e.getY() <= 400)))
            {
                game.setPiece(0, 7);
            }
            else if (((e.getX() > 50) && (e.getX() <= 100)) && e.getY() <= 50)
            {
                game.setPiece(1, 0);
            }
            else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 50) && (e.getY() <= 100)))
            {
                game.setPiece(1, 1);
            }
            else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 100) && (e.getY() <= 150)))
            {
                game.setPiece(1, 2);
            }
            else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 150) && (e.getY() <= 200)))
            {
                game.setPiece(1, 3);
            }
            else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 200) && (e.getY() <= 250)))
            {
                game.setPiece(1, 4);
            }
            else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 250) && (e.getY() <= 300)))
            {
                game.setPiece(1, 5);
            }
            else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 300) && (e.getY() <= 350)))
            {
                game.setPiece(1, 6);
            }
            else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 350) && (e.getY() <= 400)))
            {
                game.setPiece(1, 7);
            }
            else if (((e.getX() > 100) && (e.getX() <= 150)) && e.getY() <= 50)
            {
                game.setPiece(2, 0);
            }
            else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 50) && (e.getY() <= 100)))
            {
                game.setPiece(2, 1);
            }
            else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 100) && (e.getY() <= 150)))
            {
                game.setPiece(2, 2);
            }
            else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 150) && (e.getY() <= 200)))
            {
                game.setPiece(2, 3);
            }
            else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 200) && (e.getY() <= 250)))
            {
                game.setPiece(2, 4);
            }
            else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 250) && (e.getY() <= 300)))
            {
                game.setPiece(2, 5);
            }
            else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 300) && (e.getY() <= 350)))
            {
                game.setPiece(2, 6);
            }
            else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 350) && (e.getY() <= 400)))
            {
                game.setPiece(2, 7);
            }
            else if (((e.getX() > 150) && (e.getX() <= 200)) && e.getY() <= 50)
            {
                game.setPiece(3, 0);
            }
            else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 50) && (e.getY() <= 100)))
            {
                game.setPiece(3, 1);
            }
            else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 100) && (e.getY() <= 150)))
            {
                game.setPiece(3, 2);
            }
            else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 150) && (e.getY() <= 200)))
            {
                game.setPiece(3, 3);
            }
            else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 200) && (e.getY() <= 250)))
            {
                game.setPiece(3, 4);
            }
            else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 250) && (e.getY() <= 300)))
            {
                game.setPiece(3, 5);
            }
            else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 300) && (e.getY() <= 350)))
            {
                game.setPiece(3, 6);
            }
            else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 350) && (e.getY() <= 400)))
            {
                game.setPiece(3, 7);
            }
            else if (((e.getX() > 200) && (e.getX() <= 250)) && e.getY() <= 50)
            {
                game.setPiece(4, 0);
            }
            else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 50) && (e.getY() <= 100)))
            {
                game.setPiece(4, 1);
            }
            else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 100) && (e.getY() <= 150)))
            {
                game.setPiece(4, 2);
            }
            else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 150) && (e.getY() <= 200)))
            {
                game.setPiece(4, 3);
            }
            else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 200) && (e.getY() <= 250)))
            {
                game.setPiece(4, 4);
            }
            else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 250) && (e.getY() <= 300)))
            {
                game.setPiece(4, 5);
            }
            else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 300) && (e.getY() <= 350)))
            {
                game.setPiece(4, 6);
            }
            else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 350) && (e.getY() <= 400)))
            {
                game.setPiece(4, 7);
            }
            else if (((e.getX() > 250) && (e.getX() <= 300)) && e.getY() <= 50)
            {
                game.setPiece(5, 0);
            }
            else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 50) && (e.getY() <= 100)))
            {
                game.setPiece(5, 1);
            }
            else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 100) && (e.getY() <= 150)))
            {
                game.setPiece(5, 2);
            }
            else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 150) && (e.getY() <= 200)))
            {
                game.setPiece(5, 3);
            }
            else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 200) && (e.getY() <= 250)))
            {
                game.setPiece(5, 4);
            }
            else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 250) && (e.getY() <= 300)))
            {
                game.setPiece(5, 5);
            }
            else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 300) && (e.getY() <= 350)))
            {
                game.setPiece(5, 6);
            }
            else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 350) && (e.getY() <= 400)))
            {
                game.setPiece(5, 7);
            }
            else if (((e.getX() > 300) && (e.getX() <= 350)) && e.getY() <= 50)
            {
                game.setPiece(6, 0);
            }
            else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 50) && (e.getY() <= 100)))
            {
                game.setPiece(6, 1);
            }
            else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 100) && (e.getY() <= 150)))
            {
                game.setPiece(6, 2);
            }
            else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 150) && (e.getY() <= 200)))
            {
                game.setPiece(6, 3);
            }
            else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 200) && (e.getY() <= 250)))
            {
                game.setPiece(6, 4);
            }
            else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 250) && (e.getY() <= 300)))
            {
                game.setPiece(6, 5);
            }
            else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 300) && (e.getY() <= 350)))
            {
                game.setPiece(6, 6);
            }
            else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 350) && (e.getY() <= 400)))
            {
                game.setPiece(6, 7);
            }
            else if (((e.getX() > 350) && (e.getX() <= 400)) && e.getY() <= 50)
            {
                game.setPiece(7, 0);
            }
            else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 50) && (e.getY() <= 100)))
            {
                game.setPiece(7, 1);
            }
            else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 100) && (e.getY() <= 150)))
            {
                game.setPiece(7, 2);
            }
            else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 150) && (e.getY() <= 200)))
            {
                game.setPiece(7, 3);
            }
            else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 200) && (e.getY() <= 250)))
            {
                game.setPiece(7, 4);
            }
            else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 250) && (e.getY() <= 300)))
            {
                game.setPiece(7, 5);
            }
            else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 300) && (e.getY() <= 350)))
            {
                game.setPiece(7, 6);
            }
            else
            {
                game.setPiece(7, 7);
            }
        }
        else
        {
            System.out.println("second");
            if(e.getX() <= 50 && e.getY() <= 50)
            {
                game.setSquare(0, 0);
            }
            else if (e.getX() <= 50 && ((e.getY() > 50) && (e.getY() <= 100)))
            {
                game.setSquare(0, 1);
            }
            else if (e.getX() <= 50 && ((e.getY() > 100) && (e.getY() <= 150)))
            {
                game.setSquare(0, 2);
            }
            else if (e.getX() <= 50 && ((e.getY() > 150) && (e.getY() <= 200)))
            {
                game.setSquare(0, 3);
            }
            else if (e.getX() <= 50 && ((e.getY() > 200) && (e.getY() <= 250)))
            {
                game.setSquare(0, 4);
            }
            else if (e.getX() <= 50 && ((e.getY() > 250) && (e.getY() <= 300)))
            {
                game.setSquare(0, 5);
            }
            else if (e.getX() <= 50 && ((e.getY() > 300) && (e.getY() <= 350)))
            {
                game.setSquare(0, 6);
            }
            else if (e.getX() <= 50 && ((e.getY() > 350) && (e.getY() <= 400)))
            {
                game.setSquare(0, 7);
            }
            else if (((e.getX() > 50) && (e.getX() <= 100)) && e.getY() <= 50)
            {
                game.setSquare(0, 1);
            }
            else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 50) && (e.getY() <= 100)))
            {
                game.setSquare(1, 1);
            }
            else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 100) && (e.getY() <= 150)))
            {
                game.setSquare(1, 2);
            }
            else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 150) && (e.getY() <= 200)))
            {
                game.setSquare(1, 3);
            }
            else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 200) && (e.getY() <= 250)))
            {
                game.setSquare(1, 4);
            }
            else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 250) && (e.getY() <= 300)))
            {
                game.setSquare(1, 5);
            }
            else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 300) && (e.getY() <= 350)))
            {
                game.setSquare(1, 6);
            }
            else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 350) && (e.getY() <= 400)))
            {
                game.setSquare(1, 7);
            }
            else if (((e.getX() > 100) && (e.getX() <= 150)) && e.getY() <= 50)
            {
                game.setSquare(2, 0);
            }
            else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 50) && (e.getY() <= 100)))
            {
                game.setSquare(2, 1);
            }
            else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 100) && (e.getY() <= 150)))
            {
                game.setSquare(2, 2);
            }
            else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 150) && (e.getY() <= 200)))
            {
                game.setSquare(2, 3);
            }
            else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 200) && (e.getY() <= 250)))
            {
                game.setSquare(2, 4);
            }
            else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 250) && (e.getY() <= 300)))
            {
                game.setSquare(2, 5);
            }
            else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 300) && (e.getY() <= 350)))
            {
                game.setSquare(2, 6);
            }
            else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 350) && (e.getY() <= 400)))
            {
                game.setSquare(2, 7);
            }
            else if (((e.getX() > 150) && (e.getX() <= 200)) && e.getY() <= 50)
            {
                game.setSquare(3, 0);
            }
            else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 50) && (e.getY() <= 100)))
            {
                game.setSquare(3, 1);
            }
            else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 100) && (e.getY() <= 150)))
            {
                game.setSquare(3, 2);
            }
            else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 150) && (e.getY() <= 200)))
            {
                game.setSquare(3, 3);
            }
            else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 200) && (e.getY() <= 250)))
            {
                game.setSquare(3, 4);
            }
            else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 250) && (e.getY() <= 300)))
            {
                game.setSquare(3, 5);
            }
            else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 300) && (e.getY() <= 350)))
            {
                game.setSquare(3, 6);
            }
            else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 350) && (e.getY() <= 400)))
            {
                game.setSquare(3, 7);
            }
            else if (((e.getX() > 200) && (e.getX() <= 250)) && e.getY() <= 50)
            {
                game.setSquare(4, 0);
            }
            else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 50) && (e.getY() <= 100)))
            {
                game.setSquare(4, 1);
            }
            else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 100) && (e.getY() <= 150)))
            {
                game.setSquare(4, 2);
            }
            else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 150) && (e.getY() <= 200)))
            {
                game.setSquare(4, 3);
            }
            else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 200) && (e.getY() <= 250)))
            {
                game.setSquare(4, 4);
            }
            else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 250) && (e.getY() <= 300)))
            {
                game.setSquare(4, 5);
            }
            else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 300) && (e.getY() <= 350)))
            {
                game.setSquare(4, 6);
            }
            else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 350) && (e.getY() <= 400)))
            {
                game.setSquare(4, 7);
            }
            else if (((e.getX() > 250) && (e.getX() <= 300)) && e.getY() <= 50)
            {
                game.setSquare(5, 0);
            }
            else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 50) && (e.getY() <= 100)))
            {
                game.setSquare(5, 1);
            }
            else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 100) && (e.getY() <= 150)))
            {
                game.setSquare(5, 2);
            }
            else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 150) && (e.getY() <= 200)))
            {
                game.setSquare(5, 3);
            }
            else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 200) && (e.getY() <= 250)))
            {
                game.setSquare(5, 4);
            }
            else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 250) && (e.getY() <= 300)))
            {
                game.setSquare(5, 5);
            }
            else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 300) && (e.getY() <= 350)))
            {
                game.setSquare(5, 6);
            }
            else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 350) && (e.getY() <= 400)))
            {
                game.setSquare(5, 7);
            }
            else if (((e.getX() > 300) && (e.getX() <= 350)) && e.getY() <= 50)
            {
                game.setSquare(6, 0);
            }
            else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 50) && (e.getY() <= 100)))
            {
                game.setSquare(6, 1);
            }
            else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 100) && (e.getY() <= 150)))
            {
                game.setSquare(6, 2);
            }
            else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 150) && (e.getY() <= 200)))
            {
                game.setSquare(6, 3);
            }
            else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 200) && (e.getY() <= 250)))
            {
                game.setSquare(6, 4);
            }
            else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 250) && (e.getY() <= 300)))
            {
                game.setSquare(6, 5);
            }
            else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 300) && (e.getY() <= 350)))
            {
                game.setSquare(6, 6);
            }
            else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 350) && (e.getY() <= 400)))
            {
                game.setSquare(6, 7);
            }
            else if (((e.getX() > 350) && (e.getX() <= 400)) && e.getY() <= 50)
            {
                game.setSquare(7, 0);
            }
            else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 50) && (e.getY() <= 100)))
            {
                game.setSquare(7, 1);
            }
            else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 100) && (e.getY() <= 150)))
            {
                game.setSquare(7, 2);
            }
            else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 150) && (e.getY() <= 200)))
            {
                game.setSquare(7, 3);
            }
            else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 200) && (e.getY() <= 250)))
            {
                game.setSquare(7, 4);
            }
            else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 250) && (e.getY() <= 300)))
            {
                game.setSquare(7, 5);
            }
            else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 300) && (e.getY() <= 350)))
            {
                game.setSquare(7, 6);
            }
            else
            {
                game.setSquare(7, 7);
            }
            game.printBoard();
            if(game.getToRow() == 0)
            {
                if(game.getToCol() == 0)
                {
                    if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                    {
                        a8.setIcon(WPL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                    {
                        a8.setIcon(WPD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                    {
                        a8.setIcon(WRL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                    {
                        a8.setIcon(WRD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                    {
                        a8.setIcon(WNL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                    {
                        a8.setIcon(WND);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                    {
                        a8.setIcon(WBL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                    {
                        a8.setIcon(WBD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                    {
                        a8.setIcon(WQL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                    {
                        a8.setIcon(WQD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                    {
                        a8.setIcon(WKL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                    {
                        a8.setIcon(WKD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                    {
                        a8.setIcon(BPL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                    {
                        a8.setIcon(BPD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                    {
                        a8.setIcon(BRL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                    {
                        a8.setIcon(BRD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                    {
                        a8.setIcon(BNL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                    {
                        a8.setIcon(BND);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                    {
                        a8.setIcon(BBL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                    {
                        a8.setIcon(BBD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                    {
                        a8.setIcon(BQL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                    {
                        a8.setIcon(BQD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                    {
                        a8.setIcon(BKL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                    {
                        a8.setIcon(BKD);
                    }

                }
                else if(game.getToCol() == 1)
                {
                    if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                    {
                        b8.setIcon(WPL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                    {
                        b8.setIcon(WPD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                    {
                        b8.setIcon(WRL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                    {
                        b8.setIcon(WRD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                    {
                        b8.setIcon(WNL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                    {
                        b8.setIcon(WND);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                    {
                        b8.setIcon(WBL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                    {
                        b8.setIcon(WBD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                    {
                        b8.setIcon(WQL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                    {
                        b8.setIcon(WQD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                    {
                        b8.setIcon(WKL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                    {
                        b8.setIcon(WKD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                    {
                        b8.setIcon(BPL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                    {
                        b8.setIcon(BPD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                    {
                        b8.setIcon(BRL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                    {
                        b8.setIcon(BRD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                    {
                        b8.setIcon(BNL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                    {
                        b8.setIcon(BND);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                    {
                        b8.setIcon(BBL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                    {
                        b8.setIcon(BBD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                    {
                        b8.setIcon(BQL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                    {
                        b8.setIcon(BQD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                    {
                        b8.setIcon(BKL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                    {
                        b8.setIcon(BKD);
                    }
                }
                else if(game.getToCol() == 2)
                {
                    if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                    {
                        c8.setIcon(WPL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                    {
                        c8.setIcon(WPD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                    {
                        c8.setIcon(WRL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                    {
                        c8.setIcon(WRD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                    {
                        c8.setIcon(WNL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                    {
                        c8.setIcon(WND);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                    {
                        c8.setIcon(WBL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                    {
                        c8.setIcon(WBD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                    {
                        c8.setIcon(WQL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                    {
                        c8.setIcon(WQD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                    {
                        c8.setIcon(WKL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                    {
                        c8.setIcon(WKD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                    {
                        c8.setIcon(BPL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                    {
                        c8.setIcon(BPD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                    {
                        c8.setIcon(BRL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                    {
                        c8.setIcon(BRD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                    {
                        c8.setIcon(BNL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                    {
                        c8.setIcon(BND);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                    {
                        c8.setIcon(BBL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                    {
                        c8.setIcon(BBD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                    {
                        c8.setIcon(BQL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                    {
                        c8.setIcon(BQD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                    {
                        c8.setIcon(BKL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                    {
                        c8.setIcon(BKD);
                    }
                }
                else if(game.getToCol() == 3)
                {
                    if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                    {
                        d8.setIcon(WPL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                    {
                        d8.setIcon(WPD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                    {
                        d8.setIcon(WRL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                    {
                        d8.setIcon(WRD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                    {
                        d8.setIcon(WNL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                    {
                        d8.setIcon(WND);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                    {
                        d8.setIcon(WBL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                    {
                        d8.setIcon(WBD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                    {
                        d8.setIcon(WQL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                    {
                        d8.setIcon(WQD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                    {
                        d8.setIcon(WKL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                    {
                        d8.setIcon(WKD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                    {
                        d8.setIcon(BPL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                    {
                        d8.setIcon(BPD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                    {
                        d8.setIcon(BRL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                    {
                        d8.setIcon(BRD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                    {
                        d8.setIcon(BNL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                    {
                        d8.setIcon(BND);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                    {
                        d8.setIcon(BBL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                    {
                        d8.setIcon(BBD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                    {
                        d8.setIcon(BQL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                    {
                        d8.setIcon(BQD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                    {
                        d8.setIcon(BKL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                    {
                        d8.setIcon(BKD);
                    }
                }
                else if(game.getToCol() == 4)
                {
                    if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                    {
                        e8.setIcon(WPL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                    {
                        e8.setIcon(WPD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                    {
                        e8.setIcon(WRL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                    {
                        e8.setIcon(WRD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                    {
                        e8.setIcon(WNL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                    {
                        e8.setIcon(WND);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                    {
                        e8.setIcon(WBL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                    {
                        e8.setIcon(WBD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                    {
                        e8.setIcon(WQL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                    {
                        e8.setIcon(WQD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                    {
                        e8.setIcon(WKL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                    {
                        e8.setIcon(WKD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                    {
                        e8.setIcon(BPL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                    {
                        e8.setIcon(BPD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                    {
                        e8.setIcon(BRL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                    {
                        e8.setIcon(BRD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                    {
                        e8.setIcon(BNL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                    {
                        e8.setIcon(BND);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                    {
                        e8.setIcon(BBL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                    {
                        e8.setIcon(BBD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                    {
                        e8.setIcon(BQL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                    {
                        e8.setIcon(BQD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                    {
                        e8.setIcon(BKL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                    {
                        e8.setIcon(BKD);
                    }
                }
                else if(game.getToCol() == 5)
                {
                    if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                    {
                        f8.setIcon(WPL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                    {
                        f8.setIcon(WPD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                    {
                        f8.setIcon(WRL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                    {
                        f8.setIcon(WRD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                    {
                        f8.setIcon(WNL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                    {
                        f8.setIcon(WND);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                    {
                        f8.setIcon(WBL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                    {
                        f8.setIcon(WBD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                    {
                        f8.setIcon(WQL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                    {
                        f8.setIcon(WQD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                    {
                        f8.setIcon(WKL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                    {
                        f8.setIcon(WKD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                    {
                        f8.setIcon(BPL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                    {
                        f8.setIcon(BPD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                    {
                        f8.setIcon(BRL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                    {
                        f8.setIcon(BRD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                    {
                        f8.setIcon(BNL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                    {
                        f8.setIcon(BND);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                    {
                        f8.setIcon(BBL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                    {
                        f8.setIcon(BBD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                    {
                        f8.setIcon(BQL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                    {
                        f8.setIcon(BQD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                    {
                        f8.setIcon(BKL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                    {
                        f8.setIcon(BKD);
                    }
                }
                else if(game.getToCol() == 6)
                {
                    if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                    {
                        g8.setIcon(WPL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                    {
                        g8.setIcon(WPD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                    {
                        g8.setIcon(WRL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                    {
                        g8.setIcon(WRD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                    {
                        g8.setIcon(WNL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                    {
                        g8.setIcon(WND);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                    {
                        g8.setIcon(WBL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                    {
                        g8.setIcon(WBD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                    {
                        g8.setIcon(WQL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                    {
                        g8.setIcon(WQD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                    {
                        g8.setIcon(WKL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                    {
                        g8.setIcon(WKD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                    {
                        g8.setIcon(BPL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                    {
                        g8.setIcon(BPD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                    {
                        g8.setIcon(BRL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                    {
                        g8.setIcon(BRD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                    {
                        g8.setIcon(BNL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                    {
                        g8.setIcon(BND);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                    {
                        g8.setIcon(BBL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                    {
                        g8.setIcon(BBD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                    {
                        g8.setIcon(BQL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                    {
                        g8.setIcon(BQD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                    {
                        g8.setIcon(BKL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                    {
                        g8.setIcon(BKD);
                    }
                }
                else
                {
                    if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                    {
                        h8.setIcon(WPL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                    {
                        h8.setIcon(WPD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                    {
                        h8.setIcon(WRL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                    {
                        h8.setIcon(WRD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                    {
                        h8.setIcon(WNL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                    {
                        h8.setIcon(WND);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                    {
                        h8.setIcon(WBL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                    {
                        h8.setIcon(WBD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                    {
                        h8.setIcon(WQL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                    {
                        h8.setIcon(WQD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                    {
                        h8.setIcon(WKL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                    {
                        h8.setIcon(WKD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                    {
                        h8.setIcon(BPL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                    {
                        h8.setIcon(BPD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                    {
                        h8.setIcon(BRL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                    {
                        h8.setIcon(BRD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                    {
                        h8.setIcon(BNL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                    {
                        h8.setIcon(BND);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                    {
                        h8.setIcon(BBL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                    {
                        h8.setIcon(BBD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                    {
                        h8.setIcon(BQL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                    {
                        h8.setIcon(BQD);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                    {
                        h8.setIcon(BKL);
                    }
                    else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                    {
                        h8.setIcon(BKD);
                    }
                }
            }
        }
    }

    public void mousePressed(MouseEvent e)
    {
    }

    public void mouseReleased(MouseEvent e)
    {
    }

    public void mouseEntered(MouseEvent e)
    {
    }

    public void mouseExited(MouseEvent e)
    {
    }

}