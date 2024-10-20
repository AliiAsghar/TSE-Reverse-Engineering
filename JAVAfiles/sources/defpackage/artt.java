package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class artt implements artx {
    public final artx a;
    public final boolean b;
    public final arqr c;

    public artt(artx artxVar, boolean z, arqr arqrVar) {
        this.a = artxVar;
        this.b = z;
        this.c = arqrVar;
    }

    @Override // defpackage.artx
    public final Iterator a() {
        return new aruj(this, 1);
    }
}
