package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtz extends dui {
    public final Object a;
    public final dub b;
    public final dua c;
    public final dub d;
    public final dua e;

    public dtz(Object obj) {
        this.a = obj;
        this.b = new dub(obj, -2, this);
        this.c = new dua(obj, 0, this);
        this.d = new dub(obj, -1, this);
        this.e = new dua(obj, 1, this);
    }

    @Override // defpackage.dui
    public final Object a() {
        return this.a;
    }
}
