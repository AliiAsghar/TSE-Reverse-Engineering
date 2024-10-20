package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class annu extends anme {
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final annt i;
    public final anns j;

    public annu(int i, int i2, int i3, int i4, annt anntVar, anns annsVar) {
        super((byte[]) null);
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = anntVar;
        this.j = annsVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof annu)) {
            return false;
        }
        annu annuVar = (annu) obj;
        if (annuVar.e != this.e || annuVar.f != this.f || annuVar.g != this.g || annuVar.h != this.h || annuVar.i != this.i || annuVar.j != this.j) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(annu.class, Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, this.j);
    }

    @Override // defpackage.anme
    public final boolean j() {
        if (this.i != annt.c) {
            return true;
        }
        return false;
    }

    public final String toString() {
        anns annsVar = this.j;
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.i) + ", hashType: " + String.valueOf(annsVar) + ", " + this.g + "-byte IV, and " + this.h + "-byte tags, and " + this.e + "-byte AES key, and " + this.f + "-byte HMAC key)";
    }
}
