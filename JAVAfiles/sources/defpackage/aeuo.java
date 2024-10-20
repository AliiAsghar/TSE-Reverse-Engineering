package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeuo implements aeva {
    private final aeuz a;
    private final Long b;
    private final arml c;
    private final int d;

    public aeuo(arqg arqgVar, int i, aeuz aeuzVar, Long l) {
        this.d = i;
        this.a = aeuzVar;
        this.b = l;
        this.c = armd.b(2, arqgVar);
    }

    private final List d() {
        return (List) this.c.a();
    }

    @Override // defpackage.aeva
    public final aeuz a() {
        return this.a;
    }

    @Override // defpackage.aeva
    public final List b() {
        return d();
    }

    @Override // defpackage.aeva
    public final int c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aeuo) {
            aeuo aeuoVar = (aeuo) obj;
            if (this.d == aeuoVar.d && d.F(this.a, aeuoVar.a) && d.F(null, null) && d.F(null, null) && d.F(d(), aeuoVar.d()) && d.F(this.b, aeuoVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        a.bm(i);
        return (((((i * 31) + this.a.hashCode()) * 29791) + d().hashCode()) * 31) + this.b.hashCode();
    }
}
