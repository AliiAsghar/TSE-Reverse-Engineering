package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class km {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static km b;
    private or c;

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter b2;
        synchronized (km.class) {
            b2 = or.b(i, mode);
        }
        return b2;
    }

    public static synchronized km d() {
        km kmVar;
        synchronized (km.class) {
            if (b == null) {
                f();
            }
            kmVar = b;
        }
        return kmVar;
    }

    public static synchronized void f() {
        synchronized (km.class) {
            if (b == null) {
                km kmVar = new km();
                b = kmVar;
                kmVar.c = or.e();
                b.c.h(new gbl());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized ColorStateList a(Context context, int i) {
        return this.c.a(context, i);
    }

    public final synchronized Drawable c(Context context, int i) {
        return this.c.c(context, i);
    }

    public final synchronized void e(Context context) {
        this.c.f(context);
    }

    public final synchronized Drawable g(Context context, int i) {
        return this.c.d(context, i, true);
    }
}
