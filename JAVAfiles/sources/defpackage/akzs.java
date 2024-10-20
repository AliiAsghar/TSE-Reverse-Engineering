package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akzs extends alar {
    public final Optional a;
    private final Optional b;
    private final Optional c;

    public akzs() {
        throw null;
    }

    @Override // defpackage.alar
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.alar
    public final Optional b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akzs) {
            akzs akzsVar = (akzs) obj;
            if (this.b.equals(akzsVar.b) && this.c.equals(akzsVar.c) && this.a.equals(akzsVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        Optional optional = this.a;
        Optional optional2 = this.c;
        return "Alarm{id=" + String.valueOf(this.b) + ", name=" + String.valueOf(optional2) + ", schedule=" + String.valueOf(optional) + "}";
    }

    public akzs(Optional optional, Optional optional2, Optional optional3) {
        this.b = optional;
        this.c = optional2;
        this.a = optional3;
    }
}
