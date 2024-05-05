package org.nahomy;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Proyecto extends JFrame
{

    /*
    JMenu enti = new JMenu("Entidades");
    enti.addActionListener(new ActionListener()
{

}

     */
    private JDesktopPane desktopPane;

    public Proyecto()
    {
        super("Venta de Ropa");

        desktopPane = new JDesktopPane();
        getContentPane().add(desktopPane, BorderLayout.CENTER);


        Cliente cliente = new Cliente();
        Producto producto = new Producto();
        Proveedor proveedor = new Proveedor();
        Vendedor vendedor = new Vendedor();


        desktopPane.add(producto);
        desktopPane.add(cliente);
        desktopPane.add(proveedor);
        desktopPane.add(vendedor);

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        inicializarProyecto();
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(Proyecto::new);
    }

    private void inicializarProyecto()
    {

        JMenuBar menuBar = new JMenuBar();
        JMenu menuDatos = new JMenu("Entidades");

        JMenuItem producto = new JMenuItem("Producto");
        JMenuItem cliente = new JMenuItem("Cliente");
        JMenuItem proveedor = new JMenuItem("Proveedor");
        JMenuItem vendedor = new JMenuItem("Vendedor");

        producto.setBackground(Color.BLUE);
        cliente.setBackground(Color.BLUE);
        proveedor.setBackground(Color.BLUE);
        vendedor.setBackground(Color.BLUE);

        menuDatos.add(producto);
        menuDatos.add(cliente);
        menuDatos.add(proveedor);
        menuDatos.add(vendedor);

        menuBar.add(menuDatos);
        setJMenuBar(menuBar);

    }


    class Cliente extends JInternalFrame
    {
        public Cliente()
        {
            super("Cliente", true, true, true, true);
            inicializarCliente();
        }

        private void inicializarCliente()
        {
            setSize(300, 300);

       /*
        setOpaque(true);
        setBorder(new LineBorder(new Color(0, 0, 0)));
        setIconifiable(false);
       */

            JMenuBar menuBar = new JMenuBar();
            JMenu menuDatos = new JMenu("Datos");

            JMenuItem nombre = new JMenuItem("Nombre");
            JMenuItem apellido = new JMenuItem("Apellido");
            JMenuItem telefomo = new JMenuItem("Telefono");

            nombre.setBackground(Color.blue);
            apellido.setBackground(Color.BLUE);
            telefomo.setBackground(Color.BLUE);

            menuDatos.add(nombre);
            menuDatos.add(apellido);
            menuDatos.add(telefomo);

            menuBar.add(menuDatos);

            setJMenuBar(menuBar);

            setVisible(true);


        /*
        JLabel text = new JLabel("Clientes");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        panel.setBorder(BorderFactory.createTitledBorder(null, "Clientes", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.black));
        panel.setAlignmentX(LEFT_ALIGNMENT);
        panel.add(text);

        setName("Clientes");
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().setPreferredSize(new Dimension(800, 400));
        pack();
        */

        }
    }

    class Producto extends JInternalFrame {
        private ArrayList<Producto> Productos;
        private String nombre;
        private double precio;

        public Producto(String nombre, double precio)
        {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setPrecio(String precio) {
            this.nombre = precio;
        }

        public Producto() {

            super("Producto", true, true, true, true);
            Productos = new ArrayList<>();
            inicializarProducto();
        }

        private void inicializarProducto() {
            setSize(300, 300);

            JMenuBar menuBar = new JMenuBar();
            JMenu menuDatos = new JMenu("Datos");

            JMenuItem nombre = new JMenuItem("Nombre");
            JMenuItem descripcion = new JMenuItem("Descripcion");
            JMenuItem precio = new JMenuItem("Precio");
            JMenuItem mostrar = new JMenuItem("Mostrar productos");

            nombre.setBackground(Color.BLUE);
            descripcion.setBackground(Color.BLUE);
            precio.setBackground(Color.BLUE);
            mostrar.setBackground(Color.BLUE);

            menuDatos.add(nombre);
            menuDatos.add(descripcion);
            menuDatos.add(precio);
            menuDatos.add(mostrar);

            menuBar.add(menuDatos);
            setJMenuBar(menuBar);

            nombre.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto");
                    if (nombre != null)
                    {
                        String precio = JOptionPane.showInputDialog("Ingrese el precio del producto");
                        if (precio != null)
                        {
                            double precio1 = Double.parseDouble(precio);
                            Producto producto = new Producto(nombre, precio1);
                            Productos.add(producto);
                            JOptionPane.showMessageDialog(null, "Producto guardado");
                        }
                    }
                }
            });

            precio.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String precio = JOptionPane.showInputDialog("Ingrese el precio del producto");
                    if (precio != null) ;
                    {

                    }
                }
            });

            mostrar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (Productos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay productos");
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < Productos.size(); i++) {
                            sb.append("Producto").append(i + 1).append(":").append(Productos.get(i).getNombre()).append("- precio:").append(Productos.get(i).getPrecio()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString(), "Producto guardado", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            });

            setVisible(true);
        }
    }

    class Proveedor extends JInternalFrame {
        public Proveedor() {
            super("Proveedor", true, true, true, true);
            inicializarProveedor();
        }

        private void inicializarProveedor() {
            setSize(300, 300);

            JMenuBar menuBar = new JMenuBar();
            JMenu menuDatos = new JMenu("Datos");

            JMenuItem nombre = new JMenuItem("Nombre");
            JMenuItem apellido = new JMenuItem("Apellido");
            JMenuItem telefono = new JMenuItem("Telefono");
            JMenuItem direccion = new JMenuItem("Direccion");

            nombre.setBackground(Color.BLUE);
            apellido.setBackground(Color.BLUE);
            telefono.setBackground(Color.BLUE);
            direccion.setBackground(Color.BLUE);

            menuDatos.add(nombre);
            menuDatos.add(apellido);
            menuDatos.add(telefono);
            menuDatos.add(direccion);

            menuBar.add(menuDatos);
            setJMenuBar(menuBar);

            setVisible(true);
        }
    }

    class Vendedor extends JInternalFrame {
        public Vendedor() {
            super("Vendedor", true, true, true, true);
            inicializarVendedor();
        }

        private void inicializarVendedor() {
            setSize(300, 300);

            JMenuBar menuBar = new JMenuBar();
            JMenu menuDatos = new JMenu("Datos");

            JMenuItem nombre = new JMenuItem("Nombre");
            JMenuItem apellido = new JMenuItem("Apellido");
            JMenuItem telefono = new JMenuItem("Telefono");
            JMenuItem direccion = new JMenuItem("Direccion");

            nombre.setBackground(Color.BLUE);
            apellido.setBackground(Color.BLUE);
            telefono.setBackground(Color.BLUE);
            direccion.setBackground(Color.BLUE);

            menuDatos.add(nombre);
            menuDatos.add(apellido);
            menuDatos.add(telefono);
            menuDatos.add(direccion);

            menuBar.add(menuDatos);
            setJMenuBar(menuBar);

            setVisible(true);
        }
    }
}
