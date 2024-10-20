package androidx.work.impl;

import defpackage.ghm;
import defpackage.ghv;
import defpackage.gig;
import defpackage.gkg;
import defpackage.gut;
import defpackage.guu;
import defpackage.guv;
import defpackage.guw;
import defpackage.gux;
import defpackage.guy;
import defpackage.guz;
import defpackage.gva;
import defpackage.gvb;
import defpackage.gvf;
import defpackage.gxq;
import defpackage.gxs;
import defpackage.gxu;
import defpackage.gxw;
import defpackage.gxx;
import defpackage.gxz;
import defpackage.gyb;
import defpackage.gyf;
import defpackage.gyh;
import defpackage.gyj;
import defpackage.gyk;
import defpackage.gyo;
import defpackage.gyt;
import defpackage.gzn;
import defpackage.gzo;
import defpackage.gzr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile gyt k;
    private volatile gxq l;
    private volatile gzo m;
    private volatile gyb n;
    private volatile gyh o;
    private volatile gyk p;
    private volatile gxu q;
    private volatile gxx r;

    @Override // androidx.work.impl.WorkDatabase
    public final gyt A() {
        gyt gytVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new gzn(this);
            }
            gytVar = this.k;
        }
        return gytVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final gzo B() {
        gzo gzoVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new gzr(this);
            }
            gzoVar = this.m;
        }
        return gzoVar;
    }

    @Override // defpackage.gid
    public final ghv a() {
        return new ghv(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.gid
    public final gkg c(ghm ghmVar) {
        return ghmVar.c.a(gvf.bn(ghmVar.a, ghmVar.b, new gig(ghmVar, new gvb(this)), false, false));
    }

    @Override // defpackage.gid
    public final Map f() {
        HashMap hashMap = new HashMap();
        hashMap.put(gyt.class, Collections.emptyList());
        hashMap.put(gxq.class, Collections.emptyList());
        hashMap.put(gzo.class, Collections.emptyList());
        hashMap.put(gyb.class, Collections.emptyList());
        hashMap.put(gyh.class, Collections.emptyList());
        hashMap.put(gyk.class, Collections.emptyList());
        hashMap.put(gxu.class, Collections.emptyList());
        hashMap.put(gxx.class, Collections.emptyList());
        return hashMap;
    }

    @Override // defpackage.gid
    public final Set g() {
        return new HashSet();
    }

    @Override // defpackage.gid
    public final List s() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new gut());
        arrayList.add(new guu());
        arrayList.add(new guv());
        arrayList.add(new guw());
        arrayList.add(new gux());
        arrayList.add(new guy());
        arrayList.add(new guz());
        arrayList.add(new gva());
        return arrayList;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final gxq u() {
        gxq gxqVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new gxs(this);
            }
            gxqVar = this.l;
        }
        return gxqVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final gxu v() {
        gxu gxuVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new gxw(this);
            }
            gxuVar = this.q;
        }
        return gxuVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final gxx w() {
        gxx gxxVar;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new gxz(this);
            }
            gxxVar = this.r;
        }
        return gxxVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final gyb x() {
        gyb gybVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new gyf(this);
            }
            gybVar = this.n;
        }
        return gybVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final gyh y() {
        gyh gyhVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new gyj(this);
            }
            gyhVar = this.o;
        }
        return gyhVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final gyk z() {
        gyk gykVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new gyo(this);
            }
            gykVar = this.p;
        }
        return gykVar;
    }
}
