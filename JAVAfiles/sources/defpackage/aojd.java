package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aojd implements aogf {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);

    private final int e;

    aojd(int i) {
        this.e = i;
    }

    @Override // defpackage.aogf
    public final int a() {
        return this.e;
    }
}
