package defpackage;

import j$.util.Objects;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anzg extends anme {
    public static final BigInteger e = BigInteger.valueOf(65537);
    public final int f;
    public final BigInteger g;
    public final anzf h;
    public final anze i;
    public final anze j;
    public final int k;

    public anzg(int i, BigInteger bigInteger, anzf anzfVar, anze anzeVar, anze anzeVar2, int i2) {
        super((int[]) null);
        this.f = i;
        this.g = bigInteger;
        this.h = anzfVar;
        this.i = anzeVar;
        this.j = anzeVar2;
        this.k = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anzg)) {
            return false;
        }
        anzg anzgVar = (anzg) obj;
        if (anzgVar.f != this.f || !Objects.equals(anzgVar.g, this.g) || !Objects.equals(anzgVar.h, this.h) || !Objects.equals(anzgVar.i, this.i) || !Objects.equals(anzgVar.j, this.j) || anzgVar.k != this.k) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(anzg.class, Integer.valueOf(this.f), this.g, this.h, this.i, this.j, Integer.valueOf(this.k));
    }

    @Override // defpackage.anme
    public final boolean j() {
        if (this.h != anzf.d) {
            return true;
        }
        return false;
    }

    public final String toString() {
        BigInteger bigInteger = this.g;
        anze anzeVar = this.j;
        anze anzeVar2 = this.i;
        return "RSA SSA PSS Parameters (variant: " + String.valueOf(this.h) + ", signature hashType: " + String.valueOf(anzeVar2) + ", mgf1 hashType: " + String.valueOf(anzeVar) + ", saltLengthBytes: " + this.k + ", publicExponent: " + String.valueOf(bigInteger) + ", and " + this.f + "-bit modulus)";
    }
}
