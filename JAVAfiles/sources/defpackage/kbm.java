package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbm extends arpw implements arqv {
    int a;
    /* synthetic */ boolean b;
    final /* synthetic */ kbn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbm(kbn kbnVar, arpe arpeVar) {
        super(2, arpeVar);
        this.c = kbnVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((kbm) c(bool, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        boolean z;
        Long l;
        arpl arplVar = arpl.a;
        if (this.a != 0) {
            z = this.b;
            aqil.P(obj);
        } else {
            aqil.P(obj);
            z = this.b;
        }
        while (z) {
            kbn kbnVar = this.c;
            if (kbnVar.e != null) {
                l = new Long(r2.getCurrentPosition());
            } else {
                l = new Long(0L);
            }
            kbnVar.j.f(l);
            this.b = true;
            this.a = 1;
            if (arwi.m(100L, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        kbm kbmVar = new kbm(this.c, arpeVar);
        kbmVar.b = ((Boolean) obj).booleanValue();
        return kbmVar;
    }
}
