package com.ax9k.algo.features.set;

class CloseTest implements SetFeatureSpecification {
    @Override
    public SetFeatureTestCase[] testCases() {
        return new SetFeatureTestCase[] {
                testCase(new double[] { 1, 2, 3, 4, }, 4),
                testCase(new double[] { 4, 3, 2, 1 }, 1),
                testCase(new double[] { 0, 0, 0, 0 }, 0),
                testCase(new double[] {}, 0),
                testCase(new double[] { 1 }, 1),
                };
    }

    @Override
    public SetFeature setFeature() {
        return new Close();
    }
}