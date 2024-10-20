package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afkh implements arqv {
    private final arqv a;
    private Object b;
    private Object c;
    private Object d;

    public afkh(arqv arqvVar) {
        this.a = arqvVar;
    }

    @Override // defpackage.arqv
    public final Object a(Object obj, Object obj2) {
        if (!d.F(this.b, obj) || !d.F(this.c, obj2)) {
            this.b = obj;
            this.c = obj2;
            this.d = null;
        }
        Object obj3 = this.d;
        if (obj3 == null) {
            Object a = this.a.a(obj, obj2);
            this.d = a;
            return a;
        }
        return obj3;
    }
}
