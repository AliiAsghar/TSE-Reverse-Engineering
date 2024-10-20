package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxc implements lqv {
    public final Optional a;
    public lqx b;
    private final cg c;
    private final armf d;
    private final arwe e;
    private final armf f;
    private final armf g;

    public kxc(cg cgVar, armf armfVar, arwe arweVar, Optional optional, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        arweVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.c = cgVar;
        this.d = armfVar;
        this.e = arweVar;
        this.a = optional;
        this.f = armfVar2;
        this.g = armfVar3;
    }

    @Override // defpackage.lqv
    public final /* synthetic */ int a() {
        return lgb.s();
    }

    @Override // defpackage.lqv
    public final akul b() {
        akul c;
        c = qjh.c(this.e, arpj.a, arwf.a, new kbl(this, (arpe) null, 16));
        return c;
    }

    @Override // defpackage.lqv
    public final void c(lqx lqxVar, ViewGroup viewGroup) {
        viewGroup.getClass();
        this.b = lqxVar;
    }

    @Override // defpackage.lqv
    public final void d() {
        throw null;
    }

    public final void e() {
        qjh.c(this.e, arpj.a, arwf.a, new jsu(this, (arpe) null, 19));
    }

    @Override // defpackage.lqv
    public final boolean f(Context context, ViewGroup viewGroup, boolean z) {
        if (z) {
            return false;
        }
        if (((pfq) this.g.b()).a()) {
            ((mbl) this.f.b()).e("Bugle.HomeScreen.PopupHost.Show", 18);
        }
        alwo alwoVar = kxb.a;
        Object b = this.d.b();
        b.getClass();
        kwz kwzVar = new kwz();
        apxh.e(kwzVar);
        aklw.b(kwzVar, (ajwt) b);
        kwzVar.q(this.c.G(), "GroupUpgradeBottomSheetFragmentPeer");
        kwzVar.E().d = this;
        e();
        return true;
    }

    @Override // defpackage.lqv
    public final int h() {
        return 19;
    }

    @Override // defpackage.lqv
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.lqv
    public final /* synthetic */ void g(Activity activity, int i) {
    }
}
