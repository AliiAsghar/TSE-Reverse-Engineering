package defpackage;

import android.os.BatteryManager;
import j$.time.Instant;
import j$.util.DateRetargetClass;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enj extends arpw implements arqv {
    final /* synthetic */ Object a;
    private /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enj(agje agjeVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = agjeVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                return ((enj) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 1:
                return ((enj) c((eiz) obj, (arpe) obj2)).b(arnb.a);
            case 2:
                return ((enj) c((gef) obj, (arpe) obj2)).b(arnb.a);
            case 3:
                return ((enj) c((ujn) obj, (arpe) obj2)).b(arnb.a);
            case 4:
                return ((enj) c((arzu) obj, (arpe) obj2)).b(arnb.a);
            case 5:
                return ((enj) c((upr) obj, (arpe) obj2)).b(arnb.a);
            case 6:
                return ((enj) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 7:
                return ((enj) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            default:
                return ((enj) c((agir) obj, (arpe) obj2)).b(arnb.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [enl, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        boolean z = true;
        switch (this.c) {
            case 0:
                aqil.P(obj);
                arwe arweVar = (arwe) this.b;
                if (((eni) this.a).a.a().compareTo(eng.INITIALIZED) < 0) {
                    arwi.w(arweVar.b(), null);
                } else {
                    ?? r7 = this.a;
                    ((eni) r7).a.c(r7);
                }
                return arnb.a;
            case 1:
                aqil.P(obj);
                eiz eizVar = (eiz) this.b;
                if (!(eizVar instanceof ehn) || eizVar.b > ((eiz) this.a).b) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                aqil.P(obj);
                gef gefVar = (gef) this.b;
                int i = -gefVar.c;
                int i2 = ((gcc) this.a).b.f;
                if (i <= i2 && (-gefVar.d) <= i2) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                aqil.P(obj);
                if (((ujn) this.b) == null) {
                    return arnb.a;
                }
                throw null;
            case 4:
                aqil.P(obj);
                arzu arzuVar = (arzu) this.b;
                Iterator it = ((hmk) this.a).a.iterator();
                while (it.hasNext()) {
                    qjh.l(arzuVar, null, new qir(arzuVar, (arqr) it.next(), null), 3);
                }
                return arnb.a;
            case 5:
                aqil.P(obj);
                return Boolean.valueOf(DateRetargetClass.toInstant(((upr) this.b).q()).isBefore((Instant) this.a));
            case 6:
                aqil.P(obj);
                if (((BatteryManager) ((vwd) this.a).h.a()).getIntProperty(4) >= ((Number) ((vwd) this.a).b.b()).longValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                aqil.P(obj);
                return Boolean.valueOf(((vwd) this.a).d.d());
            default:
                aqil.P(obj);
                if (((agir) this.b) == agir.b) {
                    Object obj2 = this.a;
                    aozy createBuilder = aggp.a.createBuilder();
                    createBuilder.getClass();
                    ((agje) obj2).f.f(agiz.H(createBuilder));
                }
                ((agje) this.a).c();
                return arnb.a;
        }
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.c) {
            case 0:
                enj enjVar = new enj((eni) this.a, arpeVar, 0);
                enjVar.b = obj;
                return enjVar;
            case 1:
                enj enjVar2 = new enj((eiz) this.a, arpeVar, 1);
                enjVar2.b = obj;
                return enjVar2;
            case 2:
                enj enjVar3 = new enj((gcc) this.a, arpeVar, 2);
                enjVar3.b = obj;
                return enjVar3;
            case 3:
                enj enjVar4 = new enj((jyk) this.a, arpeVar, 3);
                enjVar4.b = obj;
                return enjVar4;
            case 4:
                enj enjVar5 = new enj((hmk) this.a, arpeVar, 4);
                enjVar5.b = obj;
                return enjVar5;
            case 5:
                enj enjVar6 = new enj((Instant) this.a, arpeVar, 5);
                enjVar6.b = obj;
                return enjVar6;
            case 6:
                enj enjVar7 = new enj(arpeVar, (vwd) this.a, 6);
                enjVar7.b = obj;
                return enjVar7;
            case 7:
                enj enjVar8 = new enj(arpeVar, (vwd) this.a, 7, null);
                enjVar8.b = obj;
                return enjVar8;
            default:
                enj enjVar9 = new enj((agje) this.a, arpeVar, 8);
                enjVar9.b = obj;
                return enjVar9;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enj(arpe arpeVar, vwd vwdVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = vwdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enj(arpe arpeVar, vwd vwdVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.c = i;
        this.a = vwdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enj(eiz eizVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = eizVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enj(eni eniVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = eniVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enj(gcc gccVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = gccVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enj(hmk hmkVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = hmkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enj(Instant instant, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = instant;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enj(jyk jykVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = jykVar;
    }
}
