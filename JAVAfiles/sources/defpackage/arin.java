package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arin extends ario {
    final /* synthetic */ arip a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arin(arip aripVar) {
        super(aripVar);
        this.a = aripVar;
        int i = armc.a;
    }

    @Override // defpackage.ario
    public final void a() {
        asqu asquVar = new asqu();
        int i = armc.a;
        synchronized (this.a.a) {
            asqu asquVar2 = this.a.b;
            asquVar.hq(asquVar2, asquVar2.b);
            this.a.e = false;
        }
        this.a.f.hq(asquVar, asquVar.b);
        this.a.f.flush();
    }
}
