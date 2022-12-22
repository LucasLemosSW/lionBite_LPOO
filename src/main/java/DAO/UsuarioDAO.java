package DAO;

import model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO extends BaseDAO {

    public static List<Usuario> selectUser() {
        final String sql = "SELECT * FROM usuario";
        try // try-witch-resource
                (
                    Connection conn = getConnection();
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    ResultSet rs = pstmt.executeQuery();

                ) {
            List<Usuario> usuario = new ArrayList<>();
            while (rs.next()) {
                Usuario c = new Usuario();
                c.setCodUsuario(rs.getInt("codUsuario"));
                c.setNome(rs.getString("nome"));
                c.setSobrenome(rs.getString("sobrenome"));
                c.setEmail(rs.getString("email"));
                c.setPassword(rs.getString("password"));
                usuario.add(c);
            }
//            System.out.println(usuario);
            return usuario;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


}
