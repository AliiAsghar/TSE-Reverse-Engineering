package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tib extends agpc {
    public tib(String[] strArr) {
        super("remote_user_id_to_registration_id", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tia b() {
        l();
        return new tia(this.a.b());
    }

    public final void c(thw... thwVarArr) {
        int c = a.bp().c();
        Integer.valueOf(c).getClass();
        if (((Integer) tid.b.getOrDefault(thwVarArr[0].toString(), -1)).intValue() > c) {
            agnc.t("columnReference.toString()", c);
        }
        m(thwVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(new tic());
        k(new agpw((tic) apply));
    }
}
