package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgp extends erz {
    private final ere b;

    public fgp(ere ereVar) {
        this.b = ereVar;
    }

    @Override // defpackage.erz
    public final int a(Object obj) {
        if (obj == fgo.c) {
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
        Integer num;
        Object obj = null;
        if (z) {
            num = 0;
        } else {
            num = null;
        }
        if (z) {
            obj = fgo.c;
        }
        erxVar.k(num, obj, 0, -9223372036854775807L, 0L, epy.a, true);
        return erxVar;
    }

    @Override // defpackage.erz
    public final ery e(int i, ery eryVar, long j) {
        eryVar.d(ery.a, this.b, false, true, null, -9223372036854775807L);
        eryVar.k = true;
        return eryVar;
    }

    @Override // defpackage.erz
    public final Object f(int i) {
        return fgo.c;
    }
}
