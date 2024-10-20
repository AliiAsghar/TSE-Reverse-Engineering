package defpackage;

import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.net.URI;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class anke extends arpw implements arqr {
    int a;
    final /* synthetic */ anki b;
    final /* synthetic */ anjj c;
    final /* synthetic */ aqfn d;
    final /* synthetic */ Instant e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anke(anki ankiVar, anjj anjjVar, aqfn aqfnVar, Instant instant, arpe arpeVar) {
        super(1, arpeVar);
        this.b = ankiVar;
        this.c = anjjVar;
        this.d = aqfnVar;
        this.e = instant;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new anke(this.b, this.c, this.d, this.e, (arpe) obj).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        akul h;
        Object obj2 = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            anki ankiVar = this.b;
            anjj anjjVar = this.c;
            aqfn aqfnVar = this.d;
            Instant instant = this.e;
            this.a = 1;
            Optional optional = anjjVar.a.b;
            Optional ofNullable = Optional.ofNullable(aqfnVar);
            if (optional.isEmpty()) {
                h = aktp.af(new xfg("Missing Conference URI when being added to a group.", true));
            } else {
                Object obj3 = ankiVar.a.a;
                int i2 = 10;
                Optional map = ofNullable.map(new uzn(obj3, instant, i2, null));
                aozy createBuilder = qez.b.createBuilder();
                createBuilder.E(xes.a(anjjVar.c));
                aozy createBuilder2 = qfj.a.createBuilder();
                String str = anjjVar.b.a;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qfj qfjVar = (qfj) createBuilder2.b;
                qfjVar.b |= 1;
                qfjVar.c = str;
                int i3 = 9;
                map.ifPresent(new wqw(createBuilder2, i3));
                xew xewVar = (xew) obj3;
                if (((ojs) xewVar.g.b()).a()) {
                    qfd cM = yyb.cM(anjjVar.b.c);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    qez qezVar = (qez) createBuilder.b;
                    qezVar.l = cM;
                    qezVar.c |= 64;
                }
                int i4 = 8;
                if (((poz) xewVar.h.b()).a()) {
                    aozy createBuilder3 = qfa.a.createBuilder();
                    anjg anjgVar = anjjVar.b.d;
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    String str2 = anjgVar.b;
                    qfa qfaVar = (qfa) createBuilder3.b;
                    qfaVar.b |= 1;
                    qfaVar.c = str2;
                    map.ifPresent(new wqw(createBuilder3, i2));
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    qez qezVar2 = (qez) createBuilder.b;
                    qfa qfaVar2 = (qfa) createBuilder3.s();
                    qfaVar2.getClass();
                    qezVar2.i = qfaVar2;
                    qezVar2.c |= 8;
                }
                qei qeiVar = xewVar.e;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                qez qezVar3 = (qez) apagVar;
                qeiVar.getClass();
                qezVar3.k = qeiVar;
                qezVar3.c |= 32;
                String str3 = anjjVar.a.a.c;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                qez qezVar4 = (qez) createBuilder.b;
                str3.getClass();
                qezVar4.c |= 1;
                qezVar4.d = str3;
                qei a = ((psq) xewVar.b.b()).a(((URI) anjjVar.a.b.get()).toString(), true);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qez qezVar5 = (qez) createBuilder.b;
                a.getClass();
                qezVar5.e = a;
                qezVar5.c |= 2;
                Stream map2 = Collection.EL.stream(anjjVar.d).map(new xdo(i4)).map(new xeo(new xei().m(), i3)).map(new xeo(map, i2));
                int i5 = alog.d;
                createBuilder.F((alog) map2.collect(alls.a));
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qco qcoVar = xewVar.i;
                qez qezVar6 = (qez) createBuilder.b;
                qfj qfjVar2 = (qfj) createBuilder2.s();
                qfjVar2.getClass();
                qezVar6.h = qfjVar2;
                qezVar6.c |= 4;
                h = qcoVar.e((qez) createBuilder.s()).i(new wkh(obj3, anjjVar, 13), xewVar.d).h(new xdh(7), xewVar.d);
            }
            h.getClass();
            Object F = arro.F(h, this);
            if (F != arpl.a) {
                F = arnb.a;
            }
            if (F == obj2) {
                return obj2;
            }
        }
        return arnb.a;
    }
}
