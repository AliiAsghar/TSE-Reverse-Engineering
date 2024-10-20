package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nfc implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nfc(Object obj, int i) {
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
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v38, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v18, types: [armf, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String str;
        int i = 0;
        switch (this.b) {
            case 0:
                tbd tbdVar = (tbd) obj;
                Object obj2 = this.a;
                obj2.getClass();
                tbdVar.h(((tap) obj2).a);
                return tbdVar;
            case 1:
                return d.V(this.a, obj);
            case 2:
                tbd tbdVar2 = (tbd) obj;
                tbdVar2.h(((ParticipantsTable.BindData) this.a).M());
                return tbdVar2;
            case 3:
                tbd tbdVar3 = (tbd) obj;
                ?? r0 = this.a;
                r0.getClass();
                tbdVar3.getClass();
                tbdVar3.q(-2);
                tbdVar3.U(new agmf("participants.contact_id", 3, tbd.X(r0), true));
                return tbdVar3;
            case 4:
                tbd tbdVar4 = (tbd) obj;
                tbdVar4.j(this.a);
                return tbdVar4;
            case 5:
                tbd tbdVar5 = (tbd) obj;
                tbdVar5.j(this.a);
                return tbdVar5;
            case 6:
                tbd tbdVar6 = (tbd) obj;
                tbdVar6.j(this.a);
                return tbdVar6;
            case 7:
                msh mshVar = (msh) obj;
                ngf ngfVar = (ngf) ((nfq) this.a).c.b();
                mshVar.getClass();
                if (mshVar.q()) {
                    Optional e = mshVar.e();
                    e.getClass();
                    qei qeiVar = (qei) arsd.k(e);
                    if (qeiVar != null) {
                        str = qeiVar.d;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        Optional j = ((adje) ngfVar.b.b()).j(((adae) ngfVar.c.b()).d(str));
                        j.getClass();
                        Configuration configuration = (Configuration) arsd.k(j);
                        if (configuration == null) {
                            alvw i2 = ngf.a.i();
                            i2.X(alwp.a, "BugleSelfIdentity");
                            ((alvg) i2.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/IdentityBasedRcsConfigProvider", "getRcsConfig", 45, "IdentityBasedRcsConfigProvider.kt")).q("No configuration is found for messagingIdentity. Returning default config instead.");
                            return nge.a;
                        }
                        qdq qdqVar = (qdq) ngfVar.d.b();
                        ydf ydfVar = (ydf) ((kru) qdqVar.a).a.je.b();
                        krv krvVar = ((kru) qdqVar.a).a;
                        return new ngg(ydfVar, krvVar.jj, (znj) krvVar.he.b(), configuration);
                    }
                    throw new IllegalArgumentException("messagingIdentity has no rcs identifier.");
                }
                throw new IllegalArgumentException("messagingIdentity can not be a fully qualified phone number.");
            case 8:
                return ((nfv) this.a).a((qwm) obj);
            case 9:
                alwo alwoVar = nga.a;
                return Boolean.valueOf(((qei) obj).equals(this.a));
            case 10:
                jat jatVar = (jat) this.a;
                return ((msk) jatVar.g.b()).b(((psq) jatVar.b.b()).c(((adit) obj).a));
            case 11:
                sdw sdwVar = (sdw) obj;
                sdwVar.b((String) this.a);
                return sdwVar;
            case 12:
                tdu tduVar = (tdu) obj;
                tduVar.b((String) this.a);
                return tduVar;
            case 13:
                teg tegVar = (teg) obj;
                tegVar.b(((BusinessInfoData) this.a).getRbmBotId());
                return tegVar;
            case 14:
                tdu tduVar2 = (tdu) obj;
                tduVar2.b((String) this.a);
                return tduVar2;
            case 15:
                snh snhVar = (snh) obj;
                snhVar.U(new agmf("conversations.participant_normalized_destination", 3, snh.Z((String) this.a), false));
                return snhVar;
            case 16:
                sgg sggVar = (sgg) obj;
                pqz pqzVar = pqz.CREATED;
                if (pqzVar != null) {
                    i = pqzVar.a();
                }
                Object obj3 = this.a;
                sggVar.U(new agoi("business_conversations_metadata.chatbot_directory_conversation_state", 1, Integer.valueOf(i)));
                sggVar.b((ConversationIdType) obj3);
                return sggVar;
            case 17:
                sgg sggVar2 = (sgg) obj;
                sggVar2.b((ConversationIdType) this.a);
                return sggVar2;
            case 18:
                smr smrVar = (smr) obj;
                return ((hgj) this.a).o(albo.ag(smrVar.V()), albo.ag(smrVar.U()));
            case 19:
                ptx ptxVar = (ptx) obj;
                ptxVar.b((String) this.a);
                return ptxVar;
            default:
                ptx ptxVar2 = (ptx) obj;
                ptxVar2.b((String) this.a);
                return ptxVar2;
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
