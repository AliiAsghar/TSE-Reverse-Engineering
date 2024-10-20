package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acmj extends Exception {
    public acmj() {
    }

    public acmj(String str) {
        super(str);
    }

    public acmj(Throwable th) {
        super("ContentProvider query failed", th);
    }
}
