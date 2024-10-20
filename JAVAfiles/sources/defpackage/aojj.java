package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aojj {
    public static volatile aojj a;
    public final Object b;

    public aojj(aozy aozyVar) {
        this.b = aozyVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final boolean A() {
        return ((asqc) this.b.b()).y("com.google.android.apps.messaging.auto 45644542").e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Set, java.lang.Object] */
    public final Set a() {
        Set unmodifiableSet;
        synchronized (this.b) {
            unmodifiableSet = DesugarCollections.unmodifiableSet(this.b);
        }
        return unmodifiableSet;
    }

    public final String b(Object obj) {
        String obj2 = obj.toString();
        boolean z = false;
        if (obj2 != null && obj2.length() != 0) {
            int length = obj2.length();
            int i = 0;
            while (true) {
                if (i < length) {
                    int codePointAt = obj2.codePointAt(i);
                    if (!Character.isLetterOrDigit(codePointAt)) {
                        break;
                    }
                    i += Character.charCount(codePointAt);
                } else {
                    z = true;
                    break;
                }
            }
        }
        albo.N(z, "Invalid key: %s", obj2);
        return ((String) this.b).concat(String.valueOf(String.valueOf(obj)));
    }

    public final Pattern c(String str) {
        Pattern pattern = (Pattern) ((aojh) this.b).e(str);
        if (pattern == null) {
            Pattern compile = Pattern.compile(str);
            ((aojh) this.b).f(str, compile);
            return compile;
        }
        return pattern;
    }

    public final void d(int i, boolean z) {
        ((aozl) this.b).l(i, z);
    }

    public final void e(int i, aozb aozbVar) {
        ((aozl) this.b).m(i, aozbVar);
    }

    public final void f(int i, double d) {
        ((aozl) this.b).aj(i, d);
    }

    public final void g(int i, int i2) {
        ((aozl) this.b).s(i, i2);
    }

    public final void h(int i, int i2) {
        ((aozl) this.b).o(i, i2);
    }

    public final void i(int i, long j) {
        ((aozl) this.b).q(i, j);
    }

    public final void j(int i, float f) {
        ((aozl) this.b).al(i, f);
    }

    public final void k(int i, Object obj, apcj apcjVar) {
        aozl aozlVar = (aozl) this.b;
        aozlVar.A(i, 3);
        apcjVar.m((apbt) obj, aozlVar.f);
        aozlVar.A(i, 4);
    }

    public final void l(int i, int i2) {
        ((aozl) this.b).s(i, i2);
    }

    public final void m(int i, long j) {
        ((aozl) this.b).D(i, j);
    }

    public final void n(int i, Object obj, apcj apcjVar) {
        ((aozl) this.b).u(i, (apbt) obj, apcjVar);
    }

    public final void o(int i, Object obj) {
        if (obj instanceof aozb) {
            ((aozl) this.b).x(i, (aozb) obj);
        } else {
            ((aozl) this.b).w(i, (apbt) obj);
        }
    }

    public final void p(int i, int i2) {
        ((aozl) this.b).o(i, i2);
    }

    public final void q(int i, long j) {
        ((aozl) this.b).q(i, j);
    }

    public final void r(int i, int i2) {
        ((aozl) this.b).ao(i, i2);
    }

    public final void s(int i, long j) {
        ((aozl) this.b).aq(i, j);
    }

    public final void t(int i, String str) {
        ((aozl) this.b).y(i, str);
    }

    public final void u(int i, int i2) {
        ((aozl) this.b).B(i, i2);
    }

    public final void v(int i, long j) {
        ((aozl) this.b).D(i, j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final boolean w() {
        return ((asqc) this.b.b()).y("com.google.android.apps.messaging.auto 45418581").e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final boolean x() {
        return ((asqc) this.b.b()).y("com.google.android.apps.messaging.auto 45613922").e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final boolean y() {
        return ((asqc) this.b.b()).y("com.google.android.apps.messaging.auto 45613990").e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final boolean z() {
        return ((asqc) this.b.b()).y("com.google.android.apps.messaging.auto 45657939").e();
    }

    public aojj(armf armfVar) {
        this.b = armfVar;
    }

    public aojj(String str) {
        this.b = str.concat("_");
    }

    public aojj() {
        this.b = new HashSet();
    }

    public aojj(aozl aozlVar) {
        d.aB(aozlVar, "output");
        this.b = aozlVar;
        aozlVar.f = this;
    }

    public aojj(byte[] bArr) {
        this.b = new aojh();
    }
}
