package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akyx {
    public final Optional a;
    private final Optional b;
    private final Optional c;
    private final Optional d;

    public akyx() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akyx) {
            akyx akyxVar = (akyx) obj;
            if (this.b.equals(akyxVar.b) && this.a.equals(akyxVar.a) && this.c.equals(akyxVar.c) && this.d.equals(akyxVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        Optional optional2 = this.c;
        Optional optional3 = this.a;
        return "Argument{recipient=" + String.valueOf(this.b) + ", message=" + String.valueOf(optional3) + ", position=" + String.valueOf(optional2) + ", messageMode=" + String.valueOf(optional) + "}";
    }

    public akyx(Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        this.b = optional;
        this.a = optional2;
        this.c = optional3;
        this.d = optional4;
    }
}
