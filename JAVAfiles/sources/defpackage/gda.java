package defpackage;

/* loaded from: classes.dex */
public final class gda extends arps {
    /* synthetic */ Object a;
    int b;
    Object c;
    final /* synthetic */ gdb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gda(gdb gdbVar, arpe arpeVar) {
        super(arpeVar);
        this.d = gdbVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.fv(null, this);
    }
}
