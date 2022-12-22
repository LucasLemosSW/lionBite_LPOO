import DAO.UsuarioDAO;
import org.junit.Assert;
import org.junit.Test;


public class TesteUsuarioDAO {

    @Test
    public void getuser(){

        Assert.assertEquals(5,UsuarioDAO.selectUser().size());
    }


}
