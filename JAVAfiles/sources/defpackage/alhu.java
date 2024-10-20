package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alhu<T> implements alhr<T> {
    private static final alhr a = new abnl(14);
    private volatile alhr b;
    private Object c;
    private final arre d = new arre();

    public alhu(alhr alhrVar) {
        alhrVar.getClass();
        this.b = alhrVar;
    }

    @Override // defpackage.alhr
    public final T get() {
        alhr alhrVar = this.b;
        alhr alhrVar2 = a;
        if (alhrVar != alhrVar2) {
            synchronized (this.d) {
                if (this.b != alhrVar2) {
                    T t = (T) this.b.get();
                    this.c = t;
                    this.b = alhrVar2;
                    return t;
                }
            }
        }
        return (T) this.c;
    }

    public final String toString() {
        Object obj = this.b;
        if (obj == a) {
            obj = "<supplier that returned " + String.valueOf(this.c) + ">";
        }
        return hht.b(obj, "Suppliers.memoize(", ")");
    }
}
