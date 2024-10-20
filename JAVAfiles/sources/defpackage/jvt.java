package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvt implements agih {
    final /* synthetic */ agip a;
    final /* synthetic */ jvw b;
    private final /* synthetic */ agih c;

    public jvt(agip agipVar, jvw jvwVar) {
        this.a = agipVar;
        this.b = jvwVar;
        this.c = agipVar.c;
    }

    @Override // defpackage.agih
    public final void a(boolean z, boolean z2, aggp aggpVar) {
        this.a.c.a(z, z2, aggpVar);
        if (!z && z2) {
            this.b.c();
        }
    }

    @Override // defpackage.agih
    public final void b() {
        this.c.b();
    }

    @Override // defpackage.agih
    public final void c() {
        this.c.c();
    }

    @Override // defpackage.agih
    public final void d(aggp aggpVar) {
        this.a.c.d(aggpVar);
        this.b.c();
    }
}
