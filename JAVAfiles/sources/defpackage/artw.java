package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class artw implements artx {
    public final Object a;
    public final Object b;
    private final /* synthetic */ int c;

    public artw(arqg arqgVar, arqr arqrVar, int i) {
        this.c = i;
        this.a = arqgVar;
        this.b = arqrVar;
    }

    @Override // defpackage.artx
    public final Iterator a() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return new aruk(this);
                }
                return new aruj(this, 0);
            }
            return new artu(this);
        }
        return new artv(this);
    }

    public artw(artx artxVar, arqr arqrVar, int i) {
        this.c = i;
        this.b = artxVar;
        this.a = arqrVar;
    }
}
