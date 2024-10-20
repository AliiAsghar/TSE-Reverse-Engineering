package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzi {
    public final ascv a;
    public final asai b;
    public final ascv c;
    public final ascv d;
    public final ascv e;
    public final ascv f;
    public final ascv g;
    public final arqr h;
    public final arqv i;
    public final arqg j;

    public yzi(ascv ascvVar, asai asaiVar, ascv ascvVar2, ascv ascvVar3, ascv ascvVar4, ascv ascvVar5, ascv ascvVar6, arqr arqrVar, arqv arqvVar, arqg arqgVar) {
        ascvVar.getClass();
        asaiVar.getClass();
        ascvVar2.getClass();
        ascvVar3.getClass();
        ascvVar4.getClass();
        ascvVar6.getClass();
        this.a = ascvVar;
        this.b = asaiVar;
        this.c = ascvVar2;
        this.d = ascvVar3;
        this.e = ascvVar4;
        this.f = ascvVar5;
        this.g = ascvVar6;
        this.h = arqrVar;
        this.i = arqvVar;
        this.j = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzi)) {
            return false;
        }
        yzi yziVar = (yzi) obj;
        if (d.F(this.a, yziVar.a) && d.F(this.b, yziVar.b) && d.F(this.c, yziVar.c) && d.F(this.d, yziVar.d) && d.F(this.e, yziVar.e) && d.F(this.f, yziVar.f) && d.F(this.g, yziVar.g) && d.F(this.h, yziVar.h) && d.F(this.i, yziVar.i) && d.F(this.j, yziVar.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    public final String toString() {
        return "ContactListUiData(favoriteFlow=" + this.a + ", contactsFlow=" + this.b + ", headerIndexFlow=" + this.c + ", createGroupFlow=" + this.d + ", chatbotDirectoryFlow=" + this.e + ", penpalUiDataFlow=" + this.f + ", groupChatsFlow=" + this.g + ", onContactListScroll=" + this.h + ", onContactListInteractive=" + this.i + ", onActivateFastScroll=" + this.j + ")";
    }
}
