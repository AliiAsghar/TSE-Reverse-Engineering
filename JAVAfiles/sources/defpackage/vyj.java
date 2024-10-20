package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vyj implements ancr {
    private final /* synthetic */ int a;

    public /* synthetic */ vyj(int i) {
        this.a = i;
    }

    @Override // defpackage.ancr
    public final ListenableFuture a() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                xyo c = vym.a.c();
                c.H("Finished processing incoming RCS messages");
                c.q();
                return aktp.ag(null);
            }
            return albo.bI(null);
        }
        xyo c2 = vyk.a.c();
        c2.H("Finished processing incoming RCS messages");
        c2.q();
        return aktp.ag(null);
    }
}
