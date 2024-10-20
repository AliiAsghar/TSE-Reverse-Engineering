package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akzc {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final Optional d;

    public akzc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akzc) {
            akzc akzcVar = (akzc) obj;
            if (this.a.equals(akzcVar.a) && this.b.equals(akzcVar.b) && this.c.equals(akzcVar.c) && this.d.equals(akzcVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        Optional optional2 = this.c;
        Optional optional3 = this.b;
        return "Property{recipient=" + String.valueOf(this.a) + ", message=" + String.valueOf(optional3) + ", messagePosition=" + String.valueOf(optional2) + ", messageMode=" + String.valueOf(optional) + "}";
    }

    public akzc(Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
    }
}
