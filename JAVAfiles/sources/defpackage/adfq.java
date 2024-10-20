package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfq implements armf<adfp> {
    public adfp a;

    @Override // defpackage.armf, defpackage.arme
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final adfp b() {
        adfp adfpVar = this.a;
        if (adfpVar != null) {
            return adfpVar;
        }
        throw new IllegalStateException("Registration context not initialized!");
    }

    public final void c() {
        this.a = null;
    }
}
