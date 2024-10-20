package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agiy implements agih {
    final /* synthetic */ agih a;
    final /* synthetic */ cpm b;
    final /* synthetic */ cez c;
    final /* synthetic */ agjj d;

    public agiy(agih agihVar, cpm cpmVar, cez cezVar, agjj agjjVar) {
        this.a = agihVar;
        this.b = cpmVar;
        this.c = cezVar;
        this.d = agjjVar;
    }

    @Override // defpackage.agih
    public final void a(boolean z, boolean z2, aggp aggpVar) {
        if (this.d instanceof agji) {
            this.b.a(0);
        }
        this.a.a(z, z2, aggpVar);
    }

    @Override // defpackage.agih
    public final void b() {
        this.a.b();
        this.b.a(0);
        this.c.clear();
    }

    @Override // defpackage.agih
    public final void c() {
        if (this.d instanceof agji) {
            this.b.a(0);
        }
        this.a.c();
    }

    @Override // defpackage.agih
    public final void d(aggp aggpVar) {
        if (this.d instanceof agji) {
            this.b.a(0);
        }
        this.a.d(aggpVar);
    }
}
