package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class artb extends arta implements arsz<Integer> {
    public static final artb d = new artb(1, 0);

    public artb(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // defpackage.arta, defpackage.arsz
    public final boolean a() {
        if (this.a > this.b) {
            return true;
        }
        return false;
    }

    public final Integer c() {
        return Integer.valueOf(this.b);
    }

    public final Integer d() {
        return Integer.valueOf(this.a);
    }

    public final boolean e(int i) {
        if (this.a <= i && i <= this.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.arta
    public final boolean equals(Object obj) {
        if (!(obj instanceof artb)) {
            return false;
        }
        if (a() && ((artb) obj).a()) {
            return true;
        }
        artb artbVar = (artb) obj;
        if (this.a != artbVar.a || this.b != artbVar.b) {
            return false;
        }
        return true;
    }

    @Override // defpackage.arta
    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.arta
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
