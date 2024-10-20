package defpackage;

import android.content.Intent;
import com.google.android.rcs.client.messaging.GetGroupNotificationsResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.messaging.data.GroupEvent;
import com.google.android.rcs.client.messaging.data.GroupInformation;
import com.google.android.rcs.client.messaging.data.GroupMember;
import com.google.android.rcs.client.messaging.data.GroupNotification;
import com.google.android.rcs.client.messaging.data.GroupRemoteCapabilities;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import com.google.android.rcs.client.messaging.data.SubjectExtension;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vym implements vyz {
    public static final xze a = xze.g("BugleRcs", "GetGroupNotificationsMethod");
    public final anen b;
    public final vza c;
    public final qco d;
    public final znj e;
    private final ylg f;
    private final BiFunction g;
    private final vyi h;
    private final anen i;
    private final anen j;

    public vym(qco qcoVar, znj znjVar, ylg ylgVar, BiFunction biFunction, vyi vyiVar, vza vzaVar, anen anenVar, anen anenVar2, anen anenVar3) {
        this.d = qcoVar;
        this.e = znjVar;
        this.f = ylgVar;
        this.g = biFunction;
        this.h = vyiVar;
        this.c = vzaVar;
        this.b = anenVar;
        this.i = anenVar2;
        this.j = anenVar3;
    }

    public static void c(String str, qeg qegVar) {
        qef qefVar = qef.OK;
        qef b = qef.b(qegVar.c);
        if (b == null) {
            b = qef.UNKNOWN_STATUS;
        }
        if (!qefVar.equals(b)) {
            xyo e = a.e();
            e.H("Processing incoming RCS group notification failed");
            e.f(str);
            qee b2 = qee.b(qegVar.d);
            if (b2 == null) {
                b2 = qee.UNKNOWN_CAUSE;
            }
            e.z("errorCode", b2);
            qee b3 = qee.b(qegVar.d);
            if (b3 == null) {
                b3 = qee.UNKNOWN_CAUSE;
            }
            e.z("errorCause", b3);
            e.q();
        }
    }

    @Override // defpackage.vyz
    public final akul a(Intent intent) {
        d.s("com.google.android.apps.messaging.shared.messaging.incoming_group_notification_action".equals(intent.getAction()));
        return this.h.a(this.f.a(this.g, RcsMessagingService.class).h(new vsw(16), this.j).i(new ancs() { // from class: vyl
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v21, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r13v12, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v42, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v16, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v4, types: [armf, java.lang.Object] */
            @Override // defpackage.ancs
            public final ListenableFuture a(Object obj) {
                Object obj2;
                alog alogVar;
                Optional of;
                qfe qfeVar;
                Optional c;
                GetGroupNotificationsResponse getGroupNotificationsResponse = (GetGroupNotificationsResponse) obj;
                Object obj3 = null;
                if (!MessagingResult.d.equals(getGroupNotificationsResponse.a())) {
                    xyo e = vym.a.e();
                    e.H("Fetching incoming RCS group notifications failed");
                    e.x("errorCode", getGroupNotificationsResponse.a().b());
                    e.q();
                    return aktp.ag(null);
                }
                vym vymVar = vym.this;
                alog b = getGroupNotificationsResponse.b();
                vymVar.c.b.e("Bugle.MessagingService.GetGroupNotifications.BatchSize.Count", vza.a(b.size()));
                if (b.isEmpty()) {
                    xyo e2 = vym.a.e();
                    e2.H("Fetching incoming RCS group notifications successful but no messages returned");
                    e2.q();
                    return aktp.ag(null);
                }
                alob alobVar = new alob();
                int size = b.size();
                int i = 0;
                while (i < size) {
                    GroupNotification groupNotification = (GroupNotification) b.get(i);
                    if (groupNotification.c().isPresent()) {
                        String b2 = groupNotification.a().b();
                        try {
                            znj znjVar = vymVar.e;
                            d.t(groupNotification.c().isPresent(), "Unexpected missing groupInformation");
                            Object obj4 = groupNotification.c().get();
                            d.t(!((GroupInformation) obj4).d().isEmpty(), "Unexpected empty conversation URI ");
                            d.t(!((GroupInformation) obj4).e().isEmpty(), "Unexpected empty group conversation id");
                            qei a2 = ((psq) znjVar.a.b()).a(((GroupInformation) obj4).d(), true);
                            aozy createBuilder = qez.b.createBuilder();
                            String e3 = ((GroupInformation) obj4).e();
                            try {
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                apag apagVar = createBuilder.b;
                                qez qezVar = (qez) apagVar;
                                qezVar.c |= 1;
                                qezVar.d = e3;
                                if (!apagVar.isMutable()) {
                                    createBuilder.u();
                                }
                                qez qezVar2 = (qez) createBuilder.b;
                                a2.getClass();
                                qezVar2.e = a2;
                                qezVar2.c |= 2;
                                alob alobVar2 = new alob();
                                alog a3 = ((GroupInformation) obj4).a();
                                int size2 = a3.size();
                                int i2 = 0;
                                while (i2 < size2) {
                                    GroupMember groupMember = (GroupMember) a3.get(i2);
                                    aozy createBuilder2 = qff.a.createBuilder();
                                    alog alogVar2 = a3;
                                    alogVar = b;
                                    try {
                                        qei a4 = ((psq) znjVar.a.b()).a(groupMember.b().a(), false);
                                        if (!createBuilder2.b.isMutable()) {
                                            createBuilder2.u();
                                        }
                                        qff qffVar = (qff) createBuilder2.b;
                                        a4.getClass();
                                        qffVar.c = a4;
                                        qffVar.b |= 1;
                                        ajqi a5 = groupMember.a();
                                        if (aczt.d() && a5.equals(ajqi.ABSENT)) {
                                            qfeVar = qfe.DEPARTED;
                                        } else if (a5.equals(ajqi.PENDING)) {
                                            qfeVar = qfe.PENDING;
                                        } else {
                                            qfeVar = qfe.JOINED;
                                        }
                                        if (!createBuilder2.b.isMutable()) {
                                            createBuilder2.u();
                                        }
                                        qff qffVar2 = (qff) createBuilder2.b;
                                        qffVar2.d = qfeVar.e;
                                        qffVar2.b |= 2;
                                        c = groupMember.c();
                                        obj2 = null;
                                    } catch (IllegalArgumentException e4) {
                                        e = e4;
                                        obj2 = null;
                                        xyo b3 = vym.a.b();
                                        b3.H("Ignoring invalid incoming RCS group notification with group information");
                                        b3.f(b2);
                                        b3.r(e);
                                        i++;
                                        obj3 = obj2;
                                        b = alogVar;
                                    }
                                    try {
                                        c.ifPresent(new vxb(znjVar, createBuilder2, 4, null));
                                        alobVar2.h((qff) createBuilder2.s());
                                        i2++;
                                        b = alogVar;
                                        a3 = alogVar2;
                                    } catch (IllegalArgumentException e5) {
                                        e = e5;
                                        xyo b32 = vym.a.b();
                                        b32.H("Ignoring invalid incoming RCS group notification with group information");
                                        b32.f(b2);
                                        b32.r(e);
                                        i++;
                                        obj3 = obj2;
                                        b = alogVar;
                                    }
                                }
                                alogVar = b;
                                obj2 = null;
                                createBuilder.F(alobVar2.g());
                                alpr alprVar = new alpr();
                                Optional b4 = ((GroupInformation) obj4).b();
                                if (b4.isPresent()) {
                                    if (((GroupRemoteCapabilities) b4.get()).c()) {
                                        alprVar.c(qes.SUBJECT_UPDATE);
                                    }
                                    if (((GroupRemoteCapabilities) b4.get()).a().isPresent() && ((Boolean) ((GroupRemoteCapabilities) b4.get()).a().get()).booleanValue()) {
                                        alprVar.c(qes.REMOVE_PARTICIPANT_BY_ADMIN);
                                    } else if (((GroupRemoteCapabilities) b4.get()).b().isPresent() && ((Boolean) ((GroupRemoteCapabilities) b4.get()).b().get()).booleanValue()) {
                                        alprVar.c(qes.REMOVE_PARTICIPANT_BY_ALL);
                                    }
                                }
                                createBuilder.E(alprVar.g());
                                qei ai = znjVar.ai();
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                qez qezVar3 = (qez) createBuilder.b;
                                ai.getClass();
                                qezVar3.k = ai;
                                qezVar3.c |= 32;
                                if (((GroupInformation) obj4).f().isEmpty() && ((GroupInformation) obj4).c().isEmpty()) {
                                    of = Optional.empty();
                                } else {
                                    aozy createBuilder3 = qfj.a.createBuilder();
                                    String f = ((GroupInformation) obj4).f();
                                    if (!createBuilder3.b.isMutable()) {
                                        createBuilder3.u();
                                    }
                                    qfj qfjVar = (qfj) createBuilder3.b;
                                    qfjVar.b |= 1;
                                    qfjVar.c = f;
                                    if (((GroupInformation) obj4).c().isPresent()) {
                                        Object obj5 = ((GroupInformation) obj4).c().get();
                                        if (((SubjectExtension) obj5).a().isPresent()) {
                                            aozy createBuilder4 = qfm.a.createBuilder();
                                            qei a6 = ((psq) znjVar.a.b()).a(((RcsDestinationId) ((SubjectExtension) obj5).a().get()).a(), false);
                                            if (!createBuilder4.b.isMutable()) {
                                                createBuilder4.u();
                                            }
                                            qfm qfmVar = (qfm) createBuilder4.b;
                                            a6.getClass();
                                            qfmVar.c = a6;
                                            qfmVar.b |= 1;
                                            ((SubjectExtension) obj5).b().ifPresent(new vwq(createBuilder4, 7));
                                            qfm qfmVar2 = (qfm) createBuilder4.s();
                                            if (!createBuilder3.b.isMutable()) {
                                                createBuilder3.u();
                                            }
                                            qfj qfjVar2 = (qfj) createBuilder3.b;
                                            qfmVar2.getClass();
                                            qfjVar2.d = qfmVar2;
                                            qfjVar2.b |= 2;
                                        }
                                    }
                                    of = Optional.of((qfj) createBuilder3.s());
                                }
                                of.ifPresent(new vwq(createBuilder, 6));
                                alobVar.h(vymVar.d.e((qez) createBuilder.s()).h(new vuu(b2, 15), vymVar.b));
                            } catch (IllegalArgumentException e6) {
                                e = e6;
                                alogVar = b;
                            }
                        } catch (IllegalArgumentException e7) {
                            e = e7;
                            obj2 = obj3;
                            alogVar = b;
                        }
                    } else {
                        obj2 = obj3;
                        alogVar = b;
                        if (groupNotification.b().isPresent() && aczt.n()) {
                            String b5 = groupNotification.a().b();
                            try {
                                znj znjVar2 = vymVar.e;
                                d.t(groupNotification.b().isPresent(), "Unexpected missing groupEvent");
                                Object obj6 = groupNotification.b().get();
                                d.t(!((GroupEvent) obj6).a().isEmpty(), "Unexpected empty changedMember");
                                aozy createBuilder5 = qey.c.createBuilder();
                                String b6 = groupNotification.a().b();
                                if (!createBuilder5.b.isMutable()) {
                                    createBuilder5.u();
                                }
                                qey qeyVar = (qey) createBuilder5.b;
                                qeyVar.d |= 1;
                                qeyVar.e = b6;
                                try {
                                    qei a7 = ((psq) znjVar2.a.b()).a(((GroupMember) ((GroupEvent) obj6).a().get(0)).b().a(), false);
                                    if (((GroupMember) ((GroupEvent) obj6).a().get(0)).a() == ajqi.ABSENT) {
                                        createBuilder5.D(a7);
                                    } else if (((GroupMember) ((GroupEvent) obj6).a().get(0)).a() == ajqi.PRESENT) {
                                        createBuilder5.C(a7);
                                    }
                                    qei ai2 = znjVar2.ai();
                                    if (!createBuilder5.b.isMutable()) {
                                        createBuilder5.u();
                                    }
                                    qey qeyVar2 = (qey) createBuilder5.b;
                                    ai2.getClass();
                                    qeyVar2.q = ai2;
                                    qeyVar2.d |= 256;
                                } catch (IllegalArgumentException e8) {
                                    e = e8;
                                }
                                try {
                                    if (((GroupMember) ((GroupEvent) obj6).a().get(0)).c().isPresent()) {
                                        aozy createBuilder6 = qfm.a.createBuilder();
                                        qei a8 = ((psq) znjVar2.a.b()).a(((RcsDestinationId) ((GroupMember) ((GroupEvent) obj6).a().get(0)).c().get()).a(), false);
                                        if (!createBuilder6.b.isMutable()) {
                                            createBuilder6.u();
                                        }
                                        qfm qfmVar3 = (qfm) createBuilder6.b;
                                        a8.getClass();
                                        qfmVar3.c = a8;
                                        qfmVar3.b |= 1;
                                        qfm qfmVar4 = (qfm) createBuilder6.s();
                                        if (!createBuilder5.b.isMutable()) {
                                            createBuilder5.u();
                                        }
                                        qey qeyVar3 = (qey) createBuilder5.b;
                                        qfmVar4.getClass();
                                        qeyVar3.o = qfmVar4;
                                        qeyVar3.d |= 64;
                                    }
                                    alobVar.h(vymVar.d.d((qey) createBuilder5.s()).h(new vuu(b5, 16), vymVar.b));
                                } catch (IllegalArgumentException e9) {
                                    e = e9;
                                    xyo b7 = vym.a.b();
                                    b7.H("Ignoring invalid incoming RCS group notification with group event");
                                    b7.f(b5);
                                    b7.r(e);
                                    i++;
                                    obj3 = obj2;
                                    b = alogVar;
                                }
                            } catch (IllegalArgumentException e10) {
                                e = e10;
                            }
                            i++;
                            obj3 = obj2;
                            b = alogVar;
                        }
                    }
                    i++;
                    obj3 = obj2;
                    b = alogVar;
                }
                return aktp.am(alobVar.g()).i(new vyj(2), vymVar.b);
            }
        }, this.i), "GetGroupNotifications");
    }

    @Override // defpackage.vyz
    public final String b() {
        return "Bugle.MessagingService.Intent.IncomingGroupNotification.Latency";
    }
}
