package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class qoh extends arpw implements arqv {
    int a;
    final /* synthetic */ qoi b;
    final /* synthetic */ uns c;
    final /* synthetic */ qoj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qoh(qoi qoiVar, uns unsVar, qoj qojVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = qoiVar;
        this.c = unsVar;
        this.d = qojVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qoh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Set aE;
        int i;
        ahka ahkaVar;
        String str;
        arpl arplVar = arpl.a;
        int i2 = 10;
        try {
            try {
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Iterator it = ((Set) this.b.c.b()).iterator();
                    while (it.hasNext()) {
                        ((ndj) it.next()).c();
                    }
                    if (this.c.a().b == 0) {
                        qoi qoiVar = this.b;
                        int T = a.T(this.d.e);
                        if (T == 0) {
                            T = 1;
                        }
                        Object b = qoiVar.f.b();
                        b.getClass();
                        mbl mblVar = (mbl) b;
                        int i3 = T - 2;
                        if (i3 != 1 && i3 != 2) {
                            if (i3 != 4) {
                                i = 5;
                            } else {
                                i = 11;
                            }
                        } else {
                            i = 2;
                        }
                        qlm.f(mblVar, i);
                    }
                    qom qomVar = (qom) this.b.b.b();
                    apax apaxVar = this.d.d;
                    apaxVar.getClass();
                    if (aqjn.aG(apaxVar)) {
                        apax apaxVar2 = this.d.d;
                        apaxVar2.getClass();
                        ArrayList arrayList = new ArrayList(aqjn.J(apaxVar2, 10));
                        Iterator<E> it2 = apaxVar2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new Long(((qod) it2.next()).b));
                        }
                        aE = aqjn.aE(arrayList);
                    } else {
                        apar aparVar = this.d.c;
                        aparVar.getClass();
                        aE = aqjn.aE(aparVar);
                    }
                    this.a = 1;
                    if (qomVar.b(aE, this) == arplVar) {
                        return arplVar;
                    }
                }
                qoi qoiVar2 = this.b;
                apax<qod> apaxVar3 = this.d.d;
                apaxVar3.getClass();
                ArrayList arrayList2 = new ArrayList(aqjn.J(apaxVar3, 10));
                for (qod qodVar : apaxVar3) {
                    qodVar.getClass();
                    long j = qodVar.b;
                    Instant ofEpochMilli = Instant.ofEpochMilli(qodVar.c);
                    ofEpochMilli.getClass();
                    arrayList2.add(new qll(j, ofEpochMilli));
                }
                int T2 = a.T(this.d.e);
                if (T2 == 0) {
                    T2 = 1;
                }
                if (!arrayList2.isEmpty()) {
                    int i4 = T2 - 2;
                    if (i4 != 1) {
                        if (i4 != 2) {
                            alvw g = qoi.a.g();
                            g.X(alwp.a, "BugleRecipientSync");
                            alvg alvgVar = (alvg) g.h("com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientDeletedSyncHandler", "getRecipientsSyncLatencyTimerNameOrNull", 171, "ContactRecipientDeletedSyncHandler.kt");
                            if (T2 != 2) {
                                if (T2 != 3) {
                                    if (T2 != 4) {
                                        if (T2 != 5) {
                                            if (T2 != 6) {
                                                str = "UNRECOGNIZED";
                                            } else {
                                                str = "DELETED_SYNC_TRIGGER_IMPORT";
                                            }
                                        } else {
                                            str = "DELETED_SYNC_TRIGGER_FORCED";
                                        }
                                    } else {
                                        str = "DELETED_SYNC_TRIGGER_WORKER";
                                    }
                                } else {
                                    str = "DELETED_SYNC_TRIGGER_OBSERVER";
                                }
                            } else {
                                str = "DELETED_SYNC_TRIGGER_UNSPECIFIED";
                            }
                            alvgVar.t("Trigger source of %s will not have its sync duration logged.", str);
                            ahkaVar = null;
                        } else {
                            ahkaVar = qld.t;
                        }
                    } else {
                        ahkaVar = qld.r;
                    }
                    if (ahkaVar != null) {
                        long epochMilli = ((xnv) qoiVar2.e.b()).f().toEpochMilli();
                        long epochMilli2 = qlm.b(arrayList2).toEpochMilli();
                        if (epochMilli2 <= epochMilli) {
                            ((ahqm) qoiVar2.d.b()).b(ahkaVar, epochMilli2, epochMilli, ahqp.SUCCESS);
                        } else {
                            alvw i5 = qoi.a.i();
                            i5.X(alwp.a, "BugleRecipientSync");
                            ((alvg) i5.h("com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientDeletedSyncHandler", "logTotalSyncLatency", 157, "ContactRecipientDeletedSyncHandler.kt")).t("Invalid duration for %s", ahkaVar.a);
                        }
                    }
                }
                upm b2 = upm.b();
                Iterator it3 = ((Set) this.b.c.b()).iterator();
                while (it3.hasNext()) {
                    ((ndj) it3.next()).d();
                }
                return b2;
            } catch (Exception e) {
                alvw i6 = qoi.a.i();
                i6.X(alwp.a, "BugleRecipientSync");
                ((alvg) ((alvg) i6).g(e).h("com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientDeletedSyncHandler$processPendingWorkItemAsync$1", "invokeSuspend", 93, "ContactRecipientDeletedSyncHandler.kt")).q("Caught exception while syncing deleted contacts to recipients. Marking WorkQueueResult as failedRetry.");
                qoi qoiVar3 = this.b;
                int T3 = a.T(this.d.e);
                if (T3 == 0) {
                    T3 = 1;
                }
                Object b3 = qoiVar3.f.b();
                b3.getClass();
                mbl mblVar2 = (mbl) b3;
                int i7 = T3 - 2;
                if (i7 != 1 && i7 != 2) {
                    if (i7 == 4) {
                        i2 = 12;
                    }
                } else {
                    i2 = 7;
                }
                qlm.f(mblVar2, i2);
                upm e2 = upm.e();
                Iterator it4 = ((Set) this.b.c.b()).iterator();
                while (it4.hasNext()) {
                    ((ndj) it4.next()).d();
                }
                return e2;
            }
        } catch (Throwable th) {
            Iterator it5 = ((Set) this.b.c.b()).iterator();
            while (it5.hasNext()) {
                ((ndj) it5.next()).d();
            }
            throw th;
        }
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new qoh(this.b, this.c, this.d, arpeVar);
    }
}
