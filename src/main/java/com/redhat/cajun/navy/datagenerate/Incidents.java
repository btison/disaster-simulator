package com.redhat.cajun.navy.datagenerate;

import java.awt.geom.Point2D;
import java.util.concurrent.ThreadLocalRandom;

public class Incidents {

    private static java.awt.geom.Point2D.Double points[] = {
            new java.awt.geom.Point2D.Double(-77.84856,34.18408),
            new java.awt.geom.Point2D.Double(-77.94346,34.24539),
            new java.awt.geom.Point2D.Double(-77.90541,34.23461),
            new java.awt.geom.Point2D.Double(-77.89741,34.15316),
            new java.awt.geom.Point2D.Double(-77.92003,34.05920),
            new java.awt.geom.Point2D.Double(-77.91175,34.11387),
            new java.awt.geom.Point2D.Double(-77.92901,34.19911),
            new java.awt.geom.Point2D.Double(-77.90972,34.22148),
            new java.awt.geom.Point2D.Double(-77.91945,34.11755),
            new java.awt.geom.Point2D.Double(-77.94318,34.16893),
            new java.awt.geom.Point2D.Double(-77.85063,34.23784),
            new java.awt.geom.Point2D.Double(-77.86861,34.23447),
            new java.awt.geom.Point2D.Double(-77.90181,34.24625),
            new java.awt.geom.Point2D.Double(-77.80464,34.24514),
            new java.awt.geom.Point2D.Double(-77.92636,34.18028),
            new java.awt.geom.Point2D.Double(-77.89352,34.25454),
            new java.awt.geom.Point2D.Double(-77.89272,34.10081),
            new java.awt.geom.Point2D.Double(-77.80707,34.24756),
            new java.awt.geom.Point2D.Double(-77.85866,34.23461),
            new java.awt.geom.Point2D.Double(-77.88100,34.20862)
    };

    public static Point2D.Double incident() {
        return points[ThreadLocalRandom.current().nextInt(20)];
    }

}
