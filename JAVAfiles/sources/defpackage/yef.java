package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yef extends aoon {
    private volatile aoon a;
    private volatile aoon b;
    private final aonx c;

    public yef(aonx aonxVar) {
        this.c = aonxVar;
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
        List list = null;
        while (aoroVar.r()) {
            String h = aoroVar.h();
            if (aoroVar.t() == 9) {
                aoroVar.p();
            } else {
                h.hashCode();
                if ("id".equals(h)) {
                    aoon aoonVar = this.a;
                    if (aoonVar == null) {
                        aoonVar = this.c.b(String.class);
                        this.a = aoonVar;
                    }
                    str = (String) aoonVar.a(aoroVar);
                } else if ("url".equals(h)) {
                    aoon aoonVar2 = this.a;
                    if (aoonVar2 == null) {
                        aoonVar2 = this.c.b(String.class);
                        this.a = aoonVar2;
                    }
                    str2 = (String) aoonVar2.a(aoroVar);
                } else if ("media".equals(h)) {
                    aoon aoonVar3 = this.b;
                    if (aoonVar3 == null) {
                        aoonVar3 = this.c.a(aorn.a(List.class, aorn.a(Map.class, String.class, yel.class).b));
                        this.b = aoonVar3;
                    }
                    list = (List) aoonVar3.a(aoroVar);
                } else {
                    aoroVar.q();
                }
            }
        }
        aoroVar.o();
        return new yek(str, str2, list);
    }

    @Override // defpackage.aoon
    public final /* synthetic */ void b(aorp aorpVar, Object obj) {
        yek yekVar = (yek) obj;
        if (yekVar == null) {
            aorpVar.j();
            return;
        }
        aorpVar.f();
        aorpVar.i("id");
        aoon aoonVar = this.a;
        if (aoonVar == null) {
            aoonVar = this.c.b(String.class);
            this.a = aoonVar;
        }
        aoonVar.b(aorpVar, yekVar.a);
        aorpVar.i("url");
        aoon aoonVar2 = this.a;
        if (aoonVar2 == null) {
            aoonVar2 = this.c.b(String.class);
            this.a = aoonVar2;
        }
        aoonVar2.b(aorpVar, yekVar.b);
        aorpVar.i("media");
        aoon aoonVar3 = this.b;
        if (aoonVar3 == null) {
            aoonVar3 = this.c.a(aorn.a(List.class, aorn.a(Map.class, String.class, yel.class).b));
            this.b = aoonVar3;
        }
        aoonVar3.b(aorpVar, yekVar.c);
        aorpVar.h();
    }

    public final String toString() {
        return "TypeAdapter(TenorGif)";
    }
}
