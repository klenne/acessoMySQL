/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import javax.swing.JOptionPane;
import model.bean.Pessoa;
import model.dao.PessoaDAO;

/**
 *
 * @author Klenne
 */
public class ProgAcesso {
     public static void main(String[] args){
    Pessoa p=new Pessoa();
    PessoaDAO dao=new PessoaDAO();
    String id=JOptionPane.showInputDialog("Digite o id para a pessoa que quer cadastrar:");
    String nome=JOptionPane.showInputDialog("Digite o nome para a pessoa que quer cadastrar:");
    p.setId(Integer.parseInt(id));
    p.setNome(nome);
    dao.create(p);
    }
    
}
\\usando git
