/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package br.edu.ifpr.thecoxinhagame.conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/bd_the_coxinha_game";
    private static final String usuario = "aluno";
    private static final String senha = "mysql";
    private static Connection conexao = null;

    public static Connection getConexao() {
        if (conexao == null) {
            try {
                conexao = DriverManager.getConnection(URL, usuario, senha);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return conexao;
    }
}
