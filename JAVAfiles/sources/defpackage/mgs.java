package defpackage;

import android.provider.Telephony;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import j$.time.Duration;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mgs extends arpw implements arqv {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgs(mcy mcyVar, int i, amoq amoqVar, Integer num, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.e = i2;
        this.d = mcyVar;
        this.a = i;
        this.b = amoqVar;
        this.c = num;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return ((mgs) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                        }
                        return ((mgs) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                    }
                    return ((mgs) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                }
                return ((mgs) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((mgs) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((mgs) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r2v50, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        amfq amfqVar;
        amoh al;
        int i = this.e;
        int i2 = 0;
        amfr amfrVar = null;
        int i3 = 1;
        if (i != 0) {
            int i4 = 2;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            aqil.P(obj);
                            aozy createBuilder = amxn.a.createBuilder();
                            createBuilder.getClass();
                            aktp.aW(5, createBuilder);
                            wyp wypVar = (wyp) this.d;
                            boolean t = ((wwn) wypVar.d.b()).t();
                            Boolean valueOf = Boolean.valueOf(t);
                            wwn wwnVar = (wwn) wypVar.d.b();
                            int i5 = this.a;
                            boolean isPresent = wwnVar.g(i5, true).isPresent();
                            Boolean valueOf2 = Boolean.valueOf(isPresent);
                            aozy createBuilder2 = amxg.a.createBuilder();
                            createBuilder2.getClass();
                            if (!createBuilder2.b.isMutable()) {
                                createBuilder2.u();
                            }
                            apag apagVar = createBuilder2.b;
                            amxg amxgVar = (amxg) apagVar;
                            amxgVar.b = 1 | amxgVar.b;
                            amxgVar.c = i5;
                            if (!apagVar.isMutable()) {
                                createBuilder2.u();
                            }
                            Object obj2 = this.b;
                            apag apagVar2 = createBuilder2.b;
                            amxg amxgVar2 = (amxg) apagVar2;
                            amxgVar2.d = ((amwt) obj2).E;
                            amxgVar2.b |= 2;
                            if (!apagVar2.isMutable()) {
                                createBuilder2.u();
                            }
                            Object obj3 = this.c;
                            amxg amxgVar3 = (amxg) createBuilder2.b;
                            amxgVar3.e = ((amwt) obj3).E;
                            amxgVar3.b = 4 | amxgVar3.b;
                            valueOf.getClass();
                            if (!createBuilder2.b.isMutable()) {
                                createBuilder2.u();
                            }
                            amxg amxgVar4 = (amxg) createBuilder2.b;
                            amxgVar4.b |= 16;
                            amxgVar4.g = t;
                            valueOf2.getClass();
                            if (!createBuilder2.b.isMutable()) {
                                createBuilder2.u();
                            }
                            amxg amxgVar5 = (amxg) createBuilder2.b;
                            amxgVar5.b |= 8;
                            amxgVar5.f = isPresent;
                            apag s = createBuilder2.s();
                            s.getClass();
                            amxg amxgVar6 = (amxg) s;
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            amxn amxnVar = (amxn) createBuilder.b;
                            amxnVar.f = amxgVar6;
                            amxnVar.b |= 2;
                            ((wyp) this.d).q(aktp.aU(createBuilder));
                            return arnb.a;
                        }
                        aqil.P(obj);
                        alvw g = rjz.a.g();
                        g.X(alwp.a, "BugleBackup");
                        alvg alvgVar = (alvg) g;
                        alvgVar.V(10, TimeUnit.SECONDS);
                        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/backup/analytics/BackupEventLogger$logCompleteEvent$1", "invokeSuspend", 99, "BackupEventLogger.kt")).t("Logging backup complete event to clearcut: %s", "DATABASE_BACKUP");
                        aozy createBuilder3 = amog.a.createBuilder();
                        createBuilder3.getClass();
                        akec.ao(createBuilder3);
                        aozy createBuilder4 = amoi.a.createBuilder();
                        createBuilder4.getClass();
                        Duration duration = (Duration) this.b;
                        aozn j = aoue.j(duration);
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        amoi amoiVar = (amoi) createBuilder4.b;
                        amoiVar.c = j;
                        amoiVar.b |= 1;
                        apag s2 = createBuilder4.s();
                        s2.getClass();
                        amoi amoiVar2 = (amoi) s2;
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        Object obj4 = this.c;
                        amog amogVar = (amog) createBuilder3.b;
                        amogVar.d = amoiVar2;
                        amogVar.c = 6;
                        if (obj4 != null) {
                            akec.an(yyb.bX((UUID) obj4), createBuilder3);
                        }
                        if (!duration.isZero()) {
                            if (duration.toMillis() == 0) {
                                aozy createBuilder5 = amoh.a.createBuilder();
                                createBuilder5.getClass();
                                al = akec.al(createBuilder5);
                            } else {
                                int i6 = this.a;
                                aozy createBuilder6 = amoh.a.createBuilder();
                                createBuilder6.getClass();
                                int b = rjz.b(i6, duration);
                                if (!createBuilder6.b.isMutable()) {
                                    createBuilder6.u();
                                }
                                amoh amohVar = (amoh) createBuilder6.b;
                                amohVar.b = 1 | amohVar.b;
                                amohVar.c = b;
                                int b2 = rjz.b(0, duration);
                                if (!createBuilder6.b.isMutable()) {
                                    createBuilder6.u();
                                }
                                amoh amohVar2 = (amoh) createBuilder6.b;
                                amohVar2.b |= 2;
                                amohVar2.d = b2;
                                al = akec.al(createBuilder6);
                            }
                            if (!createBuilder3.b.isMutable()) {
                                createBuilder3.u();
                            }
                            amog amogVar2 = (amog) createBuilder3.b;
                            amogVar2.g = al;
                            amogVar2.b |= 8;
                        }
                        amog am = akec.am(createBuilder3);
                        amfq amfqVar2 = (amfq) amfr.a.createBuilder();
                        amfqVar2.getClass();
                        alzz.n(amfp.BACKUP_WORKFLOW_EVENT, amfqVar2);
                        alzz.i(am, amfqVar2);
                        aozy builder = alzz.h(amfqVar2).toBuilder();
                        builder.getClass();
                        ((rjz) this.d).a((amfq) builder);
                        alvw g2 = rjz.a.g();
                        g2.X(alwp.a, "BugleBackup");
                        alvg alvgVar2 = (alvg) g2;
                        alvgVar2.V(10, TimeUnit.SECONDS);
                        ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/datamodel/backup/analytics/BackupEventLogger$logCompleteEvent$1", "invokeSuspend", 115, "BackupEventLogger.kt")).t("Logged backup complete event to clearcut: %s", "DATABASE_BACKUP");
                        return arnb.a;
                    }
                    aqil.P(obj);
                    xze xzeVar = reb.a;
                    return ((reb) this.b).u.g((gj) this.d, Telephony.Mms.Inbox.CONTENT_URI, this.a, (String) this.c, -1L, null);
                }
                aqil.P(obj);
                return ((ibi) ((reb) this.d).i.b()).h((xaz) this.c, (tqc) this.b, this.a);
            }
            aqil.P(obj);
            Object obj5 = this.c;
            Object obj6 = this.b;
            int i7 = this.a;
            Object obj7 = this.d;
            akrh e = aktp.e("AttachmentEventLogger.logAttachmentEvent");
            try {
                ((mdy) obj7).n(new iun(i7, (amoq) obj6, (Integer) obj5, i4));
                armd.i(e, null);
                return arnb.a;
            } finally {
            }
        } else {
            aqil.P(obj);
            ?? r0 = this.c;
            int i8 = this.a;
            Object obj8 = this.b;
            if (r0.j() == null) {
                ((alvg) mgt.a.i().h("com/google/android/apps/messaging/shared/analytics/statistics/MessageStatusMapiEventLogger", "createBugleMessageEvent", 94, "MessageStatusMapiEventLogger.kt")).t("No analytics message ID found, skipping logging of %s event.", akec.aK(i8));
            } else {
                amfq amfqVar3 = (amfq) amfr.a.createBuilder();
                amfqVar3.getClass();
                alzz.n(amfp.BUGLE_MESSAGE, amfqVar3);
                amgl amglVar = (amgl) amgu.a.createBuilder();
                amglVar.getClass();
                Long j2 = r0.j();
                j2.getClass();
                akec.aP(j2.longValue(), amglVar);
                akec.aT(i8, amglVar);
                String l = r0.l();
                alwo alwoVar = MessageData.a;
                if (!"SMS".equalsIgnoreCase(l)) {
                    if ("MMS".equalsIgnoreCase(l)) {
                        i2 = 1;
                    } else if ("RCS".equalsIgnoreCase(l)) {
                        i2 = 3;
                    } else if ("SATELLITE".equalsIgnoreCase(l)) {
                        i2 = 7;
                    } else {
                        i2 = -1;
                    }
                }
                akec.aU(MessageData.cY(i2), amglVar);
                akec.aO(((lzz) ((mgt) obj8).b.b()).b(r0.d().b()), amglVar);
                alzz.k(akec.aN(amglVar), amfqVar3);
                amfrVar = alzz.h(amfqVar3);
            }
            if (amfrVar != null && (amfqVar = (amfq) amfrVar.toBuilder()) != null) {
                Object obj9 = this.d;
                mar a = ((mbb) ((mgt) obj8).c.b()).a();
                mbh mbhVar = (mbh) obj9;
                a.g(mbhVar);
                a.e(amrs.BUGLE_MESSAGE);
                a.b(amfqVar, mbt.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                amgu amguVar = ((amfr) amfqVar.b).k;
                if (amguVar == null) {
                    amguVar = amgu.a;
                }
                long j3 = amguVar.n;
                amgu amguVar2 = ((amfr) amfqVar.b).k;
                if (amguVar2 == null) {
                    amguVar2 = amgu.a;
                }
                int aL = akec.aL(amguVar2.h);
                if (aL != 0) {
                    i3 = aL;
                }
                ((alvg) mgt.a.d().h("com/google/android/apps/messaging/shared/analytics/statistics/MessageStatusMapiEventLogger$Companion", "debugLogMessageStatusTimestamp", 128, "MessageStatusMapiEventLogger.kt")).J("BugleMessage[eventTimeMs=%d, messageId=%d, messageStatus=%s]", Long.valueOf(mbhVar.a), Long.valueOf(j3), akec.aK(i3));
            }
            return arnb.a;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, miz] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            Object obj2 = this.d;
                            int i2 = this.a;
                            Object obj3 = this.b;
                            return new mgs((wyp) obj2, i2, (amwt) obj3, (amwt) this.c, arpeVar, 5);
                        }
                        Object obj4 = this.d;
                        Object obj5 = this.b;
                        return new mgs((rjz) obj4, (Duration) obj5, (UUID) this.c, this.a, arpeVar, 4);
                    }
                    Object obj6 = this.b;
                    return new mgs((reb) obj6, (gj) this.d, this.a, (String) this.c, arpeVar, 3);
                }
                Object obj7 = this.d;
                Object obj8 = this.c;
                return new mgs((reb) obj7, (xaz) obj8, (tqc) this.b, this.a, arpeVar, 2);
            }
            Object obj9 = this.d;
            int i3 = this.a;
            Object obj10 = this.b;
            return new mgs((mcy) obj9, i3, (amoq) obj10, (Integer) this.c, arpeVar, 1);
        }
        return new mgs((mgt) this.b, (miz) this.c, this.a, (mbh) this.d, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgs(mgt mgtVar, miz mizVar, int i, mbh mbhVar, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.e = i2;
        this.b = mgtVar;
        this.c = mizVar;
        this.a = i;
        this.d = mbhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgs(reb rebVar, gj gjVar, int i, String str, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.e = i2;
        this.b = rebVar;
        this.d = gjVar;
        this.a = i;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgs(reb rebVar, xaz xazVar, tqc tqcVar, int i, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.e = i2;
        this.d = rebVar;
        this.c = xazVar;
        this.b = tqcVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgs(rjz rjzVar, Duration duration, UUID uuid, int i, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.e = i2;
        this.d = rjzVar;
        this.b = duration;
        this.c = uuid;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgs(wyp wypVar, int i, amwt amwtVar, amwt amwtVar2, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.e = i2;
        this.d = wypVar;
        this.a = i;
        this.b = amwtVar;
        this.c = amwtVar2;
    }
}
