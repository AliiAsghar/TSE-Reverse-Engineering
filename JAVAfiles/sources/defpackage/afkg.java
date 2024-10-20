package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afkg implements arqr {
    private final arqr a;
    private Object b;
    private Object c;

    public afkg(arqr arqrVar) {
        this.a = arqrVar;
    }

    @Override // defpackage.arqr
    public final Object a(Object obj) {
        if (!d.F(this.b, obj)) {
            this.b = obj;
            this.c = null;
        }
        Object obj2 = this.c;
        if (obj2 == null) {
            Object a = this.a.a(obj);
            this.c = a;
            return a;
        }
        return obj2;
    }
}
