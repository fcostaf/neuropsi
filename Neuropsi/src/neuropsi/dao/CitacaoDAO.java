/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuropsi.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import neuropsi.model.Citacao;
/**
 *
 * @author 771000343
 */
public class CitacaoDAO {
    public void cadastrarCitacao(Citacao c) throws ExceptionDAO{
        String sql="insert into citacao (fonte,descricao) values (?,?)";
        PreparedStatement stmt=null;
        Connection connection=null;
        try{
            connection=new Conexao().getConnection();
            stmt=connection.prepareStatement(sql);
            stmt.setString(1,c.getFonte());
            stmt.setString(2,c.getDescricao());
            stmt.execute();
            
        }catch(SQLException e){
            e.printStackTrace();
            throw new ExceptionDAO("Erro ao cadastrar citação:"+e);
        }finally{
            try {if(stmt!=null){stmt.close();}
            }catch (SQLException e){e.printStackTrace();}
            try {if(connection !=null){connection.close();}
            }catch(SQLException e){e.printStackTrace();}
        }
        String sql1="insert into tag (descricao) values (?)";
        PreparedStatement stmt1=null;
        Connection connection1=null;
        try{
            connection1=new Conexao().getConnection();
            stmt1=connection1.prepareStatement(sql1);
            stmt1.setString(1,c.getTags());
            stmt1.execute();
            
        }catch(SQLException e){
            e.printStackTrace();
            throw new ExceptionDAO("Erro ao cadastrar tag:"+e);
        }finally{
            try {if(stmt1!=null){stmt1.close();}
            }catch (SQLException e){e.printStackTrace();}
            try {if(connection1 !=null){connection.close();}
            }catch(SQLException e){e.printStackTrace();}
        }
    }
    
    public void alterarCitacao(Citacao c) throws ExceptionDAO{
        String sql="update citacao set fonte=?,descricao=? where idcitacao=?";
        PreparedStatement stmt=null;
        Connection connection=null;
        try{
            connection=new Conexao().getConnection();
            stmt=connection.prepareStatement(sql);
            stmt.setString(1, c.getFonte());
            stmt.setString(2,c.getDescricao());
            stmt.execute();
        }catch(SQLException e){
            e.printStackTrace();
            throw new ExceptionDAO("Erro ao alterar citação: "+e);
        }finally{
            try {if(stmt!=null){stmt.close();}
            }catch (SQLException e){e.printStackTrace();}
            try {if(connection !=null){connection.close();}
            }catch(SQLException e){e.printStackTrace();}
        }
    }
    
    public void excluirCitacao(int id) throws ExceptionDAO{
        String sql="delete from citacao where idcitacao=?";
        PreparedStatement stmt=null;
        Connection connection=null;
        try{
            connection=new Conexao().getConnection();
            stmt=connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        }catch(SQLException e){
            e.printStackTrace();
            throw new ExceptionDAO("Erro ao excluir citacao: "+e);
        }finally{
            try {if(stmt!=null){stmt.close();}
            }catch (SQLException e){e.printStackTrace();}
            try {if(connection !=null){connection.close();}
            }catch(SQLException e){e.printStackTrace();}
        }
    }
    
    public ArrayList<String> listarTags() throws ExceptionDAO{
        ResultSet rs=null;
        Connection conn=null;
        PreparedStatement stmt=null;
        Citacao c=null;
        ArrayList<String> listaDeTags=null;
        
        try{
            String sql="select descricao from tag order by descricao";
            conn=new Conexao().getConnection();
            stmt=conn.prepareStatement(sql);
            rs=stmt.executeQuery();
            if(rs!=null){
                listaDeTags=new ArrayList<>();
                while(rs.next()){
                    listaDeTags.add(rs.getString("descricao"));}}
                }catch(SQLException e) {e.printStackTrace();
                        throw new ExceptionDAO("Erro ao listar sintomas: "+e);
                }finally{try{if(rs!=null){rs.close();}
                        }catch(SQLException e){e.printStackTrace();}
                        try{if(stmt!=null){stmt.close();}
                        }catch(SQLException e){e.printStackTrace();
                        }try{if(conn!=null){conn.close();}
                        }catch(Exception e){
                            e.printStackTrace();}
            }return listaDeTags;
    }
}
