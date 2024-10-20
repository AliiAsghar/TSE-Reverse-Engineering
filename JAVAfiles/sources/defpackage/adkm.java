package defpackage;

import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adkm {
    public volatile advp a;
    public volatile String b;
    public final Optional c;

    public adkm(String str, Optional optional) {
        this.b = str;
        this.c = optional;
    }

    private static String g(String str, Object... objArr) {
        if (objArr.length == 0) {
            return str;
        }
        return String.format(Locale.US, str, objArr);
    }

    public final void a(String str, Object... objArr) {
        advr.d(this.a, "%s [%s]", g(str, objArr), this.b);
    }

    public final void b(String str, Object... objArr) {
        advr.h(this.a, "%s [%s]", g(str, objArr), this.b);
    }

    public final void c(Throwable th, String str, Object... objArr) {
        advr.j(th, this.a, "%s [%s]", g(str, objArr), this.b);
    }

    public final void d(String str, Object... objArr) {
        advr.l(this.a, "%s [%s]", g(str, objArr), this.b);
    }

    public final void e(String str, Object... objArr) {
        advr.r(this.a, "%s [%s]", g(str, objArr), this.b);
    }

    public final void f(Throwable th, String str, Object... objArr) {
        advr.t(th, this.a, "%s [%s]", g(str, objArr), this.b);
    }

    public adkm(String str) {
        this(str, Optional.empty());
    }
}
