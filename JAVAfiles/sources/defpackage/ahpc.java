package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahpc implements ahlj {
    final /* synthetic */ aneo a;
    public final /* synthetic */ ahpe b;

    public ahpc(ahpe ahpeVar, aneo aneoVar) {
        this.a = aneoVar;
        this.b = ahpeVar;
    }

    @Override // defpackage.ahlj
    public final void i(ahka ahkaVar) {
        this.b.d.a(3, ahkaVar.a);
        this.b.a();
        this.b.f = this.a.schedule(new ahnu(this, ahkaVar, 3), 10L, TimeUnit.SECONDS);
    }

    @Override // defpackage.ahlj
    public final void j(ahka ahkaVar) {
        this.b.d.a(4, ahkaVar.a);
        this.b.a();
        this.b.e = this.a.schedule(new ahnu(this, ahkaVar, 4), 10L, TimeUnit.SECONDS);
    }
}
