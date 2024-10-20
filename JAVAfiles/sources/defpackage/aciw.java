package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aciw implements acix {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // defpackage.acij
    public final void b() {
        this.a.countDown();
    }

    @Override // defpackage.acil
    public final void d(Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.acim
    public final void e(Object obj) {
        this.a.countDown();
    }
}
