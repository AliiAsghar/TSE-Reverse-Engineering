package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anuv extends anme {
    public final int e;
    public final int f;
    public final anuu g;
    public final anut h;

    public anuv(int i, int i2, anuu anuuVar, anut anutVar) {
        super((int[]) null);
        this.e = i;
        this.f = i2;
        this.g = anuuVar;
        this.h = anutVar;
    }

    public final int F() {
        anuu anuuVar = this.g;
        if (anuuVar == anuu.d) {
            return this.f;
        }
        if (anuuVar == anuu.a || anuuVar == anuu.b || anuuVar == anuu.c) {
            return this.f + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anuv)) {
            return false;
        }
        anuv anuvVar = (anuv) obj;
        if (anuvVar.e != this.e || anuvVar.F() != F() || anuvVar.g != this.g || anuvVar.h != this.h) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(anuv.class, Integer.valueOf(this.e), Integer.valueOf(this.f), this.g, this.h);
    }

    @Override // defpackage.anme
    public final boolean j() {
        if (this.g != anuu.d) {
            return true;
        }
        return false;
    }

    public final String toString() {
        anut anutVar = this.h;
        return "HMAC Parameters (variant: " + String.valueOf(this.g) + ", hashType: " + String.valueOf(anutVar) + ", " + this.f + "-byte tags, and " + this.e + "-byte key)";
    }
}
