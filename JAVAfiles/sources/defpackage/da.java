package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.FragmentContainerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class da {
    private ArrayList A;
    private final ecd C;
    private final ecd D;
    private final ecd E;
    private final ecd F;
    private final cm G;
    private rw H;
    private rw I;
    private boolean J;
    private ArrayList K;
    private ArrayList L;
    private ArrayList M;
    private final Runnable N;
    private final a O;
    private final qdq P;
    public rm e;
    final ArrayList k;
    public final CopyOnWriteArrayList l;
    int m;
    public cn n;
    public cl o;
    public cg p;
    cg q;
    public rw r;
    ArrayDeque s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public dc x;
    public final fdx y;
    private boolean z;
    public final ArrayList a = new ArrayList();
    public final di b = new di();
    ArrayList c = new ArrayList();
    public final co d = new co(this);
    bd f = null;
    boolean g = false;
    public final rg h = new cq(this);
    public final AtomicInteger i = new AtomicInteger();
    private final Map B = DesugarCollections.synchronizedMap(new HashMap());
    public final Map j = DesugarCollections.synchronizedMap(new HashMap());

    public da() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.k = new ArrayList();
        this.y = new fdx(this);
        this.l = new CopyOnWriteArrayList();
        this.C = new ch(this, 2);
        this.D = new ch(this, 3);
        this.E = new ch(this, 4);
        this.F = new ch(this, 5);
        this.P = new qdq(this, null);
        this.m = -1;
        this.G = new cr(this);
        this.O = new a();
        this.s = new ArrayDeque();
        this.N = new bo(this, 6, null);
    }

    public static boolean Y(int i) {
        if (Log.isLoggable("FragmentManager", i)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Set ah(bd bdVar) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < bdVar.d.size(); i++) {
            cg cgVar = ((dj) bdVar.d.get(i)).b;
            if (cgVar != null && bdVar.j) {
                hashSet.add(cgVar);
            }
        }
        return hashSet;
    }

    public static final boolean ai(cg cgVar) {
        if (!cgVar.M || !cgVar.N) {
            boolean z = false;
            for (cg cgVar2 : cgVar.D.b.f()) {
                if (cgVar2 != null) {
                    z = ai(cgVar2);
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    static final boolean aj(cg cgVar) {
        if (cgVar == null) {
            return true;
        }
        if (cgVar.N && (cgVar.B == null || aj(cgVar.E))) {
            return true;
        }
        return false;
    }

    static final void al(cg cgVar) {
        if (Y(2)) {
            Objects.toString(cgVar);
            Log.v("FragmentManager", "show: ".concat(String.valueOf(cgVar)));
        }
        if (cgVar.I) {
            cgVar.I = false;
            cgVar.U = !cgVar.U;
        }
    }

    private final ViewGroup ao(cg cgVar) {
        ViewGroup viewGroup = cgVar.P;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (cgVar.G > 0 && this.o.b()) {
            View a = this.o.a(cgVar.G);
            if (a instanceof ViewGroup) {
                return (ViewGroup) a;
            }
            return null;
        }
        return null;
    }

    private final Set ap() {
        HashSet hashSet = new HashSet();
        Iterator it = this.b.e().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((dg) it.next()).a.P;
            if (viewGroup != null) {
                hashSet.add(a.bu(viewGroup, an()));
            }
        }
        return hashSet;
    }

    private final void aq() {
        if (!ab()) {
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private final void ar() {
        this.z = false;
        this.L.clear();
        this.K.clear();
    }

    private final void as() {
        if (this.J) {
            this.J = false;
            ay();
        }
    }

    private final void at(boolean z) {
        if (!this.z) {
            if (this.n == null) {
                if (this.w) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.n.d.getLooper()) {
                if (!z) {
                    aq();
                }
                if (this.K == null) {
                    this.K = new ArrayList();
                    this.L = new ArrayList();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    /* JADX WARN: Removed duplicated region for block: B:338:0x0600 A[Catch: all -> 0x0672, LOOP:25: B:336:0x05fa->B:338:0x0600, LOOP_END, TryCatch #0 {, blocks: (B:260:0x04e0, B:261:0x04ef, B:263:0x04f5, B:265:0x0503, B:269:0x050c, B:273:0x050f, B:274:0x0513, B:276:0x0519, B:278:0x0523, B:280:0x052a, B:281:0x0535, B:283:0x0552, B:286:0x0558, B:290:0x053a, B:292:0x0541, B:293:0x054c, B:295:0x055e, B:297:0x0566, B:300:0x0578, B:302:0x0589, B:303:0x0590, B:305:0x059a, B:307:0x05a0, B:309:0x05ae, B:311:0x05b7, B:312:0x05bb, B:314:0x05c1, B:327:0x05d1, B:328:0x05da, B:330:0x05e0, B:332:0x05ec, B:335:0x05f5, B:336:0x05fa, B:338:0x0600, B:343:0x0613, B:345:0x061c, B:347:0x063c, B:348:0x065b, B:350:0x0665, B:356:0x0645, B:358:0x064f), top: B:259:0x04e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x061c A[Catch: all -> 0x0672, TryCatch #0 {, blocks: (B:260:0x04e0, B:261:0x04ef, B:263:0x04f5, B:265:0x0503, B:269:0x050c, B:273:0x050f, B:274:0x0513, B:276:0x0519, B:278:0x0523, B:280:0x052a, B:281:0x0535, B:283:0x0552, B:286:0x0558, B:290:0x053a, B:292:0x0541, B:293:0x054c, B:295:0x055e, B:297:0x0566, B:300:0x0578, B:302:0x0589, B:303:0x0590, B:305:0x059a, B:307:0x05a0, B:309:0x05ae, B:311:0x05b7, B:312:0x05bb, B:314:0x05c1, B:327:0x05d1, B:328:0x05da, B:330:0x05e0, B:332:0x05ec, B:335:0x05f5, B:336:0x05fa, B:338:0x0600, B:343:0x0613, B:345:0x061c, B:347:0x063c, B:348:0x065b, B:350:0x0665, B:356:0x0645, B:358:0x064f), top: B:259:0x04e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x063c A[Catch: all -> 0x0672, TryCatch #0 {, blocks: (B:260:0x04e0, B:261:0x04ef, B:263:0x04f5, B:265:0x0503, B:269:0x050c, B:273:0x050f, B:274:0x0513, B:276:0x0519, B:278:0x0523, B:280:0x052a, B:281:0x0535, B:283:0x0552, B:286:0x0558, B:290:0x053a, B:292:0x0541, B:293:0x054c, B:295:0x055e, B:297:0x0566, B:300:0x0578, B:302:0x0589, B:303:0x0590, B:305:0x059a, B:307:0x05a0, B:309:0x05ae, B:311:0x05b7, B:312:0x05bb, B:314:0x05c1, B:327:0x05d1, B:328:0x05da, B:330:0x05e0, B:332:0x05ec, B:335:0x05f5, B:336:0x05fa, B:338:0x0600, B:343:0x0613, B:345:0x061c, B:347:0x063c, B:348:0x065b, B:350:0x0665, B:356:0x0645, B:358:0x064f), top: B:259:0x04e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0665 A[Catch: all -> 0x0672, TRY_LEAVE, TryCatch #0 {, blocks: (B:260:0x04e0, B:261:0x04ef, B:263:0x04f5, B:265:0x0503, B:269:0x050c, B:273:0x050f, B:274:0x0513, B:276:0x0519, B:278:0x0523, B:280:0x052a, B:281:0x0535, B:283:0x0552, B:286:0x0558, B:290:0x053a, B:292:0x0541, B:293:0x054c, B:295:0x055e, B:297:0x0566, B:300:0x0578, B:302:0x0589, B:303:0x0590, B:305:0x059a, B:307:0x05a0, B:309:0x05ae, B:311:0x05b7, B:312:0x05bb, B:314:0x05c1, B:327:0x05d1, B:328:0x05da, B:330:0x05e0, B:332:0x05ec, B:335:0x05f5, B:336:0x05fa, B:338:0x0600, B:343:0x0613, B:345:0x061c, B:347:0x063c, B:348:0x065b, B:350:0x0665, B:356:0x0645, B:358:0x064f), top: B:259:0x04e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0643  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void au(java.util.ArrayList r20, java.util.ArrayList r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 1828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da.au(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private final void av() {
        Iterator it = ap().iterator();
        while (it.hasNext()) {
            boolean z = ((dv) it.next()).f;
        }
    }

    private final void aw(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((bd) arrayList.get(i)).s) {
                        if (i2 != i) {
                            au(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((bd) arrayList.get(i2)).s) {
                                i2++;
                            }
                        }
                        au(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    au(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    private final void ax(cg cgVar) {
        ViewGroup ao = ao(cgVar);
        if (ao != null && cgVar.s() + cgVar.t() + cgVar.u() + cgVar.v() > 0) {
            if (ao.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                ao.setTag(R.id.visible_removing_fragment_view_tag, cgVar);
            }
            ((cg) ao.getTag(R.id.visible_removing_fragment_view_tag)).aq(cgVar.av());
        }
    }

    private final void ay() {
        Iterator it = this.b.e().iterator();
        while (it.hasNext()) {
            M((dg) it.next());
        }
    }

    private final void az(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new dp());
        cn cnVar = this.n;
        if (cnVar != null) {
            try {
                ((ci) cnVar).a.dump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            G("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public static cg f(View view) {
        while (view != null) {
            cg h = h(view);
            if (h != null) {
                return h;
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static cg h(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof cg) {
            return (cg) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A() {
        E(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(boolean z, boolean z2) {
        if (z2 && (this.n instanceof dr)) {
            az(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (cg cgVar : this.b.g()) {
            if (cgVar != null && z2) {
                cgVar.D.B(z, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C() {
        this.u = false;
        this.v = false;
        this.x.g = false;
        E(7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void D() {
        this.u = false;
        this.v = false;
        this.x.g = false;
        E(5);
    }

    public final void E(int i) {
        try {
            this.z = true;
            for (dg dgVar : this.b.b.values()) {
                if (dgVar != null) {
                    dgVar.b = i;
                }
            }
            L(i, false);
            Iterator it = ap().iterator();
            while (it.hasNext()) {
                ((dv) it.next()).f();
            }
            this.z = false;
            am(true);
        } catch (Throwable th) {
            this.z = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F() {
        this.v = true;
        this.x.g = true;
        E(4);
    }

    public final void G(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        di diVar = this.b;
        if (!diVar.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (dg dgVar : diVar.b.values()) {
                printWriter.print(str);
                if (dgVar != null) {
                    String valueOf = String.valueOf(str);
                    cg cgVar = dgVar.a;
                    printWriter.println(cgVar);
                    cgVar.U(valueOf.concat("    "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = diVar.a.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                cg cgVar2 = (cg) diVar.a.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(cgVar2.toString());
            }
        }
        ArrayList arrayList = this.A;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                cg cgVar3 = (cg) this.A.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(cgVar3.toString());
            }
        }
        int size3 = this.c.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                String valueOf2 = String.valueOf(str);
                bd bdVar = (bd) this.c.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(bdVar.toString());
                bdVar.e(valueOf2.concat("    "), printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            int size4 = this.a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (cx) this.a.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.o);
        if (this.p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.u);
        printWriter.print(" mStopped=");
        printWriter.print(this.v);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.w);
        if (this.t) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.t);
        }
    }

    public final void H() {
        Iterator it = ap().iterator();
        while (it.hasNext()) {
            ((dv) it.next()).f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void I(cx cxVar, boolean z) {
        if (!z) {
            if (this.n == null) {
                if (this.w) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            aq();
        }
        synchronized (this.a) {
            if (this.n == null) {
                if (z) {
                    return;
                } else {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            }
            this.a.add(cxVar);
            synchronized (this.a) {
                if (this.a.size() == 1) {
                    this.n.d.removeCallbacks(this.N);
                    this.n.d.post(this.N);
                    T();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J(cx cxVar, boolean z) {
        if (z && (this.n == null || this.w)) {
            return;
        }
        at(z);
        bd bdVar = this.f;
        if (bdVar != null) {
            bdVar.b = false;
            if (Y(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f + " as part of execSingleAction for action " + cxVar);
            }
            this.f.m(false, false);
            this.f.g(this.K, this.L);
            ArrayList arrayList = this.f.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                cg cgVar = ((dj) arrayList.get(i)).b;
                if (cgVar != null) {
                    cgVar.t = false;
                }
            }
            this.f = null;
        }
        cxVar.g(this.K, this.L);
        this.z = true;
        try {
            aw(this.K, this.L);
            ar();
            T();
            as();
            this.b.i();
        } catch (Throwable th) {
            ar();
            throw th;
        }
    }

    final void K(cg cgVar) {
        if (Y(2)) {
            Objects.toString(cgVar);
            Log.v("FragmentManager", "hide: ".concat(String.valueOf(cgVar)));
        }
        if (!cgVar.I) {
            cgVar.I = true;
            cgVar.U = true ^ cgVar.U;
            ax(cgVar);
        }
    }

    final void L(int i, boolean z) {
        cn cnVar;
        if (this.n == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.m) {
            this.m = i;
            di diVar = this.b;
            ArrayList arrayList = diVar.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                dg dgVar = (dg) diVar.b.get(((cg) arrayList.get(i2)).l);
                if (dgVar != null) {
                    dgVar.e();
                }
            }
            for (dg dgVar2 : diVar.b.values()) {
                if (dgVar2 != null) {
                    dgVar2.e();
                    cg cgVar = dgVar2.a;
                    if (cgVar.s && !cgVar.ay()) {
                        boolean z2 = cgVar.u;
                        diVar.k(dgVar2);
                    }
                }
            }
            ay();
            if (this.t && (cnVar = this.n) != null && this.m == 7) {
                cnVar.f();
                this.t = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void M(dg dgVar) {
        cg cgVar = dgVar.a;
        if (cgVar.R) {
            if (this.z) {
                this.J = true;
            } else {
                cgVar.R = false;
                dgVar.e();
            }
        }
    }

    public final void N(Bundle bundle, String str, cg cgVar) {
        if (cgVar.B != this) {
            az(new IllegalStateException(a.cc(cgVar, "Fragment ", " is not currently in the FragmentManager")));
        }
        bundle.putString(str, cgVar.l);
    }

    final void O(cg cgVar) {
        if (Y(2)) {
            Log.v("FragmentManager", "remove: " + cgVar + " nesting=" + cgVar.A);
        }
        boolean ay = cgVar.ay();
        if (cgVar.J && ay) {
            return;
        }
        this.b.l(cgVar);
        if (ai(cgVar)) {
            this.t = true;
        }
        cgVar.s = true;
        ax(cgVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void P(Parcelable parcelable) {
        int i;
        boolean z;
        dg dgVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.n.c.getClassLoader());
                this.j.put(str.substring(7), bundle2);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.n.c.getClassLoader());
                hashMap.put(str2.substring(9), bundle);
            }
        }
        di diVar = this.b;
        diVar.c.clear();
        diVar.c.putAll(hashMap);
        db dbVar = (db) bundle3.getParcelable("state");
        if (dbVar == null) {
            return;
        }
        this.b.b.clear();
        ArrayList arrayList = dbVar.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Bundle a = this.b.a((String) arrayList.get(i2), null);
            if (a != null) {
                cg cgVar = (cg) this.x.b.get(((df) a.getParcelable("state")).b);
                if (cgVar != null) {
                    if (Y(2)) {
                        Objects.toString(cgVar);
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained ".concat(cgVar.toString()));
                    }
                    dgVar = new dg(this.y, this.b, cgVar, a);
                } else {
                    dgVar = new dg(this.y, this.b, this.n.c.getClassLoader(), i(), a);
                }
                cg cgVar2 = dgVar.a;
                cgVar2.h = a;
                cgVar2.B = this;
                if (Y(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + cgVar2.l + "): " + cgVar2);
                }
                dgVar.f(this.n.c.getClassLoader());
                this.b.j(dgVar);
                dgVar.b = this.m;
            }
        }
        for (cg cgVar3 : new ArrayList(this.x.b.values())) {
            if (!this.b.m(cgVar3.l)) {
                if (Y(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + cgVar3 + " that was not found in the set of active Fragments " + dbVar.a);
                }
                this.x.e(cgVar3);
                cgVar3.B = this;
                dg dgVar2 = new dg(this.y, this.b, cgVar3);
                dgVar2.b = 1;
                dgVar2.e();
                cgVar3.s = true;
                dgVar2.e();
            }
        }
        di diVar2 = this.b;
        ArrayList<String> arrayList2 = dbVar.b;
        diVar2.a.clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                cg b = diVar2.b(str3);
                if (b != null) {
                    if (Y(2)) {
                        Log.v("FragmentManager", a.ci(b, str3, "restoreSaveState: added (", "): "));
                    }
                    diVar2.h(b);
                } else {
                    throw new IllegalStateException(a.bW(str3, "No instantiated fragment for (", ")"));
                }
            }
        }
        be[] beVarArr = dbVar.c;
        if (beVarArr != null) {
            this.c = new ArrayList(beVarArr.length);
            int i3 = 0;
            while (true) {
                be[] beVarArr2 = dbVar.c;
                if (i3 >= beVarArr2.length) {
                    break;
                }
                be beVar = beVarArr2[i3];
                bd bdVar = new bd(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = beVar.a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    dj djVar = new dj();
                    int i6 = i4 + 1;
                    djVar.a = iArr[i4];
                    if (Y(2)) {
                        Log.v("FragmentManager", "Instantiate " + bdVar + " op #" + i5 + " base fragment #" + beVar.a[i6]);
                    }
                    djVar.h = eng.values()[beVar.c[i5]];
                    djVar.i = eng.values()[beVar.d[i5]];
                    int[] iArr2 = beVar.a;
                    int i7 = i4 + 2;
                    if (iArr2[i6] != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    djVar.c = z;
                    int i8 = iArr2[i7];
                    djVar.d = i8;
                    int i9 = iArr2[i4 + 3];
                    djVar.e = i9;
                    int i10 = i4 + 5;
                    int i11 = iArr2[i4 + 4];
                    djVar.f = i11;
                    i4 += 6;
                    int i12 = iArr2[i10];
                    djVar.g = i12;
                    bdVar.e = i8;
                    bdVar.f = i9;
                    bdVar.g = i11;
                    bdVar.h = i12;
                    bdVar.p(djVar);
                    i5++;
                }
                bdVar.i = beVar.e;
                bdVar.l = beVar.f;
                bdVar.j = true;
                bdVar.m = beVar.h;
                bdVar.n = beVar.i;
                bdVar.o = beVar.j;
                bdVar.p = beVar.k;
                bdVar.q = beVar.l;
                bdVar.r = beVar.m;
                bdVar.s = beVar.n;
                bdVar.c = beVar.g;
                for (int i13 = 0; i13 < beVar.b.size(); i13++) {
                    String str4 = (String) beVar.b.get(i13);
                    if (str4 != null) {
                        ((dj) bdVar.d.get(i13)).b = c(str4);
                    }
                }
                bdVar.a(1);
                if (Y(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + bdVar.c + "): " + bdVar);
                    PrintWriter printWriter = new PrintWriter(new dp());
                    bdVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.c.add(bdVar);
                i3++;
            }
            i = 0;
        } else {
            i = 0;
            this.c = new ArrayList();
        }
        this.i.set(dbVar.d);
        String str5 = dbVar.e;
        if (str5 != null) {
            cg c = c(str5);
            this.q = c;
            z(c);
        }
        ArrayList arrayList3 = dbVar.f;
        if (arrayList3 != null) {
            for (int i14 = i; i14 < arrayList3.size(); i14++) {
                this.B.put((String) arrayList3.get(i14), (bg) dbVar.g.get(i14));
            }
        }
        this.s = new ArrayDeque(dbVar.h);
    }

    final void Q(cg cgVar, boolean z) {
        ViewGroup ao = ao(cgVar);
        if (ao != null && (ao instanceof FragmentContainerView)) {
            ((FragmentContainerView) ao).a = !z;
        }
    }

    final void R(cg cgVar, eng engVar) {
        if (cgVar.equals(c(cgVar.l)) && (cgVar.C == null || cgVar.B == this)) {
            cgVar.Y = engVar;
            return;
        }
        throw new IllegalArgumentException(a.cd(this, cgVar, "Fragment ", " is not an active fragment of FragmentManager "));
    }

    final void S(cg cgVar) {
        if (cgVar != null && (!cgVar.equals(c(cgVar.l)) || (cgVar.C != null && cgVar.B != this))) {
            throw new IllegalArgumentException(a.cd(this, cgVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        cg cgVar2 = this.q;
        this.q = cgVar;
        z(cgVar2);
        z(this.q);
    }

    public final void T() {
        int i;
        synchronized (this.a) {
            boolean z = true;
            if (!this.a.isEmpty()) {
                this.h.h(true);
                if (Y(3)) {
                    Log.d("FragmentManager", a.cc(this, "FragmentManager ", " enabling OnBackPressedCallback, caused by non-empty pending actions"));
                }
                return;
            }
            int size = this.c.size();
            if (this.f != null) {
                i = 1;
            } else {
                i = 0;
            }
            if (size + i <= 0 || !aa(this.p)) {
                z = false;
            }
            if (Y(3)) {
                Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
            }
            this.h.h(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean U(MenuItem menuItem) {
        if (this.m <= 0) {
            return false;
        }
        for (cg cgVar : this.b.g()) {
            if (cgVar != null && !cgVar.I && (cgVar.aI() || cgVar.D.U(menuItem))) {
                return true;
            }
        }
        return false;
    }

    public final boolean V(Menu menu, MenuInflater menuInflater) {
        boolean z;
        if (this.m <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (cg cgVar : this.b.g()) {
            if (cgVar != null && aj(cgVar) && !cgVar.I) {
                if (cgVar.M && cgVar.N) {
                    cgVar.Z(menu, menuInflater);
                    z = true;
                } else {
                    z = false;
                }
                if (z | cgVar.D.V(menu, menuInflater)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cgVar);
                    z2 = true;
                }
            }
        }
        if (this.A != null) {
            for (int i = 0; i < this.A.size(); i++) {
                cg cgVar2 = (cg) this.A.get(i);
                if (arrayList != null) {
                    arrayList.contains(cgVar2);
                }
            }
        }
        this.A = arrayList;
        return z2;
    }

    public final boolean W(MenuItem menuItem) {
        if (this.m <= 0) {
            return false;
        }
        for (cg cgVar : this.b.g()) {
            if (cgVar != null && !cgVar.I && ((cgVar.M && cgVar.N && cgVar.aC(menuItem)) || cgVar.D.W(menuItem))) {
                return true;
            }
        }
        return false;
    }

    public final boolean X(Menu menu) {
        boolean z;
        if (this.m <= 0) {
            return false;
        }
        boolean z2 = false;
        for (cg cgVar : this.b.g()) {
            if (cgVar != null && aj(cgVar) && !cgVar.I) {
                if (cgVar.M && cgVar.N) {
                    cgVar.ae(menu);
                    z = true;
                } else {
                    z = false;
                }
                if (cgVar.D.X(menu) | z) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final boolean Z() {
        cg cgVar = this.p;
        if (cgVar == null) {
            return true;
        }
        if (cgVar.aw() && cgVar.H().Z()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle a() {
        be[] beVarArr;
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        av();
        H();
        am(true);
        this.u = true;
        this.x.g = true;
        di diVar = this.b;
        ArrayList arrayList2 = new ArrayList(diVar.b.size());
        for (dg dgVar : diVar.b.values()) {
            if (dgVar != null) {
                cg cgVar = dgVar.a;
                diVar.a(cgVar.l, dgVar.a());
                arrayList2.add(cgVar.l);
                if (Y(2)) {
                    Log.v("FragmentManager", "Saved state of " + cgVar + ": " + cgVar.h);
                }
            }
        }
        HashMap hashMap = this.b.c;
        if (hashMap.isEmpty()) {
            if (Y(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
        } else {
            di diVar2 = this.b;
            synchronized (diVar2.a) {
                beVarArr = null;
                if (diVar2.a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(diVar2.a.size());
                    Iterator it = diVar2.a.iterator();
                    while (it.hasNext()) {
                        cg cgVar2 = (cg) it.next();
                        arrayList.add(cgVar2.l);
                        if (Y(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + cgVar2.l + "): " + cgVar2);
                        }
                    }
                }
            }
            int size = this.c.size();
            if (size > 0) {
                beVarArr = new be[size];
                for (int i = 0; i < size; i++) {
                    beVarArr[i] = new be((bd) this.c.get(i));
                    if (Y(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.c.get(i));
                    }
                }
            }
            db dbVar = new db();
            dbVar.a = arrayList2;
            dbVar.b = arrayList;
            dbVar.c = beVarArr;
            dbVar.d = this.i.get();
            cg cgVar3 = this.q;
            if (cgVar3 != null) {
                dbVar.e = cgVar3.l;
            }
            dbVar.f.addAll(this.B.keySet());
            dbVar.g.addAll(this.B.values());
            dbVar.h = new ArrayList(this.s);
            bundle.putParcelable("state", dbVar);
            for (String str : this.j.keySet()) {
                bundle.putBundle("result_".concat(String.valueOf(str)), (Bundle) this.j.get(str));
            }
            for (String str2 : hashMap.keySet()) {
                bundle.putBundle("fragment_".concat(String.valueOf(str2)), (Bundle) hashMap.get(str2));
            }
        }
        return bundle;
    }

    final boolean aa(cg cgVar) {
        if (cgVar == null) {
            return true;
        }
        da daVar = cgVar.B;
        if (cgVar.equals(daVar.q) && aa(daVar.p)) {
            return true;
        }
        return false;
    }

    public final boolean ab() {
        if (!this.u && !this.v) {
            return false;
        }
        return true;
    }

    public final boolean ac() {
        return ad(null, -1, 0);
    }

    public final boolean ad(String str, int i, int i2) {
        am(false);
        at(true);
        cg cgVar = this.q;
        if (cgVar != null && i < 0 && str == null && cgVar.G().ac()) {
            return true;
        }
        boolean ae = ae(this.K, this.L, str, i, i2);
        if (ae) {
            this.z = true;
            try {
                aw(this.K, this.L);
            } finally {
                ar();
            }
        }
        T();
        as();
        this.b.i();
        return ae;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean ae(java.util.ArrayList r6, java.util.ArrayList r7, java.lang.String r8, int r9, int r10) {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.c
            boolean r0 = r0.isEmpty()
            r1 = 0
            r2 = -1
            if (r0 == 0) goto Ld
        La:
            r8 = r2
            goto L74
        Ld:
            if (r8 != 0) goto L1e
            if (r9 >= 0) goto L1e
            if (r10 == 0) goto L16
            r8 = r1
            goto L74
        L16:
            java.util.ArrayList r8 = r5.c
            int r8 = r8.size()
            int r8 = r8 + r2
            goto L74
        L1e:
            java.util.ArrayList r0 = r5.c
            int r0 = r0.size()
            int r0 = r0 + r2
        L25:
            if (r0 < 0) goto L43
            java.util.ArrayList r3 = r5.c
            java.lang.Object r3 = r3.get(r0)
            bd r3 = (defpackage.bd) r3
            if (r8 == 0) goto L3a
            java.lang.String r4 = r3.l
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L3a
            goto L43
        L3a:
            if (r9 < 0) goto L40
            int r3 = r3.c
            if (r9 == r3) goto L43
        L40:
            int r0 = r0 + (-1)
            goto L25
        L43:
            if (r0 >= 0) goto L47
        L45:
            r8 = r0
            goto L74
        L47:
            if (r10 != 0) goto L56
            java.util.ArrayList r8 = r5.c
            int r8 = r8.size()
            int r8 = r8 + r2
            if (r0 != r8) goto L53
            goto La
        L53:
            int r8 = r0 + 1
            goto L74
        L56:
            if (r0 <= 0) goto L45
            java.util.ArrayList r10 = r5.c
            int r3 = r0 + (-1)
            java.lang.Object r10 = r10.get(r3)
            bd r10 = (defpackage.bd) r10
            if (r8 == 0) goto L6c
            java.lang.String r4 = r10.l
            boolean r4 = r8.equals(r4)
            if (r4 != 0) goto L72
        L6c:
            if (r9 < 0) goto L45
            int r10 = r10.c
            if (r9 != r10) goto L45
        L72:
            r0 = r3
            goto L56
        L74:
            if (r8 >= 0) goto L77
            return r1
        L77:
            java.util.ArrayList r9 = r5.c
            int r9 = r9.size()
            int r9 = r9 + r2
        L7e:
            r10 = 1
            if (r9 < r8) goto L96
            java.util.ArrayList r0 = r5.c
            java.lang.Object r0 = r0.remove(r9)
            bd r0 = (defpackage.bd) r0
            r6.add(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.add(r10)
            int r9 = r9 + (-1)
            goto L7e
        L96:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da.ae(java.util.ArrayList, java.util.ArrayList, java.lang.String, int, int):boolean");
    }

    public final void af(aksp akspVar) {
        this.k.add(akspVar);
    }

    public final void ag() {
        am(true);
        av();
    }

    public final void ak(String str) {
        ad(str, -1, 1);
    }

    public final void am(boolean z) {
        bd bdVar;
        at(z);
        if (!this.g && (bdVar = this.f) != null) {
            bdVar.b = false;
            if (Y(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f + " as part of execPendingActions for actions " + this.a);
            }
            this.f.m(false, false);
            this.a.add(0, this.f);
            ArrayList arrayList = this.f.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                cg cgVar = ((dj) arrayList.get(i)).b;
                if (cgVar != null) {
                    cgVar.t = false;
                }
            }
            this.f = null;
        }
        while (true) {
            ArrayList arrayList2 = this.K;
            ArrayList arrayList3 = this.L;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    break;
                }
                try {
                    int size2 = this.a.size();
                    boolean z2 = false;
                    for (int i2 = 0; i2 < size2; i2++) {
                        z2 |= ((cx) this.a.get(i2)).g(arrayList2, arrayList3);
                    }
                    if (!z2) {
                        break;
                    }
                    this.z = true;
                    try {
                        aw(this.K, this.L);
                    } finally {
                        ar();
                    }
                } finally {
                    this.a.clear();
                    this.n.d.removeCallbacks(this.N);
                }
            }
        }
        T();
        as();
        this.b.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final a an() {
        cg cgVar = this.p;
        if (cgVar != null) {
            return cgVar.B.an();
        }
        return this.O;
    }

    public final cf b(cg cgVar) {
        dg d = this.b.d(cgVar.l);
        if (d == null || !d.a.equals(cgVar)) {
            az(new IllegalStateException(a.cc(cgVar, "Fragment ", " is not currently in the FragmentManager")));
        }
        if (d.a.g >= 0) {
            return new cf(d.a());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cg c(String str) {
        return this.b.b(str);
    }

    public final cg d(int i) {
        di diVar = this.b;
        int size = diVar.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                cg cgVar = (cg) diVar.a.get(size);
                if (cgVar != null && cgVar.F == i) {
                    return cgVar;
                }
            } else {
                for (dg dgVar : diVar.b.values()) {
                    if (dgVar != null) {
                        cg cgVar2 = dgVar.a;
                        if (cgVar2.F == i) {
                            return cgVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final cg e(String str) {
        di diVar = this.b;
        if (str != null) {
            int size = diVar.a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                cg cgVar = (cg) diVar.a.get(size);
                if (cgVar != null && str.equals(cgVar.H)) {
                    return cgVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (dg dgVar : diVar.b.values()) {
            if (dgVar != null) {
                cg cgVar2 = dgVar.a;
                if (str.equals(cgVar2.H)) {
                    return cgVar2;
                }
            }
        }
        return null;
    }

    public final cg g(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        cg c = c(string);
        if (c == null) {
            az(new IllegalStateException(a.cg(string, str, "Fragment no longer exists for key ", ": unique id ")));
        }
        return c;
    }

    public final cm i() {
        cg cgVar = this.p;
        if (cgVar != null) {
            return cgVar.B.i();
        }
        return this.G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dg j(cg cgVar) {
        String str = cgVar.X;
        if (str != null) {
            emb.a(cgVar, str);
        }
        if (Y(2)) {
            Objects.toString(cgVar);
            Log.v("FragmentManager", "add: ".concat(String.valueOf(cgVar)));
        }
        dg k = k(cgVar);
        cgVar.B = this;
        this.b.j(k);
        if (!cgVar.J) {
            this.b.h(cgVar);
            cgVar.s = false;
            if (cgVar.Q == null) {
                cgVar.U = false;
            }
            if (ai(cgVar)) {
                this.t = true;
            }
        }
        return k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dg k(cg cgVar) {
        dg d = this.b.d(cgVar.l);
        if (d != null) {
            return d;
        }
        dg dgVar = new dg(this.y, this.b, cgVar);
        dgVar.f(this.n.c.getClassLoader());
        dgVar.b = this.m;
        return dgVar;
    }

    public final List l() {
        return this.b.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set m(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((bd) arrayList.get(i)).d;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                cg cgVar = ((dj) arrayList2.get(i3)).b;
                if (cgVar != null && (viewGroup = cgVar.P) != null) {
                    hashSet.add(dv.c(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void n(dd ddVar) {
        this.l.add(ddVar);
    }

    public void noteStateNotSaved() {
        if (this.n != null) {
            this.u = false;
            this.v = false;
            this.x.g = false;
            for (cg cgVar : this.b.g()) {
                if (cgVar != null) {
                    cgVar.D.noteStateNotSaved();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [eab, cn] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v8, types: [gjz, cn] */
    /* JADX WARN: Type inference failed for: r4v9, types: [sc, cn] */
    public final void o(cn cnVar, cl clVar, cg cgVar) {
        String str;
        cg cgVar2;
        if (this.n == null) {
            this.n = cnVar;
            this.o = clVar;
            this.p = cgVar;
            if (cgVar != null) {
                n(new cs());
            } else if (cnVar instanceof dd) {
                n(cnVar);
            }
            if (this.p != null) {
                T();
            }
            if (cnVar instanceof ro) {
                rm c = cnVar.c();
                this.e = c;
                if (cgVar != null) {
                    cgVar2 = cgVar;
                } else {
                    cgVar2 = cnVar;
                }
                c.b(cgVar2, this.h);
            }
            int i = 0;
            if (cgVar != null) {
                dc dcVar = cgVar.B.x;
                dc dcVar2 = (dc) dcVar.c.get(cgVar.l);
                if (dcVar2 == null) {
                    dc dcVar3 = new dc(dcVar.e);
                    dcVar.c.put(cgVar.l, dcVar3);
                    dcVar2 = dcVar3;
                }
                this.x = dcVar2;
            } else {
                if (cnVar instanceof eoz) {
                    this.x = (dc) new eoy(cnVar.aL(), dc.a).a(dc.class);
                } else {
                    this.x = new dc(false);
                }
                cgVar = null;
            }
            dc dcVar4 = this.x;
            dcVar4.g = ab();
            this.b.d = dcVar4;
            ?? r4 = this.n;
            if ((r4 instanceof gjz) && cgVar == null) {
                iba aK = r4.aK();
                aK.c("android:support:fragments", new cp(this, i));
                Bundle b = aK.b("android:support:fragments");
                if (b != null) {
                    P(b);
                }
            }
            ?? r42 = this.n;
            if (r42 instanceof sc) {
                sb gR = r42.gR();
                if (cgVar != null) {
                    str = String.valueOf(cgVar.l).concat(":");
                } else {
                    str = "";
                }
                sl slVar = new sl();
                ct ctVar = new ct(this, 0);
                String concat = "FragmentManager:".concat(str);
                this.r = gR.a(concat.concat("StartActivityForResult"), slVar, ctVar);
                this.H = gR.a(concat.concat("StartIntentSenderForResult"), new cu(), new ct(this, 2));
                this.I = gR.a(concat.concat("RequestPermissions"), new sk(), new ct(this, 1));
            }
            ?? r43 = this.n;
            if (r43 instanceof eab) {
                r43.gS(this.C);
            }
            cn cnVar2 = this.n;
            if (cnVar2 instanceof eac) {
                ecd ecdVar = this.D;
                cj cjVar = ((ci) cnVar2).a;
                ecdVar.getClass();
                cjVar.h.add(ecdVar);
            }
            cn cnVar3 = this.n;
            if (cnVar3 instanceof dq) {
                ecd ecdVar2 = this.E;
                cj cjVar2 = ((ci) cnVar3).a;
                ecdVar2.getClass();
                cjVar2.j.add(ecdVar2);
            }
            cn cnVar4 = this.n;
            if (cnVar4 instanceof dr) {
                ecd ecdVar3 = this.F;
                cj cjVar3 = ((ci) cnVar4).a;
                ecdVar3.getClass();
                cjVar3.k.add(ecdVar3);
            }
            cn cnVar5 = this.n;
            if ((cnVar5 instanceof edb) && cgVar == null) {
                qdq qdqVar = this.P;
                cj cjVar4 = ((ci) cnVar5).a;
                qdqVar.getClass();
                kkc kkcVar = cjVar4.m;
                ((CopyOnWriteArrayList) kkcVar.b).add(qdqVar);
                kkcVar.c.run();
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    final void p(cg cgVar) {
        if (Y(2)) {
            Objects.toString(cgVar);
            Log.v("FragmentManager", "attach: ".concat(String.valueOf(cgVar)));
        }
        if (cgVar.J) {
            cgVar.J = false;
            if (!cgVar.r) {
                this.b.h(cgVar);
                if (Y(2)) {
                    Objects.toString(cgVar);
                    Log.v("FragmentManager", "add from attach: ".concat(String.valueOf(cgVar)));
                }
                if (ai(cgVar)) {
                    this.t = true;
                }
            }
        }
    }

    final void q(cg cgVar) {
        if (Y(2)) {
            Objects.toString(cgVar);
            Log.v("FragmentManager", "detach: ".concat(String.valueOf(cgVar)));
        }
        if (!cgVar.J) {
            cgVar.J = true;
            if (cgVar.r) {
                if (Y(2)) {
                    Objects.toString(cgVar);
                    Log.v("FragmentManager", "remove from detach: ".concat(String.valueOf(cgVar)));
                }
                this.b.l(cgVar);
                if (ai(cgVar)) {
                    this.t = true;
                }
                ax(cgVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        this.u = false;
        this.v = false;
        this.x.g = false;
        E(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(Configuration configuration, boolean z) {
        if (z && (this.n instanceof eab)) {
            az(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (cg cgVar : this.b.g()) {
            if (cgVar != null) {
                cgVar.onConfigurationChanged(configuration);
                if (z) {
                    cgVar.D.s(configuration, true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t() {
        this.u = false;
        this.v = false;
        this.x.g = false;
        E(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        cg cgVar = this.p;
        if (cgVar != null) {
            sb.append(cgVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.p)));
            sb.append("}");
        } else {
            cn cnVar = this.n;
            if (cnVar != null) {
                sb.append(cnVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.n)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map, java.lang.Object] */
    public final void u() {
        boolean isChangingConfigurations;
        this.w = true;
        am(true);
        H();
        cn cnVar = this.n;
        if (cnVar instanceof eoz) {
            isChangingConfigurations = this.b.d.f;
        } else {
            isChangingConfigurations = true ^ ((Activity) cnVar.c).isChangingConfigurations();
        }
        if (isChangingConfigurations) {
            Iterator it = this.B.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((bg) it.next()).a.iterator();
                while (it2.hasNext()) {
                    this.b.d.c((String) it2.next(), false);
                }
            }
        }
        E(-1);
        cn cnVar2 = this.n;
        if (cnVar2 instanceof eac) {
            ecd ecdVar = this.D;
            cj cjVar = ((ci) cnVar2).a;
            ecdVar.getClass();
            cjVar.h.remove(ecdVar);
        }
        cn cnVar3 = this.n;
        if (cnVar3 instanceof eab) {
            ((ci) cnVar3).a.g(this.C);
        }
        cn cnVar4 = this.n;
        if (cnVar4 instanceof dq) {
            ecd ecdVar2 = this.E;
            cj cjVar2 = ((ci) cnVar4).a;
            ecdVar2.getClass();
            cjVar2.j.remove(ecdVar2);
        }
        cn cnVar5 = this.n;
        if (cnVar5 instanceof dr) {
            ecd ecdVar3 = this.F;
            cj cjVar3 = ((ci) cnVar5).a;
            ecdVar3.getClass();
            cjVar3.k.remove(ecdVar3);
        }
        cn cnVar6 = this.n;
        if ((cnVar6 instanceof edb) && this.p == null) {
            qdq qdqVar = this.P;
            cj cjVar4 = ((ci) cnVar6).a;
            qdqVar.getClass();
            kkc kkcVar = cjVar4.m;
            ((CopyOnWriteArrayList) kkcVar.b).remove(qdqVar);
            if (((dyf) kkcVar.a.remove(qdqVar)) == null) {
                kkcVar.c.run();
            } else {
                throw null;
            }
        }
        this.n = null;
        this.o = null;
        this.p = null;
        if (this.e != null) {
            this.h.f();
            this.e = null;
        }
        rw rwVar = this.r;
        if (rwVar != null) {
            rwVar.a();
            this.H.a();
            this.I.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(boolean z) {
        if (z && (this.n instanceof eac)) {
            az(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (cg cgVar : this.b.g()) {
            if (cgVar != null) {
                cgVar.onLowMemory();
                if (z) {
                    cgVar.D.v(true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(boolean z, boolean z2) {
        if (z2 && (this.n instanceof dq)) {
            az(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (cg cgVar : this.b.g()) {
            if (cgVar != null) {
                cgVar.ac(z);
                if (z2) {
                    cgVar.D.w(z, true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x() {
        for (cg cgVar : this.b.f()) {
            if (cgVar != null) {
                cgVar.D.x();
            }
        }
    }

    public final void y(Menu menu) {
        if (this.m > 0) {
            for (cg cgVar : this.b.g()) {
                if (cgVar != null && !cgVar.I) {
                    cgVar.D.y(menu);
                }
            }
        }
    }

    public final void z(cg cgVar) {
        if (cgVar != null && cgVar.equals(c(cgVar.l))) {
            boolean aa = cgVar.B.aa(cgVar);
            Boolean bool = cgVar.q;
            if (bool == null || bool.booleanValue() != aa) {
                cgVar.q = Boolean.valueOf(aa);
                da daVar = cgVar.D;
                daVar.T();
                daVar.z(daVar.q);
            }
        }
    }
}
