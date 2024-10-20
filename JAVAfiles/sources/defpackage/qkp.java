package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qkp extends arpw implements arqv {
    int a;
    final /* synthetic */ asai b;
    final /* synthetic */ long c;
    final /* synthetic */ arqw d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkp(asai asaiVar, long j, arqw arqwVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = asaiVar;
        this.c = j;
        this.d = arqwVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qkp) c((asaj) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            qko qkoVar = new qko(this.b, this.c, (asaj) this.e, this.d, null);
            this.a = 1;
            if (arwi.d(qkoVar, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        qkp qkpVar = new qkp(this.b, this.c, this.d, arpeVar);
        qkpVar.e = obj;
        return qkpVar;
    }
}
