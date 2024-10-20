package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoaf extends anme {
    public final aoae e;
    private final Integer f;
    private final Integer g;
    private final Integer h;

    public aoaf(Integer num, Integer num2, aoae aoaeVar, Integer num3) {
        super((byte[]) null);
        this.f = num;
        this.g = num2;
        this.e = aoaeVar;
        this.h = num3;
    }

    public final int F() {
        return this.h.intValue();
    }

    public final int G() {
        return this.g.intValue();
    }

    public final int H() {
        return this.f.intValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aoaf)) {
            return false;
        }
        aoaf aoafVar = (aoaf) obj;
        if (aoafVar.H() != H() || aoafVar.G() != G() || aoafVar.e != this.e || aoafVar.F() != F()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(aoaf.class, this.f, this.g, this.e, this.h);
    }

    public final String toString() {
        return "AesGcmHkdfStreaming Parameters (IKM size: " + this.f + ", " + this.g + "-byte AES GCM key, " + String.valueOf(this.e) + " for HKDF " + this.h + "-byte ciphertexts)";
    }
}
