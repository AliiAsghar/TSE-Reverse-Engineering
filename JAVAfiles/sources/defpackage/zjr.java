package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zjr implements ancu {
    public final /* synthetic */ int a;
    public final /* synthetic */ zbl b;
    private final /* synthetic */ int c;

    public /* synthetic */ zjr(zbl zblVar, int i, int i2) {
        this.c = i2;
        this.b = zblVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.ancu
    public final andc a(ahmn ahmnVar) {
        if (this.c != 0) {
            int i = this.a;
            zbl zblVar = this.b;
            return new andc(aktp.ai(new ijt(zblVar, i, 6), zblVar.a));
        }
        int i2 = this.a;
        zbl zblVar2 = this.b;
        return new andc(aktp.ai(new ijt(zblVar2, i2, 5), zblVar2.a));
    }
}
