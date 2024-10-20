package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amip implements apak {
    UNKNOWN_HAPPINESS_TRACKING_MODE(0),
    HAPPINESS_TRACKING_MODE_SURVEY(1),
    HAPPINESS_TRACKING_MODE_PLAY_STORE_RATING(2),
    HAPPINESS_TRACKING_MODE_HIDDEN(3),
    SMART_REPLY_HAPPINESS_TRACKING_SURVEY(4),
    SHARE_AND_CONNECT_HAPPINESS_TRACKING_SURVEY(5),
    ORGANIZE_HAPPINESS_TRACKING_SURVEY(6);

    public final int h;

    amip(int i2) {
        this.h = i2;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
