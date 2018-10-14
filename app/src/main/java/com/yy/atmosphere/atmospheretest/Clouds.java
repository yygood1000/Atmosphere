package com.yy.atmosphere.atmospheretest;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/**
 * 云朵绘制类
 */
public class Clouds {

    public static void drawCloudsGray(Canvas canvas, RectF frame) {
        Clouds.drawClouds(canvas, frame, Color.argb(128, 196, 194, 194));
    }

    public static void drawCloudsBlue(Canvas canvas, RectF frame) {
        Clouds.drawClouds(canvas, frame, Color.argb(128, 1, 100, 181));
    }

    public static void drawCloudsGreen(Canvas canvas, RectF frame) {
        Clouds.drawClouds(canvas, frame, Color.argb(128, 12, 173, 1));
    }

    public static void drawCloudsPurple(Canvas canvas, RectF frame) {
        Clouds.drawClouds(canvas, frame, Color.argb(128, 100, 69, 243));
    }

    public static void drawCloudsOrange(Canvas canvas, RectF frame) {
        Clouds.drawClouds(canvas, frame, Color.argb(128, 255, 148, 0));
    }

    public static void drawCloudsRed(Canvas canvas, RectF frame) {
        Clouds.drawClouds(canvas, frame, Color.argb(128, 255, 0, 0));
    }

    public static void drawCloudsYellow(Canvas canvas, RectF frame) {
        Clouds.drawClouds(canvas, frame, Color.argb(128, 239, 183, 6));
    }

    // Clouds
    public static Bitmap imageOfCloudGray(PointF imageSize) {
        Bitmap imageOfCloudGray = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfCloudGray);
        Clouds.drawCloudsGray(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfCloudGray;
    }

    public static Bitmap imageOfCloudBlue(PointF imageSize) {
        Bitmap imageOfCloudBlue = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfCloudBlue);
        Clouds.drawCloudsBlue(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfCloudBlue;
    }

    public static Bitmap imageOfCloudGreen(PointF imageSize) {
        Bitmap imageOfCloudGreen = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfCloudGreen);
        Clouds.drawCloudsGreen(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfCloudGreen;
    }

    public static Bitmap imageOfCloudOrange(PointF imageSize) {
        Bitmap imageOfCloudOrange = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfCloudOrange);
        Clouds.drawCloudsOrange(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfCloudOrange;
    }

    public static Bitmap imageOfCloudPurple(PointF imageSize) {
        Bitmap imageOfCloudPurple = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfCloudPurple);
        Clouds.drawCloudsPurple(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfCloudPurple;
    }

    public static Bitmap imageOfCloudRed(PointF imageSize) {
        Bitmap imageOfCloudRed = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfCloudRed);
        Clouds.drawCloudsRed(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfCloudRed;
    }

    public static Bitmap imageOfCloudYellow(PointF imageSize) {
        Bitmap imageOfCloudYellow = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfCloudYellow);
        Clouds.drawCloudsYellow(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
        return imageOfCloudYellow;
    }


    private static class CacheForClouds {
        private static Paint paint = new Paint();
        private static RectF template = new RectF();
        private static RectF group2 = new RectF();
        private static RectF page1 = new RectF();
        private static RectF fill15Rect = new RectF();
        private static Path fill15Path = new Path();
        private static RectF fill17Rect = new RectF();
        private static Path fill17Path = new Path();
        private static RectF fill19Rect = new RectF();
        private static Path fill19Path = new Path();
        private static RectF fill21Rect = new RectF();
        private static Path fill21Path = new Path();
        private static RectF fill27Rect = new RectF();
        private static Path fill27Path = new Path();
        private static RectF fill29Rect = new RectF();
        private static Path fill29Path = new Path();
        private static RectF fill31Rect = new RectF();
        private static Path fill31Path = new Path();
    }


    public static void drawClouds(Canvas canvas, RectF frame, int color) {
        // General Declarations
        Paint paint = CacheForClouds.paint;

        // template
        {
            RectF template = CacheForClouds.template;
            template.set(frame.left + (float) Math.floor(frame.width() * 0.12232f + 0.19f) + 0.31f,
                    frame.top + (float) Math.floor(frame.height() * 0.10515f - 0.42f) + 0.92f,
                    frame.left + (float) Math.floor(frame.width() * 0.79484f + 0.02f) + 0.48f,
                    frame.top + (float) Math.floor(frame.height() * 0.85661f + 0.21f) + 0.29f);

            // Group 2
            {
                RectF group2 = CacheForClouds.group2;
                group2.set(template.left,
                        template.top,
                        template.left + (float) Math.floor(template.width() + 0.33f) + 0.17f,
                        template.top + (float) Math.floor(template.height() + 0.13f) + 0.37f);

                // Page-1
                {
                    RectF page1 = CacheForClouds.page1;
                    page1.set(template.left,
                            template.top,
                            template.left + (float) Math.floor(template.width() + 0.33f) + 0.17f,
                            template.top + (float) Math.floor(template.height() + 0.13f) + 0.37f);

                    // Fill-15
                    RectF fill15Rect = CacheForClouds.fill15Rect;
                    fill15Rect.set(template.left,
                            template.top + (float) Math.floor(template.height() * 0.41239f + 0.17f) + 0.33f,
                            template.left + (float) Math.floor(template.width() * 0.06682f - 0f) + 0.5f,
                            template.top + (float) Math.floor(template.height() * 0.61458f + 0.27f) + 0.23f);
                    Path fill15Path = CacheForClouds.fill15Path;
                    fill15Path.reset();
                    fill15Path.moveTo(page1.left + page1.width() * 0.05105f, page1.top + page1.height() * 0.52545f);
                    fill15Path.cubicTo(page1.left + page1.width() * 0.05105f, page1.top + page1.height() * 0.48642f,
                            page1.left + page1.width() * 0.05653f, page1.top + page1.height() * 0.44855f, page1.left +
                                    page1.width() * 0.06682f, page1.top + page1.height() * 0.41239f);
                    fill15Path.cubicTo(page1.left + page1.width() * 0.05041f, page1.top + page1.height() * 0.41625f,
                            page1.left + page1.width() * 0.03829f, page1.top + page1.height() * 0.42959f, page1.left +
                                    page1.width() * 0.03829f, page1.top + page1.height() * 0.44549f);
                    fill15Path.cubicTo(page1.left + page1.width() * 0.03829f, page1.top + page1.height() * 0.45016f,
                            page1.left + page1.width() * 0.03934f, page1.top + page1.height() * 0.45461f, page1.left +
                                    page1.width() * 0.04123f, page1.top + page1.height() * 0.45867f);
                    fill15Path.cubicTo(page1.left + page1.width() * 0.03201f, page1.top + page1.height() * 0.46211f,
                            page1.left + page1.width() * 0.02553f, page1.top + page1.height() * 0.47025f, page1.left +
                                    page1.width() * 0.02553f, page1.top + page1.height() * 0.47976f);
                    fill15Path.cubicTo(page1.left + page1.width() * 0.02553f, page1.top + page1.height() * 0.48173f,
                            page1.left + page1.width() * 0.02584f, page1.top + page1.height() * 0.48364f, page1.left +
                                    page1.width() * 0.02636f, page1.top + page1.height() * 0.48546f);
                    fill15Path.cubicTo(page1.left + page1.width() * 0.01065f, page1.top + page1.height() * 0.49325f,
                            page1.left, page1.top + page1.height() * 0.50823f, page1.left, page1.top + page1.height() *
                                    0.52545f);
                    fill15Path.cubicTo(page1.left, page1.top + page1.height() * 0.54253f, page1.left + page1.width()
                                    * 0.01049f, page1.top + page1.height() * 0.55739f, page1.left + page1.width() *
                                    0.026f,
                            page1.top
                                    + page1.height() * 0.56523f);
                    fill15Path.cubicTo(page1.left + page1.width() * 0.02572f, page1.top + page1.height() * 0.56717f,
                            page1.left + page1.width() * 0.02553f, page1.top + page1.height() * 0.56913f, page1.left +
                                    page1.width() * 0.02553f, page1.top + page1.height() * 0.57114f);
                    fill15Path.cubicTo(page1.left + page1.width() * 0.02553f, page1.top + page1.height() * 0.59144f,
                            page1.left + page1.width() * 0.04033f, page1.top + page1.height() * 0.60862f, page1.left +
                                    page1.width() * 0.06079f, page1.top + page1.height() * 0.61458f);
                    fill15Path.cubicTo(page1.left + page1.width() * 0.05442f, page1.top + page1.height() * 0.58575f,
                            page1.left + page1.width() * 0.05105f, page1.top + page1.height() * 0.55595f, page1.left +
                                    page1.width() * 0.05105f, page1.top + page1.height() * 0.52545f);
                    fill15Path.close();

                    paint.reset();
                    paint.setFlags(Paint.ANTI_ALIAS_FLAG);
                    fill15Path.setFillType(Path.FillType.EVEN_ODD);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(color);
                    canvas.drawPath(fill15Path, paint);

                    // Fill-17
                    RectF fill17Rect = CacheForClouds.fill17Rect;
                    fill17Rect.set(template.left + (float) Math.floor(template.width() * 0.10671f + 0.13f) + 0.37f,
                            template.top + (float) Math.floor(template.height() * 0.75641f - 0.01f) + 0.51f,
                            template.left + (float) Math.floor(template.width() * 0.2363f - 0.18f) + 0.68f,
                            template.top + (float) Math.floor(template.height() * 0.88396f + 0.45f) + 0.05f);
                    Path fill17Path = CacheForClouds.fill17Path;
                    fill17Path.reset();
                    fill17Path.moveTo(page1.left + page1.width() * 0.12458f, page1.top + page1.height() * 0.84115f);
                    fill17Path.cubicTo(page1.left + page1.width() * 0.13751f, page1.top + page1.height() * 0.85549f,
                            page1.left + page1.width() * 0.15813f, page1.top + page1.height() * 0.86095f, page1.left +
                                    page1.width() * 0.17686f, page1.top + page1.height() * 0.8567f);
                    fill17Path.cubicTo(page1.left + page1.width() * 0.17806f, page1.top + page1.height() * 0.86186f,
                            page1.left + page1.width() * 0.18058f, page1.top + page1.height() * 0.86686f, page1.left +
                                    page1.width() * 0.18453f, page1.top + page1.height() * 0.87124f);
                    fill17Path.cubicTo(page1.left + page1.width() * 0.19727f, page1.top + page1.height() * 0.88536f,
                            page1.left + page1.width() * 0.21994f, page1.top + page1.height() * 0.88802f, page1.left +
                                    page1.width() * 0.2363f, page1.top + page1.height() * 0.87773f);
                    fill17Path.cubicTo(page1.left + page1.width() * 0.2104f, page1.top + page1.height() * 0.85854f,
                            page1.left + page1.width() * 0.18624f, page1.top + page1.height() * 0.83677f, page1.left +
                                    page1.width() * 0.16431f, page1.top + page1.height() * 0.81245f);
                    fill17Path.cubicTo(page1.left + page1.width() * 0.1481f, page1.top + page1.height() * 0.79448f,
                            page1.left + page1.width() * 0.13367f, page1.top + page1.height() * 0.77574f, page1.left +
                                    page1.width() * 0.12099f, page1.top + page1.height() * 0.75641f);
                    fill17Path.cubicTo(page1.left + page1.width() * 0.11932f, page1.top + page1.height() * 0.75714f,
                            page1.left + page1.width() * 0.11771f, page1.top + page1.height() * 0.75803f, page1.left +
                                    page1.width() * 0.1162f, page1.top + page1.height() * 0.75912f);
                    fill17Path.cubicTo(page1.left + page1.width() * 0.10523f, page1.top + page1.height() * 0.76705f,
                            page1.left + page1.width() * 0.10352f, page1.top + page1.height() * 0.78143f, page1.left +
                                    page1.width() * 0.11237f, page1.top + page1.height() * 0.79125f);
                    fill17Path.cubicTo(page1.left + page1.width() * 0.11376f, page1.top + page1.height() * 0.79278f,
                            page1.left + page1.width() * 0.11534f, page1.top + page1.height() * 0.79409f, page1.left +
                                    page1.width() * 0.11703f, page1.top + page1.height() * 0.79522f);
                    fill17Path.cubicTo(page1.left + page1.width() * 0.11027f, page1.top + page1.height() * 0.81012f,
                            page1.left + page1.width() * 0.1125f, page1.top + page1.height() * 0.82775f, page1.left +
                                    page1.width() * 0.12458f, page1.top + page1.height() * 0.84115f);
                    fill17Path.close();

                    paint.reset();
                    paint.setFlags(Paint.ANTI_ALIAS_FLAG);
                    fill17Path.setFillType(Path.FillType.EVEN_ODD);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(color);
                    canvas.drawPath(fill17Path, paint);

                    // Fill-19
                    RectF fill19Rect = CacheForClouds.fill19Rect;
                    fill19Rect.set(template.left + (float) Math.floor(template.width() * 0.41356f + 0.3f) + 0.2f,
                            template.top,
                            template.left + (float) Math.floor(template.width() * 0.72f - 0.46f) + 0.96f,
                            template.top + (float) Math.floor(template.height() * 0.08948f + 0.29f) + 0.21f);
                    Path fill19Path = CacheForClouds.fill19Path;
                    fill19Path.reset();
                    fill19Path.moveTo(page1.left + page1.width() * 0.56684f, page1.top + page1.height() * 0.06854f);
                    fill19Path.cubicTo(page1.left + page1.width() * 0.61838f, page1.top + page1.height() * 0.06901f,
                            page1.left + page1.width() * 0.66804f, page1.top + page1.height() * 0.07633f, page1.left +
                                    page1.width() * 0.7148f, page1.top + page1.height() * 0.08948f);
                    fill19Path.cubicTo(page1.left + page1.width() * 0.71802f, page1.top + page1.height() * 0.08356f,
                            page1.left + page1.width() * 0.71992f, page1.top + page1.height() * 0.07696f, page1.left +
                                    page1.width() * 0.72f, page1.top + page1.height() * 0.06995f);
                    fill19Path.cubicTo(page1.left + page1.width() * 0.72029f, page1.top + page1.height() * 0.04472f,
                            page1.left + page1.width() * 0.69767f, page1.top + page1.height() * 0.02405f, page1.left +
                                    page1.width() * 0.66947f, page1.top + page1.height() * 0.02379f);
                    fill19Path.cubicTo(page1.left + page1.width() * 0.65587f, page1.top + page1.height() * 0.02366f,
                            page1.left + page1.width() * 0.64349f, page1.top + page1.height() * 0.02834f, page1.left +
                                    page1.width() * 0.63425f, page1.top + page1.height() * 0.03601f);
                    fill19Path.cubicTo(page1.left + page1.width() * 0.62144f, page1.top + page1.height() * 0.01479f,
                            page1.left + page1.width() * 0.59649f, page1.top + page1.height() * 0.00027f, page1.left +
                                    page1.width() * 0.56763f, page1.top + page1.height() * 0f);
                    fill19Path.cubicTo(page1.left + page1.width() * 0.53134f, page1.top + page1.height() * -0.00033f,
                            page1.left + page1.width() * 0.5007f, page1.top + page1.height() * 0.022f, page1.left +
                                    page1.width() * 0.49246f, page1.top + page1.height() * 0.05226f);
                    fill19Path.cubicTo(page1.left + page1.width() * 0.48456f, page1.top + page1.height() * 0.04762f,
                            page1.left + page1.width() * 0.47516f, page1.top + page1.height() * 0.04485f, page1.left +
                                    page1.width() * 0.465f, page1.top + page1.height() * 0.04475f);
                    fill19Path.cubicTo(page1.left + page1.width() * 0.43754f, page1.top + page1.height() * 0.0445f,
                            page1.left + page1.width() * 0.41499f, page1.top + page1.height() * 0.06371f, page1.left +
                                    page1.width() * 0.41356f, page1.top + page1.height() * 0.08803f);
                    fill19Path.cubicTo(page1.left + page1.width() * 0.46203f, page1.top + page1.height() * 0.0749f,
                            page1.left + page1.width() * 0.51352f, page1.top + page1.height() * 0.06805f, page1.left +
                                    page1.width() * 0.56684f, page1.top + page1.height() * 0.06854f);
                    fill19Path.close();

                    paint.reset();
                    paint.setFlags(Paint.ANTI_ALIAS_FLAG);
                    fill19Path.setFillType(Path.FillType.EVEN_ODD);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(color);
                    canvas.drawPath(fill19Path, paint);

                    // Fill-21
                    RectF fill21Rect = CacheForClouds.fill21Rect;
                    fill21Rect.set(template.left + (float) Math.floor(template.width() * 0.83628f - 0.48f) + 0.98f,
                            template.top + (float) Math.floor(template.height() * 0.13482f - 0.44f) + 0.94f,
                            template.left + (float) Math.floor(template.width() * 1f + 0.33f) + 0.17f,
                            template.top + (float) Math.floor(template.height() * 0.28406f - 0.15f) + 0.65f);
                    Path fill21Path = CacheForClouds.fill21Path;
                    fill21Path.reset();
                    fill21Path.moveTo(page1.left + page1.width() * 0.91491f, page1.top + page1.height() * 0.19563f);
                    fill21Path.cubicTo(page1.left + page1.width() * 0.94639f, page1.top + page1.height() * 0.22264f,
                            page1.left + page1.width() * 0.97315f, page1.top + page1.height() * 0.25239f, page1.left +
                                    page1.width() * 0.99519f, page1.top + page1.height() * 0.28406f);
                    fill21Path.cubicTo(page1.left + page1.width() * 1.00343f, page1.top + page1.height() * 0.27078f,
                            page1.left + page1.width() * 1.00106f, page1.top + page1.height() * 0.25373f, page1.left +
                                    page1.width() * 0.98824f, page1.top + page1.height() * 0.24272f);
                    fill21Path.cubicTo(page1.left + page1.width() * 0.98447f, page1.top + page1.height() * 0.23949f,
                            page1.left + page1.width() * 0.98015f, page1.top + page1.height() * 0.23709f, page1.left +
                                    page1.width() * 0.97557f, page1.top + page1.height() * 0.2355f);
                    fill21Path.cubicTo(page1.left + page1.width() * 0.97918f, page1.top + page1.height() * 0.22716f,
                            page1.left + page1.width() * 0.9771f, page1.top + page1.height() * 0.21734f, page1.left +
                                    page1.width() * 0.96943f, page1.top + page1.height() * 0.21076f);
                    fill21Path.cubicTo(page1.left + page1.width() * 0.96784f, page1.top + page1.height() * 0.20939f,
                            page1.left + page1.width() * 0.96609f, page1.top + page1.height() * 0.20828f, page1.left +
                                    page1.width() * 0.96425f, page1.top + page1.height() * 0.20735f);
                    fill21Path.cubicTo(page1.left + page1.width() * 0.96884f, page1.top + page1.height() * 0.19181f,
                            page1.left + page1.width() * 0.96413f, page1.top + page1.height() * 0.17456f, page1.left +
                                    page1.width() * 0.95024f, page1.top + page1.height() * 0.16265f);
                    fill21Path.cubicTo(page1.left + page1.width() * 0.93647f, page1.top + page1.height() * 0.15083f,
                            page1.left + page1.width() * 0.91722f, page1.top + page1.height() * 0.14732f, page1.left +
                                    page1.width() * 0.90016f, page1.top + page1.height() * 0.15191f);
                    fill21Path.cubicTo(page1.left + page1.width() * 0.89879f, page1.top + page1.height() * 0.15039f,
                            page1.left + page1.width() * 0.89734f, page1.top + page1.height() * 0.14891f, page1.left +
                                    page1.width() * 0.89573f, page1.top + page1.height() * 0.14752f);
                    fill21Path.cubicTo(page1.left + page1.width() * 0.87935f, page1.top + page1.height() * 0.13347f,
                            page1.left + page1.width() * 0.85525f, page1.top + page1.height() * 0.13114f, page1.left +
                                    page1.width() * 0.83628f, page1.top + page1.height() * 0.14024f);
                    fill21Path.cubicTo(page1.left + page1.width() * 0.86394f, page1.top + page1.height() * 0.15608f,
                            page1.left + page1.width() * 0.89031f, page1.top + page1.height() * 0.17452f, page1.left +
                                    page1.width() * 0.91491f, page1.top + page1.height() * 0.19563f);
                    fill21Path.close();

                    paint.reset();
                    paint.setFlags(Paint.ANTI_ALIAS_FLAG);
                    fill21Path.setFillType(Path.FillType.EVEN_ODD);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(color);
                    canvas.drawPath(fill21Path, paint);

                    // Fill-27
                    RectF fill27Rect = CacheForClouds.fill27Rect;
                    fill27Rect.set(template.left + (float) Math.floor(template.width() * 0.62489f - 0.08f) + 0.58f,
                            template.top + (float) Math.floor(template.height() * 0.0197f - 0.29f) + 0.79f,
                            template.left + (float) Math.floor(template.width() * 0.86767f + 0.12f) + 0.38f,
                            template.top + (float) Math.floor(template.height() * 0.09438f + 0.34f) + 0.16f);
                    Path fill27Path = CacheForClouds.fill27Path;
                    fill27Path.reset();
                    fill27Path.moveTo(page1.left + page1.width() * 0.62489f, page1.top + page1.height() * 0.02536f);
                    fill27Path.lineTo(page1.left + page1.width() * 0.86767f, page1.top + page1.height() * 0.09438f);
                    fill27Path.lineTo(page1.left + page1.width() * 0.83849f, page1.top + page1.height() * 0.069f);
                    fill27Path.lineTo(page1.left + page1.width() * 0.79239f, page1.top + page1.height() * 0.06443f);
                    fill27Path.lineTo(page1.left + page1.width() * 0.76913f, page1.top + page1.height() * 0.04928f);
                    fill27Path.lineTo(page1.left + page1.width() * 0.73996f, page1.top + page1.height() * 0.0239f);
                    fill27Path.lineTo(page1.left + page1.width() * 0.72853f, page1.top + page1.height() * 0.02919f);
                    fill27Path.lineTo(page1.left + page1.width() * 0.68243f, page1.top + page1.height() * 0.02463f);
                    fill27Path.lineTo(page1.left + page1.width() * 0.66508f, page1.top + page1.height() * 0.0197f);
                    fill27Path.lineTo(page1.left + page1.width() * 0.62489f, page1.top + page1.height() * 0.02536f);
                    fill27Path.close();

                    paint.reset();
                    paint.setFlags(Paint.ANTI_ALIAS_FLAG);
                    fill27Path.setFillType(Path.FillType.EVEN_ODD);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(color);
                    canvas.drawPath(fill27Path, paint);

                    // Fill-29
                    RectF fill29Rect = CacheForClouds.fill29Rect;
                    fill29Rect.set(template.left + (float) Math.floor(template.width() * 0.17266f - 0.23f) + 0.73f,
                            template.top + (float) Math.floor(template.height() * 0.81642f + 0.44f) + 0.06f,
                            template.left + (float) Math.floor(template.width() * 0.47788f + 0.23f) + 0.27f,
                            template.top + (float) Math.floor(template.height() * 1f + 0.13f) + 0.37f);
                    Path fill29Path = CacheForClouds.fill29Path;
                    fill29Path.reset();
                    fill29Path.moveTo(page1.left + page1.width() * 0.47788f, page1.top + page1.height() * 0.97738f);
                    fill29Path.lineTo(page1.left + page1.width() * 0.17266f, page1.top + page1.height() * 0.81642f);
                    fill29Path.lineTo(page1.left + page1.width() * 0.17589f, page1.top + page1.height() * 0.8683f);
                    fill29Path.lineTo(page1.left + page1.width() * 0.19546f, page1.top + page1.height() * 0.89535f);
                    fill29Path.lineTo(page1.left + page1.width() * 0.20686f, page1.top + page1.height() * 0.93482f);
                    fill29Path.lineTo(page1.left + page1.width() * 0.22643f, page1.top + page1.height() * 0.96187f);
                    fill29Path.lineTo(page1.left + page1.width() * 0.2844f, page1.top + page1.height() * 0.95898f);
                    fill29Path.lineTo(page1.left + page1.width() * 0.32849f, page1.top + page1.height() * 0.94879f);
                    fill29Path.lineTo(page1.left + page1.width() * 0.34806f, page1.top + page1.height() * 0.97584f);
                    fill29Path.lineTo(page1.left + page1.width() * 0.38399f, page1.top + page1.height() * 0.97805f);
                    fill29Path.lineTo(page1.left + page1.width() * 0.40604f, page1.top + page1.height() * 0.97295f);
                    fill29Path.lineTo(page1.left + page1.width() * 0.42561f, page1.top + page1.height() * 1f);
                    fill29Path.lineTo(page1.left + page1.width() * 0.45583f, page1.top + page1.height() * 0.98248f);
                    fill29Path.lineTo(page1.left + page1.width() * 0.47788f, page1.top + page1.height() * 0.97738f);
                    fill29Path.close();

                    paint.reset();
                    paint.setFlags(Paint.ANTI_ALIAS_FLAG);
                    fill29Path.setFillType(Path.FillType.EVEN_ODD);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(color);
                    canvas.drawPath(fill29Path, paint);

                    // Fill-31
                    RectF fill31Rect = CacheForClouds.fill31Rect;
                    fill31Rect.set(template.left + (float) Math.floor(template.width() * 0.05105f - 0.29f) + 0.79f,
                            template.top + (float) Math.floor(template.height() * 0.2513f + 0.16f) + 0.34f,
                            template.left + (float) Math.floor(template.width() * 0.15208f + 0.32f) + 0.18f,
                            template.top + (float) Math.floor(template.height() * 0.40383f - 0.18f) + 0.68f);
                    Path fill31Path = CacheForClouds.fill31Path;
                    fill31Path.reset();
                    fill31Path.moveTo(page1.left + page1.width() * 0.06146f, page1.top + page1.height() * 0.40383f);
                    fill31Path.lineTo(page1.left + page1.width() * 0.05105f, page1.top + page1.height() * 0.37335f);
                    fill31Path.lineTo(page1.left + page1.width() * 0.07769f, page1.top + page1.height() * 0.36051f);
                    fill31Path.lineTo(page1.left + page1.width() * 0.0821f, page1.top + page1.height() * 0.33709f);
                    fill31Path.lineTo(page1.left + page1.width() * 0.15208f, page1.top + page1.height() * 0.2513f);
                    fill31Path.lineTo(page1.left + page1.width() * 0.06146f, page1.top + page1.height() * 0.40383f);
                    fill31Path.close();

                    paint.reset();
                    paint.setFlags(Paint.ANTI_ALIAS_FLAG);
                    fill31Path.setFillType(Path.FillType.EVEN_ODD);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(color);
                    canvas.drawPath(fill31Path, paint);
                }
            }
        }
    }


}
