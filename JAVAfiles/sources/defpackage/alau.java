package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alau extends alar {
    private final Optional a;
    private final Optional b;

    public alau() {
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
        if (obj instanceof alau) {
            alau alauVar = (alau) obj;
            if (this.a.equals(alauVar.a) && this.b.equals(alauVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "GenericErrorStatus";
    }

    public alau(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }
}
