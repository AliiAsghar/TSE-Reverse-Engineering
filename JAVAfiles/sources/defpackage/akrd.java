package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akrd implements aksa {
    public final /* synthetic */ aksa a;
    public final /* synthetic */ aksa b;
    public final /* synthetic */ akry c;

    public /* synthetic */ akrd(aksa aksaVar, aksa aksaVar2, akry akryVar) {
        this.a = aksaVar;
        this.b = aksaVar2;
        this.c = akryVar;
    }

    @Override // defpackage.aksa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        aksa aksaVar = this.b;
        if (aksaVar != null) {
            aksaVar.close();
        }
        akqj.g(this.c);
    }
}
