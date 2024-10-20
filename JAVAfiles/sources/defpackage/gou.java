package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gou extends got {
    private final Object a;
    private final String b;
    private final int c;

    public gou(Object obj, String str, int i) {
        this.a = obj;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.got
    public final got a(String str, arqr arqrVar) {
        if (((Boolean) arqrVar.a(this.a)).booleanValue()) {
            return this;
        }
        return new gos(this.a, this.b, str, this.c);
    }

    @Override // defpackage.got
    public final Object b() {
        return this.a;
    }
}
