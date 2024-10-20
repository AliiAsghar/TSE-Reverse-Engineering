package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqsv extends apzj {
    public final arhb d;
    public final aqxc e;
    private boolean f;

    protected aqsv() {
        throw null;
    }

    @Override // defpackage.apzj
    public final void j(aqvt aqvtVar) {
        List list = this.d.h;
        aqvtVar.getClass();
        list.add(aqvtVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aqvq m() {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqsv.m():aqvq");
    }

    public final void n(asmb asmbVar) {
        this.e.f = asmbVar;
    }

    public final String toString() {
        arhb arhbVar = this.d;
        algv aj = albo.aj(this);
        aj.b("delegate", arhbVar);
        return aj.toString();
    }

    public aqsv(aqwn aqwnVar, aqwr aqwrVar) {
        super(null);
        aqxc aqxcVar = new aqxc();
        this.e = aqxcVar;
        aqxcVar.a = aqwnVar;
        arhb arhbVar = new arhb(new atpk(this, aqwrVar));
        this.d = arhbVar;
        arhbVar.o = false;
        arhbVar.r = false;
    }
}
