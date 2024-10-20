package defpackage;

import android.text.TextUtils;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yju {
    public static final xze a = xze.g("Bugle", "CountryCodeDetector");
    public final armf b;
    private String c;
    private String d;

    public yju(armf armfVar) {
        this.b = armfVar;
    }

    private final synchronized String f() {
        yjr g;
        String str;
        String u = ((yjy) this.b.b()).j().u();
        String[] strArr = {u};
        if (TextUtils.isEmpty(u)) {
            ((yjy) this.b.b()).n(new yas(this, strArr, 3));
            if (TextUtils.isEmpty(strArr[0])) {
                String n = ((yjy) this.b.b()).g().n();
                if (n == null) {
                    n = "";
                }
                strArr[0] = n;
                xyo c = a.c();
                c.H("updateHomeCountry from system locale as fallback.");
                c.z("detected country", strArr[0]);
                c.q();
            }
        }
        g = ((yjy) this.b.b()).g();
        str = strArr[0];
        str.getClass();
        return g.i(str);
    }

    private final synchronized String g(String str) {
        String r = ((yjy) this.b.b()).j().r();
        String[] strArr = {r};
        if (!TextUtils.isEmpty(r)) {
            xyo c = a.c();
            c.H("updateSmsNetworkCountry from default subscription network country.");
            c.z("detected country", strArr[0]);
            c.q();
        } else {
            ((yjy) this.b.b()).n(new yas(this, strArr, 4));
            if (TextUtils.isEmpty(strArr[0])) {
                return str;
            }
        }
        yjr g = ((yjy) this.b.b()).g();
        String str2 = strArr[0];
        str2.getClass();
        return g.i(str2);
    }

    public final synchronized Optional a(int i) {
        Optional of;
        String d = d(i);
        if (TextUtils.isEmpty(d)) {
            of = Optional.empty();
        } else {
            of = Optional.of(d);
        }
        return of;
    }

    public final synchronized String b() {
        String str;
        if (this.d == null) {
            e();
        }
        str = this.d;
        if (str == null) {
            throw new NullPointerException("homeCountry is null");
        }
        return str;
    }

    public final synchronized String c() {
        String str;
        if (this.c == null) {
            e();
        }
        str = this.c;
        if (str == null) {
            throw new IllegalStateException("smsNetworkCountry is null");
        }
        return str;
    }

    public final synchronized String d(int i) {
        String r;
        ykb h = ((yjy) this.b.b()).h(i);
        r = h.r();
        if (TextUtils.isEmpty(r)) {
            r = h.u();
            if (TextUtils.isEmpty(r) && (r = ((yjy) this.b.b()).g().n()) == null) {
                r = "";
            }
        }
        return ((yjy) this.b.b()).g().i(r);
    }

    public final synchronized void e() {
        String f = f();
        this.d = f;
        this.c = g(f);
    }
}
