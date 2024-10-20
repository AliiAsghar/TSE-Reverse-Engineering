package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absv {
    public Bundle b;
    private final Map c = DesugarCollections.synchronizedMap(new tm());
    public int a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, int i2, Intent intent) {
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((abss) it.next()).c(i, i2, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Bundle bundle) {
        Bundle bundle2;
        this.a = 1;
        this.b = bundle;
        for (Map.Entry entry : this.c.entrySet()) {
            abss abssVar = (abss) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            abssVar.d(bundle2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.a = 5;
        for (abss abssVar : this.c.values()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.a = 3;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((abss) it.next()).h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : this.c.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((abss) entry.getValue()).g(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        this.a = 2;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((abss) it.next()).i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.a = 4;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((abss) it.next()).j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(abss abssVar) {
        if (!this.c.containsKey("ConnectionlessLifecycleHelper")) {
            this.c.put("ConnectionlessLifecycleHelper", abssVar);
            if (this.a > 0) {
                new acda(Looper.getMainLooper()).post(new aauq(this, abssVar, 8));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        for (abss abssVar : this.c.values()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final abss j(Class cls) {
        return (abss) cls.cast(this.c.get("ConnectionlessLifecycleHelper"));
    }
}
