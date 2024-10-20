package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ech extends ecg {
    private final Object a;

    public ech(int i) {
        super(i);
        this.a = new Object();
    }

    @Override // defpackage.ecg, defpackage.ecf
    public final Object a() {
        Object a;
        synchronized (this.a) {
            a = super.a();
        }
        return a;
    }

    @Override // defpackage.ecg, defpackage.ecf
    public final boolean b(Object obj) {
        boolean b;
        obj.getClass();
        synchronized (this.a) {
            b = super.b(obj);
        }
        return b;
    }
}
