package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amho implements apak {
    UNKNOWN_BIZINFO_EVENT_SOURCE(0),
    BIZINFO_SOURCE_CONVERSATION_LIST_AVATAR(1),
    BIZINFO_SOURCE_CONVERSATION_AVATAR(2),
    BIZINFO_SOURCE_CONVERSATION_START(3),
    BIZINFO_SOURCE_CONVERSATION_OVERFLOW_MENU(4),
    BIZINFO_SOURCE_CONVERSATION_ACTION_BAR(5),
    BIZINFO_SOURCE_CONVERSATION_TITLE(6);

    public final int h;

    amho(int i2) {
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
