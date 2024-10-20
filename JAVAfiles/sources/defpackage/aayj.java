package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aayj implements lqv {
    public final cg a;
    public final aaxz b;
    private final armf c;
    private final arwe d;
    private final armf e;
    private final armf f;
    private final armf g;
    private lqx h;

    public aayj(cg cgVar, armf armfVar, arwe arweVar, armf armfVar2, armf armfVar3, armf armfVar4, lqx lqxVar) {
        armfVar.getClass();
        arweVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        lqxVar.getClass();
        this.a = cgVar;
        this.c = armfVar;
        this.d = arweVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.g = armfVar4;
        this.h = lqxVar;
        this.b = ((aaya) armfVar2.b()).a(amlx.PROVISIONING_UI_TYPE_LEGAL_FYI, 5);
    }

    @Override // defpackage.lqv
    public final /* synthetic */ int a() {
        return lgb.s();
    }

    @Override // defpackage.lqv
    public final akul b() {
        akul c;
        aayd aaydVar = (aayd) this.c.b();
        c = qjh.c(aaydVar.c, arpj.a, arwf.a, new aayc(aaydVar, null));
        return c;
    }

    @Override // defpackage.lqv
    public final void c(lqx lqxVar, ViewGroup viewGroup) {
        this.h = lqxVar;
    }

    @Override // defpackage.lqv
    public final void d() {
        ((wyp) this.f.b()).m(amlw.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_DISMISSED);
        this.h.b();
    }

    @Override // defpackage.lqv
    public final boolean f(Context context, ViewGroup viewGroup, boolean z) {
        String str;
        if (z) {
            return true;
        }
        ((mho) this.g.b()).S(amlw.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_SEEN, amlx.PROVISIONING_UI_TYPE_LEGAL_FYI);
        qjh.l(this.d, null, new aanv(this, (arpe) null, 6), 3);
        if (true != ((ykw) ((aayd) this.c.b()).d.b()).q("fast_track_prompt_dismissed", false)) {
            str = "NEW_USERS_UI";
        } else {
            str = "DECLINED_TOS_UI";
        }
        aayf aayfVar = new aayf();
        apxh.e(aayfVar);
        aklt.b(aayfVar, str);
        aayfVar.q(this.a.G(), "RcsDefaultOnBottomSheetFragmentPeer");
        aayfVar.E().f = this;
        return true;
    }

    @Override // defpackage.lqv
    public final int h() {
        return 15;
    }

    @Override // defpackage.lqv
    public final void i() {
        d();
    }

    @Override // defpackage.lqv
    public final /* synthetic */ void g(Activity activity, int i) {
    }
}
