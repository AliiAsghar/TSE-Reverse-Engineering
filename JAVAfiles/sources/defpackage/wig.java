package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wig implements wve {
    final /* synthetic */ armf a;
    final /* synthetic */ armf b;

    public wig(armf armfVar, armf armfVar2) {
        this.a = armfVar;
        this.b = armfVar2;
    }

    @Override // defpackage.wve
    public final Optional a() {
        wiz wizVar;
        aozy createBuilder = wjc.a.createBuilder();
        createBuilder.getClass();
        if (((yyt) this.a.b()).T()) {
            wizVar = wiz.TOGGLE_STATE_ENABLED;
        } else {
            wizVar = wiz.TOGGLE_STATE_USER_DISABLED;
        }
        wizVar.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wjc wjcVar = (wjc) createBuilder.b;
        wjcVar.e = wizVar.e;
        wjcVar.b |= 2;
        apag s = createBuilder.s();
        s.getClass();
        return Optional.of((wjc) s);
    }

    @Override // defpackage.wvd
    public final void c() {
        ((mbl) this.b.b()).c("Bugle.Rcs.Settings.Data.Migration.Counts");
    }

    @Override // defpackage.wve
    public final void b() {
    }
}
