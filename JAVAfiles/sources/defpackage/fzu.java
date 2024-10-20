package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzu {
    public final gaz a;
    public final gaz b;
    public final gaz c;
    public final gba d;
    public final boolean e;

    public fzu(gaz gazVar, gaz gazVar2, gaz gazVar3, gba gbaVar) {
        this.a = gazVar;
        this.b = gazVar2;
        this.c = gazVar3;
        this.d = gbaVar;
        this.e = gbaVar.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fzu fzuVar = (fzu) obj;
        if (d.F(this.a, fzuVar.a) && d.F(this.b, fzuVar.b) && d.F(this.c, fzuVar.c) && d.F(this.d, fzuVar.d) && d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ", source=" + this.d + ", mediator=null)";
    }
}
