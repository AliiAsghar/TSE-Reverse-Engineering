package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adtq {
    final int a;
    final int b;
    final int c;
    final int d;
    final String e;
    final String f;

    public adtq(int i, int i2, int i3, int i4, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
        this.f = str2;
    }

    public final String toString() {
        return "SimSlotInfo{mSimSlot=" + this.a + ", mSubscriptionId=" + this.b + ", mMcc=" + this.c + ", mMnc=" + this.d + ", mSimId=" + advq.SIM_ID.c(this.e) + ", mState=" + this.f + "}";
    }
}
