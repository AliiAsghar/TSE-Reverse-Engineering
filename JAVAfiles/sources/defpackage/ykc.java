package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.provider.Settings;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import j$.util.Optional;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ykc implements ykb {
    private static final xze a = xze.g("Bugle", "SubscriptionUtilsAsOfL");
    private final Context b;
    private final int c;
    private final TelephonyManager d;
    private final mre e;
    private final yjo f;
    private final armf g;
    private ConnectivityManager h;

    public ykc(Context context, ykp ykpVar, mre mreVar, armf armfVar, yjo yjoVar, int i) {
        this.b = context;
        this.c = i;
        this.d = ykpVar.a(i);
        this.e = mreVar;
        this.f = yjoVar;
        this.g = armfVar;
    }

    private final void I() {
        boolean z;
        int i = this.c;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        albo.V(z, "Default subscription must be %s", i);
    }

    @Override // defpackage.ykb
    public final String A(Context context) {
        try {
            return albo.ag(this.d.getSubscriberId());
        } catch (Exception e) {
            alvg i = a.i();
            i.V(10, TimeUnit.SECONDS);
            i.X(ydl.t, Integer.valueOf(this.c));
            ((alvg) ((alvg) i.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfL", "getSubscriberId", 299, "SubscriptionUtilsAsOfL.java")).q("SubscriptionUtilsAsOfL: Missing permissions, returning empty subscriber id");
            return "";
        }
    }

    @Override // defpackage.ykb
    public final boolean B(int i) {
        a.q("SubscriptionUtilsAsOfL.deleteSimMessage: not implemented");
        return false;
    }

    @Override // defpackage.ykb
    public final boolean C() {
        I();
        return this.d.hasIccCard();
    }

    @Override // defpackage.ykb
    public final boolean D() {
        if (Settings.Global.getInt(this.b.getContentResolver(), "data_roaming", 0) == 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ykb
    public final boolean E() {
        Boolean bool = false;
        if (this.h == null) {
            this.h = (ConnectivityManager) this.b.getSystemService("connectivity");
        }
        try {
            Method declaredMethod = this.h.getClass().getDeclaredMethod("getMobileDataEnabled", null);
            declaredMethod.setAccessible(true);
            bool = (Boolean) declaredMethod.invoke(this.h, null);
        } catch (Exception e) {
            alvg i = a.i();
            i.V(10, TimeUnit.SECONDS);
            i.X(ydl.t, Integer.valueOf(this.c));
            ((alvg) ((alvg) i.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfL", "isMobileDataEnabled", 264, "SubscriptionUtilsAsOfL.java")).q("SubscriptionUtilsAsOfL: isMobileDataEnabled: system api not found");
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // defpackage.ykb
    public final boolean F() {
        return this.d.isNetworkRoaming();
    }

    @Override // defpackage.ykb
    public final boolean G() {
        if (this.d.getSimState() != 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ykb
    public final int[] H() {
        int i;
        String simOperator = this.d.getSimOperator();
        int i2 = 0;
        try {
            i = Integer.parseInt(simOperator.substring(0, 3));
            try {
                i2 = Integer.parseInt(simOperator.substring(3));
            } catch (Exception e) {
                e = e;
                xyo e2 = a.e();
                e2.H("getMccMnc: invalid string ");
                e2.H(simOperator);
                e2.r(e);
                return new int[]{i, i2};
            }
        } catch (Exception e3) {
            e = e3;
            i = 0;
        }
        return new int[]{i, i2};
    }

    @Override // defpackage.ykb
    public final int a() {
        I();
        return -1;
    }

    @Override // defpackage.ykb
    public final int b() {
        return 0;
    }

    @Override // defpackage.ykb
    public final int c() {
        return 0;
    }

    @Override // defpackage.ykb
    public final int d() {
        return 0;
    }

    @Override // defpackage.ykb
    public final int e() {
        return 0;
    }

    @Override // defpackage.ykb
    public final Bitmap f(Context context) {
        return null;
    }

    @Override // defpackage.ykb
    public final SmsManager g() {
        return SmsManager.getSmsManagerForSubscriptionId(this.c);
    }

    @Override // defpackage.ykb
    public final msh h(String str) {
        throw new UnsupportedOperationException("SubscriptionUtilsAsOfL doesn't need this impl");
    }

    @Override // defpackage.ykb
    public final Optional i() {
        a.q("SubscriptionUtilsAsOfL.getAllSimMessages: not implemented");
        return Optional.of(new ArrayList());
    }

    @Override // defpackage.ykb
    public final Optional j(boolean z) {
        throw new UnsupportedOperationException("SubscriptionUtilsAsOfL doesn't need this impl");
    }

    @Override // defpackage.ykb
    public final Optional k() {
        return Optional.ofNullable(g().getCarrierConfigValues());
    }

    @Override // defpackage.ykb
    public final Optional l(boolean z) {
        msh mshVar = null;
        try {
            String line1Number = this.d.getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                String u = u();
                if (!((anhn) this.g.b()).c(line1Number, u)) {
                    xze xzeVar = a;
                    if (xzeVar.s(3)) {
                        xyo a2 = xzeVar.a();
                        a2.H("TelephonyManager phone number for self is invalid! ");
                        a2.z("country", u);
                        a2.j(line1Number);
                        a2.q();
                    }
                } else {
                    mshVar = this.e.c(line1Number, new yim(u, 10));
                }
            } else {
                xze xzeVar2 = a;
                if (xzeVar2.s(3)) {
                    xzeVar2.l("TelephonyManager phone number for self is empty!");
                }
            }
        } catch (Exception e) {
            alvg i = a.i();
            i.V(10, TimeUnit.SECONDS);
            i.X(ydl.t, Integer.valueOf(this.c));
            ((alvg) ((alvg) i.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfL", "getMessagingIdentity", 229, "SubscriptionUtilsAsOfL.java")).q("SubscriptionUtilsAsOfL: Missing permissions, returning empty self raw number");
        }
        if (!this.f.d() && mshVar != null) {
            return Optional.of(mshVar);
        }
        return Optional.empty();
    }

    @Override // defpackage.ykb
    public final Optional m() {
        try {
            String line1Number = this.d.getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                return Optional.of(line1Number);
            }
        } catch (SecurityException | UnsupportedOperationException e) {
            alvg i = a.i();
            i.V(1, TimeUnit.MINUTES);
            i.X(ydl.t, Integer.valueOf(this.c));
            ((alvg) ((alvg) i.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfL", "getRawSelfNumber", 195, "SubscriptionUtilsAsOfL.java")).q("SubscriptionUtilsAsOfL: Missing permissions, returning empty self raw number");
        }
        return Optional.empty();
    }

    @Override // defpackage.ykb
    public final CharSequence n() {
        return this.d.getNetworkOperatorName();
    }

    @Override // defpackage.ykb
    public final CharSequence o() {
        return this.d.getNetworkOperatorName();
    }

    @Override // defpackage.ykb
    public final String p() {
        try {
            return albo.ag(this.d.getDeviceId());
        } catch (Exception e) {
            alvg i = a.i();
            i.V(10, TimeUnit.SECONDS);
            i.X(ydl.t, Integer.valueOf(this.c));
            ((alvg) ((alvg) i.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfL", "getDeviceId", 284, "SubscriptionUtilsAsOfL.java")).q("SubscriptionUtilsAsOfL: Missing permissions, returning empty device id");
            return "";
        }
    }

    @Override // defpackage.ykb
    public final String q() {
        return null;
    }

    @Override // defpackage.ykb
    public final String r() {
        return this.d.getNetworkCountryIso();
    }

    @Override // defpackage.ykb
    public final String s() {
        return this.d.getNetworkOperatorName();
    }

    @Override // defpackage.ykb
    public final String t() {
        return this.d.getNetworkOperatorName();
    }

    public final String toString() {
        return o().toString();
    }

    @Override // defpackage.ykb
    public final String u() {
        return albo.ag(this.d.getSimCountryIso());
    }

    @Override // defpackage.ykb
    public final String v(Locale locale) {
        String simCountryIso = this.d.getSimCountryIso();
        if (TextUtils.isEmpty(simCountryIso)) {
            return "";
        }
        return simCountryIso.toUpperCase(locale);
    }

    @Override // defpackage.ykb
    public final String w() {
        return this.d.getSimOperatorName();
    }

    @Override // defpackage.ykb
    public final String x() {
        return this.d.getSimOperator();
    }

    @Override // defpackage.ykb
    public final String y() {
        try {
            return this.d.getSimSerialNumber();
        } catch (Exception e) {
            alvg i = a.i();
            i.V(10, TimeUnit.SECONDS);
            i.X(ydl.t, Integer.valueOf(this.c));
            ((alvg) ((alvg) i.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfL", "getSimSerialNumber", 172, "SubscriptionUtilsAsOfL.java")).q("SubscriptionUtilsAsOfL: Missing permissions, returning empty SIM serial number");
            return "";
        }
    }

    @Override // defpackage.ykb
    public final String z() {
        return "";
    }
}
