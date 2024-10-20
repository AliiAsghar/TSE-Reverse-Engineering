package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aapn {
    public final String a;
    public final alpt b;
    public final alpt c;
    public final alpt d;
    public final alpt e;
    public final alpt f;
    public final alpt g;
    public final alpt h;
    public final alpt i;

    public aapn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aapn) {
            aapn aapnVar = (aapn) obj;
            if (this.a.equals(aapnVar.a) && this.b.equals(aapnVar.b) && this.c.equals(aapnVar.c) && this.d.equals(aapnVar.d) && this.e.equals(aapnVar.e) && this.f.equals(aapnVar.f) && this.g.equals(aapnVar.g) && this.h.equals(aapnVar.h) && this.i.equals(aapnVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        alpt alptVar = this.i;
        alpt alptVar2 = this.h;
        alpt alptVar3 = this.g;
        alpt alptVar4 = this.f;
        alpt alptVar5 = this.e;
        alpt alptVar6 = this.d;
        alpt alptVar7 = this.c;
        return "Contact{displayName=" + this.a + ", phones=" + String.valueOf(this.b) + ", emails=" + String.valueOf(alptVar7) + ", addresses=" + String.valueOf(alptVar6) + ", ims=" + String.valueOf(alptVar5) + ", organizations=" + String.valueOf(alptVar4) + ", websites=" + String.valueOf(alptVar3) + ", events=" + String.valueOf(alptVar2) + ", notes=" + String.valueOf(alptVar) + "}";
    }

    public aapn(String str, alpt alptVar, alpt alptVar2, alpt alptVar3, alpt alptVar4, alpt alptVar5, alpt alptVar6, alpt alptVar7, alpt alptVar8) {
        this.a = str;
        this.b = alptVar;
        this.c = alptVar2;
        this.d = alptVar3;
        this.e = alptVar4;
        this.f = alptVar5;
        this.g = alptVar6;
        this.h = alptVar7;
        this.i = alptVar8;
    }
}
