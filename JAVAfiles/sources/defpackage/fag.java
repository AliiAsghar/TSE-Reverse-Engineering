package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fag {
    public boolean a;
    public fay b;
    public int c;
    public boolean d;
    public int e;

    public fag(fay fayVar) {
        this.b = fayVar;
    }

    public final void a(int i) {
        boolean z = true;
        if (1 != ((this.a ? 1 : 0) | i)) {
            z = false;
        }
        this.a = z;
        this.c += i;
    }
}
