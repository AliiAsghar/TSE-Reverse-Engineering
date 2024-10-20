package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zup extends arpw implements arqv {
    int a;

    public zup(arpe arpeVar) {
        super(2, arpeVar);
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return new zup((arpe) obj2).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            long intValue = ((Number) zus.a.e()).intValue();
            this.a = 1;
            if (arwi.m(intValue, this) == arplVar) {
                return arplVar;
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new zup(arpeVar);
    }
}
