import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        //Creamos la ventana general en nuestro caso la llamaremos "frame".
        JFrame frame = new JFrame("Probando la librería Swing en Java");//creacion ventana + nombre
        frame.setBounds(0,0, 800, 400);//Establecemos posición + dimensiones
        frame.setLocationRelativeTo(null);//método para que aparezca centrada la ventana al abrirla.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Establecemos que cuando se cierra la ventan se detiene la ejecución.

        //Establecemos la distribución de los elementos el la ventana.
        //Usamos un panel general (Panel), donde establecemos el tipo de layout a usar.
        JPanel basePanel = new JPanel();
        basePanel.setBackground(Color.BLACK);
        basePanel.setLayout(new BorderLayout());

        //*************************************************************************************************************/

        //PANEL SUPERIOR (topPanel)
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.LIGHT_GRAY);
        topPanel.setPreferredSize(new Dimension(800, 40 ));
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        //BOTONES PANEL SUPERIOR: Creamos botones personalizados.
        JButton button1 = new JButton();
        button1.setText("Archivo");
        button1.setBackground(Color.LIGHT_GRAY);
        button1.setForeground(Color.BLACK);
        button1.setPreferredSize(new Dimension(100,30));
        button1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        button1.setFont(new Font("Arial", Font.PLAIN, 14));
        //Le damos interacción al boton
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("El boton funciona");
            }
        });

        JButton button2 = new JButton();
        button2.setText("Acciones");
        button2.setBackground(Color.LIGHT_GRAY);
        button2.setForeground(Color.BLACK);
        button2.setPreferredSize(new Dimension(100,30));
        button2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        button2.setFont(new Font("Arial", Font.PLAIN, 14));
        //Le damos interacción al boton
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("El boton funciona");
            }
        });

        JButton button3 = new JButton();
        button3.setText("Ayuda");
        button3.setBackground(Color.LIGHT_GRAY);
        button3.setForeground(Color.BLACK);
        button3.setPreferredSize(new Dimension(100,30));
        button3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        button3.setFont(new Font("Arial", Font.PLAIN, 14));
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("El boton funciona");
            }
        });

        JButton button4 = new JButton();
        button4.setText("Menú");
        button4.setBackground(Color.LIGHT_GRAY);
        button4.setForeground(Color.BLACK);
        button4.setPreferredSize(new Dimension(100,30));
        button4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        button4.setFont(new Font("Arial", Font.PLAIN, 14));
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("El boton funciona");
            }
        });


        topPanel.add(button1);
        topPanel.add(button2);
        topPanel.add(button3);
        topPanel.add(Box.createRigidArea(new Dimension(200, 0))); // Añade un gap horizontal.
        topPanel.add(button4);


        //Establecemos separación entre botones.
        ((FlowLayout)topPanel.getLayout()).setHgap(15);
        ((FlowLayout)topPanel.getLayout()).setVgap(5);

        //*************************************************************************************************************/

        //PANEL IZQUIERDO leftPanel.
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.LIGHT_GRAY);
        leftPanel.setPreferredSize(new Dimension(180,400));
        leftPanel.setLayout(new FlowLayout());


        //BOTONES PANEL IZQUIERDO: creamos botones personalizados.

        JButton button5 = new JButton();
        button5.setText("Nueva Liga");
        button5.setBackground(Color.LIGHT_GRAY);
        button5.setForeground(Color.BLACK);
        button5.setPreferredSize(new Dimension(150,40));
        button5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        button5.setFont(new Font("Arial", Font.PLAIN, 14));
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("El boton funciona");
            }
        });

        JButton button6 = new JButton();
        button6.setText("Jugar Liga");
        button6.setBackground(Color.LIGHT_GRAY);
        button6.setForeground(Color.BLACK);
        button6.setPreferredSize(new Dimension(150,40));
        button6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        button6.setFont(new Font("Arial", Font.PLAIN, 14));
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("El boton funciona");
            }
        });

        JButton button7 = new JButton();
        button7.setText("Siguiente jornada");
        button7.setBackground(Color.LIGHT_GRAY);
        button7.setForeground(Color.BLACK);
        button7.setPreferredSize(new Dimension(150,40));
        button7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        button7.setFont(new Font("Arial", Font.PLAIN, 14));

        JButton button8 = new JButton();
        button8.setText("Simulación completa");
        button8.setBackground(Color.LIGHT_GRAY);
        button8.setForeground(Color.BLACK);
        button8.setPreferredSize(new Dimension(150,40));
        button8.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        button8.setFont(new Font("Arial", Font.PLAIN, 14));

        JButton button9 = new JButton();
        button9.setText("Salir");
        button9.setBackground(Color.LIGHT_GRAY);
        button9.setForeground(Color.BLACK);
        button9.setPreferredSize(new Dimension(150,40));
        button9.setMaximumSize(new Dimension(150,40));
        button9.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        button9.setFont(new Font("Arial", Font.PLAIN, 14));
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("El boton funciona");
            }
        });

        leftPanel.add(button5);
        leftPanel.add(button6);
        leftPanel.add(button7);
        leftPanel.add(button8);
        leftPanel.add(button9);

        //Establecemos separación entre botones.
        ((FlowLayout)leftPanel.getLayout()).setHgap(10);
        ((FlowLayout)leftPanel.getLayout()).setVgap(30);

        //*************************************************************************************************************/

        //Panel central.
        JPanel centralPanel = new JPanel();
        centralPanel.setBackground(Color.GRAY);
        centralPanel.setLayout(new FlowLayout());

        Object[][] data = {
                {1 , "FC Barcelona", 76, 30, 24, 4, 2, 54, 9, "+45"},
                {2 , "Real Madrid", 65, 30, 20, 5, 5, 63, 24, "+39"},
                {3 , "Atletico de Madrid", 60, 30, 24, 4, 2, 54, 9, "+5"},
                {4 , "Real Sociedad", 54, 30, 24, 4, 2, 54, 9, "+5"},
                {5 , "Betis", 54, 30, 24, 4, 2, 54, 9, "+0"},
                {6 , "Villareal FC", 48, 30, 24, 4, 2, 54, 9, "-5"},
                {7 , "Athletic CLUB", 46, 30, 24, 4, 2, 54, 9, "-15"},
                {8 , "Osasuna", 41, 30, 24, 4, 2, 54, 9, "+4"},
                {9 , "Rayo Vallecano", 40, 30, 24, 4, 2, 54, 9, "+5"},
                {10 , "RCD Mallorca", 40, 30, 24, 4, 2, 54, 9, "+4"},
                {11 , "Girona FC", 38, 30, 24, 4, 2, 54, 9, "+1"},
                {12 , "RC Celta de Vigo", 36, 30, 24, 4, 2, 54, 9, "-3"},
                {13 , "Sevilla FC", 35, 30, 24, 4, 2, 54, 9, "-1"},
                {14 , "Real Valladoliz CF", 35, 30, 24, 4, 2, 54, 9, "+6"},
                {15 , "Cadiz CF", 32, 30, 24, 4, 2, 54, 9, "+1"},
                {16 , "Getafe CF", 31, 30, 24, 4, 2, 54, 9, "-6"},
                {17 , "UD Almería", 30, 30, 24, 4, 2, 54, 9, "-9"},
                {18 , "Valencia CF", 30, 30, 24, 4, 2, 54, 9, "-6"},
                {19 , "RCD Español", 28, 30, 24, 4, 2, 54, 9, "-20"},
                {20, "Elche", 13, 30, 24, 4, 2, 54, 9, "-22"},

        };
        // Creación nombre de columnas
        String[] columnNames = {"Posción", "Equipo", "PJ", "PG", "PE", "PP", "GF", "GC", "GD"};

        // Creación modelo de tabla estanadar, para mostrar nombre de las columnas
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);

        // Creación de la tabla usando el modelo estandar creado anteriormente.
        JTable table = new JTable(tableModel);


        // Set the header color to blue
        table.getTableHeader().setBackground(Color.BLUE);
        table.getTableHeader().setForeground(Color.WHITE);

        JScrollPane scrollPane = new JScrollPane(table);

        centralPanel.add(new JScrollPane(table));


        //Establecemos separación entre botones.
        ((FlowLayout)centralPanel.getLayout()).setHgap(10);
        ((FlowLayout)centralPanel.getLayout()).setVgap(10);


        //*************************************************************************************************************/

        //Agrupamos los peneles top, left y center en el base.
        //y a cada uno le damos su poscición en la ventana.

        basePanel.add(topPanel, BorderLayout.NORTH);
        basePanel.add(leftPanel, BorderLayout.WEST);
        basePanel.add(centralPanel, BorderLayout.CENTER);


        //Añadimos el panel al frame y visualizamos.
        frame.add(basePanel);
        frame.setVisible(true);

    }

}
