package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arxr extends arxp {
    private final arxw a;
    private final arxs b;
    private final arvu c;
    private final Object h;

    public arxr(arxw arxwVar, arxs arxsVar, arvu arvuVar, Object obj) {
        this.a = arxwVar;
        this.b = arxsVar;
        this.c = arvuVar;
        this.h = obj;
    }

    @Override // defpackage.arxp
    public final void a(Throwable th) {
        boolean z = arwh.a;
        arxw arxwVar = this.a;
        arxs arxsVar = this.b;
        arvu arvuVar = this.c;
        arvu K = arxwVar.K(arvuVar);
        Object obj = this.h;
        if (K == null || !arxwVar.U(arxsVar, K, obj)) {
            arxsVar.a.j(2);
            arvu K2 = arxwVar.K(arvuVar);
            if (K2 != null && arxwVar.U(arxsVar, K2, obj)) {
                return;
            }
            arxwVar.hl(arxwVar.E(arxsVar, obj));
        }
    }

    @Override // defpackage.arxp
    public final boolean b() {
        return false;
    }
}
