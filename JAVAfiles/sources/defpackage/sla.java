package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sla extends agpc<skx, skz, sla, sku, skw> {
    public sla(String[] strArr) {
        super("conversation_participants", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final skz b() {
        l();
        return new skz(this.a.b());
    }

    public final void c(skw... skwVarArr) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        for (skw skwVar : skwVarArr) {
            if (((Integer) sld.b.getOrDefault(skwVar.toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
        }
        m(skwVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(sld.e);
        c((skw) apply);
    }

    public final void e(slc slcVar) {
        k(new agpw(slcVar));
    }

    public final void f(Function function) {
        Object apply;
        apply = function.apply(new slc());
        k(new agpw((slc) apply));
    }
}
