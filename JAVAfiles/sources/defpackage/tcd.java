package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tcd extends agpc {
    public tcd(String[] strArr) {
        super("pending_incoming_message_rcs_table", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tcc b() {
        l();
        return new tcc(this.a.b());
    }

    public final void c(tbz... tbzVarArr) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        for (tbz tbzVar : tbzVarArr) {
            if (((Integer) tcf.b.getOrDefault(tbzVar.toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
        }
        m(tbzVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(new tce());
        k(new agpw((tce) apply));
    }
}
