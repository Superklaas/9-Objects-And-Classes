package be.vdab.Ex96Stopwatch;

public class Stopwatch {

        private long startTime;
        private long endTime;

        public Stopwatch() {
            startTime = System.currentTimeMillis();
        }

        public void start() {
            startTime = System.currentTimeMillis();
        }

        public void stop() {
            endTime = System.currentTimeMillis();
        }

        public double getElapsedTime() {
            return endTime - startTime;
        }

}

