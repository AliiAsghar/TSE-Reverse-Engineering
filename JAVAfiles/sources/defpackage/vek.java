package defpackage;

import android.text.TextUtils;
import com.google.android.rcs.client.messaging.GetMessagesResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vek implements ancs {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vek(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [pss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v66, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v70, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v24, types: [armf, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        Integer valueOf;
        Integer valueOf2;
        akul h;
        int i = 4;
        int i2 = 11;
        int i3 = 18;
        int i4 = 5;
        int i5 = 0;
        String str = null;
        switch (this.b) {
            case 0:
                vel velVar = (vel) this.a;
                alor alorVar = (alor) obj;
                vee veeVar = (vee) alorVar.get(velVar.g);
                if (veeVar != null && !veeVar.c.isEmpty() && !veeVar.d.G()) {
                    vel.a.l("Phone registration data exists.");
                    return aktp.ag(Optional.of(veeVar));
                }
                Optional n = velVar.n(velVar.g);
                aluq listIterator = alorVar.entrySet().listIterator();
                long j = 0;
                while (listIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    String str2 = (String) entry.getKey();
                    if (!velVar.g.equals(str2)) {
                        if (((Boolean) new mst(11).get()).booleanValue()) {
                            if (n.isPresent() && n.equals(velVar.n(str2))) {
                                if (((vee) entry.getValue()).d.d() > 0 && ((vee) entry.getValue()).e >= j) {
                                    j = ((vee) entry.getValue()).e;
                                    xyo c = vel.a.c();
                                    c.H("Found alternative phone number");
                                    c.L("alternative", str2);
                                    c.q();
                                    str = str2;
                                }
                            }
                        } else {
                            if (((anhn) ((yjr) velVar.f.b()).d.b()).d(velVar.g, str2) == 5) {
                                if (((vee) entry.getValue()).d.d() > 0) {
                                    j = ((vee) entry.getValue()).e;
                                    xyo c2 = vel.a.c();
                                    c2.H("Found alternative phone number");
                                    c2.L("alternative", str2);
                                    c2.q();
                                    str = str2;
                                }
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    ((mbl) velVar.e.b()).c("Bugle.PhoneRegistration.Alternative.Move.Count");
                    vel.a.o("Reuse existing phone registration data.");
                    return velVar.b.i(str);
                }
                vel.a.l("No alternative phone number exists.");
                return aktp.ag(Optional.empty());
            case 1:
                return ((vel) this.a).b();
            case 2:
                return ((vfi) this.a).c.b((aqdm) obj);
            case 3:
                aqeb aqebVar = (aqeb) obj;
                alvw g = vgk.a.g();
                g.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/handler/pullhandler/PullHandlerImpl", "handlePullResponse", 189, "PullHandlerImpl.java")).x("Pull completed, messagecount: %d, pulledAll: %s", aqebVar.b.size(), aqebVar.c);
                Object obj2 = this.a;
                vgk vgkVar = (vgk) obj2;
                synchronized (vgkVar.b) {
                    if (!aqebVar.c) {
                        ((vgk) obj2).h = true;
                    }
                }
                ArrayList arrayList = new ArrayList(aqebVar.b.size());
                for (aqds aqdsVar : aqebVar.b) {
                    yyt yytVar = (yyt) vgkVar.d.b();
                    aqdr b = aqdr.b(aqdsVar.d);
                    if (b == null) {
                        b = aqdr.UNRECOGNIZED;
                    }
                    if (b == aqdr.TACHYGRAM_MESSAGE) {
                        rve a = rve.a(aqdsVar.c);
                        aozy createBuilder = asgx.a.createBuilder();
                        atok ba = yyb.ba();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        apag apagVar = createBuilder.b;
                        asgx asgxVar = (asgx) apagVar;
                        ba.getClass();
                        asgxVar.c = ba;
                        asgxVar.b |= 1;
                        if (!apagVar.isMutable()) {
                            createBuilder.u();
                        }
                        ((asgx) createBuilder.b).e = a.aq(9);
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        ((asgx) createBuilder.b).g = arsd.at(49);
                        aozy createBuilder2 = asgv.a.createBuilder();
                        createBuilder2.bP(aqdsVar.c);
                        asgv asgvVar = (asgv) createBuilder2.s();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        asgx asgxVar2 = (asgx) createBuilder.b;
                        asgvVar.getClass();
                        asgxVar2.d = asgvVar;
                        asgxVar2.b |= 2;
                        yytVar.W(a, createBuilder);
                    }
                    arrayList.add(vgkVar.i.b(aqdsVar));
                }
                return aktp.am(arrayList).h(new vcr(i), andi.a);
            case 4:
                Object obj3 = this.a;
                vgk vgkVar2 = (vgk) obj3;
                synchronized (vgkVar2.b) {
                    ((vgk) obj3).g = null;
                    if (!((vgk) obj3).h) {
                        return aktp.ag(null);
                    }
                    alvw g2 = vgk.a.g();
                    g2.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/net/handler/pullhandler/PullHandlerImpl", "pullMessagesInternal", 178, "PullHandlerImpl.java")).q("Perform pullMessages again at the end of the previous pullMessages call.");
                    return vgkVar2.e.k().i(new vek(obj3, i4), vgkVar2.c);
                }
            case 5:
                return ((vgk) this.a).b((aqfg) obj);
            case 6:
                Object obj4 = this.a;
                alzc v = alzz.v();
                v.c(new alzk("PullHandler", ((vgk) obj4).f));
                try {
                    return (akul) new akoo(v, (Callable) new ulo(obj4, (aqfg) obj, 16), 2).call();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException("checked exception caught during context call", e2);
                }
            case 7:
                vhm.a.o("Closing all phone-number-based bind channels");
                ((vhi) ((vhm) this.a).g.b()).f();
                return aktp.ag(null);
            case 8:
                return ((uvi) ((vho) this.a).b.b()).b((Throwable) obj);
            case 9:
                alwo alwoVar = vka.a;
                if (!((Boolean) obj).booleanValue()) {
                    return aktp.ag(false);
                }
                return ((vkh) this.a).e();
            case 10:
                alog alogVar = (alog) obj;
                return aktp.am(alogVar).h(new vib(alogVar, 10), ((vtr) this.a).c);
            case 11:
                vuo vuoVar = (vuo) this.a;
                Duration a2 = vuoVar.c.a();
                zap zapVar = vuoVar.f;
                return zapVar.p().h(new vgd(a2, i3), zapVar.a).i(new vfj(zapVar, (String) obj, i4, 0 == true ? 1 : 0), zapVar.a).i(new vek(zapVar, 12), zapVar.a);
            case 12:
                Object obj5 = this.a;
                return aktp.ah(new ung(obj5, (amfr) obj, 19), ((zap) obj5).f);
            case 13:
                return this.a.b((qen) obj);
            case 14:
                Object obj6 = this.a;
                vyd vydVar = (vyd) obj6;
                long epochMilli = vydVar.e.f().minus(vyd.b).toEpochMilli();
                sbh sbhVar = new sbh();
                sbhVar.U(new agoi("messages.message_protocol", 1, 3));
                sbhVar.e(vyd.c);
                sbhVar.d(epochMilli);
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 10007) {
                    agnc.t("conv_type", intValue);
                }
                sbhVar.U(new agoi("conversations.conv_type", 1, 0));
                valueOf2 = Integer.valueOf(a.bp().c());
                int intValue2 = valueOf2.intValue();
                if (intValue2 < 12001) {
                    agnc.t("has_ea2p_bot_recipient", intValue2);
                }
                sbhVar.U(new agoi("conversations.has_ea2p_bot_recipient", 1, 0));
                return aktp.ai(new vmb(obj6, sbhVar, i3, 0 == true ? 1 : 0), vydVar.f);
            case 15:
                Stream distinct = ((Stream) obj).limit(200L).map(new vvi(8)).filter(new vmc(i2)).distinct();
                Object obj7 = this.a;
                Stream map = distinct.map(new vxg(obj7, i)).map(new vxg(obj7, i4));
                try {
                    int i6 = alog.d;
                    alog alogVar2 = (alog) map.collect(alls.a);
                    if (alogVar2.isEmpty()) {
                        h = akul.g(((aogy) ((vyv) ((Optional) ((vyd) obj7).l.b()).get()).a.b()).p("RcsLimboMessagesResolverWorker"));
                    } else {
                        h = aktp.am(alogVar2).h(new vmb(obj7, alogVar2, 17), ((vyd) obj7).f);
                    }
                    if (map != null) {
                        map.close();
                    }
                    return h;
                } catch (Throwable th) {
                    if (map != null) {
                        try {
                            map.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            case 16:
                GetMessagesResponse getMessagesResponse = (GetMessagesResponse) obj;
                if (!MessagingResult.d.equals(getMessagesResponse.a())) {
                    xyo e3 = vyk.a.e();
                    e3.H("Fetching incoming RCS messages failed");
                    e3.x("errorCode", getMessagesResponse.a().b());
                    e3.q();
                    return aktp.ag(null);
                }
                Object obj8 = this.a;
                alog b2 = getMessagesResponse.b();
                vyk vykVar = (vyk) obj8;
                vykVar.c.b(b2.size());
                if (b2.isEmpty()) {
                    xyo e4 = vyk.a.e();
                    e4.H("Fetching incoming RCS messages successful but no messages returned from GetAllMessagesStrategy");
                    e4.q();
                    return aktp.ag(null);
                }
                alob alobVar = new alob();
                alog b3 = getMessagesResponse.b();
                int size = b3.size();
                for (int i7 = 0; i7 < size; i7++) {
                    MessageNotification messageNotification = (MessageNotification) b3.get(i7);
                    rve a3 = rve.a(messageNotification.b().h());
                    try {
                        alobVar.h(vykVar.d.f(((vyk) obj8).e.i(messageNotification)).h(new vuu(a3, 14), vykVar.b));
                    } catch (IllegalArgumentException e5) {
                        xyo b4 = vyk.a.b();
                        b4.H("Ignoring invalid incoming RCS message");
                        b4.g(a3);
                        b4.r(e5);
                    }
                }
                return aktp.am(alobVar.g()).i(new vyj(i5), vykVar.b);
            case 17:
                ((vzf) this.a).d.b.c("Bugle.MessagingService.SendMessageRequest.Binder.OnDemand.Connect.Timeout.Count");
                return aktp.af((TimeoutException) obj);
            case 18:
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    Object obj9 = this.a;
                    ((alwl) waw.a.m().h("com/google/android/apps/messaging/shared/rcs/messaging/emitter/ResponseGroupEventProcessor", "processEmittedGroupEventFor", 54, "ResponseGroupEventProcessor.java")).q("ResponseGroupEventProcessor calling IncomingChatApi");
                    return ((waw) obj9).b.d((qey) optional.get());
                }
                ((alwl) waw.a.m().h("com/google/android/apps/messaging/shared/rcs/messaging/emitter/ResponseGroupEventProcessor", "processEmittedGroupEventFor", 57, "ResponseGroupEventProcessor.java")).q("ResponseGroupEventProcessor not calling IncomingChatApi");
                aozy createBuilder3 = qeg.a.createBuilder();
                qef qefVar = qef.OK;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                qeg qegVar = (qeg) createBuilder3.b;
                qegVar.c = qefVar.f;
                qegVar.b |= 1;
                return aktp.ag((qeg) createBuilder3.s());
            case 19:
                TimeoutException timeoutException = (TimeoutException) obj;
                if (aczf.v()) {
                    ((wba) this.a).f.b.c("Bugle.MessagingService.GetMessages.Binder.OnDemand.Connect.Timeout.Count");
                }
                return aktp.af(timeoutException);
            default:
                Set set = (Set) obj;
                Object obj10 = this.a;
                wgd wgdVar = (wgd) obj10;
                if (((okr) wgdVar.i.b()).a() && set.size() > 1) {
                    return aktp.ag(Optional.empty());
                }
                return wgdVar.h.e(wwm.a).i(new wgb(obj10, i5), wgdVar.e);
        }
    }
}
