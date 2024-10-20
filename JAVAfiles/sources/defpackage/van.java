package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class van {
    public int a;
    public int b;
    final /* synthetic */ vao c;

    public van(vao vaoVar) {
        this.c = vaoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        int i = this.b;
        vao vaoVar = this.c;
        if (i == vaoVar.c.a) {
            return vaoVar.b - this.a;
        }
        throw new RuntimeException("BUG: Invalid call to getLength()");
    }
}
