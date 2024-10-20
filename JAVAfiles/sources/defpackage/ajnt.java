package defpackage;

import android.content.ComponentName;
import android.graphics.Rect;
import android.util.Log;
import android.view.TouchDelegate;
import android.view.View;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajnt implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ajnt(akry akryVar, Runnable runnable, int i) {
        this.c = i;
        this.b = akryVar;
        this.a = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.concurrent.Future, com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, akry] */
    /* JADX WARN: Type inference failed for: r0v57, types: [aohf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, aneo] */
    /* JADX WARN: Type inference failed for: r1v19, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [andb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v42, types: [aohf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ajcx ajcxVar;
        int i = 2;
        byte[] bArr = null;
        switch (this.c) {
            case 0:
                ((ajnu) this.a).a((ComponentName) this.b);
                return;
            case 1:
                Rect rect = new Rect();
                ((View) this.a).getHitRect(ajcy.a);
                rect.set(ajcy.a);
                Object parent = ((View) this.a).getParent();
                while (parent != this.b) {
                    if (parent instanceof View) {
                        View view = (View) parent;
                        view.getHitRect(ajcy.a);
                        rect.offset(ajcy.a.left, ajcy.a.top);
                        parent = view.getParent();
                    } else {
                        return;
                    }
                }
                rect.left -= 15;
                rect.top -= 15;
                rect.right += 15;
                rect.bottom += 15;
                TouchDelegate touchDelegate = new TouchDelegate(rect, (View) this.a);
                View view2 = (View) this.b;
                TouchDelegate touchDelegate2 = view2.getTouchDelegate();
                if (touchDelegate2 != null) {
                    if (touchDelegate2 instanceof ajcx) {
                        ajcxVar = (ajcx) touchDelegate2;
                    } else {
                        ajcx ajcxVar2 = new ajcx(view2);
                        ajcxVar2.a(touchDelegate2);
                        ajcxVar = ajcxVar2;
                    }
                } else {
                    ajcxVar = new ajcx(view2);
                }
                ajcxVar.a(touchDelegate);
                ((View) this.b).setTouchDelegate(ajcxVar);
                ((View) this.a).addOnAttachStateChangeListener(new agav(ajcxVar, touchDelegate, 2));
                return;
            case 2:
                ((ajnu) this.a).b((ComponentName) this.b);
                return;
            case 3:
                ((ajnu) this.a).c(this.b);
                return;
            case 4:
                this.a.execute(this.b);
                return;
            case 5:
                Object obj = ((ansy) this.a).b;
                String a = akac.a((ajwt) this.b);
                aluq listIterator = ((aohs) obj).z().listIterator();
                while (listIterator.hasNext()) {
                    File file = new File((File) listIterator.next(), a);
                    if (file.exists() && !file.setWritable(true, true)) {
                        throw new RuntimeException("Could not make data dir writable.");
                    }
                }
                return;
            case 6:
                akrc b = ((aksr) this.b).b("AutoGIL");
                try {
                    this.a.run();
                    b.close();
                    return;
                } catch (Throwable th) {
                    try {
                        b.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 7:
                Object obj2 = this.a;
                Object obj3 = this.b;
                File A = ((akao) obj3).d.A((aknr) obj2);
                String[] list = A.list(new akam(obj3, i));
                if (list != null) {
                    for (String str : list) {
                        if (new File(A, str).delete()) {
                            ((alvg) ((alvg) akao.a.g()).h("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "clean", 93, "OrphanCacheSingletonSynclet.java")).t("Removed orphaned cache file: %s", str);
                        } else {
                            ((alvg) ((alvg) akao.a.h()).h("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "clean", 95, "OrphanCacheSingletonSynclet.java")).t("Failed to remove orphaned cache file: %s", str);
                        }
                    }
                    return;
                }
                return;
            case 8:
                this.a.cancel(true);
                ?? r0 = this.b;
                if (r0.isCancelled()) {
                    return;
                }
                try {
                    albo.bQ(r0);
                    return;
                } catch (ExecutionException e) {
                    aktu.k(e.getCause());
                    return;
                }
            case 9:
                this.a.execute(new ajir(this.b, 17, bArr));
                return;
            case 10:
                if (this.b.isCancelled()) {
                    this.a.cancel(true);
                    return;
                }
                return;
            case 11:
                TikTokListenableWorker.c(this.b, (aomj) this.a);
                return;
            case 12:
                this.a.run();
                akdq akdqVar = (akdq) this.b;
                Throwable th3 = (Throwable) akdqVar.a.get();
                akdqVar.a.remove();
                if (th3 == null) {
                    return;
                } else {
                    throw th3;
                }
            case 13:
                Set set = ((akhj) this.b).g;
                if (set != null) {
                    set.remove(this.a);
                    return;
                }
                return;
            case 14:
                ((akhj) this.b).d((aodz) this.a);
                return;
            case 15:
                akmq.b();
                Object obj4 = this.a;
                Object obj5 = this.b;
                try {
                    long length = ((String) obj4).getBytes().length;
                    if (length <= ((akmq) obj5).f) {
                        akmq.b();
                        if (((akmq) obj5).h == null) {
                            File file2 = (File) ((akmq) obj5).d.get();
                            if (file2.exists() && file2.length() + length >= ((akmq) obj5).f) {
                                ((akmq) obj5).d();
                            }
                            ((akmq) obj5).c();
                        }
                        if (((akmq) obj5).i.a + length >= ((akmq) obj5).f) {
                            ((akmq) obj5).h.flush();
                            d.q(((akmq) obj5).h);
                            ((akmq) obj5).h = null;
                            ((akmq) obj5).d();
                            ((akmq) obj5).c();
                        }
                        ((akmq) obj5).h.println((String) obj4);
                        return;
                    }
                    Log.w(akmq.a, "The message is too large to log internally.");
                    return;
                } catch (IOException e2) {
                    Log.e(akmq.a, "Unable to write to file log.", e2);
                    return;
                }
            case 16:
                ?? r02 = this.b;
                akru b2 = akqj.b();
                akry i2 = akqj.i(b2, r02);
                try {
                    this.a.run();
                    return;
                } catch (Throwable th4) {
                    try {
                        akqd.b(th4);
                        throw th4;
                    } finally {
                        akqj.i(b2, i2);
                    }
                }
            case 17:
                ((alvt) this.a).a.remove(this.b);
                return;
            case 18:
                this.b.a(new ahmn(this.a, null));
                return;
            case 19:
                Object obj6 = this.b;
                aohf aohfVar = ((aofe) obj6).b;
                ?? r2 = this.a;
                if (aohfVar == aofe.a) {
                    synchronized (obj6) {
                        ((aofe) obj6).b = r2;
                    }
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            default:
                ((aofb) this.b).c(this.a);
                return;
        }
    }

    public ajnt(View view, View view2, int i) {
        this.c = i;
        this.a = view;
        this.b = view2;
    }

    public /* synthetic */ ajnt(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ ajnt(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public ajnt(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }
}
