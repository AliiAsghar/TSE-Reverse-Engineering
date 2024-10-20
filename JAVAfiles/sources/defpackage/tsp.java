package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class tsp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationEncryptionStatus");
    public static final xze b = xze.g("BugleEtouffee", "ConversationEncryptionStatus");
    public final xnv c;
    public final rth d;
    public final anen e;
    public final anen f;
    public final armf g;
    public final vbu h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final armf m;
    public mbm n;
    public final tsa o;
    public final armf p;
    private final xca q;
    private final armf r;
    private final armf s;

    public tsp(xnv xnvVar, rth rthVar, anen anenVar, anen anenVar2, armf armfVar, xca xcaVar, vbu vbuVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, tsa tsaVar, armf armfVar9) {
        this.j = armfVar3;
        this.k = armfVar4;
        this.r = armfVar5;
        this.c = xnvVar;
        this.d = rthVar;
        this.f = anenVar2;
        this.e = anenVar;
        this.g = armfVar;
        this.q = xcaVar;
        this.h = vbuVar;
        this.i = armfVar2;
        this.l = armfVar6;
        this.s = armfVar7;
        this.m = armfVar8;
        this.o = tsaVar;
        this.p = armfVar9;
    }

    public static Optional f(String str, qei qeiVar) {
        Optional of;
        boolean booleanValue = ((Boolean) new mss(11).get()).booleanValue();
        see a2 = seg.a();
        a2.w("ConversationEncryptionStatus#getRemoteInstanceBindData");
        a2.c(new ldi(booleanValue, qeiVar, str, 2));
        sea seaVar = (sea) a2.b().n();
        try {
            if (!seaVar.moveToFirst()) {
                of = Optional.empty();
            } else {
                of = Optional.of((sec) seaVar.cK());
            }
            seaVar.close();
            return of;
        } catch (Throwable th) {
            try {
                seaVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final akul a(qei qeiVar, ConversationIdType conversationIdType, String str, qei qeiVar2, amkd amkdVar) {
        String str2;
        qei qeiVar3;
        qei qeiVar4;
        i(1, conversationIdType);
        if (qeiVar != null) {
            str2 = qeiVar.d;
        } else {
            str2 = null;
        }
        if (((nib) this.p.b()).a()) {
            rth rthVar = this.d;
            if (true != ((Boolean) new mss(11).get()).booleanValue()) {
                qeiVar4 = null;
            } else {
                qeiVar4 = qeiVar;
            }
            return rthVar.b(str2, qeiVar4, str, qeiVar2, amkdVar).i(new mmc(this, conversationIdType, str, qeiVar2, 7), this.e);
        }
        rth rthVar2 = this.d;
        if (true != ((Boolean) new mss(11).get()).booleanValue()) {
            qeiVar3 = null;
        } else {
            qeiVar3 = qeiVar;
        }
        return rthVar2.b(str2, qeiVar3, str, qeiVar2, amkdVar).i(new qbt(this, str, qeiVar2, 13, (char[]) null), this.e).i(new mmc(this, conversationIdType, str, qeiVar2, 9), this.e).h(new rgh(7), this.f);
    }

    public final akul b(ConversationIdType conversationIdType, String str, qei qeiVar) {
        boolean j;
        alpu alpuVar = new alpu();
        alpu alpuVar2 = new alpu();
        int i = 15;
        if (((Boolean) new mss(11).get()).booleanValue() && qeiVar != null) {
            j = ((vcb) this.l.b()).k(new altx(qeiVar), alpuVar2, new tgn(i));
        } else {
            j = ((vcb) this.l.b()).j(new altx(str), alpuVar, new tgn(i));
        }
        if (!j) {
            uax uaxVar = uax.DOWNGRADE_REMOTE_REGISTRATION_MISSING_E2EE;
            if (((Boolean) new mss(11).get()).booleanValue() && qeiVar != null) {
                if (alpuVar2.a().x()) {
                    uaxVar = uax.DOWNGRADE_REMOTE_REGISTRATION_MISSING;
                }
            } else if (alpuVar.a().x()) {
                uaxVar = uax.DOWNGRADE_REMOTE_REGISTRATION_MISSING;
            }
            return aktp.ah(new rvz((Object) this, (Object) conversationIdType, (Object) uaxVar, 8, (char[]) null), this.e);
        }
        return d(conversationIdType, alpuVar.a(), alpuVar2.a());
    }

    @Deprecated
    public final akul c(ConversationIdType conversationIdType, String str, qei qeiVar, sec secVar) {
        String h;
        if (secVar.j() && (h = secVar.h()) != null) {
            alpu alpuVar = new alpu();
            alpuVar.b(str, h);
            alpu alpuVar2 = new alpu();
            if (((Boolean) new mss(11).get()).booleanValue() && qeiVar != null) {
                alpuVar2.b(qeiVar, h);
            }
            return d(conversationIdType, alpuVar.a(), alpuVar2.a());
        }
        return aktp.ah(new ryv(this, conversationIdType, 3, null), this.e);
    }

    public final akul d(ConversationIdType conversationIdType, alpx alpxVar, alpx alpxVar2) {
        qei qeiVar;
        String k = this.h.k();
        if (((Boolean) new mss(11).get()).booleanValue()) {
            qeiVar = (qei) this.h.e().orElse(null);
        } else {
            qeiVar = null;
        }
        return this.d.d(k, qeiVar, alpxVar, alpxVar2, conversationIdType).e(Throwable.class, new rgh(8), this.e);
    }

    public final akul e(ConversationIdType conversationIdType) {
        return this.h.a().i(new tsm(this, conversationIdType, 0), this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HashSet g(ConversationIdType conversationIdType, List list) {
        String str;
        HashSet hashSet = new HashSet();
        try {
            alur it = ((alog) list).iterator();
            while (it.hasNext()) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                String O = bindData.O();
                if (TextUtils.isEmpty(O)) {
                    xyo e = b.e();
                    e.z("participant.id", bindData.M());
                    e.z("conversationId", conversationIdType);
                    e.H("Participant is missing normalized phone destination.");
                    e.q();
                    return new HashSet();
                }
                hashSet.add(((psq) this.s.b()).a(O, false));
            }
            return hashSet;
        } catch (psr e2) {
            xyo e3 = b.e();
            e3.z("conversationId", conversationIdType);
            e3.H(e2.getMessage());
            if (e2.getCause() != null) {
                str = e2.getCause().getMessage();
            } else {
                str = "";
            }
            e3.H(str);
            e3.q();
            return new HashSet();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HashSet h(ConversationIdType conversationIdType, List list) {
        HashSet hashSet = new HashSet();
        alur it = ((alog) list).iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            String O = bindData.O();
            if (TextUtils.isEmpty(O)) {
                xyo e = b.e();
                e.z("participant.id", bindData.M());
                e.z("conversationId", conversationIdType);
                e.H("Participant is missing normalized phone destination.");
                e.q();
                return new HashSet();
            }
            if (!this.q.l(O)) {
                b.q("Participant destination isn't a phone number");
                return new HashSet();
            }
            hashSet.add(O);
        }
        return hashSet;
    }

    public final void i(int i, ConversationIdType conversationIdType) {
        xyo a2 = b.a();
        a2.H("starting etouffee action timer");
        a2.x("remoteInstancesToDownload", i);
        a2.q();
        this.n = ((mce) this.r.b()).m(i, conversationIdType.toString());
    }

    public final void j(ConversationIdType conversationIdType, uax uaxVar) {
        xyo a2 = b.a();
        a2.H("Disabling Etouffee for conversation draft");
        a2.z("conversationId", conversationIdType);
        a2.z("updateReason", uaxVar);
        a2.q();
        this.d.f(conversationIdType, 0, uaxVar);
    }
}
