package com.yy.atmosphere.atmospheretest;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/**
 * 小行星绘制类
 */
public class Moons {
    private static class CacheForSmallPlanets {
        private static Paint paint = new Paint();
        private static RectF small_planets = new RectF();
        private static RectF fill1Rect = new RectF();
        private static Path fill1Path = new Path();
        private static RectF fill2Rect = new RectF();
        private static Path fill2Path = new Path();
        private static RectF fill3Rect = new RectF();
        private static Path fill3Path = new Path();
        private static RectF fill4Rect = new RectF();
        private static Path fill14Path = new Path();
        private static RectF fill5Rect = new RectF();
        private static Path fill5Path = new Path();
        private static RectF fill6Rect = new RectF();
        private static Path fill6Path = new Path();
    }

    private static void drawSmallPlanets(Canvas canvas, RectF frame, int color) {
        // General Declarations
        Paint paint = CacheForSmallPlanets.paint;

        // small_planets
        RectF small_planets = CacheForSmallPlanets.small_planets;
        small_planets.set(frame.left + (float) Math.floor(frame.width() * 0.15664f + 0.4f) + 0.1f,
                frame.top + (float) Math.floor(frame.height() * 0.19145f + 0.49f) + 0.01f,
                frame.left + (float) Math.floor(frame.width() * 0.98066f + 0.45f) + 0.05f,
                frame.top + (float) Math.floor(frame.height() * 0.98714f - 0.21f) + 0.71f);

        // Fill-7
        RectF fill7Rect = CacheForSmallPlanets.fill1Rect;
        fill7Rect.set(small_planets.left + (float) Math.floor(small_planets.width() * 0.64589f + 0.25f) + 0.25f,
                small_planets.top + (float) Math.floor(small_planets.height() * 0.79775f - 0f) + 0.5f,
                small_planets.left + (float) Math.floor(small_planets.width() * 0.6876f + 0.45f) + 0.05f,
                small_planets.top + (float) Math.floor(small_planets.height() * 0.84095f + 0.2f) + 0.3f);
        Path fill7Path = CacheForSmallPlanets.fill1Path;
        fill7Path.reset();
        fill7Path.addOval(fill7Rect, Path.Direction.CW);

        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        canvas.drawPath(fill7Path, paint);

        // Fill-9
        RectF fill9Rect = CacheForSmallPlanets.fill2Rect;
        fill9Rect.set(small_planets.left,
                small_planets.top + (float) Math.floor(small_planets.height() * 0.53879f - 0.25f) + 0.75f,
                small_planets.left + (float) Math.floor(small_planets.width() * 0.04172f - 0.3f) + 0.8f,
                small_planets.top + (float) Math.floor(small_planets.height() * 0.58199f - 0.05f) + 0.55f);
        Path fill9Path = CacheForSmallPlanets.fill2Path;
        fill9Path.reset();
        fill9Path.addOval(fill9Rect, Path.Direction.CW);

        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        canvas.drawPath(fill9Path, paint);

        // Fill-11
        RectF fill11Rect = CacheForSmallPlanets.fill3Rect;
        fill11Rect.set(small_planets.left + (float) Math.floor(small_planets.width() * 0.97914f - 0.05f) + 0.55f,
                small_planets.top + (float) Math.floor(small_planets.height() * 0.3878f - 0.49f) + 0.99f,
                small_planets.left + (float) Math.floor(small_planets.width() - 0.45f) + 0.95f,
                small_planets.top + (float) Math.floor(small_planets.height() * 0.40941f + 0.11f) + 0.39f);
        Path fill11Path = CacheForSmallPlanets.fill3Path;
        fill11Path.reset();
        fill11Path.addOval(fill11Rect, Path.Direction.CW);

        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        canvas.drawPath(fill11Path, paint);

        // Fill-13
        RectF fill13Rect = CacheForSmallPlanets.fill4Rect;
        fill13Rect.set(small_planets.left + (float) Math.floor(small_planets.width() * 0.2292f + 0.15f) + 0.35f,
                small_planets.top + (float) Math.floor(small_planets.height() * 0.88413f + 0.41f) + 0.09f,
                small_planets.left + (float) Math.floor(small_planets.width() * 0.25006f - 0.25f) + 0.75f,
                small_planets.top + (float) Math.floor(small_planets.height() * 0.90573f + 0.01f) + 0.49f);
        Path fill13Path = CacheForSmallPlanets.fill14Path;
        fill13Path.reset();
        fill13Path.addOval(fill13Rect, Path.Direction.CW);

        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        canvas.drawPath(fill13Path, paint);

        // Fill-23
        RectF fill23Rect = CacheForSmallPlanets.fill5Rect;
        fill23Rect.set(small_planets.left + (float) Math.floor(small_planets.width() * 0.19649f + 0.05f) + 0.45f,
                small_planets.top + (float) Math.floor(small_planets.height() * 0.9568f - 0.4f) + 0.9f,
                small_planets.left + (float) Math.floor(small_planets.width() * 0.23821f + 0.25f) + 0.25f,
                small_planets.top + (float) Math.floor(small_planets.height() * 1f - 0.2f) + 0.7f);
        Path fill23Path = CacheForSmallPlanets.fill5Path;
        fill23Path.reset();
        fill23Path.addOval(fill23Rect, Path.Direction.CW);

        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        canvas.drawPath(fill23Path, paint);

        // Fill-25
        RectF fill25Rect = CacheForSmallPlanets.fill6Rect;
        fill25Rect.set(small_planets.left + (float) Math.floor(small_planets.width() * 0.74947f + 0.4f) + 0.1f,
                small_planets.top,
                small_planets.left + (float) Math.floor(small_planets.width() * 0.79118f - 0.4f) + 0.9f,
                small_planets.top + (float) Math.floor(small_planets.height() * 0.0432f - 0.3f) + 0.8f);
        Path fill25Path = CacheForSmallPlanets.fill6Path;
        fill25Path.reset();
        fill25Path.addOval(fill25Rect, Path.Direction.CW);

        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        canvas.drawPath(fill25Path, paint);
    }

    public static void drawSmallPlanetsGray(Canvas canvas, RectF frame) {
        drawSmallPlanets(canvas, frame, Color.argb(255, 196, 194, 194));
    }

    public static void drawSmallPlanetsBlue(Canvas canvas, RectF frame) {
        drawSmallPlanets(canvas, frame, Color.argb(255, 1, 100, 181));
    }

    public static void drawSmallPlanetsGreen(Canvas canvas, RectF frame) {
        drawSmallPlanets(canvas, frame, Color.argb(255, 12, 173, 1));
    }

    public static void drawSmallPlanetsOrange(Canvas canvas, RectF frame) {
        drawSmallPlanets(canvas, frame, Color.argb(255, 255, 148, 0));
    }

    public static void drawSmallPlanetsPurple(Canvas canvas, RectF frame) {
        drawSmallPlanets(canvas, frame, Color.argb(255, 100, 69, 243));
    }

    public static void drawSmallPlanetsRed(Canvas canvas, RectF frame) {
        drawSmallPlanets(canvas, frame, Color.argb(255, 255, 0, 0));
    }

    public static void drawSmallPlanetsYellow(Canvas canvas, RectF frame) {
        drawSmallPlanets(canvas, frame, Color.argb(255, 239, 183, 6));
    }

    public static Bitmap imageOfSmallPlanetsGray(PointF imageSize) {
        Bitmap imageOfSmallPlanetsGray = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config
                .ARGB_8888);
        Canvas canvas = new Canvas(imageOfSmallPlanetsGray);
        Moons.drawSmallPlanetsGray(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfSmallPlanetsGray;
    }

    public static Bitmap imageOfSmallPlanetsBlue(PointF imageSize) {
        Bitmap imageOfSmallPlanetsBlue = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config
                .ARGB_8888);
        Canvas canvas = new Canvas(imageOfSmallPlanetsBlue);
        Moons.drawSmallPlanetsBlue(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfSmallPlanetsBlue;
    }

    public static Bitmap imageOfSmallPlanetsGreen(PointF imageSize) {
        Bitmap imageOfSmallPlanetsGreen = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config
                .ARGB_8888);
        Canvas canvas = new Canvas(imageOfSmallPlanetsGreen);
        Moons.drawSmallPlanetsGreen(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfSmallPlanetsGreen;
    }

    public static Bitmap imageOfSmallPlanetsOrange(PointF imageSize) {
        Bitmap imageOfSmallPlanetsOrange = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config
                .ARGB_8888);
        Canvas canvas = new Canvas(imageOfSmallPlanetsOrange);
        Moons.drawSmallPlanetsOrange(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfSmallPlanetsOrange;
    }

    public static Bitmap imageOfSmallPlanetsPurple(PointF imageSize) {
        Bitmap imageOfSmallPlanetsPurple = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config
                .ARGB_8888);
        Canvas canvas = new Canvas(imageOfSmallPlanetsPurple);
        Moons.drawSmallPlanetsPurple(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfSmallPlanetsPurple;
    }

    public static Bitmap imageOfSmallPlanetsRed(PointF imageSize) {
        Bitmap imageOfSmallPlanetsRed = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config
                .ARGB_8888);
        Canvas canvas = new Canvas(imageOfSmallPlanetsRed);
        Moons.drawSmallPlanetsRed(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfSmallPlanetsRed;
    }

    public static Bitmap imageOfSmallPlanetsYellow(PointF imageSize) {
        Bitmap imageOfSmallPlanetsYellow = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config
                .ARGB_8888);
        Canvas canvas = new Canvas(imageOfSmallPlanetsYellow);
        Moons.drawSmallPlanetsYellow(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfSmallPlanetsYellow;
    }
}
