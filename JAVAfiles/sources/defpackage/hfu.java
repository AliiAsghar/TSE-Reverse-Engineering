package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfu implements hfh {
    public final heu a;
    public final heu b;
    public final heu c;
    public final boolean d;
    public final int e;

    public hfu(int i, heu heuVar, heu heuVar2, heu heuVar3, boolean z) {
        this.e = i;
        this.a = heuVar;
        this.b = heuVar2;
        this.c = heuVar3;
        this.d = z;
    }

    @Override // defpackage.hfh
    public final hbz a(hbl hblVar, hbb hbbVar, hfw hfwVar) {
        return new hcq(hfwVar, this);
    }

    public final String toString() {
        heu heuVar = this.c;
        heu heuVar2 = this.b;
        return "Trim Path: {start: " + String.valueOf(this.a) + ", end: " + String.valueOf(heuVar2) + ", offset: " + String.valueOf(heuVar) + "}";
    }
}
