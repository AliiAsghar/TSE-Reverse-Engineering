package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aktc implements akrc {
    public final /* synthetic */ akry a;
    public final /* synthetic */ akry b;
    private final /* synthetic */ int c;

    public /* synthetic */ aktc(akry akryVar, akry akryVar2, int i) {
        this.c = i;
        this.a = akryVar;
        this.b = akryVar2;
    }

    @Override // defpackage.aksa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c != 0) {
            this.a.close();
            akqj.g(this.b);
        } else {
            this.a.close();
            akqj.g(this.b);
        }
    }
}
