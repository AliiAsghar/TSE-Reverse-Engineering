package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgw {
    public final arqg a;
    public final arqg b;
    public final boolean c;

    public dgw(arqg arqgVar, arqg arqgVar2, boolean z) {
        this.a = arqgVar;
        this.b = arqgVar2;
        this.c = z;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.a.a()).floatValue() + ", maxValue=" + ((Number) this.b.a()).floatValue() + ", reverseScrolling=" + this.c + ')';
    }
}
