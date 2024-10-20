package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iuh implements akgr {
    public final /* synthetic */ iui a;

    public iuh(iui iuiVar) {
        this.a = iuiVar;
    }

    @Override // defpackage.akgr
    public final /* synthetic */ akfd a() {
        return iui.a;
    }

    @Override // defpackage.akgr
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        return aktp.aj(new ikm(this, 3), this.a.b);
    }
}
