package defpackage;

import com.google.android.libraries.abuse.hades.tartarus.runtime.Data;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaji extends arrp implements arqr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaji(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v40, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v43, types: [java.lang.Object, kqc] */
    /* JADX WARN: Type inference failed for: r7v66, types: [java.lang.Object, aebp] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        Object obj2;
        switch (this.b) {
            case 0:
                qlo qloVar = (qlo) obj;
                qloVar.getClass();
                aozy builder = qloVar.toBuilder();
                qln qlnVar = qloVar.d;
                if (qlnVar == null) {
                    qlnVar = qln.a;
                }
                aozy builder2 = qlnVar.toBuilder();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                ((qln) builder2.b).c = a.ak(3);
                Object obj3 = this.a;
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                qln qlnVar2 = (qln) builder2.b;
                obj3.getClass();
                qlnVar2.d = (apct) obj3;
                qlnVar2.b |= 1;
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                qlo qloVar2 = (qlo) builder.b;
                qln qlnVar3 = (qln) builder2.s();
                qlnVar3.getClass();
                qloVar2.d = qlnVar3;
                qloVar2.b |= 1;
                Object obj4 = this.a;
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                apag apagVar = builder.b;
                qlo qloVar3 = (qlo) apagVar;
                obj4.getClass();
                qloVar3.e = (apct) obj4;
                qloVar3.b |= 2;
                Object obj5 = this.a;
                if (!apagVar.isMutable()) {
                    builder.u();
                }
                qlo qloVar4 = (qlo) builder.b;
                obj5.getClass();
                qloVar4.f = (apct) obj5;
                qloVar4.b |= 4;
                apag s = builder.s();
                s.getClass();
                return (qlo) s;
            case 1:
                kpb kpbVar = (kpb) obj;
                kpbVar.getClass();
                ((aair) this.a).a().getIntent();
                kpbVar.c();
                return arnb.a;
            case 2:
                ((zof) obj).getClass();
                aaoq aaoqVar = (aaoq) this.a;
                qjh.l(aaoqVar.j, null, new aanv(aaoqVar, (arpe) null, 4), 3);
                return arnb.a;
            case 3:
                ((zof) obj).getClass();
                aaoq aaoqVar2 = (aaoq) this.a;
                qjh.l(aaoqVar2.j, null, new zcb(aaoqVar2, (arpe) null, 7), 3);
                return arnb.a;
            case 4:
                ((abee) obj).getClass();
                aozy createBuilder = abee.a.createBuilder();
                createBuilder.getClass();
                apct a = ytf.a(((xnv) ((aagg) this.a).b).f().toEpochMilli());
                a.getClass();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                abee abeeVar = (abee) createBuilder.b;
                abeeVar.c = a;
                abeeVar.b |= 1;
                return abgj.e(createBuilder);
            case 5:
                Optional optional = (Optional) obj;
                optional.getClass();
                if (optional.isPresent()) {
                    obj2 = optional.get();
                } else {
                    obj2 = false;
                }
                if (((Boolean) obj2).booleanValue()) {
                    ?? r7 = this.a;
                    alvw m = abfh.b.m();
                    m.X(ydl.M, "WelcomeFlowEntryPoint");
                    m.q("[Auto sign-in] Attempting to switch account");
                    if (r7 != 0) {
                        r7.b();
                    }
                }
                return arnb.a;
            case 6:
                abgb abgbVar = (abgb) obj;
                abgbVar.getClass();
                aozy builder3 = abgbVar.toBuilder();
                long epochMilli = ((Instant) this.a).toEpochMilli();
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                abgb abgbVar2 = (abgb) builder3.b;
                abgbVar2.b |= 1;
                abgbVar2.c = epochMilli;
                apag s2 = builder3.s();
                s2.getClass();
                return (abgb) s2;
            case 7:
                adjf adjfVar = (adjf) obj;
                adjfVar.getClass();
                return Boolean.valueOf(d.F(adjfVar.b, this.a));
            case 8:
                adjf adjfVar2 = (adjf) obj;
                adjfVar2.getClass();
                return Boolean.valueOf(d.F(adjfVar2.a, this.a));
            case 9:
                adjf adjfVar3 = (adjf) obj;
                adjfVar3.getClass();
                return Boolean.valueOf(d.F(adjfVar3.a, this.a));
            case 10:
                adjf adjfVar4 = (adjf) obj;
                adjfVar4.getClass();
                return Boolean.valueOf(d.F(adjfVar4.a, this.a));
            case 11:
                Data data = (Data) obj;
                data.getClass();
                this.a.a(new ahjj(data, (byte[]) null));
                return arnb.a;
            case 12:
                hmk hmkVar = (hmk) obj;
                hmkVar.getClass();
                aozy createBuilder2 = iad.a.createBuilder();
                createBuilder2.getClass();
                aozy createBuilder3 = hzz.a.createBuilder();
                createBuilder3.getClass();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                Object obj6 = this.a;
                hzz hzzVar = (hzz) createBuilder3.b;
                hzzVar.b |= 1;
                hzzVar.c = (String) obj6;
                apag s3 = createBuilder3.s();
                s3.getClass();
                hzz hzzVar2 = (hzz) s3;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                iad iadVar = (iad) createBuilder2.b;
                iadVar.c = hzzVar2;
                iadVar.b |= 1;
                apag s4 = createBuilder2.s();
                s4.getClass();
                iad iadVar2 = (iad) s4;
                aozy aozyVar = (aozy) hmkVar.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                hzh hzhVar = (hzh) aozyVar.b;
                hzh hzhVar2 = hzh.a;
                hzhVar.e = iadVar2;
                hzhVar.b |= 4;
                return arnb.a;
            case 13:
                alok alokVar = (alok) obj;
                alokVar.getClass();
                aaji aajiVar = new aaji(this.a, 12);
                hmk l = hwr.l(hzh.a.createBuilder());
                aajiVar.a(l);
                alokVar.h("/internal/moirai_default/1", l.b());
                return arnb.a;
            case 14:
                aedx aedxVar = (aedx) obj;
                aedxVar.getClass();
                aozy builder4 = aedxVar.toBuilder();
                this.a.a(builder4);
                return (aedx) builder4.s();
            case 15:
                ((Data) obj).getClass();
                adzz adzzVar = ((aede) this.a).a;
                return arnb.a;
            case 16:
                Data data2 = (Data) obj;
                data2.getClass();
                adcx.C(data2, "classificationResult", new aaji(this.a, 15));
                return arnb.a;
            case 17:
                Data data3 = (Data) obj;
                data3.getClass();
                adcx.C(data3, "easyLearn", new aaji(this.a, 16));
                return arnb.a;
            case 18:
                dho dhoVar = (dho) obj;
                dhoVar.getClass();
                Object obj7 = this.a;
                if (obj7 != null) {
                    dhl.f(dhoVar, (String) obj7);
                }
                return arnb.a;
            case 19:
                this.a.h(Boolean.valueOf(((Boolean) obj).booleanValue()));
                return arnb.a;
            default:
                cti ctiVar = (cti) obj;
                ctiVar.getClass();
                int i = aeim.a;
                this.a.h(ctiVar);
                return arnb.a;
        }
    }
}
