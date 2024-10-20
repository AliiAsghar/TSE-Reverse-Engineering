package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amnk implements apak {
    MIME_UNKNOWN(0),
    MIME_OTHER(1),
    AUDIO_AAC(2),
    AUDIO_MP3(3),
    AUDIO_MPEG(4),
    AUDIO_MPG(5),
    AUDIO_MP4(6),
    AUDIO_MP4_LATM(7),
    AUDIO_OGG(8),
    VIDEO_3GP(9),
    VIDEO_3GPP(10),
    VIDEO_3G2(11),
    VIDEO_M4V(12),
    VIDEO_MP4(13),
    VIDEO_MPEG(14),
    VIDEO_MPEG4(15),
    VIDEO_WEBM(16),
    UNRECOGNIZED(-1);

    private final int t;

    amnk(int i) {
        this.t = i;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.t;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
