package HomeWork1;

public class Human implements Runner{
    private String name;
    private int maxJump ;
    private int maxRun;
    private boolean success = true;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public boolean isSuccess() {
        return success;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public String getName() {
        return name;
    }

    public Human(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    public void jump() {
        System.out.println("\n"+ name + " прыгнул");
    }

    public void run() {
        System.out.println("\n" + name + " бежит");
    }
}
