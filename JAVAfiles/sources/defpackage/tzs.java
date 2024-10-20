package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tzs {
    public static final xze a = xze.g("BugleDatabase", "TombstoneManagerOperations");
    public final armf b;
    public final armf c;
    public final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;

    public tzs(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        this.e = armfVar;
        this.f = armfVar2;
        this.b = armfVar3;
        this.g = armfVar4;
        this.h = armfVar5;
        this.c = armfVar6;
        this.i = armfVar7;
        this.d = armfVar8;
    }

    public final void a(MessageCoreData messageCoreData) {
        uzo uzoVar = (uzo) this.g.b();
        akrh e = aktp.e("DeleteDatabaseOperations#deleteProtocolSwitchTombstone");
        try {
            ((Integer) uzoVar.c.c("DeleteDatabaseOperations#deleteMessagesInConversation", new tdw(uzoVar, messageCoreData.z(), messageCoreData, 9))).intValue();
            e.close();
            xyo a2 = a.a();
            a2.H("TombstoneManagerOperations deleted protocol switch tombstone");
            a2.z("conversationId", messageCoreData.z());
            a2.x("status", messageCoreData.j());
            a2.q();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(ConversationIdType conversationIdType, int i, long j, Boolean bool) {
        qwm d = ((ryg) this.e.b()).d();
        d.getClass();
        ParticipantsTable.BindData a2 = d.a();
        List K = ((rtz) this.f.b()).K(conversationIdType);
        K.getClass();
        long f = ((rtz) this.f.b()).f(conversationIdType);
        arml a3 = armd.a(new kdt((Object) bool, (Object) this, (Object) conversationIdType, 10, (char[]) null));
        int i2 = 234;
        if (i == 234) {
            if (!((Boolean) a3.a()).booleanValue()) {
                a.l("Attempting to add a downgrade to RCS tombstone, but found no E2EE tombstones");
                ((tzr) this.i.b()).b.c("Bugle.Etouffee.UI.PredictiveTombstone.Found.NoE2eeUpgradeTombstoneInRcsGroup");
                return;
            }
        } else {
            i2 = i;
        }
        ((ujv) this.h.b()).h(Optional.empty(), conversationIdType, d, a2, K, i2, j, f);
        xyo a4 = a.a();
        a4.H("inserted new conversation tombstone");
        a4.z("conversationId", conversationIdType);
        a4.x("tombstone", i2);
        a4.y("time", j);
        a4.q();
    }

    public final void c(MessageCoreData messageCoreData) {
        ((rwd) this.b.b()).H(messageCoreData);
        xyo a2 = a.a();
        a2.H("updated message");
        a2.z("messageId", messageCoreData.B());
        a2.q();
    }

    public final void d(MessageCoreData messageCoreData, int i) {
        if (messageCoreData.j() == i) {
            xyo a2 = a.a();
            a2.H("Skipping tombstone update, both current and new tombstones are equal");
            a2.x("currentTombstone", messageCoreData.j());
            a2.x("newTombstone", i);
            a2.q();
            return;
        }
        ConversationIdType z = messageCoreData.z();
        z.getClass();
        int j = messageCoreData.j();
        xyo a3 = a.a();
        a3.H("TombstoneManagerOperations updated conversation creation tombstone");
        a3.z("conversationId", z);
        a3.x("oldTombstone", j);
        a3.x("newTombstone", i);
        a3.q();
        messageCoreData.bI(i);
        ((rwd) this.b.b()).H(messageCoreData);
        ((tzr) this.i.b()).b.e("Bugle.Tombstone.Generated", i);
    }
}
