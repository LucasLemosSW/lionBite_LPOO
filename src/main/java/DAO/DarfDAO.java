package DAO;

import model.Darf;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DarfDAO extends BaseDAO {

    public static List<Darf> selectDarf() {
        final String sql = "SELECT * FROM darf";
        try // try-witch-resource
                (
                        Connection conn = getConnection();
                        PreparedStatement pstmt = conn.prepareStatement(sql);
                        ResultSet resp = pstmt.executeQuery();

                ) {
            List<Darf> darfs = new ArrayList<>();
            while (resp.next()) {
                Darf darf = getDarf(resp);
                darfs.add(darf);
            }
//            System.out.println(darfs);
            return darfs;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Darf getDarf(ResultSet resp) throws SQLException {
        Darf darf = new Darf();
        darf.setCodDarf(resp.getInt("codDarf"));
        darf.setValor(resp.getInt("valor"));
        darf.setCodigoDoImposto(resp.getInt("codigoDoImposto"));
        return darf;
    }

}
