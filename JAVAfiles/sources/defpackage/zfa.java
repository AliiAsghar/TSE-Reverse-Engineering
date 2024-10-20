package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfa extends arps {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ aair c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfa(aair aairVar, arpe arpeVar) {
        super(arpeVar);
        this.c = aairVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
