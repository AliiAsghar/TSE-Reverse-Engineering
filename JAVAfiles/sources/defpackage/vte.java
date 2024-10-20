package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vte implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vte(Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v51, types: [msk, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 6;
        switch (this.b) {
            case 0:
                return d.U(this.a, obj);
            case 1:
                tbd tbdVar = (tbd) obj;
                Object obj2 = this.a;
                obj2.getClass();
                tbdVar.getClass();
                sla a = sld.a();
                a.d(new vrx(i));
                a.f(new viu(obj2, 19));
                tbdVar.i(a.b());
                return tbdVar;
            case 2:
                smr smrVar = (smr) obj;
                alwo alwoVar = vtn.a;
                if (!albo.ah(smrVar.V()) && !albo.ah(smrVar.U())) {
                    return true;
                }
                Object obj3 = this.a;
                alwl alwlVar = (alwl) vtn.a.i();
                alwlVar.X(ydl.o, ((ConversationIdType) obj3).toString());
                alwlVar.X(ydl.I, smrVar.V());
                alwlVar.X(ydl.J, yyb.bh(smrVar.U()));
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/rcs/groups/database/RcsGroupDatabaseOperations", "rcsGroupIsReadyToBeUsedSync", 62, "RcsGroupDatabaseOperations.java")).q("RCS group does not have valid global identifiers.");
                return false;
            case 3:
                snh snhVar = (snh) obj;
                alwo alwoVar2 = vtx.a;
                snhVar.j((ConversationIdType) this.a);
                return snhVar;
            case 4:
                snh snhVar2 = (snh) obj;
                alwo alwoVar3 = vtx.a;
                snhVar2.j((ConversationIdType) this.a);
                return snhVar2;
            case 5:
                smr smrVar2 = (smr) obj;
                if (smrVar2.D().d(vtl.NAME_CHANGE)) {
                    return ((vuv) this.a).j.o(albo.ag(smrVar2.V()), albo.ag(smrVar2.U()));
                }
                throw new IllegalArgumentException("Conversation does not support RCS name changes");
            case 6:
                tbd tbdVar2 = (tbd) obj;
                alwo alwoVar4 = vuz.a;
                tbdVar2.l((String) this.a);
                return tbdVar2;
            case 7:
                tbd tbdVar3 = (tbd) obj;
                alwo alwoVar5 = vuz.a;
                tbdVar3.l((String) this.a);
                return tbdVar3;
            case 8:
                smu smuVar = (smu) obj;
                if (((okf) ((vuz) this.a).e.b()).a()) {
                    return new smv[]{smuVar.b, smuVar.aa, smuVar.c, smuVar.d, smuVar.ae, smuVar.A};
                }
                return new smv[]{smuVar.b, smuVar.aa, smuVar.c, smuVar.d, smuVar.ae};
            case 9:
                snh snhVar3 = (snh) obj;
                alwo alwoVar6 = vuz.a;
                snhVar3.j((ConversationIdType) this.a);
                return snhVar3;
            case 10:
                snh snhVar4 = (snh) obj;
                Object obj4 = this.a;
                obj4.getClass();
                snhVar4.j((ConversationIdType) obj4);
                return snhVar4;
            case 11:
                slc slcVar = (slc) obj;
                slcVar.b((ConversationIdType) this.a);
                return slcVar;
            case 12:
                smo smoVar = (smo) obj;
                smoVar.b((ConversationIdType) this.a);
                return smoVar;
            case 13:
                return this.a.s((ParticipantsTable.BindData) obj);
            case 14:
                syc sycVar = (syc) obj;
                sycVar.f((ConversationIdType) this.a);
                return sycVar;
            case 15:
                snh snhVar5 = (snh) obj;
                snhVar5.j(((xwa) this.a).a);
                return snhVar5;
            case 16:
                snh snhVar6 = (snh) obj;
                snhVar6.j(((xwa) this.a).a);
                return snhVar6;
            case 17:
                return ((lqn) ((vwv) this.a).m.b()).l((msz) obj);
            case 18:
                return ((lqn) ((vwv) this.a).m.b()).l((msz) obj);
            case 19:
                snh snhVar7 = (snh) obj;
                alwo alwoVar7 = vxa.a;
                snhVar7.j(((BugleConversationId) this.a).a);
                return snhVar7;
            default:
                snh snhVar8 = (snh) obj;
                alwo alwoVar8 = vxd.a;
                snhVar8.j((ConversationIdType) this.a);
                return snhVar8;
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
