package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uxa extends arps {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ uac c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxa(uac uacVar, arpe arpeVar) {
        super(arpeVar);
        this.c = uacVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.i(this);
    }
}
