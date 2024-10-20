package defpackage;

import android.telephony.PhoneNumberUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vwr {
    public static final alwo a = alwo.o("BugleRcs");
    public final vyv b;

    public vwr(vyv vyvVar) {
        this.b = vyvVar;
    }

    public static String a(ajpu ajpuVar) {
        if (ajpuVar.b() != 1) {
            String a2 = ajpuVar.a();
            String str = null;
            try {
                String e = ((aikp) new ailc(a2, (int[]) null).n()).e();
                if (e != null) {
                    if (PhoneNumberUtils.isGlobalPhoneNumber(e)) {
                        str = e;
                    }
                }
            } catch (ailb | ClassCastException e2) {
                ((alwl) ((alwl) ((alwl) a.i()).g(e2)).h("com/google/android/apps/messaging/shared/rcs/groups/notify/ProcessRcsGroupNotifyScheduler", "extractPhoneNumberSipUri", 137, "ProcessRcsGroupNotifyScheduler.java")).t("Failed to parse phone number out of SIP schemed Uri: %s", yyb.bh(a2));
            }
            if (str != null) {
                return str;
            }
        }
        return ajpuVar.a();
    }
}
