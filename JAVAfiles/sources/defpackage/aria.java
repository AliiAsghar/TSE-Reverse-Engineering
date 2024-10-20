package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aria extends arpw implements arqv {
    int a;
    final /* synthetic */ aqrr b;
    final /* synthetic */ aqrs c;
    final /* synthetic */ aqux d;
    final /* synthetic */ aqut e;
    final /* synthetic */ atoi f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aria(aqrr aqrrVar, aqrs aqrsVar, aqux aquxVar, aqut aqutVar, atoi atoiVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = aqrrVar;
        this.c = aqrsVar;
        this.d = aquxVar;
        this.e = aqutVar;
        this.f = atoiVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aria) c((asaj) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            arhz arhzVar = new arhz(this.b, this.c, this.d, this.e, (asaj) this.g, this.f, null);
            this.a = 1;
            if (arwi.d(arhzVar, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        aria ariaVar = new aria(this.b, this.c, this.d, this.e, this.f, arpeVar);
        ariaVar.g = obj;
        return ariaVar;
    }
}
