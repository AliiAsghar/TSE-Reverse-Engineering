package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yei extends aoon {
    private volatile aoon a;
    private final aonx b;

    public yei(aonx aonxVar) {
        this.b = aonxVar;
    }

    @Override // defpackage.aoon
    public final /* synthetic */ Object a(aoro aoroVar) {
        String str = null;
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
                if ("status".equals(h)) {
                    aoon aoonVar = this.a;
                    if (aoonVar == null) {
                        aoonVar = this.b.b(String.class);
                        this.a = aoonVar;
                    }
                    str = (String) aoonVar.a(aoroVar);
                } else {
                    aoroVar.q();
                }
            }
        }
        aoroVar.o();
        return new yen(str);
    }

    @Override // defpackage.aoon
    public final /* synthetic */ void b(aorp aorpVar, Object obj) {
        yen yenVar = (yen) obj;
        if (yenVar == null) {
            aorpVar.j();
            return;
        }
        aorpVar.f();
        aorpVar.i("status");
        aoon aoonVar = this.a;
        if (aoonVar == null) {
            aoonVar = this.b.b(String.class);
            this.a = aoonVar;
        }
        aoonVar.b(aorpVar, yenVar.a);
        aorpVar.h();
    }

    public final String toString() {
        return "TypeAdapter(TenorRegisterShareResponse)";
    }
}
