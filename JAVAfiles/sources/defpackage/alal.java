package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alal extends alar {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    private final Optional d;

    public alal() {
        throw null;
    }

    @Override // defpackage.alar
    public final Optional a() {
        return this.d;
    }

    @Override // defpackage.alar
    public final Optional b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alal) {
            alal alalVar = (alal) obj;
            if (this.d.equals(alalVar.d) && this.a.equals(alalVar.a) && this.b.equals(alalVar.b) && this.c.equals(alalVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        Optional optional2 = this.b;
        Optional optional3 = this.a;
        return "Person{id=" + String.valueOf(this.d) + ", name=" + String.valueOf(optional3) + ", email=" + String.valueOf(optional2) + ", telephone=" + String.valueOf(optional) + "}";
    }

    public alal(Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        this.d = optional;
        this.a = optional2;
        this.b = optional3;
        this.c = optional4;
    }
}
