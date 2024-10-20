package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ared {
    public final argb a;
    public final Object b;
    public final Map c;
    private final areb d;
    private final Map e;
    private final Map f;

    public ared(areb arebVar, Map map, Map map2, argb argbVar, Object obj, Map map3) {
        Map map4;
        this.d = arebVar;
        this.e = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f = DesugarCollections.unmodifiableMap(new HashMap(map2));
        this.a = argbVar;
        this.b = obj;
        if (map3 != null) {
            map4 = DesugarCollections.unmodifiableMap(new HashMap(map3));
        } else {
            map4 = null;
        }
        this.c = map4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aqtd a() {
        if (this.f.isEmpty() && this.e.isEmpty() && this.d == null) {
            return null;
        }
        return new arec(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final areb b(aqux aquxVar) {
        areb arebVar = (areb) this.e.get(aquxVar.b);
        if (arebVar == null) {
            arebVar = (areb) this.f.get(aquxVar.c);
        }
        if (arebVar == null) {
            return this.d;
        }
        return arebVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ared aredVar = (ared) obj;
            if (d.B(this.d, aredVar.d) && d.B(this.e, aredVar.e) && d.B(this.f, aredVar.f) && d.B(this.a, aredVar.a) && d.B(this.b, aredVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.f, this.a, this.b});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("defaultMethodConfig", this.d);
        aj.b("serviceMethodMap", this.e);
        aj.b("serviceMap", this.f);
        aj.b("retryThrottling", this.a);
        aj.b("loadBalancingConfig", this.b);
        return aj.toString();
    }
}
