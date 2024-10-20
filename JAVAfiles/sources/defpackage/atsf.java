package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atsf extends arps {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ atsg c;
    atsg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atsf(atsg atsgVar, arpe arpeVar) {
        super(arpeVar);
        this.c = atsgVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
