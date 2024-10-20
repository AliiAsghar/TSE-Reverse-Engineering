package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amtj implements apak {
    OPEN_URL_APPLICATION_UNSPECIFIED(0),
    BROWSER(1),
    WEBVIEW(2);

    public final int d;

    amtj(int i) {
        this.d = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
