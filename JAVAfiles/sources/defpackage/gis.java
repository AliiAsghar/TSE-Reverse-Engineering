package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gis extends arps {
    Object a;
    Object b;
    int c;
    int d;
    int e;
    /* synthetic */ Object f;
    final /* synthetic */ giw g;
    int h;
    String[] i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gis(giw giwVar, arpe arpeVar) {
        super(arpeVar);
        this.g = giwVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, 0, this);
    }
}
