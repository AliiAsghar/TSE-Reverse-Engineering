package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ykp {
    public static final xze a = xze.g("Bugle", "TelephonyManagerFactory");
    private final Context b;
    private final ul c = new yko(this);

    public ykp(Context context) {
        this.b = context;
    }

    public final TelephonyManager a(int i) {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.b(Integer.valueOf(i));
        telephonyManager.getClass();
        return telephonyManager;
    }

    public final TelephonyManager b() {
        TelephonyManager telephonyManager = (TelephonyManager) this.b.getSystemService(TelephonyManager.class);
        telephonyManager.getClass();
        return telephonyManager;
    }
}
