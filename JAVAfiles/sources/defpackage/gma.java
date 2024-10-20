package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gma {
    public static final gmb a;
    static final Property b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new gmf();
        } else {
            a = new gme();
        }
        b = new gly(Float.class);
        new glz(Rect.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(View view) {
        return a.a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, int i, int i2, int i3, int i4) {
        a.b(view, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view, float f) {
        a.c(view, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(View view, int i) {
        a.d(view, i);
    }
}
