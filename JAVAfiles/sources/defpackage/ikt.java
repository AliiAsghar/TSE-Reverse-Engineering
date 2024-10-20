package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikt extends arpw implements arqr {
    Object a;
    int b;
    final /* synthetic */ arqv c;
    final /* synthetic */ ncq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikt(arqv arqvVar, ncq ncqVar, arpe arpeVar) {
        super(1, arpeVar);
        this.c = arqvVar;
        this.d = ncqVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new ikt(this.c, this.d, (arpe) obj).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arqv arqvVar;
        arpl arplVar = arpl.a;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                aqil.P(obj);
                return obj;
            }
            Object obj2 = this.a;
            aqil.P(obj);
            arqvVar = obj2;
        } else {
            aqil.P(obj);
            arqv arqvVar2 = this.c;
            akul b = this.d.b();
            this.a = arqvVar2;
            this.b = 1;
            obj = arro.F(b, this);
            arqvVar = arqvVar2;
            if (obj == arplVar) {
                return arplVar;
            }
        }
        this.a = null;
        this.b = 2;
        obj = arqvVar.a(obj, this);
        if (obj == arplVar) {
            return arplVar;
        }
        return obj;
    }
}
