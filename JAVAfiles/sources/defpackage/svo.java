package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class svo extends agpc {
    public svo(String[] strArr) {
        super("message_reactions", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final svn b() {
        l();
        return new svn(this.a.b());
    }

    public final void c(svk... svkVarArr) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        for (svk svkVar : svkVarArr) {
            if (((Integer) svq.b.getOrDefault(svkVar.toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
        }
        m(svkVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(new svp());
        k(new agpw((svp) apply));
    }
}
