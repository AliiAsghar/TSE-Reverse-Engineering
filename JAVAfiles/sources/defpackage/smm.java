package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class smm extends agpc<smj, sml, smm, smh, smi> {
    public smm(String[] strArr) {
        super("conversation_to_participants", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sml b() {
        l();
        return new sml(this.a.b());
    }

    public final void c(smi... smiVarArr) {
        int c = a.bp().c();
        Integer.valueOf(c).getClass();
        for (smi smiVar : smiVarArr) {
            if (((Integer) smp.b.getOrDefault(smiVar.toString(), -1)).intValue() > c) {
                agnc.t("columnReference.toString()", c);
            }
        }
        m(smiVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(smp.d);
        c((smi) apply);
    }

    public final void e(Function function) {
        Object apply;
        apply = function.apply(new smo());
        k(new agpw((smo) apply));
    }
}
