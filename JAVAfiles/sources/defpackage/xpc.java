package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xpc extends agpc {
    public xpc(String[] strArr) {
        super("file_transfer", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xpb b() {
        l();
        return new xpb(this.a.b());
    }

    public final void c(xoy... xoyVarArr) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        for (xoy xoyVar : xoyVarArr) {
            if (((Integer) xpf.b.getOrDefault(xoyVar.toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
        }
        m(xoyVarArr);
    }

    public final void d(xpe xpeVar) {
        k(new agpw(xpeVar));
    }

    public final void e(Function function) {
        Object apply;
        apply = function.apply(new xpe());
        k(new agpw((xpe) apply));
    }
}
