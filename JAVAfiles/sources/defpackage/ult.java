package defpackage;

import j$.time.Duration;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ult implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ult(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r15v100, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v59, types: [mbl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v63, types: [mbl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v92, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v97, types: [armf, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        int i = 5;
        int i2 = 0;
        r3 = false;
        boolean z = false;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                ((ulu) this.a).a.n("Fail to clear session ids", (Throwable) obj);
                return upm.d();
            case 1:
                return new gsw((gsi) this.a);
            case 2:
                Long l = (Long) obj;
                long j = 0;
                if (l.longValue() > 0) {
                    umg umgVar = (umg) this.a;
                    long longValue = l.longValue() - umgVar.a.f().toEpochMilli();
                    if (longValue >= 0) {
                        j = longValue;
                    }
                    return upm.c(alog.r(upk.b("expire_wap_push_si_message", und.a, new uta(null, null, Duration.ofMillis(j), null, null, null))));
                }
                return upm.b();
            case 3:
                Exception exc = (Exception) obj;
                if (exc instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                Object obj2 = this.a;
                ((alwl) ((alwl) ((alwl) una.a.i()).g(exc)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/AndroidFuturesWrapperImpl", "attachForegroundService", 'x', "AndroidFuturesWrapperImpl.java")).q("AndroidFuturesWrapper unable to attach foreground service");
                ((mbl) ((una) obj2).b.b()).e("Bugle.AttachingAndroidFutureWrapper.Failure.Counts", umx.a(13));
                return null;
            case 4:
                alvw i3 = uqh.a.i();
                i3.X(alwp.a, "BugleWorkQueue");
                alvg alvgVar = (alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkManagerJanitorTask", "run", 127, "WorkQueueWorkManagerJanitorTask.java");
                Object obj3 = this.a;
                alvgVar.t("dropping work: %s", obj3);
                upw upwVar = new upw();
                upwVar.f("WorkQueueWorkManagerJanitorTask#run");
                upwVar.b(new uol(obj3, i));
                upwVar.d();
                return gtd.a;
            case 5:
                upv upvVar = (upv) obj;
                int count = upvVar.getCount();
                upvVar.da();
                Object obj4 = this.a;
                while (upvVar.moveToNext()) {
                    i2++;
                    try {
                        upr uprVar = (upr) upvVar.cK();
                        uqh uqhVar = (uqh) obj4;
                        uot uotVar = uqhVar.c;
                        synchronized (uotVar.d) {
                            uotVar.e.add(new uos(uotVar.b.f().toEpochMilli(), 5, uprVar));
                        }
                        aktp.aj(new imi(obj4, uprVar, 19, bArr), uqhVar.e).e(unr.class, new ult(uprVar, 4), uqhVar.d).k(qiu.b(), andi.a);
                    } catch (IllegalStateException unused) {
                        alvw i4 = uqh.a.i();
                        i4.X(alwp.a, "BugleWorkQueue");
                        ((alvg) ((alvg) i4).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkManagerJanitorTask", "run", 107, "WorkQueueWorkManagerJanitorTask.java")).u("breaking WorkQueueManagrJanitorTask loop for IllegalStateException: cursor count is : %d; current position is %d", count, i2);
                    }
                }
                upvVar.close();
                return 1;
            case 6:
                akrh e = aktp.e("PhenotypeHelper#onBuglePhenotypeChanged");
                try {
                    boolean booleanValue = ((Boolean) ((utz) utr.b.get()).e()).booleanValue();
                    Object obj5 = this.a;
                    if (!booleanValue) {
                        z = ((yjv) ((utr) obj5).e.b()).e();
                    } else if (((yjv) ((utr) obj5).e.b()).f() && egl.e(((utr) obj5).f, "android.permission.READ_PHONE_STATE") == 0) {
                        z = true;
                    }
                    for (utv utvVar : (Set) ((utr) obj5).d.get()) {
                        if (!utvVar.fN() || z) {
                            utvVar.a();
                        }
                    }
                    e.close();
                    return null;
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 7:
                if (((acir) obj).l()) {
                    ((utr) this.a).b();
                } else {
                    ((alwl) ((alwl) utr.a.i()).h("com/google/android/apps/messaging/shared/experiments/BuglePhenotypeHelper", "registerPhenotype", 127, "BuglePhenotypeHelper.java")).q("Failure registering Phenotype client.");
                }
                return null;
            case 8:
                return ((uuv) this.a).d((aqfn) obj);
            case 9:
                aqfn aqfnVar = (aqfn) obj;
                vfw vfwVar = (vfw) ((uuv) this.a).a.get(aqfnVar.d);
                if (vfwVar == null) {
                    return aktp.af(new uuu(aqfnVar.d));
                }
                return vfwVar.a();
            case 10:
                ((wpp) this.a).c.c("Bugle.Fcm.Phone.Bind.Success.Count");
                return null;
            case 11:
                ((wpp) this.a).c.c("Bugle.Fcm.Phone.Pull.Success.Count");
                return null;
            case 12:
                Stream map = Collection.EL.stream((Set) obj).map(new unt(16)).map(new uuy(this.a, i2));
                int i5 = alog.d;
                return (alog) map.collect(alls.a);
            case 13:
                return ((wpp) this.a).ac((aqfn) obj);
            case 14:
                return ((wpp) this.a).ad((aqfn) obj);
            case 15:
                return ((uvd) this.a).a.ad((aqfn) obj);
            case 16:
                return ((uvd) this.a).a.ad((aqfn) obj);
            case 17:
                ((uwu) this.a).c();
                return null;
            case 18:
                ((uwu) this.a).c();
                return null;
            case 19:
                ((uwu) this.a).c();
                return null;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                Object obj6 = this.a;
                if (booleanValue2) {
                    zai zaiVar = (zai) obj6;
                    ((wpp) zaiVar.d.b()).ab(110, 2, ruy.a);
                    ((xze) zaiVar.a).q("The password of the user account was invalid, and the user has been onboarded to Lighter. Thus, cleaning up lighter.");
                    vjs vjsVar = (vjs) zaiVar.c.b();
                    aozy createBuilder = uyo.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    ((uyo) apagVar).b = true;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    ((uyo) createBuilder.b).d = true;
                    ((uof) vjsVar.a.b()).b(upk.b("lighter_clean_up", (uyo) createBuilder.s(), new uta(null, "lighter_clean_up_handler", null, null, null, null)));
                } else {
                    ((xze) ((zai) obj6).a).l("No lighter cleanup operation is required since the user hasn't onboarded yet.");
                }
                return true;
        }
    }
}
