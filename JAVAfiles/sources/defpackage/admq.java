package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class admq {
    public final String a;
    public final Optional b;

    public admq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof admq) {
            admq admqVar = (admq) obj;
            if (this.a.equals(admqVar.a) && this.b.equals(admqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ConfigurationUpdate{simId=" + this.a + ", optionalConfiguration=" + this.b.toString() + "}";
    }

    public admq(String str, Optional optional) {
        if (str == null) {
            throw new NullPointerException("Null simId");
        }
        this.a = str;
        this.b = optional;
    }
}
