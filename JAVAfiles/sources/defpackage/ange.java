package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum ange implements apak {
    UNSPECIFIED_TYPE(0),
    IMAGE_JPEG(1),
    IMAGE_JPG(2),
    IMAGE_PNG(3),
    IMAGE_GIF(4),
    IMAGE_WBMP(5),
    IMAGE_X_MS_BMP(6),
    IMAGE_UNSPECIFIED(7),
    VIDEO_MP4(8),
    VIDEO_3G2(9),
    VIDEO_3GPP(10),
    VIDEO_WEBM(11),
    VIDEO_MKV(12),
    VIDEO_UNSPECIFIED(13),
    AUDIO_AAC(14),
    AUDIO_AMR(15),
    AUDIO_MP3(16),
    AUDIO_MPEG(17),
    AUDIO_MPG(18),
    AUDIO_MP4(19),
    AUDIO_MP4_LATM(20),
    AUDIO_3GPP(21),
    AUDIO_OGG(22),
    AUDIO_UNSPECIFIED(23),
    TEXT_VCARD(24),
    APP_PDF(25),
    APP_TXT(26),
    APP_HTML(27),
    APP_DOC(28),
    APP_DOCX(29),
    APP_PPTX(30),
    APP_PPT(31),
    APP_XLSX(32),
    APP_XLS(33),
    APP_APK(34),
    APP_ZIP(35),
    APP_JAR(36),
    APP_UNSPECIFIED(37),
    CAL_TEXT_VCALENDAR(38),
    CAL_TEXT_XVCALENDAR(39),
    CAL_TEXT_CALENDAR(40),
    CAL_APPLICATION_VCS(41),
    CAL_APPLICATION_ICS(42),
    CAL_APPLICATION_HBSVCS(43),
    UNRECOGNIZED(-1);

    private final int U;

    ange(int i) {
        this.U = i;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.U;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
