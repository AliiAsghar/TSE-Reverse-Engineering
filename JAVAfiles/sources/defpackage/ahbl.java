package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahbl extends Exception {
    public ahbl(String str, String str2) {
        this(str, str2, null);
    }

    public ahbl(String str, String str2, Throwable th) {
        super(a.co(str2, str, ": "), th);
    }
}
