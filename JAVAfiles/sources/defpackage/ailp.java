package defpackage;

import j$.util.Objects;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ailp {
    private final InetAddress f() {
        String d = d();
        if (d == null) {
            return null;
        }
        return anbj.a(d);
    }

    public abstract int a();

    public abstract ailh b();

    public abstract String c();

    public abstract String d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return f() instanceof Inet6Address;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ailp)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ailp ailpVar = (ailp) obj;
        if (!Objects.equals(f(), ailpVar.f()) || !Objects.equals(c(), ailpVar.c()) || a() != ailpVar.a() || !Objects.equals(b(), ailpVar.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(f(), c(), Integer.valueOf(a()), b());
    }

    public final String toString() {
        String d = d();
        if (d == null) {
            d = "";
        }
        return String.format(Locale.US, "%s %s/%s", c(), anbi.a(d, a()), b());
    }
}
