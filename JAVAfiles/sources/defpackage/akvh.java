package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akvh implements oy {
    final /* synthetic */ oy a;
    final /* synthetic */ String b = "searchViewTAG";
    final /* synthetic */ akmy c;

    public akvh(akmy akmyVar, oy oyVar) {
        this.a = oyVar;
        this.c = akmyVar;
    }

    @Override // defpackage.oy
    public final boolean a(String str) {
        if (!akqj.u()) {
            akmy akmyVar = this.c;
            ((aksr) akmyVar.a).b(this.b).close();
            return false;
        }
        return false;
    }

    @Override // defpackage.oy
    public final void b(String str) {
        if (akqj.u()) {
            this.a.b(str);
            return;
        }
        akmy akmyVar = this.c;
        akrc b = ((aksr) akmyVar.a).b(this.b);
        try {
            this.a.b(str);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
