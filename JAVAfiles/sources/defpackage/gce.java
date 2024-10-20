package defpackage;

import java.util.Objects;

/* compiled from: PG */
@armg
/* loaded from: classes.dex */
public abstract class gce extends fzz {
    public gce() {
        super(2);
    }

    @Override // defpackage.fzz
    public final Object a(Object obj) {
        throw new IllegalStateException("Cannot get key by item in pageKeyedDataSource");
    }

    @Override // defpackage.fzz
    public final Object c(hkr hkrVar, arpe arpeVar) {
        Object obj = hkrVar.d;
        if (obj != gbb.REFRESH) {
            if (hkrVar.c != null) {
                if (obj != gbb.PREPEND) {
                    if (obj == gbb.APPEND) {
                        arvp arvpVar = new arvp(arhi.i(arpeVar), 1);
                        arvpVar.A();
                        e(new qdq(arvpVar, null));
                        return arvpVar.l();
                    }
                    Object obj2 = hkrVar.d;
                    Objects.toString(obj2);
                    throw new IllegalArgumentException("Unsupported type ".concat(obj2.toString()));
                }
                arvp arvpVar2 = new arvp(arhi.i(arpeVar), 1);
                arvpVar2.A();
                f(new qdq(arvpVar2, null));
                return arvpVar2.l();
            }
            return new fzx(arnv.a, null, null, 0, 0);
        }
        arvp arvpVar3 = new arvp(arhi.i(arpeVar), 1);
        arvpVar3.A();
        d(new qdq(arvpVar3, null));
        return arvpVar3.l();
    }

    public abstract void d(qdq qdqVar);

    public abstract void e(qdq qdqVar);

    public abstract void f(qdq qdqVar);
}
