/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.gui.acao.Erro;
import br.edu.utfpr.gui.acao.Sucesso;
import br.edu.utfpr.modelo.Estoque;
import br.edu.utfpr.modelo.Item;
import br.edu.utfpr.modelo.Pessoa;
import br.edu.utfpr.modelo.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author UTFPR
 */
public class DaoDerby implements Dao {

    Statement stmt;
    Sucesso sucesso;
    Erro erro;
    
    

    //Quando contruir  a classe, conectar em um banco
    public DaoDerby() {
        String username = "cismoski";
        String password = "123";
        String url = "jdbc:derby://localhost:1527/MeuBanco";

        // depois mandar conectar
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();

        } catch (SQLException se) {
            System.out.println("Mensagem: " + se.getMessage());
        }
        System.out.println("Conexão estabelecida.");
    }

    @Override
    public void adicionar(Pessoa p) {
       String instrucao = "INSERT INTO PESSOA (NOME,SOBRENOME,ENDERECO,COD) VALUES(" + "\'" + p.getNome() + "\'" + "," + "\'" + p.getSobrenome() + "\'" + "," + "\'"+ p.getEndereco() +"\'"+ "," + p.getCod() + ")";

        System.out.println(instrucao);
       try{
           stmt.executeUpdate(instrucao);
           sucesso = new Sucesso();
           sucesso.setLocationRelativeTo(null);
           sucesso.setVisible(true);
       }catch(SQLException se){
           System.out.println("Mensagem: " + se.getMessage());
           erro = new Erro();
           erro.setLocationRelativeTo(null);
           erro.setVisible(true);
       }
        
    }
    
    @Override
    public void adicionarProduto(Produto p){
        String instrucao = "INSERT INTO PRODUTO (COD,VALOR,NOME) VALUES(" + p.getCod() + "," + p.getValor() +","+ "\'"+ p.getNome() + "\'" + ")";
        
        System.out.println(instrucao);
       try{
           stmt.executeUpdate(instrucao);
           
       }catch(SQLException se){
           System.out.println("Mensagem: " + se.getMessage());
           Erro erro = new Erro();
           erro.setLocationRelativeTo(null);
           erro.setVisible(true);
       }
        
    }
    
    public void alterarItem(Item i){
        //UPDATE tbLogradouro SET vcDescricao = 'Wind 2' ,vcCep = '04774577' WHERE bgId = 3
        
        
        int quantidade = i.getQuantidade();
        String instrucao = "UPDATE ITEM SET QUANTIDADE = QUANTIDADE + " + quantidade + " WHERE COD_PRODUTO = " + i.getCod();       
        System.out.println(instrucao);
       try{
           stmt.execute(instrucao);
           System.out.println("Dado ATUALIZADO.");
       }catch(SQLException se){
           erro = new Erro();
           erro.setLocationRelativeTo(null);
           erro.setVisible(true);
           System.out.println("Mensagem: " + se.getMessage());
       }
        
    }
    
       public void adicionarItem(Item i){
        //UPDATE tbLogradouro SET vcDescricao = 'Wind 2' ,vcCep = '04774577' WHERE bgId = 3
        
       
        String instrucao = "INSERT INTO ITEM (COD_PRODUTO,QUANTIDADE) VALUES (" + i.getCod() + "," +i.getQuantidade() + ")";       
        System.out.println(instrucao);
       try{
           stmt.executeUpdate(instrucao);
           System.out.println("Dado INSERIDO.");
       }catch(SQLException se){
           erro = new Erro();
           erro.setLocationRelativeTo(null);
           erro.setVisible(true);
           System.out.println("Mensagem: " + se.getMessage());
       }
        
    }
    
    

    @Override
    public void remover(Pessoa p) {
        //DELETE FROM CISMOSKI.PESSOA WHERE NOME = 'Joao' AND SOBRENOME = 'Silva' AND IDADE = 20;
        
        String instrucao = "DELETE FROM PESSOA WHERE NOME = " + "\'" + p.getNome() +"\'";
        
        System.out.println(instrucao);
        try{
           stmt.executeUpdate(instrucao);
       }catch(SQLException se){
           System.out.println("Mensagem: " + se.getMessage());
       }
        System.out.println("Dado removido.");
    }

    
    @Override
    public ArrayList<Estoque> listaEstoque() {
        String instrucaoItem = "SELECT QUANTIDADE FROM ITEM";
        String instrucaoProduto = "SELECT * FROM PRODUTO";
        
        ArrayList<String> cod = new ArrayList<>();
        ArrayList<String> quantidade = new ArrayList<>();
        ArrayList<String> nome = new ArrayList<>();   
        ArrayList<Estoque> listaEstoque = new ArrayList<>();
        
        
        try{
            ResultSet item = stmt.executeQuery(instrucaoItem);
            while(item.next()){
                quantidade.add(item.getString("QUANTIDADE"));
            }
        }catch(SQLException ex){
             System.out.println("Mensagem: " + ex.getMessage());
        }
       
        // Fazer array pra nome, idade e sobrenome.
        try{
        
             ResultSet produto = stmt.executeQuery(instrucaoProduto);
        while(produto.next()){       
            nome.add(produto.getString("NOME"));
            cod.add(produto.getString("COD"));
        }  
       }catch(SQLException se){
           System.out.println("Mensagem: " + se.getMessage());
       }
        for (int j = 0; j < nome.size(); j++) {
            Estoque estoque = new Estoque(cod.get(j),quantidade.get(j),nome.get(j));
            listaEstoque.add(estoque);
        }
        return listaEstoque;
    }
 }


