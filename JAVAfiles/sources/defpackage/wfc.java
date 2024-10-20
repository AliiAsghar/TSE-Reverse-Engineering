package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wfc extends arpw implements arqv {
    final /* synthetic */ adit a;
    final /* synthetic */ Integer b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;
    final /* synthetic */ wyp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfc(wyp wypVar, adit aditVar, Integer num, boolean z, int i, arpe arpeVar) {
        super(2, arpeVar);
        this.e = wypVar;
        this.a = aditVar;
        this.b = num;
        this.c = z;
        this.d = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wfc) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        aozy createBuilder = amxk.a.createBuilder();
        createBuilder.getClass();
        Integer num = this.b;
        if (num != null) {
            int intValue = num.intValue();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amxk amxkVar = (amxk) createBuilder.b;
            amxkVar.b |= 2;
            amxkVar.d = intValue;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        boolean z = this.c;
        adit aditVar = this.a;
        amxk amxkVar2 = (amxk) createBuilder.b;
        amxkVar2.b |= 4;
        amxkVar2.e = z;
        if (aditVar != null) {
            String r = wyp.r(aditVar);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amxk amxkVar3 = (amxk) createBuilder.b;
            amxkVar3.b |= 1;
            amxkVar3.c = r;
        }
        apag s = createBuilder.s();
        s.getClass();
        int i = this.d;
        amxk amxkVar4 = (amxk) s;
        aozy createBuilder2 = amxn.a.createBuilder();
        createBuilder2.getClass();
        aktp.aW(i, createBuilder2);
        int i2 = i - 1;
        if (i2 != 12) {
            if (i2 != 13) {
                switch (i2) {
                    case 17:
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        amxn amxnVar = (amxn) createBuilder2.b;
                        amxnVar.m = amxkVar4;
                        amxnVar.b |= 256;
                        break;
                    case 18:
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        amxn amxnVar2 = (amxn) createBuilder2.b;
                        amxnVar2.n = amxkVar4;
                        amxnVar2.b |= 512;
                        break;
                    case 19:
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        amxn amxnVar3 = (amxn) createBuilder2.b;
                        amxnVar3.o = amxkVar4;
                        amxnVar3.b |= 1024;
                        break;
                    default:
                        Objects.toString(aktp.aX(i));
                        throw new IllegalArgumentException("Unsupported event type: ".concat(aktp.aX(i)));
                }
            } else {
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                amxn amxnVar4 = (amxn) createBuilder2.b;
                amxnVar4.l = amxkVar4;
                amxnVar4.b |= 128;
            }
        } else {
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amxn amxnVar5 = (amxn) createBuilder2.b;
            amxnVar5.k = amxkVar4;
            amxnVar5.b |= 64;
        }
        this.e.q(aktp.aU(createBuilder2));
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new wfc(this.e, this.a, this.b, this.c, this.d, arpeVar);
    }
}
