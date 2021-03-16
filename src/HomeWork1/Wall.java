package HomeWork1;

public class Wall implements Check {
    private int maxHeight;

    @Override
    public void doIT(Runner runner) {
        if (runner.isSuccess()) {
            runner.jump();
            if (runner.getMaxJump() >= maxHeight) {
                System.out.println(runner.getName() + " справился(лась) со стеной высотой в " + maxHeight + " метров.");
            } else {
                runner.setSuccess(!runner.isSuccess());
                System.out.println(runner.getName() + " не справился(лась) с перпятсвием и выбывает.");
            }
        }
    }


    public Wall(int maxHeight) {
        this.maxHeight = maxHeight;
    }
}
