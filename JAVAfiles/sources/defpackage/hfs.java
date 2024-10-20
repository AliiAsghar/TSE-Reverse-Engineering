package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfs implements hfh {
    public final hfa a;
    public final boolean b;
    private final String c;
    private final int d;

    public hfs(String str, int i, hfa hfaVar, boolean z) {
        this.c = str;
        this.d = i;
        this.a = hfaVar;
        this.b = z;
    }

    @Override // defpackage.hfh
    public final hbz a(hbl hblVar, hbb hbbVar, hfw hfwVar) {
        return new hco(hblVar, hfwVar, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.c + ", index=" + this.d + "}";
    }
}
