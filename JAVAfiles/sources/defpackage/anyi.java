package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anyi extends anme {
    public final anyg e;
    public final anye f;
    public final anyf g;
    public final anyh h;

    public anyi(anyg anygVar, anye anyeVar, anyf anyfVar, anyh anyhVar) {
        super((int[]) null);
        this.e = anygVar;
        this.f = anyeVar;
        this.g = anyfVar;
        this.h = anyhVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anyi)) {
            return false;
        }
        anyi anyiVar = (anyi) obj;
        if (anyiVar.e != this.e || anyiVar.f != this.f || anyiVar.g != this.g || anyiVar.h != this.h) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(anyi.class, this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.anme
    public final boolean j() {
        if (this.h != anyh.d) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "ECDSA Parameters (variant: " + this.h.e + ", hashType: " + this.g.d + ", encoding: " + this.e.c + ", curve: " + this.f.d + ")";
    }
}
