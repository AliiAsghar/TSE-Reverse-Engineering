package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wfr implements akgr {
    final /* synthetic */ wfp a;
    final /* synthetic */ wft b;

    public wfr(wft wftVar, wfp wfpVar) {
        this.a = wfpVar;
        this.b = wftVar;
    }

    @Override // defpackage.akgr
    public final akfd a() {
        return whj.c;
    }

    @Override // defpackage.akgr
    public final ListenableFuture b() {
        wft wftVar = this.b;
        return wftVar.c().i(new vfj(wftVar, this.a, 17), wftVar.g);
    }
}
