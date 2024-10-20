package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ssp extends agpc {
    public ssp(String[] strArr) {
        super("link_preview", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sso b() {
        l();
        return new sso(this.a.b());
    }

    public final void c(ssk... sskVarArr) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        for (ssk sskVar : sskVarArr) {
            if (((Integer) sss.b.getOrDefault(sskVar.toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
        }
        m(sskVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(sss.d);
        c((ssk[]) apply);
    }

    public final void e(Function function) {
        Object apply;
        apply = function.apply(new ssr());
        k(new agpw((ssr) apply));
    }
}
