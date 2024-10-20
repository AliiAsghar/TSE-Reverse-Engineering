package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahjd implements andy {
    public final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public ahjd(adec adecVar, ahja ahjaVar, ahit ahitVar, int i) {
        this.d = i;
        this.a = ahjaVar;
        this.b = ahitVar;
        this.c = adecVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r1v26, types: [xzx, xyo] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r4v13, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.andy
    public final void a(Throwable th) {
        switch (this.d) {
            case 0:
                ahiu.e(th, "%s: Download Future failed", "DownloaderImp");
                try {
                    try {
                        if (((ahja) this.a).d.f()) {
                            Object b = ((ahja) this.a).d.b();
                            uiy uiyVar = ((uix) b).b;
                            Object obj = ((uix) b).c;
                            Object obj2 = ((uix) b).e;
                            xyo b2 = uiy.a.b();
                            b2.H("Download failed");
                            b2.M(VCardConstants.PROPERTY_URL, obj);
                            b2.z("exception", th.getClass().getName());
                            b2.z("message", th.getMessage());
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                b2.z("cause", cause.getClass().getName());
                                b2.z("causeMessage", cause.getMessage());
                            }
                            b2.q();
                            try {
                                try {
                                    ((ujd) obj2).b((Uri) obj, th);
                                } catch (RuntimeException e) {
                                    xyo b3 = uiy.a.b();
                                    b3.H("Callback error: #onFailure");
                                    b3.r(e);
                                }
                                ((uiy) uiyVar).e.a.remove(obj);
                                ?? c = uiy.a.c();
                                uiyVar = ((uiy) uiyVar).e.a.size();
                                c.x("remainingDownloads", uiyVar);
                                c.q();
                            } catch (Throwable th2) {
                                uiyVar.e.a.remove(obj);
                                xyo c2 = uiy.a.c();
                                c2.x("remainingDownloads", uiyVar.e.a.size());
                                c2.q();
                                throw th2;
                            }
                        }
                    } catch (RuntimeException unused) {
                        ahiu.d(th, "%s: Download Listener onFailure failed", "DownloaderImp");
                    }
                    return;
                } finally {
                    if (((ahja) this.a).d.f()) {
                        ((ahiy) ((alha) ((adec) this.c).e).a).a(((ahja) this.a).a);
                    }
                    ((aiim) ((adec) this.c).a).e(((ahit) this.b).a);
                }
            case 1:
                ((itb) this.a).u.a();
                if (th instanceof CancellationException) {
                    return;
                } else {
                    throw new IllegalArgumentException("load failed.", th);
                }
            case 2:
                aiqt aiqtVar = (aiqt) this.a;
                boolean z = aiqtVar.x;
                aiqtVar.x = !z;
                if (!z) {
                    aiqtVar.y.d.remove(this.c);
                }
                ((aiqt) this.a).y.g.remove(this.c);
                ((aiqt) this.a).v.setClickable(true);
                return;
            case 3:
                Log.e("NetworkCallerGrpc", "Failed to record event.", th);
                ((aizi) this.b).e();
                return;
            case 4:
                Log.e("NetworkCallerGrpc", "Failed to record event.", th);
                ((aizi) this.b).e();
                return;
            case 5:
                Log.e("NetworkCallerGrpc", "Failed to fetch survey.", th);
                ((aizi) this.b).a(2);
                ((aizi) this.b).e();
                return;
            case 6:
                Log.e("NetworkCallerGrpc", "Failed to fetch survey.", th);
                ((aizi) this.b).a(2);
                ((aizi) this.b).e();
                return;
            case 7:
                Log.e("ClientLoggingBackend", "Error while logging.", th);
                return;
            default:
                ((ConcurrentHashMap) ((aksr) this.a).c).remove(this.c, this.b);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r13v19, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r13v26, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v77, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.andy
    public final /* synthetic */ void b(Object obj) {
        String string;
        apqf apqfVar;
        switch (this.d) {
            case 0:
                if (((ahja) this.a).d.f()) {
                    uix uixVar = (uix) ((ahja) this.a).d.b();
                    Object obj2 = uixVar.b;
                    Object obj3 = uixVar.c;
                    Object obj4 = uixVar.d;
                    Object obj5 = uixVar.e;
                    xyo c = uiy.a.c();
                    c.H("Download succeeded, notifying callback");
                    c.M(VCardConstants.PROPERTY_URL, obj3);
                    c.M("fileUri", obj4);
                    c.q();
                    try {
                        try {
                            Iterator it = ((ujd) obj5).b.iterator();
                            while (it.hasNext()) {
                                ((ujd) obj5).c(new rvz((uji) it.next(), obj3, obj4, 15, (boolean[]) null));
                            }
                            ((ujd) obj5).b.clear();
                        } catch (RuntimeException e) {
                            xyo b = uiy.a.b();
                            b.H("Download callback onSuccess error");
                            b.r(e);
                        }
                        uiy uiyVar = (uiy) obj2;
                        uiyVar.e.a.remove(obj3);
                        xyo c2 = uiy.a.c();
                        c2.x("remainingDownloads", uiyVar.e.a.size());
                        c2.q();
                        aktp.aa(aneh.a, new ahjc(this, (ahja) this.a, (ahit) this.b), ((adec) this.c).d);
                        return;
                    } catch (Throwable th) {
                        uiy uiyVar2 = (uiy) obj2;
                        uiyVar2.e.a.remove(obj3);
                        xyo c3 = uiy.a.c();
                        c3.x("remainingDownloads", uiyVar2.e.a.size());
                        c3.q();
                        throw th;
                    }
                }
                ((aiim) ((adec) this.c).a).e(((ahit) this.b).a);
                return;
            case 1:
                ((itb) this.a).u.a();
                Object obj6 = this.c;
                if (!((MessageIdType) obj6).b()) {
                    xzb.d("Bugle", "Load success, start scrollToLoadedMessageId %s", obj6);
                    ((itb) this.a).K((MessageIdType) this.c, (Uri) this.b);
                    return;
                }
                xzb.c("Bugle", "Load success, no targetMessageId, scrollToPosition 0");
                ((itb) this.a).t(0);
                return;
            case 2:
                ((aiqt) this.a).D();
                ((aiqt) this.a).y.g.remove(this.c);
                ((aiqt) this.a).v.setClickable(true);
                Object obj7 = this.a;
                Context context = ((View) this.b).getContext();
                if (((aiqt) obj7).x) {
                    string = context.getString(R.string.announcement_sticker_added_to_favorites);
                } else {
                    string = context.getString(R.string.announcement_sticker_removed_from_favorites);
                }
                ahmc.M((View) this.b, string);
                return;
            case 3:
                ((aizi) this.b).e();
                ((aizi) this.b).i((apqc) this.c, (asgf) this.a);
                return;
            case 4:
                aqji aqjiVar = (aqji) obj;
                ((aizi) this.b).e();
                try {
                } catch (apba e2) {
                    Log.e("NetworkCallerGrpc", "Failed to convert feedback1p survey record event response to scone.", e2);
                }
                ((aizi) this.b).i((apqc) this.c, (asgf) this.a);
                return;
            case 5:
                ((aizi) this.b).e();
                Object obj8 = this.a;
                ((aizi) this.b).g((apqe) this.c, (apqf) obj, (asgf) obj8);
                return;
            case 6:
                aqjk aqjkVar = (aqjk) obj;
                ((aizi) this.b).e();
                try {
                    apqfVar = (apqf) apag.parseFrom(apqf.a, aqjkVar.toByteString(), aozs.a());
                } catch (apba e3) {
                    Log.e("NetworkCallerGrpc", "Failed to convert feedback1p survey trigger response to scone.", e3);
                    apqfVar = null;
                }
                ((aizi) this.b).g((apqe) this.c, apqfVar, (asgf) this.a);
                return;
            case 7:
                if (!((Boolean) obj).booleanValue()) {
                    return;
                }
                albo.bR(this.b, akto.h(new aomr(this, (aong) this.c)), andi.a);
                return;
            default:
                return;
        }
    }

    public ahjd(aizi aiziVar, apag apagVar, asgf asgfVar, int i) {
        this.d = i;
        this.c = apagVar;
        this.a = asgfVar;
        this.b = aiziVar;
    }

    public ahjd(aoms aomsVar, ListenableFuture listenableFuture, aong aongVar, int i) {
        this.d = i;
        this.b = listenableFuture;
        this.c = aongVar;
        this.a = aomsVar;
    }

    public ahjd(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.c = obj2;
        this.b = obj3;
        this.a = obj;
    }
}
