package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class can extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ arqv b;
    final /* synthetic */ byn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public can(arqv arqvVar, byn bynVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = arqvVar;
        this.c = bynVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((can) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            arwe arweVar = (arwe) this.d;
            arqv arqvVar = this.b;
            bzb bzbVar = new bzb(this.c, arweVar.b());
            this.a = 1;
            if (arqvVar.a(bzbVar, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        can canVar = new can(this.b, this.c, arpeVar);
        canVar.d = obj;
        return canVar;
    }
}
