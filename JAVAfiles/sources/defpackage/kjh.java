package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kjh extends arpw implements arqw {
    /* synthetic */ Object a;
    /* synthetic */ int b;

    public kjh(arpe arpeVar) {
        super(3, arpeVar);
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        kjh kjhVar = new kjh((arpe) obj3);
        kjhVar.a = (kjk) obj;
        kjhVar.b = intValue;
        return kjhVar.b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        Object obj2 = this.a;
        int i = this.b;
        if (obj2 != null) {
            return (ujn) aqjn.aa(((kjk) obj2).b, i);
        }
        return null;
    }
}
