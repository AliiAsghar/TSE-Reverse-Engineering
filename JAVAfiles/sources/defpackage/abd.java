package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abd<S> extends ace<S> {
    private final byn b;
    private final byn c;

    public abd(Object obj) {
        this.b = new byu(obj, cav.a);
        this.c = new byu(obj, cav.a);
    }

    @Override // defpackage.ace
    public final Object a() {
        return this.b.a();
    }

    @Override // defpackage.ace
    public final Object b() {
        return this.c.a();
    }

    @Override // defpackage.ace
    public final void c(Object obj) {
        this.b.h(obj);
    }

    public final void d(Object obj) {
        this.c.h(obj);
    }
}
