package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhy extends erz {
    private static final Object b = new Object();
    private final long c;
    private final long d;
    private final boolean e;
    private final ere f;
    private final era g;

    static {
        equ equVar = new equ();
        equVar.a = "SinglePeriodTimeline";
        equVar.b = Uri.EMPTY;
        equVar.a();
    }

    public fhy(long j, boolean z, boolean z2, ere ereVar) {
        era eraVar;
        if (z2) {
            eraVar = ereVar.c;
        } else {
            eraVar = null;
        }
        this.c = j;
        this.d = j;
        this.e = z;
        dzg.g(ereVar);
        this.f = ereVar;
        this.g = eraVar;
    }

    @Override // defpackage.erz
    public final int a(Object obj) {
        if (b.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // defpackage.erz
    public final int b() {
        return 1;
    }

    @Override // defpackage.erz
    public final int c() {
        return 1;
    }

    @Override // defpackage.erz
    public final erx d(int i, erx erxVar, boolean z) {
        Object obj;
        dzg.f(i, 1);
        if (z) {
            obj = b;
        } else {
            obj = null;
        }
        erxVar.m(null, obj, this.c, 0L);
        return erxVar;
    }

    @Override // defpackage.erz
    public final ery e(int i, ery eryVar, long j) {
        dzg.f(i, 1);
        eryVar.d(ery.a, this.f, this.e, false, this.g, this.d);
        return eryVar;
    }

    @Override // defpackage.erz
    public final Object f(int i) {
        dzg.f(i, 1);
        return b;
    }
}
