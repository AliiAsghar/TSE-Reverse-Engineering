package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class adug extends Exception {
    private static final long serialVersionUID = 1;
    public final int a;

    public adug() {
        super("ImsServiceSessionException: 6");
        this.a = 6;
    }

    public adug(int i, String str) {
        super(str);
        this.a = i;
    }

    public adug(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }

    public adug(Throwable th) {
        super("ImsServiceSessionException: 0", th);
        this.a = 0;
    }
}
