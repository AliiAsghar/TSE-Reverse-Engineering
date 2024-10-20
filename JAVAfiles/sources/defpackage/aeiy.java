package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeiy {
    public final float a;
    public final arqr b;
    public final arqg c;

    public aeiy(float f, arqr arqrVar, arqg arqgVar) {
        arqrVar.getClass();
        arqgVar.getClass();
        this.a = f;
        this.b = arqrVar;
        this.c = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeiy)) {
            return false;
        }
        aeiy aeiyVar = (aeiy) obj;
        if (Float.compare(this.a, aeiyVar.a) == 0 && d.F(this.b, aeiyVar.b) && d.F(this.c, aeiyVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SeekbarUiData(progress=" + this.a + ", onSeek=" + this.b + ", onSeekFinished=" + this.c + ")";
    }
}
