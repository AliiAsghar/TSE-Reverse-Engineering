package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aodc implements apak {
    UNKNOWN(0),
    BROWSE(1),
    FAVORTIES(2),
    FAVORITES(10),
    STICKER_SEARCH_RESULTS(3),
    CLIENT_PICKER_RECENTS(4),
    CLIENT_PICKER_FAVORITES(5),
    QUERY_SUGGESTION(6),
    IMPLICIT_SEARCH_TEXT(11),
    EXPLICIT_SEARCH_TEXT(12),
    SEARCH_ICON(7),
    GALLERY_BUTTON(8),
    PACK_DETAIL(9),
    MEGAMODE(13),
    CLIENT_AVATAR_PROMO_BANNER(14),
    CLIENT_AVATAR_MEGAMODE_BANNER(15),
    CLIENT_AVATAR_FEATURE_CARD(16),
    SHARE_SHEET(17),
    CLIENT_BROWSE(18),
    CLIENT_PACK_DETAIL(19),
    CLIENT_FEATURED(20),
    UNRECOGNIZED(-1);

    private final int x;

    aodc(int i) {
        this.x = i;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.x;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
