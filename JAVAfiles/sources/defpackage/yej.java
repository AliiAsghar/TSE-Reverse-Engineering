package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yej extends aoon {
    private volatile aoon a;
    private final aonx b;

    public yej(aonx aonxVar) {
        this.b = aonxVar;
    }

    @Override // defpackage.aoon
    public final /* synthetic */ Object a(aoro aoroVar) {
        List list = null;
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        aoroVar.m();
        while (aoroVar.r()) {
            String h = aoroVar.h();
            if (aoroVar.t() == 9) {
                aoroVar.p();
            } else {
                h.hashCode();
                if ("results".equals(h)) {
                    aoon aoonVar = this.a;
                    if (aoonVar == null) {
                        aoonVar = this.b.a(aorn.a(List.class, yek.class));
                        this.a = aoonVar;
                    }
                    list = (List) aoonVar.a(aoroVar);
                } else {
                    aoroVar.q();
                }
            }
        }
        aoroVar.o();
        return new yeo(list);
    }

    @Override // defpackage.aoon
    public final /* synthetic */ void b(aorp aorpVar, Object obj) {
        yeo yeoVar = (yeo) obj;
        if (yeoVar == null) {
            aorpVar.j();
            return;
        }
        aorpVar.f();
        aorpVar.i("results");
        aoon aoonVar = this.a;
        if (aoonVar == null) {
            aoonVar = this.b.a(aorn.a(List.class, yek.class));
            this.a = aoonVar;
        }
        aoonVar.b(aorpVar, yeoVar.a);
        aorpVar.h();
    }

    public final String toString() {
        return "TypeAdapter(TenorSearchResponse)";
    }
}
