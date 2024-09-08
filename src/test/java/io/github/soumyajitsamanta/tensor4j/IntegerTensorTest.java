package io.github.soumyajitsamanta.tensor4j;

import org.junit.jupiter.api.Test;

import io.github.soumyajitsamanta.tensor4j.compute.ComputeEngine;
import io.github.soumyajitsamanta.tensor4j.compute.CpuComputeEngine;

public class IntegerTensorTest {

    @Test
    void testName() throws Exception {
        ComputeEngine engine = new CpuComputeEngine();
        Tensor<int[]> tensor =
                new IntegerTensor(engine, new int[] { 1, 2, 3, 4 });
        Tensor<int[]> add =
                tensor.add(new IntegerTensor(engine, new int[] { 1, 1, 1, 1 }));
        int[] data = add.getData();
        for (int i : data) {
            System.err.println(i);
        }
    }

}
