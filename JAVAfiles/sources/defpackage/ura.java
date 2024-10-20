package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ura extends agpc {
    public ura(String[] strArr) {
        super("work_queue_work_manager_ids", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final uqz b() {
        l();
        return new uqz(this.a.b());
    }

    public final void c(uqv... uqvVarArr) {
        int c = a.bp().c();
        Integer.valueOf(c).getClass();
        for (uqv uqvVar : uqvVarArr) {
            if (((Integer) urd.b.getOrDefault(uqvVar.toString(), -1)).intValue() > c) {
                agnc.t("columnReference.toString()", c);
            }
        }
        m(uqvVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(new urc());
        k(new agpw((urc) apply));
    }
}
