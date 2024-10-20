package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apel implements apak {
    UNDEFINED(0),
    EMOJI(1),
    STICKER(2),
    GALLERY(3),
    MONEY(4),
    LOCATION(5),
    AUDIO(6),
    CUSTOMIZATION(7),
    GIF(8),
    EXPRESSIVE_STICKER(9),
    CONTACT(10),
    ASSISTANT(11),
    CAMERA_GALLERY(12),
    FILE(13),
    UNRECOGNIZED(-1);

    private final int q;

    apel(int i) {
        this.q = i;
    }

    public static apel b(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return EMOJI;
            case 2:
                return STICKER;
            case 3:
                return GALLERY;
            case 4:
                return MONEY;
            case 5:
                return LOCATION;
            case 6:
                return AUDIO;
            case 7:
                return CUSTOMIZATION;
            case 8:
                return GIF;
            case 9:
                return EXPRESSIVE_STICKER;
            case 10:
                return CONTACT;
            case 11:
                return ASSISTANT;
            case 12:
                return CAMERA_GALLERY;
            case 13:
                return FILE;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
