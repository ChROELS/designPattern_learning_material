package com.example.adapterDesignMe;

public class RulerAdaptor implements InchMeasurable,CentimeterMeasurable {
    RulerCentimeterAdaptee ruler;
    RulerInch rulerUS;

    public RulerAdaptor(RulerCentimeterAdaptee ruler) {
        this.ruler = ruler;
    }
    public RulerAdaptor(RulerInch ruler) {
        this.rulerUS = ruler;
    }

    @Override
    public void getInchLength() {
        double value = ruler.getValue()*2.54;
        ruler.getInCentimeter(value);
    }

    @Override
    public void getInCentimeter() {
        double value = rulerUS.getValue()/2.54;
        rulerUS.getInchLength(value);
    }

    @Override
    public double getValue() {
        return 0;
    }
}
