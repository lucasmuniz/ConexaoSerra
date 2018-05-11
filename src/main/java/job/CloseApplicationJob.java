package job;

import util.CloseAppUtil;

public class CloseApplicationJob extends Thread {

    @Override
    public void run() {
        CloseAppUtil.closeApplication();
    }

}
