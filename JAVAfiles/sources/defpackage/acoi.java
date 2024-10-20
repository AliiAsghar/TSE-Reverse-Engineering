package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acoi implements adwu {
    public adwl a = adwl.UNKNOWN;

    @Override // defpackage.adwu
    public final adwl a(int i) {
        adwl adwlVar = this.a;
        d.t(!adwl.UNKNOWN.equals(adwlVar), "SipConnectionType is UNKNOWN.");
        return adwlVar;
    }

    @Override // defpackage.adwu
    public final boolean b(int i) {
        return adwl.SINGLE_REG.equals(a(i));
    }
}
