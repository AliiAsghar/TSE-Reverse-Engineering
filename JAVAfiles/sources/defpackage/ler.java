package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ler extends rg {
    final /* synthetic */ lex a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ler(lex lexVar) {
        super(false);
        this.a = lexVar;
    }

    @Override // defpackage.rg
    public final void b() {
        if (this.a.e().isPresent()) {
            this.a.f();
            this.a.A.o("handled back press by dismssing action mode");
            return;
        }
        throw new IllegalArgumentException("expecting action mode is be able to exit action mode on back pressed");
    }
}
