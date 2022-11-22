package ExceptionsAndLogging.TryCatch_4_2;

public interface RobotConnection extends AutoCloseable {
    void moveRobotTo(int x, int y);
    @Override
    void close();
}
