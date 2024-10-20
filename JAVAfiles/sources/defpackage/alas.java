package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alas extends alar {
    public final Optional a;
    public final Optional b;
    private final Optional c;
    private final Optional d;

    public alas() {
        throw null;
    }

    @Override // defpackage.alar
    public final Optional a() {
        return this.c;
    }

    @Override // defpackage.alar
    public final Optional b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alas) {
            alas alasVar = (alas) obj;
            if (this.c.equals(alasVar.c) && this.d.equals(alasVar.d) && this.a.equals(alasVar.a) && this.b.equals(alasVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        Optional optional2 = this.a;
        Optional optional3 = this.d;
        return "Timer{id=" + String.valueOf(this.c) + ", name=" + String.valueOf(optional3) + ", duration=" + String.valueOf(optional2) + ", timerStatus=" + String.valueOf(optional) + "}";
    }

    public alas(Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        this.c = optional;
        this.d = optional2;
        this.a = optional3;
        this.b = optional4;
    }
}
