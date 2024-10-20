package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jid extends arpw implements arqx {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;

    public jid(arpe arpeVar) {
        super(4, arpeVar);
    }

    @Override // defpackage.arqx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        jid jidVar = new jid((arpe) obj4);
        jidVar.a = (mwj) obj;
        jidVar.b = (mjq) obj2;
        jidVar.c = (String) obj3;
        return jidVar.b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [mwj, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        ?? r4 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        obj2.getClass();
        return new jiw(r4, (mjq) obj2, (String) obj3);
    }
}
