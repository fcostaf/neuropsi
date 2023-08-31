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
import neuropsi.model.Sintoma;

/**
 *
 * @author 771000343
 */
public class SintomaDAO {
    public void cadastrarSintoma(Sintoma s) throws ExceptionDAO{
        String sql="insert into sintoma (nome,descricao) values (?,?)";
        PreparedStatement stmt=null;
        Connection connection=null;
        try{
            connection=new Conexao().getConnection();
            stmt=connection.prepareStatement(sql);
            stmt.setString(1,s.getNome());
            stmt.setString(2,s.getDescricao());
            stmt.execute();
            
        }catch(SQLException e){
            e.printStackTrace();
            throw new ExceptionDAO("Erro ao cadastrar sintoma:"+e);
        }finally{
            try {if(stmt!=null){stmt.close();}
            }catch (SQLException e){e.printStackTrace();}
            try {if(connection !=null){connection.close();}
            }catch(SQLException e){e.printStackTrace();}
        }
    }
    
    public void alterarSintoma(Sintoma s) throws ExceptionDAO{
        String sql="update sintoma set nome=?,descricao=? where idsintoma=?";
        PreparedStatement stmt=null;
        Connection connection=null;
        try{
            connection=new Conexao().getConnection();
            stmt=connection.prepareStatement(sql);
            stmt.setString(1, s.getNome());
            stmt.setString(2,s.getDescricao());
            stmt.execute();
        }catch(SQLException e){
            e.printStackTrace();
            throw new ExceptionDAO("Erro ao alterar paciente: "+e);
        }finally{
            try {if(stmt!=null){stmt.close();}
            }catch (SQLException e){e.printStackTrace();}
            try {if(connection !=null){connection.close();}
            }catch(SQLException e){e.printStackTrace();}
        }
    }
    
    public void excluirSintoma(int id) throws ExceptionDAO{
        String sql="delete from sintoma where idsintoma=?";
        PreparedStatement stmt=null;
        Connection connection=null;
        try{
            connection=new Conexao().getConnection();
            stmt=connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        }catch(SQLException e){
            e.printStackTrace();
            throw new ExceptionDAO("Erro ao excluir sintoma: "+e);
        }finally{
            try {if(stmt!=null){stmt.close();}
            }catch (SQLException e){e.printStackTrace();}
            try {if(connection !=null){connection.close();}
            }catch(SQLException e){e.printStackTrace();}
        }
    }
    
    public ArrayList<Sintoma> listarSintomas(String nome) throws ExceptionDAO{
        ResultSet rs=null;
        Connection conn=null;
        PreparedStatement stmt=null;
        Sintoma s=null;
        ArrayList<Sintoma> listaDeSintomas=null;
        
        try{
            String sql="select * from sintoma where nome like '%"+nome+"%' order by nome";
            conn=new Conexao().getConnection();
            stmt=conn.prepareStatement(sql);
            rs=stmt.executeQuery();
            if(rs!=null){
                listaDeSintomas=new ArrayList<>();
                while(rs.next()){
                    s=new Sintoma();
                    s.setIdsintoma(rs.getString("idsintoma"));
                    s.setNome(rs.getString("nome"));
                    s.setDescricao(rs.getString("descricao"));
                    listaDeSintomas.add(s);}}
                }catch(SQLException e) {e.printStackTrace();
                        throw new ExceptionDAO("Erro ao listar sintomas: "+e);
                }finally{try{if(rs!=null){rs.close();}
                        }catch(SQLException e){e.printStackTrace();}
                        try{if(stmt!=null){stmt.close();}
                        }catch(SQLException e){e.printStackTrace();
                        }try{if(conn!=null){conn.close();}
                        }catch(Exception e){
                            e.printStackTrace();}
            }return listaDeSintomas;
    }
}
