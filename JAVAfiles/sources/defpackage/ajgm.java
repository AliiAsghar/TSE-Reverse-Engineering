package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajgm {
    private static final int b = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    private final int c;
    private final int d;
    private final int e;
    private final float f;

    public ajgm(Context context) {
        boolean j = ajgk.j(context, R.attr.elevationOverlayEnabled, false);
        int e = ahnz.e(context, R.attr.elevationOverlayColor, 0);
        int e2 = ahnz.e(context, R.attr.elevationOverlayAccentColor, 0);
        int e3 = ahnz.e(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.a = j;
        this.c = e;
        this.d = e2;
        this.e = e3;
        this.f = f;
    }

    public final int a(int i, float f) {
        float f2;
        int i2;
        if (this.f > brg.a && f > brg.a) {
            f2 = Math.min(((((float) Math.log1p(f / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        } else {
            f2 = 0.0f;
        }
        int alpha = Color.alpha(i);
        int g = ahnz.g(eap.h(i, 255), this.c, f2);
        if (f2 > brg.a && (i2 = this.d) != 0) {
            g = eap.g(eap.h(i2, b), g);
        }
        return eap.h(g, alpha);
    }

    public final int b(int i, float f) {
        if (this.a && eap.h(i, 255) == this.e) {
            return a(i, f);
        }
        return i;
    }
}
