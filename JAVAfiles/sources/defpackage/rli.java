package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rli extends agpc {
    public rli(String[] strArr) {
        super("conversations_backup", strArr, null, null, null, "backup");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rlh b() {
        l();
        return new rlh(this.a.b());
    }

    public final void c(rld... rldVarArr) {
        int intValue = rlk.b().intValue();
        for (rld rldVar : rldVarArr) {
            if (((Integer) rlk.b.getOrDefault(rldVar.toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
        }
        m(rldVarArr);
    }
}
