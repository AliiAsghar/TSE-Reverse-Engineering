package defpackage;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iba {
    public Object a;
    public final Object b;

    public iba(Object obj) {
        this.b = obj;
    }

    public final void a() {
        if (this.a == null) {
            akrh f = aktp.f("Fetch PseudonymousAccount", akrk.a);
            try {
                ListenableFuture x = ((ahiy) this.b).x();
                f.b(x);
                armd.i(f, null);
                this.a = akul.g(x);
            } finally {
            }
        }
    }

    public final Bundle b(String str) {
        Bundle bundle;
        gka gkaVar = (gka) this.b;
        if (gkaVar.e) {
            Bundle bundle2 = gkaVar.d;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2.containsKey(str)) {
                if (bundle2.containsKey(str)) {
                    bundle = bundle2.getBundle(str);
                    if (bundle == null) {
                        throw new IllegalStateException(a.bW(str, "Saved state key '", "' was not found"));
                    }
                } else {
                    throw new IllegalStateException(a.bW(str, "Saved state key '", "' was not found"));
                }
            } else {
                bundle = null;
            }
            bundle2.remove(str);
            if (bundle2.isEmpty()) {
                gkaVar.d = null;
                return bundle;
            }
            return bundle;
        }
        throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
    }

    public final void c(String str, gjy gjyVar) {
        gjyVar.getClass();
        Object obj = this.b;
        synchronized (((gka) obj).g) {
            if (!((gka) obj).b.containsKey(str)) {
                ((gka) obj).b.put(str, gjyVar);
            } else {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }
    }

    public final void d(Class cls) {
        if (((gka) this.b).f) {
            Object obj = this.a;
            if (obj == null) {
                obj = new gjv(this);
            }
            this.a = obj;
            try {
                cls.getDeclaredConstructor(null);
                Object obj2 = this.a;
                if (obj2 != null) {
                    String name = cls.getName();
                    name.getClass();
                    ((gjv) obj2).a.add(name);
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public final boolean e() {
        return ((gka) this.b).e;
    }

    public final gjy f() {
        gjy gjyVar;
        Object obj = this.b;
        synchronized (((gka) obj).g) {
            Iterator it = ((gka) obj).b.entrySet().iterator();
            do {
                gjyVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                gjy gjyVar2 = (gjy) entry.getValue();
                if (true == d.F(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    gjyVar = gjyVar2;
                }
            } while (gjyVar == null);
        }
        return gjyVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ascc] */
    public final void g(gef gefVar) {
        this.a = gefVar;
        this.b.h(gefVar);
    }

    public iba() {
        this.b = asck.e(1, 0, 2, 2);
    }
}
