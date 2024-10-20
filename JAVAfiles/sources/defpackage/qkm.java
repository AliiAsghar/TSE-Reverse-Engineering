package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qkm extends arpw implements arqv {
    int a;
    final /* synthetic */ asai b;
    final /* synthetic */ int c;
    final /* synthetic */ long d;
    final /* synthetic */ arqv e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkm(asai asaiVar, int i, long j, arqv arqvVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = asaiVar;
        this.c = i;
        this.d = j;
        this.e = arqvVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qkm) c((asaj) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            qkl qklVar = new qkl(this.b, this.c, this.d, (asaj) this.f, this.e, null);
            this.a = 1;
            if (arwi.d(qklVar, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        qkm qkmVar = new qkm(this.b, this.c, this.d, this.e, arpeVar);
        qkmVar.f = obj;
        return qkmVar;
    }
}
