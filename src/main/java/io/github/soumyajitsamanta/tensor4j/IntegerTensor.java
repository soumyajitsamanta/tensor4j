package io.github.soumyajitsamanta.tensor4j;

import io.github.soumyajitsamanta.tensor4j.compute.ComputeEngine;

public class IntegerTensor extends AbstractTensor<int[]> {
    private static final Object DATA_TYPE=Integer.TYPE;
    private ComputeEngine computeEngine;
    private final int[] data;
    private final int[] shape;

    public IntegerTensor(ComputeEngine computeEngine, int[] data) {
        this.setComputeEngine(computeEngine);
        this.data = data;
        this.shape = new int[] { data.length };
    }

    /**
     * @return the shape
     */
    @Override
    public int[] getShape() {
        return shape;
    }

    /**
     * @return the data
     */
    @Override
    public int[] getData() {
        return data;
    }

    /**
     * @return the computeEngine
     */
    @Override
    public ComputeEngine getComputeEngine() {
        return computeEngine;
    }

    /**
     * @param computeEngine the computeEngine to set
     */
    @Override
    public void setComputeEngine(ComputeEngine computeEngine) {
        this.computeEngine = computeEngine;
    }

    /**
     * @return the dataType
     */
    @Override
    public Object getDataType() {
        return DATA_TYPE;
    }
}
