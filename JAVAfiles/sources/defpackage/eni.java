package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eni implements arwe, enk {
    public final enh a;
    private final arpi b;

    public eni() {
        throw null;
    }

    @Override // defpackage.arwe
    public final arpi b() {
        return this.b;
    }

    @Override // defpackage.enk
    public final void dH(enm enmVar, enf enfVar) {
        if (this.a.a().compareTo(eng.DESTROYED) <= 0) {
            this.a.d(this);
            arwi.w(this.b, null);
        }
    }

    public eni(enh enhVar, arpi arpiVar) {
        arpiVar.getClass();
        this.a = enhVar;
        this.b = arpiVar;
        if (enhVar.a() == eng.DESTROYED) {
            arwi.w(arpiVar, null);
        }
    }
}
