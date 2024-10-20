package defpackage;

import android.os.StrictMode;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahcg {
    public final anen a;
    public final ahcd b;
    private final armf c;
    private final Set d;
    private final Executor e;
    private volatile alor f;

    public ahcg(anen anenVar, armf armfVar, Set set, ahcd ahcdVar) {
        this.a = anenVar;
        this.c = armfVar;
        this.d = set;
        this.b = ahcdVar;
        this.e = new anew(anenVar);
        albo.U(!set.isEmpty(), "No logging result handlers provided.");
    }

    public static ListenableFuture c(agrk agrkVar, ahch ahchVar) {
        try {
            return ahchVar.b(agrkVar);
        } catch (Throwable th) {
            return albo.bH(th);
        }
    }

    private final void d(ListenableFuture listenableFuture) {
        aluq listIterator = ((altx) this.d).listIterator();
        while (listIterator.hasNext()) {
            albo.bR(listenableFuture, new pum(17), andi.a);
        }
    }

    public final List a(Class cls) {
        alor alorVar = this.f;
        if (alorVar == null) {
            synchronized (this) {
                alorVar = this.f;
                if (alorVar == null) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (ahch ahchVar : (Set) this.c.b()) {
                        if (ahchVar.a().isEmpty()) {
                            arrayList.add(ahchVar);
                        } else {
                            aluq listIterator = ((altx) ahchVar.a()).listIterator();
                            while (listIterator.hasNext()) {
                                Class cls2 = (Class) listIterator.next();
                                List list = (List) hashMap.get(cls2);
                                if (list == null) {
                                    list = new ArrayList();
                                    hashMap.put(cls2, list);
                                }
                                list.add(ahchVar);
                            }
                        }
                    }
                    hashMap.put(ahci.class, arrayList);
                    alorVar = alor.j(hashMap);
                    this.f = alorVar;
                }
            }
        }
        int i = alog.d;
        return (List) alorVar.getOrDefault(cls, alsx.a);
    }

    public final void b(ahcf ahcfVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).detectAll().build());
        try {
            try {
                List a = ahcfVar.a();
                if (a != null) {
                    if (!a.isEmpty()) {
                        d(ancj.g(albo.bM(akto.k(new ahes(this, a, 1)), this.e), akto.d(new ahce(this, 0)), this.e));
                    }
                }
            } catch (Throwable th) {
                ListenableFuture bH = albo.bH(th);
                albo.bH(th);
                d(bH);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
