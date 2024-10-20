package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeko {
    public final float a;
    public final arqr b;
    public final arqg c;

    public aeko() {
        this(brg.a, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeko)) {
            return false;
        }
        aeko aekoVar = (aeko) obj;
        if (Float.compare(this.a, aekoVar.a) == 0 && d.F(this.b, aekoVar.b) && d.F(this.c, aekoVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "PlaybackUiData(progress=" + this.a + ", onSeek=" + this.b + ", onSeekFinished=" + this.c + ")";
    }

    public aeko(float f, arqr arqrVar, arqg arqgVar) {
        this.a = f;
        this.b = arqrVar;
        this.c = arqgVar;
    }

    public /* synthetic */ aeko(float f, int i) {
        this(1 == (i & 1) ? brg.a : f, aedh.f, accd.k);
    }
}
