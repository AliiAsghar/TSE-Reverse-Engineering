package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alah extends alar {
    private final Optional a;
    private final Optional b;

    public alah() {
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
        if (obj instanceof alah) {
            alah alahVar = (alah) obj;
            if (this.a.equals(alahVar.a) && this.b.equals(alahVar.b)) {
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
        return "OrderItem{id=" + String.valueOf(this.a) + ", name=" + String.valueOf(optional) + "}";
    }

    public alah(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }
}
