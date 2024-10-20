package defpackage;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aops extends aoon {
    private final aoon a;
    private final aopj b;

    public aops(aonx aonxVar, Type type, aoon aoonVar, aopj aopjVar) {
        this.a = new aoqf(aonxVar, aoonVar, type);
        this.b = aopjVar;
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        Collection collection = (Collection) this.b.a();
        aoroVar.l();
        while (aoroVar.r()) {
            collection.add(this.a.a(aoroVar));
        }
        aoroVar.n();
        return collection;
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        Collection collection = (Collection) obj;
        if (collection == null) {
            aorpVar.j();
            return;
        }
        aorpVar.e();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.a.b(aorpVar, it.next());
        }
        aorpVar.g();
    }
}
