package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahwz implements hkh {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahwz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.hkh
    public final void a(hkl hklVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                adxs.e((acit) this.a, hklVar);
                return;
            } else {
                ugd.g.r("Error loading image from volley!", hklVar);
                ((CountDownLatch) this.a).countDown();
                return;
            }
        }
        agrk.m((acit) this.a, hklVar);
    }
}
