package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wyr extends Exception {
    private static final long serialVersionUID = 1;
    public final int a;
    public final int b;

    public wyr(int i) {
        this.a = i;
        a();
        this.b = 10000;
    }

    private final void a() {
        int i = this.a;
        boolean z = true;
        if (i != 1 && i != 2 && i != 3) {
            z = false;
        }
        albo.T(z);
    }

    public wyr(int i, String str) {
        super(str);
        this.a = i;
        a();
        this.b = 0;
    }
}
