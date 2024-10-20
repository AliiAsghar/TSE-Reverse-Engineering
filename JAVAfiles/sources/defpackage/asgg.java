package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asgg {
    public final Object a;
    public final arqw b;
    public final Object c;
    public Object d;
    public int e = -1;
    private final arqw f;
    private final Object g;

    public asgg(Object obj, arqw arqwVar, arqw arqwVar2, Object obj2, Object obj3) {
        this.a = obj;
        this.b = arqwVar;
        this.f = arqwVar2;
        this.c = obj2;
        this.g = obj3;
    }

    public final Object a(Object obj, arpe arpeVar) {
        Object obj2 = this.c;
        Object obj3 = this.g;
        if (obj2 == asgk.f) {
            return ((arqr) obj3).a(arpeVar);
        }
        return ((arqv) obj3).a(obj, arpeVar);
    }

    public final Object b(Object obj) {
        return this.f.a(this.a, this.c, obj);
    }

    public final void c() {
        arwu arwuVar;
        Object obj = this.d;
        if (obj instanceof aseo) {
            ((aseo) obj).l(this.e);
            return;
        }
        if (obj instanceof arwu) {
            arwuVar = (arwu) obj;
        } else {
            arwuVar = null;
        }
        if (arwuVar != null) {
            arwuVar.hd();
        }
    }
}
