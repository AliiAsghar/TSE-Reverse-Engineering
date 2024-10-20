package com.google.research.xeno.effect;

import android.util.Pair;
import com.google.mediapipe.framework.GraphGlSyncToken;
import com.google.mediapipe.framework.TextureReleaseCallback;
import defpackage.appn;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class Control {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static class BoolSetting extends appn {
        private BoolSetting(long j) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static class ColorSetting {
        private ColorSetting(long j) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static class DoubleSetting extends appn {
        private DoubleSetting(long j) {
            Control.nativeGetDoubleRange(j);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static class FloatSetting extends appn {
        private FloatSetting(long j) {
            Control.nativeGetFloatRange(j);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static class GpuBufferSetting {
        private GpuBufferSetting(long j) {
        }

        private static void releaseWithSyncToken(long j, TextureReleaseCallback textureReleaseCallback) {
            textureReleaseCallback.release(new GraphGlSyncToken(j));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static class IntSetting extends appn {
        private IntSetting(long j) {
            Control.nativeGetIntRange(j);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static class RuntimeOptionsSetting {
        private RuntimeOptionsSetting(long j) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static class StringSetting extends appn {
        private StringSetting(long j) {
        }
    }

    private Control(BoolSetting boolSetting, FloatSetting floatSetting, GpuBufferSetting gpuBufferSetting, IntSetting intSetting, RuntimeOptionsSetting runtimeOptionsSetting, StringSetting stringSetting, ColorSetting colorSetting, DoubleSetting doubleSetting) {
    }

    public static native Pair<Double, Double> nativeGetDoubleRange(long j);

    public static native Pair<Float, Float> nativeGetFloatRange(long j);

    public static native Pair<Integer, Integer> nativeGetIntRange(long j);
}
