package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clv {
    @armg
    public static final Rect a(cjp cjpVar) {
        float f = cjpVar.e;
        float f2 = cjpVar.d;
        return new Rect((int) cjpVar.b, (int) cjpVar.c, (int) f2, (int) f);
    }

    public static final Rect b(drg drgVar) {
        return new Rect(drgVar.b, drgVar.c, drgVar.d, drgVar.e);
    }

    public static final RectF c(cjp cjpVar) {
        return new RectF(cjpVar.b, cjpVar.c, cjpVar.d, cjpVar.e);
    }

    public static final cjp d(Rect rect) {
        return new cjp(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final cjp e(RectF rectF) {
        return new cjp(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
