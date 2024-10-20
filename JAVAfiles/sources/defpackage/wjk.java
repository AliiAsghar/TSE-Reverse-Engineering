package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Collection;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wjk implements rwr {
    public static final alwo a = alwo.o("Bugle");
    public final armf b;
    public final xnv c;
    public final armf d;
    public final armf e;
    private final armf f;
    private final armf g;
    private final armf h;

    public wjk(armf armfVar, xnv xnvVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        this.b = armfVar;
        this.c = xnvVar;
        this.f = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.g = armfVar5;
        this.h = armfVar6;
    }

    @Override // defpackage.rwr
    public final akrh a() {
        return aktp.e("RcsFallbackTrackerManager");
    }

    @Override // defpackage.rwr
    public final void b(MessageCoreData messageCoreData) {
        smr q;
        int i = 1;
        albo.T(!aiut.g());
        akrh a2 = a();
        try {
            if (!((pdw) this.h.b()).a() || ((q = ((rtz) this.f.b()).q(messageCoreData.z())) != null && q.h() != 2)) {
                ((wjm) this.e.b()).e(messageCoreData.B());
                MessageIdType C = messageCoreData.C();
                ConversationIdType z = messageCoreData.z();
                if (C != null && !C.b() && z != null && !z.b()) {
                    ConversationIdType z2 = messageCoreData.z();
                    akrh e = aktp.e("MessageDatabaseOperations#getAllPendingMessagesForOriginalMessageId");
                    try {
                        sxy d = MessagesTable.d();
                        d.w("getAllPendingMessagesForOriginalMessageId");
                        d.g(new rbp(z2, C, 16));
                        Stream w = d.b().w();
                        try {
                            int i2 = 12;
                            List list = (List) w.map(new rvy(i)).collect(Collectors.toCollection(new roi(i2)));
                            if (w != null) {
                                w.close();
                            }
                            e.close();
                            Collection.EL.forEach(list, new vwq(this, i2));
                            ((wjm) this.e.b()).e(C);
                        } finally {
                        }
                    } finally {
                    }
                }
            }
            a2.close();
        } catch (Throwable th) {
            try {
                a2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c(MessageCoreData messageCoreData) {
        if (d(messageCoreData)) {
            if (!((ncv) this.d.b()).d() || !messageCoreData.cJ()) {
                ((wjn) this.b.b()).a(messageCoreData.B(), this.c.f().toEpochMilli());
            }
        }
    }

    public final boolean d(MessageCoreData messageCoreData) {
        smr q = ((rtz) this.f.b()).q(messageCoreData.z());
        if (q == null || !messageCoreData.cI() || q.h() != 0 || q.ac()) {
            return false;
        }
        return true;
    }
}
