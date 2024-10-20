package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bss extends arrp implements arqg<arnb> {
    final /* synthetic */ bsr a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bss(bsr bsrVar, Object obj) {
        super(0);
        this.a = bsrVar;
        this.b = obj;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        bsr bsrVar = this.a;
        bsw f = bsrVar.f();
        Object obj = this.b;
        float c = f.c(obj);
        if (!Float.isNaN(c)) {
            bsrVar.h.a(c, brg.a);
            bsrVar.o(null);
        }
        bsrVar.n(obj);
        return arnb.a;
    }
}
