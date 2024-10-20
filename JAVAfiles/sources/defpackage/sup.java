package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sup extends agpc {
    public sup(String[] strArr) {
        super("message_edits", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final suo b() {
        l();
        return new suo(this.a.b());
    }

    public final void c(sul... sulVarArr) {
        int c = a.bp().c();
        Integer.valueOf(c).getClass();
        for (sul sulVar : sulVarArr) {
            if (((Integer) sur.b.getOrDefault(sulVar.toString(), -1)).intValue() > c) {
                agnc.t("columnReference.toString()", c);
            }
        }
        m(sulVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(new suq());
        k(new agpw((suq) apply));
    }
}
