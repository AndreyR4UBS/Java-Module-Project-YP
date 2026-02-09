class Race {
    private Car currentLeader= null;
    private int currentLeaderDistance= 0;
    public void updateLeader(Car car) {
        int newCarDistance = 24 * car.getSpeed();

        if (newCarDistance > currentLeaderDistance) {
            currentLeader= car;
            currentLeaderDistance= newCarDistance;
        }
    }
    public Car getCurrentLeader() {
        return currentLeader;
    }
}