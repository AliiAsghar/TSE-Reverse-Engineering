package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class faq implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public faq(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult, int i) {
        this.d = i;
        this.b = intent;
        this.c = context;
        this.a = pendingResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [fkn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, android.view.ViewTreeObserver$OnDrawListener] */
    /* JADX WARN: Type inference failed for: r1v25, types: [fdq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v55, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v93, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.lang.Runnable
    public final void run() {
        fxj fxjVar;
        int i;
        gih a;
        Cursor bC;
        amfe amfeVar;
        boolean z = true;
        int i2 = 0;
        switch (this.d) {
            case 0:
                alog g = ((alob) this.b).g();
                fbt fbtVar = ((far) this.a).k;
                ert ertVar = fbtVar.e;
                dzg.g(ertVar);
                alog n = alog.n(g);
                fbs fbsVar = fbtVar.b;
                fbsVar.b = n;
                if (!g.isEmpty()) {
                    Object obj = this.c;
                    fbsVar.d = (fgv) g.get(0);
                    dzg.g(obj);
                    fbsVar.e = (fgv) obj;
                }
                if (fbsVar.c == null) {
                    fbsVar.c = fbs.b(ertVar, fbsVar.b, fbsVar.d, fbsVar.a);
                }
                fbsVar.c(ertVar.H());
                return;
            case 1:
                int i3 = bh.e;
                ((ViewGroup) this.b).endViewTransition((View) this.c);
                Object obj2 = this.a;
                ((bi) obj2).a.a.f((ds) obj2);
                return;
            case 2:
                Pair pair = (Pair) this.a;
                ((fau) this.c).a.j.e(((Integer) pair.first).intValue(), (fgv) pair.second, (Exception) this.b);
                return;
            case 3:
                Pair pair2 = (Pair) this.a;
                ((fau) this.c).a.j.eA(((Integer) pair2.first).intValue(), (fgv) pair2.second, (fgr) this.b);
                return;
            case 4:
                this.c.e(0, (fgv) ((apuv) this.a).b, (Exception) this.b);
                return;
            case 5:
                eqn eqnVar = ((fka) this.c).d;
                dzg.h(eqnVar);
                this.b.a(new fko((Throwable) this.a, eqnVar));
                return;
            case 6:
                ((fwv) this.b).b((Bitmap) this.a, (eqn) this.c);
                return;
            case 7:
                ((fwv) this.b).b((Bitmap) this.a, (eqn) this.c);
                return;
            case 8:
                ((fwv) ((isn) this.b).a).b((Bitmap) this.a, (eqn) this.c);
                return;
            case 9:
                fwo fwoVar = (fwo) this.a;
                int i4 = fwoVar.b;
                fxn fxnVar = (fxn) this.c;
                fvj fvjVar = fxnVar.c;
                alog g2 = ((alob) this.b).g();
                String str = fvjVar.b;
                String str2 = fvjVar.c;
                qdq qdqVar = fxnVar.t;
                if (i4 == 7003 && ((i = (fxjVar = (fxj) qdqVar.a).h) == 5 || i == 6 || i == 1 || i == 2 || i == 3 || i == 4)) {
                    fxj.c(fxjVar);
                    ((fxj) qdqVar.a).e.b();
                    fxj fxjVar2 = (fxj) qdqVar.a;
                    fxjVar2.e.o = 6;
                    fxjVar2.h = 0;
                    hka hkaVar = fxjVar2.i;
                    dzg.g(hkaVar);
                    String str3 = fxjVar2.g;
                    dzg.g(str3);
                    fxjVar2.e(hkaVar, new fwy(str3, fxjVar2.d, fxjVar2.j, fxjVar2.b), fxjVar2.j);
                    return;
                }
                ((fxj) qdqVar.a).e.c(g2);
                if (str != null) {
                    ((fxj) qdqVar.a).e.f = str;
                }
                if (str2 != null) {
                    ((fxj) qdqVar.a).e.m = str2;
                }
                fxj fxjVar3 = (fxj) qdqVar.a;
                fxjVar3.e.p = fwoVar;
                fxj.c(fxjVar3);
                fxj fxjVar4 = (fxj) qdqVar.a;
                fxjVar4.c.d(-1, new fxi(fxjVar4, fwoVar, i2));
                fxjVar4.c.c();
                fxjVar4.h = 0;
                return;
            case 10:
                grz.a((AtomicBoolean) this.c, (dtq) this.a, this.b);
                return;
            case 11:
                grz.a((AtomicBoolean) this.c, (dtq) this.a, this.b);
                return;
            case 12:
                Object obj3 = this.c;
                ?? r1 = this.b;
                Object obj4 = this.a;
                try {
                    z = ((Boolean) r1.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (((gud) obj4).j) {
                    gyg e = ((lhm) obj3).e();
                    String str4 = e.a;
                    if (((gud) obj4).e(str4) == obj3) {
                        ((gud) obj4).d(str4);
                    }
                    gsy.a().c(gud.a, obj4.getClass().getSimpleName() + " " + str4 + " executed; reschedule = " + z);
                    Iterator it = ((gud) obj4).i.iterator();
                    while (it.hasNext()) {
                        ((gts) it.next()).a(e, z);
                    }
                }
                return;
            case 13:
                ((gud) ((ico) this.b).a).g((hgi) this.c, (mka) this.a);
                return;
            case 14:
                try {
                    boolean booleanExtra = ((Intent) this.b).getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = ((Intent) this.b).getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = ((Intent) this.b).getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = ((Intent) this.b).getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    gsy.a().c(ConstraintProxyUpdateReceiver.a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    gzv.a((Context) this.c, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                    gzv.a((Context) this.c, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                    gzv.a((Context) this.c, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                    gzv.a((Context) this.c, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    ((BroadcastReceiver.PendingResult) this.a).finish();
                }
            case 15:
                gyt A = ((WorkDatabase) this.a).A();
                Object obj5 = this.b;
                a = gih.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
                a.g(1, (String) obj5);
                gzn gznVar = (gzn) A;
                gznVar.a.k();
                bC = gvf.bC(gznVar.a, a, false);
                try {
                    ArrayList arrayList = new ArrayList(bC.getCount());
                    while (bC.moveToNext()) {
                        arrayList.add(bC.getString(0));
                    }
                    bC.close();
                    a.j();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        gvf.u((gvd) this.c, (String) it2.next());
                    }
                    return;
                } finally {
                }
            case 16:
                gyt A2 = ((WorkDatabase) this.a).A();
                Object obj6 = this.b;
                a = gih.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
                a.g(1, (String) obj6);
                gzn gznVar2 = (gzn) A2;
                gznVar2.a.k();
                bC = gvf.bC(gznVar2.a, a, false);
                try {
                    ArrayList arrayList2 = new ArrayList(bC.getCount());
                    while (bC.moveToNext()) {
                        arrayList2.add(bC.getString(0));
                    }
                    bC.close();
                    a.j();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        gvf.u((gvd) this.c, (String) it3.next());
                    }
                    return;
                } finally {
                }
            case 17:
                hue a2 = hue.a();
                hyv.i();
                a2.c.set(true);
                ((hvx) this.b).b.b = true;
                ((View) this.a).getViewTreeObserver().removeOnDrawListener(this.c);
                ((hvx) this.b).b.a.clear();
                return;
            case 18:
                Object obj7 = this.c;
                Object obj8 = this.a;
                if (uyh.a()) {
                    igw igwVar = (igw) obj8;
                    if (igwVar.l == 2) {
                        uyp uypVar = (uyp) ((Optional) ((apxx) ((BlockAndReportSpamCallbacks) obj7).c).a).get();
                        igwVar.k.getClass();
                        ruy.b(igwVar.c);
                        uypVar.c();
                        return;
                    }
                }
                if (((igw) obj8).e) {
                    amfeVar = amfe.CONVERSATION_FROM_UNBLOCK_ACTION;
                } else {
                    amfeVar = amfe.CONVERSATION_FROM_UNSPAM_ACTION;
                }
                qiu.h(((yyz) ((BlockAndReportSpamCallbacks) obj7).b.b()).e(yyb.bq((xxn) this.b, amfeVar, 2)));
                return;
            case 19:
                itb itbVar = (itb) this.c;
                ird irdVar = itbVar.aq;
                MessageIdType messageIdType = (MessageIdType) this.b;
                int a3 = irdVar.a(messageIdType);
                itbVar.aH = a3;
                itbVar.aI = (Uri) this.a;
                if (lbp.a()) {
                    if (a3 >= 0 && itbVar.ao.getChildCount() != 0) {
                        int a4 = itbVar.aq.a(messageIdType);
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) itbVar.ao.m;
                        if (linearLayoutManager == null || linearLayoutManager.K() > a4 || linearLayoutManager.M() < a4) {
                            itbVar.t(a3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (a3 >= 0) {
                    itbVar.t(a3);
                    return;
                }
                return;
            default:
                albo.T(aiut.g());
                Object obj9 = this.a;
                ?? r12 = this.b;
                Object obj10 = this.c;
                akrh e2 = aktp.e("MessageListWindowManager::insertPendingRcsMessage::mainThread");
                try {
                    if (!((itm) obj9).i.get() && !((itm) obj9).h.containsKey(r12.E())) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(((rry) obj10).u());
                        int i5 = alog.d;
                        ((itm) obj9).n(alsx.a, new HashSet());
                        ((itm) obj9).n(alog.r(obj10), hashSet);
                    }
                    e2.close();
                    return;
                } catch (Throwable th) {
                    try {
                        e2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
        }
    }

    public /* synthetic */ faq(apuv apuvVar, fdq fdqVar, Exception exc, int i) {
        this.d = i;
        this.a = apuvVar;
        this.c = fdqVar;
        this.b = exc;
    }

    public faq(hvx hvxVar, View view, ViewTreeObserver.OnDrawListener onDrawListener, int i) {
        this.d = i;
        this.a = view;
        this.c = onDrawListener;
        this.b = hvxVar;
    }

    public /* synthetic */ faq(Object obj, Bitmap bitmap, eqn eqnVar, int i) {
        this.d = i;
        this.b = obj;
        this.a = bitmap;
        this.c = eqnVar;
    }

    public /* synthetic */ faq(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ faq(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ faq(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ faq(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }
}
