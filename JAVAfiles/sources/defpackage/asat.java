package defpackage;

/* loaded from: classes4.dex */
public final class asat extends arps {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public Object d;
    final /* synthetic */ akee e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asat(akee akeeVar, arpe arpeVar) {
        super(arpeVar);
        this.e = akeeVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
