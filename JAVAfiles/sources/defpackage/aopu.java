package defpackage;

import java.lang.reflect.Type;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aopu extends aoon {
    private final aoon a;
    private final aoon b;
    private final aopj c;

    public aopu(aonx aonxVar, Type type, aoon aoonVar, Type type2, aoon aoonVar2, aopj aopjVar) {
        this.a = new aoqf(aonxVar, aoonVar, type);
        this.b = new aoqf(aonxVar, aoonVar2, type2);
        this.c = aopjVar;
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        int i;
        int t = aoroVar.t();
        if (t == 9) {
            aoroVar.p();
            return null;
        }
        Map map = (Map) this.c.a();
        if (t == 1) {
            aoroVar.l();
            while (aoroVar.r()) {
                aoroVar.l();
                Object a = this.a.a(aoroVar);
                if (map.put(a, this.b.a(aoroVar)) == null) {
                    aoroVar.n();
                } else {
                    throw new aook("duplicate key: ".concat(String.valueOf(String.valueOf(a))));
                }
            }
            aoroVar.n();
        } else {
            aoroVar.m();
            while (aoroVar.r()) {
                aotl aotlVar = aotl.b;
                int i2 = aoroVar.c;
                if (i2 == 0) {
                    i2 = aoroVar.b();
                }
                if (i2 == 13) {
                    i = 9;
                } else if (i2 == 12) {
                    i = 8;
                } else if (i2 == 14) {
                    i = 10;
                } else {
                    throw aoroVar.d("a name");
                }
                aoroVar.c = i;
                Object a2 = this.a.a(aoroVar);
                if (map.put(a2, this.b.a(aoroVar)) != null) {
                    throw new aook("duplicate key: ".concat(String.valueOf(String.valueOf(a2))));
                }
            }
            aoroVar.o();
        }
        return map;
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            aorpVar.j();
            return;
        }
        aorpVar.f();
        for (Map.Entry entry : map.entrySet()) {
            aorpVar.i(String.valueOf(entry.getKey()));
            this.b.b(aorpVar, entry.getValue());
        }
        aorpVar.h();
    }
}
