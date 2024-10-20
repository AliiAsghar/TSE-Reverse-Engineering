package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uln extends xcf {
    final /* synthetic */ armf a;
    final /* synthetic */ armf b;
    final /* synthetic */ armf c;
    final /* synthetic */ armf d;
    final /* synthetic */ armf e;
    final /* synthetic */ anen f;

    public uln(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, anen anenVar) {
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
        this.e = armfVar5;
        this.f = anenVar;
    }

    @Override // defpackage.xny
    public final akrh a() {
        return aktp.e("CmsBackupStartupTask");
    }

    @Override // defpackage.xcf
    public final akul b() {
        final armf armfVar = this.a;
        final armf armfVar2 = this.b;
        final armf armfVar3 = this.c;
        final armf armfVar4 = this.d;
        final armf armfVar5 = this.e;
        return aktp.ah(new Runnable() { // from class: ulm
            @Override // java.lang.Runnable
            public final void run() {
                Object apply;
                Integer valueOf;
                armf armfVar6 = armf.this;
                ukq ukqVar = (ukq) armfVar6.b();
                akrh e = aktp.e("WorkerDatabaseOperations#clearAllInFlightWorkItems");
                try {
                    xyl.h();
                    ukqVar.d.e();
                    e.close();
                    int c = riw.c();
                    akrh e2 = aktp.e("WorkerDatabaseOperations#decrementRetryCountOfMaxRetriedBackupWork");
                    try {
                        aiut.b();
                        srk srkVar = new srk();
                        srkVar.aj("decrementRetryCountOfMaxRetriedBackupWork");
                        srkVar.a.put("retry_count", Integer.valueOf(c - 1));
                        srkVar.d(new qqv(c, 7));
                        srkVar.a().e();
                        armf armfVar7 = armfVar3;
                        armf armfVar8 = armfVar2;
                        e2.close();
                        ((AtomicReference) ((uie) armfVar8.b()).a).set(new ahjj(armfVar7));
                        if (((Boolean) ugu.a.e()).booleanValue()) {
                            ugu uguVar = (ugu) armfVar4.b();
                            if (!uguVar.d.compareAndSet(false, true)) {
                                ((alwl) ((alwl) ugu.b.i()).h("com/google/android/apps/messaging/shared/datamodel/observer/TableContentChangeObserver", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 126, "TableContentChangeObserver.java")).q("Already started table content change observer.");
                            } else {
                                ((alwl) ((alwl) ugu.b.g()).h("com/google/android/apps/messaging/shared/datamodel/observer/TableContentChangeObserver", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 129, "TableContentChangeObserver.java")).q("Starts to observe table change.");
                                ((sxx) uguVar.e.get()).E(new ugs(uguVar));
                                ((sne) uguVar.f.get()).E(new ugq(uguVar));
                                ((tay) uguVar.g.get()).E(new ugt(uguVar));
                                ((sti) uguVar.h.get()).E(new ugr(uguVar));
                            }
                        }
                        ((qzm) armfVar7.b()).b().F(Action.r);
                        int c2 = riw.c();
                        e = aktp.e("WorkerDatabaseOperations#getNbrOfWorkItemsExceedingMaxRetry");
                        try {
                            xyl.h();
                            tm tmVar = new tm();
                            srj a = srm.a();
                            a.w("getNbrOfWorkItemsExceedingMaxRetry");
                            apply = new uid(12).apply(srm.d);
                            srf[] srfVarArr = {(srf) apply};
                            valueOf = Integer.valueOf(a.bp().c());
                            int intValue = valueOf.intValue();
                            if (((Integer) srm.b.getOrDefault(srfVarArr[0].toString(), -1)).intValue() > intValue) {
                                agnc.t("columnReference.toString()", intValue);
                            }
                            a.m(srfVarArr);
                            a.n(new agpl("COUNT(*)"), "row_count_expression");
                            a.c(new qqv(c2, 6));
                            a.t(srm.d.i);
                            srg srgVar = (srg) a.b().n();
                            while (srgVar.moveToNext()) {
                                try {
                                    tmVar.put(Integer.valueOf(srgVar.h()), Integer.valueOf(Integer.parseInt(srgVar.cX("row_count_expression"))));
                                } finally {
                                }
                            }
                            srgVar.close();
                            e.close();
                            for (Map.Entry entry : tmVar.entrySet()) {
                                armf armfVar9 = armfVar5;
                                if ((((Integer) entry.getKey()).intValue() & 1) == 1) {
                                    ((mbl) armfVar9.b()).d("Bugle.GW.Icing.Indexing.Failed", ((Integer) entry.getValue()).intValue());
                                } else if ((((Integer) entry.getKey()).intValue() & 2) == 2) {
                                    ((mbl) armfVar9.b()).d("Bugle.GW.Run.All.Annotator.Failed", ((Integer) entry.getValue()).intValue());
                                } else if ((((Integer) entry.getKey()).intValue() & 4) == 4) {
                                    ((mbl) armfVar9.b()).d("Bugle.GW.Address.Annotation.Post.Process.Failed", ((Integer) entry.getValue()).intValue());
                                } else if ((((Integer) entry.getKey()).intValue() & 8) == 8) {
                                    ((mbl) armfVar9.b()).d("Bugle.GW.Link.Annotation.Post.Process.Failed", ((Integer) entry.getValue()).intValue());
                                } else if ((((Integer) entry.getKey()).intValue() & 16) == 16) {
                                    ((mbl) armfVar9.b()).d("Bugle.GW.RCS.Flags.Worker.Failed", ((Integer) entry.getValue()).intValue());
                                } else {
                                    ((mbl) armfVar9.b()).d("Bugle.GW.Unknown.Worker.Failed", ((Integer) entry.getValue()).intValue());
                                }
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        e.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
        }, this.f);
    }

    @Override // defpackage.xck
    public final boolean fI() {
        return true;
    }
}
