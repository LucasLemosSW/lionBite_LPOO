package DAO;

import model.Ativo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AtivoDAO extends BaseDAO {

    public static List<Ativo> selectAtivo() {
        final String sql = "SELECT * FROM ativo";
        try // try-witch-resource
                (
                        Connection conn = getConnection();
                        PreparedStatement pstmt = conn.prepareStatement(sql);
                        ResultSet resp = pstmt.executeQuery();

                ) {
            List<Ativo> ativos = new ArrayList<>();
            while (resp.next()) {
                Ativo ativo = getAtivo(resp);
                ativos.add(ativo);
            }
//            System.out.println(ativos);
            return ativos;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Ativo getAtivo(ResultSet resp) throws SQLException {
        Ativo ativo = new Ativo();
        ativo.setTicker(resp.getString("ticker"));
        ativo.setQuantidadeEmCarteira(resp.getInt("qauntidadeEmCarteira"));
        ativo.setPrecoMedio(resp.getDouble("precoMedio"));
        ativo.setDataEntradaNaCarteira(resp.getDate("mesEntradaNaCarteira"));
        return ativo;
    }


}
