package neuropsi.dao;
import neuropsi.model.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class PacienteDAO {

    public PacienteDAO() {
    }
    
    public void cadastrarPaciente(Paciente p) throws ExceptionDAO{
        String sql="insert into paciente (nome,sexo,lateralidade,dn,ln,escolaridade,curso,profissao,estado_civil,filhos,comentario) values (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt=null;
        Connection connection=null;
        try{
            connection=new Conexao().getConnection();
            stmt=connection.prepareStatement(sql);
            stmt.setString(1,p.getNome());
            stmt.setString(2,p.getSexo());
            stmt.setString(3,p.getLateralidade());
            stmt.setString(4,p.getDn());
            stmt.setString(5,p.getLn());
            stmt.setString(6,p.getEscolaridade());
            stmt.setString(7,p.getCurso());
            stmt.setString(8,p.getProfissao());
            stmt.setString(9,p.getEstado_civil());
            stmt.setString(10,p.getFilhos());
            stmt.setString(11,p.getComentario());
            stmt.execute();
            
        }catch(SQLException e){
            e.printStackTrace();
            throw new ExceptionDAO("Erro ao cadastrar paciente:"+e);
        }finally{
            try {if(stmt!=null){stmt.close();}
            }catch (SQLException e){e.printStackTrace();}
            try {if(connection !=null){connection.close();}
            }catch(SQLException e){e.printStackTrace();}
        }
    }
    
    public void alterarPaciente(Paciente p) throws ExceptionDAO{
        String sql="update paciente set nome=?,sexo=?,lateralidade=?,dn=?,ln=?,escolaridade=?,curso=?,profissao=?,estado_civil=?,filhos=?,comentario=? where idpaciente=?";
        PreparedStatement stmt=null;
        Connection connection=null;
        try{
            connection=new Conexao().getConnection();
            stmt=connection.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setString(2,p.getSexo());
            stmt.setString(3,p.getLateralidade());
            stmt.setString(4,p.getDn());
            stmt.setString(5,p.getLn());
            stmt.setString(6,p.getEscolaridade());
            stmt.setString(7,p.getCurso());
            stmt.setString(8,p.getProfissao());
            stmt.setString(9,p.getEstado_civil());
            stmt.setString(10,p.getFilhos());
            stmt.setString(11,p.getComentario());
            stmt.setString(12,p.getIdpaciente());
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
    
    public void excluirPaciente(int id) throws ExceptionDAO{
        String sql="delete from paciente where idpaciente=?";
        PreparedStatement stmt=null;
        Connection connection=null;
        try{
            connection=new Conexao().getConnection();
            stmt=connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        }catch(SQLException e){
            e.printStackTrace();
            throw new ExceptionDAO("Erro ao excluir paciente: "+e);
        }finally{
            try {if(stmt!=null){stmt.close();}
            }catch (SQLException e){e.printStackTrace();}
            try {if(connection !=null){connection.close();}
            }catch(SQLException e){e.printStackTrace();}
        }
    }
    
    public ArrayList<Paciente> listarPaciente(String nome) throws ExceptionDAO{
        ResultSet rs=null;
        Connection conn=null;
        PreparedStatement stmt=null;
        Paciente p=null;
        ArrayList<Paciente> listaDePacientes=null;
        
        try{
            String sql="select * from paciente where nome like '%"+nome+"%' order by nome";
            conn=new Conexao().getConnection();
            stmt=conn.prepareStatement(sql);
            rs=stmt.executeQuery();
            if(rs!=null){
                listaDePacientes=new ArrayList<>();
                while(rs.next()){
                    p=new Paciente();
                    p.setIdpaciente(rs.getString("idpaciente"));
                    p.setNome(rs.getString("nome"));
                    p.setComentario(rs.getString("comentario"));
                    p.setCurso(rs.getString("curso"));
                    p.setDn(rs.getString("dn"));
                    p.setEscolaridade(rs.getString("escolaridade"));
                    p.setEstado_civil(rs.getString("estado_civil"));
                    p.setFilhos(rs.getString("filhos"));
                    p.setLateralidade(rs.getString("lateralidade"));
                    p.setLn(rs.getString("ln"));
                    p.setProfissao(rs.getString("profissao"));
                    p.setSexo(rs.getString("sexo"));
                    listaDePacientes.add(p);}}
                }catch(SQLException e) {e.printStackTrace();
                        throw new ExceptionDAO("Erro ao listar paciente: "+e);
                }finally{try{if(rs!=null){rs.close();}
                        }catch(SQLException e){e.printStackTrace();}
                        try{if(stmt!=null){stmt.close();}
                        }catch(SQLException e){e.printStackTrace();
                        }try{if(conn!=null){conn.close();}
                        }catch(Exception e){
                            e.printStackTrace();}
            }return listaDePacientes;
    }
}
