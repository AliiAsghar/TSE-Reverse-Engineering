package defpackage;

import j$.util.Objects;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anyz extends anme {
    public static final BigInteger e = BigInteger.valueOf(65537);
    public final int f;
    public final BigInteger g;
    public final anyy h;
    public final anyx i;

    public anyz(int i, BigInteger bigInteger, anyy anyyVar, anyx anyxVar) {
        super((int[]) null);
        this.f = i;
        this.g = bigInteger;
        this.h = anyyVar;
        this.i = anyxVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anyz)) {
            return false;
        }
        anyz anyzVar = (anyz) obj;
        if (anyzVar.f != this.f || !Objects.equals(anyzVar.g, this.g) || anyzVar.h != this.h || anyzVar.i != this.i) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(anyz.class, Integer.valueOf(this.f), this.g, this.h, this.i);
    }

    @Override // defpackage.anme
    public final boolean j() {
        if (this.h != anyy.d) {
            return true;
        }
        return false;
    }

    public final String toString() {
        BigInteger bigInteger = this.g;
        anyx anyxVar = this.i;
        return "RSA SSA PKCS1 Parameters (variant: " + String.valueOf(this.h) + ", hashType: " + String.valueOf(anyxVar) + ", publicExponent: " + String.valueOf(bigInteger) + ", and " + this.f + "-bit modulus)";
    }
}
