package assignment_1;

public class GuitarToDanceAdapter implements DanceController {
    private GuitarController guitarController;

    public GuitarToDanceAdapter(GuitarController guitarController) {
        this.guitarController = guitarController;
    }

    
    private void simulateStep(direction dir) {
        
        System.out.println("Simulated step in direction: " + dir);
    }

    
    public void pressGuitarButton(GuitarController.colors button) {
        
        switch (button) {
            case GREEN:
                simulateStep(direction.FORWARD);
                break;
            case RED:
                simulateStep(direction.LEFT);
                break;
            case YELLOW:
                simulateStep(direction.BACK);
                break;
            case BLUE:
                simulateStep(direction.RIGHT);
                break;
            case ORANGE:
                simulateStep(direction.MIDDLE);
                break;
            default:
                throw new IllegalArgumentException("Unknown guitar button: " + button);
        }
    }

    @Override
    public void Step(direction dir) {
        
        throw new UnsupportedOperationException("Unimplemented method 'Step'");
    }
}
