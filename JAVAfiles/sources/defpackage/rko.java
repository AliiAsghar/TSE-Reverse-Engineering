package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rko extends agpc {
    public rko(String[] strArr) {
        super("conversation_participants_backup", strArr, null, null, null, "backup");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rkn b() {
        l();
        return new rkn(this.a.b());
    }

    public final void c(rkk... rkkVarArr) {
        int intValue = rkq.b().intValue();
        for (rkk rkkVar : rkkVarArr) {
            if (((Integer) rkq.b.getOrDefault(rkkVar.toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
        }
        m(rkkVarArr);
    }
}
