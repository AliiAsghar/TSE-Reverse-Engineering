package defpackage;

import defpackage.ajt;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bkw extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ ajq b;
    final /* synthetic */ cez c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkw(ajq ajqVar, cez cezVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = ajqVar;
        this.c = cezVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bkw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            ajq ajqVar = this.b;
            final cez cezVar = this.c;
            asai a = ajqVar.a();
            asaj asajVar = new asaj() { // from class: bkw.1
                @Override // defpackage.asaj
                public final /* bridge */ /* synthetic */ Object fv(Object obj2, arpe arpeVar) {
                    ajp ajpVar = (ajp) obj2;
                    if (ajpVar instanceof ajn) {
                        cez.this.add(ajpVar);
                    } else if (ajpVar instanceof ajo) {
                        cez.this.remove(((ajo) ajpVar).a);
                    } else if (ajpVar instanceof ajk) {
                        cez.this.add(ajpVar);
                    } else if (ajpVar instanceof ajl) {
                        cez.this.remove(((ajl) ajpVar).a);
                    } else if (ajpVar instanceof ajt.b) {
                        cez.this.add(ajpVar);
                    } else if (ajpVar instanceof ajt.c) {
                        cez.this.remove(((ajt.c) ajpVar).a);
                    } else if (ajpVar instanceof ajt.a) {
                        cez.this.remove(((ajt.a) ajpVar).a);
                    } else if (ajpVar instanceof aji) {
                        cez.this.add(ajpVar);
                    } else if (ajpVar instanceof ajj) {
                        cez.this.remove(((ajj) ajpVar).a);
                    } else if (ajpVar instanceof ajh) {
                        cez.this.remove(((ajh) ajpVar).a);
                    }
                    return arnb.a;
                }
            };
            this.a = 1;
            if (ascj.g((ascj) a, asajVar, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new bkw(this.b, this.c, arpeVar);
    }
}
