package defpackage;

import android.content.Context;
import android.net.Network;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kwr implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ kwr(adhf adhfVar, Network network, adey adeyVar, String str, ailf ailfVar, int i) {
        this.f = i;
        this.e = adhfVar;
        this.a = network;
        this.c = adeyVar;
        this.d = str;
        this.b = ailfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x031d, code lost:
    
        if (r0 != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bf, code lost:
    
        if (defpackage.zug.b(r0) != false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 1360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwr.call():java.lang.Object");
    }

    public /* synthetic */ kwr(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, aoip aoipVar, aoim aoimVar, int i) {
        this.f = i;
        this.a = context;
        this.d = scheduledExecutorService;
        this.c = firebaseMessaging;
        this.b = aoipVar;
        this.e = aoimVar;
    }

    public /* synthetic */ kwr(gpx gpxVar, akul akulVar, akul akulVar2, rry rryVar, qwm qwmVar, int i) {
        this.f = i;
        this.a = gpxVar;
        this.b = akulVar;
        this.d = akulVar2;
        this.e = rryVar;
        this.c = qwmVar;
    }

    public /* synthetic */ kwr(Object obj, alog alogVar, Object obj2, Object obj3, Object obj4, int i) {
        this.f = i;
        this.a = obj;
        this.b = alogVar;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ kwr(Object obj, Object obj2, akul akulVar, akul akulVar2, Object obj3, int i) {
        this.f = i;
        this.a = obj;
        this.c = obj2;
        this.e = akulVar;
        this.b = akulVar2;
        this.d = obj3;
    }

    public /* synthetic */ kwr(tvg tvgVar, apwl apwlVar, rve rveVar, qei qeiVar, qei qeiVar2, int i) {
        this.f = i;
        this.b = tvgVar;
        this.d = apwlVar;
        this.e = rveVar;
        this.a = qeiVar;
        this.c = qeiVar2;
    }

    public /* synthetic */ kwr(vbm vbmVar, rto rtoVar, alog alogVar, akul akulVar, akul akulVar2, int i) {
        this.f = i;
        this.c = vbmVar;
        this.a = rtoVar;
        this.d = alogVar;
        this.e = akulVar;
        this.b = akulVar2;
    }
}
