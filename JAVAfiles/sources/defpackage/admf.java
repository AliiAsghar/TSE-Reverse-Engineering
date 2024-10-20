package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class admf {
    public final String e;
    public final Map f;
    public final Map g;
    public final arwe h;
    public final arpi i;
    public final Map j;
    public final Deque k;
    public final Deque l;
    public final ArrayList m;
    public final ArrayList n;
    public final Deque o;
    public final AtomicReference p;
    public final AtomicBoolean q;
    public Object r;
    public final ArrayList s;
    public final AtomicBoolean t;
    public List u;
    public List v;
    public final asgm w;
    public final ahlp y;
    public static final adom x = new adom();
    public static final acyz a = acyy.b("enable_state_machine_v2");
    public static final acyz b = acyy.b("crash_on_unhandled_state_machine_message");
    public static final acyz c = acyy.b("is_state_machine_v2_executing");
    private static final acyz z = acyy.b("crash_on_multiple_transitioning_requests");
    public static final alvi d = alvi.m("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2");

    public admf(String str, Map map, Map map2, arwe arweVar, arpi arpiVar) {
        str.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        this.e = str;
        this.f = map;
        this.g = map2;
        this.h = arweVar;
        this.i = arpiVar;
        alpt<Map.Entry> entrySet = ((alor) map).entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrn.r(aqjn.i(aqjn.J(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            armo armoVar = new armo(entry.getKey(), new adtl(entry.getKey(), (admc) entry.getValue()));
            linkedHashMap.put(armoVar.a, armoVar.b);
        }
        this.j = linkedHashMap;
        this.k = new ConcurrentLinkedDeque();
        this.l = new ConcurrentLinkedDeque();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ConcurrentLinkedDeque();
        this.p = new AtomicReference(admd.a);
        this.q = new AtomicBoolean(false);
        this.w = new asgm();
        this.y = new ahlp(null, null, null, null);
        this.s = new ArrayList();
        this.t = new AtomicBoolean(false);
        this.u = new ArrayList();
        this.v = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [admc, java.lang.Object] */
    public final admc a() {
        adtl i = i();
        if (i != null) {
            return i.c;
        }
        return null;
    }

    public final ListenableFuture b(Object obj, Object obj2) {
        obj.getClass();
        return arro.E(albo.ax(this.h, this.y, new wiu(this, obj, obj2, (arpe) null, 19)));
    }

    public final ListenableFuture c(Object obj) {
        obj.getClass();
        this.o.add(new armo(d(), obj));
        if (this.o.size() > 1) {
            if (this.t.get() && ((Boolean) z.a()).booleanValue()) {
                throw new IllegalStateException("Current state " + d() + " and its parents requested to transition to more than 1 state. Requests: " + this.o);
            }
            ((alvg) d.i().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2", "transitionToAsync", 253, "StateMachineV2.kt")).D("Current state %s and its parents requested to transition to more than 1 state. Requests: %s", d(), this.o);
        }
        return arro.E(albo.ax(this.h, this.y, new zez(this, obj, (arpe) null, 20)));
    }

    public final Object d() {
        adtl i = i();
        if (i != null) {
            return i.b;
        }
        return null;
    }

    public final Object e(Object obj, Object obj2, arpe arpeVar) {
        Object q = arro.q(this.i, new yiv(this, obj, obj2, (arpe) null, 4), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    public final Object f(Object obj, arpe arpeVar) {
        Object q = arro.q(this.i, new adme(this, obj, null), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    public final void g(Object obj, Object obj2) {
        obj.getClass();
        this.l.addLast(new armo(obj, obj2));
        ((alvg) d.g().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2", "deferMessage", 345, "StateMachineV2.kt")).t("Added deferred %s", obj);
    }

    public final boolean h() {
        return this.q.get();
    }

    public final adtl i() {
        return (adtl) this.k.peekLast();
    }

    public final String toString() {
        admd admdVar = (admd) this.p.get();
        if (admdVar != null) {
            int ordinal = admdVar.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return "name=" + this.e + " state=" + d();
                }
            } else {
                return "name=" + this.e + " state=initializing";
            }
        }
        return "name=" + this.e + " state=not_initialized";
    }
}
