package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adur {
    public final Map a = new HashMap();
    final /* synthetic */ adut b;

    public adur(adut adutVar) {
        this.b = adutVar;
    }

    public final void a() {
        int i;
        Object obj;
        adus adusVar = new adus();
        synchronized (this.b) {
            adut adutVar = this.b;
            if (adutVar.e > 0) {
                adutVar.d = new HashMap(adutVar.d);
            }
            adut adutVar2 = this.b;
            adusVar.a = adutVar2.d;
            adutVar2.e++;
            synchronized (this) {
                for (Map.Entry entry : this.a.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == this) {
                        if (this.b.d.containsKey(str)) {
                            this.b.d.remove(str);
                        }
                    } else if (!this.b.d.containsKey(str) || (obj = this.b.d.get(str)) == null || !obj.equals(value)) {
                        this.b.d.put(str, value);
                    }
                }
                this.a.clear();
            }
        }
        adut adutVar3 = this.b;
        adhc adhcVar = new adhc(adutVar3, adusVar, 4);
        synchronized (adutVar3) {
            i = adutVar3.e;
        }
        if (i == 1) {
            adhcVar.run();
        } else {
            adut.a.execute(adhcVar);
        }
        try {
            adusVar.b.await();
            boolean z = adusVar.c;
        } catch (InterruptedException unused) {
        }
    }
}
