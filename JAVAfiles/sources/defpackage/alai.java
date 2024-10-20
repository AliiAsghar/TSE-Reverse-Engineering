package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alai extends alar {
    private final Optional a;
    private final Optional b;

    public alai() {
        throw null;
    }

    @Override // defpackage.alar
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.alar
    public final Optional b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alai) {
            alai alaiVar = (alai) obj;
            if (this.a.equals(alaiVar.a) && this.b.equals(alaiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "Organization{id=" + String.valueOf(this.a) + ", name=" + String.valueOf(optional) + "}";
    }

    public alai(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }
}
