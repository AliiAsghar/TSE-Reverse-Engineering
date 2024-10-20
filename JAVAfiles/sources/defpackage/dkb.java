package defpackage;

import android.text.SegmentFinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkb extends SegmentFinder {
    final /* synthetic */ dkf a;

    public dkb(dkf dkfVar) {
        this.a = dkfVar;
    }

    public final int nextEndBoundary(int i) {
        return this.a.b(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.c(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.e(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.f(i);
    }
}
