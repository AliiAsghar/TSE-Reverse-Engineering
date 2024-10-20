package defpackage;

import android.graphics.PathMeasure;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckf implements clt {
    private final PathMeasure a;

    public ckf(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    @Override // defpackage.clt
    public final float a() {
        return this.a.getLength();
    }

    @Override // defpackage.clt
    public final void b(float f, float f2, clr clrVar) {
        if (clrVar instanceof cke) {
            this.a.getSegment(f, f2, ((cke) clrVar).a, true);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // defpackage.clt
    public final void c(clr clrVar) {
        this.a.setPath(((cke) clrVar).a, false);
    }
}
