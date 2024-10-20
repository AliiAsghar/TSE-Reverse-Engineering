package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers.VerifiedSmsRemoteVerificationWork;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ukk implements ancs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ukk(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v121, types: [vgb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v126, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v135, types: [vhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v148, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v171, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v46, types: [algk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v78, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.function.BiFunction, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v31, types: [vgq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v36, types: [vgq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v76, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r6v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v32, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        boolean c;
        Object apply;
        int i = 11;
        int i2 = 9;
        int i3 = 4;
        int i4 = 2;
        int i5 = 0;
        byte[] bArr = null;
        switch (this.d) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                Object obj2 = this.b;
                if (arrayList != null && !arrayList.isEmpty()) {
                    ?? r5 = this.c;
                    Object obj3 = this.a;
                    xyo d = ukl.b.d();
                    d.H(arrayList.size() + " annotations generated for message: ");
                    d.H(obj2);
                    d.q();
                    ukl uklVar = (ukl) obj3;
                    if (((ple) uklVar.e.b()).a() && yhq.a(r5.B()).b().isEmpty() && Collection.EL.stream(arrayList).anyMatch(new trt(i))) {
                        ((alwl) ((alwl) ukl.a.g()).h("com/google/android/apps/messaging/shared/datamodel/worker/AnnotationWorker", "processInternal", 133, "AnnotationWorker.java")).q("Refreshing notifications for OTP");
                        ((wpp) uklVar.f.b()).J();
                    }
                    if (((Boolean) ((utz) yig.W.get()).e()).booleanValue()) {
                        c = ((yhq) uklVar.c.b()).b(r5.z(), r5.B(), arrayList);
                    } else {
                        c = ((yhq) uklVar.c.b()).c(r5.z(), r5.B(), arrayList);
                    }
                    if (!c) {
                        xyo c2 = ukl.b.c();
                        c2.H("Setting message annotations failed: ");
                        c2.H(obj2);
                        c2.q();
                        return aktp.ag(false);
                    }
                    agnw agnwVar = (agnw) uklVar.d.b();
                    if (xwj.d(arrayList)) {
                        agnwVar.z(rzx.f(4, r5.B().a()));
                    }
                    int size = arrayList.size();
                    while (true) {
                        if (i5 < size) {
                            aqby aqbyVar = (aqby) arrayList.get(i5);
                            int g = aqas.g(aqbyVar.d);
                            if (g != 0 && g == 4 && aqbyVar.b == 8) {
                                agnwVar.z(rzx.f(8, r5.B().a()));
                            } else {
                                i5++;
                            }
                        }
                    }
                    return aktp.ag(true);
                }
                xyo d2 = ukl.b.d();
                d2.H("No annotation generated for message: ");
                d2.H(obj2);
                d2.q();
                return aktp.ag(true);
            case 1:
                anlx anlxVar = (anlx) obj;
                anlxVar.getClass();
                aozy builder = anlxVar.toBuilder();
                anmq y = vjs.y();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                Object obj4 = this.a;
                anlx anlxVar2 = (anlx) builder.b;
                y.getClass();
                anlxVar2.c = y;
                anlxVar2.b |= 1;
                anlx anlxVar3 = (anlx) builder.s();
                VerifiedSmsRemoteVerificationWork verifiedSmsRemoteVerificationWork = (VerifiedSmsRemoteVerificationWork) obj4;
                anmd anmdVar = (anmd) ((vdm) verifiedSmsRemoteVerificationWork.i.a).a().h(((Long) vcv.h.e()).longValue(), TimeUnit.MILLISECONDS);
                aqrs aqrsVar = anmdVar.a;
                aqux aquxVar = anme.b;
                if (aquxVar == null) {
                    synchronized (anme.class) {
                        aquxVar = anme.b;
                        if (aquxVar == null) {
                            aquu a = aqux.a();
                            a.e = aquw.UNARY;
                            a.a = aqux.c("google.communications.verifiedsms.v1.MessageVerificationService", "GetMessageVerificationData");
                            a.b();
                            anlx anlxVar4 = anlx.a;
                            aozs aozsVar = arkx.a;
                            a.c = new arkw(anlxVar4);
                            a.d = new arkw(anly.a);
                            aquxVar = a.a();
                            anme.b = aquxVar;
                        }
                    }
                }
                Object obj5 = this.b;
                return akul.g(arlj.a(aqrsVar.a(aquxVar, anmdVar.b), anlxVar3)).h(new tul(obj4, obj5, this.c, 5), verifiedSmsRemoteVerificationWork.e).f(Throwable.class, new qbt(obj4, obj5, (Object) anlxVar, 20, (byte[]) null), verifiedSmsRemoteVerificationWork.e);
            case 2:
                Object obj6 = this.c;
                Object obj7 = this.b;
                Object obj8 = this.a;
                return aktp.ai(new rbn(obj8, (ConversationIdType) obj6, obj7, i2), ((ulw) obj8).g);
            case 3:
                apply = this.b.apply(this.c, this.a);
                return (ListenableFuture) apply;
            case 4:
                return ((uvf) this.c).a(this.a, (aqfn) this.b, "Failed to bind in response to tickle after pulling", "Bugle.Fcm.Phone.BindAfterPull.Failure.Count");
            case 5:
                return ((uvx) ((uwc) this.a).f.get(this.c)).c((alog) this.b);
            case 6:
                vee veeVar = (vee) obj;
                int i6 = veeVar.r;
                if (((Boolean) vbq.b.e()).booleanValue()) {
                    ?? r3 = this.b;
                    if (!TextUtils.isEmpty(r3) && !TextUtils.equals(veeVar.p, r3)) {
                        Object obj9 = this.a;
                        alvw g2 = vbq.a.g();
                        g2.X(alwp.a, "BugleNetwork");
                        ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "checkRetryBackoffIfNeeded", 320, "PhoneRegistrationProvider.java")).r("New RCS token, skips back-off. retryCount: %d", i6);
                        return ((vel) obj9).g();
                    }
                }
                long j = veeVar.q;
                if (i6 != 0) {
                    long epochMilli = ((vbq) this.c).q.f().toEpochMilli();
                    if (epochMilli >= j) {
                        long longValue = ((long) (((Long) vbq.c.e()).longValue() * Math.pow(((Double) vbq.d.e()).doubleValue(), Math.min(i6 - 1, ((Integer) vbq.e.e()).intValue())))) + j;
                        if (epochMilli < longValue) {
                            alvw i7 = vbq.a.i();
                            i7.X(alwp.a, "BugleNetwork");
                            alvg alvgVar = (alvg) i7;
                            alvgVar.Z(alwk.MEDIUM);
                            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "isTimeToRetry", 351, "PhoneRegistrationProvider.java")).K("Registration throttled due to consecutive OTP failure. current: %d, retryCount:%d, lastTimestamp: %d, earliestTimeToRetry:%d", Long.valueOf(epochMilli), Integer.valueOf(i6), Long.valueOf(j), Long.valueOf(longValue));
                            return aktp.af(new aqwb(Status.k.d(new vbp())));
                        }
                    }
                }
                return aktp.ag(null);
            case 7:
                aozy S = ((vcc) this.c).g.S((String) this.b);
                aozb aozbVar = ((aqfg) obj).b;
                if (!S.b.isMutable()) {
                    S.u();
                }
                ?? r32 = this.a;
                aqgb aqgbVar = (aqgb) S.b;
                aqgb aqgbVar2 = aqgb.a;
                aozbVar.getClass();
                aqgbVar.e = aozbVar;
                return r32.c((aqgb) S.s());
            case 8:
                aozy S2 = ((vcf) this.c).e.S((String) this.b);
                aozb aozbVar2 = ((aqfg) obj).b;
                if (!S2.b.isMutable()) {
                    S2.u();
                }
                ?? r33 = this.a;
                aqgb aqgbVar3 = (aqgb) S2.b;
                aqgb aqgbVar4 = aqgb.a;
                aozbVar2.getClass();
                aqgbVar3.e = aozbVar2;
                return r33.c((aqgb) S2.s());
            case 9:
                Boolean bool = (Boolean) obj;
                Object obj10 = this.a;
                ahmv ahmvVar = (ahmv) obj10;
                if (((okg) ahmvVar.f.b()).a()) {
                    Optional optional = ((ven) this.c).a;
                } else {
                    Optional.empty();
                }
                Object obj11 = this.b;
                boolean booleanValue = bool.booleanValue();
                apax apaxVar = ((anfr) obj11).r;
                return aktp.ai(new ulo(obj10, apaxVar, 14), ahmvVar.i).i(new prn(obj10, booleanValue, apaxVar, i3), ahmvVar.a).h(new veg(obj11, i), ahmvVar.a);
            case 10:
                return ((vew) this.a).l((veo) this.c, (aqeq) this.b);
            case 11:
                return ((vew) this.a).l((veo) this.c, (aqeq) this.b);
            case 12:
                return ((vew) this.a).l((veo) this.c, (aqeq) this.b);
            case 13:
                vfa vfaVar = (vfa) this.a;
                String h = vfaVar.k().h(((Boolean) new mst(20).get()).booleanValue());
                h.getClass();
                aozy cJ = yyb.cJ();
                if (!cJ.b.isMutable()) {
                    cJ.u();
                }
                aqfn aqfnVar = (aqfn) cJ.b;
                aqfn aqfnVar2 = aqfn.a;
                aqfnVar.c = h;
                asku askuVar = asku.PHONE_NUMBER;
                if (!cJ.b.isMutable()) {
                    cJ.u();
                }
                Object obj12 = this.c;
                ((aqfn) cJ.b).b = askuVar.a();
                aqfn aqfnVar3 = (aqfn) cJ.s();
                wpp wppVar = vfaVar.g;
                vdd vddVar = vfa.b;
                aqar a2 = ((veo) obj12).b(aqfnVar3).a();
                aqrs aqrsVar2 = a2.a;
                aqux aquxVar2 = aqas.a;
                if (aquxVar2 == null) {
                    synchronized (aqas.class) {
                        aquxVar2 = aqas.a;
                        if (aquxVar2 == null) {
                            aquu a3 = aqux.a();
                            a3.e = aquw.UNARY;
                            a3.a = aqux.c("google.internal.communications.instantmessaging.v1.Registration", "Register");
                            a3.b();
                            aqes aqesVar = aqes.a;
                            aozs aozsVar2 = arkx.a;
                            a3.c = new arkw(aqesVar);
                            a3.d = new arkw(aqet.a);
                            aquxVar2 = a3.a();
                            aqas.a = aquxVar2;
                        }
                    }
                }
                return wppVar.Q(vddVar, akul.g(arlj.a(aqrsVar2.a(aquxVar2, a2.b), this.b)));
            case 14:
                ((psq) ((vgc) this.b).b.b()).a(this.c.n(), false);
                return this.a.a();
            case 15:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                Object obj13 = this.b;
                if (!booleanValue2) {
                    vgc.a.l("Tachygram not available. Do not decorate RegisterData with RCS capabilities");
                    return aktp.ag(obj13);
                }
                return ((vgc) this.a).b((aozy) obj13, this.c);
            case 16:
                Boolean bool2 = (Boolean) obj;
                Object obj14 = this.b;
                Object obj15 = this.a;
                if (bool2 != null && bool2.booleanValue()) {
                    vic vicVar = (vic) obj15;
                    amme ammeVar = (amme) obj14;
                    vicVar.M(ammeVar, this.c);
                    wor worVar = (wor) vicVar.b.b();
                    return akul.g(((aiwu) worVar.d.a).b(new tti(ammeVar.name(), worVar.b.f().toEpochMilli(), i4), andi.a));
                }
                ((vic) obj15).R(7, (amme) obj14);
                return aktp.ag(null);
            case 17:
                if (Boolean.FALSE.equals((Boolean) obj)) {
                    Object obj16 = this.a;
                    alwl alwlVar = (alwl) vka.a.g();
                    alwlVar.X(vjh.n, ((vkh) obj16).d());
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "notify", 524, "CreateNotificationHandler.java")).q("showShow=false, not creating notification");
                    return aktp.ag(new ArrayList());
                }
                ?? r0 = this.b;
                Object obj17 = this.c;
                return aktp.ao(r0).h(new rbn(obj17, (Object) r0, new ArrayList(), 12), ((vka) obj17).c);
            case 18:
                List list = (List) obj;
                vlm d3 = ((vkh) this.a).d();
                vka vkaVar = (vka) this.c;
                vkp vkpVar = (vkp) vkaVar.h.get(vlm.NT_DIRECTOR);
                vkpVar.getClass();
                akul b = vkpVar.b(list);
                Map map = vkaVar.h;
                akul ag = aktp.ag(null);
                if (map.containsKey(d3)) {
                    vkp vkpVar2 = (vkp) vkaVar.h.get(d3);
                    vkpVar2.getClass();
                    ag = vkpVar2.b(list);
                }
                return aktp.ap(b, ag).h(new vib(this.b, 3), andi.a);
            case 19:
                dzj dzjVar = new dzj((dzv) obj);
                Optional optional2 = (Optional) this.b;
                boolean isPresent = optional2.isPresent();
                Object obj18 = this.c;
                if (isPresent) {
                    dzjVar.g(((vjy) optional2.get()).e);
                    if (((vjy) optional2.get()).e) {
                        dzjVar.b = ((vjy) optional2.get()).d;
                    }
                } else {
                    vli vliVar = (vli) obj18;
                    dzjVar.g(((Boolean) vliVar.m.get()).booleanValue());
                    if (((Boolean) vliVar.m.get()).booleanValue()) {
                        dzjVar.b = vliVar.l.get();
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = ((vli) obj18).j.get().iterator();
                while (true) {
                    Object obj19 = this.a;
                    if (it.hasNext()) {
                        vle vleVar = (vle) it.next();
                        Optional optional3 = vleVar.a;
                        akul ag2 = aktp.ag(null);
                        if (optional3.isPresent()) {
                            vlq vlqVar = (vlq) vleVar.a.get();
                            ag2 = ((vlk) obj19).a(vlqVar.a, vlqVar.b, (Uri) vlqVar.c.orElse(null));
                        }
                        arrayList2.add(ag2.h(new vgd(vleVar, 6), ((vlk) obj19).d));
                    } else {
                        return aktp.ao(arrayList2).h(new ulo(arrayList2, dzjVar, 19, bArr), ((vlk) obj19).d);
                    }
                }
            default:
                vuv vuvVar = (vuv) this.a;
                Optional of = Optional.of(vuvVar.h);
                String uuid = UUID.randomUUID().toString();
                xyo a4 = qax.a.a();
                a4.H("Starting update group operation for subject change");
                a4.z("operationId", uuid);
                a4.q();
                uuid.getClass();
                qax qaxVar = vuvVar.b;
                vti.n(qaxVar.d, 22, 0, uuid, null, null, null, 58);
                return akul.g(d.m(new ahir(qaxVar, uuid, (qfb) obj, of, (String) this.b, 1))).j(vuvVar.d.a().toMillis(), TimeUnit.MILLISECONDS, vuvVar.e).h(new vsw(i2), vuvVar.e).e(TimeoutException.class, new vuu(this.c, i4), vuvVar.e);
        }
    }

    public /* synthetic */ ukk(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ ukk(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ ukk(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ ukk(Object obj, String str, Object obj2, int i) {
        this.d = i;
        this.c = obj;
        this.b = str;
        this.a = obj2;
    }
}
