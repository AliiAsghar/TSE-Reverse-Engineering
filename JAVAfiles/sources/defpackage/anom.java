package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anom extends anme {
    public final anol e;

    public anom(anol anolVar) {
        super((byte[]) null);
        this.e = anolVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anom) || ((anom) obj).e != this.e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(anom.class, this.e);
    }

    @Override // defpackage.anme
    public final boolean j() {
        if (this.e != anol.c) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.e.d + ")";
    }
}
