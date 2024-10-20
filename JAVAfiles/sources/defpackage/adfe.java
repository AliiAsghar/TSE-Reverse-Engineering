package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfe extends adff {
    final /* synthetic */ adfg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adfe(adfg adfgVar) {
        super(adfgVar);
        this.a = adfgVar;
    }

    @Override // defpackage.adff
    protected final void a() {
        this.a.d();
        this.a.b(true);
    }

    @Override // defpackage.adff
    protected final void b() {
        this.a.d();
        this.a.b(false);
    }
}
