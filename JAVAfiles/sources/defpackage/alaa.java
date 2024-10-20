package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alaa {
    private final Optional a;
    private final String b;

    public alaa() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alaa) {
            alaa alaaVar = (alaa) obj;
            if (this.a.equals(alaaVar.a) && this.b.equals(alaaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "EntityValue{id=" + String.valueOf(this.a) + ", value=" + this.b + "}";
    }

    public alaa(Optional optional, String str) {
        this.a = optional;
        this.b = str;
    }
}
