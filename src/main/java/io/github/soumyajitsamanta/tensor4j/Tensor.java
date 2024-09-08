package io.github.soumyajitsamanta.tensor4j;

import io.github.soumyajitsamanta.tensor4j.compute.ComputeEngine;

public interface Tensor<T> {
    int[] getShape();

    Tensor<T> add(Tensor<T> Input);

    /**
     * @return the data
     */
    T getData();

    ComputeEngine getComputeEngine();

    /**
     * @param computeEngine the computeEngine to set
     */
    void setComputeEngine(ComputeEngine computeEngine);

    /**
     * @return the dataType
     */
    Object getDataType();
}
