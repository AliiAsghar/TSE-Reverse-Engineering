package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yje {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/palette/PaletteUtil");
    public final Context b;
    public final armf c;
    public final TypedArray[] d;
    public final TypedArray[] e;
    public final int f;
    public final int g;
    public final yyb h;
    private final int i;

    public yje(Context context, yyb yybVar, armf armfVar) {
        TypedArray[] typedArrayArr = new TypedArray[3];
        this.d = typedArrayArr;
        TypedArray[] typedArrayArr2 = new TypedArray[3];
        this.e = typedArrayArr2;
        this.b = context;
        this.h = yybVar;
        this.c = armfVar;
        Resources resources = context.getResources();
        if (((Boolean) yjd.a.e()).booleanValue()) {
            typedArrayArr[0] = resources.obtainTypedArray(R.array.oneplus_tile_colors);
            typedArrayArr2[0] = resources.obtainTypedArray(R.array.oneplus_dark_tile_colors);
            context.getColor(R.color.oneplus_dark_avatar_letter_color);
        } else {
            typedArrayArr[0] = resources.obtainTypedArray(R.array.tile_colors_m2);
            typedArrayArr2[0] = resources.obtainTypedArray(R.array.dark_tile_colors_m2);
            context.getColor(R.color.dark_avatar_letter_color);
        }
        typedArrayArr[2] = resources.obtainTypedArray(R.array.sender_text_colors_m2);
        typedArrayArr2[2] = resources.obtainTypedArray(R.array.dark_sender_text_colors_m2);
        typedArrayArr[1] = resources.obtainTypedArray(R.array.customized_letter_tile_colors);
        typedArrayArr2[1] = resources.obtainTypedArray(R.array.customized_letter_tile_colors_dark);
        this.f = context.getColor(R.color.google_blue600);
        context.getColor(R.color.google_blue500);
        this.g = context.getColor(R.color.google_white);
        for (int i = 0; i < 3; i++) {
            xyl.a(this.d[i].length(), this.e[i].length());
        }
        this.i = this.d[0].getColor(0, 0);
        this.e[0].getColor(0, 0);
    }

    public static float a(int i) {
        float f;
        int i2 = (i >> 16) & 255;
        int i3 = (i >> 8) & 255;
        int i4 = i & 255;
        int max = Math.max(i4, Math.max(i2, i3));
        int min = Math.min(i4, Math.min(i2, i3));
        if (max == min) {
            return brg.a;
        }
        int i5 = max - i2;
        float f2 = max - min;
        float f3 = (max - i4) / f2;
        float f4 = (max - i3) / f2;
        if (i2 == max) {
            f = f3 - f4;
        } else {
            float f5 = i5 / f2;
            if (i3 == max) {
                f = (f5 + 2.0f) - f3;
            } else {
                f = (f4 + 4.0f) - f5;
            }
        }
        float f6 = f / 6.0f;
        if (f6 < brg.a) {
            return f6 + 1.0f;
        }
        return f6;
    }

    public static String e(int i) {
        return Integer.toHexString(i & 16777215);
    }

    public final int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return Math.abs(str.hashCode() % this.d[0].length());
    }

    public final xzg c() {
        return new xzg(this.i);
    }

    public final xzg d(String str) {
        TypedArray[] typedArrayArr = this.d;
        int b = b(str);
        int color = typedArrayArr[0].getColor(b, 0);
        this.e[0].getColor(b, 0);
        return new xzg(color);
    }

    public final int f(String str) {
        TypedArray[] typedArrayArr = this.d;
        return typedArrayArr[0].getColor(b(str), 0);
    }
}
