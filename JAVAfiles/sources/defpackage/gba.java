package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gba {
    public static final gba a;
    public final gaz b;
    public final gaz c;
    public final gaz d;
    public final boolean e;

    static {
        gay gayVar = gay.b;
        a = new gba(gayVar, gayVar, gayVar);
    }

    public gba(gaz gazVar, gaz gazVar2, gaz gazVar3) {
        gazVar.getClass();
        gazVar2.getClass();
        gazVar3.getClass();
        this.b = gazVar;
        this.c = gazVar2;
        this.d = gazVar3;
        boolean z = true;
        if (!(gazVar instanceof gaw) && !(gazVar3 instanceof gaw) && !(gazVar2 instanceof gaw)) {
            z = false;
        }
        this.e = z;
    }

    public static /* synthetic */ gba a(gba gbaVar, gaz gazVar, gaz gazVar2, gaz gazVar3, int i) {
        if ((i & 1) != 0) {
            gazVar = gbaVar.b;
        }
        if ((i & 2) != 0) {
            gazVar2 = gbaVar.c;
        }
        if ((i & 4) != 0) {
            gazVar3 = gbaVar.d;
        }
        gazVar.getClass();
        gazVar2.getClass();
        gazVar3.getClass();
        return new gba(gazVar, gazVar2, gazVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gba)) {
            return false;
        }
        gba gbaVar = (gba) obj;
        if (d.F(this.b, gbaVar.b) && d.F(this.c, gbaVar.c) && d.F(this.d, gbaVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.b + ", prepend=" + this.c + ", append=" + this.d + ')';
    }
}
