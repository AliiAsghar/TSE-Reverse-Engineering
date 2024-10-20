package defpackage;

import android.app.ActivityManager;
import android.os.Process;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahpg implements ancr {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ ahpg(ahpj ahpjVar, int i, String str, ashu ashuVar, String str2, int i2) {
        this.f = i2;
        this.c = ahpjVar;
        this.b = i;
        this.d = str;
        this.e = ashuVar;
        this.a = str2;
    }

    @Override // defpackage.ancr
    public final ListenableFuture a() {
        long a;
        if (this.f != 0) {
            urr urrVar = (urr) this.d;
            urrVar.n.d();
            return (ListenableFuture) urrVar.f.c("WorkQueueWorkerImpl.startWork", new qzy(urrVar, this.a, (String) this.e, (upx) this.c, this.b, 3));
        }
        final ahpj ahpjVar = (ahpj) this.c;
        final ahoz ahozVar = (ahoz) ahpjVar.c.b();
        Object obj = this.d;
        final int i = this.b;
        if (ahpj.c(i)) {
            if (true != ahozVar.b()) {
                a = -1;
            } else {
                a = 1000;
            }
        } else {
            a = ahpjVar.d.a((String) obj);
        }
        if (a == -1) {
            return aneh.a;
        }
        if (ahozVar.c) {
            System.gc();
            System.runFinalization();
            System.gc();
        }
        Object obj2 = this.e;
        ListenableFuture bI = albo.bI(obj2);
        if (obj2 == null) {
            algw algwVar = ahozVar.b;
        }
        final String str = this.a;
        ListenableFuture f = ancd.f(anee.o(bI), RuntimeException.class, new ahnx(2), ahpjVar.b);
        final String str2 = (String) obj;
        final long j = a;
        return ancj.g(f, new ancs() { // from class: ahpi
            @Override // defpackage.ancs
            public final ListenableFuture a(Object obj3) {
                ashu ashuVar = (ashu) obj3;
                String str3 = str;
                int i2 = i;
                long j2 = j;
                String str4 = str2;
                ahpj ahpjVar2 = ahpj.this;
                if (ahozVar.a) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ahlv.a(ahpjVar2.a).getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return aneh.a;
                    }
                    ArrayList arrayList = new ArrayList(runningAppProcesses.size());
                    ahpjVar2.a.getPackageName();
                    boolean n = ahpjVar2.f.n(ahlv.b(ahpjVar2.a));
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        aozy createBuilder = asjt.a.createBuilder();
                        ashz b = ahpjVar2.e.b(i2, runningAppProcessInfo.pid, runningAppProcessInfo.processName, str3, n);
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        asjt asjtVar = (asjt) createBuilder.b;
                        b.getClass();
                        asjtVar.f = b;
                        asjtVar.b |= 8;
                        asjt asjtVar2 = (asjt) createBuilder.s();
                        ahmq a2 = ahmr.a();
                        a2.a = str4;
                        a2.c(true);
                        a2.d = Long.valueOf(j2);
                        a2.e(asjtVar2);
                        a2.b = ashuVar;
                        if (ahpj.c(i2)) {
                            a2.d(true);
                        }
                        arrayList.add(ahpjVar2.d.b(a2.a()));
                    }
                    return albo.bX(arrayList).a(new aidu(null, 18), andi.a);
                }
                aozy createBuilder2 = asjt.a.createBuilder();
                ahpl ahplVar = ahpjVar2.e;
                ashz b2 = ahplVar.b(i2, Process.myPid(), null, str3, ahplVar.b.n(ahlv.b(ahplVar.a)));
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                asjt asjtVar3 = (asjt) createBuilder2.b;
                b2.getClass();
                asjtVar3.f = b2;
                asjtVar3.b |= 8;
                asjt asjtVar4 = (asjt) createBuilder2.s();
                ahmq a3 = ahmr.a();
                a3.a = str4;
                a3.c(true);
                a3.d = Long.valueOf(j2);
                a3.e(asjtVar4);
                a3.b = ashuVar;
                if (ahpj.c(i2)) {
                    a3.d(true);
                }
                return ahpjVar2.d.b(a3.a());
            }
        }, ahpjVar.b);
    }

    public /* synthetic */ ahpg(urr urrVar, String str, String str2, upx upxVar, int i, int i2) {
        this.f = i2;
        this.d = urrVar;
        this.a = str;
        this.e = str2;
        this.c = upxVar;
        this.b = i;
    }
}
