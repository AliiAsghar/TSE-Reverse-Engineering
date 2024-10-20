package defpackage;

import defpackage.ajt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkp extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ ajq b;
    final /* synthetic */ cez c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkp(ajq ajqVar, cez cezVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = ajqVar;
        this.c = cezVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bkp) c((arwe) obj, (arpe) obj2)).b(arnb.a);
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
            asaj asajVar = new asaj() { // from class: bkp.1
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
        return new bkp(this.b, this.c, arpeVar);
    }
}
