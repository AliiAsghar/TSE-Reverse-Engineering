package defpackage;

import android.net.Uri;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ykh extends yjn {
    private static final xze a = xze.g("Bugle", "SubscriptionUtilsAsOfR");
    private final yjy b;

    public ykh(yyt yytVar, yjy yjyVar, yjo yjoVar, int i) {
        super(yytVar.e(yjoVar, i));
        this.b = yjyVar;
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final boolean B(int i) {
        if (this.b.r()) {
            if (this.b.d.getContentResolver().delete(Uri.parse(a.bV(i, "content://sms/icc/")), null, null) > 0) {
                return true;
            }
            return false;
        }
        return super.B(i);
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final String z() {
        String smscAddress;
        try {
            smscAddress = g().getSmscAddress();
            return albo.ag(smscAddress);
        } catch (SecurityException e) {
            alvg j = a.j();
            j.V(1, TimeUnit.MINUTES);
            ((alvg) ((alvg) j.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfR", "getSmsc", 44, "SubscriptionUtilsAsOfR.java")).q("SubscriptionUtilsAsOfR: Failed to get smscAddress, is Messages the default SMS app?");
            return "";
        }
    }
}
