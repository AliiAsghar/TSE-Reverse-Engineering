package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tdu extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(String str) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 51020) {
            agnc.t("rbm_bot_id", intValue);
        }
        U(new agmd("rbm_business_info_properties.rbm_bot_id", 1, String.valueOf(str)));
    }
}
