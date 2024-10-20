package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rnk extends agpc {
    public rnk(String[] strArr) {
        super("messages_backup", strArr, null, null, null, "backup");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rnj b() {
        l();
        return new rnj(this.a.b());
    }

    public final void c(rnf... rnfVarArr) {
        int intValue = rnm.b().intValue();
        for (rnf rnfVar : rnfVarArr) {
            if (((Integer) rnm.b.getOrDefault(rnfVar.toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
        }
        m(rnfVarArr);
    }

    public final void d(rnl rnlVar) {
        k(new agpw(rnlVar));
    }
}
