package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class whr implements wve {
    final /* synthetic */ armf a;
    final /* synthetic */ armf b;
    final /* synthetic */ armf c;

    public whr(armf armfVar, armf armfVar2, armf armfVar3) {
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
    }

    @Override // defpackage.wve
    public final Optional a() {
        Optional map = ((vqu) this.a.b()).p().map(new vxg(vnk.k, 15));
        map.getClass();
        Object j = arsd.j(map, acun.a);
        j.getClass();
        Optional map2 = ((wwn) this.b.b()).h(wwm.a).map(new vxg(new kjs((acun) j, this.a, 15), 16));
        map2.getClass();
        return map2;
    }

    @Override // defpackage.wvd
    public final void c() {
        ((mbl) this.c.b()).c("Bugle.Rcs.CarrierTos.Data.Migration.Counts");
    }

    @Override // defpackage.wve
    public final void b() {
    }
}
