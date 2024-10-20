package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anoe extends anme {
    public final int e;
    public final int f;
    public final int g;
    public final anod h;

    public anoe(int i, anod anodVar) {
        super((byte[]) null);
        this.e = i;
        this.f = 12;
        this.g = 16;
        this.h = anodVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anoe)) {
            return false;
        }
        anoe anoeVar = (anoe) obj;
        if (anoeVar.e == this.e) {
            int i = anoeVar.f;
            int i2 = anoeVar.g;
            if (anoeVar.h == this.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(anoe.class, Integer.valueOf(this.e), 12, 16, this.h);
    }

    @Override // defpackage.anme
    public final boolean j() {
        if (this.h != anod.c) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.h) + ", 12-byte IV, 16-byte tag, and " + this.e + "-byte key)";
    }
}
