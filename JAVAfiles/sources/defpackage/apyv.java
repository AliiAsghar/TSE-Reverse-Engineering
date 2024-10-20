package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apyv {
    private final Class a;
    private final String b = null;

    public apyv(Class cls) {
        this.a = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apyv) {
            apyv apyvVar = (apyv) obj;
            if (Objects.equals(this.a, apyvVar.a)) {
                String str = apyvVar.b;
                if (Objects.equals(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Objects.hashCode(this.a) ^ 1000003) * 1000003) ^ Objects.hashCode(null);
    }

    public final String toString() {
        return this.a.getCanonicalName();
    }
}
