package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.rcsprovisioning.RcsProvisioningListenableWorker;
import com.google.android.apps.messaging.shared.receiver.DefaultSmsPackageChangedReceiver;
import com.google.android.apps.messaging.shared.receiver.RcsProvisioningEventReceiver;
import j$.util.Optional;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uql implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ uql(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Object, anen] */
    /* JADX WARN: Type inference failed for: r2v54, types: [adkc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v58, types: [xyt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object, wwn] */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.Object, vau] */
    /* JADX WARN: Type inference failed for: r2v67, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v68, types: [arpi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v69, types: [java.lang.Object, anen] */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.lang.Object, acjj] */
    /* JADX WARN: Type inference failed for: r2v71, types: [java.lang.Object, aegu] */
    /* JADX WARN: Type inference failed for: r2v82, types: [xyt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v37, types: [alhr, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        akrc b;
        alpt o;
        LinkedHashMap linkedHashMap;
        int i = 1;
        switch (this.b) {
            case 0:
                ((arxw) this.a).T(arnb.a);
                return;
            case 1:
                ((arxw) this.a).T(arnb.a);
                return;
            case 2:
                utq utqVar = (utq) this.a;
                utqVar.b.b();
                ((uuc) utqVar.c.b()).a();
                ((vqu) utqVar.a.b()).u();
                return;
            case 3:
                uvv uvvVar = (uvv) this.a;
                if (uvvVar.b.isPresent() && !((pqg) uvvVar.c.b()).a()) {
                    return;
                }
                uvvVar.a.b();
                return;
            case 4:
                xyo a = vbu.a.a();
                a.H("Initializing subscription map with value for self identity.");
                a.q();
                Object obj = this.a;
                vbu vbuVar = (vbu) obj;
                vbuVar.g = ((yyt) vbuVar.c.b()).Q(vqk.n);
                Optional o2 = ((vqu) vbuVar.b.b()).o();
                if (vbu.g(o2).isEmpty()) {
                    o2 = vbuVar.j(((yyt) vbuVar.c.b()).Q(vqk.o), true);
                }
                vbu.g(o2).ifPresent(new rge(obj, o2, 15));
                vbuVar.h.set(null);
                return;
            case 5:
                ((vfv) this.a).k();
                return;
            case 6:
                Object obj2 = this.a;
                b = ((vfv) obj2).h.b("BindHandlerImpl#checkMessageIdsAndPull");
                try {
                    synchronized (((vfv) obj2).m) {
                        o = alpt.o(((vfv) obj2).r);
                        ((vfv) obj2).r = new HashSet();
                    }
                    if (o.isEmpty()) {
                        alvw g = vfv.c.g();
                        g.X(alwp.a, "BugleNetwork");
                        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "checkMessageIdsAndPull", 284, "BindHandlerImpl.java")).q("checkMessageIdsAndPull called without any msg ID, potentially a bug");
                        ((vfv) obj2).f();
                    } else {
                        alvw d = vfv.c.d();
                        d.X(alwp.a, "BugleNetwork");
                        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "checkMessageIdsAndPull", 289, "BindHandlerImpl.java")).B("%s BindHandler: Checking if %d tickled messages have all been received.", akec.aD(((vfv) obj2).E), o.size());
                        vgt vgtVar = ((vfv) obj2).D;
                        synchronized (vgtVar.f) {
                            ul ulVar = vgtVar.f;
                            synchronized (ulVar.b) {
                                linkedHashMap = new LinkedHashMap(ulVar.a.n().size());
                                for (Map.Entry entry : ulVar.a.n()) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.keySet().containsAll(o)) {
                            alvw g2 = vfv.c.g();
                            g2.X(alwp.a, "BugleNetwork");
                            ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "checkMessageIdsAndPull", 294, "BindHandlerImpl.java")).t("%s BindHandler: All tickled message IDs have been received recently. Skip pulling.", akec.aD(((vfv) obj2).E));
                            ((vfv) obj2).f();
                            ((mbl) ((vfv) obj2).v.b()).e("Bugle.Ditto.Binding.TicklePulling.Counts", 2);
                        } else {
                            ((mbl) ((vfv) obj2).v.b()).e("Bugle.Ditto.Binding.TicklePulling.Counts", 3);
                            alvw g3 = vfv.c.g();
                            g3.X(alwp.a, "BugleNetwork");
                            ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "checkMessageIdsAndPull", 309, "BindHandlerImpl.java")).t("%s BindHandler: Initiate a pull because some tickled IDs haven't been seen", akec.aD(((vfv) obj2).E));
                            ((vgk) ((vfv) obj2).z.get().get()).a().e(Exception.class, new veg(obj2, 20), ((vfv) obj2).w).h(new vgd(obj2, i), ((vfv) obj2).w);
                        }
                    }
                    b.close();
                    return;
                } finally {
                }
            case 7:
                Object obj3 = this.a;
                b = ((vfv) obj3).h.b("BindHandlerImpl#triggerRetryTimeout");
                try {
                    alvw g4 = vfv.c.g();
                    g4.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) g4).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "triggerRetryTimeout", 624, "BindHandlerImpl.java")).t("%s BindHandler: Binding retry timeout triggered", akec.aD(((vfv) obj3).E));
                    synchronized (((vfv) obj3).m) {
                        ((vfv) obj3).n = null;
                    }
                    ((vfv) obj3).e(false);
                    b.close();
                    return;
                } finally {
                }
            case 8:
                Object obj4 = this.a;
                synchronized (((vfv) obj4).m) {
                    alvw i2 = vfv.c.i();
                    i2.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "triggerBindingWatchdog", 504, "BindHandlerImpl.java")).t("%s BindHandler: BindingWatchdog triggered.", akec.aD(((vfv) obj4).E));
                    ((vfv) obj4).p = null;
                    vfu vfuVar = ((vfv) obj4).l;
                    if (vfuVar != null && vfuVar.a != null) {
                        alvw g5 = vfv.c.g();
                        g5.X(alwp.a, "BugleNetwork");
                        ((alvg) ((alvg) g5).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$ReceiveMessagesResponseObserver", "watchdogTimeout", 705, "BindHandlerImpl.java")).t("%s BindHandler: Cancelling stream due to pong timeout, will trigger onError and may retry", akec.aD(vfuVar.c.E));
                        vfuVar.a.d("Watchdog triggered", new vft());
                    }
                }
                return;
            case 9:
                ((via) ((vjt) this.a).a.b()).y();
                return;
            case 10:
                Object obj5 = this.a;
                RcsProvisioningListenableWorker rcsProvisioningListenableWorker = (RcsProvisioningListenableWorker) obj5;
                if (rcsProvisioningListenableWorker.q) {
                    wxb wxbVar = (wxb) rcsProvisioningListenableWorker.o.j((adiv) rcsProvisioningListenableWorker.p.orElseThrow()).orElse(null);
                    if (wxbVar == null) {
                        ((alwl) ((alwl) RcsProvisioningListenableWorker.e.i()).h("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningListenableWorker", "logw", 666, "RcsProvisioningListenableWorker.java")).J("[seqId=%s][workId=%s] %s", rcsProvisioningListenableWorker.i, rcsProvisioningListenableWorker.k, RcsProvisioningListenableWorker.c("Cannot start provisioning engine. Unable to obtain sim info for sim id: %s", new Object[]{rcsProvisioningListenableWorker.p.orElseThrow()}));
                        return;
                    }
                    adoi adoiVar = rcsProvisioningListenableWorker.u;
                    boolean z = rcsProvisioningListenableWorker.q;
                    okr okrVar = rcsProvisioningListenableWorker.r;
                    pcl pclVar = rcsProvisioningListenableWorker.s;
                    boolean a2 = okrVar.a();
                    boolean a3 = pclVar.a();
                    Optional of = Optional.of(wxbVar);
                    Context context = (Context) adoiVar.D;
                    acnz acnzVar = (acnz) adoiVar.K;
                    adly adlyVar = (adly) adoiVar.P;
                    Optional optional = (Optional) adoiVar.t;
                    adks adksVar = (adks) adoiVar.R;
                    adlx adlxVar = (adlx) adoiVar.N;
                    adtl adtlVar = (adtl) adoiVar.M;
                    adko adkoVar = (adko) adoiVar.r;
                    Optional optional2 = (Optional) adoiVar.J;
                    adnk adnkVar = (adnk) adoiVar.B;
                    adnt adntVar = (adnt) adoiVar.x;
                    ?? r2 = adoiVar.Q;
                    yjr yjrVar = (yjr) adoiVar.F;
                    adnv adnvVar = (adnv) adoiVar.G;
                    abqa abqaVar = (abqa) adoiVar.n;
                    yjy yjyVar = (yjy) adoiVar.S;
                    adtl adtlVar2 = (adtl) adoiVar.u;
                    ?? r22 = adoiVar.H;
                    adih adihVar = (adih) adoiVar.O;
                    adea adeaVar = (adea) adoiVar.A;
                    adaw adawVar = (adaw) adoiVar.T;
                    ?? r23 = adoiVar.I;
                    Optional optional3 = (Optional) adoiVar.C;
                    adki adkiVar = (adki) adoiVar.p;
                    adkn adknVar = (adkn) adoiVar.q;
                    adih adihVar2 = (adih) adoiVar.E;
                    ?? r24 = adoiVar.s;
                    adkd adkdVar = (adkd) adoiVar.v;
                    ?? r25 = adoiVar.o;
                    vjs vjsVar = (vjs) adoiVar.z;
                    ?? r26 = adoiVar.V;
                    ?? r27 = adoiVar.L;
                    ?? r28 = adoiVar.y;
                    ?? r29 = adoiVar.W;
                    ?? r210 = adoiVar.U;
                    armf armfVar = adoiVar.b;
                    armf armfVar2 = adoiVar.h;
                    armf armfVar3 = adoiVar.g;
                    armf armfVar4 = adoiVar.k;
                    rcsProvisioningListenableWorker.h = new adlw(context, acnzVar, adlyVar, optional, adksVar, adlxVar, adtlVar, adkoVar, optional2, adnkVar, adntVar, r2, yjrVar, adnvVar, abqaVar, yjyVar, adtlVar2, r22, adihVar, adeaVar, adawVar, r23, optional3, adkiVar, adknVar, adihVar2, z, of, r24, adkdVar, adoiVar.w, r25, vjsVar, r26, r27, r28, r29, r210, armfVar, armfVar3, adoiVar.f, adoiVar.l, adoiVar.a, a2, adoiVar.i, adoiVar.d, adoiVar.e, a3, armfVar2, armfVar4, adoiVar.j, adoiVar.m, adoiVar.c);
                } else {
                    rcsProvisioningListenableWorker.h = ((RcsProvisioningListenableWorker.a) akec.w(rcsProvisioningListenableWorker.f, RcsProvisioningListenableWorker.a.class)).gR();
                }
                adlw adlwVar = rcsProvisioningListenableWorker.h;
                adlwVar.getClass();
                adlwVar.K = Optional.of(obj5);
                adlw adlwVar2 = rcsProvisioningListenableWorker.h;
                amww amwwVar = rcsProvisioningListenableWorker.j;
                adlwVar2.ab = amwwVar;
                adlwVar2.ac = rcsProvisioningListenableWorker.k;
                rcsProvisioningListenableWorker.m("Starting StateMachine, trigger is %s", amwwVar.name());
                adlw adlwVar3 = rcsProvisioningListenableWorker.h;
                adlwVar3.getClass();
                adlwVar3.aa();
                return;
            case 11:
                ((vpq) ((wjw) this.a).a.b()).f();
                return;
            case 12:
                wkk wkkVar = (wkk) this.a;
                if (((pmi) wkkVar.s.b()).a()) {
                    return;
                }
                ((alwl) ((alwl) wkk.a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onGservicesUpdated", 1152, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onGservicesUpdated");
                wkkVar.w(vrk.GSERVICE_UPDATE);
                return;
            case 13:
                ((alwl) ((alwl) wkk.a.i()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onConfigSms", 1931, "RcsProvisioningTriggerImpl.java")).q("No sim id to register OTP SMS port. Using default port.");
                ((adnc) this.a).a();
                return;
            case 14:
                ((wnn) this.a).e();
                return;
            case 15:
                ((wzp) ((DefaultSmsPackageChangedReceiver) this.a).g.b()).k(amvm.SELECTED_DEFAULT_SMS_APP);
                return;
            case 16:
                ((vrn) ((xyt) ((RcsProvisioningEventReceiver) this.a).d.b()).a()).k();
                return;
            case 17:
                wnb wnbVar = (wnb) this.a;
                wnbVar.d = false;
                if (wnbVar.c) {
                    ((wpp) wnbVar.a.b()).v();
                    return;
                }
                return;
            case 18:
                wnb wnbVar2 = (wnb) this.a;
                wnbVar2.c = true;
                if (!wnbVar2.d) {
                    ((wpp) wnbVar2.a.b()).v();
                    return;
                }
                return;
            case 19:
                wnb wnbVar3 = (wnb) this.a;
                wnbVar3.c = false;
                if (!wnbVar3.d) {
                    ((wpp) wnbVar3.a.b()).u();
                    return;
                }
                return;
            default:
                wnb wnbVar4 = (wnb) this.a;
                wnbVar4.d = true;
                if (wnbVar4.c) {
                    ((wpp) wnbVar4.a.b()).u();
                    return;
                }
                return;
        }
    }
}
