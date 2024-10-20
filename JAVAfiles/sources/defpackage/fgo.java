package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fgo extends fgk {
    public static final Object c = new Object();
    public final Object d;
    private final Object e;

    public fgo(erz erzVar, Object obj, Object obj2) {
        super(erzVar);
        this.e = obj;
        this.d = obj2;
    }

    public static fgo s(ere ereVar) {
        return new fgo(new fgp(ereVar), ery.a, c);
    }

    @Override // defpackage.fgk, defpackage.erz
    public final int a(Object obj) {
        Object obj2;
        if (c.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.a(obj);
    }

    @Override // defpackage.fgk, defpackage.erz
    public final erx d(int i, erx erxVar, boolean z) {
        this.b.d(i, erxVar, z);
        if (Objects.equals(erxVar.b, this.d) && z) {
            erxVar.b = c;
        }
        return erxVar;
    }

    @Override // defpackage.fgk, defpackage.erz
    public final ery e(int i, ery eryVar, long j) {
        this.b.e(i, eryVar, j);
        if (Objects.equals(eryVar.b, this.e)) {
            eryVar.b = ery.a;
        }
        return eryVar;
    }

    @Override // defpackage.fgk, defpackage.erz
    public final Object f(int i) {
        Object f = this.b.f(i);
        if (Objects.equals(f, this.d)) {
            return c;
        }
        return f;
    }

    public final fgo r(erz erzVar) {
        return new fgo(erzVar, this.e, this.d);
    }
}
