package defpackage;

import android.content.Context;
import android.provider.Settings;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yjr implements xzh {
    public static final xze a = xze.g("Bugle", "BuglePhoneNumberUtils");
    private static final xyw g = new xyw(TimeUnit.SECONDS.toMillis(10));
    private static final xyw h = new xyw(TimeUnit.SECONDS.toMillis(10));
    private static final alhr i = albo.D(new xyn(9));
    public final Context b;
    public final armf c;
    public final apwt d;
    public final armf e;
    public final armf f;
    private final yju k;
    private final tm j = new tm();
    private final alhr l = albo.D(new xyn(10));

    public yjr(Context context, armf armfVar, armf armfVar2, armf armfVar3, yju yjuVar, apwt apwtVar) {
        this.b = context;
        this.c = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.k = yjuVar;
        this.d = apwtVar;
        xyl.l(context);
    }

    private final tm I(String str) {
        if (str == null) {
            str = "";
        }
        tm tmVar = (tm) this.j.get(str);
        if (tmVar == null) {
            tm tmVar2 = new tm();
            this.j.put(str, tmVar2);
            return tmVar2;
        }
        return tmVar;
    }

    public final boolean A(String str) {
        if (agkx.ae(str)) {
            return false;
        }
        return str.equals(p(str, "", aorv.ZZ.eW, false));
    }

    @Deprecated
    public final boolean B() {
        return ((yjv) this.e.b()).f();
    }

    @Deprecated
    public final boolean C(String str) {
        try {
            return ((anhn) this.d.b()).k(D(str, ""));
        } catch (anhk unused) {
            return false;
        }
    }

    public final aodz D(String str, String str2) {
        return ((anhn) this.d.b()).o(((Pattern) i.get()).matcher(str).replaceAll(""), str2);
    }

    public final String E(aodz aodzVar, anhl anhlVar) {
        return ((anhn) this.d.b()).e(aodzVar, anhlVar);
    }

    public final String F(aodz aodzVar) {
        return ((anhn) this.d.b()).g(aodzVar);
    }

    public final boolean G(aodz aodzVar) {
        return ((anhn) this.d.b()).j(aodzVar);
    }

    public final int H(aodz aodzVar) {
        return ((anhn) this.d.b()).m(aodzVar);
    }

    public final yjt a(String str) {
        return new yjt(((anhn) this.d.b()).a(str));
    }

    public final alpt b() {
        return (alpt) Collection.EL.stream(((yjy) this.f.b()).l()).map(new yec(this, 10)).flatMap(new ybe(16)).collect(alls.b);
    }

    public final Optional c(String str) {
        try {
            return Optional.of(new yjt(D(str, "").c()));
        } catch (anhk unused) {
            return Optional.empty();
        }
    }

    public final Optional d(String str, String str2) {
        try {
            return Optional.of(new yjt(D(str, str2).c()));
        } catch (anhk unused) {
            return Optional.empty();
        }
    }

    public final Optional e() {
        String simOperator;
        TelephonyManager telephonyManager = (TelephonyManager) ((yjv) this.e.b()).d.get();
        if (telephonyManager == null) {
            simOperator = null;
        } else {
            simOperator = telephonyManager.getSimOperator();
        }
        if (!TextUtils.isEmpty(simOperator) && simOperator.length() >= 5) {
            if (simOperator.length() == 6) {
                return Optional.of(simOperator);
            }
            return Optional.of(String.format(Locale.US, "%03d%03d", Integer.valueOf(Integer.parseInt(simOperator.substring(0, 3))), Integer.valueOf(Integer.parseInt(simOperator.substring(3)))));
        }
        return Optional.empty();
    }

    public final Optional f() {
        if (aczf.O()) {
            return Optional.ofNullable(albo.af(m()));
        }
        armf armfVar = this.c;
        armfVar.getClass();
        String b = ((yjo) armfVar.b()).b();
        if (yyb.an(b)) {
            b = n();
        }
        return Optional.ofNullable(albo.af(b));
    }

    public final String g(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return String.format(dzf.c(this.b.getResources().getConfiguration()).f(0), "%03d%03d", Integer.valueOf(Integer.parseInt(str)), Integer.valueOf(Integer.parseInt(str2)));
            } catch (NumberFormatException unused) {
            }
        }
        xyo e = a.e();
        e.H("canonicalizeMccMnc: invalid mccmnc.");
        e.z("mcc", str);
        e.z("mnc", str2);
        e.q();
        return String.valueOf(str).concat(String.valueOf(str2));
    }

    @Deprecated
    public final String h(String str) {
        return u(str, anhl.INTERNATIONAL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String i(String str) {
        return str.toUpperCase(dzf.c(this.b.getResources().getConfiguration()).f(0));
    }

    @Deprecated
    public final String j(String str) {
        yjt a2;
        anhl anhlVar;
        xyl.l(this.c);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int a3 = ((yjo) this.c.b()).a();
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (Character.isDigit(str.charAt(i3))) {
                i2++;
            }
        }
        if (i2 < a3) {
            return str;
        }
        String m = m();
        if (aczf.O() && m.isEmpty()) {
            a2 = new yjt(0);
        } else {
            a2 = a(m);
        }
        try {
            aodz D = D(str, m);
            yjt yjtVar = new yjt(D.c());
            if (!a2.a() && yjtVar.equals(a2)) {
                anhlVar = anhl.NATIONAL;
            } else {
                anhlVar = anhl.INTERNATIONAL;
            }
            String e = ((anhn) this.d.b()).e(D, anhlVar);
            xyo d = a.d();
            d.J(h, str);
            d.H("format for display.");
            d.j(str);
            d.H("-->");
            d.j(e);
            d.z("systemCountry", m);
            d.z("systemCountryCode", a2);
            d.z("callCode", yjtVar);
            d.z("phoneNumberFormat", anhlVar);
            d.q();
            return e;
        } catch (anhk e2) {
            xyo e3 = a.e();
            e3.H("formatForDisplay: invalid phone number");
            e3.j(str);
            e3.H("with country");
            e3.H(m);
            e3.r(e2);
            return str;
        }
    }

    @Deprecated
    public final String k() {
        return ((yjv) this.e.b()).a();
    }

    @Override // defpackage.xzh
    public final void l(int i2) {
        synchronized (this.j) {
            this.j.clear();
            ((anhn) this.d.b()).n();
        }
    }

    public final String m() {
        xyl.l(this.c);
        String b = ((yjo) this.c.b()).b();
        if (yyb.an(b)) {
            if (aczf.O()) {
                return this.k.b();
            }
            return this.k.c();
        }
        return b;
    }

    public final String n() {
        Locale f = dzf.c(this.b.getResources().getConfiguration()).f(0);
        String country = f.getCountry();
        if (TextUtils.isEmpty(country)) {
            return null;
        }
        return country.toUpperCase(f);
    }

    public final String o(String str, String str2) {
        return p(str, str, str2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String p(java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            r8 = this;
            tm r0 = r8.j
            monitor-enter(r0)
            tm r1 = r8.I(r11)     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r1 = r1.get(r9)     // Catch: java.lang.Throwable -> Ld1
            yjq r1 = (defpackage.yjq) r1     // Catch: java.lang.Throwable -> Ld1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            if (r1 != 0) goto Lbf
            apwt r0 = r8.d
            java.lang.Object r0 = r0.b()
            anhn r0 = (defpackage.anhn) r0
            r1 = 0
            java.lang.String r2 = defpackage.albo.af(r11)     // Catch: defpackage.anhk -> L83
            aodz r2 = r8.D(r9, r2)     // Catch: defpackage.anhk -> L83
            alhr r3 = r8.l     // Catch: defpackage.anhk -> L83
            java.lang.Object r3 = r3.get()     // Catch: defpackage.anhk -> L83
            alpt r3 = (defpackage.alpt) r3     // Catch: defpackage.anhk -> L83
            boolean r3 = r3.isEmpty()     // Catch: defpackage.anhk -> L83
            r4 = 1
            if (r3 != 0) goto L5a
            boolean r3 = r2.f()     // Catch: defpackage.anhk -> L83
            if (r3 != 0) goto L37
            goto L5a
        L37:
            yjt r3 = new yjt     // Catch: defpackage.anhk -> L83
            int r5 = r2.c()     // Catch: defpackage.anhk -> L83
            r3.<init>(r5)     // Catch: defpackage.anhk -> L83
            java.lang.String r3 = r8.s(r3)     // Catch: defpackage.anhk -> L83
            alhr r5 = r8.l     // Catch: defpackage.anhk -> L83
            java.lang.Object r5 = r5.get()     // Catch: defpackage.anhk -> L83
            alpt r5 = (defpackage.alpt) r5     // Catch: defpackage.anhk -> L83
            boolean r3 = r5.contains(r3)     // Catch: defpackage.anhk -> L83
            if (r3 == 0) goto L5a
            boolean r3 = r8.G(r2)     // Catch: defpackage.anhk -> L83
            if (r3 == 0) goto L5a
            r3 = r4
            goto L5b
        L5a:
            r3 = r1
        L5b:
            int r5 = r8.H(r2)     // Catch: defpackage.anhk -> L83
            if (r5 != r4) goto L63
            r5 = r4
            goto L64
        L63:
            r5 = r1
        L64:
            yjp r6 = new yjp     // Catch: defpackage.anhk -> L83
            r6.<init>()     // Catch: defpackage.anhk -> L83
            anhl r7 = defpackage.anhl.E164     // Catch: defpackage.anhk -> L83
            java.lang.String r0 = r0.e(r2, r7)     // Catch: defpackage.anhk -> L83
            r6.b(r0)     // Catch: defpackage.anhk -> L83
            if (r3 != 0) goto L78
            if (r5 == 0) goto L77
            goto L78
        L77:
            r4 = r1
        L78:
            r6.d(r4)     // Catch: defpackage.anhk -> L83
            r6.c(r5)     // Catch: defpackage.anhk -> L83
            yjq r0 = r6.a()     // Catch: defpackage.anhk -> L83
            goto Laf
        L83:
            r0 = move-exception
            xze r2 = defpackage.yjr.a
            xyo r2 = r2.a()
            java.lang.String r3 = "Not able to parse phone number"
            r2.H(r3)
            r2.j(r9)
            java.lang.String r3 = "for country"
            r2.H(r3)
            r2.H(r11)
            r2.r(r0)
            yjp r0 = new yjp
            r0.<init>()
            r0.b(r9)
            r0.d(r1)
            r0.c(r1)
            yjq r0 = r0.a()
        Laf:
            r1 = r0
            tm r0 = r8.j
            monitor-enter(r0)
            tm r11 = r8.I(r11)     // Catch: java.lang.Throwable -> Lbc
            r11.put(r9, r1)     // Catch: java.lang.Throwable -> Lbc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            goto Lbf
        Lbc:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            throw r9
        Lbf:
            boolean r9 = r1.b
            if (r9 != 0) goto Lce
            if (r12 != 0) goto Lc6
            return r10
        Lc6:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Phone number could not be normalized"
            r9.<init>(r10)
            throw r9
        Lce:
            java.lang.String r9 = r1.a
            return r9
        Ld1:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yjr.p(java.lang.String, java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    public final String q(String str) {
        return o(str, m());
    }

    public final String r(String str, boolean z) {
        return p(str, str, (String) f().orElse(aorv.ZZ.eW), z);
    }

    public final String s(yjt yjtVar) {
        return ((anhn) this.d.b()).b(yjtVar.a);
    }

    public final String t() {
        return this.k.c();
    }

    public final String u(String str, anhl anhlVar) {
        xyo d = a.d();
        d.J(g, str);
        d.H("format if normalized.");
        d.j(str);
        d.z("format", anhlVar);
        d.q();
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return ((anhn) this.d.b()).e(D(str, null), anhlVar);
        } catch (anhk unused) {
            return str;
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [msh, java.lang.Object] */
    public final HashSet v() {
        String str;
        HashSet hashSet = new HashSet();
        Iterator it = ((yjy) this.f.b()).l().iterator();
        while (it.hasNext()) {
            Optional j = ((yjy) this.f.b()).h(((ykb) it.next()).a()).j(true);
            if (j.isPresent()) {
                str = albo.ag(j.get().g());
            } else {
                str = "";
            }
            hashSet.add(str);
        }
        return hashSet;
    }

    @Deprecated
    public final boolean w() {
        if (Settings.Global.getInt(((yjv) this.e.b()).b.getContentResolver(), "airplane_mode_on", 0) == 0) {
            return false;
        }
        return true;
    }

    @Deprecated
    public final boolean x() {
        TelephonyManager telephonyManager = (TelephonyManager) ((yjv) this.e.b()).d.get();
        if (telephonyManager != null && telephonyManager.getPhoneType() == 2) {
            return true;
        }
        return false;
    }

    @Deprecated
    public final boolean y() {
        return ((yjv) this.e.b()).d();
    }

    @Deprecated
    public final boolean z(String str) {
        try {
            return PhoneNumberUtils.isEmergencyNumber(str);
        } catch (Exception e) {
            a.n("isEmergencyNumber: unexpected exception", e);
            return false;
        }
    }
}
