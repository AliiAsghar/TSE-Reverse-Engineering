package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vvd extends arpw implements arqr {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvd(atsg atsgVar, Uri uri, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.c = i;
        this.a = atsgVar;
        this.b = uri;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                Object obj2 = this.a;
                return new vvd((atsg) obj2, (Uri) this.b, (arpe) obj, 2).b(arnb.a);
            }
            Object obj3 = this.a;
            return new vvd((AtomicReference) obj3, (kkc) this.b, (arpe) obj, 1).b(arnb.a);
        }
        Object obj4 = this.a;
        return new vvd((vve) obj4, (ConversationIdType) this.b, (arpe) obj, 0).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                aqil.P(obj);
                Object obj2 = this.b;
                Object obj3 = ((atsg) this.a).d;
                int i2 = aipx.a;
                InputStream b = aipx.b((Context) obj3, (Uri) obj2, aipw.a);
                b.getClass();
                return b;
            }
            aqil.P(obj);
            ((AtomicReference) this.a).set(akfa.a(Boolean.valueOf(((kkc) this.b).a()), ((xnv) ((kkc) this.b).c).f()));
            return arnb.a;
        }
        aqil.P(obj);
        Object obj4 = this.b;
        syc r = wam.r();
        akrh e = aktp.e("MessageDatabaseOperations#getMessageIdsForConversation");
        try {
            aiut.b();
            sxy e2 = MessagesTable.e("getMessageIdsForConversation#query");
            e2.g(new rwb(obj4, 9));
            e2.f(r);
            e2.h(new atkn((Object) MessagesTable.c.g, true));
            e2.c(MessagesTable.c.a);
            sxt sxtVar = (sxt) e2.b().n();
            try {
                alog P = sxtVar.P();
                sxtVar.close();
                e.close();
                Object obj5 = this.a;
                Object obj6 = this.b;
                P.getClass();
                if (P.isEmpty()) {
                    alvw g = vve.a.g();
                    g.X(alwp.a, "BugleGroupManagement");
                    alvg alvgVar = (alvg) g;
                    alvgVar.X(ydl.p, obj6);
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/MmsGroupUpgradeBackupScheduler", "scheduleBackupWork", 78, "MmsGroupUpgradeBackupScheduler.kt")).q("MmsGroupUpgradeBackupScheduler: No MMS messages in upgraded group, skipping backup.");
                } else {
                    vyv vyvVar = (vyv) ((vve) obj5).e.b();
                    aozy createBuilder = vwk.a.createBuilder();
                    createBuilder.getClass();
                    wam.l(((ConversationIdType) obj6).a(), createBuilder);
                    wam.p(createBuilder);
                    ArrayList arrayList = new ArrayList(aqjn.J(P, 10));
                    alur it = P.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((MessageIdType) it.next()).a());
                    }
                    wam.n(arrayList, createBuilder);
                    wam.o(3, createBuilder);
                    wam.k(1, createBuilder);
                    alsx alsxVar = (alsx) P;
                    wam.m(alsxVar.c, createBuilder);
                    ((uof) vyvVar.a.b()).a(upk.b("backup_upgraded_mms_group", wam.j(createBuilder), new uta("TELEPHONY", null, null, null, null, null)));
                    alvw g2 = vve.a.g();
                    g2.X(alwp.a, "BugleGroupManagement");
                    alvg alvgVar2 = (alvg) g2;
                    alvgVar2.X(ydl.p, obj6);
                    ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/MmsGroupUpgradeBackupScheduler", "scheduleBackupWork", 97, "MmsGroupUpgradeBackupScheduler.kt")).r("MmsGroupUpgradeBackupScheduler: Scheduled backup of %s MMS messages.", alsxVar.c);
                }
                return arnb.a;
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvd(AtomicReference atomicReference, kkc kkcVar, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.c = i;
        this.a = atomicReference;
        this.b = kkcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvd(vve vveVar, ConversationIdType conversationIdType, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.c = i;
        this.a = vveVar;
        this.b = conversationIdType;
    }
}
