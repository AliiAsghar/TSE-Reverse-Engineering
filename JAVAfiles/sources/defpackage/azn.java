package defpackage;

import defpackage.ajt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azn implements bxh {
    final /* synthetic */ byn a;
    final /* synthetic */ ajr b;

    public azn(byn bynVar, ajr ajrVar) {
        this.a = bynVar;
        this.b = ajrVar;
    }

    @Override // defpackage.bxh
    public final void a() {
        ajt.b bVar = (ajt.b) this.a.a();
        if (bVar != null) {
            ajt.a aVar = new ajt.a(bVar);
            ajr ajrVar = this.b;
            if (ajrVar != null) {
                ajrVar.c(aVar);
            }
            this.a.h(null);
        }
    }
}
