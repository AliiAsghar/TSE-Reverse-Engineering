package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aduf extends Exception {
    private static final long serialVersionUID = 1;
    public final int a;

    public aduf(int i, String str) {
        super(str);
        this.a = i;
    }

    public aduf(String str, Throwable th) {
        super(str, th);
        this.a = 0;
    }

    public aduf(Throwable th) {
        super(th);
        this.a = 0;
    }
}
