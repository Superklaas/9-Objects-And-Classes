package be.vdab.Ex96Stopwatch;

import java.util.Date;

public class Stopwatch {

        Date date = new Date();

        private long startTime;
        private long endTime;

        public Stopwatch() {
            startTime = date.getTime();
        }

        public void start() {
            startTime = date.getTime();
        }

        public void stop() {
            endTime = date.getTime();
        }

        public long getElapsedTime() {
            return endTime - startTime;
        }

}

