package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class roz extends agpc {
    public roz(String[] strArr) {
        super("participants_backup", strArr, null, null, null, "backup");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final roy b() {
        l();
        return new roy(this.a.b());
    }

    public final void c(rou... rouVarArr) {
        int intValue = rpb.b().intValue();
        for (rou rouVar : rouVarArr) {
            if (((Integer) rpb.b.getOrDefault(rouVar.toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
        }
        m(rouVarArr);
    }
}
