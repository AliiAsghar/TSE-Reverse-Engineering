package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.media.MediaMuxer;
import android.opengl.EGL14;
import android.provider.Telephony;
import android.view.Surface;
import android.view.animation.AccelerateInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ybh implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ybh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [yao, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v36, types: [armf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        String[] strArr;
        int i = 9;
        String str = null;
        byte b = 0;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                synchronized (((ybj) obj).e) {
                    ((ybj) obj).d();
                }
                return;
            case 1:
                this.a.w();
                return;
            case 2:
                Object obj2 = this.a;
                synchronized (((ybl) obj2).d) {
                    ((ybl) obj2).d();
                }
                return;
            case 3:
                Object obj3 = this.a;
                synchronized (((yer) obj3).f) {
                    Iterator it = ((yer) obj3).f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                return;
            case 4:
                Object obj4 = this.a;
                akrh e = aktp.e("BugleGservicesImpl#initializeGservices");
                try {
                    Context context = ((yer) obj4).d;
                    context.getClass();
                    ContentResolver contentResolver = context.getContentResolver();
                    String[] strArr2 = {"bugle_"};
                    acmk acmkVar = acmd.a;
                    synchronized (acmkVar) {
                        acmkVar.c(contentResolver);
                        if (acmkVar.h.length == 0) {
                            acmkVar.h = new String[1];
                            System.arraycopy(strArr2, 0, acmkVar.h, 0, 1);
                            strArr = acmkVar.h;
                        } else {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Collections.addAll(linkedHashSet, acmkVar.h);
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            String str2 = strArr2[0];
                            if (linkedHashSet.add(str2)) {
                                linkedHashSet2.add(str2);
                            }
                            if (linkedHashSet2.isEmpty()) {
                                strArr = new String[0];
                            } else {
                                ArrayList arrayList = new ArrayList(linkedHashSet);
                                Collections.sort(arrayList);
                                HashMap hashMap = new HashMap();
                                int size = arrayList.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    String str3 = (String) arrayList.get(i2);
                                    if (str != null && str3.startsWith(str)) {
                                        hashMap.put(str3, str);
                                        linkedHashSet2.remove(str3);
                                    } else {
                                        str = str3;
                                    }
                                }
                                if (linkedHashSet2.isEmpty()) {
                                    strArr = new String[0];
                                } else {
                                    if (!hashMap.isEmpty()) {
                                        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                        Iterator it2 = linkedHashSet.iterator();
                                        while (it2.hasNext()) {
                                            String str4 = (String) it2.next();
                                            String str5 = (String) hashMap.get(str4);
                                            if (str5 != null) {
                                                linkedHashSet3.add(str5);
                                            } else {
                                                linkedHashSet3.add(str4);
                                            }
                                        }
                                        linkedHashSet = linkedHashSet3;
                                    }
                                    acmkVar.h = (String[]) linkedHashSet.toArray(new String[0]);
                                    strArr = (String[]) linkedHashSet2.toArray(new String[0]);
                                }
                            }
                        }
                        if (!acmkVar.g) {
                            acmkVar.b(contentResolver, acmkVar.h);
                        } else if (strArr.length != 0) {
                            acmkVar.g = false;
                            acmkVar.b(contentResolver, strArr);
                        }
                    }
                    synchronized (((yer) obj4).b) {
                        ((yer) obj4).c = true;
                        ((yer) obj4).b.notifyAll();
                    }
                    e.close();
                    alvw d = yer.a.d();
                    d.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/util/gservices/BugleGservicesImpl", "<init>", 83, "BugleGservicesImpl.java")).t("GServicesValues:\n%s", new ivm(obj4, i));
                    return;
                } finally {
                }
            case 5:
                if (!((dtq) this.a).b(ygh.a(1))) {
                    ((alwl) ygs.a.n().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "getPreparedListener", 218, "PlaybackSession.java")).q("Media player prepared before being released");
                    return;
                }
                return;
            case 6:
                ((yyt) this.a).k();
                return;
            case 7:
                yhf yhfVar = (yhf) this.a;
                yhf.c(yhfVar.a);
                yhf.c(yhfVar.b);
                yhf.b(yhfVar.e);
                yha yhaVar = yhfVar.d;
                if (yhaVar != null) {
                    yhaVar.c.release();
                }
                yhf.b(yhfVar.g);
                yhf.b(yhfVar.f);
                yhf.b(yhfVar.h);
                MediaMuxer mediaMuxer = yhfVar.i;
                if (mediaMuxer != null) {
                    try {
                        mediaMuxer.release();
                    } catch (IllegalStateException e2) {
                        ((alwl) ((alwl) ((alwl) yhh.a.h()).g(e2)).h("com/google/android/apps/messaging/shared/util/media/video/VideoTranscoder", "release", (char) 911, "VideoTranscoder.java")).q("Error releasing muxer");
                    }
                }
                ygx ygxVar = yhfVar.c;
                if (ygxVar != null) {
                    if (ygxVar.c != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(ygxVar.a, ygxVar.c);
                        EGL14.eglDestroyContext(ygxVar.a, ygxVar.b);
                        EGL14.eglReleaseThread();
                        EGL14.eglTerminate(ygxVar.a);
                    }
                    Surface surface = ygxVar.d;
                    if (surface != null) {
                        surface.release();
                    }
                    ygxVar.a = EGL14.EGL_NO_DISPLAY;
                    ygxVar.b = EGL14.EGL_NO_CONTEXT;
                    ygxVar.c = EGL14.EGL_NO_SURFACE;
                    ygxVar.d = null;
                    return;
                }
                return;
            case 8:
                fxj fxjVar = (fxj) ((wfh) this.a).a;
                fxjVar.b();
                fxn fxnVar = fxjVar.f;
                if (fxnVar == null) {
                    return;
                }
                try {
                    if (!fxnVar.o) {
                        fxnVar.c();
                        fxnVar.d.i(1, null).f();
                        fxnVar.r.f();
                        fxnVar.r.i();
                        RuntimeException runtimeException = fxnVar.n;
                        if (runtimeException != null) {
                            throw runtimeException;
                        }
                    }
                    return;
                } finally {
                    fxjVar.f = null;
                }
            case 9:
                yin yinVar = (yin) this.a;
                yip.a(yinVar.f, yinVar.g);
                return;
            case 10:
                long longValue = ((Long) utw.F.e()).longValue();
                if (longValue == 0) {
                    return;
                }
                Object obj5 = this.a;
                zer zerVar = (zer) obj5;
                try {
                    int delete = zerVar.b.getContentResolver().delete(Telephony.Sms.CONTENT_URI.buildUpon().appendPath("raw").build(), a.ck(zerVar.e.f().toEpochMilli() - longValue, "deleted = 0 AND date < "), null);
                    ((zer) obj5).g.ifPresent(new xyh(6));
                    ((alwl) zer.a.m().h("com/google/android/apps/messaging/startup/PhoneAsyncAppCreateStartupTask", "cleanTelephonyRawMessages", 109, "PhoneAsyncAppCreateStartupTask.java")).r("%d raw messages are deleted from Telephony", delete);
                    return;
                } catch (Exception e3) {
                    ((alwl) ((alwl) ((alwl) zer.a.h()).g(e3)).h("com/google/android/apps/messaging/startup/PhoneAsyncAppCreateStartupTask", "cleanTelephonyRawMessages", 'o', "PhoneAsyncAppCreateStartupTask.java")).q("cannot remove raw messages");
                    return;
                }
            case 11:
                ggk.b(((zev) this.a).a, new sp(5), ggk.a, false);
                return;
            case 12:
                ((wpp) ((zfj) this.a).a.b()).s("Bugle.Gaia.CorruptedPds.Counts");
                return;
            case 13:
                zas zasVar = (zas) this.a;
                yyb.aO(((mdt) zasVar.c.b()).f(((xnv) zasVar.g).f().toEpochMilli()), "BugleUsageStatistics", "Failed to update LastPassiveEventTimeMillis");
                return;
            case 14:
                ((alvg) ((alvg) zkv.a.d()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "onGoogleTosAccepted", 1650, "RcsSettingsFragmentV2Peer.java")).q("onGoogleTosAccepted");
                zkv zkvVar = (zkv) this.a;
                ((ykw) zkvVar.x.b()).h("should_show_google_tos_prompt", false);
                ((ykw) zkvVar.x.b()).h("did_show_google_tos_prompt", true);
                ((ykw) zkvVar.x.b()).j("rcs_tos_state", 2);
                zkvVar.j(wiz.TOGGLE_STATE_ENABLED);
                return;
            case 15:
                zop zopVar = (zop) this.a;
                zopVar.l(zopVar.q.getScrollX());
                return;
            case 16:
                ((zop) this.a).z = 2;
                return;
            case 17:
                ((zop) this.a).z = 1;
                return;
            case 18:
                Object obj6 = this.a;
                zop zopVar2 = (zop) obj6;
                zopVar2.k();
                zopVar2.g.animate().alpha(1.0f).setDuration(200L).setInterpolator(new AccelerateInterpolator()).withStartAction(new ybh(obj6, 16)).withEndAction(new ybh(obj6, 17));
                return;
            case 19:
                Object obj7 = this.a;
                ((zop) obj7).b.addOnLayoutChangeListener(new fyc(obj7, 9, null));
                return;
            default:
                ((zop) this.a).z = 3;
                return;
        }
    }

    public ybh(wfh wfhVar, int i) {
        this.b = i;
        this.a = wfhVar;
    }
}
