package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amqe implements apak {
    UNKNOWN_OPENING_SOURCE(0),
    PLUS_BUTTON(1),
    CAMERA_GALLERY_BUTTON(2),
    CATEGORY_HEADER(3),
    CATEGORY_OVERFLOW(4),
    SUGGESTION(5),
    EXPAND(6),
    FAVORITES(7),
    QUERY(8),
    CAMERA(9),
    MINI_CAMERA(10),
    DRAFT_END_EMOJI_BUTTON(11),
    MESSAGE_LONG_PRESS(12),
    MESSAGE_BADGE_CLICK(13),
    MESSAGE_REPLY_BUTTON_CLICK(14),
    MESSAGE_REPLY_SWIPE(15),
    ADD_CUSTOM_REACTION_BUTTON_CLICK(16);

    public final int r;

    amqe(int i) {
        this.r = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.r;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.r);
    }
}
