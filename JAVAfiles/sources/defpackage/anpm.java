package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anpm extends anme {
    public final anpl e;

    public anpm(anpl anplVar) {
        super((byte[]) null);
        this.e = anplVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anpm) || ((anpm) obj).e != this.e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(anpm.class, this.e);
    }

    @Override // defpackage.anme
    public final boolean j() {
        if (this.e != anpl.c) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.e.d + ")";
    }
}
