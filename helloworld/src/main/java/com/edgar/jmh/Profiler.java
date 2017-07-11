package com.edgar.jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.profile.GCProfiler;
import org.openjdk.jmh.profile.StackProfiler;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class Profiler {

//http://java-performance.info/introduction-jmh-profilers/
    @Benchmark
    public void wellHelloThere() {

        // this method was intentionally left blank.

    }

    public static void main(String[] args) throws RunnerException {

        Options opt = new OptionsBuilder()

                .include(Profiler.class.getSimpleName())

                .forks(1)
               .addProfiler(GCProfiler.class)

                .build();


        new Runner(opt).run();

    }


}