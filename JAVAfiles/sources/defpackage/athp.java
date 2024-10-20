package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class athp implements Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    protected abstract long a();

    protected atfu b() {
        throw null;
    }

    public abstract atfw c();

    public final int d() {
        return c().a(a());
    }

    public final String e(Locale locale) {
        return c().l(a(), locale);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof athp)) {
            return false;
        }
        athp athpVar = (athp) obj;
        if (d() == athpVar.d() && g().equals(athpVar.g()) && atow.r(b(), athpVar.b())) {
            return true;
        }
        return false;
    }

    public final String f(Locale locale) {
        return c().n(a(), locale);
    }

    public final atfy g() {
        return c().p();
    }

    public final int hashCode() {
        return (d() * 17) + g().hashCode() + b().hashCode();
    }

    public final String toString() {
        return "Property[" + c().o() + "]";
    }
}
