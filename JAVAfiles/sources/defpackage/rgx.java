package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rgx implements wfd {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public rgx(arvo arvoVar, int i) {
        this.b = i;
        this.a = arvoVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [arvo, java.lang.Object] */
    @Override // defpackage.wfd
    public final void a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                ((CountDownLatch) this.a).countDown();
                return;
            } else {
                ((ikf) this.a).e();
                return;
            }
        }
        this.a.e(null, null);
    }

    public /* synthetic */ rgx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
