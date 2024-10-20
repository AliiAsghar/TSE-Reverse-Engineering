package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aojf implements aogf {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);

    private final int f;

    aojf(int i) {
        this.f = i;
    }

    @Override // defpackage.aogf
    public final int a() {
        return this.f;
    }
}
