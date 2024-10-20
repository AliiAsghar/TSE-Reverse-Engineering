package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aijj {
    UNKNOWN("unknown"),
    SEND_RECEIVE("sendrecv"),
    SEND_ONLY("sendonly"),
    RECEIVE_ONLY("recvonly"),
    INACTIVE("inactive");

    public final String f;
    public final aijg g;

    aijj(String str) {
        this.f = str;
        this.g = new aijg(str, null);
    }
}
