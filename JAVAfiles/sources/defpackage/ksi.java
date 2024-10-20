package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksi {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/growthkit/GrowthKitLogger");

    public final void a() {
        akrh e = aktp.e("GrowthKitLogger#logEventAsync");
        try {
            ListenableFuture bI = albo.bI(false);
            e.b(bI);
            albo.bR(bI, new pum(1), andi.a);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
