package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmu extends arps {
    public Object a;
    public /* synthetic */ Object b;
    public int c;
    final /* synthetic */ jat d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmu(jat jatVar, arpe arpeVar) {
        super(arpeVar);
        this.d = jatVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
