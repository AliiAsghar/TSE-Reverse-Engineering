package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum uye {
    HOME(0),
    ARCHIVED(1),
    SPAM_FOLDER(2);

    public final int d;

    uye(int i) {
        this.d = i;
    }

    public final boolean a() {
        if (this == HOME) {
            return true;
        }
        return false;
    }
}
