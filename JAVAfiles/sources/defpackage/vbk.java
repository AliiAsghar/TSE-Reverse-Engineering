package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vbk implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vbk(Object obj, int i) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                sll sllVar = (sll) obj;
                xze xzeVar = vbm.a;
                sllVar.U(new agmd("conversation_pin.conversation_id", 1, Long.valueOf(ruy.a((ConversationIdType) this.a))));
                return sllVar;
            case 1:
                return this.a.a(obj);
            case 2:
                sef sefVar = (sef) obj;
                sefVar.b(this.a);
                return sefVar;
            case 3:
                tht thtVar = (tht) obj;
                tib tibVar = new tib(tid.a);
                tibVar.d(new vbk(this.a, 5));
                tibVar.c((thw) tid.d.c);
                thtVar.U(new agme("remote_user_id_info_table.remote_user_id", 3, tibVar.b()));
                return thtVar;
            case 4:
                sef sefVar2 = (sef) obj;
                sefVar2.b(this.a);
                return sefVar2;
            case 5:
                tic ticVar = (tic) obj;
                ticVar.c((String) this.a);
                return ticVar;
            case 6:
                thj thjVar = (thj) obj;
                thjVar.b(((thc) this.a).l());
                return thjVar;
            case 7:
                tic ticVar2 = (tic) obj;
                ticVar2.c(((thc) this.a).l());
                return ticVar2;
            case 8:
                tic ticVar3 = (tic) obj;
                ticVar3.b((String) this.a);
                return ticVar3;
            case 9:
                sef sefVar3 = (sef) obj;
                sefVar3.U(new agmd("remote_user_id_to_registration_id.remote_user_id", 1, String.valueOf(this.a)));
                return sefVar3;
            case 10:
                sef sefVar4 = (sef) obj;
                sefVar4.b((Iterable) Collection.EL.stream(this.a).map(new vbi(10)).collect(alls.b));
                return sefVar4;
            case 11:
                thj thjVar2 = (thj) obj;
                thjVar2.b((String) this.a);
                return thjVar2;
            case 12:
                thj thjVar3 = (thj) obj;
                thjVar3.b(((thc) this.a).l());
                return thjVar3;
            case 13:
                sef sefVar5 = (sef) obj;
                sefVar5.b(this.a);
                return sefVar5;
            case 14:
                String str = ((adit) obj).a;
                vcg vcgVar = (vcg) this.a;
                ((vev) vcgVar.d.b()).a(str, 22);
                return ((vcj) vcgVar.c.b()).d(Optional.of(((psq) vcgVar.e.b()).c(str)));
            case 15:
                return ((psq) ((vcj) this.a).e.b()).c(((adit) obj).a);
            case 16:
                return ((vcj) this.a).d((Optional) obj);
            case 17:
                return ((vcv) this.a).c(((vcq) obj).b);
            case 18:
                return d.X(this.a, obj);
            case 19:
                nfw nfwVar = (nfw) obj;
                aozy C = ((wyp) this.a).C(((SelfIdentityIdImpl) nfwVar.f()).a, nfwVar.n(), nfwVar.j(), nfwVar.m());
                if (!C.b.isMutable()) {
                    C.u();
                }
                ango angoVar = (ango) C.b;
                ango angoVar2 = ango.a;
                angoVar.g = true;
                anha e = vht.e(nfwVar.b());
                if (!C.b.isMutable()) {
                    C.u();
                }
                ango angoVar3 = (ango) C.b;
                e.getClass();
                angoVar3.h = e;
                angoVar3.b |= 4;
                return (ango) C.s();
            default:
                ResolvedRecipient resolvedRecipient = (ResolvedRecipient) obj;
                aozy C2 = ((wyp) this.a).C(resolvedRecipient.z().a, resolvedRecipient.f().n(), resolvedRecipient.f().F().a, resolvedRecipient.p());
                if (!C2.b.isMutable()) {
                    C2.u();
                }
                ango angoVar4 = (ango) C2.b;
                ango angoVar5 = ango.a;
                angoVar4.g = false;
                aozy createBuilder = anha.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((anha) createBuilder.b).b = a.an(3);
                anha anhaVar = (anha) createBuilder.s();
                if (!C2.b.isMutable()) {
                    C2.u();
                }
                ango angoVar6 = (ango) C2.b;
                anhaVar.getClass();
                angoVar6.h = anhaVar;
                angoVar6.b |= 4;
                return (ango) C2.s();
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
