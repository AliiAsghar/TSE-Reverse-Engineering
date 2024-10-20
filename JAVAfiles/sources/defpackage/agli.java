package defpackage;

import android.os.Process;
import android.os.StrictMode;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agli implements aglh {
    private final Map b = new ConcurrentHashMap();
    private final agle c;
    private final AtomicInteger d;
    private final AtomicInteger e;
    private volatile aglc f;

    public agli(agle agleVar) {
        new ConcurrentHashMap();
        this.d = new AtomicInteger();
        this.e = new AtomicInteger();
        this.c = agleVar;
        this.f = aglc.a;
    }

    @Override // defpackage.aglh
    public final aglf a() {
        ArrayList arrayList = new ArrayList(this.b.size());
        ArrayList arrayList2 = new ArrayList(this.b.size());
        for (Map.Entry entry : this.b.entrySet()) {
            arrayList.add((agld) entry.getValue());
            arrayList2.add(Integer.valueOf(((agld) entry.getValue()).a));
        }
        List b = aglb.b(arrayList2);
        HashMap aj = alzz.aj(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            aj.put(Long.valueOf(((agld) arrayList.get(i)).b), (aglc) b.get(i));
        }
        aglc aglcVar = this.f;
        if (aglcVar.b != 0 || aglcVar.c != 0 || aglcVar.d != 0) {
            aj.put(0L, this.f);
        }
        agle agleVar = this.c;
        AtomicInteger atomicInteger = this.d;
        AtomicInteger atomicInteger2 = this.e;
        return new aglf(agleVar.a, aj, atomicInteger.get(), atomicInteger2.get());
    }

    @Override // defpackage.aglh
    public final void b() {
        this.e.getAndIncrement();
    }

    @Override // defpackage.aglh
    public final void c() {
        this.d.getAndIncrement();
    }

    @Override // defpackage.aglh
    public final void d(long j) {
        agld agldVar = (agld) this.b.remove(Long.valueOf(j));
        if (agldVar != null) {
            int i = agldVar.a;
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                aglc a = aglb.a(new File(String.format(Locale.US, "/proc/self/task/%d/schedstat", Integer.valueOf(i))));
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                if (a != aglc.a) {
                    aglc aglcVar = this.f;
                    this.f = new aglc(aglcVar.b + a.b, aglcVar.c + a.c, aglcVar.d + a.d);
                }
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th;
            }
        }
    }

    @Override // defpackage.aglh
    public final void e(long j) {
        Map map = this.b;
        Long valueOf = Long.valueOf(j);
        if (map.containsKey(valueOf)) {
            return;
        }
        this.b.put(valueOf, new agld(Process.myTid(), j, Thread.currentThread().getName(), this.c.a));
    }
}
