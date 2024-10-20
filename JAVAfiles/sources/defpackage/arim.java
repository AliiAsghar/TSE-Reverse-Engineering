package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arim extends ario {
    final /* synthetic */ arip a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arim(arip aripVar) {
        super(aripVar);
        this.a = aripVar;
        int i = armc.a;
    }

    @Override // defpackage.ario
    public final void a() {
        int i;
        asqu asquVar = new asqu();
        int i2 = armc.a;
        synchronized (this.a.a) {
            asqu asquVar2 = this.a.b;
            asquVar.hq(asquVar2, asquVar2.h());
            arip aripVar = this.a;
            aripVar.d = false;
            i = aripVar.i;
        }
        this.a.f.hq(asquVar, asquVar.b);
        synchronized (this.a.a) {
            this.a.i -= i;
        }
    }
}
