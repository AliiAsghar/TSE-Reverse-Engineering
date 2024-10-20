package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzh extends arpw implements arqv {
    int a;
    final /* synthetic */ asai b;
    final /* synthetic */ fzi c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzh(asai asaiVar, arpe arpeVar, fzi fziVar) {
        super(2, arpeVar);
        this.b = asaiVar;
        this.c = fziVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fzh) c((asaj) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            asaj asajVar = (asaj) this.d;
            asai asaiVar = this.b;
            gdb gdbVar = new gdb(asajVar, this.c, 1);
            this.a = 1;
            if (asaiVar.a(gdbVar, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        fzh fzhVar = new fzh(this.b, arpeVar, this.c);
        fzhVar.d = obj;
        return fzhVar;
    }
}
