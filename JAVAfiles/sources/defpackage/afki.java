package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afki implements arqw {
    private final arqw a;
    private Object b;
    private Object c;
    private Object d;
    private Object e;

    public afki(arqw arqwVar) {
        this.a = arqwVar;
    }

    @Override // defpackage.arqw
    public final Object a(Object obj, Object obj2, Object obj3) {
        if (!d.F(this.b, obj) || !d.F(this.c, obj2) || !d.F(this.d, obj3)) {
            this.b = obj;
            this.c = obj2;
            this.d = obj3;
            this.e = null;
        }
        Object obj4 = this.e;
        if (obj4 == null) {
            Object a = this.a.a(obj, obj2, obj3);
            this.e = a;
            return a;
        }
        return obj4;
    }
}
