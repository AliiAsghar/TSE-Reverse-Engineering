package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qwv extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b() {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 59450) {
            agnc.t("my_identity_token", intValue);
        }
        U(new agmg("subscriptions.my_identity_token", 6));
    }

    public final void c(String str) {
        U(new agmd("subscriptions.sim_serial_number", 1, String.valueOf(str)));
    }

    public final void d(int i) {
        U(new agoi("subscriptions.sub_id", 1, Integer.valueOf(i)));
    }
}
