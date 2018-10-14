package com.yy.atmosphere.atmospheretest;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/**
 * 轨道绘制类
 */
public class Orbit {
//    public static int COLOR_GRAY = Color.argb(255, 196, 194, 194);
//    public static int COLOR_GREEN = Color.argb(255, 12, 173, 1);
//    public static int COLOR_BLUE = Color.argb(255, 1, 100, 181);
//    public static int COLOR_PURPLE = Color.argb(255, 100, 69, 243);
//    public static int COLOR_YELLOW = Color.argb(255, 239, 183, 6);
//    public static int COLOR_RED = Color.argb(255, 255, 0, 0);
//    public static int COLOR_ORANGE = Color.argb(255, 255, 148, 0);

    public static void drawOrbitGray(Canvas canvas, RectF frame) {
        Orbit.drawOrbit(canvas, frame, Color.argb(255, 196, 194, 194));
    }

    public static void drawOrbitBlue(Canvas canvas, RectF frame) {
        Orbit.drawOrbit(canvas, frame, Color.argb(255, 1, 100, 181));
    }

    public static void drawOrbitGreen(Canvas canvas, RectF frame) {
        Orbit.drawOrbit(canvas, frame, Color.argb(255, 12, 173, 1));
    }

    public static void drawOrbitOrange(Canvas canvas, RectF frame) {
        Orbit.drawOrbit(canvas, frame, Color.argb(255, 255, 148, 0));
    }

    public static void drawOrbitPurple(Canvas canvas, RectF frame) {
        Orbit.drawOrbit(canvas, frame, Color.argb(255, 100, 69, 243));
    }

    public static void drawOrbitRed(Canvas canvas, RectF frame) {
        Orbit.drawOrbit(canvas, frame, Color.argb(255, 255, 0, 0));
    }

    public static void drawOrbitYellow(Canvas canvas, RectF frame) {
        Orbit.drawOrbit(canvas, frame, Color.argb(255, 239, 183, 6));
    }

    // Orbits
    public static Bitmap imageOfOrbitGray(PointF imageSize) {
        Bitmap imageOfOrbitGray = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfOrbitGray);
        Orbit.drawOrbitGray(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfOrbitGray;
    }

    public static Bitmap imageOfOrbitBlue(PointF imageSize) {
        Bitmap imageOfOrbitBlue = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfOrbitBlue);
        Orbit.drawOrbitBlue(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfOrbitBlue;
    }

    public static Bitmap imageOfOrbitGreen(PointF imageSize) {
        Bitmap imageOfOrbitGreen = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfOrbitGreen);
        Orbit.drawOrbitGreen(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfOrbitGreen;
    }

    public static Bitmap imageOfOrbitOrange(PointF imageSize) {
        Bitmap imageOfOrbitOrange = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfOrbitOrange);
        Orbit.drawOrbitOrange(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfOrbitOrange;
    }

    public static Bitmap imageOfOrbitPurple(PointF imageSize) {
        Bitmap imageOfOrbitPurple = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfOrbitPurple);
        Orbit.drawOrbitPurple(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfOrbitPurple;
    }

    public static Bitmap imageOfOrbitRed(PointF imageSize) {
        Bitmap imageOfOrbitRed = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfOrbitRed);
        Orbit.drawOrbitRed(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfOrbitRed;
    }

    public static Bitmap imageOfOrbitYellow(PointF imageSize) {
        Bitmap imageOfOrbitYellow = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfOrbitYellow);
        Orbit.drawOrbitYellow(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfOrbitYellow;
    }

    // 缓存Orbits的画笔与轨迹
    private static class CacheForOrbit {
        private static Paint paint = new Paint();
        private static RectF oval1Rect = new RectF();
        private static Path oval1Path = new Path();
        private static RectF oval2Rect = new RectF();
        private static Path oval2Path = new Path();
    }

    /**
     * @param canvas 绘制轨道的画布
     * @param frame  绘制轨道的尺寸
     * @param color  轨道的颜色
     */
    private static void drawOrbit(Canvas canvas, RectF frame, int color) {
        // General Declarations
        Paint paint = CacheForOrbit.paint;

        // Oval
        RectF ovalRect = CacheForOrbit.oval1Rect;
        ovalRect.set(frame.left + (float) Math.floor(frame.width() * 0.00977f) + 0.5f,
                frame.top + (float) Math.floor(frame.height() * 0.00586f) + 0.5f,
                frame.left + (float) Math.floor(frame.width() * 0.99414f) + 0.5f,
                frame.top + (float) Math.floor(frame.height() * 0.99023f) + 0.5f);
        Path ovalPath = CacheForOrbit.oval1Path;
        ovalPath.reset();
        ovalPath.addOval(ovalRect, Path.Direction.CW);

        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        paint.setStrokeWidth(1f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeMiter(10f);
        canvas.save();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(color);
        canvas.drawPath(ovalPath, paint);
        canvas.restore();

        // Oval 3
        RectF oval3Rect = CacheForOrbit.oval2Rect;
        oval3Rect.set(frame.left + (float) Math.floor(frame.width() * 0.08203f + 0.5f),
                frame.top + (float) Math.floor(frame.height() * 0.08203f + 0.5f),
                frame.left + (float) Math.floor(frame.width() * 0.91797f + 0.5f),
                frame.top + (float) Math.floor(frame.height() * 0.91797f + 0.5f));
        Path oval3Path = CacheForOrbit.oval2Path;
        oval3Path.reset();
        oval3Path.addOval(oval3Rect, Path.Direction.CW);

        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        paint.setStrokeWidth(0.5f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeMiter(10f);
        canvas.save();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(color);
        canvas.drawPath(oval3Path, paint);
        canvas.restore();
    }


}
