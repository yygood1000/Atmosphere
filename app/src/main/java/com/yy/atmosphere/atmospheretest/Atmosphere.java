package com.yy.atmosphere.atmospheretest;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;

public class Atmosphere {

    // Resizing Behavior
    public enum ResizingBehavior {
        AspectFit, //!< The content is proportionally resized to fit into the target rectangle.
        AspectFill, //!< The content is proportionally resized to completely fill the target rectangle.
        Stretch, //!< The content is stretched to match the entire target rectangle.
        Center, //!< The content is centered in the target rectangle, but it is NOT resized.
    }

    // Canvas Drawings

    // Clouds
    private static class CacheForCloudsGray {
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


    public static void drawCloudsGray(Canvas canvas, RectF frame) {
        // General Declarations
        Paint paint = CacheForCloudsGray.paint;

        // Local Colors
        int fillColor4 = Color.argb(255, 196, 194, 194);
        int fillColorAlpha = PaintCodeColor.colorByChangingAlpha(fillColor4, 128);

        // template
        {
            RectF template = CacheForCloudsGray.template;
            template.set(frame.left + (float) Math.floor(frame.width() * 0.12232f + 0.19f) + 0.31f,
                    frame.top + (float) Math.floor(frame.height() * 0.10515f - 0.42f) + 0.92f,
                    frame.left + (float) Math.floor(frame.width() * 0.79484f + 0.02f) + 0.48f,
                    frame.top + (float) Math.floor(frame.height() * 0.85661f + 0.21f) + 0.29f);

            // Group 2
            {
                RectF group2 = CacheForCloudsGray.group2;
                group2.set(template.left,
                        template.top,
                        template.left + (float) Math.floor(template.width() + 0.33f) + 0.17f,
                        template.top + (float) Math.floor(template.height() + 0.13f) + 0.37f);

                // Page-1
                {
                    RectF page1 = CacheForCloudsGray.page1;
                    page1.set(template.left,
                            template.top,
                            template.left + (float) Math.floor(template.width() + 0.33f) + 0.17f,
                            template.top + (float) Math.floor(template.height() + 0.13f) + 0.37f);

                    // Fill-15
                    RectF fill15Rect = CacheForCloudsGray.fill15Rect;
                    fill15Rect.set(template.left,
                            template.top + (float) Math.floor(template.height() * 0.41239f + 0.17f) + 0.33f,
                            template.left + (float) Math.floor(template.width() * 0.06682f - 0f) + 0.5f,
                            template.top + (float) Math.floor(template.height() * 0.61458f + 0.27f) + 0.23f);
                    Path fill15Path = CacheForCloudsGray.fill15Path;
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
                    paint.setColor(fillColorAlpha);
                    canvas.drawPath(fill15Path, paint);

                    // Fill-17
                    RectF fill17Rect = CacheForCloudsGray.fill17Rect;
                    fill17Rect.set(template.left + (float) Math.floor(template.width() * 0.10671f + 0.13f) + 0.37f,
                            template.top + (float) Math.floor(template.height() * 0.75641f - 0.01f) + 0.51f,
                            template.left + (float) Math.floor(template.width() * 0.2363f - 0.18f) + 0.68f,
                            template.top + (float) Math.floor(template.height() * 0.88396f + 0.45f) + 0.05f);
                    Path fill17Path = CacheForCloudsGray.fill17Path;
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
                    paint.setColor(fillColorAlpha);
                    canvas.drawPath(fill17Path, paint);

                    // Fill-19
                    RectF fill19Rect = CacheForCloudsGray.fill19Rect;
                    fill19Rect.set(template.left + (float) Math.floor(template.width() * 0.41356f + 0.3f) + 0.2f,
                            template.top,
                            template.left + (float) Math.floor(template.width() * 0.72f - 0.46f) + 0.96f,
                            template.top + (float) Math.floor(template.height() * 0.08948f + 0.29f) + 0.21f);
                    Path fill19Path = CacheForCloudsGray.fill19Path;
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
                    paint.setColor(fillColorAlpha);
                    canvas.drawPath(fill19Path, paint);

                    // Fill-21
                    RectF fill21Rect = CacheForCloudsGray.fill21Rect;
                    fill21Rect.set(template.left + (float) Math.floor(template.width() * 0.83628f - 0.48f) + 0.98f,
                            template.top + (float) Math.floor(template.height() * 0.13482f - 0.44f) + 0.94f,
                            template.left + (float) Math.floor(template.width() * 1f + 0.33f) + 0.17f,
                            template.top + (float) Math.floor(template.height() * 0.28406f - 0.15f) + 0.65f);
                    Path fill21Path = CacheForCloudsGray.fill21Path;
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
                    paint.setColor(fillColorAlpha);
                    canvas.drawPath(fill21Path, paint);

                    // Fill-27
                    RectF fill27Rect = CacheForCloudsGray.fill27Rect;
                    fill27Rect.set(template.left + (float) Math.floor(template.width() * 0.62489f - 0.08f) + 0.58f,
                            template.top + (float) Math.floor(template.height() * 0.0197f - 0.29f) + 0.79f,
                            template.left + (float) Math.floor(template.width() * 0.86767f + 0.12f) + 0.38f,
                            template.top + (float) Math.floor(template.height() * 0.09438f + 0.34f) + 0.16f);
                    Path fill27Path = CacheForCloudsGray.fill27Path;
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
                    paint.setColor(fillColorAlpha);
                    canvas.drawPath(fill27Path, paint);

                    // Fill-29
                    RectF fill29Rect = CacheForCloudsGray.fill29Rect;
                    fill29Rect.set(template.left + (float) Math.floor(template.width() * 0.17266f - 0.23f) + 0.73f,
                            template.top + (float) Math.floor(template.height() * 0.81642f + 0.44f) + 0.06f,
                            template.left + (float) Math.floor(template.width() * 0.47788f + 0.23f) + 0.27f,
                            template.top + (float) Math.floor(template.height() * 1f + 0.13f) + 0.37f);
                    Path fill29Path = CacheForCloudsGray.fill29Path;
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
                    paint.setColor(fillColorAlpha);
                    canvas.drawPath(fill29Path, paint);

                    // Fill-31
                    RectF fill31Rect = CacheForCloudsGray.fill31Rect;
                    fill31Rect.set(template.left + (float) Math.floor(template.width() * 0.05105f - 0.29f) + 0.79f,
                            template.top + (float) Math.floor(template.height() * 0.2513f + 0.16f) + 0.34f,
                            template.left + (float) Math.floor(template.width() * 0.15208f + 0.32f) + 0.18f,
                            template.top + (float) Math.floor(template.height() * 0.40383f - 0.18f) + 0.68f);
                    Path fill31Path = CacheForCloudsGray.fill31Path;
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
                    paint.setColor(fillColorAlpha);
                    canvas.drawPath(fill31Path, paint);
                }
            }
        }
    }

    private static class CacheForCloudsBlue {
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


    public static void drawCloudsBlue(Canvas canvas, RectF frame) {
        // General Declarations
        Paint paint = CacheForCloudsBlue.paint;

        // Local Colors
        int avatarBlue = Color.argb(255, 1, 100, 181);
        int avatarBlueAlpha = PaintCodeColor.colorByChangingAlpha(avatarBlue, 128);

        // template
        {
            RectF template = CacheForCloudsBlue.template;
            template.set(frame.left + (float) Math.floor(frame.width() * 0.12232f + 0.19f) + 0.31f,
                    frame.top + (float) Math.floor(frame.height() * 0.10515f - 0.42f) + 0.92f,
                    frame.left + (float) Math.floor(frame.width() * 0.79484f + 0.02f) + 0.48f,
                    frame.top + (float) Math.floor(frame.height() * 0.85661f + 0.21f) + 0.29f);

            // Group 2
            {
                RectF group2 = CacheForCloudsBlue.group2;
                group2.set(template.left,
                        template.top,
                        template.left + (float) Math.floor(template.width() + 0.33f) + 0.17f,
                        template.top + (float) Math.floor(template.height() + 0.13f) + 0.37f);

                // Page-1
                {
                    RectF page1 = CacheForCloudsBlue.page1;
                    page1.set(template.left,
                            template.top,
                            template.left + (float) Math.floor(template.width() + 0.33f) + 0.17f,
                            template.top + (float) Math.floor(template.height() + 0.13f) + 0.37f);

                    // Fill-15
                    RectF fill15Rect = CacheForCloudsBlue.fill15Rect;
                    fill15Rect.set(template.left,
                            template.top + (float) Math.floor(template.height() * 0.41239f + 0.17f) + 0.33f,
                            template.left + (float) Math.floor(template.width() * 0.06682f - 0f) + 0.5f,
                            template.top + (float) Math.floor(template.height() * 0.61458f + 0.27f) + 0.23f);
                    Path fill15Path = CacheForCloudsBlue.fill15Path;
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
                    paint.setColor(avatarBlueAlpha);
                    canvas.drawPath(fill15Path, paint);

                    // Fill-17
                    RectF fill17Rect = CacheForCloudsBlue.fill17Rect;
                    fill17Rect.set(template.left + (float) Math.floor(template.width() * 0.10671f + 0.13f) + 0.37f,
                            template.top + (float) Math.floor(template.height() * 0.75641f - 0.01f) + 0.51f,
                            template.left + (float) Math.floor(template.width() * 0.2363f - 0.18f) + 0.68f,
                            template.top + (float) Math.floor(template.height() * 0.88396f + 0.45f) + 0.05f);
                    Path fill17Path = CacheForCloudsBlue.fill17Path;
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
                    paint.setColor(avatarBlueAlpha);
                    canvas.drawPath(fill17Path, paint);

                    // Fill-19
                    RectF fill19Rect = CacheForCloudsBlue.fill19Rect;
                    fill19Rect.set(template.left + (float) Math.floor(template.width() * 0.41356f + 0.3f) + 0.2f,
                            template.top,
                            template.left + (float) Math.floor(template.width() * 0.72f - 0.46f) + 0.96f,
                            template.top + (float) Math.floor(template.height() * 0.08948f + 0.29f) + 0.21f);
                    Path fill19Path = CacheForCloudsBlue.fill19Path;
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
                    paint.setColor(avatarBlueAlpha);
                    canvas.drawPath(fill19Path, paint);

                    // Fill-21
                    RectF fill21Rect = CacheForCloudsBlue.fill21Rect;
                    fill21Rect.set(template.left + (float) Math.floor(template.width() * 0.83628f - 0.48f) + 0.98f,
                            template.top + (float) Math.floor(template.height() * 0.13482f - 0.44f) + 0.94f,
                            template.left + (float) Math.floor(template.width() * 1f + 0.33f) + 0.17f,
                            template.top + (float) Math.floor(template.height() * 0.28406f - 0.15f) + 0.65f);
                    Path fill21Path = CacheForCloudsBlue.fill21Path;
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
                    paint.setColor(avatarBlueAlpha);
                    canvas.drawPath(fill21Path, paint);

                    // Fill-27
                    RectF fill27Rect = CacheForCloudsBlue.fill27Rect;
                    fill27Rect.set(template.left + (float) Math.floor(template.width() * 0.62489f - 0.08f) + 0.58f,
                            template.top + (float) Math.floor(template.height() * 0.0197f - 0.29f) + 0.79f,
                            template.left + (float) Math.floor(template.width() * 0.86767f + 0.12f) + 0.38f,
                            template.top + (float) Math.floor(template.height() * 0.09438f + 0.34f) + 0.16f);
                    Path fill27Path = CacheForCloudsBlue.fill27Path;
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
                    paint.setColor(avatarBlueAlpha);
                    canvas.drawPath(fill27Path, paint);

                    // Fill-29
                    RectF fill29Rect = CacheForCloudsBlue.fill29Rect;
                    fill29Rect.set(template.left + (float) Math.floor(template.width() * 0.17266f - 0.23f) + 0.73f,
                            template.top + (float) Math.floor(template.height() * 0.81642f + 0.44f) + 0.06f,
                            template.left + (float) Math.floor(template.width() * 0.47788f + 0.23f) + 0.27f,
                            template.top + (float) Math.floor(template.height() * 1f + 0.13f) + 0.37f);
                    Path fill29Path = CacheForCloudsBlue.fill29Path;
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
                    paint.setColor(avatarBlueAlpha);
                    canvas.drawPath(fill29Path, paint);

                    // Fill-31
                    RectF fill31Rect = CacheForCloudsBlue.fill31Rect;
                    fill31Rect.set(template.left + (float) Math.floor(template.width() * 0.05105f - 0.29f) + 0.79f,
                            template.top + (float) Math.floor(template.height() * 0.2513f + 0.16f) + 0.34f,
                            template.left + (float) Math.floor(template.width() * 0.15208f + 0.32f) + 0.18f,
                            template.top + (float) Math.floor(template.height() * 0.40383f - 0.18f) + 0.68f);
                    Path fill31Path = CacheForCloudsBlue.fill31Path;
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
                    paint.setColor(avatarBlueAlpha);
                    canvas.drawPath(fill31Path, paint);
                }
            }
        }
    }

    private static class CacheForCloudsGreen {
        private static Paint paint = new Paint();
        private static RectF originalFrame = new RectF(0f, 0f, 256f, 256f);
        private static RectF resizedFrame = new RectF();
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

    public static void drawCloudsGreen(Canvas canvas) {
        Atmosphere.drawCloudsGreen(canvas, new RectF(0f, 0f, 256f, 256f), ResizingBehavior.AspectFit);
    }

    public static void drawCloudsGreen(Canvas canvas, RectF targetFrame, ResizingBehavior resizing) {
        // General Declarations
        Paint paint = CacheForCloudsGreen.paint;

        // Local Colors
        int avatarGreen = Color.argb(255, 12, 173, 1);
        int avatarGreenAlpha = PaintCodeColor.colorByChangingAlpha(avatarGreen, 128);

        // Resize to Target Frame
        canvas.save();
        RectF resizedFrame = CacheForCloudsGreen.resizedFrame;
        Atmosphere.resizingBehaviorApply(resizing, CacheForCloudsGreen.originalFrame, targetFrame, resizedFrame);
//        canvas.translate(resizedFrame.left, resizedFrame.top);
        canvas.scale(1, resizedFrame.height() / 256f);

        // template
        // Group 2
        // Page-1
        // Fill-15
        RectF fill15Rect = CacheForCloudsGreen.fill15Rect;
        fill15Rect.set(206.31f, 69.25f, 217.82f, 108.15f);
        Path fill15Path = CacheForCloudsGreen.fill15Path;
        fill15Path.reset();
        fill15Path.moveTo(215.1f, 91f);
        fill15Path.cubicTo(215.1f, 83.49f, 216.05f, 76.21f, 217.82f, 69.25f);
        fill15Path.cubicTo(214.99f, 69.99f, 212.91f, 72.56f, 212.91f, 75.62f);
        fill15Path.cubicTo(212.91f, 76.52f, 213.09f, 77.37f, 213.41f, 78.15f);
        fill15Path.cubicTo(211.82f, 78.82f, 210.71f, 80.38f, 210.71f, 82.21f);
        fill15Path.cubicTo(210.71f, 82.59f, 210.76f, 82.96f, 210.85f, 83.31f);
        fill15Path.cubicTo(208.15f, 84.81f, 206.31f, 87.69f, 206.31f, 91f);
        fill15Path.cubicTo(206.31f, 94.29f, 208.12f, 97.15f, 210.79f, 98.65f);
        fill15Path.cubicTo(210.74f, 99.03f, 210.71f, 99.4f, 210.71f, 99.79f);
        fill15Path.cubicTo(210.71f, 103.69f, 213.26f, 107f, 216.78f, 108.15f);
        fill15Path.cubicTo(215.68f, 102.6f, 215.1f, 96.87f, 215.1f, 91f);
        fill15Path.close();

        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        fill15Path.setFillType(Path.FillType.EVEN_ODD);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(avatarGreenAlpha);
        canvas.drawPath(fill15Path, paint);

        // Fill-17
        RectF fill17Rect = CacheForCloudsGreen.fill17Rect;
        fill17Rect.set(224.68f, 135.43f, 247f, 159.97f);
        Path fill17Path = CacheForCloudsGreen.fill17Path;
        fill17Path.reset();
        fill17Path.moveTo(227.76f, 151.73f);
        fill17Path.cubicTo(229.99f, 154.49f, 233.54f, 155.54f, 236.76f, 154.72f);
        fill17Path.cubicTo(236.97f, 155.72f, 237.4f, 156.68f, 238.08f, 157.52f);
        fill17Path.cubicTo(240.28f, 160.24f, 244.18f, 160.75f, 247f, 158.77f);
        fill17Path.cubicTo(242.54f, 155.08f, 238.38f, 150.89f, 234.6f, 146.21f);
        fill17Path.cubicTo(231.81f, 142.75f, 229.33f, 139.15f, 227.14f, 135.43f);
        fill17Path.cubicTo(226.86f, 135.57f, 226.58f, 135.74f, 226.32f, 135.95f);
        fill17Path.cubicTo(224.43f, 137.48f, 224.14f, 140.24f, 225.66f, 142.13f);
        fill17Path.cubicTo(225.9f, 142.43f, 226.17f, 142.68f, 226.46f, 142.9f);
        fill17Path.cubicTo(225.3f, 145.76f, 225.68f, 149.16f, 227.76f, 151.73f);
        fill17Path.close();

        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        fill17Path.setFillType(Path.FillType.EVEN_ODD);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(avatarGreenAlpha);
        canvas.drawPath(fill17Path, paint);

        // Fill-19
        RectF fill19Rect = CacheForCloudsGreen.fill19Rect;
        fill19Rect.set(277.51f, -10.08f, 330.27f, 7.13f);
        Path fill19Path = CacheForCloudsGreen.fill19Path;
        fill19Path.reset();
        fill19Path.moveTo(303.9f, 3.1f);
        fill19Path.cubicTo(312.78f, 3.19f, 321.33f, 4.6f, 329.38f, 7.13f);
        fill19Path.cubicTo(329.93f, 5.99f, 330.26f, 4.72f, 330.27f, 3.37f);
        fill19Path.cubicTo(330.32f, -1.48f, 326.43f, -5.46f, 321.57f, -5.51f);
        fill19Path.cubicTo(319.23f, -5.53f, 317.1f, -4.63f, 315.51f, -3.15f);
        fill19Path.cubicTo(313.3f, -7.24f, 309.01f, -10.03f, 304.04f, -10.08f);
        fill19Path.cubicTo(297.79f, -10.15f, 292.52f, -5.85f, 291.1f, -0.03f);
        fill19Path.cubicTo(289.74f, -0.92f, 288.12f, -1.45f, 286.37f, -1.47f);
        fill19Path.cubicTo(281.64f, -1.52f, 277.76f, 2.18f, 277.51f, 6.85f);
        fill19Path.cubicTo(285.86f, 4.33f, 294.72f, 3.01f, 303.9f, 3.1f);
        fill19Path.close();

        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        fill19Path.setFillType(Path.FillType.EVEN_ODD);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(avatarGreenAlpha);
        canvas.drawPath(fill19Path, paint);

        // Fill-21
        RectF fill21Rect = CacheForCloudsGreen.fill21Rect;
        fill21Rect.set(350.29f, 15.85f, 378.48f, 44.56f);
        Path fill21Path = CacheForCloudsGreen.fill21Path;
        fill21Path.reset();
        fill21Path.moveTo(363.83f, 27.55f);
        fill21Path.cubicTo(369.25f, 32.75f, 373.86f, 38.47f, 377.65f, 44.56f);
        fill21Path.cubicTo(379.07f, 42.01f, 378.66f, 38.73f, 376.45f, 36.61f);
        fill21Path.cubicTo(375.81f, 35.99f, 375.06f, 35.53f, 374.27f, 35.22f);
        fill21Path.cubicTo(374.89f, 33.62f, 374.54f, 31.73f, 373.22f, 30.46f);
        fill21Path.cubicTo(372.94f, 30.2f, 372.64f, 29.98f, 372.32f, 29.81f);
        fill21Path.cubicTo(373.11f, 26.82f, 372.3f, 23.5f, 369.91f, 21.21f);
        fill21Path.cubicTo(367.54f, 18.93f, 364.23f, 18.26f, 361.29f, 19.14f);
        fill21Path.cubicTo(361.05f, 18.85f, 360.81f, 18.56f, 360.53f, 18.3f);
        fill21Path.cubicTo(357.71f, 15.59f, 353.56f, 15.15f, 350.29f, 16.9f);
        fill21Path.cubicTo(355.05f, 19.94f, 359.59f, 23.49f, 363.83f, 27.55f);
        fill21Path.close();

        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        fill21Path.setFillType(Path.FillType.EVEN_ODD);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(avatarGreenAlpha);
        canvas.drawPath(fill21Path, paint);

        // Fill-27
        RectF fill27Rect = CacheForCloudsGreen.fill27Rect;
        fill27Rect.set(313.9f, -6.29f, 355.7f, 8.07f);
        Path fill27Path = CacheForCloudsGreen.fill27Path;
        fill27Path.reset();
        fill27Path.moveTo(313.9f, -5.2f);
        fill27Path.lineTo(355.7f, 8.07f);
        fill27Path.lineTo(350.67f, 3.19f);
        fill27Path.lineTo(342.74f, 2.31f);
        fill27Path.lineTo(338.73f, -0.6f);
        fill27Path.lineTo(333.71f, -5.48f);
        fill27Path.lineTo(331.74f, -4.47f);
        fill27Path.lineTo(323.8f, -5.34f);
        fill27Path.lineTo(320.82f, -6.29f);
        fill27Path.lineTo(313.9f, -5.2f);
        fill27Path.close();

        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        fill27Path.setFillType(Path.FillType.EVEN_ODD);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(avatarGreenAlpha);
        canvas.drawPath(fill27Path, paint);

        // Fill-29
        RectF fill29Rect = CacheForCloudsGreen.fill29Rect;
        fill29Rect.set(236.04f, 146.98f, 288.59f, 182.29f);
        Path fill29Path = CacheForCloudsGreen.fill29Path;
        fill29Path.reset();
        fill29Path.moveTo(288.59f, 177.94f);
        fill29Path.lineTo(236.04f, 146.98f);
        fill29Path.lineTo(236.59f, 156.96f);
        fill29Path.lineTo(239.96f, 162.16f);
        fill29Path.lineTo(241.93f, 169.75f);
        fill29Path.lineTo(245.3f, 174.96f);
        fill29Path.lineTo(255.28f, 174.4f);
        fill29Path.lineTo(262.87f, 172.44f);
        fill29Path.lineTo(266.24f, 177.64f);
        fill29Path.lineTo(272.42f, 178.07f);
        fill29Path.lineTo(276.22f, 177.09f);
        fill29Path.lineTo(279.59f, 182.29f);
        fill29Path.lineTo(284.79f, 178.92f);
        fill29Path.lineTo(288.59f, 177.94f);
        fill29Path.close();

        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        fill29Path.setFillType(Path.FillType.EVEN_ODD);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(avatarGreenAlpha);
        canvas.drawPath(fill29Path, paint);

        // Fill-31
        RectF fill31Rect = CacheForCloudsGreen.fill31Rect;
        fill31Rect.set(215.1f, 38.26f, 232.5f, 67.6f);
        Path fill31Path = CacheForCloudsGreen.fill31Path;
        fill31Path.reset();
        fill31Path.moveTo(216.9f, 67.6f);
        fill31Path.lineTo(215.1f, 61.74f);
        fill31Path.lineTo(219.69f, 59.27f);
        fill31Path.lineTo(220.45f, 54.77f);
        fill31Path.lineTo(232.5f, 38.26f);
        fill31Path.lineTo(216.9f, 67.6f);
        fill31Path.close();

        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        fill31Path.setFillType(Path.FillType.EVEN_ODD);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(avatarGreenAlpha);
        canvas.drawPath(fill31Path, paint);

        canvas.restore();
    }

    private static class CacheForCloudsOrange {
        private static Paint paint = new Paint();
        private static RectF originalFrame = new RectF(0f, 0f, 256f, 256f);
        private static RectF resizedFrame = new RectF();
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

    public static void drawCloudsOrange(Canvas canvas, RectF frame2) {
        Atmosphere.drawCloudsOrange(canvas, new RectF(0f, 0f, 256f, 256f), ResizingBehavior.AspectFit,
                frame2);
    }

    public static void drawCloudsOrange(Canvas canvas, RectF targetFrame, ResizingBehavior resizing,
                                        RectF frame2) {
        // General Declarations
        Paint paint = CacheForCloudsOrange.paint;

        // Local Colors
        int avatarOrange = Color.argb(255, 255, 148, 0);
        int avatarOrangeAlpha = PaintCodeColor.colorByChangingAlpha(avatarOrange, 128);

        // Resize to Target Frame
        canvas.save();
        RectF resizedFrame = CacheForCloudsOrange.resizedFrame;
        Atmosphere.resizingBehaviorApply(resizing, CacheForCloudsOrange.originalFrame, targetFrame, resizedFrame);
        canvas.translate(resizedFrame.left, resizedFrame.top);
        canvas.scale(resizedFrame.width() / 256f, resizedFrame.height() / 256f);

        // template
        {
            RectF template = CacheForCloudsOrange.template;
            template.set(frame2.left + (float) Math.floor(frame2.width() * 0.46607f + 0.19f) + 0.31f,
                    frame2.top + (float) Math.floor(frame2.height() * 0.24968f - 0.42f) + 0.92f,
                    frame2.left + (float) Math.floor(frame2.width() * 1.13859f + 0.02f) + 0.48f,
                    frame2.top + (float) Math.floor(frame2.height() * 1.00114f + 0.21f) + 0.29f);

            // Group 2
            {
                RectF group2 = CacheForCloudsOrange.group2;
                group2.set(template.left,
                        template.top,
                        template.left + (float) Math.floor(template.width() + 0.33f) + 0.17f,
                        template.top + (float) Math.floor(template.height() + 0.13f) + 0.37f);

                // Page-1
                {
                    RectF page1 = CacheForCloudsOrange.page1;
                    page1.set(template.left,
                            template.top,
                            template.left + (float) Math.floor(template.width() + 0.33f) + 0.17f,
                            template.top + (float) Math.floor(template.height() + 0.13f) + 0.37f);

                    // Fill-15
                    RectF fill15Rect = CacheForCloudsOrange.fill15Rect;
                    fill15Rect.set(template.left,
                            template.top + (float) Math.floor(template.height() * 0.41239f + 0.17f) + 0.33f,
                            template.left + (float) Math.floor(template.width() * 0.06682f - 0f) + 0.5f,
                            template.top + (float) Math.floor(template.height() * 0.61458f + 0.27f) + 0.23f);
                    Path fill15Path = CacheForCloudsOrange.fill15Path;
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
                    paint.setColor(avatarOrangeAlpha);
                    canvas.drawPath(fill15Path, paint);

                    // Fill-17
                    RectF fill17Rect = CacheForCloudsOrange.fill17Rect;
                    fill17Rect.set(template.left + (float) Math.floor(template.width() * 0.10671f + 0.13f) + 0.37f,
                            template.top + (float) Math.floor(template.height() * 0.75641f - 0.01f) + 0.51f,
                            template.left + (float) Math.floor(template.width() * 0.2363f - 0.18f) + 0.68f,
                            template.top + (float) Math.floor(template.height() * 0.88396f + 0.45f) + 0.05f);
                    Path fill17Path = CacheForCloudsOrange.fill17Path;
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
                    paint.setColor(avatarOrangeAlpha);
                    canvas.drawPath(fill17Path, paint);

                    // Fill-19
                    RectF fill19Rect = CacheForCloudsOrange.fill19Rect;
                    fill19Rect.set(template.left + (float) Math.floor(template.width() * 0.41356f + 0.3f) + 0.2f,
                            template.top,
                            template.left + (float) Math.floor(template.width() * 0.72f - 0.46f) + 0.96f,
                            template.top + (float) Math.floor(template.height() * 0.08948f + 0.29f) + 0.21f);
                    Path fill19Path = CacheForCloudsOrange.fill19Path;
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
                    paint.setColor(avatarOrangeAlpha);
                    canvas.drawPath(fill19Path, paint);

                    // Fill-21
                    RectF fill21Rect = CacheForCloudsOrange.fill21Rect;
                    fill21Rect.set(template.left + (float) Math.floor(template.width() * 0.83628f - 0.48f) + 0.98f,
                            template.top + (float) Math.floor(template.height() * 0.13482f - 0.44f) + 0.94f,
                            template.left + (float) Math.floor(template.width() * 1f + 0.33f) + 0.17f,
                            template.top + (float) Math.floor(template.height() * 0.28406f - 0.15f) + 0.65f);
                    Path fill21Path = CacheForCloudsOrange.fill21Path;
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
                    paint.setColor(avatarOrangeAlpha);
                    canvas.drawPath(fill21Path, paint);

                    // Fill-27
                    RectF fill27Rect = CacheForCloudsOrange.fill27Rect;
                    fill27Rect.set(template.left + (float) Math.floor(template.width() * 0.62489f - 0.08f) + 0.58f,
                            template.top + (float) Math.floor(template.height() * 0.0197f - 0.29f) + 0.79f,
                            template.left + (float) Math.floor(template.width() * 0.86767f + 0.12f) + 0.38f,
                            template.top + (float) Math.floor(template.height() * 0.09438f + 0.34f) + 0.16f);
                    Path fill27Path = CacheForCloudsOrange.fill27Path;
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
                    paint.setColor(avatarOrangeAlpha);
                    canvas.drawPath(fill27Path, paint);

                    // Fill-29
                    RectF fill29Rect = CacheForCloudsOrange.fill29Rect;
                    fill29Rect.set(template.left + (float) Math.floor(template.width() * 0.17266f - 0.23f) + 0.73f,
                            template.top + (float) Math.floor(template.height() * 0.81642f + 0.44f) + 0.06f,
                            template.left + (float) Math.floor(template.width() * 0.47788f + 0.23f) + 0.27f,
                            template.top + (float) Math.floor(template.height() * 1f + 0.13f) + 0.37f);
                    Path fill29Path = CacheForCloudsOrange.fill29Path;
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
                    paint.setColor(avatarOrangeAlpha);
                    canvas.drawPath(fill29Path, paint);

                    // Fill-31
                    RectF fill31Rect = CacheForCloudsOrange.fill31Rect;
                    fill31Rect.set(template.left + (float) Math.floor(template.width() * 0.05105f - 0.29f) + 0.79f,
                            template.top + (float) Math.floor(template.height() * 0.2513f + 0.16f) + 0.34f,
                            template.left + (float) Math.floor(template.width() * 0.15208f + 0.32f) + 0.18f,
                            template.top + (float) Math.floor(template.height() * 0.40383f - 0.18f) + 0.68f);
                    Path fill31Path = CacheForCloudsOrange.fill31Path;
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
                    paint.setColor(avatarOrangeAlpha);
                    canvas.drawPath(fill31Path, paint);
                }
            }
        }

        canvas.restore();
    }

    private static class CacheForCloudsPurple {
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


    public static void drawCloudsPurple(Canvas canvas, RectF frame) {
        // General Declarations
        Paint paint = CacheForCloudsPurple.paint;

        // Local Colors
        int avatarPurple = Color.argb(255, 100, 69, 243);
        int avatarPurpleAlpha = PaintCodeColor.colorByChangingAlpha(avatarPurple, 128);

        // template
        {
            RectF template = CacheForCloudsPurple.template;
            template.set(frame.left + (float) Math.floor(frame.width() * 0.12232f + 0.19f) + 0.31f,
                    frame.top + (float) Math.floor(frame.height() * 0.10515f - 0.42f) + 0.92f,
                    frame.left + (float) Math.floor(frame.width() * 0.79484f + 0.02f) + 0.48f,
                    frame.top + (float) Math.floor(frame.height() * 0.85661f + 0.21f) + 0.29f);

            // Group 2
            {
                RectF group2 = CacheForCloudsPurple.group2;
                group2.set(template.left,
                        template.top,
                        template.left + (float) Math.floor(template.width() + 0.33f) + 0.17f,
                        template.top + (float) Math.floor(template.height() + 0.13f) + 0.37f);

                // Page-1
                {
                    RectF page1 = CacheForCloudsPurple.page1;
                    page1.set(template.left,
                            template.top,
                            template.left + (float) Math.floor(template.width() + 0.33f) + 0.17f,
                            template.top + (float) Math.floor(template.height() + 0.13f) + 0.37f);

                    // Fill-15
                    RectF fill15Rect = CacheForCloudsPurple.fill15Rect;
                    fill15Rect.set(template.left,
                            template.top + (float) Math.floor(template.height() * 0.41239f + 0.17f) + 0.33f,
                            template.left + (float) Math.floor(template.width() * 0.06682f - 0f) + 0.5f,
                            template.top + (float) Math.floor(template.height() * 0.61458f + 0.27f) + 0.23f);
                    Path fill15Path = CacheForCloudsPurple.fill15Path;
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
                    paint.setColor(avatarPurpleAlpha);
                    canvas.drawPath(fill15Path, paint);

                    // Fill-17
                    RectF fill17Rect = CacheForCloudsPurple.fill17Rect;
                    fill17Rect.set(template.left + (float) Math.floor(template.width() * 0.10671f + 0.13f) + 0.37f,
                            template.top + (float) Math.floor(template.height() * 0.75641f - 0.01f) + 0.51f,
                            template.left + (float) Math.floor(template.width() * 0.2363f - 0.18f) + 0.68f,
                            template.top + (float) Math.floor(template.height() * 0.88396f + 0.45f) + 0.05f);
                    Path fill17Path = CacheForCloudsPurple.fill17Path;
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
                    paint.setColor(avatarPurpleAlpha);
                    canvas.drawPath(fill17Path, paint);

                    // Fill-19
                    RectF fill19Rect = CacheForCloudsPurple.fill19Rect;
                    fill19Rect.set(template.left + (float) Math.floor(template.width() * 0.41356f + 0.3f) + 0.2f,
                            template.top,
                            template.left + (float) Math.floor(template.width() * 0.72f - 0.46f) + 0.96f,
                            template.top + (float) Math.floor(template.height() * 0.08948f + 0.29f) + 0.21f);
                    Path fill19Path = CacheForCloudsPurple.fill19Path;
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
                    paint.setColor(avatarPurpleAlpha);
                    canvas.drawPath(fill19Path, paint);

                    // Fill-21
                    RectF fill21Rect = CacheForCloudsPurple.fill21Rect;
                    fill21Rect.set(template.left + (float) Math.floor(template.width() * 0.83628f - 0.48f) + 0.98f,
                            template.top + (float) Math.floor(template.height() * 0.13482f - 0.44f) + 0.94f,
                            template.left + (float) Math.floor(template.width() * 1f + 0.33f) + 0.17f,
                            template.top + (float) Math.floor(template.height() * 0.28406f - 0.15f) + 0.65f);
                    Path fill21Path = CacheForCloudsPurple.fill21Path;
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
                    paint.setColor(avatarPurpleAlpha);
                    canvas.drawPath(fill21Path, paint);

                    // Fill-27
                    RectF fill27Rect = CacheForCloudsPurple.fill27Rect;
                    fill27Rect.set(template.left + (float) Math.floor(template.width() * 0.62489f - 0.08f) + 0.58f,
                            template.top + (float) Math.floor(template.height() * 0.0197f - 0.29f) + 0.79f,
                            template.left + (float) Math.floor(template.width() * 0.86767f + 0.12f) + 0.38f,
                            template.top + (float) Math.floor(template.height() * 0.09438f + 0.34f) + 0.16f);
                    Path fill27Path = CacheForCloudsPurple.fill27Path;
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
                    paint.setColor(avatarPurpleAlpha);
                    canvas.drawPath(fill27Path, paint);

                    // Fill-29
                    RectF fill29Rect = CacheForCloudsPurple.fill29Rect;
                    fill29Rect.set(template.left + (float) Math.floor(template.width() * 0.17266f - 0.23f) + 0.73f,
                            template.top + (float) Math.floor(template.height() * 0.81642f + 0.44f) + 0.06f,
                            template.left + (float) Math.floor(template.width() * 0.47788f + 0.23f) + 0.27f,
                            template.top + (float) Math.floor(template.height() * 1f + 0.13f) + 0.37f);
                    Path fill29Path = CacheForCloudsPurple.fill29Path;
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
                    paint.setColor(avatarPurpleAlpha);
                    canvas.drawPath(fill29Path, paint);

                    // Fill-31
                    RectF fill31Rect = CacheForCloudsPurple.fill31Rect;
                    fill31Rect.set(template.left + (float) Math.floor(template.width() * 0.05105f - 0.29f) + 0.79f,
                            template.top + (float) Math.floor(template.height() * 0.2513f + 0.16f) + 0.34f,
                            template.left + (float) Math.floor(template.width() * 0.15208f + 0.32f) + 0.18f,
                            template.top + (float) Math.floor(template.height() * 0.40383f - 0.18f) + 0.68f);
                    Path fill31Path = CacheForCloudsPurple.fill31Path;
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
                    paint.setColor(avatarPurpleAlpha);
                    canvas.drawPath(fill31Path, paint);
                }
            }
        }
    }

    private static class CacheForCloudsRed {
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


    public static void drawCloudsRed(Canvas canvas, RectF frame) {
        // General Declarations
        Paint paint = CacheForCloudsRed.paint;

        // Local Colors
        int avatarRed = Color.argb(255, 255, 0, 0);
        int avatarRedAlpha = PaintCodeColor.colorByChangingAlpha(avatarRed, 128);

        // template
        {
            RectF template = CacheForCloudsRed.template;
            template.set(frame.left + (float) Math.floor(frame.width() * 0.12232f + 0.19f) + 0.31f,
                    frame.top + (float) Math.floor(frame.height() * 0.10515f - 0.42f) + 0.92f,
                    frame.left + (float) Math.floor(frame.width() * 0.79484f + 0.02f) + 0.48f,
                    frame.top + (float) Math.floor(frame.height() * 0.85661f + 0.21f) + 0.29f);

            // Group 2
            {
                RectF group2 = CacheForCloudsRed.group2;
                group2.set(template.left,
                        template.top,
                        template.left + (float) Math.floor(template.width() + 0.33f) + 0.17f,
                        template.top + (float) Math.floor(template.height() + 0.13f) + 0.37f);

                // Page-1
                {
                    RectF page1 = CacheForCloudsRed.page1;
                    page1.set(template.left,
                            template.top,
                            template.left + (float) Math.floor(template.width() + 0.33f) + 0.17f,
                            template.top + (float) Math.floor(template.height() + 0.13f) + 0.37f);

                    // Fill-15
                    RectF fill15Rect = CacheForCloudsRed.fill15Rect;
                    fill15Rect.set(template.left,
                            template.top + (float) Math.floor(template.height() * 0.41239f + 0.17f) + 0.33f,
                            template.left + (float) Math.floor(template.width() * 0.06682f - 0f) + 0.5f,
                            template.top + (float) Math.floor(template.height() * 0.61458f + 0.27f) + 0.23f);
                    Path fill15Path = CacheForCloudsRed.fill15Path;
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
                    paint.setColor(avatarRedAlpha);
                    canvas.drawPath(fill15Path, paint);

                    // Fill-17
                    RectF fill17Rect = CacheForCloudsRed.fill17Rect;
                    fill17Rect.set(template.left + (float) Math.floor(template.width() * 0.10671f + 0.13f) + 0.37f,
                            template.top + (float) Math.floor(template.height() * 0.75641f - 0.01f) + 0.51f,
                            template.left + (float) Math.floor(template.width() * 0.2363f - 0.18f) + 0.68f,
                            template.top + (float) Math.floor(template.height() * 0.88396f + 0.45f) + 0.05f);
                    Path fill17Path = CacheForCloudsRed.fill17Path;
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
                    paint.setColor(avatarRedAlpha);
                    canvas.drawPath(fill17Path, paint);

                    // Fill-19
                    RectF fill19Rect = CacheForCloudsRed.fill19Rect;
                    fill19Rect.set(template.left + (float) Math.floor(template.width() * 0.41356f + 0.3f) + 0.2f,
                            template.top,
                            template.left + (float) Math.floor(template.width() * 0.72f - 0.46f) + 0.96f,
                            template.top + (float) Math.floor(template.height() * 0.08948f + 0.29f) + 0.21f);
                    Path fill19Path = CacheForCloudsRed.fill19Path;
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
                    paint.setColor(avatarRedAlpha);
                    canvas.drawPath(fill19Path, paint);

                    // Fill-21
                    RectF fill21Rect = CacheForCloudsRed.fill21Rect;
                    fill21Rect.set(template.left + (float) Math.floor(template.width() * 0.83628f - 0.48f) + 0.98f,
                            template.top + (float) Math.floor(template.height() * 0.13482f - 0.44f) + 0.94f,
                            template.left + (float) Math.floor(template.width() * 1f + 0.33f) + 0.17f,
                            template.top + (float) Math.floor(template.height() * 0.28406f - 0.15f) + 0.65f);
                    Path fill21Path = CacheForCloudsRed.fill21Path;
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
                    paint.setColor(avatarRedAlpha);
                    canvas.drawPath(fill21Path, paint);

                    // Fill-27
                    RectF fill27Rect = CacheForCloudsRed.fill27Rect;
                    fill27Rect.set(template.left + (float) Math.floor(template.width() * 0.62489f - 0.08f) + 0.58f,
                            template.top + (float) Math.floor(template.height() * 0.0197f - 0.29f) + 0.79f,
                            template.left + (float) Math.floor(template.width() * 0.86767f + 0.12f) + 0.38f,
                            template.top + (float) Math.floor(template.height() * 0.09438f + 0.34f) + 0.16f);
                    Path fill27Path = CacheForCloudsRed.fill27Path;
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
                    paint.setColor(avatarRedAlpha);
                    canvas.drawPath(fill27Path, paint);

                    // Fill-29
                    RectF fill29Rect = CacheForCloudsRed.fill29Rect;
                    fill29Rect.set(template.left + (float) Math.floor(template.width() * 0.17266f - 0.23f) + 0.73f,
                            template.top + (float) Math.floor(template.height() * 0.81642f + 0.44f) + 0.06f,
                            template.left + (float) Math.floor(template.width() * 0.47788f + 0.23f) + 0.27f,
                            template.top + (float) Math.floor(template.height() * 1f + 0.13f) + 0.37f);
                    Path fill29Path = CacheForCloudsRed.fill29Path;
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
                    paint.setColor(avatarRedAlpha);
                    canvas.drawPath(fill29Path, paint);

                    // Fill-31
                    RectF fill31Rect = CacheForCloudsRed.fill31Rect;
                    fill31Rect.set(template.left + (float) Math.floor(template.width() * 0.05105f - 0.29f) + 0.79f,
                            template.top + (float) Math.floor(template.height() * 0.2513f + 0.16f) + 0.34f,
                            template.left + (float) Math.floor(template.width() * 0.15208f + 0.32f) + 0.18f,
                            template.top + (float) Math.floor(template.height() * 0.40383f - 0.18f) + 0.68f);
                    Path fill31Path = CacheForCloudsRed.fill31Path;
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
                    paint.setColor(avatarRedAlpha);
                    canvas.drawPath(fill31Path, paint);
                }
            }
        }
    }

    private static class CacheForCloudsYellow {
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


    public static void drawCloudsYellow(Canvas canvas, RectF frame) {
        // General Declarations
        Paint paint = CacheForCloudsYellow.paint;

        // Local Colors
        int avatarYellow = Color.argb(255, 239, 183, 6);
        int avatarYellowAlpha = PaintCodeColor.colorByChangingAlpha(avatarYellow, 128);

        // template
        {
            RectF template = CacheForCloudsYellow.template;
            template.set(frame.left + (float) Math.floor(frame.width() * 0.12232f + 0.19f) + 0.31f,
                    frame.top + (float) Math.floor(frame.height() * 0.10515f - 0.42f) + 0.92f,
                    frame.left + (float) Math.floor(frame.width() * 0.79484f + 0.02f) + 0.48f,
                    frame.top + (float) Math.floor(frame.height() * 0.85661f + 0.21f) + 0.29f);

            // Group 2
            {
                RectF group2 = CacheForCloudsYellow.group2;
                group2.set(template.left,
                        template.top,
                        template.left + (float) Math.floor(template.width() + 0.33f) + 0.17f,
                        template.top + (float) Math.floor(template.height() + 0.13f) + 0.37f);

                // Page-1
                {
                    RectF page1 = CacheForCloudsYellow.page1;
                    page1.set(template.left,
                            template.top,
                            template.left + (float) Math.floor(template.width() + 0.33f) + 0.17f,
                            template.top + (float) Math.floor(template.height() + 0.13f) + 0.37f);

                    // Fill-15
                    RectF fill15Rect = CacheForCloudsYellow.fill15Rect;
                    fill15Rect.set(template.left,
                            template.top + (float) Math.floor(template.height() * 0.41239f + 0.17f) + 0.33f,
                            template.left + (float) Math.floor(template.width() * 0.06682f - 0f) + 0.5f,
                            template.top + (float) Math.floor(template.height() * 0.61458f + 0.27f) + 0.23f);
                    Path fill15Path = CacheForCloudsYellow.fill15Path;
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
                    paint.setColor(avatarYellowAlpha);
                    canvas.drawPath(fill15Path, paint);

                    // Fill-17
                    RectF fill17Rect = CacheForCloudsYellow.fill17Rect;
                    fill17Rect.set(template.left + (float) Math.floor(template.width() * 0.10671f + 0.13f) + 0.37f,
                            template.top + (float) Math.floor(template.height() * 0.75641f - 0.01f) + 0.51f,
                            template.left + (float) Math.floor(template.width() * 0.2363f - 0.18f) + 0.68f,
                            template.top + (float) Math.floor(template.height() * 0.88396f + 0.45f) + 0.05f);
                    Path fill17Path = CacheForCloudsYellow.fill17Path;
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
                    paint.setColor(avatarYellowAlpha);
                    canvas.drawPath(fill17Path, paint);

                    // Fill-19
                    RectF fill19Rect = CacheForCloudsYellow.fill19Rect;
                    fill19Rect.set(template.left + (float) Math.floor(template.width() * 0.41356f + 0.3f) + 0.2f,
                            template.top,
                            template.left + (float) Math.floor(template.width() * 0.72f - 0.46f) + 0.96f,
                            template.top + (float) Math.floor(template.height() * 0.08948f + 0.29f) + 0.21f);
                    Path fill19Path = CacheForCloudsYellow.fill19Path;
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
                    paint.setColor(avatarYellowAlpha);
                    canvas.drawPath(fill19Path, paint);

                    // Fill-21
                    RectF fill21Rect = CacheForCloudsYellow.fill21Rect;
                    fill21Rect.set(template.left + (float) Math.floor(template.width() * 0.83628f - 0.48f) + 0.98f,
                            template.top + (float) Math.floor(template.height() * 0.13482f - 0.44f) + 0.94f,
                            template.left + (float) Math.floor(template.width() * 1f + 0.33f) + 0.17f,
                            template.top + (float) Math.floor(template.height() * 0.28406f - 0.15f) + 0.65f);
                    Path fill21Path = CacheForCloudsYellow.fill21Path;
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
                    paint.setColor(avatarYellowAlpha);
                    canvas.drawPath(fill21Path, paint);

                    // Fill-27
                    RectF fill27Rect = CacheForCloudsYellow.fill27Rect;
                    fill27Rect.set(template.left + (float) Math.floor(template.width() * 0.62489f - 0.08f) + 0.58f,
                            template.top + (float) Math.floor(template.height() * 0.0197f - 0.29f) + 0.79f,
                            template.left + (float) Math.floor(template.width() * 0.86767f + 0.12f) + 0.38f,
                            template.top + (float) Math.floor(template.height() * 0.09438f + 0.34f) + 0.16f);
                    Path fill27Path = CacheForCloudsYellow.fill27Path;
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
                    paint.setColor(avatarYellowAlpha);
                    canvas.drawPath(fill27Path, paint);

                    // Fill-29
                    RectF fill29Rect = CacheForCloudsYellow.fill29Rect;
                    fill29Rect.set(template.left + (float) Math.floor(template.width() * 0.17266f - 0.23f) + 0.73f,
                            template.top + (float) Math.floor(template.height() * 0.81642f + 0.44f) + 0.06f,
                            template.left + (float) Math.floor(template.width() * 0.47788f + 0.23f) + 0.27f,
                            template.top + (float) Math.floor(template.height() * 1f + 0.13f) + 0.37f);
                    Path fill29Path = CacheForCloudsYellow.fill29Path;
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
                    paint.setColor(avatarYellowAlpha);
                    canvas.drawPath(fill29Path, paint);

                    // Fill-31
                    RectF fill31Rect = CacheForCloudsYellow.fill31Rect;
                    fill31Rect.set(template.left + (float) Math.floor(template.width() * 0.05105f - 0.29f) + 0.79f,
                            template.top + (float) Math.floor(template.height() * 0.2513f + 0.16f) + 0.34f,
                            template.left + (float) Math.floor(template.width() * 0.15208f + 0.32f) + 0.18f,
                            template.top + (float) Math.floor(template.height() * 0.40383f - 0.18f) + 0.68f);
                    Path fill31Path = CacheForCloudsYellow.fill31Path;
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
                    paint.setColor(avatarYellowAlpha);
                    canvas.drawPath(fill31Path, paint);
                }
            }
        }
    }


    // Atmosphere

    private static class CacheForBlueAtmosphere {
        private static RectF symbolRect = new RectF();
        private static RectF symbol2Rect = new RectF();
    }


//    public static void drawBlueAtmosphere(Canvas canvas, RectF frame) {
//        // Symbol
//        RectF symbolRect = CacheForBlueAtmosphere.symbolRect;
//        symbolRect.set(frame.left,
//                frame.top,
//                frame.left + (float) Math.floor(frame.width() + 0.5f),
//                frame.top + (float) Math.floor(frame.height() + 0.5f));
//        canvas.save();
//        canvas.clipRect(symbolRect);
//        canvas.translate(symbolRect.left, symbolRect.top);
//        Atmosphere.drawCloudsBlue(canvas, new RectF(0f, 0f, symbolRect.width(), symbolRect.height()));
//        canvas.restore();
//
//        // Symbol 2
//        RectF symbol2Rect = CacheForBlueAtmosphere.symbol2Rect;
//        symbol2Rect.set(frame.left,
//                frame.top,
//                frame.left + (float) Math.floor(frame.width() + 0.5f),
//                frame.top + (float) Math.floor(frame.height() + 0.5f));
//        canvas.save();
//        canvas.clipRect(symbol2Rect);
//        canvas.translate(symbol2Rect.left, symbol2Rect.top);
//        Atmosphere.drawSmallPlanetsBlue(canvas, new RectF(0f, 0f, symbol2Rect.width(), symbol2Rect.height()));
//        canvas.restore();
//    }
//
//    private static class CacheForGreenAtmosphere {
//        private static RectF symbolRect = new RectF();
//        private static RectF symbolTargetRect = new RectF();
//        private static RectF symbol2Rect = new RectF();
//    }
//
//
//    public static void drawGreenAtmosphere(Canvas canvas, RectF frame) {
//        // Symbol
//        RectF symbolRect = CacheForGreenAtmosphere.symbolRect;
//        symbolRect.set(frame.left,
//                frame.top,
//                frame.left + (float) Math.floor(frame.width() + 0.5f),
//                frame.top + (float) Math.floor(frame.height() + 0.5f));
//        canvas.save();
//        canvas.clipRect(symbolRect);
//        canvas.translate(symbolRect.left, symbolRect.top);
//        RectF symbolTargetRect = CacheForGreenAtmosphere.symbolTargetRect;
//        symbolTargetRect.set(0f, 0f, symbolRect.width(), symbolRect.height());
//        Atmosphere.drawCloudsGreen(canvas, symbolTargetRect, ResizingBehavior.Stretch);
//        canvas.restore();
//
//        // Symbol 2
//        RectF symbol2Rect = CacheForGreenAtmosphere.symbol2Rect;
//        symbol2Rect.set(frame.left,
//                frame.top,
//                frame.left + (float) Math.floor(frame.width() + 0.5f),
//                frame.top + (float) Math.floor(frame.height() + 0.5f));
//        canvas.save();
//        canvas.clipRect(symbol2Rect);
//        canvas.translate(symbol2Rect.left, symbol2Rect.top);
//        Atmosphere.drawSmallPlanetsGreen(canvas, new RectF(0f, 0f, symbol2Rect.width(), symbol2Rect.height()));
//        canvas.restore();
//    }
//
//    private static class CacheForOrangeAtmosphere {
//        private static RectF symbolRect = new RectF();
//        private static RectF symbolTargetRect = new RectF();
//        private static RectF symbol2Rect = new RectF();
//    }
//
//
//    public static void drawOrangeAtmosphere(Canvas canvas, RectF frame) {
//        // Symbol
//        RectF symbolRect = CacheForOrangeAtmosphere.symbolRect;
//        symbolRect.set(frame.left,
//                frame.top,
//                frame.left + (float) Math.floor(frame.width() + 0.5f),
//                frame.top + (float) Math.floor(frame.height() + 0.5f));
//        canvas.save();
//        canvas.clipRect(symbolRect);
//        canvas.translate(symbolRect.left, symbolRect.top);
//        RectF symbolTargetRect = CacheForOrangeAtmosphere.symbolTargetRect;
//        symbolTargetRect.set(0f, 0f, symbolRect.width(), symbolRect.height());
//        Atmosphere.drawCloudsOrange(canvas, symbolTargetRect, ResizingBehavior.Stretch, new RectF(-88f, -37f, 168f,
// 219f));
//        canvas.restore();
//
//        // Symbol 2
//        RectF symbol2Rect = CacheForOrangeAtmosphere.symbol2Rect;
//        symbol2Rect.set(frame.left,
//                frame.top,
//                frame.left + (float) Math.floor(frame.width() + 0.5f),
//                frame.top + (float) Math.floor(frame.height() + 0.5f));
//        canvas.save();
//        canvas.clipRect(symbol2Rect);
//        canvas.translate(symbol2Rect.left, symbol2Rect.top);
//        Atmosphere.drawSmallPlanetsOrange(canvas, new RectF(0f, 0f, symbol2Rect.width(), symbol2Rect.height()));
//        canvas.restore();
//    }
//
//    private static class CacheForPurpleAtmosphere {
//        private static RectF symbolRect = new RectF();
//    }
//
//
//    public static void drawPurpleAtmosphere(Canvas canvas, RectF frame) {
//        // Symbol
//        RectF symbolRect = CacheForPurpleAtmosphere.symbolRect;
//        symbolRect.set(frame.left,
//                frame.top,
//                frame.left + (float) Math.floor(frame.width() + 0.5f),
//                frame.top + (float) Math.floor(frame.height() + 0.5f));
//        canvas.save();
//        canvas.clipRect(symbolRect);
//        canvas.translate(symbolRect.left, symbolRect.top);
//        Atmosphere.drawCloudsPurple(canvas, new RectF(0f, 0f, symbolRect.width(), symbolRect.height()));
//        canvas.restore();
//    }
//
//    private static class CacheForRedAtmosphere {
//        private static RectF symbolRect = new RectF();
//        private static RectF symbol2Rect = new RectF();
//        private static RectF symbol3Rect = new RectF();
//    }
//
//
//    public static void drawRedAtmosphere(Canvas canvas, RectF frame) {
//        // Symbol
//        RectF symbolRect = CacheForRedAtmosphere.symbolRect;
//        symbolRect.set(frame.left,
//                frame.top,
//                frame.left + (float) Math.floor(frame.width() + 0.5f),
//                frame.top + (float) Math.floor(frame.height() + 0.5f));
//        canvas.save();
//        canvas.clipRect(symbolRect);
//        canvas.translate(symbolRect.left, symbolRect.top);
//        Atmosphere.drawCloudsRed(canvas, new RectF(0f, 0f, symbolRect.width(), symbolRect.height()));
//        canvas.restore();
//
//        // Symbol 2
//        RectF symbol2Rect = CacheForRedAtmosphere.symbol2Rect;
//        symbol2Rect.set(frame.left,
//                frame.top,
//                frame.left + (float) Math.floor(frame.width() + 0.5f),
//                frame.top + (float) Math.floor(frame.height() + 0.5f));
//        canvas.save();
//        canvas.clipRect(symbol2Rect);
//        canvas.translate(symbol2Rect.left, symbol2Rect.top);
//        Atmosphere.drawSmallPlanetsRed(canvas, new RectF(0f, 0f, symbol2Rect.width(), symbol2Rect.height()));
//        canvas.restore();
//
//        // Symbol 3
//        RectF symbol3Rect = CacheForRedAtmosphere.symbol3Rect;
//        symbol3Rect.set(frame.left + (float) Math.floor(frame.width() * 0.87109f + 0.5f),
//                frame.top,
//                frame.left + (float) Math.floor(frame.width() * 1.87109f + 0.5f),
//                frame.top + (float) Math.floor(frame.height() + 0.5f));
//        canvas.save();
//        canvas.clipRect(symbol3Rect);
//        canvas.translate(symbol3Rect.left, symbol3Rect.top);
//        Atmosphere.drawSmallPlanetsPurple(canvas, new RectF(0f, 0f, symbol3Rect.width(), symbol3Rect.height()));
//        canvas.restore();
//    }
//
//    private static class CacheForYellowAtmosphere {
//        private static RectF symbolRect = new RectF();
//        private static RectF symbol2Rect = new RectF();
//    }
//
//
//    public static void drawYellowAtmosphere(Canvas canvas, RectF frame) {
//        // Symbol
//        RectF symbolRect = CacheForYellowAtmosphere.symbolRect;
//        symbolRect.set(frame.left,
//                frame.top,
//                frame.left + (float) Math.floor(frame.width() + 0.5f),
//                frame.top + (float) Math.floor(frame.height() + 0.5f));
//        canvas.save();
//        canvas.clipRect(symbolRect);
//        canvas.translate(symbolRect.left, symbolRect.top);
//        Atmosphere.drawCloudsYellow(canvas, new RectF(0f, 0f, symbolRect.width(), symbolRect.height()));
//        canvas.restore();
//
//        // Symbol 2
//        RectF symbol2Rect = CacheForYellowAtmosphere.symbol2Rect;
//        symbol2Rect.set(frame.left,
//                frame.top,
//                frame.left + (float) Math.floor(frame.width() + 0.5f),
//                frame.top + (float) Math.floor(frame.height() + 0.5f));
//        canvas.save();
//        canvas.clipRect(symbol2Rect);
//        canvas.translate(symbol2Rect.left, symbol2Rect.top);
//        Atmosphere.drawSmallPlanetsYellow(canvas, new RectF(0f, 0f, symbol2Rect.width(), symbol2Rect.height()));
//        canvas.restore();
//}


    // Canvas Images
    // Clouds

    public static Bitmap imageOfCloudsGray(PointF imageSize) {
        Bitmap imageOfCloudsGray = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfCloudsGray);
        Atmosphere.drawCloudsGray(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));

        return imageOfCloudsGray;
    }

    public static Bitmap imageOfCloudsBlue(PointF imageSize) {
        Bitmap imageOfCloudsBlue = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfCloudsBlue);
        Atmosphere.drawCloudsBlue(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));

        return imageOfCloudsBlue;
    }

    private static Bitmap imageOfCloudsGreen = null;

    public static Bitmap imageOfCloudsGreen() {
        if (imageOfCloudsGreen != null)
            return imageOfCloudsGreen;

        imageOfCloudsGreen = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfCloudsGreen);
        Atmosphere.drawCloudsGreen(canvas);

        return imageOfCloudsGreen;
    }

    public static Bitmap imageOfCloudsOrange(RectF frame2) {
        Bitmap imageOfCloudsOrange = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfCloudsOrange);
        Atmosphere.drawCloudsOrange(canvas, frame2);

        return imageOfCloudsOrange;
    }

    public static Bitmap imageOfCloudsPurple(PointF imageSize) {
        Bitmap imageOfCloudsPurple = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfCloudsPurple);
        Atmosphere.drawCloudsPurple(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));

        return imageOfCloudsPurple;
    }

    public static Bitmap imageOfCloudsRed(PointF imageSize) {
        Bitmap imageOfCloudsRed = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfCloudsRed);
        Atmosphere.drawCloudsRed(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));

        return imageOfCloudsRed;
    }

    public static Bitmap imageOfCloudsYellow(PointF imageSize) {
        Bitmap imageOfCloudsYellow = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfCloudsYellow);
        Atmosphere.drawCloudsYellow(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));

        return imageOfCloudsYellow;
    }

    // Moons


    // Atmosphere

//    public static Bitmap imageOfBlueAtmosphere(PointF imageSize) {
//        Bitmap imageOfBlueAtmosphere = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config
//                .ARGB_8888);
//        Canvas canvas = new Canvas(imageOfBlueAtmosphere);
//        Atmosphere.drawBlueAtmosphere(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
//
//        return imageOfBlueAtmosphere;
//    }
//
//    public static Bitmap imageOfGreenAtmosphere(PointF imageSize) {
//        Bitmap imageOfGreenAtmosphere = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config
//                .ARGB_8888);
//        Canvas canvas = new Canvas(imageOfGreenAtmosphere);
//        Atmosphere.drawGreenAtmosphere(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
//
//        return imageOfGreenAtmosphere;
//    }
//
//    public static Bitmap imageOfOrangeAtmosphere(PointF imageSize) {
//        Bitmap imageOfOrangeAtmosphere = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config
//                .ARGB_8888);
//        Canvas canvas = new Canvas(imageOfOrangeAtmosphere);
//        Atmosphere.drawOrangeAtmosphere(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
//
//        return imageOfOrangeAtmosphere;
//    }
//
//    public static Bitmap imageOfPurpleAtmosphere(PointF imageSize) {
//        Bitmap imageOfPurpleAtmosphere = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config
//                .ARGB_8888);
//        Canvas canvas = new Canvas(imageOfPurpleAtmosphere);
//        Atmosphere.drawPurpleAtmosphere(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
//
//        return imageOfPurpleAtmosphere;
//    }
//
//    public static Bitmap imageOfRedAtmosphere(PointF imageSize) {
//        Bitmap imageOfRedAtmosphere = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config
//                .ARGB_8888);
//        Canvas canvas = new Canvas(imageOfRedAtmosphere);
//        Atmosphere.drawRedAtmosphere(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
//
//        return imageOfRedAtmosphere;
//    }
//
//    public static Bitmap imageOfYellowAtmosphere(PointF imageSize) {
//        Bitmap imageOfYellowAtmosphere = Bitmap.createBitmap((int) imageSize.x, (int) imageSize.y, Bitmap.Config
//                .ARGB_8888);
//        Canvas canvas = new Canvas(imageOfYellowAtmosphere);
//        Atmosphere.drawYellowAtmosphere(canvas, new RectF(0f, 0f, imageSize.x, imageSize.y));
//
//        return imageOfYellowAtmosphere;
//    }


    // Resizing Behavior
    public static void resizingBehaviorApply(ResizingBehavior behavior, RectF rect, RectF target, RectF result) {
        if (rect.equals(target) || target == null) {
            result.set(rect);
            return;
        }

        if (behavior == ResizingBehavior.Stretch) {
            result.set(target);
            return;
        }

        float xRatio = Math.abs(target.width() / rect.width());
        float yRatio = Math.abs(target.height() / rect.height());
        float scale = 0f;

        switch (behavior) {
            case AspectFit: {
                scale = Math.min(xRatio, yRatio);
                break;
            }
            case AspectFill: {
                scale = Math.max(xRatio, yRatio);
                break;
            }
            case Center: {
                scale = 1f;
                break;
            }
        }

        float newWidth = Math.abs(rect.width() * scale);
        float newHeight = Math.abs(rect.height() * scale);
        result.set(0,
                0,
                target.centerX() + newWidth / 2,
                target.centerY() + newHeight / 2);
    }


}

