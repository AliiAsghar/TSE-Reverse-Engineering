package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqto {
    public final List a;
    public final aqrm b;
    public final Object[][] c;

    public aqto(List list, aqrm aqrmVar, Object[][] objArr) {
        list.getClass();
        this.a = list;
        aqrmVar.getClass();
        this.b = aqrmVar;
        objArr.getClass();
        this.c = objArr;
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("addrs", this.a);
        aj.b("attrs", this.b);
        aj.b("customOptions", Arrays.deepToString(this.c));
        return aj.toString();
    }
}
