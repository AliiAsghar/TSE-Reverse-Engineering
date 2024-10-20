package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwt {
    private static volatile adwt b;
    public final TelephonyManager a;

    public adwt(TelephonyManager telephonyManager) {
        this.a = telephonyManager;
    }

    public static adwt g(Context context) {
        if (b == null) {
            synchronized (adwt.class) {
                if (b == null) {
                    b = new adwt((TelephonyManager) context.getSystemService("phone"));
                }
            }
        }
        return b;
    }

    public final int a() {
        int dataNetworkType;
        dataNetworkType = this.a.getDataNetworkType();
        return dataNetworkType;
    }

    public final int b() {
        try {
            return this.a.getDataState();
        } catch (SecurityException e) {
            advr.i(e, "Got SecurityException for getDataState, this shouldn't happen!", new Object[0]);
            if (Build.VERSION.SDK_INT < 29) {
                return 0;
            }
            return -1;
        }
    }

    public final int c() {
        return this.a.getNetworkType();
    }

    public final int d() {
        int simCarrierId;
        try {
            simCarrierId = this.a.getSimCarrierId();
            return simCarrierId;
        } catch (SecurityException e) {
            throw new adwk("READ_PHONE_STATE permission is missing.", e);
        }
    }

    public final TelephonyManager e(int i) {
        TelephonyManager createForSubscriptionId;
        try {
            createForSubscriptionId = this.a.createForSubscriptionId(i);
            return createForSubscriptionId;
        } catch (SecurityException e) {
            throw new adwk("READ_PHONE_STATE permission is missing.", e);
        }
    }

    public final adwt f(int i) {
        TelephonyManager createForSubscriptionId;
        createForSubscriptionId = this.a.createForSubscriptionId(i);
        if (createForSubscriptionId == null) {
            return null;
        }
        return new adwt(createForSubscriptionId);
    }

    public final String h() {
        try {
            return this.a.getGroupIdLevel1();
        } catch (SecurityException e) {
            throw new adwk(e);
        }
    }

    public final String i() {
        try {
            return this.a.getLine1Number();
        } catch (SecurityException e) {
            throw new adwk("READ_PHONE_STATE permission is missing.", e);
        }
    }

    public final String j() {
        return this.a.getNetworkOperator();
    }

    public final String k() {
        return this.a.getNetworkOperatorName();
    }

    public final String l() {
        return this.a.getSimCountryIso();
    }

    public final String m() {
        return this.a.getSimOperator();
    }

    public final String n() {
        try {
            return this.a.getSimSerialNumber();
        } catch (SecurityException e) {
            throw new adwk("READ_PRIVILEGED_PHONE_STATE permission is missing.", e);
        }
    }
}
