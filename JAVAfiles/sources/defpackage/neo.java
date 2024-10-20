package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class neo extends arps {
    public /* synthetic */ Object a;
    public int b;
    public jld c;
    final /* synthetic */ hgi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public neo(hgi hgiVar, arpe arpeVar) {
        super(arpeVar);
        this.d = hgiVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.C(null, null, this);
    }
}
