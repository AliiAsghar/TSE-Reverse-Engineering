package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.android.ex.photo.views.PhotoView;
import com.google.android.material.snackbar.Snackbar;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gtq implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gtq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [hwb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, arxm] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, ila] */
    @Override // java.lang.Runnable
    public final void run() {
        float min;
        float min2;
        boolean z;
        int i = 1;
        switch (this.b) {
            case 0:
                ((AtomicBoolean) this.a).set(true);
                return;
            case 1:
                ?? r0 = this.a;
                if (r0 != 0) {
                    r0.v(null);
                    return;
                }
                return;
            case 2:
                gvy gvyVar = (gvy) this.a;
                int i2 = gvyVar.f;
                String str = gvyVar.d.a;
                if (i2 < 2) {
                    gvyVar.f = 2;
                    gsy.a().c(gvy.a, "Stopping work for WorkSpec ".concat(str));
                    Context context = gvyVar.b;
                    gyg gygVar = gvyVar.d;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    gvw.f(intent, gygVar);
                    gvyVar.h.execute(new gwa(gvyVar.e, intent, gvyVar.c, 0));
                    if (gvyVar.e.d.c(gvyVar.d.a)) {
                        gsy.a().c(gvy.a, a.bW(str, "WorkSpec ", " needs to be rescheduled"));
                        gvyVar.h.execute(new gwa(gvyVar.e, gvw.d(gvyVar.b, gvyVar.d), gvyVar.c, 0));
                        return;
                    }
                    gsy.a().c(gvy.a, a.bW(str, "Processor does not have WorkSpec ", ". No need to reschedule"));
                    return;
                }
                gsy.a().c(gvy.a, "Already stopped work for ".concat(str));
                return;
            case 3:
                Object obj = this.a;
                gvy gvyVar2 = (gvy) obj;
                if (gvyVar2.f == 0) {
                    gvyVar2.f = 1;
                    gsy a = gsy.a();
                    String str2 = gvy.a;
                    gyg gygVar2 = gvyVar2.d;
                    Objects.toString(gygVar2);
                    a.c(str2, "onAllConstraintsMet for ".concat(gygVar2.toString()));
                    if (gvyVar2.e.d.g(gvyVar2.n, null)) {
                        gwd gwdVar = gvyVar2.e;
                        gyg gygVar3 = gvyVar2.d;
                        hag hagVar = gwdVar.c;
                        synchronized (hagVar.e) {
                            gsy.a().c(hag.a, a.ch(gygVar3, "Starting timer for "));
                            hagVar.a(gygVar3);
                            gul gulVar = new gul(hagVar, gygVar3, 3, (byte[]) null);
                            hagVar.c.put(gygVar3, gulVar);
                            hagVar.d.put(gygVar3, obj);
                            hagVar.b.b(600000L, gulVar);
                        }
                        return;
                    }
                    gvyVar2.a();
                    return;
                }
                gsy a2 = gsy.a();
                String str3 = gvy.a;
                gyg gygVar4 = gvyVar2.d;
                Objects.toString(gygVar4);
                a2.c(str3, "Already started work for ".concat(gygVar4.toString()));
                return;
            case 4:
                hbt hbtVar = (hbt) this.a;
                hbr hbrVar = hbtVar.b;
                if (hbrVar == null) {
                    return;
                }
                Object obj2 = hbrVar.a;
                if (obj2 != null) {
                    hbtVar.b(obj2);
                    return;
                } else {
                    hbtVar.a(hbrVar.b);
                    return;
                }
            case 5:
                float a3 = ((PhotoView) this.a).a();
                if (a3 > brg.a) {
                    Object obj3 = this.a;
                    float f = brg.a / a3;
                    int width = ((PhotoView) obj3).getWidth() / 2;
                    int height = ((PhotoView) this.a).getHeight() / 2;
                    float f2 = 1.0f / (1.0f - f);
                    float f3 = 1.0f - f2;
                    float f4 = ((PhotoView) this.a).c.left * f3;
                    float f5 = ((PhotoView) this.a).c.top * f3;
                    float width2 = ((PhotoView) this.a).getWidth();
                    float f6 = ((PhotoView) this.a).c.right * f3;
                    float height2 = ((PhotoView) this.a).getHeight();
                    float f7 = ((PhotoView) this.a).c.bottom * f3;
                    float f8 = (width2 * f2) + f6;
                    if (f8 > f4) {
                        min = (f8 + f4) / 2.0f;
                    } else {
                        min = Math.min(Math.max(f8, width), f4);
                    }
                    float f9 = (height2 * f2) + f7;
                    if (f9 > f5) {
                        min2 = (f9 + f5) / 2.0f;
                    } else {
                        min2 = Math.min(Math.max(f9, height), f5);
                    }
                    hik hikVar = ((PhotoView) this.a).b;
                    if (!hikVar.i) {
                        hikVar.b = min;
                        hikVar.c = min2;
                        hikVar.e = brg.a;
                        hikVar.h = System.currentTimeMillis();
                        hikVar.f = a3;
                        float f10 = hikVar.e;
                        if (a3 < brg.a) {
                            z = true;
                        } else {
                            z = false;
                        }
                        hikVar.d = z;
                        hikVar.g = (-a3) / 200.0f;
                        hikVar.i = true;
                        hikVar.j = false;
                        hikVar.a.post(hikVar);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ?? r02 = this.a;
                ((hls) r02).d.a(r02);
                return;
            case 7:
                ((hxa) this.a).cancel(true);
                return;
            case 8:
                Process.setThreadPriority(10);
                this.a.run();
                return;
            case 9:
                break;
            case 10:
                ((icn) this.a).b.dataChanged();
                return;
            case 11:
                ((ija) this.a).b();
                return;
            case 12:
                Object obj4 = this.a;
                akrh e = aktp.e("RcsCapabilitiesDataSource#refreshCapabilities");
                try {
                    sni.j(((ikc) obj4).d, new ibo(obj4, 8));
                    e.close();
                    return;
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 13:
                ((gpx) this.a).y(aqjn.B("android.settings.WIRELESS_SETTINGS", "android.settings.WIFI_SETTINGS", "android.settings.SETTINGS"));
                return;
            case 14:
                alwo alwoVar = imk.a;
                if (this.a.u() != null) {
                    ((alwl) ((alwl) imk.a.i()).h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "setRepliedToDataWithPreconditions", 351, "DraftDataService.java")).q("Combined draft has ReplyMessageDataWrapper but no RepliedToDataAdapter was extracted");
                    return;
                }
                return;
            case 15:
                ((irg) this.a).W(true);
                ((irg) this.a).d = false;
                return;
            case 16:
                ((View) this.a).setTranslationY(brg.a);
                return;
            case 17:
                xyl.h();
                Object obj5 = this.a;
                itm itmVar = (itm) obj5;
                if (itmVar.i.get()) {
                    xzb.c("BugleDataModel", "Ignoring drainTheQueueAndUpdateMessages because the manager is destroyed.");
                    return;
                }
                HashSet hashSet = new HashSet();
                itmVar.e.drainTo(hashSet);
                if (hashSet.isEmpty()) {
                    xzb.c("BugleDataModel", "Empty queue, bailing in drainTheQueueAndUpdateMessages.");
                    return;
                }
                xzb.j("BugleDataModel", "Processing changed messages for ".concat(String.valueOf(TextUtils.join(",", hashSet))));
                aiut.a().post(akto.j(new itl(obj5, (List) Collection.EL.stream(((rvv) itmVar.l.b()).a(hashSet)).map(new ijs(obj5, 19)).collect(Collectors.toList()), hashSet, i)));
                return;
            case 18:
                ixd ixdVar = (ixd) this.a;
                ((rrl) ixdVar.ca.a()).m = mnd.NONE;
                Snackbar snackbar = ixdVar.bJ;
                if (snackbar != null) {
                    snackbar.e();
                    ixdVar.bJ = null;
                }
                ixdVar.ad();
                return;
            case 19:
                ((zrb) this.a).c.am(false, false, 1);
                return;
            default:
                alvi alviVar = ixd.a;
                this.a.i(false, true, false);
                return;
        }
        while (true) {
            Object obj6 = this.a;
            boolean z2 = ((hoo) obj6).c;
            try {
                ((hoo) obj6).c((hon) ((hoo) obj6).b.remove());
                hom homVar = ((hoo) obj6).d;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public gtq(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
