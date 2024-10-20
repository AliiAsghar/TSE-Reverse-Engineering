package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afwg implements ajmg {
    final /* synthetic */ arqr a;
    final /* synthetic */ List b;

    public afwg(arqr arqrVar, List list) {
        this.a = arqrVar;
        this.b = list;
    }

    @Override // defpackage.ajmf
    public final void a(ajmk ajmkVar) {
        if (ajmkVar != null) {
            this.a.a(this.b.get(ajmkVar.d));
        }
    }

    @Override // defpackage.ajmf
    public final void b(ajmk ajmkVar) {
        this.a.a(this.b.get(ajmkVar.d));
    }

    @Override // defpackage.ajmf
    public final void c(ajmk ajmkVar) {
    }
}
