package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class stj extends agpc<stf, sti, stj, stc, ste> {
    public stj(String[] strArr) {
        super("messages_annotations", strArr, null, null, null, "$primary");
    }

    private final void f(ste... steVarArr) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        for (ste steVar : steVarArr) {
            if (((Integer) stl.b.getOrDefault(steVar.toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
        }
        m(steVarArr);
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sti b() {
        l();
        return new sti(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(stl.e);
        f((ste[]) apply);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(stl.e);
        f((ste) apply);
    }

    public final void e(Function function) {
        Object apply;
        apply = function.apply(new stk());
        k(new agpw((stk) apply));
    }
}
