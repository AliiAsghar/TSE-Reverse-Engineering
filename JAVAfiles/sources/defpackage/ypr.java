package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ypr {
    public static final uuf a = uuh.e(uuh.b, "message_spam_table_classification_retention_days", 365);
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final agnq f;
    public final arwe g;

    public ypr(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, agnq agnqVar, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        agnqVar.getClass();
        arweVar.getClass();
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = agnqVar;
        this.g = arweVar;
    }

    public static /* synthetic */ alog c(MessageIdType messageIdType, ConversationIdType conversationIdType, int i) {
        if ((i & 2) != 0) {
            conversationIdType = null;
        }
        if (1 == (i & 1)) {
            messageIdType = null;
        }
        if (messageIdType == null && conversationIdType == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        swt a2 = sww.a();
        a2.w("SpamDatabaseOperations#getLatestNonEmptyClassificationBySource");
        a2.c(new uzn(messageIdType, conversationIdType, 17));
        a2.n(new agpk(" MAX($V) ", new Object[]{sww.c.a}), "max_timestamp");
        a2.t((agmh) sww.c.h);
        alog t = a2.b().t();
        t.getClass();
        return t;
    }

    public static /* synthetic */ Long d(ypr yprVar, final MessageIdType messageIdType, final ypi ypiVar, ypk ypkVar, final amzf amzfVar, int i, amzp amzpVar, String str, amzq amzqVar, int i2) {
        final ypk ypkVar2;
        final int i3;
        final amzp amzpVar2;
        final String str2;
        final amzq amzqVar2;
        if ((i2 & 4) != 0) {
            ypkVar2 = ypk.a;
        } else {
            ypkVar2 = ypkVar;
        }
        if ((i2 & 16) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            amzpVar2 = amzp.UNKNOWN_SPAM_VERDICT;
        } else {
            amzpVar2 = amzpVar;
        }
        if ((i2 & 64) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        if ((i2 & 128) != 0) {
            amzqVar2 = amzq.UNKNOWN_SPAM_ERROR;
        } else {
            amzqVar2 = amzqVar;
        }
        akrh e = aktp.e("SpamDatabaseOperations#insertMessageSpamTableEntryWithoutAction");
        try {
            aiut.b();
            if (!messageIdType.b()) {
                if (amzqVar2 != amzq.UNKNOWN_SPAM_ERROR && amzpVar2 != amzp.UNKNOWN_SPAM_VERDICT) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                Long l = (Long) yprVar.f.c("SpamDatabaseOperations#insertMessageSpamTableEntryWithoutAction", new alhr() { // from class: ypq
                    @Override // defpackage.alhr
                    public final Object get() {
                        agnw d;
                        agnw d2;
                        ypk ypkVar3 = ypkVar2;
                        ypkVar3.getClass();
                        amzp amzpVar3 = amzpVar2;
                        amzpVar3.getClass();
                        String str3 = str2;
                        str3.getClass();
                        amzq amzqVar3 = amzqVar2;
                        amzqVar3.getClass();
                        ypr yprVar2 = ypr.this;
                        MessageCoreData u = ((rwd) yprVar2.d.b()).u(messageIdType);
                        if (u == null) {
                            return null;
                        }
                        int i4 = i3;
                        amzf amzfVar2 = amzfVar;
                        ypi ypiVar2 = ypiVar;
                        String[] strArr = sww.a;
                        int i5 = svc.a;
                        swn swnVar = new swn();
                        swnVar.h(u.B());
                        swnVar.f(u.z());
                        swnVar.l(ypiVar2.l);
                        swnVar.k(ypkVar3.a());
                        swnVar.i(amzpVar3);
                        swnVar.d(str3);
                        swnVar.m(amzfVar2);
                        swnVar.c(apzk.UNKNOWN_SPAM_VERDICT_ENFORCEMENT_ACTION);
                        swnVar.b(new ypj().a());
                        swnVar.e(((xnv) yprVar2.e.b()).f().toEpochMilli());
                        swnVar.g(amzqVar3);
                        swnVar.j(i4);
                        swl a2 = swnVar.a();
                        d = agnc.d("$primary");
                        d2 = agnc.d("$primary");
                        return Long.valueOf(agnc.a(d2, "message_spam", a2, new spl(d, 15), new smq(a2, 11)));
                    }
                });
                armd.i(e, null);
                return l;
            }
            throw new IllegalArgumentException("Failed requirement.");
        } finally {
        }
    }

    public final boolean a(ConversationIdType conversationIdType) {
        akrh e = aktp.e("SpamDatabaseOperations#getConversationSpamDismissStatus");
        try {
            aiut.b();
            smr q = ((rtz) this.c.b()).q(conversationIdType);
            boolean z = false;
            if (q != null) {
                if (q.aj()) {
                    z = true;
                }
            }
            armd.i(e, null);
            return z;
        } finally {
        }
    }

    public final boolean b(String str, ypi ypiVar, boolean z) {
        ypiVar.getClass();
        aiut.b();
        if (str != null && str.length() != 0) {
            Object c = this.f.c("SpamDatabaseOperations#updateParticipantIsSpam", new mma(this, str, ypiVar, z, 9));
            c.getClass();
            return ((Boolean) c).booleanValue();
        }
        return false;
    }
}
