package io.github.soumyajitsamanta.tensor4j;

public abstract class AbstractTensor<T> implements Tensor<T>{

    @SuppressWarnings("unchecked")
    @Override
    public Tensor<T> add(Tensor<T> input) {
        return getComputeEngine().add(this, input);
    }

}
