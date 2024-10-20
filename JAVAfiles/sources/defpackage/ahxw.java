package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahxw implements apxw {
    private final armf a;
    private final /* synthetic */ int b;

    public ahxw(armf armfVar, int i) {
        this.b = i;
        this.a = armfVar;
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return new ahof();
                }
                return new ahnz((int[]) null);
            }
            return new ahxe(null);
        }
        return new adef((adze) this.a.b());
    }
}
