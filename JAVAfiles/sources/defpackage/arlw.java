package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arlw extends arls {
    final /* synthetic */ arlx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arlw(arlx arlxVar) {
        super(arlxVar);
        this.b = arlxVar;
    }

    @Override // defpackage.arls, defpackage.arlr, defpackage.aqtr
    public final void f(aqsd aqsdVar, aqtx aqtxVar) {
        super.f(aqsdVar, aqtxVar);
        arlx arlxVar = this.b;
        if (!arlxVar.f.i && aqsdVar == aqsd.IDLE) {
            arlxVar.b.d();
        }
    }
}
