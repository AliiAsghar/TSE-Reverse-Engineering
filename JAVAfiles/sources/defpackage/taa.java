package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class taa extends agpc {
    public taa(String[] strArr) {
        super("parent_disallowed_conversations", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final szz b() {
        l();
        return new szz(this.a.b());
    }

    public final void c(szw... szwVarArr) {
        int c = a.bp().c();
        Integer.valueOf(c).getClass();
        for (szw szwVar : szwVarArr) {
            if (((Integer) tac.b.getOrDefault(szwVar.toString(), -1)).intValue() > c) {
                agnc.t("columnReference.toString()", c);
            }
        }
        m(szwVarArr);
    }
}
