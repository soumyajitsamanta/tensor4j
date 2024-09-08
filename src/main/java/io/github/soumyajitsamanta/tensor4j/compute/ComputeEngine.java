package io.github.soumyajitsamanta.tensor4j.compute;

import io.github.soumyajitsamanta.tensor4j.Tensor;

public interface ComputeEngine {

    <T> Tensor add(Tensor<T> first, Tensor<T> second);
}
