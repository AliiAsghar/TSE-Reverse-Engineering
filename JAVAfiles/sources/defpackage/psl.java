package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class psl extends arpw implements arqv {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psl(ConversationIdType conversationIdType, int i, abej abejVar, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.d = i2;
        this.b = conversationIdType;
        this.a = i;
        this.c = abejVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return ((psl) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                            }
                            return ((psl) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                        }
                        return ((psl) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                    }
                    return ((psl) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                }
                return ((psl) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((psl) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((psl) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [agnq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, adiv] */
    /* JADX WARN: Type inference failed for: r11v32, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                aqil.P(obj);
                                alwl alwlVar = (alwl) abej.a.g();
                                alwlVar.X(ydl.M, "MessagesPageDataBuilder");
                                alwlVar.B("#loadLatestPage for conversation: %s, with page size: %s", this.b, this.a);
                                alog t = ((ibi) ((abej) this.c).c.b()).n((ConversationIdType) this.b, this.a, 0).b().t();
                                t.getClass();
                                ArrayList arrayList = new ArrayList(aqjn.J(t, 10));
                                alur it = t.iterator();
                                while (it.hasNext()) {
                                    abej abejVar = (abej) this.c;
                                    arrayList.add(((yvy) abejVar.b.b()).a(((vid) abejVar.d.b()).b((saz) it.next()), null, (Context) abejVar.f.b()));
                                }
                                return arrayList;
                            }
                            aqil.P(obj);
                            aozy createBuilder = amxn.a.createBuilder();
                            createBuilder.getClass();
                            aktp.aW(this.a, createBuilder);
                            aktp.aV(wyp.E((wyp) this.b, this.c), createBuilder);
                            ((wyp) this.b).q(aktp.aU(createBuilder));
                            return arnb.a;
                        }
                        aqil.P(obj);
                        ((tuk) this.b).e(this.a, (uax) this.c);
                        return arnb.a;
                    }
                    aqil.P(obj);
                    Object b = ((lrf) this.b).b.b();
                    b.getClass();
                    Iterator it2 = ((Iterable) b).iterator();
                    while (it2.hasNext()) {
                        ((rtx) it2.next()).a((ConversationIdType) this.c, this.a);
                    }
                    return arnb.a;
                }
                aqil.P(obj);
                alvw g = rjz.a.g();
                g.X(alwp.a, "BugleBackup");
                alvg alvgVar = (alvg) g;
                alvgVar.V(10, TimeUnit.SECONDS);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/backup/analytics/BackupEventLogger$logFailedEvent$1", "invokeSuspend", 169, "BackupEventLogger.kt")).t("Logging backup failed event to clearcut: %s", "DATABASE_BACKUP");
                aozy createBuilder2 = amog.a.createBuilder();
                createBuilder2.getClass();
                akec.ao(createBuilder2);
                aozy createBuilder3 = amoj.a.createBuilder();
                createBuilder3.getClass();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                int i2 = this.a;
                amoj amojVar = (amoj) createBuilder3.b;
                amojVar.c = i2 - 1;
                amojVar.b = 1 | amojVar.b;
                apag s = createBuilder3.s();
                s.getClass();
                amoj amojVar2 = (amoj) s;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                Object obj2 = this.c;
                amog amogVar = (amog) createBuilder2.b;
                amogVar.d = amojVar2;
                amogVar.c = 7;
                if (obj2 != null) {
                    akec.an(yyb.bX((UUID) obj2), createBuilder2);
                }
                amog am = akec.am(createBuilder2);
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfqVar.getClass();
                alzz.n(amfp.BACKUP_WORKFLOW_EVENT, amfqVar);
                alzz.i(am, amfqVar);
                aozy builder = alzz.h(amfqVar).toBuilder();
                builder.getClass();
                ((rjz) this.b).a((amfq) builder);
                alvw g2 = rjz.a.g();
                g2.X(alwp.a, "BugleBackup");
                alvg alvgVar2 = (alvg) g2;
                alvgVar2.V(10, TimeUnit.SECONDS);
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/datamodel/backup/analytics/BackupEventLogger$logFailedEvent$1", "invokeSuspend", 184, "BackupEventLogger.kt")).t("Logged backup failed event to clearcut: %s", "DATABASE_BACKUP");
                return arnb.a;
            }
            aqil.P(obj);
            MessageCoreData u = ((rwd) ((mgr) this.b).c.b()).u((MessageIdType) this.c);
            if (u == null) {
                return null;
            }
            int i3 = this.a;
            Object obj3 = this.b;
            amfq amfqVar2 = (amfq) amfr.a.createBuilder();
            amfqVar2.getClass();
            alzz.n(amfp.BUGLE_MESSAGE, amfqVar2);
            amgl amglVar = (amgl) amgu.a.createBuilder();
            amglVar.getClass();
            akec.aP(u.s(), amglVar);
            akec.aT(i3, amglVar);
            akec.aU(lgb.x(u.d()), amglVar);
            akec.aO(((lzz) ((mgr) obj3).b.b()).a(u.z()), amglVar);
            akec.aR(u.E().f(), amglVar);
            alzz.k(akec.aN(amglVar), amfqVar2);
            return alzz.h(amfqVar2);
        }
        aqil.P(obj);
        Object obj4 = this.c;
        int i4 = this.a;
        Object obj5 = this.b;
        ((qxr) obj5).g.e("RbmToolstoneDatabaseOperations#calculateAndStoreToolstoneAppearance", new qq(obj5, i4, obj4, 13, (byte[]) null));
        return arnb.a;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, adiv] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return new psl((ConversationIdType) this.b, this.a, (abej) this.c, arpeVar, 6);
                            }
                            return new psl((wyp) this.b, this.a, (adiv) this.c, arpeVar, 5);
                        }
                        return new psl((tuk) this.b, this.a, (uax) this.c, arpeVar, 4);
                    }
                    Object obj2 = this.b;
                    return new psl((lrf) obj2, (ConversationIdType) this.c, this.a, arpeVar, 3);
                }
                return new psl((rjz) this.b, this.a, (UUID) this.c, arpeVar, 2);
            }
            Object obj3 = this.b;
            return new psl((mgr) obj3, (MessageIdType) this.c, this.a, arpeVar, 1);
        }
        return new psl((qxr) this.b, this.a, (ConversationIdType) this.c, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psl(lrf lrfVar, ConversationIdType conversationIdType, int i, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.d = i2;
        this.b = lrfVar;
        this.c = conversationIdType;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psl(mgr mgrVar, MessageIdType messageIdType, int i, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.d = i2;
        this.b = mgrVar;
        this.c = messageIdType;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psl(qxr qxrVar, int i, ConversationIdType conversationIdType, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.d = i2;
        this.b = qxrVar;
        this.a = i;
        this.c = conversationIdType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psl(rjz rjzVar, int i, UUID uuid, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.d = i2;
        this.b = rjzVar;
        this.a = i;
        this.c = uuid;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psl(tuk tukVar, int i, uax uaxVar, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.d = i2;
        this.b = tukVar;
        this.a = i;
        this.c = uaxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psl(wyp wypVar, int i, adiv adivVar, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.d = i2;
        this.b = wypVar;
        this.a = i;
        this.c = adivVar;
    }
}
