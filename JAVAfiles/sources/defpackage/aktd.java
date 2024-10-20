package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aktd extends akrx {
    final /* synthetic */ akry b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aktd(akrh akrhVar, akry akryVar) {
        super(akrhVar);
        this.b = akryVar;
    }

    @Override // defpackage.akrx, defpackage.aksa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        akry akryVar = this.b;
        if (akryVar != null) {
            akqj.g(akryVar);
        }
    }
}
