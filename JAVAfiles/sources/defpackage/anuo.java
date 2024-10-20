package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anuo extends anme {
    public final int e;
    public final int f;
    public final anun g;

    public anuo(int i, int i2, anun anunVar) {
        super((int[]) null);
        this.e = i;
        this.f = i2;
        this.g = anunVar;
    }

    public final int F() {
        anun anunVar = this.g;
        if (anunVar == anun.d) {
            return this.f;
        }
        if (anunVar == anun.a || anunVar == anun.b || anunVar == anun.c) {
            return this.f + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anuo)) {
            return false;
        }
        anuo anuoVar = (anuo) obj;
        if (anuoVar.e != this.e || anuoVar.F() != F() || anuoVar.g != this.g) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(anuo.class, Integer.valueOf(this.e), Integer.valueOf(this.f), this.g);
    }

    @Override // defpackage.anme
    public final boolean j() {
        if (this.g != anun.d) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.g) + ", " + this.f + "-byte tags, and " + this.e + "-byte key)";
    }
}
