package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hov {
    public boolean a;
    public boolean b;
    public boolean c;

    private final boolean g() {
        if ((this.c || this.b) && this.a) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a() {
        this.b = false;
        this.a = false;
        this.c = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean b() {
        this.b = true;
        return g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean c() {
        this.c = true;
        return g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean d() {
        this.a = true;
        return g();
    }

    public final fcg e() {
        if (!this.b && (this.c || this.a)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new fcg(this);
    }

    public final void f() {
        this.b = true;
    }
}
