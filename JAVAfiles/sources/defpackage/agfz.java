package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agfz extends arpw implements arqv {
    /* synthetic */ int a;
    final /* synthetic */ Integer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agfz(Integer num, arpe arpeVar) {
        super(2, arpeVar);
        this.b = num;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agfz) c(Integer.valueOf(((Number) obj).intValue()), (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        int i = this.a;
        Integer num = this.b;
        boolean z = false;
        if (num != null && i == num.intValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        agfz agfzVar = new agfz(this.b, arpeVar);
        agfzVar.a = ((Number) obj).intValue();
        return agfzVar;
    }
}
