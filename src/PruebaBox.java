import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.WindowConstants;

public class PruebaBox{
    
       
    private JPanel panelSuperior, panelMedio, panelInferior;
    private JLabel etiqueta1, etiqueta2, etiqueta3;
    private JTextField cajaTexto;
    private JPasswordField cajaPass;
    private JButton botonAceptar, botonCancelar;
    private JFrame frame;

    public void construyePanelSuperior(){
        panelSuperior =new JPanel();
        etiqueta2= new JLabel("USER");
        cajaTexto = new JTextField(10);
        panelSuperior.setLayout(new BoxLayout(panelSuperior, BoxLayout.X_AXIS));
        panelSuperior.add(etiqueta2);
        panelSuperior.add(cajaTexto);
    }

    public void construyePanelMedio(){
        panelMedio=new JPanel();
        etiqueta3= new JLabel("PASS");
        cajaPass = new JPasswordField(10);
        panelMedio.setLayout(new BoxLayout(panelMedio, BoxLayout.X_AXIS));
        panelMedio.add(etiqueta3);
        //panelMedio.createVerticalGlue();
        panelMedio.add(cajaPass);
    }

    public void construyePanelInferior(){
        panelInferior=new JPanel();
        botonAceptar=new JButton("Aceptar");
        botonCancelar=new JButton("Cancelar");
        panelInferior.setLayout(new BoxLayout(panelInferior, BoxLayout.X_AXIS));
        panelInferior.add(botonAceptar);
        panelInferior.add(Box.createRigidArea(new Dimension(20,0)));
        panelInferior.add(botonCancelar);
    }

    public void construyeVentana(){
        frame = new JFrame();
        etiqueta1 = new JLabel("Demo por inforux");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS) );
        frame.add(etiqueta1);
        frame.add(panelSuperior);
        frame.add(panelMedio);
        frame.add(panelInferior);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public PruebaBox(){
        
        construyePanelSuperior();
        construyePanelMedio();
        construyePanelInferior();
        construyeVentana();
        
        frame.setLocationRelativeTo(null);
        
        frame.setSize(300, 120);
    }

    public static void main (String [] inforux){
        new PruebaBox();
    }
}