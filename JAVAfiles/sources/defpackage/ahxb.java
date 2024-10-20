package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahxb implements hki {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ahxb(aodz aodzVar, acit acitVar, int i) {
        this.c = i;
        this.b = aodzVar;
        this.a = acitVar;
    }

    @Override // defpackage.hki
    public final void a(Object obj) {
        if (this.c != 0) {
            xze xzeVar = ugd.g;
            xyl.l(obj);
            ugc ugcVar = (ugc) this.a;
            xyl.i(ugcVar.a);
            ugcVar.a = obj;
            ((CountDownLatch) this.b).countDown();
            return;
        }
        adxs.i((aodz) this.b, (acit) this.a, (Bitmap) obj);
    }

    public /* synthetic */ ahxb(ugc ugcVar, CountDownLatch countDownLatch, int i) {
        this.c = i;
        this.a = ugcVar;
        this.b = countDownLatch;
    }
}
