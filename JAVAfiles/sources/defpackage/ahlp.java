package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Matcher;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahlp {
    public final Object a;

    public ahlp(algw algwVar) {
        this.a = algwVar;
    }

    public static Object J(Deque deque) {
        Iterator it = (Iterator) deque.getFirst();
        if (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            return next;
        }
        deque.removeFirst();
        return null;
    }

    public static ahlp k(ListenableFuture listenableFuture) {
        return new ahlp(ancj.f(listenableFuture, new ajwz(18), andi.a));
    }

    public static ahlp l(ListenableFuture listenableFuture) {
        return new ahlp(ancj.f(listenableFuture, new algm(null), andi.a));
    }

    public static ahlp m(apbt apbtVar) {
        return new ahlp(new ProtoParsers$InternalDontUse(null, apbtVar));
    }

    public final /* synthetic */ amoq A() {
        apag s = ((aozy) this.a).s();
        s.getClass();
        return (amoq) s;
    }

    public final void B(amos amosVar) {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amoq amoqVar = (amoq) aozyVar.b;
        amoq amoqVar2 = amoq.a;
        amoqVar.f = amosVar;
        amoqVar.e = 206;
    }

    public final void C(amox amoxVar) {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amoq amoqVar = (amoq) aozyVar.b;
        amoq amoqVar2 = amoq.a;
        amoqVar.f = amoxVar;
        amoqVar.e = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
    }

    public final void D(ampa ampaVar) {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amoq amoqVar = (amoq) aozyVar.b;
        amoq amoqVar2 = amoq.a;
        amoqVar.d = ampaVar;
        amoqVar.c = 102;
    }

    public final void E(ampm ampmVar) {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amoq amoqVar = (amoq) aozyVar.b;
        amoq amoqVar2 = amoq.a;
        amoqVar.f = ampmVar;
        amoqVar.e = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
    }

    public final void F(amqj amqjVar) {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amoq amoqVar = (amoq) aozyVar.b;
        amoq amoqVar2 = amoq.a;
        amoqVar.d = amqjVar;
        amoqVar.c = 101;
    }

    public final void G(ampq ampqVar) {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amoq amoqVar = (amoq) aozyVar.b;
        amoq amoqVar2 = amoq.a;
        amoqVar.f = ampqVar;
        amoqVar.e = BasePaymentResult.ERROR_REQUEST_TIMEOUT;
    }

    public final void H(int i) {
        Object obj = this.a;
        aozy aozyVar = (aozy) obj;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amfb amfbVar = (amfb) ((amfa) obj).b;
        amfb amfbVar2 = amfb.a;
        amfbVar.d = i - 1;
        amfbVar.b |= 2;
    }

    public final void I(int i) {
        Object obj = this.a;
        aozy aozyVar = (aozy) obj;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amfb amfbVar = (amfb) ((amfa) obj).b;
        amfb amfbVar2 = amfb.a;
        amfbVar.c = i - 1;
        amfbVar.b |= 1;
    }

    public final void K(Object obj, int i) {
        try {
            ((Field) this.a).set(obj, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    public final void L(Object obj, Object obj2) {
        try {
            ((Field) this.a).set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    public final void M(alst alstVar) {
        albo.N(!alstVar.i(), "range must not be empty, but was %s", alstVar);
        this.a.add(alstVar);
    }

    public final void a(ahlo ahloVar) {
        ahloVar.getClass();
        Object obj = ((ahlp) this.a).a;
        int i = ahlq.c;
        ((ahlq) obj).a.add(ahloVar);
    }

    public final void b(ahlo ahloVar) {
        Object obj = ((ahlp) this.a).a;
        int i = ahlq.c;
        ((ahlq) obj).a.remove(ahloVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c(android.net.Uri r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L8
            java.lang.String r3 = r2.toString()
            goto Lc
        L8:
            if (r3 != 0) goto Lc
            r2 = r0
            goto L16
        Lc:
            java.lang.Object r2 = r1.a
            vl r2 = (defpackage.vl) r2
            java.lang.Object r2 = r2.get(r3)
            vl r2 = (defpackage.vl) r2
        L16:
            if (r2 != 0) goto L19
            return r0
        L19:
            if (r4 == 0) goto L23
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r4.concat(r3)
        L23:
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahlp.c(android.net.Uri, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public final String d(String str) {
        return (String) ((LinkedHashMap) this.a).get(str);
    }

    public final void e(String str, String str2) {
        ((LinkedHashMap) this.a).put(str, str2);
    }

    public final HttpURLConnection f(String str, String str2) {
        advr.c("Creating a HTTP connection for file transfer to %s, connect timeout %dms, read timeout %dms, method %s", str2, 15000, 10000, "GET");
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestProperty("User-Agent", str);
        SSLSocketFactory c = ((aigy) this.a).c();
        if (!(httpURLConnection instanceof HttpsURLConnection)) {
            advr.o("Content server connection is not HTTPS, nothing to be done.", new Object[0]);
        } else {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            URL url = httpURLConnection.getURL();
            if (url == null) {
                advr.q("URL is null. Cannot set security for content server connection.", new Object[0]);
            } else {
                advr.o("Creating a content server connection for host: %s", url.getHost());
                try {
                    httpsURLConnection.setSSLSocketFactory(c);
                } catch (IllegalArgumentException e) {
                    advr.i(e, "Unable to set security for content server connection", new Object[0]);
                }
            }
        }
        return httpURLConnection;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [apwt, java.lang.Object] */
    public final String g() {
        return "";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set, java.lang.Object] */
    public final boolean h(String str) {
        int i = agqa.a;
        if (this.a.contains(str)) {
            return true;
        }
        return false;
    }

    public final arpi i(ScheduledExecutorService scheduledExecutorService) {
        return j(scheduledExecutorService, new akrv(0));
    }

    public final arpi j(ScheduledExecutorService scheduledExecutorService, aksb aksbVar) {
        arpi plus;
        Boolean bool = true;
        bool.getClass();
        if (((Boolean) ((algw) this.a).d(false)).booleanValue()) {
            plus = new arxf(new akdt(scheduledExecutorService)).plus(akds.a);
        } else {
            akdq akdqVar = new akdq(scheduledExecutorService);
            plus = new arxf(akdqVar).plus(akdqVar);
        }
        return plus.plus(aktp.h(aksbVar, false, 6));
    }

    public final /* synthetic */ amty n() {
        apag s = ((aozy) this.a).s();
        s.getClass();
        return (amty) s;
    }

    public final /* synthetic */ amsm o() {
        apag s = ((aozy) this.a).s();
        s.getClass();
        return (amsm) s;
    }

    public final void p(amrj amrjVar) {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amsm amsmVar = (amsm) aozyVar.b;
        amsm amsmVar2 = amsm.a;
        amsmVar.g = amrjVar;
        amsmVar.b |= 32;
    }

    public final void q(long j) {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amsm amsmVar = (amsm) aozyVar.b;
        amsm amsmVar2 = amsm.a;
        amsmVar.b |= 1;
        amsmVar.c = j;
    }

    public final /* synthetic */ void r(Iterable iterable) {
        iterable.getClass();
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amsm amsmVar = (amsm) aozyVar.b;
        amsm amsmVar2 = amsm.a;
        apax apaxVar = amsmVar.d;
        if (!apaxVar.c()) {
            amsmVar.d = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, amsmVar.d);
    }

    public final /* synthetic */ void s() {
        DesugarCollections.unmodifiableList(((amsm) ((aozy) this.a).b).d).getClass();
    }

    public final /* synthetic */ ampm t() {
        apag s = ((aozy) this.a).s();
        s.getClass();
        return (ampm) s;
    }

    public final void u(ampd ampdVar) {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ampm ampmVar = (ampm) aozyVar.b;
        ampm ampmVar2 = ampm.a;
        ampmVar.d = ampdVar;
        ampmVar.c = 101;
    }

    public final void v(amph amphVar) {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ampm ampmVar = (ampm) aozyVar.b;
        ampm ampmVar2 = ampm.a;
        ampmVar.d = amphVar;
        ampmVar.c = 104;
    }

    public final void w(int i) {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ampm ampmVar = (ampm) aozyVar.b;
        ampm ampmVar2 = ampm.a;
        ampmVar.b |= 2;
        ampmVar.f = i;
    }

    public final void x(String str) {
        str.getClass();
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ampm ampmVar = (ampm) aozyVar.b;
        ampm ampmVar2 = ampm.a;
        ampmVar.b |= 8;
        ampmVar.g = str;
    }

    public final void y(ampk ampkVar) {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ampm ampmVar = (ampm) aozyVar.b;
        ampm ampmVar2 = ampm.a;
        ampmVar.d = ampkVar;
        ampmVar.c = 105;
    }

    public final void z(int i) {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ampm ampmVar = (ampm) aozyVar.b;
        ampm ampmVar2 = ampm.a;
        ampmVar.b |= 1;
        ampmVar.e = i;
    }

    public ahlp(Object obj) {
        this.a = obj;
    }

    public ahlp(byte[] bArr) {
        this.a = "510";
    }

    public ahlp() {
        this.a = new ConcurrentHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.ComponentCallbacks, java.lang.Object] */
    public ahlp(Context context, ahlp ahlpVar) {
        this.a = ahlpVar;
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(ahlpVar.a);
        application.registerComponentCallbacks(ahlpVar.a);
    }

    public ahlp(ListenableFuture listenableFuture, akfn akfnVar) {
        aiut.c();
        listenableFuture.getClass();
        this.a = listenableFuture;
        akfnVar.getClass();
    }

    public ahlp(char[] cArr) {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    public ahlp(Optional optional, Optional optional2, Optional optional3) {
        atki atkiVar = new atki(null);
        this.a = atkiVar;
        optional2.ifPresent(new aidg(atkiVar, 11));
        optional3.ifPresent(new aidg(atkiVar, 12));
        optional.ifPresent(new aidg(atkiVar, 13));
    }

    public ahlp(Set set) {
        set.getClass();
        this.a = set;
    }

    public ahlp(short[] sArr) {
        Set N = alzz.N();
        N.getClass();
        this.a = N;
    }

    public ahlp(apwt apwtVar) {
        apwtVar.getClass();
        this.a = apwtVar;
    }

    public ahlp(byte[] bArr, byte[] bArr2) {
        this.a = new LinkedHashMap();
    }

    public ahlp(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new asgm();
    }

    public ahlp(Matcher matcher) {
        matcher.getClass();
        this.a = matcher;
    }

    public ahlp(byte[] bArr, char[] cArr) {
        this.a = new ArrayList();
    }

    public ahlp(Field field) {
        this.a = field;
        field.setAccessible(true);
    }

    public ahlp(int[] iArr) {
        this.a = new amah(amag.INSERTION);
        new amah(amag.UNORDERED);
    }
}
