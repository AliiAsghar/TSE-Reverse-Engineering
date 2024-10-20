package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.provider.Settings;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import j$.util.Optional;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ykd extends yjn {
    private static final alhr a = uuh.w("log_anomaly_in_sub");
    private static final alwo b = alwo.o("Bugle");
    private static final xze c = xze.g("Bugle", "SubscriptionUtilsAsOfLMR1");
    private final TelephonyManager d;
    private final int e;
    private final yka f;
    private final SubscriptionManager g;
    private final yjo h;
    private final yjy i;
    private final mre j;
    private final armf k;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ykd(defpackage.zxy r11, defpackage.yka r12, defpackage.yjy r13, defpackage.ykp r14, defpackage.mre r15, android.content.Context r16, defpackage.armf r17, defpackage.yjo r18, int r19) {
        /*
            r10 = this;
            r0 = r10
            r1 = r11
            r8 = r19
            ykc r9 = new ykc
            java.lang.Object r2 = r1.d
            java.lang.Object r2 = r2.b()
            android.content.Context r2 = (android.content.Context) r2
            r2.getClass()
            java.lang.Object r3 = r1.c
            java.lang.Object r3 = r3.b()
            yyb r3 = (defpackage.yyb) r3
            r3.getClass()
            java.lang.Object r3 = r1.a
            java.lang.Object r3 = r3.b()
            ykp r3 = (defpackage.ykp) r3
            r3.getClass()
            java.lang.Object r4 = r1.b
            java.lang.Object r4 = r4.b()
            mre r4 = (defpackage.mre) r4
            r4.getClass()
            java.lang.Object r5 = r1.e
            r1 = r9
            r6 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10.<init>(r9)
            r1 = r14
            android.telephony.TelephonyManager r1 = r14.a(r8)
            r0.d = r1
            r0.e = r8
            r1 = r12
            r0.f = r1
            java.lang.Class<android.telephony.SubscriptionManager> r1 = android.telephony.SubscriptionManager.class
            r2 = r16
            java.lang.Object r1 = r2.getSystemService(r1)
            android.telephony.SubscriptionManager r1 = (android.telephony.SubscriptionManager) r1
            if (r1 != 0) goto L5b
            android.telephony.SubscriptionManager r1 = android.telephony.SubscriptionManager.from(r16)
        L5b:
            r0.g = r1
            r1 = r18
            r0.h = r1
            r1 = r13
            r0.i = r1
            r1 = r15
            r0.j = r1
            r1 = r17
            r0.k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ykd.<init>(zxy, yka, yjy, ykp, mre, android.content.Context, armf, yjo, int):void");
    }

    private static int I(int i) {
        try {
            Method declaredMethod = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(new Object(), Integer.valueOf(i));
            if (invoke != null) {
                return ((Integer) invoke).intValue();
            }
            return -1;
        } catch (Exception e) {
            alvg i2 = c.i();
            i2.V(10, TimeUnit.SECONDS);
            i2.X(ydl.t, Integer.valueOf(i));
            ((alvg) ((alvg) i2.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfLMR1", "getSlotId", 246, "SubscriptionUtilsAsOfLMR1.java")).t("SubscriptionUtilsAsOfLMR1: SubscriptionManager.%s not found", "getSlotIndex");
            return -1;
        }
    }

    private final SubscriptionInfo J() {
        try {
            SubscriptionInfo activeSubscriptionInfo = this.g.getActiveSubscriptionInfo(this.e);
            if (activeSubscriptionInfo == null) {
                xyo c2 = c.c();
                c2.H("getActiveSubscriptionInfo(): empty sub info for");
                c2.l(this.e);
                c2.q();
            }
            return activeSubscriptionInfo;
        } catch (SecurityException e) {
            alvg i = c.i();
            i.V(1, TimeUnit.MINUTES);
            ((alvg) ((alvg) i.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfLMR1", "getActiveSubscriptionInfo", 451, "SubscriptionUtilsAsOfLMR1.java")).r("SubscriptionUtilsAsOfLMR1: getActiveSubscriptionInfo: no access for subId=%s", this.e);
            return null;
        } catch (Exception e2) {
            alvg i2 = c.i();
            i2.V(10, TimeUnit.SECONDS);
            ((alvg) ((alvg) i2.g(e2)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfLMR1", "getActiveSubscriptionInfo", 456, "SubscriptionUtilsAsOfLMR1.java")).r("SubscriptionUtilsAsOfLMR1: getActiveSubscriptionInfo: system exception for subId=%s", this.e);
            return null;
        }
    }

    private final Object K(String str, int i) {
        try {
            Method declaredMethod = this.d.getClass().getDeclaredMethod(str, Integer.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(this.d, Integer.valueOf(i));
        } catch (Exception e) {
            alvg j = c.j();
            j.V(10, TimeUnit.SECONDS);
            j.X(ydl.t, Integer.valueOf(this.e));
            ((alvg) ((alvg) j.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfLMR1", "invokeHiddenOnTelephonyManager", 143, "SubscriptionUtilsAsOfLMR1.java")).t("SubscriptionUtilsAsOfLMR1: No %s method on telephony manager", str);
            throw new NoSuchMethodException(a.bW(str, "No ", " method"));
        }
    }

    private final Object L(String str, int i) {
        return K(str, I(i));
    }

    private final Object M(String str) {
        return K(str, this.e);
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final String A(Context context) {
        try {
            return albo.ag((String) M("getSubscriberId"));
        } catch (NoSuchMethodException e) {
            xyo b2 = c.b();
            b2.H("Platform does not have API to get subscriber id");
            b2.r(e);
            return "";
        }
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final boolean B(int i) {
        SmsManager g = g();
        try {
            Method declaredMethod = g.getClass().getDeclaredMethod("deleteMessageFromIcc", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(g, Integer.valueOf(i));
            if (invoke != null) {
                return ((Boolean) invoke).booleanValue();
            }
        } catch (Exception e) {
            alvg i2 = c.i();
            i2.V(10, TimeUnit.SECONDS);
            i2.X(ydl.t, Integer.valueOf(this.e));
            ((alvg) ((alvg) i2.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfLMR1", "deleteSimMessage", 315, "SubscriptionUtilsAsOfLMR1.java")).q("SubscriptionUtilsAsOfLMR1: deleteSimMessage: system api not found");
        }
        return false;
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final boolean C() {
        try {
            return ((Boolean) L("hasIccCard", this.e)).booleanValue();
        } catch (NoSuchMethodException e) {
            xyo b2 = c.b();
            b2.H("TelephonyManager.hasIccCard not found");
            b2.r(e);
            return false;
        }
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final boolean D() {
        SubscriptionInfo J = J();
        if (J == null) {
            xyo b2 = c.b();
            b2.H("isDataRoamingEnabled: system return empty sub info for");
            b2.l(this.e);
            b2.q();
            return false;
        }
        if (J.getDataRoaming() == 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final boolean E() {
        try {
            Method declaredMethod = this.d.getClass().getDeclaredMethod("getDataEnabled", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this.d, Integer.valueOf(this.e));
            if (invoke == null) {
                return false;
            }
            return ((Boolean) invoke).booleanValue();
        } catch (Exception e) {
            alvg i = c.i();
            i.V(10, TimeUnit.SECONDS);
            i.X(ydl.t, Integer.valueOf(this.e));
            ((alvg) ((alvg) i.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfLMR1", "isMobileDataEnabled", 185, "SubscriptionUtilsAsOfLMR1.java")).q("SubscriptionUtilsAsOfLMR1: isMobileDataEnabled: system api not found");
            return false;
        }
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final boolean F() {
        return this.g.isNetworkRoaming(this.e);
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final boolean G() {
        if (J() != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final int[] H() {
        int i;
        int i2;
        SubscriptionInfo J = J();
        if (J != null) {
            i = J.getMcc();
            i2 = J.getMnc();
        } else {
            i = 0;
            i2 = 0;
        }
        return new int[]{i, i2};
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final int a() {
        return this.e;
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final int b() {
        SubscriptionInfo J = J();
        if (J == null) {
            return 0;
        }
        return J.getIconTint();
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final int d() {
        boolean isEmbedded;
        SubscriptionInfo J = J();
        if (J == null) {
            return -1;
        }
        int simSlotIndex = J.getSimSlotIndex();
        if (simSlotIndex < 0 && ((Boolean) ((utz) a.get()).e()).booleanValue()) {
            alwl alwlVar = (alwl) b.i();
            alwlVar.Z(alwk.FULL);
            alwl alwlVar2 = (alwl) alwlVar.h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfLMR1", "getSimSlotIndex", 373, "SubscriptionUtilsAsOfLMR1.java");
            Integer valueOf = Integer.valueOf(this.e);
            Integer valueOf2 = Integer.valueOf(simSlotIndex);
            boolean z = false;
            if (yhx.b) {
                isEmbedded = J.isEmbedded();
                if (isEmbedded) {
                    z = true;
                }
            }
            alwlVar2.J("Active sub has invalid slotIndex: subId=%s, slotIndex=%s, isESIM=%s", valueOf, valueOf2, Boolean.valueOf(z));
        }
        return simSlotIndex;
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final int e() {
        try {
            return ((Integer) L("getSimState", this.e)).intValue();
        } catch (NoSuchMethodException e) {
            xyo b2 = c.b();
            b2.H("TelephonyManager.getSimState not found");
            b2.r(e);
            return 0;
        }
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final Bitmap f(Context context) {
        SubscriptionInfo J = J();
        if (J == null) {
            return null;
        }
        return J.createIconBitmap(context);
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final Optional i() {
        SmsManager g = g();
        try {
            Method declaredMethod = g.getClass().getDeclaredMethod("getAllMessagesFromIcc", null);
            declaredMethod.setAccessible(true);
            return Optional.ofNullable((List) declaredMethod.invoke(g, null));
        } catch (Exception e) {
            alvg i = c.i();
            i.V(10, TimeUnit.SECONDS);
            i.X(ydl.t, Integer.valueOf(this.e));
            ((alvg) ((alvg) i.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfLMR1", "getAllSimMessages", 285, "SubscriptionUtilsAsOfLMR1.java")).q("SubscriptionUtilsAsOfLMR1: getAllSimMessages: system api not found");
            return Optional.empty();
        }
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final Optional j(boolean z) {
        throw new UnsupportedOperationException("SubscriptionUtilsAsOfLMR1 doesn't need this impl");
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final Optional k() {
        return Optional.ofNullable(g().getCarrierConfigValues());
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final Optional l(boolean z) {
        String u = u();
        if (z) {
            String c2 = this.h.c(this.e);
            if (!TextUtils.isEmpty(c2)) {
                return Optional.of(this.j.c(c2, new yim(u, 11)));
            }
        }
        SubscriptionInfo J = J();
        msh mshVar = null;
        if (J != null) {
            String number = J.getNumber();
            if (!TextUtils.isEmpty(number)) {
                if (!((anhn) this.k.b()).c(number, u)) {
                    xyo a2 = c.a();
                    a2.H("SubscriptionInfo phone number for self is invalid! country=");
                    a2.H(u);
                    a2.H("phoneNumber=");
                    a2.j(number);
                    a2.q();
                } else {
                    mshVar = this.j.c(number, new yim(u, 12));
                }
            } else {
                xyo a3 = c.a();
                a3.H("SubscriptionInfo phone number for self is empty!");
                a3.q();
            }
        } else {
            alvg j = c.j();
            j.V(10, TimeUnit.SECONDS);
            ((alvg) ((alvg) j.g(aktu.c())).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfLMR1", "getMessagingIdentity", 542, "SubscriptionUtilsAsOfLMR1.java")).r("SubscriptionUtilsAsOfLMR1: getSelfRawNumber: subInfo is null for %s", this.e);
        }
        if (!this.h.d() && mshVar != null) {
            return Optional.of(mshVar);
        }
        return Optional.empty();
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final Optional m() {
        SubscriptionInfo J = J();
        if (J == null) {
            alwl alwlVar = (alwl) b.i();
            alwlVar.V(1, TimeUnit.MINUTES);
            alwl alwlVar2 = (alwl) alwlVar.g(aktu.c());
            alwlVar2.X(ydl.t, Integer.valueOf(this.e));
            ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfLMR1", "getRawSelfNumber", 498, "SubscriptionUtilsAsOfLMR1.java")).q("SubscriptionUtilsAsOfLMR1: subInfo is null");
            return Optional.empty();
        }
        String number = J.getNumber();
        if (TextUtils.isEmpty(number)) {
            return Optional.empty();
        }
        return Optional.of(number);
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final CharSequence n() {
        SubscriptionInfo J = J();
        if (J == null) {
            return "";
        }
        return J.getCarrierName();
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final CharSequence o() {
        SubscriptionInfo J = J();
        if (J == null) {
            return "";
        }
        return J.getDisplayName();
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final String p() {
        try {
            return albo.ag(this.d.getDeviceId(I(this.e)));
        } catch (Exception e) {
            alvg i = c.i();
            i.V(10, TimeUnit.SECONDS);
            i.X(ydl.t, Integer.valueOf(this.e));
            ((alvg) ((alvg) i.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfLMR1", "getDeviceId", 225, "SubscriptionUtilsAsOfLMR1.java")).q("SubscriptionUtilsAsOfLMR1: Missing permissions, returning empty device id");
            return "";
        }
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final String r() {
        try {
            try {
                return (String) M("getNetworkCountryIsoForSubscription");
            } catch (NoSuchMethodException e) {
                alvg i = c.i();
                i.V(1, TimeUnit.MINUTES);
                i.X(ydl.t, Integer.valueOf(this.e));
                ((alvg) ((alvg) i.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfLMR1", "getNetworkCountry", 205, "SubscriptionUtilsAsOfLMR1.java")).q("SubscriptionUtilsAsOfLMR1: Platform does not have API to get network country");
                return "";
            }
        } catch (NoSuchMethodException unused) {
            return (String) M("getNetworkCountryIso");
        }
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final String s() {
        try {
            return (String) M("getNetworkOperatorName");
        } catch (NoSuchMethodException e) {
            alvg i = c.i();
            i.V(1, TimeUnit.MINUTES);
            i.X(ydl.t, Integer.valueOf(this.e));
            ((alvg) ((alvg) i.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfLMR1", "getNetworkOperatorName", 161, "SubscriptionUtilsAsOfLMR1.java")).q("SubscriptionUtilsAsOfLMR1: Platform does not have API to get network operator");
            return null;
        }
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final String t() {
        CharSequence charSequence;
        TelephonyManager createForSubscriptionId;
        CharSequence simCarrierIdName;
        TelephonyManager createForSubscriptionId2;
        String str;
        TelephonyManager telephonyManager = this.d;
        int i = this.e;
        SubscriptionInfo J = J();
        if (J != null) {
            yka ykaVar = this.f;
            String str2 = null;
            if (yyb.aE()) {
                ContentResolver contentResolver = ykaVar.b.getContentResolver();
                if (contentResolver != null && ykaVar.c.i()) {
                    createForSubscriptionId2 = telephonyManager.createForSubscriptionId(i);
                    try {
                        str = createForSubscriptionId2.getSubscriberId();
                    } catch (SecurityException e) {
                        alvg j = yka.a.j();
                        j.V(1, TimeUnit.MINUTES);
                        ((alvg) ((alvg) j.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionNameHelper", "getSubscriberId", 161, "SubscriptionNameHelper.java")).q("SubscriptionNameHelper: telephonyManagerForSubscriptionId failed to getSubscriberId");
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        charSequence = Settings.Global.getString(contentResolver, "sim_card_name_".concat(String.valueOf(yka.a(str))));
                        if (TextUtils.isEmpty(charSequence)) {
                            charSequence = Settings.Global.getString(contentResolver, "sim_card_name_".concat(String.valueOf(str)));
                            xyo d = yka.a.d();
                            d.H("Non-encoded subscriber name discovered:");
                            d.H(charSequence);
                            d.q();
                        } else {
                            xyo d2 = yka.a.d();
                            d2.H("Subscriber name discovered:");
                            d2.H(charSequence);
                            d2.q();
                        }
                        xyo d3 = yka.a.d();
                        d3.H("Subscription name determined as:");
                        d3.H(charSequence);
                        d3.z("manufacturer", Build.MANUFACTURER);
                        d3.q();
                    } else {
                        yka.a.m("Subscriber ID is null. Cannot access subscription name");
                    }
                }
                charSequence = null;
                xyo d32 = yka.a.d();
                d32.H("Subscription name determined as:");
                d32.H(charSequence);
                d32.z("manufacturer", Build.MANUFACTURER);
                d32.q();
            } else {
                charSequence = null;
            }
            if (yka.c(charSequence)) {
                charSequence = J.getDisplayName();
                xyo d4 = yka.a.d();
                d4.H("Fall back to subInfo.getDisplayName:");
                d4.H(charSequence);
                d4.q();
            }
            if (yhx.b && yka.c(charSequence)) {
                if (!yhx.f || ykaVar.b.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription")) {
                    createForSubscriptionId = telephonyManager.createForSubscriptionId(i);
                    simCarrierIdName = createForSubscriptionId.getSimCarrierIdName();
                    if (simCarrierIdName != null) {
                        str2 = simCarrierIdName.toString();
                    }
                }
                xyo d5 = yka.a.d();
                d5.H("Fall back to mvno name:");
                d5.H(str2);
                d5.q();
                charSequence = str2;
            }
            if (yyb.aG() && yka.c(charSequence)) {
                charSequence = J.getCarrierName();
                if (!TextUtils.isEmpty(charSequence)) {
                    xyo d6 = yka.a.d();
                    d6.H("Fall back to carrier name for Samsung:");
                    d6.H(charSequence);
                    d6.q();
                    return charSequence.toString();
                }
            }
            if (yka.c(charSequence)) {
                xyo d7 = yka.a.d();
                d7.H("Current subscription name is system default:");
                d7.H(charSequence);
                d7.q();
                charSequence = yka.b(telephonyManager, i);
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = J.getCarrierName();
                xyo d8 = yka.a.d();
                d8.H("Fell back to carrier name:");
                d8.H(charSequence);
                d8.q();
            }
            if (!TextUtils.isEmpty(charSequence)) {
                return charSequence.toString();
            }
        }
        return yka.b(telephonyManager, i);
    }

    public final String toString() {
        return o().toString();
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final String u() {
        SubscriptionInfo J = J();
        if (J == null) {
            return "";
        }
        return J.getCountryIso();
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final String v(Locale locale) {
        SubscriptionInfo J = J();
        if (J != null) {
            String countryIso = J.getCountryIso();
            if (!TextUtils.isEmpty(countryIso)) {
                return countryIso.toUpperCase(locale);
            }
            return "";
        }
        return "";
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final String w() {
        try {
            try {
                return (String) M("getSimOperatorNameForSubscription");
            } catch (NoSuchMethodException e) {
                alvg i = c.i();
                i.V(1, TimeUnit.MINUTES);
                i.X(ydl.t, Integer.valueOf(this.e));
                ((alvg) ((alvg) i.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsAsOfLMR1", "getSimOperatorName", 117, "SubscriptionUtilsAsOfLMR1.java")).q("SubscriptionUtilsAsOfLMR1: Platform does not have API to get sim operator");
                return null;
            }
        } catch (NoSuchMethodException unused) {
            return (String) M("getSimOperatorName");
        }
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final String x() {
        Context context = this.i.g().b;
        int[] H = H();
        return String.format(dzf.c(context.getResources().getConfiguration()).f(0), "%03d%03d", Integer.valueOf(H[0]), Integer.valueOf(H[1]));
    }

    @Override // defpackage.yjn, defpackage.ykb
    public final String y() {
        SubscriptionInfo J = J();
        if (J != null) {
            return J.getIccId();
        }
        xyo c2 = c.c();
        c2.H("getSimSerialNumber: system returned empty sub info for ");
        c2.l(this.e);
        c2.q();
        return "";
    }
}
