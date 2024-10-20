package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amgf implements apak {
    UNKNOWN_MESSAGE_OPTIONS_ACTION(0),
    OPTIONS_MENU_OPENED(1),
    COPY(2),
    DELETE(3),
    SHARE(4),
    FORWARD(5),
    VIEW_DETAILS(6),
    DOWNLOAD(7),
    SAVE_ATTACHMENT(8),
    RETRY_SEND(9);

    public final int k;

    amgf(int i) {
        this.k = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
