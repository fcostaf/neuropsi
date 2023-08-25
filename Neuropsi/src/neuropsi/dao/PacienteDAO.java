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
}
