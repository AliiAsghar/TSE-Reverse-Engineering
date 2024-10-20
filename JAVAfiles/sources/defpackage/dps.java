package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dps {
    public final Object a;
    private final cas b;
    private final dps c;

    public dps(cas casVar, dps dpsVar) {
        this.b = casVar;
        this.c = dpsVar;
        this.a = casVar.a();
    }

    public final boolean a() {
        if (this.b.a() != this.a) {
            return true;
        }
        dps dpsVar = this.c;
        if (dpsVar != null && dpsVar.a()) {
            return true;
        }
        return false;
    }
}
