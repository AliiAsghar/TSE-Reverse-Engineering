package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import io.grpc.Status;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asmb {
    public final Object a;
    public final Object b;

    public asmb(alhr alhrVar) {
        this.a = alhrVar;
        this.b = null;
    }

    private static String A(asqu asquVar) {
        long j = asquVar.b;
        if (j <= 64) {
            return asquVar.u().d();
        }
        return asquVar.v((int) Math.min(j, 64L)).d().concat("...");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.asmb z(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileChannel r5 = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L2b java.lang.Error -> L2d java.io.IOException -> L2f
            asmb r2 = new asmb     // Catch: java.nio.channels.OverlappingFileLockException -> L25 java.lang.Error -> L27 java.io.IOException -> L29
            r2.<init>(r5, r0, r1)     // Catch: java.nio.channels.OverlappingFileLockException -> L25 java.lang.Error -> L27 java.io.IOException -> L29
            return r2
        L25:
            r2 = move-exception
            goto L3b
        L27:
            r2 = move-exception
            goto L3b
        L29:
            r2 = move-exception
            goto L3b
        L2b:
            r0 = move-exception
            goto L30
        L2d:
            r0 = move-exception
            goto L30
        L2f:
            r0 = move-exception
        L30:
            r2 = r0
            r0 = r1
            goto L3b
        L33:
            r5 = move-exception
            goto L38
        L35:
            r5 = move-exception
            goto L38
        L37:
            r5 = move-exception
        L38:
            r2 = r5
            r5 = r1
            r0 = r5
        L3b:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L47
            r0.release()     // Catch: java.io.IOException -> L47
        L47:
            if (r5 == 0) goto L4c
            r5.close()     // Catch: java.io.IOException -> L4c
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asmb.z(android.content.Context):asmb");
    }

    public final Object a(arpe arpeVar) {
        arwu u;
        arvp arvpVar = new arvp(arhi.i(arpeVar), 1);
        arvpVar.A();
        int length = ((arwl[]) this.b).length;
        arvi[] arviVarArr = new arvi[length];
        for (int i = 0; i < length; i++) {
            arwl arwlVar = ((arwl[]) this.b)[i];
            arwlVar.A();
            arvi arviVar = new arvi(this, arvpVar);
            u = arwi.u(arwlVar, true, arviVar);
            arviVar.a = u;
            arviVarArr[i] = arviVar;
        }
        arvj arvjVar = new arvj(arviVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            arviVarArr[i2].b.c(arvjVar);
        }
        if (arvpVar.j()) {
            arvjVar.a();
        } else {
            arvpVar.B(arvjVar);
        }
        Object l = arvpVar.l();
        if (l == arpl.a) {
            arpeVar.getClass();
        }
        return l;
    }

    public final boolean b() {
        return ((Logger) this.b).isLoggable((Level) this.a);
    }

    public final void c(int i, int i2, asqu asquVar, int i3, boolean z) {
        if (b()) {
            Object obj = this.b;
            Logger logger = (Logger) obj;
            logger.logp((Level) this.a, "io.grpc.okhttp.OkHttpFrameLogger", "logData", aqaw.h(i) + " DATA: streamId=" + i2 + " endStream=" + z + " length=" + i3 + " bytes=" + A(asquVar));
        }
    }

    public final void d(int i, int i2, arkh arkhVar, asqx asqxVar) {
        if (b()) {
            Object obj = this.b;
            Object obj2 = this.a;
            String h = aqaw.h(i);
            String valueOf = String.valueOf(arkhVar);
            int b = asqxVar.b();
            asqu asquVar = new asqu();
            asquVar.J(asqxVar);
            Logger logger = (Logger) obj;
            logger.logp((Level) obj2, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", h + " GO_AWAY: lastStreamId=" + i2 + " errorCode=" + valueOf + " length=" + b + " bytes=" + A(asquVar));
        }
    }

    public final void e(int i, long j) {
        if (b()) {
            Object obj = this.b;
            Logger logger = (Logger) obj;
            logger.logp((Level) this.a, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", aqaw.h(i) + " PING: ack=false bytes=" + j);
        }
    }

    public final void f(int i, int i2, arkh arkhVar) {
        if (b()) {
            Object obj = this.b;
            Logger logger = (Logger) obj;
            logger.logp((Level) this.a, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", aqaw.h(i) + " RST_STREAM: streamId=" + i2 + " errorCode=" + String.valueOf(arkhVar));
        }
    }

    public final void g(int i, int i2, long j) {
        if (b()) {
            Object obj = this.b;
            Logger logger = (Logger) obj;
            logger.logp((Level) this.a, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", aqaw.h(i) + " WINDOW_UPDATE: streamId=" + i2 + " windowSizeIncrement=" + j);
        }
    }

    public final void h(int i, asnn asnnVar) {
        if (b()) {
            Object obj = this.b;
            Object obj2 = this.a;
            String h = aqaw.h(i);
            EnumMap enumMap = new EnumMap(arji.class);
            for (arji arjiVar : arji.values()) {
                int i2 = arjiVar.g;
                if (asnnVar.e(i2)) {
                    enumMap.put((EnumMap) arjiVar, (arji) Integer.valueOf(asnnVar.c(i2)));
                }
            }
            ((Logger) obj).logp((Level) obj2, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", h + " SETTINGS: ack=false settings=" + enumMap.toString());
        }
    }

    public final boolean i(String str) {
        return str.startsWith((String) this.b);
    }

    public final boolean j(String str) {
        return str.startsWith((String) this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, arzj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.arie
            if (r0 == 0) goto L13
            r0 = r5
            arie r0 = (defpackage.arie) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            arie r0 = new arie
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            asmb r2 = r0.d
            defpackage.aqil.P(r5)
            goto L35
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.aqil.P(r5)
            r2 = r4
        L35:
            java.lang.Object r5 = r2.a
            java.lang.Object r5 = r5.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L50
            java.lang.Object r5 = r2.b
            r0.d = r2
            r0.b = r3
            java.lang.Object r5 = r5.i(r0)
            if (r5 != r1) goto L35
            return r1
        L50:
            arnb r5 = defpackage.arnb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asmb.k(arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arzj] */
    public final void l() {
        Object c = this.b.c(arnb.a);
        if (c instanceof arzm) {
            Throwable b = arzn.b(c);
            if (b == null) {
                throw new AssertionError("Should be impossible; a CONFLATED channel should never return false on offer");
            }
            throw b;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.ScheduledFuture, java.lang.Object] */
    public final void m() {
        ((aqwd) this.b).b = true;
        this.a.cancel(false);
    }

    public final boolean n() {
        aqwd aqwdVar = (aqwd) this.b;
        if (!aqwdVar.c && !aqwdVar.b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final void o(aqux aquxVar) {
        this.b.add(aquxVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final Collection p() {
        return this.b.values();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    public final eov q(eov eovVar) {
        apzj.h(eovVar);
        return new apwz(this.b, eovVar, (ksc) this.a);
    }

    public final boolean r() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final aquc s(aqwn aqwnVar, aqww aqwwVar, aqwt aqwtVar) {
        Object obj = this.a;
        aqwp aqwpVar = aqwp.a;
        d.t(!aqwnVar.d().equals(((Context) obj).getPackageName()), "Don't use RemoteEndpoints-created channels to access in-app gRPC services");
        agqr.a();
        appn appnVar = new appn(null);
        d.t(true, "Cross-User channel must not be used with the current UserHandle.");
        asqe asqeVar = (asqe) this.b;
        atii atiiVar = (atii) asqeVar.a;
        aqwq aqwqVar = new aqwq(aqwnVar, (Context) atiiVar.d, appnVar);
        aqxa aqxaVar = aqwqVar.a;
        ?? r0 = atiiVar.a;
        r0.getClass();
        aqxaVar.c = r0;
        aqwqVar.s(atiiVar.b);
        aqwqVar.e(atiiVar.b);
        aqwqVar.h(atiiVar.c);
        aqwqVar.a.f = aqwpVar;
        aqwqVar.t(aqwwVar);
        aqwqVar.a.g = aqwtVar;
        aqwqVar.d(new aqsp());
        aqwqVar.c(aqsb.a());
        aqwqVar.f(1L, TimeUnit.MINUTES);
        Iterator it = ((alha) asqeVar.b).a.iterator();
        while (it.hasNext()) {
            aqwqVar.g((aqrv) it.next());
        }
        algw algwVar = (algw) asqeVar.c;
        if (algwVar.f()) {
            aqwqVar.f(((Long) algwVar.b()).longValue(), TimeUnit.SECONDS);
        }
        return aqwqVar.a();
    }

    public final acir t() {
        return (acir) ((acit) this.a).a;
    }

    public final void u() {
        ((acit) this.a).d(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Map, java.lang.Object] */
    public final synchronized acir v(String str, aoij aoijVar) {
        acir acirVar = (acir) this.b.get(str);
        if (acirVar != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: ".concat(String.valueOf(str)));
            }
            return acirVar;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: ".concat(String.valueOf(str)));
        }
        Object obj = aoijVar.a;
        Object obj2 = aoijVar.b;
        Object obj3 = aoijVar.c;
        aoim aoimVar = ((FirebaseMessaging) obj).e;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj;
        acir d = aoim.b(aoimVar.a(aetn.bg(aoimVar.a), "*", new Bundle())).f(((FirebaseMessaging) obj).f, new aogx(firebaseMessaging, (String) obj2, (aoit) obj3, 2)).d(this.a, new abpk(this, str, 10, null));
        this.b.put(str, d);
        return d;
    }

    public final void w() {
        try {
            ((FileLock) this.a).release();
            ((FileChannel) this.b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v23, types: [aohf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v33, types: [aohi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [aohf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.Map, java.lang.Object] */
    public final synchronized acir x(String str, String str2, aogw aogwVar) {
        int b;
        Pair pair = new Pair(str, str2);
        acir acirVar = (acir) this.b.get(pair);
        if (acirVar != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Joining ongoing request for: ".concat(pair.toString()));
            }
            return acirVar;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Making new request for: ".concat(pair.toString()));
        }
        FirebaseInstanceId firebaseInstanceId = aogwVar.a;
        String str3 = aogwVar.b;
        String str4 = aogwVar.c;
        String str5 = aogwVar.d;
        aohb aohbVar = aogwVar.e;
        Bundle bundle = new Bundle();
        bundle.putString("scope", str5);
        bundle.putString("sender", str4);
        bundle.putString("subtype", str4);
        bundle.putString("appid", str3);
        aogy aogyVar = firebaseInstanceId.e;
        bundle.putString("gmp_app_id", ((aodi) aogyVar.a).c().b);
        bundle.putString("gmsv", Integer.toString(((aogz) aogyVar.b).a()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((aogz) aogyVar.b).c());
        bundle.putString("app_ver_name", ((aogz) aogyVar.b).d());
        bundle.putString("firebase-app-name-hash", aogyVar.a());
        try {
            String str6 = ((aohm) actx.u(aogyVar.f.j())).a;
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str6);
            } else {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        }
        bundle.putString("cliv", "fiid-21.1.1");
        aogs aogsVar = (aogs) aogyVar.e.a();
        aojm aojmVar = (aojm) aogyVar.d.a();
        if (aogsVar != null && aojmVar != null && (b = aogsVar.b()) != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(aode.ao(b)));
            bundle.putString("Firebase-Client", aojmVar.a());
        }
        acir f = ((abpn) aogyVar.c).b(bundle).b(aogu.a, new acca(8)).f(firebaseInstanceId.b, new aogx(firebaseInstanceId, str4, str5, 0));
        f.p(new sp(19), new vdo(firebaseInstanceId, aohbVar, 4, null));
        acir d = f.d(this.a, new abpk(this, pair, 9));
        this.b.put(pair, d);
        return d;
    }

    public final asmb y(aqvs aqvsVar) {
        return new asmb(this.a, aqvsVar);
    }

    public asmb(Context context, asqe asqeVar) {
        this.a = context;
        this.b = asqeVar;
    }

    public asmb(Intent intent) {
        this.a = new acit();
        this.b = intent;
    }

    public asmb(apuv apuvVar) {
        this.b = null;
        this.a = apuvVar;
    }

    public asmb(apvj apvjVar) {
        this.b = apvjVar;
        this.a = null;
    }

    public asmb(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public asmb(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public asmb(Map map, ksc kscVar) {
        this.b = map;
        this.a = kscVar;
    }

    public asmb(Status status, aqut aqutVar) {
        albo.U(!status.f(), "Error status must not be OK");
        this.b = status;
        this.a = aqutVar;
    }

    public asmb(Status status, Object obj) {
        status.getClass();
        this.a = status;
        this.b = obj;
    }

    public asmb(URI uri, aqve aqveVar) {
        uri.getClass();
        this.a = uri;
        this.b = aqveVar;
    }

    public asmb(byte[] bArr, char[] cArr) {
        this.b = new HashMap();
        this.a = new HashMap();
    }

    public asmb(aqvw aqvwVar, Map map) {
        this.a = aqvwVar;
        this.b = DesugarCollections.unmodifiableMap(new HashMap(map));
    }

    public asmb(arqg arqgVar) {
        this.a = arqgVar;
        this.b = arhi.t(-1, 0, 6);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map, java.lang.Object] */
    public asmb(asmb asmbVar) {
        this.b = new HashMap((Map) asmbVar.b);
        this.a = new HashMap((Map) asmbVar.a);
    }

    public asmb(String str, byte[] bArr) {
        this.b = new ArrayList();
        this.a = str;
    }

    public asmb(Level level, Class cls) {
        Logger logger = Logger.getLogger(cls.getName());
        level.getClass();
        this.a = level;
        logger.getClass();
        this.b = logger;
    }

    public asmb(aqwd aqwdVar, ScheduledFuture scheduledFuture) {
        this.b = aqwdVar;
        scheduledFuture.getClass();
        this.a = scheduledFuture;
    }

    public asmb(alor alorVar) {
        this.b = new aqwu();
        this.a = alorVar;
    }

    public asmb(aqub aqubVar) {
        aqubVar.getClass();
        this.a = aqubVar;
        this.b = "pick_first";
    }

    public asmb(arwl[] arwlVarArr) {
        this.b = arwlVarArr;
        this.a = new arvc(arwlVarArr.length, arvf.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, java.lang.Object] */
    public asmb(asmb asmbVar, byte[] bArr) {
        this.b = new HashMap((Map) asmbVar.b);
        this.a = new HashMap((Map) asmbVar.a);
    }

    public asmb() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public asmb(Executor executor, byte[] bArr) {
        this.b = new tm();
        this.a = executor;
    }

    public asmb(String str) {
        this.a = a.bW(str, "-----BEGIN ", "-----");
        this.b = a.bW(str, "-----END ", "-----");
    }

    public asmb(Executor executor) {
        this.b = new tm();
        this.a = executor;
    }
}
