package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nfi extends arps {
    /* synthetic */ Object a;
    final /* synthetic */ nfl b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfi(nfl nflVar, arpe arpeVar) {
        super(arpeVar);
        this.b = nflVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, this);
    }
}
