package conexao.serra.powermock;

import job.CloseApplicationJob;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.testng.IObjectFactory;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;
import util.CloseAppUtil;

@PrepareForTest(CloseAppUtil.class)
public class CloseAppTest {

    @ObjectFactory
    public IObjectFactory getObjectFactory() {
        return new org.powermock.modules.testng.PowerMockObjectFactory();
    }

    /**Realizar teste static**/












    /*@Test
    public void Deveria_Finalizar_Aplicacao() throws Exception {
        PowerMockito.mockStatic(CloseAppUtil.class);
        CloseApplicationJob job = new CloseApplicationJob();
        job.start();

        PowerMockito.verifyPrivate(CloseAppUtil.class, Mockito.times(1)).invoke("closeApplication");
    }*/

}
