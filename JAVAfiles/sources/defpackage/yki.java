package defpackage;

import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yki extends yjn {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfT");
    private final SubscriptionManager b;
    private final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public yki(defpackage.wpp r4, android.content.Context r5, defpackage.yjo r6, int r7) {
        /*
            r3 = this;
            yjn r0 = new yjn
            java.lang.Object r1 = r4.b
            java.lang.Object r1 = r1.b()
            znj r1 = (defpackage.znj) r1
            r1.getClass()
            java.lang.Object r2 = r4.c
            java.lang.Object r2 = r2.b()
            yjy r2 = (defpackage.yjy) r2
            r2.getClass()
            java.lang.Object r4 = r4.a
            java.lang.Object r4 = r4.b()
            ykp r4 = (defpackage.ykp) r4
            r4.getClass()
            r0.<init>(r1, r4, r6, r7)
            r3.<init>(r0)
            r3.c = r7
            java.lang.Class<android.telephony.SubscriptionManager> r4 = android.telephony.SubscriptionManager.class
            java.lang.Object r4 = r5.getSystemService(r4)
            android.telephony.SubscriptionManager r4 = (android.telephony.SubscriptionManager) r4
            if (r4 != 0) goto L3d
            java.lang.Class<android.telephony.SubscriptionManager> r4 = android.telephony.SubscriptionManager.class
            java.lang.Object r4 = r5.getSystemService(r4)
            android.telephony.SubscriptionManager r4 = (android.telephony.SubscriptionManager) r4
        L3d:
            r3.b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yki.<init>(wpp, android.content.Context, yjo, int):void");
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final Optional m() {
        String phoneNumber;
        try {
            phoneNumber = this.b.getPhoneNumber(this.c);
            alvw g = a.g();
            g.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) g;
            alvgVar.X(ydl.t, Integer.valueOf(this.c));
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfT", "getRawSelfNumber", 53, "SubscriptionUtilsAsOfT.java")).t("getRawTelephonyPhoneNumber %s", yyb.bh(phoneNumber));
            if (!TextUtils.isEmpty(phoneNumber)) {
                return Optional.of(phoneNumber);
            }
        } catch (IllegalStateException | SecurityException e) {
            alvi alviVar = a;
            alvw i = alviVar.i();
            i.X(alwp.a, "Bugle");
            alvg alvgVar2 = (alvg) i;
            alvgVar2.V(1, TimeUnit.MINUTES);
            alvg alvgVar3 = (alvg) alvgVar2.g(e);
            alvgVar3.X(ydl.t, Integer.valueOf(this.c));
            ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfT", "getRawSelfNumber", 63, "SubscriptionUtilsAsOfT.java")).q("SubscriptionUtilsAsOfT: getRawSelfNumber failed");
            if (anfi.a("bugle.sub_utils_handle_read_number_permission", "bugle") && (e instanceof SecurityException)) {
                alvw g2 = alviVar.g();
                g2.X(alwp.a, "Bugle");
                ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfT", "getRawSelfNumber", 67, "SubscriptionUtilsAsOfT.java")).q("SubscriptionUtilsAsOfT: getRawSelfNumber fallback to super");
                return super.m();
            }
        }
        return Optional.empty();
    }
}
