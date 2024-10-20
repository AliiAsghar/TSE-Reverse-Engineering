package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kam {
    public final miz a;
    public final miz b;
    public final miz c;
    public final xnv d;
    public final arml e;
    public final hmk f;
    private final arml g;
    private final arml h;

    public kam(miz mizVar, miz mizVar2, miz mizVar3, hmk hmkVar, xnv xnvVar) {
        mizVar.getClass();
        xnvVar.getClass();
        this.a = mizVar;
        this.b = mizVar2;
        this.c = mizVar3;
        this.f = hmkVar;
        this.d = xnvVar;
        this.g = armd.a(new kav(this, 1));
        this.e = armd.a(new jyb(this, 19));
        this.h = armd.a(new jyb(this, 20));
    }

    public final aeuh a() {
        return (aeuh) this.g.a();
    }

    public final boolean b() {
        return ((Boolean) this.h.a()).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kam) {
            kam kamVar = (kam) obj;
            if (d.F(this.a, kamVar.a) && a() == kamVar.a()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a().hashCode();
    }
}
