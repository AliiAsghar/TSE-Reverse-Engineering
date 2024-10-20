package defpackage;

import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akbn {
    public static final AtomicInteger a = new AtomicInteger(123051698);
    public final tm b = new tm();
    public final tm c = new tm();
    private final String d;

    public akbn(String str) {
        d.t(!albo.ah(str), "mapKey must be a non-empty, non-null static String unique to the class using CallbackIdMap.");
        this.d = str;
    }

    public final int a(Object obj) {
        boolean z;
        aiut.c();
        Integer num = (Integer) this.c.get(obj.getClass());
        boolean z2 = true;
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        albo.X(z, "The callback %s has not been registered", obj.getClass());
        if (b(num.intValue()) != obj) {
            z2 = false;
        }
        albo.X(z2, "The callback class %s was registered using a different instance. The instance registered in onCreate() must be the same instance used to listen. You can use a final member variable to safely hold the callback reference for each lifecycle.", obj.getClass());
        return num.intValue();
    }

    public final Object b(int i) {
        aiut.c();
        Object obj = this.b.get(Integer.valueOf(i));
        if (obj == null) {
            for (Map.Entry entry : this.c.entrySet()) {
                if (((Integer) entry.getValue()).intValue() == i) {
                    throw new NullPointerException("Callback not re-registered for: ".concat(String.valueOf(((Class) entry.getKey()).getName())));
                }
            }
        }
        obj.getClass();
        return obj;
    }

    public final void c() {
        aiut.c();
        this.b.clear();
    }

    public final void d(Object obj) {
        boolean z;
        aiut.c();
        tm tmVar = this.c;
        Class<?> cls = obj.getClass();
        if (tmVar.containsKey(cls)) {
            Integer num = (Integer) this.c.get(cls);
            num.intValue();
            if (this.b.put(num, obj) == null) {
                z = true;
            } else {
                z = false;
            }
            albo.X(z, "Attempted to register the callback class %s twice for one `Fragment`. A callback class' type is used to uniquely identify the callback and make sure it's reregistered after a configuration change, preventing state loss after a configuration change. See http://go/tiktok-futures#limitations or http://go/tiktok/dev/dataservice/subscriptionmixin#best-practices. This check can also trigger if new callback classes are registered after process death and recreation from save instance state. This most often happens when experiment flags change. See b/224812898.", cls);
            return;
        }
        int andIncrement = a.getAndIncrement();
        tm tmVar2 = this.c;
        Integer valueOf = Integer.valueOf(andIncrement);
        tmVar2.put(cls, valueOf);
        this.b.put(valueOf, obj);
    }

    public final void e(Bundle bundle) {
        boolean z;
        aiut.c();
        if (bundle != null) {
            String concat = "CallbackIdMap.classes".concat(this.d);
            albo.U(bundle.containsKey(concat), "CallbackIdMap writes its keys unconditionally. It did not find its state on restore, which suggests state loss.");
            String str = this.d;
            String[] stringArray = bundle.getStringArray(concat);
            int[] intArray = bundle.getIntArray("CallbackIdMap.class_ids".concat(str));
            for (int i = 0; i < stringArray.length; i++) {
                try {
                    Integer num = (Integer) this.c.put(Class.forName(stringArray[i]), Integer.valueOf(intArray[i]));
                    if (num != null) {
                        int intValue = num.intValue();
                        int i2 = intArray[i];
                        if (intValue == i2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        albo.aa(z, "Callback ID for class %s was restored with ID %s, but had an existing mapping of %s. Always register for FuturesMixin callbacks and subscribe to SubscriptionMixin callbacks in onCreate()! Do *not* subscribe in a Peer's constructor", stringArray[i], Integer.valueOf(i2), num);
                    }
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public final void f(Bundle bundle) {
        aiut.c();
        String concat = "CallbackIdMap.classes".concat(this.d);
        albo.X(!bundle.containsKey(concat), "Bundle already contains key %s. This suggests that two instances of CallbackIdMap were created with the same key in the same Fragment or Activity. This creates state store/restore collisions. Check for bugs where the same mixin is created for a Fragment twice during one lifecycle.", concat);
        tm tmVar = this.c;
        int i = tmVar.d;
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        int i2 = 0;
        for (Map.Entry entry : tmVar.entrySet()) {
            strArr[i2] = ((Class) entry.getKey()).getName();
            iArr[i2] = ((Integer) entry.getValue()).intValue();
            i2++;
        }
        bundle.putStringArray(concat, strArr);
        bundle.putIntArray("CallbackIdMap.class_ids".concat(this.d), iArr);
    }

    public final void g() {
        aiut.c();
        for (Map.Entry entry : this.c.entrySet()) {
            albo.X(this.b.containsKey((Integer) entry.getValue()), "Did not restore a callback for %s. You must re-register all callbacks you previously had after a configuration change, so that you don't lose user state.", entry.getKey());
        }
    }
}
