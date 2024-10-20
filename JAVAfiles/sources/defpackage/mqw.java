package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqw extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(Iterable iterable) {
        Integer valueOf;
        valueOf = Integer.valueOf(d.P().W().c());
        int intValue = valueOf.intValue();
        if (intValue < 10007) {
            agnc.t("conv_type", intValue);
        }
        U(new agmf("conversations.conv_type", 3, X(iterable), true));
    }

    public final void c(int i) {
        U(new agoi("conversations.participant_count", 9, Integer.valueOf(i)));
    }
}
