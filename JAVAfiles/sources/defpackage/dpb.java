package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpb {
    public final Locale a;

    public dpb(Locale locale) {
        this.a = locale;
    }

    public final String a() {
        return this.a.toLanguageTag();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dpb)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d.F(a(), ((dpb) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
