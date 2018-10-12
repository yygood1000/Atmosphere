package com.yy.atmosphere.atmospheretest;

import android.graphics.Color;

/**
 * PaintCode 的颜色处理类
 */
class PaintCodeColor extends Color {
    /**
     * 对传入颜色添加透明度
     *
     * @param newAlpha 0-255
     */
    public static int colorByChangingAlpha(int color, int newAlpha) {
        return argb(newAlpha, red(color), green(color), blue(color));
    }
}
