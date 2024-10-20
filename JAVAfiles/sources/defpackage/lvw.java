package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lvw extends arpw implements arqv {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvw(lve lveVar, amxr amxrVar, int i, lwz lwzVar, UUID uuid, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.f = i2;
        this.b = lveVar;
        this.c = amxrVar;
        this.a = i;
        this.e = lwzVar;
        this.d = uuid;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return ((lvw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                }
                return ((lvw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((lvw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((lvw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v42, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i = this.f;
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    aqil.P(obj);
                    wyp wypVar = (wyp) this.b;
                    adji adjiVar = (adji) wypVar.g.b();
                    ReentrantReadWriteLock.ReadLock readLock = adjiVar.e.readLock();
                    readLock.lock();
                    try {
                        List list = adjiVar.g;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(arrn.r(aqjn.i(aqjn.J(list, 10)), 16));
                        for (Object obj2 : list) {
                            linkedHashMap.put(((adjf) obj2).a, obj2);
                        }
                        ?? r8 = this.c;
                        ?? r7 = this.e;
                        ?? r6 = this.d;
                        int i2 = this.a;
                        readLock.unlock();
                        ((wyp) this.b).q(wypVar.s(i2, r6, r7, r8, linkedHashMap));
                        return arnb.a;
                    } catch (Throwable th) {
                        readLock.unlock();
                        throw th;
                    }
                }
                aqil.P(obj);
                Object b = ((reb) this.b).o.b();
                b.getClass();
                ((ahmv) b).j((MessageCoreData) ((arsb) this.d).a, null);
                amgl amglVar = (amgl) amgu.a.createBuilder();
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar = (amgu) amglVar.b;
                amguVar.aw = 5;
                amguVar.d |= 2048;
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar2 = (amgu) amglVar.b;
                amguVar2.g = 1;
                amguVar2.b |= 1;
                Object obj3 = this.e;
                if (obj3 != null) {
                    if (!((wye) obj3).m && !((arrx) this.c).a) {
                        z = false;
                    }
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar3 = (amgu) amglVar.b;
                    amguVar3.c |= 1073741824;
                    amguVar3.aj = z;
                }
                mho mhoVar = (mho) ((reb) this.b).m.b();
                MessageCoreData messageCoreData = (MessageCoreData) ((arsb) this.d).a;
                int i3 = this.a;
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar4 = (amgu) amglVar.b;
                amguVar4.h = 2;
                amguVar4.b = 2 | amguVar4.b;
                mhoVar.M(messageCoreData, i3, amglVar);
                return arnb.a;
            }
            aqil.P(obj);
            alvw g = lve.a.g();
            g.X(alwp.a, "BugleBackup");
            alvg alvgVar = (alvg) g;
            alvgVar.V(10, TimeUnit.SECONDS);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger$logProcessFailedEvent$1", "invokeSuspend", BasePaymentResult.ERROR_REQUEST_FAILED, "RestoreEventLogger.kt")).q("Logging restore failed event to clearcut");
            aozy createBuilder = amxs.a.createBuilder();
            createBuilder.getClass();
            aktp.aO((amxr) this.c, createBuilder);
            aktp.aP((lwz) this.e, createBuilder);
            aozy createBuilder2 = amxu.a.createBuilder();
            createBuilder2.getClass();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            int i4 = this.a;
            amxu amxuVar = (amxu) createBuilder2.b;
            amxuVar.c = i4 - 1;
            amxuVar.b = 1 | amxuVar.b;
            apag s = createBuilder2.s();
            s.getClass();
            amxu amxuVar2 = (amxu) s;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amxs amxsVar = (amxs) createBuilder.b;
            amxsVar.d = amxuVar2;
            amxsVar.c = 6;
            aozy builder = aktp.aN(createBuilder).toBuilder();
            builder.getClass();
            Object obj4 = this.d;
            if (obj4 != null) {
                aozb bX = yyb.bX((UUID) obj4);
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                amxs amxsVar2 = (amxs) builder.b;
                amxsVar2.b = 2 | amxsVar2.b;
                amxsVar2.f = bX;
            }
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            amfqVar.getClass();
            alzz.n(amfp.RESTORE_WORKFLOW_EVENT, amfqVar);
            alzz.p((amxs) builder.s(), amfqVar);
            aozy builder2 = alzz.h(amfqVar).toBuilder();
            builder2.getClass();
            mar a = ((mbb) ((lve) this.b).b.b()).a();
            a.e(amrs.RESTORE_WORKFLOW_EVENT);
            a.b((amfq) builder2, mbt.LOG_SPEC_RESTORE_WORKFLOW_EVENTS);
            alvw g2 = lve.a.g();
            g2.X(alwp.a, "BugleBackup");
            alvg alvgVar2 = (alvg) g2;
            alvgVar2.V(10, TimeUnit.SECONDS);
            ((alvg) alvgVar2.h("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger$logProcessFailedEvent$1", "invokeSuspend", 222, "RestoreEventLogger.kt")).q("Logged restore failed event to clearcut");
            return arnb.a;
        }
        aqil.P(obj);
        try {
            lve lveVar = (lve) ((lvx) this.b).b.b();
            Object obj5 = this.c;
            amxr amxrVar = (amxr) obj5;
            qjh.l(lveVar.c, null, new lvw(lveVar, amxrVar, this.a, (lwz) this.e, (UUID) this.d, (arpe) null, 1), 3);
        } catch (Exception e) {
            alvw i5 = lvx.a.i();
            i5.X(alwp.a, "BugleBackup");
            ((alvg) ((alvg) i5).g(e).h("com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowStepsEventLoggers$logFailureEvent$1", "invokeSuspend", 136, "BasicRestoreWorkflowStepsEventLoggers.kt")).t("Failed to log failure event for: %s", this.c);
        }
        return arnb.a;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return new lvw((wyp) this.b, this.a, (Set) this.d, (Map) this.e, (Map) this.c, arpeVar, 3);
                }
                Object obj2 = this.b;
                Object obj3 = this.d;
                Object obj4 = this.e;
                return new lvw((reb) obj2, (arsb) obj3, (wye) obj4, (arrx) this.c, this.a, arpeVar, 2);
            }
            Object obj5 = this.b;
            Object obj6 = this.c;
            int i2 = this.a;
            Object obj7 = this.e;
            return new lvw((lve) obj5, (amxr) obj6, i2, (lwz) obj7, (UUID) this.d, arpeVar, 1);
        }
        Object obj8 = this.b;
        Object obj9 = this.c;
        return new lvw((lvx) obj8, (amxr) obj9, (UUID) this.d, this.a, (lwz) this.e, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvw(lvx lvxVar, amxr amxrVar, UUID uuid, int i, lwz lwzVar, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.f = i2;
        this.b = lvxVar;
        this.c = amxrVar;
        this.d = uuid;
        this.a = i;
        this.e = lwzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvw(reb rebVar, arsb arsbVar, wye wyeVar, arrx arrxVar, int i, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.f = i2;
        this.b = rebVar;
        this.d = arsbVar;
        this.e = wyeVar;
        this.c = arrxVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvw(wyp wypVar, int i, Set set, Map map, Map map2, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.f = i2;
        this.b = wypVar;
        this.a = i;
        this.d = set;
        this.e = map;
        this.c = map2;
    }
}
