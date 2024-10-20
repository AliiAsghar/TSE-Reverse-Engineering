package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rxb implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rxb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.b) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            case 15:
                return Function$CC.$default$andThen(this, function);
            case 16:
                return Function$CC.$default$andThen(this, function);
            case 17:
                return Function$CC.$default$andThen(this, function);
            case 18:
                return Function$CC.$default$andThen(this, function);
            case 19:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object apply;
        Integer valueOf;
        Integer valueOf2;
        int i = 0;
        int i2 = 2;
        switch (this.b) {
            case 0:
                scc sccVar = (scc) obj;
                Object obj2 = this.a;
                Function[] functionArr = {new rxb(obj2, i2), new rxb(obj2, 3)};
                scc[] sccVarArr = new scc[2];
                while (i < 2) {
                    apply = functionArr[i].apply(new scc());
                    sccVarArr[i] = (scc) apply;
                    i++;
                }
                sccVar.V(sccVarArr);
                return sccVar;
            case 1:
                tbu tbuVar = (tbu) obj;
                tbuVar.f(this.a.Z());
                return tbuVar;
            case 2:
                scc sccVar2 = (scc) obj;
                valueOf = Integer.valueOf(d.P().W().c());
                int intValue = valueOf.intValue();
                if (intValue < 4020) {
                    agnc.t("output_uri", intValue);
                }
                sccVar2.U(new agmd("draft_parts_view.processing_output_uri_parts", 1, this.a));
                return sccVar2;
            case 3:
                scc sccVar3 = (scc) obj;
                sccVar3.U(new agmd("draft_parts_view.uri_parts", 1, this.a));
                return sccVar3;
            case 4:
                return ((rtb) ((rxc) this.a).a.b()).g((PartsTable.BindData) obj);
            case 5:
                tbu tbuVar2 = (tbu) obj;
                valueOf2 = Integer.valueOf(a.bp().c());
                int intValue2 = valueOf2.intValue();
                if (intValue2 < 60080) {
                    agnc.t("processing_id", intValue2);
                }
                tbuVar2.U(new agmd("parts.processing_id", 1, pyz.a((pyz) this.a)));
                return tbuVar2;
            case 6:
                return this.a.a(obj);
            case 7:
                tbd tbdVar = (tbd) obj;
                alwo alwoVar = rxq.a;
                tbdVar.h((String) this.a);
                return tbdVar;
            case 8:
                tbd tbdVar2 = (tbd) obj;
                alwo alwoVar2 = rxq.a;
                tbdVar2.q(-2);
                smm smmVar = new smm(smp.a);
                smmVar.d(new rxo(5));
                smmVar.e(new rxb(this.a, 14));
                tbdVar2.i(smmVar.b());
                return tbdVar2;
            case 9:
                tbd tbdVar3 = (tbd) obj;
                alwo alwoVar3 = rxq.a;
                tbdVar3.q(-2);
                sla a = sld.a();
                a.d(new rxo(i));
                a.f(new rxb(this.a, 11));
                tbdVar3.i(a.b());
                return tbdVar3;
            case 10:
                tbd tbdVar4 = (tbd) obj;
                alwo alwoVar4 = rxq.a;
                tbdVar4.h((String) this.a);
                return tbdVar4;
            case 11:
                slc slcVar = (slc) obj;
                alwo alwoVar5 = rxq.a;
                slcVar.b((ConversationIdType) this.a);
                return slcVar;
            case 12:
                tbd tbdVar5 = (tbd) obj;
                alwo alwoVar6 = rxq.a;
                tbdVar5.q(-2);
                tbdVar5.l((String) this.a);
                return tbdVar5;
            case 13:
                tbd tbdVar6 = (tbd) obj;
                alwo alwoVar7 = rxq.a;
                tbdVar6.h((String) this.a);
                return tbdVar6;
            case 14:
                smo smoVar = (smo) obj;
                alwo alwoVar8 = rxq.a;
                smoVar.b((ConversationIdType) this.a);
                return smoVar;
            case 15:
                tbd tbdVar7 = (tbd) obj;
                alwo alwoVar9 = rxq.a;
                tbdVar7.l((String) this.a);
                tbdVar7.q(-2);
                return tbdVar7;
            case 16:
                tbd tbdVar8 = (tbd) obj;
                alwo alwoVar10 = rxq.a;
                tbdVar8.q(-2);
                tbdVar8.W(new agpk("REPLACE($V, '-','') = $V", new Object[]{ParticipantsTable.c.f, this.a}));
                return tbdVar8;
            case 17:
                tbd tbdVar9 = (tbd) obj;
                alhr alhrVar = rxz.a;
                tbdVar9.q(-2);
                tbd tbdVar10 = new tbd();
                tbdVar10.l((String) this.a);
                tbdVar9.V(tbdVar10);
                return tbdVar9;
            case 18:
                tbd tbdVar11 = (tbd) obj;
                alhr alhrVar2 = rxz.a;
                tbdVar11.h((String) this.a);
                return tbdVar11;
            case 19:
                tkq tkqVar = (tkq) obj;
                tkqVar.U(new agmd("self_participants.participant_id", 1, String.valueOf(String.valueOf(this.a))));
                return tkqVar;
            default:
                aozy builder = ((aqby) obj).toBuilder();
                int h = ((stc) this.a).h();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                ((aqby) builder.b).d = h;
                return (aqby) builder.s();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            case 15:
                return Function$CC.$default$compose(this, function);
            case 16:
                return Function$CC.$default$compose(this, function);
            case 17:
                return Function$CC.$default$compose(this, function);
            case 18:
                return Function$CC.$default$compose(this, function);
            case 19:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
