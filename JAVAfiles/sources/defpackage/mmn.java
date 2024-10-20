package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mmn extends arps {
    /* synthetic */ Object a;
    final /* synthetic */ mmo b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmn(mmo mmoVar, arpe arpeVar) {
        super(arpeVar);
        this.b = mmoVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return mmo.d(this.b, this);
    }
}
