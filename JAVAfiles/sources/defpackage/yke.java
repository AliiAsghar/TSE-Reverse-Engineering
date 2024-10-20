package defpackage;

import android.content.Context;
import android.telephony.CarrierConfigManager;
import android.telephony.TelephonyManager;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yke extends yjn {
    private static final xze a = xze.g("Bugle", "SubscriptionUtilsAsOfM");
    private final CarrierConfigManager b;
    private final TelephonyManager c;
    private final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public yke(defpackage.wyp r14, defpackage.ykp r15, android.content.Context r16, defpackage.yjo r17, int r18) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            r11 = r18
            ykd r12 = new ykd
            java.lang.Object r2 = r1.c
            java.lang.Object r2 = r2.b()
            zxy r2 = (defpackage.zxy) r2
            r2.getClass()
            java.lang.Object r3 = r1.g
            java.lang.Object r3 = r3.b()
            yka r3 = (defpackage.yka) r3
            r3.getClass()
            java.lang.Object r4 = r1.b
            java.lang.Object r4 = r4.b()
            yjy r4 = (defpackage.yjy) r4
            r4.getClass()
            java.lang.Object r5 = r1.d
            java.lang.Object r5 = r5.b()
            ykp r5 = (defpackage.ykp) r5
            r5.getClass()
            java.lang.Object r6 = r1.e
            java.lang.Object r6 = r6.b()
            mre r6 = (defpackage.mre) r6
            r6.getClass()
            java.lang.Object r7 = r1.a
            java.lang.Object r7 = r7.b()
            android.content.Context r7 = (android.content.Context) r7
            r7.getClass()
            java.lang.Object r8 = r1.f
            r1 = r12
            r9 = r17
            r10 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r13.<init>(r12)
            r1 = r15
            android.telephony.TelephonyManager r1 = r15.a(r11)
            r0.c = r1
            java.lang.Class<android.telephony.CarrierConfigManager> r1 = android.telephony.CarrierConfigManager.class
            r2 = r16
            java.lang.Object r1 = r2.getSystemService(r1)
            android.telephony.CarrierConfigManager r1 = (android.telephony.CarrierConfigManager) r1
            r1.getClass()
            r0.b = r1
            r0.d = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yke.<init>(wyp, ykp, android.content.Context, yjo, int):void");
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final String A(Context context) {
        if (context.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
            try {
                return albo.ag(this.c.getSubscriberId());
            } catch (SecurityException e) {
                alvg j = a.j();
                j.V(1, TimeUnit.MINUTES);
                j.X(ydl.t, Integer.valueOf(this.d));
                ((alvg) ((alvg) j.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfM", "getSubscriberId", 77, "SubscriptionUtilsAsOfM.java")).q("SubscriptionUtilsAsOfM: failed to get subscriberId, is Messages the default SMS app?");
                return "";
            }
        }
        alvg j2 = a.j();
        j2.V(1, TimeUnit.MINUTES);
        j2.X(ydl.t, Integer.valueOf(this.d));
        ((alvg) ((alvg) j2.g(aktu.c())).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfM", "getSubscriberId", 65, "SubscriptionUtilsAsOfM.java")).q("SubscriptionUtilsAsOfM: Missing permissions, returning empty subscriber id");
        return "";
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final Optional k() {
        return Optional.ofNullable(this.b.getConfigForSubId(this.d)).map(new ybe(17));
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final String w() {
        return this.c.getSimOperatorName();
    }
}
