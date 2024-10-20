package defpackage;

import android.text.TextUtils;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aohh implements aohi {
    public static final Object a = new Object();
    private static final ThreadFactory g = new adnj(3, (short[]) null);
    public final aodi b;
    public final aohv c;
    public final aohs d;
    public final aohp e;
    public final aohr f;
    private final Object h;
    private final ExecutorService i;
    private final ExecutorService j;
    private String k;
    private final Set l;
    private final List m;

    public aohh(aodi aodiVar, aohf aohfVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = g;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactory);
        aohv aohvVar = new aohv(aodiVar.a(), aohfVar);
        aohs aohsVar = new aohs(aodiVar);
        aohp b = aohp.b();
        aohr aohrVar = new aohr(aodiVar);
        int i = aohn.a;
        this.h = new Object();
        this.l = new HashSet();
        this.m = new ArrayList();
        this.b = aodiVar;
        this.c = aohvVar;
        this.d = aohsVar;
        this.e = b;
        this.f = aohrVar;
        this.i = threadPoolExecutor;
        this.j = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
    }

    private final synchronized String k() {
        return this.k;
    }

    private final void l(aoho aohoVar) {
        synchronized (this.h) {
            this.m.add(aohoVar);
        }
    }

    private final void m() {
        abhg.l(c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        abhg.l(d(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        abhg.l(b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String c = c();
        long j = aohp.a;
        d.t(c.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        d.t(aohp.b.matcher(b()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // defpackage.aohi
    public final acir a() {
        m();
        String k = k();
        if (k != null) {
            return actx.s(k);
        }
        acit acitVar = new acit();
        l(new aohl(acitVar));
        Object obj = acitVar.a;
        this.i.execute(new akwm(this, 11));
        return (acir) obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b() {
        return this.b.c().a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String c() {
        return this.b.c().b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d() {
        return this.b.c().d;
    }

    public final void e(Exception exc) {
        synchronized (this.h) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                if (((aoho) it.next()).a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void f(aohu aohuVar) {
        synchronized (this.h) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                if (((aoho) it.next()).b(aohuVar)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void g(String str) {
        this.k = str;
    }

    public final synchronized void h(aohu aohuVar, aohu aohuVar2) {
        if (this.l.size() != 0 && !aohuVar.a.equals(aohuVar2.a)) {
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                ((aohq) it.next()).a();
            }
        }
    }

    public final void i() {
        aohu a2;
        String str;
        String string;
        synchronized (a) {
            asmb z = asmb.z(this.b.a());
            try {
                a2 = this.d.a();
                if (a2.c()) {
                    if ((this.b.e().equals("CHIME_ANDROID_SDK") || this.b.i()) && a2.g == 1) {
                        aohr aohrVar = this.f;
                        synchronized (aohrVar.b) {
                            synchronized (aohrVar.b) {
                                str = null;
                                string = aohrVar.b.getString("|S|id", null);
                            }
                            if (string == null) {
                                synchronized (aohrVar.b) {
                                    String string2 = aohrVar.b.getString("|S||P|", null);
                                    if (string2 != null) {
                                        PublicKey b = aohr.b(string2);
                                        if (b != null) {
                                            str = aohr.a(b);
                                        }
                                    }
                                }
                                string = str;
                            }
                        }
                        if (TextUtils.isEmpty(string)) {
                            string = aohn.a();
                        }
                    } else {
                        string = aohn.a();
                    }
                    aohs aohsVar = this.d;
                    aoht aohtVar = new aoht(a2);
                    aohtVar.a = string;
                    aohtVar.c(3);
                    a2 = aohtVar.a();
                    aohsVar.b(a2);
                }
            } finally {
                if (z != null) {
                    z.w();
                }
            }
        }
        f(a2);
        this.j.execute(new Runnable() { // from class: aohg
            /* JADX WARN: Removed duplicated region for block: B:81:0x00fa  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0187 A[Catch: aohj -> 0x0188, TRY_ENTER, TRY_LEAVE, TryCatch #0 {aohj -> 0x0188, blocks: (B:11:0x001b, B:13:0x0023, B:15:0x0029, B:17:0x0031, B:23:0x0050, B:55:0x0061, B:56:0x0068, B:57:0x0069, B:58:0x006f, B:59:0x008c, B:61:0x008e, B:63:0x0093, B:65:0x009b, B:66:0x009f, B:79:0x00e0, B:83:0x00fe, B:84:0x0103, B:85:0x010a, B:86:0x010b, B:87:0x0187, B:100:0x00de, B:68:0x00a0, B:70:0x00a5, B:72:0x00b9, B:75:0x00bf, B:89:0x00c7, B:77:0x00d4, B:93:0x00d7, B:96:0x00da), top: B:10:0x001b, inners: #4 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 407
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aohg.run():void");
            }
        });
    }

    @Override // defpackage.aohi
    public final acir j() {
        m();
        acit acitVar = new acit();
        l(new aohk(this.e, acitVar));
        Object obj = acitVar.a;
        this.i.execute(new akwm(this, 12));
        return (acir) obj;
    }
}
