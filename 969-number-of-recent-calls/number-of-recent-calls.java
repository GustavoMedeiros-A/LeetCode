class RecentCounter {

    private final Queue<Integer> queue;

    public RecentCounter() {
        this.queue = new LinkedList<>();
    };

    public int ping(final int t) {
        queue.add(t);
        while(!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */