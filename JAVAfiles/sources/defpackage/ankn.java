package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ankn extends aniv {
    public final int c;

    public ankn(int i, String str) {
        super(a(i, str));
        this.c = i;
    }

    private static String a(int i, String str) {
        return str + "\nMessage Type: " + aqaw.a(i);
    }

    public ankn(int i, Throwable th) {
        super(a(i, "Received notification with incompatible group type and member role."), th);
        this.c = i;
    }
}
