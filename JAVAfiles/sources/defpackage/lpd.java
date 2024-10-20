package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lpd implements akoa {
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final alvi e;
    private final arwe f;

    public lpd(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        arweVar.getClass();
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
        this.f = arweVar;
        this.e = alvi.m("com/google/android/apps/messaging/net/synclet/TachygramPullMessagesSynclet");
    }

    @Override // defpackage.akoa
    public final ListenableFuture a() {
        akul c;
        c = qjh.c(this.f, arpj.a, arwf.a, new lgp(this, (arpe) null, 5));
        return c;
    }
}
