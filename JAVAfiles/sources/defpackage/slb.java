package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class slb extends agps {
    public slb() {
        super("conversation_participants");
    }

    @Override // defpackage.agps
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final agpr a() {
        ac();
        String str = this.c;
        agpt agptVar = this.e;
        return new agpr(str, this.a, this.b, this.d.g(), agptVar.a());
    }

    public final void c(qfe qfeVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 58570) {
            agnc.t("rcs_group_join_status", intValue2);
        }
        if (intValue >= 58570) {
            if (qfeVar == null) {
                this.a.putNull("rcs_group_join_status");
            } else {
                this.a.put("rcs_group_join_status", Integer.valueOf(qfeVar.e));
            }
        }
    }
}
