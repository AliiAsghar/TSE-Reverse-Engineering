package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmj {
    public final cga a;
    public final hld b;

    public hmj(hld hldVar, cga cgaVar) {
        cgaVar.getClass();
        this.b = hldVar;
        this.a = cgaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmj)) {
            return false;
        }
        hmj hmjVar = (hmj) obj;
        if (d.F(this.b, hmjVar.b) && d.F(this.a, hmjVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "SizeAndModifier(size=" + this.b + ", modifier=" + this.a + ")";
    }
}
