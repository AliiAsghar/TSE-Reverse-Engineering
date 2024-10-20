package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwh implements aijy {
    private final /* synthetic */ int a;
    private final Object b;

    public adwh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.aijy
    public final void a(aiom aiomVar) {
        if (this.a != 0) {
            String ag = albo.ag(aiomVar.a.i());
            ?? r1 = this.b;
            boolean s = aiomVar.a.s();
            if (r1.contains(ag) && s) {
                aiomVar.t("Session-Expires");
                aiomVar.t("Min-SE");
                return;
            }
            return;
        }
        if (!aiomVar.v(((aimh) this.b).c)) {
            aiomVar.q((aimh) this.b);
        }
    }
}
