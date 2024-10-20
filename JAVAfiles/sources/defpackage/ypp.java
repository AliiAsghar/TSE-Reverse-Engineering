package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ypp implements akoa {
    public static final uuf a = uuh.e(uuh.b, "spam_data_cleanup_interval_days", 7);
    public final armf b;
    public final armf c;
    private final arwe d;

    public ypp(armf armfVar, armf armfVar2, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        arweVar.getClass();
        this.b = armfVar;
        this.c = armfVar2;
        this.d = arweVar;
    }

    @Override // defpackage.akoa
    public final ListenableFuture a() {
        akul c;
        c = qjh.c(this.d, arpj.a, arwf.a, new xjs(this, (arpe) null, 15));
        return c;
    }
}
