package com.yy.atmosphere.atmospheretest;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

import android.view.View;


/**
 * 星球大气层控件
 */
public class AtmosphereView extends View {
    public static final int COLOR_INDEX_GRAY = -1;
    public static final int COLOR_INDEX_GREEN = 0;
    public static final int COLOR_INDEX_BLUE = 1;
    public static final int COLOR_INDEX_PURPLE = 2;
    public static final int COLOR_INDEX_RED = 3;
    public static final int COLOR_INDEX_ORANGE = 4;
    public static final int COLOR_INDEX_YELLOW = 5;

    private int mViewWidth;
    private int mViewHeight;

    /**
     * 大气层 宽高参考值
     */
    private float mPlanetDefaultVal;

//    /**
//     * 星球及大气层View尺寸值 默认为 256dp
//     */
//    private float mPlanetSizeVal = dip2px(256);

    /**
     * 大气层View默认尺寸 默认为 256dp * 256dp
     */
    private RectF mAtmosphereRectF;

    /**
     * 是否绘制云朵
     */
    private boolean isDrawCloud = true;

    /**
     * 颜色标记，默认 0 = 灰色
     */
    private int mPlanetColor = COLOR_INDEX_GRAY;

    public AtmosphereView(Context context) {
        super(context);
        init(null, 0);
    }

    public AtmosphereView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public AtmosphereView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs,
                R.styleable.AtmosphereView);

        // 设置选中item的背景色
        if (typedArray.hasValue(R.styleable.AtmosphereView_planet_color)) {
            setPlanetColor(typedArray.getInt(R.styleable.AtmosphereView_planet_color, -1));
        }

        typedArray.recycle();

        mPlanetDefaultVal = dip2px(256f);

        mAtmosphereRectF = new RectF(0, 0, mPlanetDefaultVal, mPlanetDefaultVal);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mViewWidth = getMeasuredWidth();
        mViewHeight = getMeasuredHeight();

        // 当父控件尺寸小于默认值是，需要对应的缩小绘制的尺寸
        if (mViewWidth < mPlanetDefaultVal || mViewHeight < mPlanetDefaultVal) {
            shrinkSizeVal();
        }
//        else if (mViewWidth > mPlanetDefaultVal || mViewHeight > mPlanetDefaultVal) {
//            resetRectCenter();
//        }
    }

    /**
     * 缩控件的实际绘制尺寸
     */
    private void shrinkSizeVal() {
        float ratio = mViewWidth / mPlanetDefaultVal;

        float actualVal = mPlanetDefaultVal * ratio;
        mAtmosphereRectF.set(0, 0, actualVal, actualVal);

        postInvalidate();
    }

    /**
     * TODO 当设置wrap时，居中 星球，大气层，表情的实际绘制位置
     */
    private void resetRectCenter() {
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawAtmosphere(canvas);
    }

    /**
     * 绘制大气层
     */
    private void drawAtmosphere(Canvas canvas) {
        switch (mPlanetColor) {
            case COLOR_INDEX_GRAY:
                Moons.drawSmallPlanetsGray(canvas, mAtmosphereRectF);
                Orbit.drawOrbitGray(canvas, mAtmosphereRectF);
                Clouds.drawCloudsGray(canvas, mAtmosphereRectF);
                break;
            case COLOR_INDEX_GREEN:
                Moons.drawSmallPlanetsGreen(canvas, mAtmosphereRectF);
                Orbit.drawOrbitGreen(canvas, mAtmosphereRectF);
                Clouds.drawCloudsGreen(canvas, mAtmosphereRectF);
//                Atmosphere.drawCloudsGreen(canvas, new RectF(-88f, -37f, 168f, 219f), Atmosphere.ResizingBehavior.AspectFit);
//                    Atmosphere.drawCloudsGreen(canvas, mAtmosphereRectF, Atmosphere.ResizingBehavior.Stretch, new RectF(-88f, -37f, 168f, 219f));
                break;
            case COLOR_INDEX_BLUE:
                Moons.drawSmallPlanetsBlue(canvas, mAtmosphereRectF);
                Orbit.drawOrbitBlue(canvas, mAtmosphereRectF);
                Clouds.drawCloudsBlue(canvas, mAtmosphereRectF);
                break;
            case COLOR_INDEX_PURPLE:
                Moons.drawSmallPlanetsPurple(canvas, mAtmosphereRectF);
                Orbit.drawOrbitPurple(canvas, mAtmosphereRectF);
                Clouds.drawCloudsPurple(canvas, mAtmosphereRectF);
                break;
            case COLOR_INDEX_RED:
                Moons.drawSmallPlanetsRed(canvas, mAtmosphereRectF);
                Orbit.drawOrbitRed(canvas, mAtmosphereRectF);
                Clouds.drawCloudsRed(canvas, mAtmosphereRectF);
                break;
            case COLOR_INDEX_ORANGE:
                Moons.drawSmallPlanetsOrange(canvas, mAtmosphereRectF);
                Orbit.drawOrbitOrange(canvas, mAtmosphereRectF);
                Clouds.drawCloudsOrange(canvas, mAtmosphereRectF);
//                    Atmosphere.drawCloudsOrange(canvas, mAtmosphereRectF, Atmosphere
//                            .ResizingBehavior.Stretch, new RectF(-88f, -37f, 168f, 219f));
                break;
            case COLOR_INDEX_YELLOW:
                Moons.drawSmallPlanetsYellow(canvas, mAtmosphereRectF);
                Orbit.drawOrbitYellow(canvas, mAtmosphereRectF);
                Clouds.drawCloudsYellow(canvas, mAtmosphereRectF);
                break;
        }
    }

    /**
     * 设置星球颜色
     */
    public void setPlanetColor(int planetColor) {
        mPlanetColor = planetColor;
        postInvalidate();
    }

    /**
     * 设置星球颜色
     *
     * @param planetColor 颜色的字符串id
     */
    public void setPlanetColor(String planetColor) {
        if (TextUtils.isEmpty(planetColor)) {
            setPlanetColor(COLOR_INDEX_GREEN);
            return;
        }

        switch (planetColor) {
            case "green":
                setPlanetColor(COLOR_INDEX_GREEN);
                break;
            case "blue":
                setPlanetColor(COLOR_INDEX_BLUE);
                break;
            case "purple":
                setPlanetColor(COLOR_INDEX_PURPLE);
                break;
            case "red":
                setPlanetColor(COLOR_INDEX_RED);
                break;
            case "orange":
                setPlanetColor(COLOR_INDEX_ORANGE);
                break;
            case "yellow":
                setPlanetColor(COLOR_INDEX_YELLOW);
                break;
        }
        postInvalidate();
    }

    public float dip2px(float dipVlue) {
        DisplayMetrics metrics = getContext().getResources().getDisplayMetrics();
        float sDensity = metrics.density;
        return (dipVlue * sDensity + 0.5F);
    }

    // 调整行为
    public enum ResizingBehavior {
        AspectFit, //!< The content is proportionally resized to fit into the targetFrame rectangle.
        AspectFill, //!< The content is proportionally resized to completely fill the targetFrame rectangle.
        Stretch, //!< The content is stretched to match the entire targetFrame rectangle.
        Center, //!< The content is centered in the targetFrame rectangle, but it is NOT resized.
    }

    /**
     * TODO 调整行为,代码解析
     *
     * @param behavior      调整行为
     * @param originalFrame 原始帧 ：new RectF(0f, 0f, 256f, 256f)
     * @param targetFrame   目标帧
     * @param resizedFrame  变更后的尺寸
     *                      示例：
     *                      canvas.save();
     *                      RectF resizedFrame =  new RectF();
     *                      Atmosphere.resizingBehaviorApply(resizing, new RectF(0f, 0f, 256f, 256f), targetFrame, resizedFrame);
     *                      canvas.translate(resizedFrame.left, resizedFrame.top);
     *                      canvas.scale(resizedFrame.width() / 256f, resizedFrame.height() / 256f);
     */
    public static void resizingBehaviorApply(ResizingBehavior behavior, RectF originalFrame, RectF targetFrame, RectF resizedFrame) {
        if (originalFrame.equals(targetFrame) || targetFrame == null) {
            resizedFrame.set(originalFrame);
            return;
        }

        // 内容被拉伸以匹配整个目标矩形。
        if (behavior == ResizingBehavior.Stretch) {
            resizedFrame.set(targetFrame);
            return;
        }

        float xRatio = Math.abs(targetFrame.width() / originalFrame.width());
        float yRatio = Math.abs(targetFrame.height() / originalFrame.height());
        float scale = 0f;

        switch (behavior) {
            // 内容按比例调整以适应目标矩形。
            case AspectFit: {
                scale = Math.min(xRatio, yRatio);
                break;
            }
            // 内容按比例调整，以完全填充目标矩形。
            case AspectFill: {
                scale = Math.max(xRatio, yRatio);
                break;
            }
            // 内容以目标矩形为中心，但它没有调整。
            case Center: {
                scale = 1f;
                break;
            }
        }

        float newWidth = Math.abs(originalFrame.width() * scale);
        float newHeight = Math.abs(originalFrame.height() * scale);
        resizedFrame.set(0,
                0,
                targetFrame.centerX() + newWidth / 2,
                targetFrame.centerY() + newHeight / 2);
    }
}
