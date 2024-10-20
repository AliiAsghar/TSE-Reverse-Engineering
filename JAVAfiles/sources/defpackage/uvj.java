package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.receiver.DefaultSmsPackageChangedReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uvj implements ancr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ uvj(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v85, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v91, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.ancr
    public final ListenableFuture a() {
        Executor executor;
        int i = 13;
        int i2 = 19;
        int i3 = 9;
        int i4 = 15;
        int i5 = 0;
        byte[] bArr = null;
        switch (this.c) {
            case 0:
                uvk uvkVar = (uvk) this.a;
                boolean booleanValue = ((Boolean) uvkVar.h.b()).booleanValue();
                Object obj = this.b;
                if (booleanValue) {
                    ((alwl) ((alwl) ((alwl) uvk.d.g()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "sendSilentFeedback", 'G', "SilentFeedbackManagerImpl.java")).q("SilentFeedbackManager: Sending silent feedback");
                    return aktp.ag(null);
                }
                ((alwl) ((alwl) ((alwl) uvk.d.g()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "sendSilentFeedback", 'M', "SilentFeedbackManagerImpl.java")).q("SilentFeedbackManager: SilentFeedback is disabled. Not uploading");
                return aktp.ag(null);
            case 1:
                Object obj2 = this.b;
                Object obj3 = this.a;
                akrh e = aktp.e("enqueueScheduleOrDeleteRow#launchToWorkManager");
                try {
                    akul b = ((uqh) obj2).b.b((upr) obj3);
                    e.b(b);
                    e.close();
                    return b;
                } finally {
                }
            case 2:
                return aktp.ai(new uvp(this.b, 7), ((uzv) this.a).d);
            case 3:
                return ((uzv) this.a).j(rvc.c(((uzw) this.b).c));
            case 4:
                alog alogVar = (alog) albo.bQ(this.a);
                if (alogVar != null) {
                    alog alogVar2 = (alog) albo.bQ(this.b);
                    if (alogVar2 != null) {
                        return aktp.ag(new uzu(alogVar, alogVar2));
                    }
                    throw new NullPointerException("Null cloudSyncMessagesToDelete");
                }
                throw new NullPointerException("Null nonCloudSyncMessagesToDelete");
            case 5:
                Object obj4 = this.a;
                return ((vcj) this.b).d(Optional.of(obj4));
            case 6:
                via viaVar = (via) ((vjq) this.a).a.b();
                ?? r2 = this.b;
                Collection.EL.stream(r2).allMatch(new uzr(16));
                Collection.EL.stream(r2).allMatch(new uzr(i4));
                Collection.EL.stream(r2).noneMatch(new uzr(14));
                return viaVar.G();
            case 7:
                ((ajnv) this.a).disconnect();
                return this.b;
            case 8:
                ((ajnv) this.a).disconnect();
                return this.b;
            case 9:
                Object obj5 = this.a;
                vtq vtqVar = ((vtr) this.b).d;
                return aktp.ai(new vmb(vtqVar, obj5, i3, bArr), vtqVar.b);
            case 10:
                return ((vyd) this.b).v.c(this.a);
            case 11:
                return ((psz) ((vyd) this.b).k.b()).b(this.a);
            case 12:
                return ((wet) this.b).g.c(this.a);
            case 13:
                alob alobVar = new alob();
                alob alobVar2 = new alob();
                alob alobVar3 = new alob();
                ?? r4 = this.b;
                int size = r4.size();
                while (true) {
                    Object obj6 = this.a;
                    if (i5 < size) {
                        sqf sqfVar = (sqf) r4.get(i5);
                        MessageIdType h = sqfVar.h();
                        wjm wjmVar = (wjm) obj6;
                        MessageCoreData q = ((rwd) wjmVar.f.b()).q(h);
                        if (q != null && q.cI() && !q.cs() && !rvx.l(q.j()) && q.q() >= wjmVar.c.f().toEpochMilli() - Duration.ofDays(((Long) wjmVar.j.b()).longValue()).toMillis()) {
                            alobVar.h(sqfVar);
                            alobVar2.h(q);
                        } else {
                            alobVar3.h(h);
                        }
                        i5++;
                    } else {
                        wjm wjmVar2 = (wjm) obj6;
                        wjmVar2.f(alobVar3.g());
                        return aktp.ad(((ncv) wjmVar2.h.b()).c(alobVar2.g(), amfd.DELIVERY_MESSAGE_TIMEOUT)).i(new vfj(obj6, alobVar.g(), 20, bArr), wjmVar2.i);
                    }
                }
                break;
            case 14:
                return ((ncv) ((wjn) this.b).g.b()).a(this.a, amfd.SEND_MESSAGE_TIMEOUT_AUTO_FALLBACK);
            case 15:
                alob alobVar4 = new alob();
                alob alobVar5 = new alob();
                ?? r5 = this.b;
                int size2 = r5.size();
                while (true) {
                    Object obj7 = this.a;
                    if (i5 < size2) {
                        sqf sqfVar2 = (sqf) r5.get(i5);
                        MessageCoreData q2 = ((rwd) ((wjn) obj7).e.b()).q(sqfVar2.h());
                        if (q2 != null && rvx.p(q2.j())) {
                            alobVar5.h(q2);
                        } else {
                            alobVar4.h(sqfVar2.h());
                        }
                        i5++;
                    } else {
                        return aktp.ak((Iterable) Collection.EL.stream(alobVar5.g()).map(new vxg(obj7, i2)).collect(alls.a)).i(new vwx(obj7, (Object) alobVar4, (Object) r5, 4, (byte[]) null), ((wjn) obj7).d);
                    }
                }
                break;
            case 16:
                Object obj8 = this.a;
                if (obj8 == null) {
                    return aktp.ag(null);
                }
                Intent intent = (Intent) obj8;
                String action = intent.getAction();
                xyo a = DefaultSmsPackageChangedReceiver.a.a();
                a.H("onReceive");
                a.H(obj8);
                a.q();
                ArrayList arrayList = new ArrayList();
                if ("android.provider.action.DEFAULT_SMS_PACKAGE_CHANGED".equals(action)) {
                    Object obj9 = this.b;
                    DefaultSmsPackageChangedReceiver defaultSmsPackageChangedReceiver = (DefaultSmsPackageChangedReceiver) obj9;
                    ((yjv) ((yjr) defaultSmsPackageChangedReceiver.e.b()).e.b()).c();
                    boolean booleanExtra = intent.getBooleanExtra("android.provider.extra.IS_DEFAULT_SMS_APP", false);
                    if (booleanExtra) {
                        DefaultSmsPackageChangedReceiver.a.o("default sms set, forceFullSync");
                        if (((yjf) defaultSmsPackageChangedReceiver.d.b()).h()) {
                            qiu.h(((xcj) defaultSmsPackageChangedReceiver.c.b()).d());
                        }
                        arrayList.add(aktp.ah(new uql(obj9, i4), defaultSmsPackageChangedReceiver.k));
                    } else {
                        ((mbl) defaultSmsPackageChangedReceiver.o.b()).e("Bugle.DefaultSmsChanged.State.Counts", 1);
                        ((lpg) defaultSmsPackageChangedReceiver.h.b()).D(umw.a, new uta(null, "update_unread_counter_dedupe", null, null, null, null));
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("com.google.android.ims.provisioning.engine.bugle_default_sms_app", booleanExtra);
                    ((vqu) defaultSmsPackageChangedReceiver.f.b()).S(bundle);
                    hwm hwmVar = new hwm(obj9, booleanExtra, 6, bArr);
                    if (((Boolean) ((utz) DefaultSmsPackageChangedReceiver.b.get()).e()).booleanValue()) {
                        executor = defaultSmsPackageChangedReceiver.k;
                    } else {
                        executor = defaultSmsPackageChangedReceiver.j;
                    }
                    arrayList.add(aktp.ah(hwmVar, executor));
                    Iterator it = ((Set) defaultSmsPackageChangedReceiver.n.b()).iterator();
                    while (it.hasNext()) {
                        arrayList.add(((wnv) it.next()).d(booleanExtra));
                    }
                }
                return aktp.am(arrayList).h(new vcr(13), andi.a);
            case 17:
                ?? r0 = this.a;
                Object obj10 = this.b;
                uvj uvjVar = new uvj(obj10, r0, i2, bArr);
                xdq xdqVar = (xdq) obj10;
                return xdqVar.b(uvjVar, "Failed to get Rcs Capabilities from tachygram library.", 31, r0).h(new wxv(obj10, 17), xdqVar.f).h(new whh(obj10, r0, 12), xdqVar.f).h(new whh(obj10, r0, i), xdqVar.f);
            case 18:
                ?? r02 = this.a;
                Object obj11 = this.b;
                return ((xdq) obj11).l.T(xdq.a(r02));
            case 19:
                ?? r03 = this.a;
                Object obj12 = this.b;
                return ((xdq) obj12).l.U(xdq.a(r03));
            default:
                anjw anjwVar = (anjw) albo.bQ(this.a);
                znj znjVar = (znj) albo.bQ(this.b);
                anjwVar.getClass();
                return qjh.j(znjVar.b, new wwh(znjVar, anjwVar, (arpe) null, 9));
        }
    }

    public /* synthetic */ uvj(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
