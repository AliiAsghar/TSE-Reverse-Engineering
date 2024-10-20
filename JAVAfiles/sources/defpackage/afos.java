package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afos extends afot {
    public final String a;
    private final int b;

    public afos(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.afot
    public final int a() {
        return this.b;
    }

    @Override // defpackage.afot
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afos)) {
            return false;
        }
        afos afosVar = (afos) obj;
        if (d.F(this.a, afosVar.a) && this.b == afosVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Header(description=" + this.a + ", categoryId=" + this.b + ")";
    }
}
