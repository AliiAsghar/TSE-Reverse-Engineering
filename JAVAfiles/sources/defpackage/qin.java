package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qin extends arrp implements arqr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qin(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [pvk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v58, types: [msk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v56, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        switch (this.b) {
            case 0:
                ((ahmn) this.a).w();
                return arnb.a;
            case 1:
                qwe qweVar = (qwe) obj;
                qweVar.getClass();
                aozy createBuilder = ngc.a.createBuilder();
                createBuilder.getClass();
                String b = qweVar.b();
                b.getClass();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj2 = this.a;
                ((ngc) createBuilder.b).b = b;
                apag s = createBuilder.s();
                s.getClass();
                ngc ngcVar = (ngc) s;
                aozy aozyVar = (aozy) ((hgi) obj2).a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                ngd ngdVar = (ngd) aozyVar.b;
                ngd ngdVar2 = ngd.a;
                ngdVar.d = ngcVar;
                ngdVar.b |= 2;
                return arnb.a;
            case 2:
                Throwable th = (Throwable) obj;
                if (th != null && !(th instanceof CancellationException)) {
                    Throwable initCause = ((qji) this.a).initCause(th);
                    initCause.getClass();
                    aiut.a().post(new nau(initCause, 10));
                }
                return arnb.a;
            case 3:
                qlo qloVar = (qlo) obj;
                aozy builder = qloVar.toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                ((qlo) builder.b).c = 7;
                qln qlnVar = qloVar.d;
                if (qlnVar == null) {
                    qlnVar = qln.a;
                }
                aozy builder2 = qlnVar.toBuilder();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                ((qln) builder2.b).c = a.ak(2);
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                qlo qloVar2 = (qlo) builder.b;
                qln qlnVar2 = (qln) builder2.s();
                qlnVar2.getClass();
                qloVar2.d = qlnVar2;
                qloVar2.b |= 1;
                Object obj3 = this.a;
                alwo alwoVar = qlh.a;
                qlh qlhVar = (qlh) obj3;
                if (((oxh) qlhVar.g.b()).a() && ((Boolean) qlhVar.f.b()).booleanValue()) {
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    qlo qloVar3 = (qlo) builder.b;
                    qloVar3.b |= 8;
                    qloVar3.g = true;
                }
                return (qlo) builder.s();
            case 4:
                qlo qloVar4 = (qlo) obj;
                aozy builder3 = qloVar4.toBuilder();
                qln qlnVar3 = qloVar4.d;
                if (qlnVar3 == null) {
                    qlnVar3 = qln.a;
                }
                aozy builder4 = qlnVar3.toBuilder();
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                ((qln) builder4.b).c = a.ak(3);
                Object obj4 = this.a;
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                qln qlnVar4 = (qln) builder4.b;
                obj4.getClass();
                qlnVar4.d = (apct) obj4;
                qlnVar4.b |= 1;
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                qlo qloVar5 = (qlo) builder3.b;
                qln qlnVar5 = (qln) builder4.s();
                qlnVar5.getClass();
                qloVar5.d = qlnVar5;
                qloVar5.b |= 1;
                Object obj5 = this.a;
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                apag apagVar = builder3.b;
                qlo qloVar6 = (qlo) apagVar;
                obj5.getClass();
                qloVar6.e = (apct) obj5;
                qloVar6.b |= 2;
                Object obj6 = this.a;
                if (!apagVar.isMutable()) {
                    builder3.u();
                }
                qlo qloVar7 = (qlo) builder3.b;
                obj6.getClass();
                qloVar7.f = (apct) obj6;
                qloVar7.b |= 4;
                return (qlo) builder3.s();
            case 5:
                qll qllVar = (qll) obj;
                qllVar.getClass();
                return Boolean.valueOf(this.a.contains(Long.valueOf(qllVar.a)));
            case 6:
                aozy builder5 = ((qlo) obj).toBuilder();
                if (!builder5.b.isMutable()) {
                    builder5.u();
                }
                Object obj7 = this.a;
                qlo qloVar8 = (qlo) builder5.b;
                obj7.getClass();
                qloVar8.e = (apct) obj7;
                qloVar8.b |= 2;
                return (qlo) builder5.s();
            case 7:
                qlo qloVar9 = (qlo) obj;
                qloVar9.getClass();
                aozy builder6 = qloVar9.toBuilder();
                if (!builder6.b.isMutable()) {
                    builder6.u();
                }
                Object obj8 = this.a;
                qlo qloVar10 = (qlo) builder6.b;
                obj8.getClass();
                qloVar10.f = (apct) obj8;
                qloVar10.b |= 4;
                apag s2 = builder6.s();
                s2.getClass();
                return (qlo) s2;
            case 8:
                aozy builder7 = ((qlo) obj).toBuilder();
                if (!builder7.b.isMutable()) {
                    builder7.u();
                }
                Object obj9 = this.a;
                qlo qloVar11 = (qlo) builder7.b;
                obj9.getClass();
                qloVar11.f = (apct) obj9;
                qloVar11.b |= 4;
                return (qlo) builder7.s();
            case 9:
                Integer num = (Integer) obj;
                num.getClass();
                return ((adji) ((kkc) this.a).a).e(num.intValue());
            case 10:
                return ((qwd) this.a).h((String) obj);
            case 11:
                return Boolean.valueOf(d.F((String) obj, ((qei) this.a).d));
            case 12:
                return Boolean.valueOf(d.F((String) obj, ((qei) this.a).d));
            case 13:
                return ((rdc) this.a).a.c((qei) obj);
            case 14:
                return ((wfe) ((rat) this.a).I.b()).e((qei) obj);
            case 15:
                mag magVar = (mag) obj;
                magVar.getClass();
                ?? r0 = this.a;
                String aw = r0.aw();
                uuf uufVar = rxn.a;
                magVar.a(r0, ParticipantsTable.a(aw));
                return arnb.a;
            case 16:
                vae vaeVar = (vae) obj;
                vaeVar.getClass();
                Uri.parse((String) this.a);
                vaeVar.a();
                return arnb.a;
            case 17:
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                bindData.getClass();
                return ((uie) this.a).b.q(bindData);
            case 18:
                uqa uqaVar = (uqa) obj;
                uqaVar.getClass();
                uqaVar.g((String) this.a);
                return arnb.a;
            case 19:
                upc upcVar = (upc) obj;
                if (upcVar.b.contains(this.a)) {
                    return upcVar;
                }
                upcVar.getClass();
                Object obj10 = this.a;
                aozy builder8 = upcVar.toBuilder();
                builder8.getClass();
                upb.c(builder8);
                upb.b((String) obj10, builder8);
                return upb.a(builder8);
            default:
                upc upcVar2 = (upc) obj;
                if (upcVar2.b.contains(this.a)) {
                    return upcVar2;
                }
                upcVar2.getClass();
                Object obj11 = this.a;
                aozy builder9 = upcVar2.toBuilder();
                builder9.getClass();
                upb.c(builder9);
                upb.b((String) obj11, builder9);
                return upb.a(builder9);
        }
    }
}
