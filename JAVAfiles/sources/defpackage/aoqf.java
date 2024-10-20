package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoqf extends aoon {
    private final aonx a;
    private final aoon b;
    private final Type c;

    public aoqf(aonx aonxVar, aoon aoonVar, Type type) {
        this.a = aonxVar;
        this.b = aoonVar;
        this.c = type;
    }

    @Override // defpackage.aoon
    public final Object a(aoro aoroVar) {
        return this.b.a(aoroVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // defpackage.aoon
    public final void b(aorp aorpVar, Object obj) {
        Class<?> cls;
        aoon c;
        ?? r0 = this.c;
        if (obj != null && ((r0 instanceof Class) || (r0 instanceof TypeVariable))) {
            cls = obj.getClass();
        } else {
            cls = r0;
        }
        aoon aoonVar = this.b;
        if (cls != r0) {
            aoonVar = this.a.a(new aorn(cls));
            if (aoonVar instanceof aopy) {
                aoon aoonVar2 = this.b;
                while ((aoonVar2 instanceof aoqd) && (c = ((aoqd) aoonVar2).c()) != aoonVar2) {
                    aoonVar2 = c;
                }
                if (!(aoonVar2 instanceof aopy)) {
                    aoonVar = this.b;
                }
            }
        }
        aoonVar.b(aorpVar, obj);
    }
}
