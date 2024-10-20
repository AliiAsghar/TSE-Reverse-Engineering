package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfn implements hfh {
    public final String a;
    public final heu b;
    public final heu c;
    public final hfd d;
    public final boolean e;

    public hfn(String str, heu heuVar, heu heuVar2, hfd hfdVar, boolean z) {
        this.a = str;
        this.b = heuVar;
        this.c = heuVar2;
        this.d = hfdVar;
        this.e = z;
    }

    @Override // defpackage.hfh
    public final hbz a(hbl hblVar, hbb hbbVar, hfw hfwVar) {
        return new hcm(hblVar, hfwVar, this);
    }
}
