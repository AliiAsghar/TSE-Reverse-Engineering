package defpackage;

import j$.util.Objects;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anpi extends anme {
    public final anph e;
    public final int f;

    private anpi(anph anphVar, int i) {
        super((byte[]) null);
        this.e = anphVar;
        this.f = i;
    }

    public static anpi F(anph anphVar, int i) {
        if (i >= 8 && i <= 12) {
            return new anpi(anphVar, i);
        }
        throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anpi)) {
            return false;
        }
        anpi anpiVar = (anpi) obj;
        if (anpiVar.e != this.e || anpiVar.f != this.f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(anpi.class, this.e, Integer.valueOf(this.f));
    }

    @Override // defpackage.anme
    public final boolean j() {
        if (this.e != anph.b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "X-AES-GCM Parameters (variant: " + this.e.c + "salt_size_bytes: " + this.f + ")";
    }
}
