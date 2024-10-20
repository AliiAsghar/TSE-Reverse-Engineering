package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoaa extends anme {
    public final anzz e;
    public final anzz f;
    private final Integer g;
    private final Integer h;
    private final Integer i;
    private final Integer j;

    public aoaa(Integer num, Integer num2, anzz anzzVar, anzz anzzVar2, Integer num3, Integer num4) {
        super((byte[]) null);
        this.g = num;
        this.h = num2;
        this.e = anzzVar;
        this.f = anzzVar2;
        this.i = num3;
        this.j = num4;
    }

    public final int F() {
        return this.j.intValue();
    }

    public final int G() {
        return this.h.intValue();
    }

    public final int H() {
        return this.i.intValue();
    }

    public final int I() {
        return this.g.intValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aoaa)) {
            return false;
        }
        aoaa aoaaVar = (aoaa) obj;
        if (aoaaVar.I() != I() || aoaaVar.G() != G() || aoaaVar.e != this.e || aoaaVar.f != this.f || aoaaVar.H() != H() || aoaaVar.F() != F()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(aoaa.class, this.g, this.h, this.e, this.f, this.i, this.j);
    }

    public final String toString() {
        anzz anzzVar = this.e;
        return "AesCtrHmacStreaming Parameters (IKM size: " + this.g + ", " + this.h + "-byte AES key, " + String.valueOf(anzzVar) + " for HKDF, " + String.valueOf(anzzVar) + " for HMAC, " + this.i + "-byte tags, " + this.j + "-byte ciphertexts)";
    }
}
