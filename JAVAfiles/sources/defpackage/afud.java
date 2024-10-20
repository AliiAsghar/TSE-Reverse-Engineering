package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum afud implements apak {
    CAMERA_LAYOUT_UNKNOWN(0),
    MINI_CAMERA(1),
    FULLSCREEN(2),
    POPUP_CAMERA(3),
    UNRECOGNIZED(-1);

    private final int g;

    afud(int i) {
        this.g = i;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
