package HomeWork1;

public class RunRoad implements Check{
    private int maxRun;

    @Override
    public void doIT(Runner runner) {
        if (runner.isSuccess()) {
            runner.run();
            if (runner.getMaxRun() >= maxRun) {
                System.out.println(runner.getName() + " справился(лась) с дорожкой длиной в " + maxRun + " метров.");
            } else {
                runner.setSuccess(!runner.isSuccess());
                System.out.println(runner.getName() + " не справился(лась) с перпятсвием и выбывает.");
            }
        }
    }

    public RunRoad(int maxRun) {
        this.maxRun = maxRun;
    }
}
