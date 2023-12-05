package assignment_1;

public interface DanceController {
    enum direction {FORWARD, LEFT, RIGHT, BACK, MIDDLE};
    void Step(direction dir);
}
