package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akro {
    public final int a;
    public final int b;
    public final int c;
    public final Object d;

    public akro(akrp akrpVar, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = akrpVar;
    }

    public static /* synthetic */ int c(akro akroVar) {
        if (agkx.l((Context) akroVar.d).x < akroVar.a) {
            return agkx.l((Context) akroVar.d).x;
        }
        int dimensionPixelSize = ((Context) akroVar.d).getResources().getDimensionPixelSize(R.dimen.hats_lib_prompt_max_width);
        int a = akroVar.a();
        return dimensionPixelSize + a + a;
    }

    private final String d(int i) {
        return Formatter.formatFileSize((Context) this.d, i);
    }

    public final int a() {
        return ((Context) this.d).getResources().getDimensionPixelOffset(R.dimen.hats_lib_container_large_padding);
    }

    public final RectF b(boolean z) {
        float f;
        float f2;
        float f3;
        int dimensionPixelOffset = ((Context) this.d).getResources().getDimensionPixelOffset(R.dimen.hats_lib_container_small_padding);
        int a = a();
        float f4 = brg.a;
        if (z) {
            f3 = dimensionPixelOffset;
            f = 0.0f;
            f2 = 0.0f;
        } else {
            int i = agkx.l((Context) this.d).x;
            if (i >= this.b) {
                f4 = dimensionPixelOffset;
            }
            f = f4;
            if (i >= this.c) {
                f = a;
                f2 = f4;
                f4 = f;
                f3 = f;
            } else {
                f2 = f4;
                f3 = f;
                f4 = f;
            }
        }
        return new RectF(f4, f3, f, f2);
    }

    public akro(String str, int i, int i2) {
        this.d = str;
        this.b = i;
        this.c = i2;
        this.a = -1;
    }

    public akro(String str, int i, int i2, int i3) {
        this.d = str;
        this.b = i;
        this.c = i2;
        this.a = i3;
    }

    public akro(hqw hqwVar) {
        this.d = hqwVar.a;
        int i = true != hqwVar.b.isLowRamDevice() ? 4194304 : 2097152;
        this.b = i;
        int round = Math.round(r2.getMemoryClass() * 1048576 * (true != hqwVar.b.isLowRamDevice() ? 0.4f : 0.33f));
        float f = ((DisplayMetrics) hqwVar.d.a).widthPixels * ((DisplayMetrics) hqwVar.d.a).heightPixels * 4;
        int round2 = Math.round(hqwVar.c * f);
        int round3 = Math.round(f + f);
        int i2 = round - i;
        int i3 = round3 + round2;
        if (i3 <= i2) {
            this.a = round3;
            this.c = round2;
        } else {
            float f2 = i2 / (hqwVar.c + 2.0f);
            this.a = Math.round(f2 + f2);
            this.c = Math.round(f2 * hqwVar.c);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            String d = d(this.a);
            String d2 = d(this.c);
            String d3 = d(i);
            boolean z = i3 > round;
            Log.d("MemorySizeCalculator", "Calculation complete, Calculated memory cache size: " + d + ", pool size: " + d2 + ", byte array size: " + d3 + ", memory class limited? " + z + ", max size: " + d(round) + ", memoryClass: " + hqwVar.b.getMemoryClass() + ", isLowMemoryDevice: " + hqwVar.b.isLowRamDevice());
        }
    }

    public akro(Context context) {
        this.d = context;
        this.b = context.getResources().getDimensionPixelSize(R.dimen.screen_width_360);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.screen_width_411);
        this.a = context.getResources().getDimensionPixelSize(R.dimen.screen_width_480);
    }
}
