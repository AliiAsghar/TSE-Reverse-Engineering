package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vsk extends arpw implements arqv {
    final /* synthetic */ miu a;
    final /* synthetic */ mis b;
    final /* synthetic */ wpp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsk(miu miuVar, wpp wppVar, mis misVar, arpe arpeVar) {
        super(2, arpeVar);
        this.a = miuVar;
        this.c = wppVar;
        this.b = misVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vsk) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i;
        int D;
        aqil.P(obj);
        ConversationId c = this.a.c();
        c.getClass();
        ConversationIdType H = lgc.H(c);
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfqVar.getClass();
        alzz.n(amfp.BUGLE_COMPOSE_DISABLED_EVENT, amfqVar);
        aozy createBuilder = aplm.a.createBuilder();
        createBuilder.getClass();
        mis misVar = this.b;
        int i2 = 3;
        switch (misVar) {
            case NONE:
                i = 2;
                break;
            case CONVERSATION_UNKNOWN:
                i = 3;
                break;
            case GROUP_EMPTY:
                i = 4;
                break;
            case GROUP_TOO_LARGE:
                i = 5;
                break;
            case GROUP_NOT_A_MEMBER:
                i = 6;
                break;
            case RECIPIENT_INCOMING_ONLY:
                i = 7;
                break;
            case SELFIDENTITY_UNAVAILABLE:
                i = 8;
                break;
            case RCS_DISCONNECTED:
                i = 9;
                break;
            case RCS_UNSUPPORTED_BY_CARRIER:
                i = 10;
                break;
            case CONVERSATION_ENDED:
                i = 11;
                break;
            case NOT_DEFAULT_SMS_APP:
                i = 12;
                break;
            case GROUP_NO_SELF_NUMBER:
                i = 13;
                break;
            case PARENTAL_APPROVAL_REQUIRED:
                i = 14;
                break;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(misVar.toString()));
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        miu miuVar = this.a;
        aplm aplmVar = (aplm) createBuilder.b;
        aplmVar.c = i - 1;
        aplmVar.b |= 1;
        if (miuVar instanceof mll) {
            D = wpp.D(Integer.valueOf(((mll) miuVar).r()));
        } else {
            D = wpp.D((Integer) sni.g(ruy.b(miuVar.c().b()), new vrx(7)));
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wpp wppVar = this.c;
        aplm aplmVar2 = (aplm) createBuilder.b;
        aplmVar2.d = D - 1;
        aplmVar2.b |= 2;
        if (true != ((okf) wppVar.b.b()).a()) {
            i2 = 2;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aplm aplmVar3 = (aplm) createBuilder.b;
        aplmVar3.e = i2 - 1;
        aplmVar3.b |= 4;
        taz e = ParticipantsTable.e();
        e.w("getParticipantsCountFromConversationParticipantsTable");
        e.g(new vte(H, 1));
        int i3 = e.b().i();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aplm aplmVar4 = (aplm) createBuilder.b;
        aplmVar4.b = 8 | aplmVar4.b;
        aplmVar4.f = i3;
        taz e2 = ParticipantsTable.e();
        e2.w("getParticipantsCountFromConversationToParticipantsTable");
        e2.g(new viu(H, 18));
        int i4 = e2.b().i();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aplm aplmVar5 = (aplm) createBuilder.b;
        aplmVar5.b |= 16;
        aplmVar5.g = i4;
        apag s = createBuilder.s();
        s.getClass();
        aplm aplmVar6 = (aplm) s;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.bI = aplmVar6;
        amfrVar.h |= 16777216;
        aozy builder = alzz.h(amfqVar).toBuilder();
        builder.getClass();
        ((mbb) this.c.a.b()).a().a((amfq) builder, mbt.LOG_SPEC_DSDR_GROUP_EVENTS);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new vsk(this.a, this.c, this.b, arpeVar);
    }
}
