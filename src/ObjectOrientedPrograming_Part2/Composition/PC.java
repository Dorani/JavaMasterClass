package ObjectOrientedPrograming_Part2.Composition;

public class PC {
    private Case casing;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case casing, Monitor monitor, MotherBoard motherBoard) {
        this.casing = casing;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp() {
        casing.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        //fancy graphics
      monitor.drawPixelAt(1200,50,"yellow");
    }
}
