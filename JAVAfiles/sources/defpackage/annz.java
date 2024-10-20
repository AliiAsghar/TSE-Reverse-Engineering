package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class annz extends anme {
    public final int e;
    public final int f;
    public final int g;
    public final anny h;

    public annz(int i, int i2, anny annyVar) {
        super((byte[]) null);
        this.e = i;
        this.f = i2;
        this.g = 16;
        this.h = annyVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof annz)) {
            return false;
        }
        annz annzVar = (annz) obj;
        if (annzVar.e == this.e && annzVar.f == this.f) {
            int i = annzVar.g;
            if (annzVar.h == this.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(annz.class, Integer.valueOf(this.e), Integer.valueOf(this.f), 16, this.h);
    }

    @Override // defpackage.anme
    public final boolean j() {
        if (this.h != anny.c) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.h) + ", " + this.f + "-byte IV, 16-byte tag, and " + this.e + "-byte key)";
    }
}
