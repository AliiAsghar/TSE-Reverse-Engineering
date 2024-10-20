package defpackage;

import defpackage.cvo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aru implements cvo {
    private final arq a;
    private final uv b = new uv((byte[]) null);

    public aru(arq arqVar) {
        this.a = arqVar;
    }

    @Override // defpackage.cvo
    public final void a(cvo.a aVar) {
        this.b.e();
        for (Object obj : aVar) {
            Object a = this.a.a(obj);
            int c = this.b.c(a, 0);
            if (c == 7) {
                aVar.remove(obj);
            } else {
                this.b.g(a, c + 1);
            }
        }
    }

    @Override // defpackage.cvo
    public final boolean b(Object obj, Object obj2) {
        arq arqVar = this.a;
        return d.F(arqVar.a(obj), arqVar.a(obj2));
    }
}
