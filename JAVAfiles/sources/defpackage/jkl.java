package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jkl {
    public final ascv a;
    public final byn b;
    public final ascv c;
    public final ascv d;
    public final afhe e;
    public final jjp f;

    public jkl(ascv ascvVar, byn bynVar, ascv ascvVar2, jjp jjpVar, ascv ascvVar3, afhe afheVar) {
        this.a = ascvVar;
        this.b = bynVar;
        this.c = ascvVar2;
        this.f = jjpVar;
        this.d = ascvVar3;
        this.e = afheVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkl)) {
            return false;
        }
        jkl jklVar = (jkl) obj;
        if (d.F(this.a, jklVar.a) && d.F(this.b, jklVar.b) && d.F(this.c, jklVar.c) && d.F(this.f, jklVar.f) && d.F(this.d, jklVar.d) && d.F(this.e, jklVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.f.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "DirectSendUiData(headerUiData=" + this.a + ", currentPage=" + this.b + ", attachedMedia=" + this.c + ", cameraUiData=" + this.f + ", directSendComposeRowHolderUiData=" + this.d + ", galleryUiData=" + this.e + ")";
    }
}
