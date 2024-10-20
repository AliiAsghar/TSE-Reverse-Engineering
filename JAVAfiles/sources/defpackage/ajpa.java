package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajpa extends ajpy {
    private final Optional a;
    private final Optional b;

    public ajpa(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    @Override // defpackage.ajpy
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.ajpy
    public final Optional b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajpy) {
            ajpy ajpyVar = (ajpy) obj;
            if (this.a.equals(ajpyVar.a()) && this.b.equals(ajpyVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
