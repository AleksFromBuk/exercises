package ExceptionsAndLogging.TryCatch_4_2;

public class Main {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) throws RobotConnectionException {
        int i = 0;
        for (; i < 3; i++) {
            try (RobotConnection obj = robotConnectionManager.getConnection()) {
                try {
                    obj.moveRobotTo(toX, toY);
                    i = 3;
                }
                catch (RobotConnectionException e) {
                    if(i >= 3) {
                        break;
                    }
                    else if (i == 2) {
                        throw new RobotConnectionException("Error");
                    }
                }
                catch (Throwable t) {
                    throw t;
                }
            }
            catch (RobotConnectionException e) {
                if (e.getStackTrace()[0].getMethodName().equals("close")) {
                    break;
                } else if(i == 2) {
                   throw e;
               }
            }
        }
    }
}
