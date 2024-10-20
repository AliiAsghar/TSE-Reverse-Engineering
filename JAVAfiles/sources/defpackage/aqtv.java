package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqtv {
    public final List a;
    public final aqrm b;
    public final Object c;

    public aqtv(List list, aqrm aqrmVar, Object obj) {
        list.getClass();
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        aqrmVar.getClass();
        this.b = aqrmVar;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aqtv)) {
            return false;
        }
        aqtv aqtvVar = (aqtv) obj;
        if (!d.B(this.a, aqtvVar.a) || !d.B(this.b, aqtvVar.b) || !d.B(this.c, aqtvVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("addresses", this.a);
        aj.b("attributes", this.b);
        aj.b("loadBalancingPolicyConfig", this.c);
        return aj.toString();
    }
}
