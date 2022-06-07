import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.GridLayout;

public class GUI implements MouseListener, ActionListener
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

    private JFrame promotionFrame;
    private JPanel promotionPanel;
    private JTextField promotionField;
    private JButton enter;
    private String promotionPiece;
    private String promotionSquare;

    private Game game;

    public GUI()
    {
        frame = new JFrame("Chess");
        frame.setResizable(false);
        frame.setLocation(700, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        promotionFrame = new JFrame("Select Piece To Promote To");
        promotionFrame.setResizable(false);
        promotionFrame.setLocation(850, 230);
        promotionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        enter = new JButton("Enter");
        enter.addActionListener(this);
        promotionPanel = new JPanel();
        promotionField = new JTextField(1);
        promotionPiece = "";
        promotionSquare = "";
        board = new JPanel();
        game = new Game();
        WPL = new ImageIcon("src/WhitePieces/WPL.png");
        WPD = new ImageIcon("src/WhitePieces/WPD.png");
        WRL = new ImageIcon("src/WhitePieces/WRL.png");
        WRD = new ImageIcon("src/WhitePieces/WRD.png");
        WNL = new ImageIcon("src/WhitePieces/WNL.png");
        WND = new ImageIcon("src/WhitePieces/WND.png");
        WBL = new ImageIcon("src/WhitePieces/WBL.png");
        WBD = new ImageIcon("src/WhitePieces/WBD.png");
        WQL = new ImageIcon("src/WhitePieces/WQL.png");
        WQD = new ImageIcon("src/WhitePieces/WQD.png");
        WKL = new ImageIcon("src/WhitePieces/WKL.png");
        WKD = new ImageIcon("src/WhitePieces/WKD.png");
        BPL = new ImageIcon("src/BlackPieces/BPL.png");
        BPD = new ImageIcon("src/BlackPieces/BPD.png");
        BRL = new ImageIcon("src/BlackPieces/BRL.png");
        BRD = new ImageIcon("src/BlackPieces/BRD.png");
        BNL = new ImageIcon("src/BlackPieces/BNL.png");
        BND = new ImageIcon("src/BlackPieces/BND.png");
        BBL = new ImageIcon("src/BlackPieces/BBL.png");
        BBD = new ImageIcon("src/BlackPieces/BBD.png");
        BQL = new ImageIcon("src/BlackPieces/BQL.png");
        BQD = new ImageIcon("src/BlackPieces/BQD.png");
        BKL = new ImageIcon("src/BlackPieces/BKL.png");
        BKD = new ImageIcon("src/BlackPieces/BKD.png");
        LSQ = new ImageIcon("src/Squares/LSQ.png");
        DSQ = new ImageIcon("src/Squares/DSQ.png");

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

        Image BKDImage = BKD.getImage();
        Image scaledBKD = BKDImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        BKD = new ImageIcon(scaledBKD);

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

        promotionPanel.add(promotionField);
        promotionPanel.add(enter);
        promotionFrame.add(promotionPanel);
        promotionFrame.pack();

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
            if (game.getPiece().equals(""))
        {
                if (e.getX() <= 50 && e.getY() <= 50)
            {
                    game.setPiece(0, 0);
                } else if (e.getX() <= 50 && ((e.getY() > 50) && (e.getY() <= 100)))
            {
                    game.setPiece(1, 0);
                } else if (e.getX() <= 50 && ((e.getY() > 100) && (e.getY() <= 150)))
            {
                    game.setPiece(2, 0);
                } else if (e.getX() <= 50 && ((e.getY() > 150) && (e.getY() <= 200)))
            {
                    game.setPiece(3, 0);
                } else if (e.getX() <= 50 && ((e.getY() > 200) && (e.getY() <= 250))) {
                    game.setPiece(4, 0);
                } else if (e.getX() <= 50 && ((e.getY() > 250) && (e.getY() <= 300))) {
                    game.setPiece(5, 0);
                } else if (e.getX() <= 50 && ((e.getY() > 300) && (e.getY() <= 350))) {
                    game.setPiece(6, 0);
                } else if (e.getX() <= 50 && ((e.getY() > 350) && (e.getY() <= 400))) {
                    game.setPiece(7, 0);
                } else if (((e.getX() > 50) && (e.getX() <= 100)) && e.getY() <= 50) {
                    game.setPiece(0, 1);
                } else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 50) && (e.getY() <= 100))) {
                    game.setPiece(1, 1);
                } else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 100) && (e.getY() <= 150))) {
                    game.setPiece(2, 1);
                } else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 150) && (e.getY() <= 200))) {
                    game.setPiece(3, 1);
                } else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 200) && (e.getY() <= 250))) {
                    game.setPiece(4, 1);
                } else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 250) && (e.getY() <= 300))) {
                    game.setPiece(5, 1);
                } else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 300) && (e.getY() <= 350))) {
                    game.setPiece(6, 1);
                } else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 350) && (e.getY() <= 400))) {
                    game.setPiece(7, 1);
                } else if (((e.getX() > 100) && (e.getX() <= 150)) && e.getY() <= 50) {
                    game.setPiece(0, 2);
                } else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 50) && (e.getY() <= 100))) {
                    game.setPiece(1, 2);
                } else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 100) && (e.getY() <= 150))) {
                    game.setPiece(2, 2);
                } else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 150) && (e.getY() <= 200))) {
                    game.setPiece(3, 2);
                } else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 200) && (e.getY() <= 250))) {
                    game.setPiece(4, 2);
                } else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 250) && (e.getY() <= 300))) {
                    game.setPiece(5, 2);
                } else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 300) && (e.getY() <= 350))) {
                    game.setPiece(6, 2);
                } else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 350) && (e.getY() <= 400))) {
                    game.setPiece(7, 2);
                } else if (((e.getX() > 150) && (e.getX() <= 200)) && e.getY() <= 50) {
                    game.setPiece(0, 3);
                } else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 50) && (e.getY() <= 100))) {
                    game.setPiece(1, 3);
                } else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 100) && (e.getY() <= 150))) {
                    game.setPiece(2, 3);
                } else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 150) && (e.getY() <= 200))) {
                    game.setPiece(3, 3);
                } else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 200) && (e.getY() <= 250))) {
                    game.setPiece(4, 3);
                } else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 250) && (e.getY() <= 300))) {
                    game.setPiece(5, 3);
                } else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 300) && (e.getY() <= 350))) {
                    game.setPiece(6, 3);
                } else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 350) && (e.getY() <= 400))) {
                    game.setPiece(7, 3);
                } else if (((e.getX() > 200) && (e.getX() <= 250)) && e.getY() <= 50) {
                    game.setPiece(0, 4);
                } else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 50) && (e.getY() <= 100))) {
                    game.setPiece(1, 4);
                } else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 100) && (e.getY() <= 150))) {
                    game.setPiece(2, 4);
                } else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 150) && (e.getY() <= 200))) {
                    game.setPiece(3, 4);
                } else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 200) && (e.getY() <= 250))) {
                    game.setPiece(4, 4);
                } else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 250) && (e.getY() <= 300))) {
                    game.setPiece(5, 4);
                } else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 300) && (e.getY() <= 350))) {
                    game.setPiece(6, 4);
                } else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 350) && (e.getY() <= 400))) {
                    game.setPiece(7, 4);
                } else if (((e.getX() > 250) && (e.getX() <= 300)) && e.getY() <= 50) {
                    game.setPiece(0, 5);
                } else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 50) && (e.getY() <= 100))) {
                    game.setPiece(1, 5);
                } else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 100) && (e.getY() <= 150))) {
                    game.setPiece(2, 5);
                } else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 150) && (e.getY() <= 200))) {
                    game.setPiece(3, 5);
                } else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 200) && (e.getY() <= 250))) {
                    game.setPiece(4, 5);
                } else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 250) && (e.getY() <= 300))) {
                    game.setPiece(5, 5);
                } else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 300) && (e.getY() <= 350))) {
                    game.setPiece(6, 5);
                } else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 350) && (e.getY() <= 400))) {
                    game.setPiece(7, 5);
                } else if (((e.getX() > 300) && (e.getX() <= 350)) && e.getY() <= 50) {
                    game.setPiece(0, 6);
                } else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 50) && (e.getY() <= 100))) {
                    game.setPiece(1, 6);
                } else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 100) && (e.getY() <= 150))) {
                    game.setPiece(2, 6);
                } else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 150) && (e.getY() <= 200))) {
                    game.setPiece(3, 6);
                } else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 200) && (e.getY() <= 250))) {
                    game.setPiece(4, 6);
                } else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 250) && (e.getY() <= 300))) {
                    game.setPiece(5, 6);
                } else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 300) && (e.getY() <= 350))) {
                    game.setPiece(6, 6);
                } else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 350) && (e.getY() <= 400))) {
                    game.setPiece(7, 6);
                } else if (((e.getX() > 350) && (e.getX() <= 400)) && e.getY() <= 50) {
                    game.setPiece(0, 7);
                } else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 50) && (e.getY() <= 100))) {
                    game.setPiece(1, 7);
                } else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 100) && (e.getY() <= 150))) {
                    game.setPiece(2, 7);
                } else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 150) && (e.getY() <= 200))) {
                    game.setPiece(3, 7);
                } else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 200) && (e.getY() <= 250))) {
                    game.setPiece(4, 7);
                } else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 250) && (e.getY() <= 300))) {
                    game.setPiece(5, 7);
                } else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 300) && (e.getY() <= 350))) {
                    game.setPiece(6, 7);
                } else {
                    game.setPiece(7, 7);
                }
            } else {
                if (e.getX() <= 50 && e.getY() <= 50) {
                    game.setSquare(0, 0);
                } else if (e.getX() <= 50 && ((e.getY() > 50) && (e.getY() <= 100))) {
                    game.setSquare(1, 0);
                } else if (e.getX() <= 50 && ((e.getY() > 100) && (e.getY() <= 150))) {
                    game.setSquare(2, 0);
                } else if (e.getX() <= 50 && ((e.getY() > 150) && (e.getY() <= 200))) {
                    game.setSquare(3, 0);
                } else if (e.getX() <= 50 && ((e.getY() > 200) && (e.getY() <= 250))) {
                    game.setSquare(4, 0);
                } else if (e.getX() <= 50 && ((e.getY() > 250) && (e.getY() <= 300))) {
                    game.setSquare(5, 0);
                } else if (e.getX() <= 50 && ((e.getY() > 300) && (e.getY() <= 350))) {
                    game.setSquare(6, 0);
                } else if (e.getX() <= 50 && ((e.getY() > 350) && (e.getY() <= 400))) {
                    game.setSquare(7, 0);
                } else if (((e.getX() > 50) && (e.getX() <= 100)) && e.getY() <= 50) {
                    game.setSquare(0, 1);
                } else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 50) && (e.getY() <= 100))) {
                    game.setSquare(1, 1);
                } else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 100) && (e.getY() <= 150))) {
                    game.setSquare(2, 1);
                } else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 150) && (e.getY() <= 200))) {
                    game.setSquare(3, 1);
                } else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 200) && (e.getY() <= 250))) {
                    game.setSquare(4, 1);
                } else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 250) && (e.getY() <= 300))) {
                    game.setSquare(5, 1);
                } else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 300) && (e.getY() <= 350))) {
                    game.setSquare(6, 1);
                } else if (((e.getX() > 50) && (e.getX() <= 100)) && ((e.getY() > 350) && (e.getY() <= 400))) {
                    game.setSquare(7, 1);
                } else if (((e.getX() > 100) && (e.getX() <= 150)) && e.getY() <= 50) {
                    game.setSquare(0, 2);
                } else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 50) && (e.getY() <= 100))) {
                    game.setSquare(1, 2);
                } else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 100) && (e.getY() <= 150))) {
                    game.setSquare(2, 2);
                } else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 150) && (e.getY() <= 200))) {
                    game.setSquare(3, 2);
                } else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 200) && (e.getY() <= 250))) {
                    game.setSquare(4, 2);
                } else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 250) && (e.getY() <= 300))) {
                    game.setSquare(5, 2);
                } else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 300) && (e.getY() <= 350))) {
                    game.setSquare(6, 2);
                } else if (((e.getX() > 100) && (e.getX() <= 150)) && ((e.getY() > 350) && (e.getY() <= 400))) {
                    game.setSquare(7, 2);
                } else if (((e.getX() > 150) && (e.getX() <= 200)) && e.getY() <= 50) {
                    game.setSquare(0, 3);
                } else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 50) && (e.getY() <= 100))) {
                    game.setSquare(1, 3);
                } else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 100) && (e.getY() <= 150))) {
                    game.setSquare(2, 3);
                } else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 150) && (e.getY() <= 200))) {
                    game.setSquare(3, 3);
                } else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 200) && (e.getY() <= 250))) {
                    game.setSquare(4, 3);
                } else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 250) && (e.getY() <= 300))) {
                    game.setSquare(5, 3);
                } else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 300) && (e.getY() <= 350))) {
                    game.setSquare(6, 3);
                } else if (((e.getX() > 150) && (e.getX() <= 200)) && ((e.getY() > 350) && (e.getY() <= 400))) {
                    game.setSquare(7, 3);
                } else if (((e.getX() > 200) && (e.getX() <= 250)) && e.getY() <= 50) {
                    game.setSquare(0, 4);
                } else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 50) && (e.getY() <= 100))) {
                    game.setSquare(1, 4);
                } else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 100) && (e.getY() <= 150))) {
                    game.setSquare(2, 4);
                } else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 150) && (e.getY() <= 200))) {
                    game.setSquare(3, 4);
                } else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 200) && (e.getY() <= 250))) {
                    game.setSquare(4, 4);
                } else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 250) && (e.getY() <= 300))) {
                    game.setSquare(5, 4);
                } else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 300) && (e.getY() <= 350))) {
                    game.setSquare(6, 4);
                } else if (((e.getX() > 200) && (e.getX() <= 250)) && ((e.getY() > 350) && (e.getY() <= 400))) {
                    game.setSquare(7, 4);
                } else if (((e.getX() > 250) && (e.getX() <= 300)) && e.getY() <= 50) {
                    game.setSquare(0, 5);
                } else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 50) && (e.getY() <= 100))) {
                    game.setSquare(1, 5);
                } else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 100) && (e.getY() <= 150))) {
                    game.setSquare(2, 5);
                } else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 150) && (e.getY() <= 200))) {
                    game.setSquare(3, 5);
                } else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 200) && (e.getY() <= 250))) {
                    game.setSquare(4, 5);
                } else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 250) && (e.getY() <= 300))) {
                    game.setSquare(5, 5);
                } else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 300) && (e.getY() <= 350))) {
                    game.setSquare(6, 5);
                } else if (((e.getX() > 250) && (e.getX() <= 300)) && ((e.getY() > 350) && (e.getY() <= 400))) {
                    game.setSquare(7, 5);
                } else if (((e.getX() > 300) && (e.getX() <= 350)) && e.getY() <= 50) {
                    game.setSquare(0, 6);
                } else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 50) && (e.getY() <= 100))) {
                    game.setSquare(1, 6);
                } else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 100) && (e.getY() <= 150))) {
                    game.setSquare(2, 6);
                } else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 150) && (e.getY() <= 200))) {
                    game.setSquare(3, 6);
                } else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 200) && (e.getY() <= 250))) {
                    game.setSquare(4, 6);
                } else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 250) && (e.getY() <= 300))) {
                    game.setSquare(5, 6);
                } else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 300) && (e.getY() <= 350))) {
                    game.setSquare(6, 6);
                } else if (((e.getX() > 300) && (e.getX() <= 350)) && ((e.getY() > 350) && (e.getY() <= 400))) {
                    game.setSquare(7, 6);
                } else if (((e.getX() > 350) && (e.getX() <= 400)) && e.getY() <= 50) {
                    game.setSquare(0, 7);
                } else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 50) && (e.getY() <= 100))) {
                    game.setSquare(1, 7);
                } else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 100) && (e.getY() <= 150))) {
                    game.setSquare(2, 7);
                } else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 150) && (e.getY() <= 200))) {
                    game.setSquare(3, 7);
                } else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 200) && (e.getY() <= 250))) {
                    game.setSquare(4, 7);
                } else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 250) && (e.getY() <= 300))) {
                    game.setSquare(5, 7);
                } else if (((e.getX() > 350) && (e.getX() <= 400)) && ((e.getY() > 300) && (e.getY() <= 350))) {
                    game.setSquare(6, 7);
                } else {
                    game.setSquare(7, 7);
                }
                mousePressed8thRank();
                mousePressed7thRank();
                mousePressed6thRank();
                mousePressed5thRank();
                mousePressed4thRank();
                mousePressed3rdRank();
                mousePressed2ndRank();
                mousePressed1stRank();
                if (game.getFromRow() == 0) {
                    if (game.getFromCol() == 0) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            a8.setIcon(DSQ);
                        } else {
                            a8.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 1) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            b8.setIcon(DSQ);
                        } else {
                            b8.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 2) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            c8.setIcon(DSQ);
                        } else {
                            c8.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 3) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            d8.setIcon(DSQ);
                        } else {
                            d8.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 4) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            e8.setIcon(DSQ);
                        } else {
                            e8.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 5) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            f8.setIcon(DSQ);
                        } else {
                            f8.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 6) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            g8.setIcon(DSQ);
                        } else {
                            g8.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 7) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            h8.setIcon(DSQ);
                        } else {
                            h8.setIcon(LSQ);
                        }
                    }
                }
                if (game.getFromRow() == 1) {
                    if (game.getFromCol() == 0) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            a7.setIcon(DSQ);
                        } else {
                            a7.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 1) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            b7.setIcon(DSQ);
                        } else {
                            b7.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 2) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            c7.setIcon(DSQ);
                        } else {
                            c7.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 3) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            d7.setIcon(DSQ);
                        } else {
                            d7.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 4) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            e7.setIcon(DSQ);
                        } else {
                            e7.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 5) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            f7.setIcon(DSQ);
                        } else {
                            f7.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 6) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            g7.setIcon(DSQ);
                        } else {
                            g7.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 7) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            h7.setIcon(DSQ);
                        } else {
                            h7.setIcon(LSQ);
                        }
                    }
                }
                if (game.getFromRow() == 2) {
                    if (game.getFromCol() == 0) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            a6.setIcon(DSQ);
                        } else {
                            a6.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 1) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            b6.setIcon(DSQ);
                        } else {
                            b6.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 2) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            c6.setIcon(DSQ);
                        } else {
                            c6.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 3) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            d6.setIcon(DSQ);
                        } else {
                            d6.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 4) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            e6.setIcon(DSQ);
                        } else {
                            e6.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 5) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            f6.setIcon(DSQ);
                        } else {
                            f6.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 6) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            g6.setIcon(DSQ);
                        } else {
                            g6.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 7) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            h6.setIcon(DSQ);
                        } else {
                            h6.setIcon(LSQ);
                        }
                    }
                }
                if (game.getFromRow() == 3) {
                    if (game.getFromCol() == 0) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            a5.setIcon(DSQ);
                        } else {
                            a5.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 1) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            b5.setIcon(DSQ);
                        } else {
                            b5.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 2) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            c5.setIcon(DSQ);
                        } else {
                            c5.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 3) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            d5.setIcon(DSQ);
                        } else {
                            d5.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 4) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            e5.setIcon(DSQ);
                        } else {
                            e5.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 5) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            f5.setIcon(DSQ);
                        } else {
                            f5.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 6) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            g5.setIcon(DSQ);
                        } else {
                            g5.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 7) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            h5.setIcon(DSQ);
                        } else {
                            h5.setIcon(LSQ);
                        }
                    }
                }
                if (game.getFromRow() == 4) {
                    if (game.getFromCol() == 0) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            a4.setIcon(DSQ);
                        } else {
                            a4.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 1) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            b4.setIcon(DSQ);
                        } else {
                            b4.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 2) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            c4.setIcon(DSQ);
                        } else {
                            c4.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 3) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            d4.setIcon(DSQ);
                        } else {
                            d4.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 4) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            e4.setIcon(DSQ);
                        } else {
                            e4.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 5) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            f4.setIcon(DSQ);
                        } else {
                            f4.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 6) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            g4.setIcon(DSQ);
                        } else {
                            g4.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 7) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            h4.setIcon(DSQ);
                        } else {
                            h4.setIcon(LSQ);
                        }
                    }
                }
                if (game.getFromRow() == 5) {
                    if (game.getFromCol() == 0) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            a3.setIcon(DSQ);
                        } else {
                            a3.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 1) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            b3.setIcon(DSQ);
                        } else {
                            b3.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 2) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            c3.setIcon(DSQ);
                        } else {
                            c3.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 3) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            d3.setIcon(DSQ);
                        } else {
                            d3.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 4) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            e3.setIcon(DSQ);
                        } else {
                            e3.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 5) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            f3.setIcon(DSQ);
                        } else {
                            f3.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 6) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            g3.setIcon(DSQ);
                        } else {
                            g3.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 7) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            h3.setIcon(DSQ);
                        } else {
                            h3.setIcon(LSQ);
                        }
                    }
                }
                if (game.getFromRow() == 6) {
                    if (game.getFromCol() == 0) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            a2.setIcon(DSQ);
                        } else {
                            a2.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 1) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            b2.setIcon(DSQ);
                        } else {
                            b2.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 2) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            c2.setIcon(DSQ);
                        } else {
                            c2.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 3) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            d2.setIcon(DSQ);
                        } else {
                            d2.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 4) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            e2.setIcon(DSQ);
                        } else {
                            e2.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 5) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            f2.setIcon(DSQ);
                        } else {
                            f2.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 6) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            g2.setIcon(DSQ);
                        } else {
                            g2.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 7) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            h2.setIcon(DSQ);
                        } else {
                            h2.setIcon(LSQ);
                        }
                    }
                }
                if (game.getFromRow() == 7) {
                    if (game.getFromCol() == 0) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            a1.setIcon(DSQ);
                        } else {
                            a1.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 1) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            b1.setIcon(DSQ);
                        } else {
                            b1.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 2) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            c1.setIcon(DSQ);
                        } else {
                            c1.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 3) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            d1.setIcon(DSQ);
                        } else {
                            d1.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 4) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            e1.setIcon(DSQ);
                        } else {
                            e1.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 5) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            f1.setIcon(DSQ);
                        } else {
                            f1.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 6) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            g1.setIcon(DSQ);
                        } else {
                            g1.setIcon(LSQ);
                        }
                    }
                    if (game.getFromCol() == 7) {
                        if (game.getBoardArraySpot(game.getFromRow(), game.getFromCol()).substring(2).equals("D")) {
                            h1.setIcon(DSQ);
                        } else {
                            h1.setIcon(LSQ);
                        }
                    }
                }
            }
        }
    private void mousePressed8thRank()
    {
        if(game.getToRow() == 0)
        {
            if(game.getToCol() == 0)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    promotionSquare = "a8";
                    promotionFrame.setVisible(true);
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
                    promotionSquare = "b8";
                    promotionFrame.setVisible(true);
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
                    promotionSquare = "c8";
                    promotionFrame.setVisible(true);
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
                    if(game.getFromCol() == 4)
                    {
                        c8.setIcon(BKL);
                        d8.setIcon(BRD);
                        a8.setIcon(LSQ);
                        game.setBoardArraySpot(0, 3, "BRD");
                        game.setBoardArraySpot(0, 0, "SQL");
                    }
                    else
                    {
                        c8.setIcon(BKL);
                    }
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
                    promotionSquare = "d8";
                    promotionFrame.setVisible(true);
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
                    promotionSquare = "e8";
                    promotionFrame.setVisible(true);
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
                    promotionSquare = "f8";
                    promotionFrame.setVisible(true);
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
                    promotionSquare = "g8";
                    promotionFrame.setVisible(true);
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
                    if(game.getFromCol() == 4)
                    {
                        g8.setIcon(BKL);
                        f8.setIcon(BRD);
                        h8.setIcon(DSQ);
                        game.setBoardArraySpot(0, 5, "BRD");
                        game.setBoardArraySpot(0, 7, "SQD");
                    }
                    else
                    {
                        g8.setIcon(BKL);
                    }
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
                    promotionSquare = "h8";
                    promotionFrame.setVisible(true);
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

    private void mousePressed7thRank()
    {
        if(game.getToRow() == 1)
        {
            if(game.getToCol() == 0)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    a7.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    a7.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    a7.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    a7.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    a7.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    a7.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    a7.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    a7.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    a7.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    a7.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    a7.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    a7.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    a7.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    a7.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    a7.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    a7.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    a7.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    a7.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    a7.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    a7.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    a7.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    a7.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    a7.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    a7.setIcon(BKD);
                }

            }
            else if(game.getToCol() == 1)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    b7.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    b7.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    b7.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    b7.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    b7.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    b7.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    b7.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    b7.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    b7.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    b7.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    b7.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    b7.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    b7.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    b7.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    b7.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    b7.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    b7.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    b7.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    b7.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    b7.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    b7.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    b7.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    b7.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    b7.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 2)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    c7.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    c7.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    c7.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    c7.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    c7.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    c7.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    c7.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    c7.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    c7.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    c7.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    c7.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    c7.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    c7.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    c7.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    c7.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    c7.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    c7.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    c7.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    c7.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    c7.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    c7.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    c7.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    c7.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    c7.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 3)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    d7.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    d7.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    d7.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    d7.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    d7.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    d7.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    d7.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    d7.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    d7.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    d7.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    d7.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    d7.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    d7.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    d7.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    d7.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    d7.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    d7.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    d7.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    d7.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    d7.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    d7.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    d7.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    d7.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    d7.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 4)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    e7.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    e7.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    e7.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    e7.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    e7.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    e7.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    e7.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    e7.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    e7.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    e7.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    e7.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    e7.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    e7.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    e7.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    e7.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    e7.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    e7.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    e7.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    e7.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    e7.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    e7.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    e7.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    e7.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    e7.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 5)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    f7.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    f7.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    f7.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    f7.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    f7.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    f7.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    f7.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    f7.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    f7.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    f7.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    f7.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    f7.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    f7.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    f7.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    f7.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    f7.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    f7.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    f7.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    f7.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    f7.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    f7.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    f7.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    f7.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    f7.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 6)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    g7.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    g7.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    g7.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    g7.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    g7.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    g7.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    g7.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    g7.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    g7.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    g7.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    g7.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    g7.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    g7.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    g7.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    g7.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    g7.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    g7.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    g7.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    g7.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    g7.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    g7.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    g7.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    g7.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    g7.setIcon(BKD);
                }
            }
            else
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    h7.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    h7.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    h7.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    h7.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    h7.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    h7.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    h7.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    h7.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    h7.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    h7.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    h7.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    h7.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    h7.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    h7.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    h7.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    h7.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    h7.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    h7.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    h7.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    h7.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    h7.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    h7.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    h7.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    h7.setIcon(BKD);
                }
            }
        }
    }

    private void mousePressed6thRank()
    {
        if(game.getToRow() == 2)
        {
            if(game.getToCol() == 0)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    a6.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    a6.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    a6.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    a6.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    a6.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    a6.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    a6.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    a6.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    a6.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    a6.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    a6.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    a6.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    a6.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    a6.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    a6.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    a6.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    a6.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    a6.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    a6.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    a6.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    a6.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    a6.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    a6.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    a6.setIcon(BKD);
                }

            }
            else if(game.getToCol() == 1)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    b6.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    b6.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    b6.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    b6.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    b6.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    b6.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    b6.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    b6.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    b6.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    b6.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    b6.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    b6.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    b6.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    b6.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    b6.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    b6.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    b6.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    b6.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    b6.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    b6.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    b6.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    b6.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    b6.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    b6.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 2)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    c6.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    c6.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    c6.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    c6.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    c6.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    c6.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    c6.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    c6.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    c6.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    c6.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    c6.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    c6.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    c6.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    c6.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    c6.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    c6.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    c6.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    c6.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    c6.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    c6.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    c6.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    c6.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    c6.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    c6.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 3)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    d6.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    d6.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    d6.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    d6.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    d6.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    d6.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    d6.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    d6.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    d6.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    d6.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    d6.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    d6.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    d6.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    d6.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    d6.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    d6.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    d6.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    d6.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    d6.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    d6.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    d6.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    d6.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    d6.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    d6.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 4)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    e6.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    e6.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    e6.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    e6.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    e6.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    e6.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    e6.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    e6.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    e6.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    e6.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    e6.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    e6.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    e6.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    e6.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    e6.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    e6.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    e6.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    e6.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    e6.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    e6.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    e6.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    e6.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    e6.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    e6.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 5)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    f6.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    f6.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    f6.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    f6.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    f6.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    f6.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    f6.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    f6.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    f6.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    f6.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    f6.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    f6.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    f6.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    f6.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    f6.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    f6.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    f6.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    f6.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    f6.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    f6.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    f6.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    f6.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    f6.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    f6.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 6)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    g6.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    g6.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    g6.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    g6.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    g6.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    g6.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    g6.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    g6.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    g6.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    g6.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    g6.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    g6.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    g6.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    g6.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    g6.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    g6.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    g6.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    g6.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    g6.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    g6.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    g6.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    g6.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    g6.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    g6.setIcon(BKD);
                }
            }
            else
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    h6.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    h6.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    h6.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    h6.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    h6.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    h6.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    h6.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    h6.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    h6.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    h6.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    h6.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    h6.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    h6.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    h6.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    h6.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    h6.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    h6.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    h6.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    h6.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    h6.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    h6.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    h6.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    h6.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    h6.setIcon(BKD);
                }
            }
        }
    }

    private void mousePressed5thRank()
    {
        if(game.getToRow() == 3)
        {
            if(game.getToCol() == 0)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    a5.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    a5.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    a5.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    a5.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    a5.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    a5.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    a5.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    a5.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    a5.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    a5.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    a5.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    a5.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    a5.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    a5.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    a5.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    a5.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    a5.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    a5.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    a5.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    a5.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    a5.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    a5.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    a5.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    a5.setIcon(BKD);
                }

            }
            else if(game.getToCol() == 1)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    b5.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    b5.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    b5.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    b5.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    b5.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    b5.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    b5.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    b5.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    b5.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    b5.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    b5.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    b5.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    b5.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    b5.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    b5.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    b5.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    b5.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    b5.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    b5.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    b5.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    b5.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    b5.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    b5.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    b5.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 2)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    c5.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    c5.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    c5.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    c5.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    c5.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    c5.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    c5.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    c5.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    c5.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    c5.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    c5.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    c5.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    c5.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    c5.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    c5.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    c5.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    c5.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    c5.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    c5.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    c5.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    c5.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    c5.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    c5.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    c5.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 3)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    d5.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    d5.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    d5.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    d5.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    d5.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    d5.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    d5.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    d5.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    d5.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    d5.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    d5.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    d5.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    d5.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    d5.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    d5.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    d5.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    d5.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    d5.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    d5.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    d5.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    d5.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    d5.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    d5.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    d5.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 4)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    e5.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    e5.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    e5.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    e5.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    e5.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    e5.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    e5.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    e5.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    e5.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    e5.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    e5.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    e5.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    e5.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    e5.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    e5.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    e5.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    e5.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    e5.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    e5.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    e5.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    e5.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    e5.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    e5.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    e5.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 5)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    f5.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    f5.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    f5.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    f5.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    f5.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    f5.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    f5.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    f5.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    f5.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    f5.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    f5.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    f5.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    f5.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    f5.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    f5.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    f5.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    f5.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    f5.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    f5.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    f5.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    f5.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    f5.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    f5.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    f5.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 6)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    g5.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    g5.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    g5.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    g5.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    g5.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    g5.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    g5.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    g5.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    g5.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    g5.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    g5.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    g5.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    g5.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    g5.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    g5.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    g5.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    g5.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    g5.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    g5.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    g5.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    g5.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    g5.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    g5.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    g5.setIcon(BKD);
                }
            }
            else
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    h5.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    h5.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    h5.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    h5.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    h5.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    h5.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    h5.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    h5.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    h5.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    h5.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    h5.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    h5.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    h5.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    h5.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    h5.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    h5.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    h5.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    h5.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    h5.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    h5.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    h5.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    h5.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    h5.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    h5.setIcon(BKD);
                }
            }
        }
    }

    private void mousePressed4thRank()
    {
        if(game.getToRow() == 4)
        {
            if(game.getToCol() == 0)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    a4.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    a4.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    a4.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    a4.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    a4.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    a4.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    a4.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    a4.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    a4.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    a4.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    a4.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    a4.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    a4.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    a4.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    a4.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    a4.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    a4.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    a4.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    a4.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    a4.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    a4.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    a4.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    a4.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    a4.setIcon(BKD);
                }

            }
            else if(game.getToCol() == 1)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    b4.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    b4.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    b4.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    b4.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    b4.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    b4.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    b4.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    b4.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    b4.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    b4.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    b4.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    b4.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    b4.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    b4.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    b4.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    b4.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    b4.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    b4.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    b4.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    b4.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    b4.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    b4.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    b4.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    b4.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 2)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    c4.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    c4.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    c4.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    c4.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    c4.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    c4.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    c4.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    c4.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    c4.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    c4.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    c4.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    c4.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    c4.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    c4.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    c4.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    c4.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    c4.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    c4.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    c4.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    c4.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    c4.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    c4.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    c4.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    c4.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 3)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    d4.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    d4.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    d4.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    d4.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    d4.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    d4.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    d4.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    d4.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    d4.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    d4.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    d4.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    d4.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    d4.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    d4.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    d4.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    d4.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    d4.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    d4.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    d4.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    d4.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    d4.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    d4.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    d4.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    d4.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 4)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    e4.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    e4.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    e4.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    e4.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    e4.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    e4.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    e4.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    e4.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    e4.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    e4.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    e4.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    e4.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    e4.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    e4.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    e4.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    e4.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    e4.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    e4.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    e4.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    e4.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    e4.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    e4.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    e4.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    e4.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 5)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    f4.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    f4.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    f4.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    f4.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    f4.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    f4.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    f4.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    f4.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    f4.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    f4.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    f4.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    f4.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    f4.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    f4.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    f4.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    f4.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    f4.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    f4.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    f4.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    f4.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    f4.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    f4.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    f4.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    f4.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 6)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    g4.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    g4.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    g4.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    g4.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    g4.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    g4.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    g4.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    g4.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    g4.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    g4.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    g4.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    g4.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    g4.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    g4.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    g4.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    g4.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    g4.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    g4.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    g4.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    g4.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    g4.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    g4.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    g4.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    g4.setIcon(BKD);
                }
            }
            else
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    h4.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    h4.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    h4.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    h4.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    h4.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    h4.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    h4.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    h4.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    h4.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    h4.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    h4.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    h4.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    h4.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    h4.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    h4.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    h4.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    h4.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    h4.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    h4.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    h4.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    h4.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    h4.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    h4.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    h4.setIcon(BKD);
                }
            }
        }
    }

    private void mousePressed3rdRank()
    {
        if(game.getToRow() == 5)
        {
            if(game.getToCol() == 0)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    a3.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    a3.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    a3.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    a3.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    a3.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    a3.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    a3.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    a3.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    a3.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    a3.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    a3.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    a3.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    a3.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    a3.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    a3.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    a3.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    a3.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    a3.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    a3.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    a3.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    a3.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    a3.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    a3.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    a3.setIcon(BKD);
                }

            }
            else if(game.getToCol() == 1)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    b3.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    b3.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    b3.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    b3.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    b3.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    b3.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    b3.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    b3.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    b3.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    b3.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    b3.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    b3.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    b3.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    b3.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    b3.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    b3.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    b3.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    b3.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    b3.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    b3.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    b3.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    b3.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    b3.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    b3.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 2)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    c3.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    c3.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    c3.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    c3.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    c3.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    c3.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    c3.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    c3.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    c3.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    c3.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    c3.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    c3.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    c3.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    c3.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    c3.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    c3.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    c3.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    c3.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    c3.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    c3.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    c3.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    c3.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    c3.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    c3.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 3)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    d3.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    d3.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    d3.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    d3.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    d3.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    d3.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    d3.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    d3.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    d3.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    d3.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    d3.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    d3.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    d3.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    d3.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    d3.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    d3.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    d3.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    d3.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    d3.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    d3.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    d3.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    d3.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    d3.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    d3.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 4)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    e3.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    e3.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    e3.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    e3.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    e3.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    e3.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    e3.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    e3.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    e3.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    e3.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    e3.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    e3.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    e3.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    e3.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    e3.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    e3.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    e3.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    e3.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    e3.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    e3.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    e3.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    e3.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    e3.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    e3.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 5)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    f3.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    f3.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    f3.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    f3.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    f3.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    f3.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    f3.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    f3.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    f3.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    f3.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    f3.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    f3.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    f3.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    f3.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    f3.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    f3.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    f3.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    f3.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    f3.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    f3.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    f3.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    f3.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    f3.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    f3.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 6)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    g3.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    g3.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    g3.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    g3.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    g3.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    g3.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    g3.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    g3.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    g3.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    g3.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    g3.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    g3.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    g3.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    g3.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    g3.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    g3.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    g3.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    g3.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    g3.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    g3.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    g3.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    g3.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    g3.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    g3.setIcon(BKD);
                }
            }
            else
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    h3.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    h3.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    h3.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    h3.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    h3.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    h3.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    h3.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    h3.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    h3.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    h3.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    h3.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    h3.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    h3.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    h3.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    h3.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    h3.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    h3.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    h3.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    h3.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    h3.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    h3.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    h3.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    h3.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    h3.setIcon(BKD);
                }
            }
        }
    }

    private void mousePressed2ndRank()
    {
        if(game.getToRow() == 6)
        {
            if(game.getToCol() == 0)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    a2.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    a2.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    a2.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    a2.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    a2.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    a2.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    a2.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    a2.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    a2.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    a2.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    a2.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    a2.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    a2.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    a2.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    a2.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    a2.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    a2.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    a2.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    a2.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    a2.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    a2.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    a2.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    a2.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    a2.setIcon(BKD);
                }

            }
            else if(game.getToCol() == 1)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    b2.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    b2.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    b2.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    b2.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    b2.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    b2.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    b2.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    b2.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    b2.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    b2.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    b2.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    b2.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    b2.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    b2.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    b2.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    b2.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    b2.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    b2.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    b2.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    b2.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    b2.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    b2.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    b2.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    b2.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 2)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    c2.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    c2.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    c2.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    c2.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    c2.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    c2.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    c2.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    c2.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    c2.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    c2.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    c2.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    c2.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    c2.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    c2.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    c2.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    c2.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    c2.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    c2.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    c2.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    c2.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    c2.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    c2.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    c2.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    c2.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 3)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    d2.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    d2.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    d2.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    d2.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    d2.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    d2.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    d2.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    d2.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    d2.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    d2.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    d2.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    d2.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    d2.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    d2.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    d2.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    d2.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    d2.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    d2.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    d2.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    d2.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    d2.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    d2.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    d2.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    d2.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 4)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    e2.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    e2.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    e2.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    e2.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    e2.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    e2.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    e2.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    e2.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    e2.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    e2.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    e2.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    e2.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    e2.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    e2.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    e2.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    e2.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    e2.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    e2.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    e2.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    e2.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    e2.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    e2.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    e2.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    e2.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 5)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    f2.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    f2.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    f2.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    f2.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    f2.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    f2.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    f2.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    f2.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    f2.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    f2.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    f2.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    f2.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    f2.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    f2.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    f2.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    f2.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    f2.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    f2.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    f2.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    f2.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    f2.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    f2.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    f2.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    f2.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 6)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    g2.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    g2.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    g2.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    g2.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    g2.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    g2.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    g2.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    g2.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    g2.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    g2.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    g2.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    g2.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    g2.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    g2.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    g2.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    g2.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    g2.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    g2.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    g2.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    g2.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    g2.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    g2.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    g2.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    g2.setIcon(BKD);
                }
            }
            else
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    h2.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    h2.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    h2.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    h2.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    h2.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    h2.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    h2.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    h2.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    h2.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    h2.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    h2.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    h2.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    h2.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    h2.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    h2.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    h2.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    h2.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    h2.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    h2.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    h2.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    h2.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    h2.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    h2.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    h2.setIcon(BKD);
                }
            }
        }
    }

    private void mousePressed1stRank()
    {
        if(game.getToRow() == 7)
        {
            if(game.getToCol() == 0)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    a1.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    a1.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    a1.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    a1.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    a1.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    a1.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    a1.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    a1.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    a1.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    a1.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    a1.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    a1.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    a1.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    promotionSquare = "a1";
                    promotionFrame.setVisible(true);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    a1.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    a1.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    a1.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    a1.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    a1.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    a1.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    a1.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    a1.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    a1.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    a1.setIcon(BKD);
                }

            }
            else if(game.getToCol() == 1)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    b1.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    b1.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    b1.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    b1.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    b1.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    b1.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    b1.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    b1.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    b1.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    b1.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    b1.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    b1.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    promotionSquare = "b1";
                    promotionFrame.setVisible(true);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    b1.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    b1.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    b1.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    b1.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    b1.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    b1.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    b1.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    b1.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    b1.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    b1.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    b1.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 2)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    c1.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    c1.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    c1.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    c1.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    c1.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    c1.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    c1.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    c1.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    c1.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    c1.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    c1.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    if(game.getFromCol() == 4)
                    {
                        c1.setIcon(WKD);
                        d1.setIcon(WRL);
                        a1.setIcon(DSQ);
                        game.setBoardArraySpot(7, 3, "WRL");
                        game.setBoardArraySpot(7, 0, "SQD");
                    }
                    else
                    {
                        c1.setIcon(WKD);
                    }
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    c1.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    promotionSquare = "c1";
                    promotionFrame.setVisible(true);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    c1.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    c1.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    c1.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    c1.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    c1.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    c1.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    c1.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    c1.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    c1.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    c1.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 3)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    d1.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    d1.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    d1.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    d1.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    d1.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    d1.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    d1.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    d1.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    d1.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    d1.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    d1.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    d1.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    promotionSquare = "d1";
                    promotionFrame.setVisible(true);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    d1.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    d1.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    d1.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    d1.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    d1.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    d1.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    d1.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    d1.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    d1.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    d1.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    d1.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 4)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    e1.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    e1.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    e1.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    e1.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    e1.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    e1.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    e1.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    e1.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    e1.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    e1.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    e1.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    e1.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    e1.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    promotionSquare = "e1";
                    promotionFrame.setVisible(true);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    e1.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    e1.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    e1.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    e1.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    e1.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    e1.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    e1.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    e1.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    e1.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    e1.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 5)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    f1.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    f1.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    f1.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    f1.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    f1.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    f1.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    f1.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    f1.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    f1.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    f1.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    f1.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    f1.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    promotionSquare = "f1";
                    promotionFrame.setVisible(true);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    f1.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    f1.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    f1.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    f1.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    f1.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    f1.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    f1.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    f1.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    f1.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    f1.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    f1.setIcon(BKD);
                }
            }
            else if(game.getToCol() == 6)
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    g1.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    g1.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    g1.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    g1.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    g1.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    g1.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    g1.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    g1.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    g1.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    g1.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    g1.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    if(game.getFromCol() == 4)
                    {
                        g1.setIcon(WKD);
                        f1.setIcon(WRL);
                        h1.setIcon(LSQ);
                        game.setBoardArraySpot(7, 5, "WRL");
                        game.setBoardArraySpot(7, 7, "SQL");
                    }
                    else
                    {
                        g1.setIcon(WKD);
                    }

                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    g1.setIcon(BPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    promotionSquare = "g1";
                    promotionFrame.setVisible(true);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    g1.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    g1.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    g1.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    g1.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    g1.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    g1.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    g1.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    g1.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    g1.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    g1.setIcon(BKD);
                }
            }
            else
            {
                if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPL"))
                {
                    h1.setIcon(WPL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WPD"))
                {
                    h1.setIcon(WPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRL"))
                {
                    h1.setIcon(WRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WRD"))
                {
                    h1.setIcon(WRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WNL"))
                {
                    h1.setIcon(WNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WND"))
                {
                    h1.setIcon(WND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBL"))
                {
                    h1.setIcon(WBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WBD"))
                {
                    h1.setIcon(WBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQL"))
                {
                    h1.setIcon(WQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WQD"))
                {
                    h1.setIcon(WQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKL"))
                {
                    h1.setIcon(WKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("WKD"))
                {
                    h1.setIcon(WKD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPL"))
                {
                    promotionSquare = "h1";
                    promotionFrame.setVisible(true);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BPD"))
                {
                    h1.setIcon(BPD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRL"))
                {
                    h1.setIcon(BRL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BRD"))
                {
                    h1.setIcon(BRD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BNL"))
                {
                    h1.setIcon(BNL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BND"))
                {
                    h1.setIcon(BND);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBL"))
                {
                    h1.setIcon(BBL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BBD"))
                {
                    h1.setIcon(BBD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQL"))
                {
                    h1.setIcon(BQL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BQD"))
                {
                    h1.setIcon(BQD);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKL"))
                {
                    h1.setIcon(BKL);
                }
                else if(game.getBoardArraySpot(game.getToRow(), game.getToCol()).equals("BKD"))
                {
                    h1.setIcon(BKD);
                }
            }
        }
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public void actionPerformed(ActionEvent e)
    {
        promotionPiece = promotionField.getText();
        if(promotionSquare.equals("a8"))
        {
            promotionSquare = "";
            if(promotionPiece.equals("Q"))
            {
                a8.setIcon(WQL);
            }
            else if(promotionPiece.equals("N"))
            {
                a8.setIcon(WNL);
            }
            else if(promotionPiece.equals("B"))
            {
                a8.setIcon(WBL);
            }
            else if(promotionPiece.equals("R"))
            {
                a8.setIcon(WRL);
            }
        }
        if(promotionSquare.equals("b8"))
        {
            promotionSquare = "";
            if(promotionPiece.equals("Q"))
            {
                b8.setIcon(WQD);
            }
            else if(promotionPiece.equals("N"))
            {
                b8.setIcon(WND);
            }
            else if(promotionPiece.equals("B"))
            {
                b8.setIcon(WBD);
            }
            else if(promotionPiece.equals("R"))
            {
                b8.setIcon(WRD);
            }
        }
        if(promotionSquare.equals("c8"))
        {
            promotionSquare = "";
            if(promotionPiece.equals("Q"))
            {
                c8.setIcon(WQL);
            }
            else if(promotionPiece.equals("N"))
            {
                c8.setIcon(WNL);
            }
            else if(promotionPiece.equals("B"))
            {
                c8.setIcon(WBL);
            }
            else if(promotionPiece.equals("R"))
            {
                c8.setIcon(WRL);
            }
        }
        if(promotionSquare.equals("d8"))
        {
            promotionSquare = "";
            if(promotionPiece.equals("Q"))
            {
                d8.setIcon(WQD);
            }
            else if(promotionPiece.equals("N"))
            {
                d8.setIcon(WND);
            }
            else if(promotionPiece.equals("B"))
            {
                d8.setIcon(WBD);
            }
            else if(promotionPiece.equals("R"))
            {
                d8.setIcon(WRD);
            }
        }
        if(promotionSquare.equals("e8"))
        {
            promotionSquare = "";
            if(promotionPiece.equals("Q"))
            {
                e8.setIcon(WQL);
            }
            else if(promotionPiece.equals("N"))
            {
                e8.setIcon(WNL);
            }
            else if(promotionPiece.equals("B"))
            {
                e8.setIcon(WBL);
            }
            else if(promotionPiece.equals("R"))
            {
                e8.setIcon(WRL);
            }
        }
        if(promotionSquare.equals("f8"))
        {
            promotionSquare = "";
            if(promotionPiece.equals("Q"))
            {
                f8.setIcon(WQD);
            }
            else if(promotionPiece.equals("N"))
            {
                f8.setIcon(WND);
            }
            else if(promotionPiece.equals("B"))
            {
                f8.setIcon(WBD);
            }
            else if(promotionPiece.equals("R"))
            {
                f8.setIcon(WRD);
            }
        }
        if(promotionSquare.equals("g8"))
        {
            promotionSquare = "";
            if(promotionPiece.equals("Q"))
            {
                g8.setIcon(WQL);
            }
            else if(promotionPiece.equals("N"))
            {
                g8.setIcon(WNL);
            }
            else if(promotionPiece.equals("B"))
            {
                g8.setIcon(WBL);
            }
            else if(promotionPiece.equals("R"))
            {
                g8.setIcon(WRL);
            }
        }
        if(promotionSquare.equals("h8"))
        {
            promotionSquare = "";
            if(promotionPiece.equals("Q"))
            {
                h8.setIcon(WQD);
            }
            else if(promotionPiece.equals("N"))
            {
                h8.setIcon(WND);
            }
            else if(promotionPiece.equals("B"))
            {
                h8.setIcon(WBD);
            }
            else if(promotionPiece.equals("R"))
            {
                h8.setIcon(WRD);
            }
        }
        if(promotionSquare.equals("a1"))
        {
            promotionSquare = "";
            if(promotionPiece.equals("Q"))
            {
                a1.setIcon(BQD);
            }
            else if(promotionPiece.equals("N"))
            {
                a1.setIcon(BND);
            }
            else if(promotionPiece.equals("B"))
            {
                a1.setIcon(BBD);
            }
            else if(promotionPiece.equals("R"))
            {
                a1.setIcon(BRD);
            }
        }
        if(promotionSquare.equals("b1"))
        {
            promotionSquare = "";
            if(promotionPiece.equals("Q"))
            {
                b1.setIcon(BQL);
            }
            else if(promotionPiece.equals("N"))
            {
                b1.setIcon(BNL);
            }
            else if(promotionPiece.equals("B"))
            {
                b1.setIcon(BBL);
            }
            else if(promotionPiece.equals("R"))
            {
                b1.setIcon(BRL);
            }
        }
        if(promotionSquare.equals("c1"))
        {
            promotionSquare = "";
            if(promotionPiece.equals("Q"))
            {
                c1.setIcon(BQD);
            }
            else if(promotionPiece.equals("N"))
            {
                c1.setIcon(BND);
            }
            else if(promotionPiece.equals("B"))
            {
                c1.setIcon(BBD);
            }
            else if(promotionPiece.equals("R"))
            {
                c1.setIcon(BRD);
            }
        }
        if(promotionSquare.equals("d1"))
        {
            promotionSquare = "";
            if(promotionPiece.equals("Q"))
            {
                d1.setIcon(BQL);
            }
            else if(promotionPiece.equals("N"))
            {
                d1.setIcon(BNL);
            }
            else if(promotionPiece.equals("B"))
            {
                d1.setIcon(BBL);
            }
            else if(promotionPiece.equals("R"))
            {
                d1.setIcon(BRL);
            }
        }
        if(promotionSquare.equals("e1"))
        {
            promotionSquare = "";
            if(promotionPiece.equals("Q"))
            {
                e1.setIcon(BQD);
            }
            else if(promotionPiece.equals("N"))
            {
                e1.setIcon(BND);
            }
            else if(promotionPiece.equals("B"))
            {
                e1.setIcon(BBD);
            }
            else if(promotionPiece.equals("R"))
            {
                a1.setIcon(BRD);
            }
        }
        if(promotionSquare.equals("f1"))
        {
            promotionSquare = "";
            if(promotionPiece.equals("Q"))
            {
                f1.setIcon(BQL);
            }
            else if(promotionPiece.equals("N"))
            {
                f1.setIcon(BNL);
            }
            else if(promotionPiece.equals("B"))
            {
                f1.setIcon(BBL);
            }
            else if(promotionPiece.equals("R"))
            {
                f1.setIcon(BRL);
            }
        }
        if(promotionSquare.equals("g1"))
        {
            promotionSquare = "";
            if(promotionPiece.equals("Q"))
            {
                g1.setIcon(BQD);
            }
            else if(promotionPiece.equals("N"))
            {
                g1.setIcon(BND);
            }
            else if(promotionPiece.equals("B"))
            {
                g1.setIcon(BBD);
            }
            else if(promotionPiece.equals("R"))
            {
                g1.setIcon(BRD);
            }
        }
        if(promotionSquare.equals("h1"))
        {
            promotionSquare = "";
            if(promotionPiece.equals("Q"))
            {
                h1.setIcon(BQL);
            }
            else if(promotionPiece.equals("N"))
            {
                h1.setIcon(BNL);
            }
            else if(promotionPiece.equals("B"))
            {
                h1.setIcon(BBL);
            }
            else if(promotionPiece.equals("R"))
            {
                h1.setIcon(BRL);
            }
        }
        promotionField.setText("");
        promotionFrame.setVisible(false);
    }

}