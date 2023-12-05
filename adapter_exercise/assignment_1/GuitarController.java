package assignment_1;

public interface GuitarController {
    enum colors {GREEN, RED, YELLOW, BLUE, ORANGE}
    void PressFretButton(colors button);
    void PressPick();
    void PressTremelo();
}

