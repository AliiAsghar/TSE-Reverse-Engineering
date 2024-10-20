package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akox implements akkj {
    private final armf a;
    private final boolean b;

    public akox(armf armfVar, boolean z) {
        this.a = armfVar;
        this.b = z;
    }

    @Override // defpackage.akkj
    public final ListenableFuture a() {
        if (this.b) {
            return ((akoi) this.a.b()).a();
        }
        return aneh.a;
    }
}
