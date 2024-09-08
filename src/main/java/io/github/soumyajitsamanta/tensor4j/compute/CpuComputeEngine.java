package io.github.soumyajitsamanta.tensor4j.compute;

import java.util.Arrays;

import io.github.soumyajitsamanta.tensor4j.IntegerTensor;
import io.github.soumyajitsamanta.tensor4j.Tensor;

public class CpuComputeEngine implements ComputeEngine {

    public IntegerTensor add(IntegerTensor first, IntegerTensor second) {
        return second;
    }
    @Override
    public <T> Tensor<T> add(Tensor<T> first, Tensor<T> second) {
        int compare = Arrays.compare(first.getShape(), second.getShape());
        if (compare != 0) {
            throw new RuntimeException("this.shape="
                    + first.getShape()
                    + "arg.shape="
                    + second.getShape()
                    + " does not match, cannot add");
        }
            if(first.getDataType().equals(Integer.TYPE)) {
                int[] firstData = ((IntegerTensor) first).getData();
                int[] secondData = ((IntegerTensor) second).getData();
                int[] data = new int[firstData.length];
                for(int i=0;i<firstData.length;i++) {
                    data[i] = firstData[i]+secondData[i];
                }
                return (Tensor<T>) new IntegerTensor(this, data);
            } else {
                throw new UnsupportedOperationException("Add on tensor of tensor not implemented");
            }
    }

}
