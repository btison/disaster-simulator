package com.redhat.cajun.navy.datagenerate;

import java.awt.geom.Point2D;
import java.util.concurrent.ThreadLocalRandom;

public class Responders {

    private static Point2D.Double points[] = {
            new java.awt.geom.Point2D.Double(-77.90999,34.18323),
            new java.awt.geom.Point2D.Double(-77.91899,34.07197),
            new java.awt.geom.Point2D.Double(-77.90288,34.19772),
            new java.awt.geom.Point2D.Double(-77.91165,34.07598),
            new java.awt.geom.Point2D.Double(-77.92710,34.15833),
            new java.awt.geom.Point2D.Double(-77.88717,34.12991),
            new java.awt.geom.Point2D.Double(-77.88614,34.21576),
            new java.awt.geom.Point2D.Double(-77.82657,34.22203),
            new java.awt.geom.Point2D.Double(-77.89179,34.07983),
            new java.awt.geom.Point2D.Double(-77.83023,34.21674),
            new java.awt.geom.Point2D.Double(-77.94624,34.25686),
            new java.awt.geom.Point2D.Double(-77.90485,34.08072),
            new java.awt.geom.Point2D.Double(-77.85169,34.22064),
            new java.awt.geom.Point2D.Double(-77.89034,34.14064),
            new java.awt.geom.Point2D.Double(-77.88904,34.05228),
            new java.awt.geom.Point2D.Double(-77.90924,34.21518),
            new java.awt.geom.Point2D.Double(-77.85724,34.20227),
            new java.awt.geom.Point2D.Double(-77.92208,34.07801),
            new java.awt.geom.Point2D.Double(-77.90108,34.20297),
            new java.awt.geom.Point2D.Double(-77.92572,34.11574)
    };

    public static Point2D.Double responder() {
        return points[ThreadLocalRandom.current().nextInt(20)];
    }

}
