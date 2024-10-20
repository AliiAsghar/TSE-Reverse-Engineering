package defpackage;

import android.content.Context;
import android.telephony.SmsManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import j$.util.Optional;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ykg extends yjn {
    private static final xze a = xze.g("Bugle", "SubscriptionUtilsAsOfQ");
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfQ");
    private final int c;
    private final TelephonyManager d;
    private final SubscriptionManager e;
    private final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ykg(defpackage.znj r3, defpackage.ykp r4, android.content.Context r5, boolean r6, defpackage.yjo r7, int r8) {
        /*
            r2 = this;
            ykf r0 = new ykf
            java.lang.Object r1 = r3.a
            java.lang.Object r1 = r1.b()
            wpp r1 = (defpackage.wpp) r1
            r1.getClass()
            java.lang.Object r3 = r3.b
            java.lang.Object r3 = r3.b()
            ykp r3 = (defpackage.ykp) r3
            r3.getClass()
            r0.<init>(r1, r3, r7, r8)
            r2.<init>(r0)
            android.telephony.TelephonyManager r3 = r4.a(r8)
            r2.d = r3
            java.lang.Class<android.telephony.SubscriptionManager> r3 = android.telephony.SubscriptionManager.class
            java.lang.Object r3 = r5.getSystemService(r3)
            android.telephony.SubscriptionManager r3 = (android.telephony.SubscriptionManager) r3
            if (r3 != 0) goto L36
            java.lang.Class<android.telephony.SubscriptionManager> r3 = android.telephony.SubscriptionManager.class
            java.lang.Object r3 = r5.getSystemService(r3)
            android.telephony.SubscriptionManager r3 = (android.telephony.SubscriptionManager) r3
        L36:
            r2.e = r3
            r2.f = r6
            r2.c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ykg.<init>(znj, ykp, android.content.Context, boolean, yjo, int):void");
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final String A(Context context) {
        try {
            String ag = albo.ag(this.d.getSubscriberId());
            if (ag.isEmpty()) {
                alvg j = a.j();
                j.V(1, TimeUnit.MINUTES);
                j.X(ydl.t, Integer.valueOf(this.c));
                ((alvg) ((alvg) j.g(aktu.c())).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfQ", "getSubscriberId", 145, "SubscriptionUtilsAsOfQ.java")).q("SubscriptionUtilsAsOfQ: subscriberId is empty. Does TelephonyManager have necessary permissions?");
            }
            return ag;
        } catch (SecurityException e) {
            alvg j2 = a.j();
            j2.V(1, TimeUnit.MINUTES);
            j2.X(ydl.t, Integer.valueOf(this.c));
            ((alvg) ((alvg) j2.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfQ", "getSubscriberId", 155, "SubscriptionUtilsAsOfQ.java")).q("SubscriptionUtilsAsOfQ: failed to get subscriberId, is Messages the default SMS app?");
            return "";
        }
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final boolean B(int i) {
        Object invoke;
        SmsManager g = g();
        try {
            Method declaredMethod = g.getClass().getDeclaredMethod("deleteMessageFromIcc", Integer.TYPE);
            declaredMethod.setAccessible(true);
            invoke = declaredMethod.invoke(g, Integer.valueOf(i));
        } catch (Exception e) {
            alvg i2 = a.i();
            i2.V(10, TimeUnit.SECONDS);
            i2.X(ydl.t, Integer.valueOf(this.c));
            ((alvg) ((alvg) i2.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfQ", "deleteSimMessage", 223, "SubscriptionUtilsAsOfQ.java")).q("SubscriptionUtilsAsOfQ: deleteSimMessage: system api not found");
        }
        if (invoke != null) {
            return ((Boolean) invoke).booleanValue();
        }
        alvg j = a.j();
        j.V(10, TimeUnit.SECONDS);
        j.X(ydl.t, Integer.valueOf(this.c));
        ((alvg) ((alvg) j.g(aktu.c())).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfQ", "deleteSimMessage", 216, "SubscriptionUtilsAsOfQ.java")).q("SubscriptionUtilsAsOfQ: deleteSimMessage: deleteMessageFromIcc returned null.");
        return false;
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final boolean C() {
        return this.d.hasIccCard();
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final boolean E() {
        boolean isDataEnabled;
        isDataEnabled = this.d.isDataEnabled();
        return isDataEnabled;
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final int e() {
        return this.d.getSimState();
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final Optional i() {
        SmsManager g = g();
        try {
            Method declaredMethod = g.getClass().getDeclaredMethod("getAllMessagesFromIcc", null);
            declaredMethod.setAccessible(true);
            return Optional.ofNullable((List) declaredMethod.invoke(g, null));
        } catch (Exception e) {
            alvg i = a.i();
            i.V(10, TimeUnit.SECONDS);
            i.X(ydl.t, Integer.valueOf(this.c));
            ((alvg) ((alvg) i.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfQ", "getAllSimMessages", 186, "SubscriptionUtilsAsOfQ.java")).q("SubscriptionUtilsAsOfQ: getAllSimMessages: system api not found");
            return Optional.empty();
        }
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final String p() {
        int slotIndex;
        try {
            slotIndex = SubscriptionManager.getSlotIndex(this.c);
            if (slotIndex == -1) {
                alvg j = a.j();
                j.V(1, TimeUnit.MINUTES);
                ((alvg) ((alvg) j.g(aktu.c())).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfQ", "getDeviceId", 103, "SubscriptionUtilsAsOfQ.java")).r("SubscriptionUtilsAsOfQ: Invalid slot index, returning empty id for subId: %d", this.c);
                return "";
            }
            String ag = albo.ag(this.d.getDeviceId(slotIndex));
            if (ag.isEmpty()) {
                alvg j2 = a.j();
                j2.V(1, TimeUnit.MINUTES);
                j2.X(ydl.t, Integer.valueOf(this.c));
                ((alvg) ((alvg) j2.g(aktu.c())).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfQ", "getDeviceId", 115, "SubscriptionUtilsAsOfQ.java")).q("SubscriptionUtilsAsOfQ: deviceId is empty. Does TelephonyManager have necessary permissions?");
            }
            return ag;
        } catch (SecurityException e) {
            alvg j3 = a.j();
            j3.V(1, TimeUnit.MINUTES);
            j3.X(ydl.t, Integer.valueOf(this.c));
            ((alvg) ((alvg) j3.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfQ", "getDeviceId", 125, "SubscriptionUtilsAsOfQ.java")).q("SubscriptionUtilsAsOfQ: failed to get deviceId, is Messages the default SMS app?");
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0091  */
    @Override // defpackage.yjn, defpackage.ykb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String q() {
        /*
            r8 = this;
            java.lang.String r0 = "getActiveSubscriptionInfo"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfQ"
            java.lang.String r2 = "SubscriptionUtilsAsOfQ.java"
            boolean r3 = r8.f
            r4 = 0
            if (r3 != 0) goto L15
            android.telephony.SubscriptionManager r0 = r8.e
            int r1 = r8.c
            android.telephony.SubscriptionInfo r0 = r0.getActiveSubscriptionInfo(r1)
            goto L8e
        L15:
            android.telephony.SubscriptionManager r3 = r8.e     // Catch: java.lang.RuntimeException -> L38 java.lang.SecurityException -> L67
            int r5 = r8.c     // Catch: java.lang.RuntimeException -> L38 java.lang.SecurityException -> L67
            android.telephony.SubscriptionInfo r3 = r3.getActiveSubscriptionInfo(r5)     // Catch: java.lang.RuntimeException -> L38 java.lang.SecurityException -> L67
            if (r3 != 0) goto L36
            alvi r5 = defpackage.ykg.b     // Catch: java.lang.RuntimeException -> L38 java.lang.SecurityException -> L67
            alvw r5 = r5.g()     // Catch: java.lang.RuntimeException -> L38 java.lang.SecurityException -> L67
            alvg r5 = (defpackage.alvg) r5     // Catch: java.lang.RuntimeException -> L38 java.lang.SecurityException -> L67
            r6 = 264(0x108, float:3.7E-43)
            alvw r5 = r5.h(r1, r0, r6, r2)     // Catch: java.lang.RuntimeException -> L38 java.lang.SecurityException -> L67
            alvg r5 = (defpackage.alvg) r5     // Catch: java.lang.RuntimeException -> L38 java.lang.SecurityException -> L67
            java.lang.String r6 = "getActiveSubscriptionInfo(): empty sub info for %s."
            int r7 = r8.c     // Catch: java.lang.RuntimeException -> L38 java.lang.SecurityException -> L67
            r5.r(r6, r7)     // Catch: java.lang.RuntimeException -> L38 java.lang.SecurityException -> L67
        L36:
            r0 = r3
            goto L8e
        L38:
            r3 = move-exception
            xze r5 = defpackage.ykg.a
            alvg r5 = r5.j()
            r6 = 10
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r5.V(r6, r7)
            int r6 = r8.c
            alvz r7 = defpackage.ydl.t
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.X(r7, r6)
            alvw r3 = r5.g(r3)
            alvg r3 = (defpackage.alvg) r3
            r5 = 276(0x114, float:3.87E-43)
            alvw r0 = r3.h(r1, r0, r5, r2)
            alvg r0 = (defpackage.alvg) r0
            int r1 = r8.c
            java.lang.String r2 = "SubscriptionUtilsAsOfQ: getActiveSubscriptionInfo: system exception for %s."
            r0.r(r2, r1)
            goto L8d
        L67:
            r3 = move-exception
            xze r5 = defpackage.ykg.a
            alvg r5 = r5.j()
            r6 = 1
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MINUTES
            r5.V(r6, r7)
            java.lang.RuntimeException r3 = defpackage.aktu.b(r3)
            alvw r3 = r5.g(r3)
            alvg r3 = (defpackage.alvg) r3
            r5 = 269(0x10d, float:3.77E-43)
            alvw r0 = r3.h(r1, r0, r5, r2)
            alvg r0 = (defpackage.alvg) r0
            int r1 = r8.c
            java.lang.String r2 = "SubscriptionUtilsAsOfQ: getActiveSubscriptionInfo: no access %s."
            r0.r(r2, r1)
        L8d:
            r0 = r4
        L8e:
            if (r0 != 0) goto L91
            goto L9c
        L91:
            android.os.ParcelUuid r0 = defpackage.ex$$ExternalSyntheticApiModelOutline0.m(r0)
            if (r0 == 0) goto L9c
            java.lang.String r0 = r0.toString()
            return r0
        L9c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ykg.q():java.lang.String");
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final String r() {
        return this.d.getNetworkCountryIso();
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final String s() {
        return this.d.getNetworkOperatorName();
    }
}
