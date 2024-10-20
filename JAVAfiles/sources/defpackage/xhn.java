package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xhn implements akoa {
    public static final alhr a;
    public static final uuf b;
    public static final alvi c;
    private static final alhr f;
    public final wzs d;
    public final armf e;
    private final arwe g;

    static {
        alhr w = uuh.w("enable_dangling_parts_metrics");
        w.getClass();
        f = w;
        alhr w2 = uuh.w("enable_dangling_parts_log_zero");
        w2.getClass();
        a = w2;
        b = uuh.e(uuh.b, "dangling_parts_metrics_interval_days", 7);
        c = alvi.m("com/google/android/apps/messaging/shared/telephony/analytics/DanglingPartsSynclet");
    }

    public xhn(wzs wzsVar, armf armfVar, arwe arweVar) {
        wzsVar.getClass();
        armfVar.getClass();
        arweVar.getClass();
        this.d = wzsVar;
        this.e = armfVar;
        this.g = arweVar;
    }

    @Override // defpackage.akoa
    public final ListenableFuture a() {
        akul c2;
        if (((Boolean) ((utz) f.get()).e()).booleanValue() && yhx.h) {
            c2 = qjh.c(this.g, arpj.a, arwf.a, new xhm(this, null));
            return c2;
        }
        akul ag = aktp.ag(null);
        ag.getClass();
        return ag;
    }
}
