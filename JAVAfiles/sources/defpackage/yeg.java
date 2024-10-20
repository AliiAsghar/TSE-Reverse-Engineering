package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yeg extends aoon {
    private volatile aoon a;
    private volatile aoon b;
    private volatile aoon c;
    private final aonx d;

    public yeg(aonx aonxVar) {
        this.d = aonxVar;
    }

    @Override // defpackage.aoon
    public final /* synthetic */ Object a(aoro aoroVar) {
        String str = null;
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        aoroVar.m();
        String str2 = null;
        Integer num = null;
        List list = null;
        while (aoroVar.r()) {
            String h = aoroVar.h();
            if (aoroVar.t() == 9) {
                aoroVar.p();
            } else {
                h.hashCode();
                if ("url".equals(h)) {
                    aoon aoonVar = this.a;
                    if (aoonVar == null) {
                        aoonVar = this.d.b(String.class);
                        this.a = aoonVar;
                    }
                    str = (String) aoonVar.a(aoroVar);
                } else if ("preview".equals(h)) {
                    aoon aoonVar2 = this.a;
                    if (aoonVar2 == null) {
                        aoonVar2 = this.d.b(String.class);
                        this.a = aoonVar2;
                    }
                    str2 = (String) aoonVar2.a(aoroVar);
                } else if ("size".equals(h)) {
                    aoon aoonVar3 = this.b;
                    if (aoonVar3 == null) {
                        aoonVar3 = this.d.b(Integer.class);
                        this.b = aoonVar3;
                    }
                    num = (Integer) aoonVar3.a(aoroVar);
                } else if ("dims".equals(h)) {
                    aoon aoonVar4 = this.c;
                    if (aoonVar4 == null) {
                        aoonVar4 = this.d.a(aorn.a(List.class, Integer.class));
                        this.c = aoonVar4;
                    }
                    list = (List) aoonVar4.a(aoroVar);
                } else {
                    aoroVar.q();
                }
            }
        }
        aoroVar.o();
        return new yel(str, str2, num, list);
    }

    @Override // defpackage.aoon
    public final /* synthetic */ void b(aorp aorpVar, Object obj) {
        yel yelVar = (yel) obj;
        if (yelVar == null) {
            aorpVar.j();
            return;
        }
        aorpVar.f();
        aorpVar.i("url");
        if (yelVar.a == null) {
            aorpVar.j();
        } else {
            aoon aoonVar = this.a;
            if (aoonVar == null) {
                aoonVar = this.d.b(String.class);
                this.a = aoonVar;
            }
            aoonVar.b(aorpVar, yelVar.a);
        }
        aorpVar.i("preview");
        if (yelVar.b == null) {
            aorpVar.j();
        } else {
            aoon aoonVar2 = this.a;
            if (aoonVar2 == null) {
                aoonVar2 = this.d.b(String.class);
                this.a = aoonVar2;
            }
            aoonVar2.b(aorpVar, yelVar.b);
        }
        aorpVar.i("size");
        if (yelVar.c == null) {
            aorpVar.j();
        } else {
            aoon aoonVar3 = this.b;
            if (aoonVar3 == null) {
                aoonVar3 = this.d.b(Integer.class);
                this.b = aoonVar3;
            }
            aoonVar3.b(aorpVar, yelVar.c);
        }
        aorpVar.i("dims");
        if (yelVar.d == null) {
            aorpVar.j();
        } else {
            aoon aoonVar4 = this.c;
            if (aoonVar4 == null) {
                aoonVar4 = this.d.a(aorn.a(List.class, Integer.class));
                this.c = aoonVar4;
            }
            aoonVar4.b(aorpVar, yelVar.d);
        }
        aorpVar.h();
    }

    public final String toString() {
        return "TypeAdapter(TenorMedia)";
    }
}
