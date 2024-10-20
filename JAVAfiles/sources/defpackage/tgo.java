package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tgo extends agpc {
    public tgo(String[] strArr) {
        super("reminders", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tgm b() {
        l();
        return new tgm(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        Integer valueOf;
        apply = function.apply(tgr.d);
        tgk[] tgkVarArr = {(tgk) apply};
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (((Integer) tgr.b.getOrDefault(tgkVarArr[0].toString(), -1)).intValue() > intValue) {
            agnc.t("columnReference.toString()", intValue);
        }
        m(tgkVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(new tgq());
        k(new agpw((tgq) apply));
    }
}
