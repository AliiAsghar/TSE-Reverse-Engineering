package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amqh implements apak {
    UNKNOWN_COMPOSE_SCREEN_CATEGORY(0),
    ALL(1),
    CAMERA_GALLERY(2),
    CAMERA(3),
    GALLERY(4),
    EXTERNAL(5),
    EMOJI(6),
    GIF(7),
    STICKER(8),
    LOCATION(9),
    SEND_MONEY(10),
    REQUEST_MONEY(11),
    CONTACT(12),
    VOICE(13),
    FILE(14),
    REACTION(15),
    ASSISTANT(16),
    REPLY_DRAFT(17),
    EMOTIVE(18),
    EMOTIFY(19),
    SELFIE_GIF(20);

    public final int v;

    amqh(int i) {
        this.v = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.v;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.v);
    }
}
