package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xyd implements Supplier {
    public final Object a = new Object();
    public boolean b = false;
    private final Supplier c;
    private Object d;

    public xyd(Supplier supplier) {
        this.c = supplier;
    }

    public final void a() {
        synchronized (this.a) {
            this.d = null;
            this.b = false;
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Object obj;
        Object obj2;
        synchronized (this.a) {
            if (!this.b) {
                obj2 = this.c.get();
                this.d = obj2;
                this.b = true;
            }
            obj = this.d;
            obj.getClass();
        }
        return obj;
    }
}
