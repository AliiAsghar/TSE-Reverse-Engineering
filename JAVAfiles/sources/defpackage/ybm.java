package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybm {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorUtils");
    public final Context a;
    private final odm c;
    private final armf d;

    public ybm(Context context, odm odmVar, armf armfVar) {
        this.a = context;
        this.c = odmVar;
        this.d = armfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.yaz a(android.telephony.ServiceState r6, int r7) {
        /*
            r5 = this;
            int r0 = r6.getState()
            boolean r1 = defpackage.yhx.i
            if (r1 == 0) goto L33
            boolean r6 = defpackage.dbc$$ExternalSyntheticApiModelOutline0.m(r6)
            alvi r7 = defpackage.ybm.b
            alvw r7 = r7.d()
            alvz r1 = defpackage.alwp.a
            java.lang.String r2 = "BugleSatellite"
            r7.X(r1, r2)
            alvg r7 = (defpackage.alvg) r7
            java.lang.String r1 = "isServiceStateOnSatellite"
            r2 = 96
            java.lang.String r3 = "com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorUtils"
            java.lang.String r4 = "NetworkStateMonitorUtils.java"
            alvw r7 = r7.h(r3, r1, r2, r4)
            alvg r7 = (defpackage.alvg) r7
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.String r2 = "OS isAtLeastV and isSatellite = %s"
            r7.t(r2, r1)
            goto L47
        L33:
            odm r6 = r5.c
            boolean r6 = r6.a()
            if (r6 == 0) goto L4d
            armf r6 = r5.d
            java.lang.Object r6 = r6.b()
            wpb r6 = (defpackage.wpb) r6
            boolean r6 = r6.b(r7)
        L47:
            if (r6 != 0) goto L4a
            goto L4d
        L4a:
            yaz r6 = defpackage.yaz.SATELLITE
            return r6
        L4d:
            if (r0 == 0) goto L61
            r6 = 1
            if (r0 == r6) goto L5e
            r6 = 2
            if (r0 == r6) goto L5b
            r6 = 3
            if (r0 == r6) goto L5e
            yaz r6 = defpackage.yaz.UNKNOWN
            return r6
        L5b:
            yaz r6 = defpackage.yaz.EMERGENCY_ONLY
            return r6
        L5e:
            yaz r6 = defpackage.yaz.UNAVAILABLE
            return r6
        L61:
            yaz r6 = defpackage.yaz.AVAILABLE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybm.a(android.telephony.ServiceState, int):yaz");
    }
}
