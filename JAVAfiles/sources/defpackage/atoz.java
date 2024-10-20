package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atoz implements ator {
    final /* synthetic */ ator a;
    public final /* synthetic */ atpa b;

    public atoz(atpa atpaVar, ator atorVar) {
        this.a = atorVar;
        this.b = atpaVar;
    }

    @Override // defpackage.ator
    public final void a(atoo atooVar, atqo atqoVar) {
        this.b.a.execute(new aofo(this, this.a, atqoVar, 19));
    }

    @Override // defpackage.ator
    public final void b(Throwable th) {
        this.b.a.execute(new atep(this.a, th, 9, null));
    }
}
