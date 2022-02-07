
package sistema.gui;

import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import java.awt.Font; 
import java.awt.BorderLayout; 
import java.awt.Color; 
import java.awt.EventQueue; 
import javax.swing.*; 
import javax.swing.border.EmptyBorder; 
import sistema.control.control;
public class Clientes extends JFrame{ 
    private JPanel contentPane; 
    private JTextField jtfNome; 
    private JTextField jtfEmail; 
    private JTextField jtfCelular; 
     
    public Clientes(){ 
        
        setTitle("PROGRAMA ClientesBD"); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setBounds(100,100,450,347); 
        contentPane = new JPanel(); 
        contentPane.setBorder(new EmptyBorder(5,5,5,5)); 
        setContentPane(contentPane); 
        contentPane.setLayout(null); 
        contentPane.setBackground(Color.BLACK); 
        setLocationRelativeTo(null); 
         
        JLabel lblNewLabel = new JLabel("CADASTRO DOS CLIENTES"); 
        lblNewLabel.setFont(new Font("Arial", Font.BOLD,25)); 
        lblNewLabel.setForeground(Color.white); 
        lblNewLabel.setBounds(60,12,360,54); 
        contentPane.add(lblNewLabel); 
         
        //LABEL NOME 
        JLabel lblNome = new JLabel("Nome :"); 
        lblNome.setFont(new Font("Tahoma", Font.BOLD,13)); 
        lblNome.setForeground(Color.cyan); 
        lblNome.setBounds(10,72,46,14); 
        contentPane.add(lblNome); 
         
        //LABEL EMAIL 
        JLabel lblEmail = new JLabel("Email :"); 
        lblEmail.setFont(new Font("Tahoma", Font.BOLD,14)); 
        lblEmail.setForeground(Color.cyan); 
        lblEmail.setBounds(10,109,46,14); 
        contentPane.add(lblEmail); 
         
        //LABEL CELULAR 
        JLabel lblCelular = new JLabel("Celular :"); 
        lblCelular.setFont(new Font("Tahoma", Font.BOLD,14)); 
        lblCelular.setForeground(Color.cyan); 
        lblCelular.setBounds(8,152,90,14); 
        contentPane.add(lblCelular); 
         
        //JTEXTFIELD 
        //NOME 
        jtfNome = new JTextField(); 
        jtfNome.setBounds(66,70,355,20); 
        contentPane.add(jtfNome); 
        //EMAIL 
        jtfEmail = new JTextField(); 
        jtfEmail.setBounds(66,109,355,20); 
        contentPane.add(jtfEmail); 
        //CELULAR 
        jtfCelular = new JTextField(); 
        jtfCelular.setBounds(66,151,178,20); 
        contentPane.add(jtfCelular); 
         
        //CRIANDO BOTÃO CADASTRAR 
        JButton btnCadastrar = new JButton("CADASTRAR"); 
        btnCadastrar.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent arg0){ 
            Usuario usuarios = new Usuario();
            usuarios.setNome(jtfNome.getText());
            usuarios.setEmail(jtfEmail.getText());
            usuarios.setCelular(jtfCelular.getText());
           // fazendo a validação dos dados
        if ((jtfNome.getText().isEmpty()) || (jtfEmail.getText().isEmpty()) || (jtfCelular.getText().isEmpty())){
        JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
    }
        else {

        // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
        control dao = new control();
        dao.adiciona(usuarios);
        JOptionPane.showMessageDialog(null, "Usuário "+jtfNome.getText()+" inserido com sucesso! ");
    }

        // apaga os dados preenchidos nos campos de texto
        jtfNome.setText("");
        jtfEmail.setText("");
        jtfCelular.setText("");

          

                
            } 
        } 
        ); 
        btnCadastrar.setFont(new Font("Tahoma",Font.BOLD,11)); 
        btnCadastrar.setBounds(66,215,112,23); 
        contentPane.add(btnCadastrar); 
         
        //CRIANDO BOTÃO LIMPAR 
        JButton btnLimpar = new JButton("LIMPAR"); 
        btnLimpar.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent arg0){ 
                 jtfNome.setText(""); 
                 jtfEmail.setText(""); 
                 jtfCelular.setText(""); 
            } 
        } 
        ); 
        btnLimpar.setFont(new Font("Tahoma",Font.BOLD,11)); 
        btnLimpar.setBounds(193,215,102,23); 
        contentPane.add(btnLimpar); 
         
    } 

}

 