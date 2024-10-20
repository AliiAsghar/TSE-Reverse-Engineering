package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tex extends agpc {
    public tex(String[] strArr) {
        super("read_reports", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tew b() {
        l();
        return new tew(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        Integer valueOf;
        apply = function.apply(tfa.d);
        teu[] teuVarArr = (teu[]) apply;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        for (teu teuVar : teuVarArr) {
            if (((Integer) tfa.b.getOrDefault(teuVar.toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
        }
        m(teuVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(new tez());
        k(new agpw((tez) apply));
    }
}
