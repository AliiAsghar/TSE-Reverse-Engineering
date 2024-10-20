package defpackage;

import android.os.Looper;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akmc extends eor implements emx {
    public final Map a = new tm(2);
    public boolean b = false;
    public enm c = null;
    private final Map d = new tm();
    private boolean e = false;

    private final void b(enm enmVar) {
        boolean z;
        boolean z2 = false;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        Set set = (Set) this.a.remove(enmVar);
        if (set != null) {
            z2 = true;
        }
        albo.U(z2, "A LifecycleOwner was destroyed that was never observed, or was destroyed twice.");
        this.e = true;
        if (enmVar == this.c) {
            this.c = null;
        }
        Set keySet = this.d.keySet();
        keySet.getClass();
        set.getClass();
        alts altsVar = new alts(keySet, set);
        albo.X(altsVar.isEmpty(), "This lifecycle didn't call getOrCreate() for the following IDs: %s Each value must be retrieved exactly once each lifecycle, before the Lifecycle reaches STARTED. Is the calling code conditionally memoizing a value?", altsVar);
    }

    public final Object a(int i, enm enmVar, akmb akmbVar, akma akmaVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        eng a = enmVar.N().a();
        if (a == eng.INITIALIZED) {
            z2 = true;
        } else {
            z2 = false;
        }
        albo.X(z2, "Values may only be accessed during the INITIALIZED part of the LifecycleOwner's lifecycle. Each lifecycle must call getOrCreate() for each and only each value that the first LifecycleOwner instance called getOrCreate() for, exactly once. The current lifecycle state is %s", a);
        if (this.e) {
            Set set = (Set) this.a.get(enmVar);
            Integer valueOf = Integer.valueOf(i);
            albo.V(set.add(valueOf), "A value for idRes %s has already been gotten. Each lifecycle must call getOrCreate() for each value that the first lifecycle instance called getOrCreate() for, exactly once.", i);
            albo.V(this.d.containsKey(valueOf), "The first lifecycle didn't create a value for idRes %s. Is the LifecycleOwner accessing this value inside a conditional?", i);
            return ((alhm) this.d.get(valueOf)).a;
        }
        if (enmVar == this.c) {
            z3 = true;
        } else {
            z3 = false;
        }
        albo.U(z3, "A second Lifecycle started before the first lifecycle either started or was destroyed. This breaks a boundary condition assumption in TikTok. Please report it as a bug and include reproduction steps and a stack trace.");
        Object a2 = akmbVar.a();
        Map map = this.d;
        Integer valueOf2 = Integer.valueOf(i);
        if (map.put(valueOf2, new alhm(a2, akmaVar, null)) != null) {
            z4 = false;
        }
        albo.V(z4, "Input id %s was previously used. Each ID must be used exactly once each lifecycle.", i);
        albo.V(((Set) this.a.get(enmVar)).add(valueOf2), "A value was previously created for idRes %s. Each lifecycle must call getOrCreate() for each value that the first lifecycle instance called getOrCreate() for, exactly once.", i);
        return a2;
    }

    @Override // defpackage.emx
    public final void gF(enm enmVar) {
        b(enmVar);
        enmVar.N().d(this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [akma, java.lang.Object] */
    @Override // defpackage.eor
    public final void gi() {
        for (alhm alhmVar : this.d.values()) {
            alhmVar.b.a(alhmVar.a);
        }
    }

    @Override // defpackage.emx
    public final void h(enm enmVar) {
        b(enmVar);
        enmVar.N().d(this);
    }

    @Override // defpackage.emx
    public final /* synthetic */ void d(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gG(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void i(enm enmVar) {
    }
}
