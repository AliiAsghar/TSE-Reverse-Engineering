package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wit implements emx {
    final /* synthetic */ wiv a;
    final /* synthetic */ yao b;
    final /* synthetic */ vrl c;

    public wit(wiv wivVar, yao yaoVar, vrl vrlVar) {
        this.a = wivVar;
        this.b = yaoVar;
        this.c = vrlVar;
    }

    @Override // defpackage.emx
    public final void h(enm enmVar) {
        yaq yaqVar = (yaq) ((xyt) this.a.r.b()).a();
        aozy createBuilder = yam.a.createBuilder();
        yal yalVar = yal.ALL_ACTIVE_SUBSCRIPTIONS;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        yao yaoVar = this.b;
        yam yamVar = (yam) createBuilder.b;
        yamVar.c = yalVar.e;
        yamVar.b |= 1;
        yaqVar.j(yaoVar, (yam) createBuilder.s());
        ((vrn) ((xyt) this.a.k.b()).a()).i(this.c, this.a.g);
    }

    @Override // defpackage.emx
    public final void i(enm enmVar) {
        yaq yaqVar = (yaq) ((xyt) this.a.r.b()).a();
        aozy createBuilder = yam.a.createBuilder();
        yal yalVar = yal.ALL_ACTIVE_SUBSCRIPTIONS;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        yao yaoVar = this.b;
        yam yamVar = (yam) createBuilder.b;
        yamVar.c = yalVar.e;
        yamVar.b |= 1;
        yaqVar.k(yaoVar, (yam) createBuilder.s());
        ((vrn) ((xyt) this.a.k.b()).a()).l(this.c);
    }

    @Override // defpackage.emx
    public final /* synthetic */ void d(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gF(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gG(enm enmVar) {
    }
}
