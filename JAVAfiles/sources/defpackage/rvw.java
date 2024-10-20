package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rvw {
    private static final xze f = xze.g("Bugle", "MessageCoreDataInserter");
    public final agnq a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    private final armf g;
    private final armf h;
    private final armf i;
    private final xnv j;
    private final armf k;

    public rvw(agnq agnqVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, xnv xnvVar, armf armfVar8) {
        this.a = agnqVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.g = armfVar3;
        this.d = armfVar4;
        this.h = armfVar5;
        this.e = armfVar6;
        this.i = armfVar7;
        this.j = xnvVar;
        this.k = armfVar8;
    }

    private static void e(SQLiteConstraintException sQLiteConstraintException, String str, ConversationIdType conversationIdType, String str2, ParticipantsTable.BindData bindData, String str3, String str4) {
        xze xzeVar = f;
        if (xzeVar.s(5)) {
            xyo e = xzeVar.e();
            e.H("SQLiteConstraintException while inserting:");
            e.C("message", str);
            e.H("found:");
            e.b(conversationIdType);
            e.z("selfId", str2);
            e.z("senderId", bindData);
            e.H("found:");
            e.C("selfDest", str3);
            e.H("found:");
            e.C("senderDest", str4);
            e.r(sQLiteConstraintException);
        }
    }

    public final MessageIdType a(MessageCoreData messageCoreData) {
        akrh e = aktp.e("MessageCoreDataInserter#insertNewMessage1");
        try {
            akrh e2 = aktp.e("MessageCoreDataInserter#insertNewMessage2");
            try {
                MessageIdType d = d(messageCoreData, false, Optional.empty());
                e2.close();
                e.close();
                return d;
            } finally {
            }
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageIdType b(MessageCoreData messageCoreData) {
        boolean z;
        ParticipantsTable.BindData a;
        ParticipantsTable.BindData a2;
        String O;
        String O2;
        ParticipantsTable.BindData bindData;
        msh q;
        msh q2;
        String n;
        String n2;
        messageCoreData.bx(this.j.f());
        messageCoreData.aG(amgj.class.getName(), messageCoreData.y().j());
        MessagesTable.BindData I = messageCoreData.I();
        try {
            return I.B();
        } catch (SQLiteConstraintException e) {
            ConversationIdType z2 = I.z();
            if (!z2.b()) {
                snf e2 = sni.e();
                e2.w("logSQLiteConstraintExceptionForMessageInsert");
                e2.h(new ruw(z2, 4));
                z = e2.b().K();
            } else {
                z = false;
            }
            String O3 = I.O();
            if (O3 == null) {
                a = null;
            } else {
                a = ((rxq) this.h.b()).a(O3);
            }
            String P = I.P();
            if (P == null) {
                a2 = null;
            } else {
                a2 = ((rxq) this.h.b()).a(P);
            }
            if (((opd) this.k.b()).a()) {
                if (a == null) {
                    q = null;
                } else {
                    q = ((msk) this.i.b()).q(a);
                }
                if (a2 == null) {
                    a2 = null;
                    q2 = null;
                } else {
                    q2 = ((msk) this.i.b()).q(a2);
                }
                String a3 = I.a();
                if (!z) {
                    z2 = ruy.a;
                }
                ConversationIdType conversationIdType = z2;
                if (q == null) {
                    n = null;
                } else {
                    n = ((msg) q).n();
                }
                if (q2 == null) {
                    n2 = null;
                } else {
                    n2 = ((msg) q2).n();
                }
                e(e, a3, conversationIdType, O3, a2, n, n2);
            } else {
                if (a == null) {
                    O = null;
                } else {
                    O = a.O();
                }
                if (a2 == null) {
                    bindData = null;
                    O2 = null;
                } else {
                    O2 = a2.O();
                    bindData = a2;
                }
                String a4 = I.a();
                if (!z) {
                    z2 = ruy.a;
                }
                e(e, a4, z2, O3, bindData, O, O2);
            }
            throw e;
        }
    }

    public final void c(MessagePartCoreData messagePartCoreData, ConversationIdType conversationIdType) {
    }

    public final MessageIdType d(MessageCoreData messageCoreData, boolean z, Optional optional) {
        long e;
        xyl.h();
        if (messageCoreData.s() == 0) {
            lzz lzzVar = (lzz) this.g.b();
            if (optional.isPresent()) {
                if (messageCoreData.cw()) {
                    e = lzzVar.d(messageCoreData);
                } else {
                    e = lzzVar.e();
                }
                messageCoreData.bK(e);
            } else {
                messageCoreData.bK(lzzVar.c(messageCoreData));
            }
        }
        if (z) {
            messageCoreData.bh(xxw.RESTORED_FROM_TELEPHONY);
        }
        return (MessageIdType) this.a.c("MessageCoreDataInserter#insertPreparedNewMessage", new mry(this, z, messageCoreData, 3));
    }
}
