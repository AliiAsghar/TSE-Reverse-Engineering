package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aoje implements aogf {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    private final int f;

    aoje(int i) {
        this.f = i;
    }

    @Override // defpackage.aogf
    public final int a() {
        return this.f;
    }
}
