package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cg implements ComponentCallbacks, View.OnCreateContextMenuListener, enm, eoz, enb, gjz {
    static final Object f = new Object();
    int A;
    public da B;
    public cn C;
    da D;
    public cg E;
    public int F;
    public int G;
    public String H;
    boolean I;
    public boolean J;
    public boolean K;
    boolean L;
    boolean M;
    boolean N;
    public boolean O;
    public ViewGroup P;
    public View Q;
    boolean R;
    public boolean S;
    public cc T;
    boolean U;
    LayoutInflater V;
    boolean W;
    public String X;
    eng Y;
    public eno Z;
    dn aa;
    eny ab;
    eov ac;
    public final AtomicInteger ad;
    public final ArrayList ae;
    ico af;
    private int fr;
    private final ce fs;
    int g;
    Bundle h;
    SparseArray i;
    Bundle j;
    Boolean k;
    String l;
    public Bundle m;
    cg n;
    String o;
    public int p;
    public Boolean q;
    boolean r;
    public boolean s;
    boolean t;
    boolean u;
    boolean v;
    public boolean w;
    public boolean x;
    boolean y;
    boolean z;

    public cg() {
        this.g = -1;
        this.l = UUID.randomUUID().toString();
        this.o = null;
        this.q = null;
        this.D = new da();
        this.N = true;
        this.S = true;
        this.Y = eng.RESUMED;
        this.ab = new eny();
        this.ad = new AtomicInteger();
        this.ae = new ArrayList();
        this.fs = new by(this);
        e();
    }

    @Deprecated
    public static cg D(Context context, String str, Bundle bundle) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            int i = cm.a;
            try {
                cg cgVar = (cg) cm.a(classLoader, str).getConstructor(null).newInstance(null);
                if (bundle != null) {
                    bundle.setClassLoader(cgVar.getClass().getClassLoader());
                    cgVar.ak(bundle);
                }
                return cgVar;
            } catch (ClassCastException e) {
                throw new cd("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
            } catch (ClassNotFoundException e2) {
                throw new cd("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
            }
        } catch (IllegalAccessException e3) {
            throw new cd(a.bW(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (InstantiationException e4) {
            throw new cd(a.bW(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (NoSuchMethodException e5) {
            throw new cd(a.bW(str, "Unable to instantiate fragment ", ": could not find Fragment constructor"), e5);
        } catch (InvocationTargetException e6) {
            throw new cd(a.bW(str, "Unable to instantiate fragment ", ": calling Fragment constructor caused an exception"), e6);
        }
    }

    private final cg d(boolean z) {
        String str;
        if (z) {
            emf emfVar = new emf(this);
            emb.d(emfVar);
            ema b = emb.b(this);
            if (b.b.contains(elz.DETECT_TARGET_FRAGMENT_USAGE) && emb.e(b, getClass(), emfVar.getClass())) {
                emb.c(b, emfVar);
            }
        }
        cg cgVar = this.n;
        if (cgVar != null) {
            return cgVar;
        }
        da daVar = this.B;
        if (daVar != null && (str = this.o) != null) {
            return daVar.c(str);
        }
        return null;
    }

    private final void e() {
        this.Z = new eno(this);
        this.af = gvf.bH(this);
        this.ac = null;
        if (!this.ae.contains(this.fs)) {
            o(this.fs);
        }
    }

    private final int eU() {
        eng engVar = this.Y;
        if (engVar != eng.INITIALIZED && this.E != null) {
            return Math.min(engVar.ordinal(), this.E.eU());
        }
        return engVar.ordinal();
    }

    private final void o(ce ceVar) {
        if (this.g >= 0) {
            ceVar.a();
        } else {
            this.ae.add(ceVar);
        }
    }

    public final Bundle A() {
        Bundle bundle = this.m;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(a.cc(this, "Fragment ", " does not have any arguments."));
    }

    public final cc B() {
        if (this.T == null) {
            this.T = new cc();
        }
        return this.T;
    }

    public final cj F() {
        cj fe = fe();
        if (fe != null) {
            return fe;
        }
        throw new IllegalStateException(a.cc(this, "Fragment ", " not attached to an activity."));
    }

    public final da G() {
        if (this.C != null) {
            return this.D;
        }
        throw new IllegalStateException(a.cc(this, "Fragment ", " has not been attached yet."));
    }

    public final da H() {
        da daVar = this.B;
        if (daVar != null) {
            return daVar;
        }
        throw new IllegalStateException(a.cc(this, "Fragment ", " not associated with a fragment manager."));
    }

    public final LayoutInflater I() {
        LayoutInflater layoutInflater = this.V;
        if (layoutInflater == null) {
            return J(null);
        }
        return layoutInflater;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final LayoutInflater J(Bundle bundle) {
        LayoutInflater gl = gl(bundle);
        this.V = gl;
        return gl;
    }

    public View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.fr;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public final View L() {
        View view = this.Q;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a.cc(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final rw M(se seVar, rv rvVar) {
        ca caVar = new ca(this);
        if (this.g <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            o(new cb(this, caVar, atomicReference, seVar, rvVar));
            return new bx(atomicReference);
        }
        throw new IllegalStateException(a.cc(this, "Fragment ", " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    public enh N() {
        return this.Z;
    }

    public final enm O() {
        dn dnVar = this.aa;
        if (dnVar != null) {
            return dnVar;
        }
        throw new IllegalStateException(a.cc(this, "Can't access the Fragment View's LifecycleOwner for ", " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public eov P() {
        Application application;
        if (this.B != null) {
            if (this.ac == null) {
                Context applicationContext = y().getApplicationContext();
                while (true) {
                    if (applicationContext instanceof ContextWrapper) {
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = null;
                        break;
                    }
                }
                if (application == null && da.Y(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + y().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.ac = new eoo(application, this, this.m);
            }
            return this.ac;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // defpackage.enb
    public final epd Q() {
        Application application;
        Context applicationContext = y().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && da.Y(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + y().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        epe epeVar = new epe();
        if (application != null) {
            epeVar.b(eou.b, application);
        }
        epeVar.b(eol.a, this);
        epeVar.b(eol.b, this);
        Bundle bundle = this.m;
        if (bundle != null) {
            epeVar.b(eol.c, bundle);
        }
        return epeVar;
    }

    public final Object R() {
        cn cnVar = this.C;
        if (cnVar == null) {
            return null;
        }
        return ((ci) cnVar).a;
    }

    public final String S(int i) {
        return z().getString(i);
    }

    public final String T(int i, Object... objArr) {
        return z().getString(i, objArr);
    }

    public void U(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.F));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.G));
        printWriter.print(" mTag=");
        printWriter.println(this.H);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.g);
        printWriter.print(" mWho=");
        printWriter.print(this.l);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.r);
        printWriter.print(" mRemoving=");
        printWriter.print(this.s);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.v);
        printWriter.print(" mInLayout=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.I);
        printWriter.print(" mDetached=");
        printWriter.print(this.J);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.N);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.M);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.K);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.S);
        if (this.B != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.B);
        }
        if (this.C != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.C);
        }
        if (this.E != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.E);
        }
        if (this.m != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.m);
        }
        if (this.h != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.h);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.i);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.j);
        }
        cg d = d(false);
        if (d != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(d);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.p);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(av());
        if (s() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(s());
        }
        if (t() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(t());
        }
        if (u() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(u());
        }
        if (v() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(v());
        }
        if (this.P != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.P);
        }
        if (this.Q != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.Q);
        }
        if (x() != null) {
            epj.a(this).e(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.D + ":");
        this.D.G(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void V() {
        e();
        this.X = this.l;
        this.l = UUID.randomUUID().toString();
        this.r = false;
        this.s = false;
        this.v = false;
        this.w = false;
        this.y = false;
        this.A = 0;
        this.B = null;
        this.D = new da();
        this.C = null;
        this.F = 0;
        this.G = 0;
        this.H = null;
        this.I = false;
        this.J = false;
    }

    @Deprecated
    public void W(Bundle bundle) {
        this.O = true;
    }

    @Deprecated
    public void X(int i, int i2, Intent intent) {
        if (da.Y(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    @Deprecated
    public void Y(Activity activity) {
        this.O = true;
    }

    public final boolean aA() {
        da daVar = this.B;
        if (daVar == null) {
            return false;
        }
        return daVar.ab();
    }

    public final boolean aB() {
        View view;
        if (aw() && !ax() && (view = this.Q) != null && view.getWindowToken() != null && this.Q.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean aC(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public final LayoutInflater aD() {
        cn cnVar = this.C;
        if (cnVar != null) {
            cj cjVar = ((ci) cnVar).a;
            LayoutInflater cloneInContext = cjVar.getLayoutInflater().cloneInContext(cjVar);
            cloneInContext.setFactory2(this.D.d);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public final void aE(AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.O = true;
        cn cnVar = this.C;
        if (cnVar == null) {
            activity = null;
        } else {
            activity = cnVar.b;
        }
        if (activity != null) {
            this.O = false;
            ab(activity, attributeSet, bundle);
        }
    }

    @Deprecated
    public final void aF(cg cgVar) {
        emi emiVar = new emi(this, cgVar);
        emb.d(emiVar);
        ema b = emb.b(this);
        if (b.b.contains(elz.DETECT_TARGET_FRAGMENT_USAGE) && emb.e(b, getClass(), emiVar.getClass())) {
            emb.c(b, emiVar);
        }
        da daVar = this.B;
        da daVar2 = cgVar.B;
        if (daVar != null && daVar2 != null && daVar != daVar2) {
            throw new IllegalArgumentException(a.cc(cgVar, "Fragment ", " must share the same FragmentManager to be set as a target fragment"));
        }
        for (cg cgVar2 = cgVar; cgVar2 != null; cgVar2 = cgVar2.d(false)) {
            if (cgVar2.equals(this)) {
                throw new IllegalArgumentException(a.ce(this, cgVar, "Setting ", " as the target of ", " would create a target cycle"));
            }
        }
        if (this.B != null && cgVar.B != null) {
            this.o = cgVar.l;
            this.n = null;
        } else {
            this.o = null;
            this.n = cgVar;
        }
        this.p = 0;
    }

    public void aG(Intent intent) {
        cn cnVar = this.C;
        if (cnVar != null) {
            cnVar.i(intent, -1);
            return;
        }
        throw new IllegalStateException(a.cc(this, "Fragment ", " not attached to Activity"));
    }

    public boolean aI() {
        return false;
    }

    @Override // defpackage.gjz
    public final iba aK() {
        return (iba) this.af.a;
    }

    @Override // defpackage.eoz
    public final efu aL() {
        if (this.B != null) {
            if (eU() != eng.INITIALIZED.ordinal()) {
                dc dcVar = this.B.x;
                efu efuVar = (efu) dcVar.d.get(this.l);
                if (efuVar == null) {
                    efu efuVar2 = new efu((char[]) null, (byte[]) null);
                    dcVar.d.put(this.l, efuVar2);
                    return efuVar2;
                }
                return efuVar;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void aa() {
        this.O = true;
    }

    @Deprecated
    public void ab(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.O = true;
    }

    public void ad() {
        this.O = true;
    }

    public void af() {
        this.O = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ah() {
        Bundle bundle;
        Bundle bundle2 = this.h;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        ag(this.Q, bundle);
        this.D.E(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ai() {
        Bundle bundle;
        Bundle bundle2 = this.h;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.D.P(bundle);
            this.D.t();
        }
    }

    public final void aj(int i, int i2, int i3, int i4) {
        if (this.T == null && i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 == 0) {
                    if (i4 != 0) {
                        i2 = 0;
                        i3 = 0;
                    } else {
                        return;
                    }
                } else {
                    i2 = 0;
                }
            }
        }
        B().b = i;
        B().c = i2;
        B().d = i3;
        B().e = i4;
    }

    public void ak(Bundle bundle) {
        if (this.B != null && aA()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.m = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void al(View view) {
        B().m = view;
    }

    @Deprecated
    public final void am(boolean z) {
        if (this.M != z) {
            this.M = z;
            if (aw() && !ax()) {
                this.C.f();
            }
        }
    }

    public final void an(cf cfVar) {
        Bundle bundle;
        if (this.B == null) {
            Bundle bundle2 = null;
            if (cfVar != null && (bundle = cfVar.a) != null) {
                bundle2 = bundle;
            }
            this.h = bundle2;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public final void ao(boolean z) {
        if (this.N != z) {
            this.N = z;
            if (this.M && aw() && !ax()) {
                this.C.f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ap(int i) {
        if (this.T == null && i == 0) {
            return;
        }
        B();
        this.T.f = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aq(boolean z) {
        if (this.T == null) {
            return;
        }
        B().a = z;
    }

    @Deprecated
    public void ar(boolean z) {
        emh emhVar = new emh(this);
        emb.d(emhVar);
        ema b = emb.b(this);
        if (b.b.contains(elz.DETECT_RETAIN_INSTANCE_USAGE) && emb.e(b, getClass(), emhVar.getClass())) {
            emb.c(b, emhVar);
        }
        this.K = z;
        da daVar = this.B;
        if (daVar != null) {
            if (z) {
                daVar.x.a(this);
                return;
            } else {
                daVar.x.e(this);
                return;
            }
        }
        this.L = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void as(ArrayList arrayList, ArrayList arrayList2) {
        B();
        cc ccVar = this.T;
        ccVar.g = arrayList;
        ccVar.h = arrayList2;
    }

    @Deprecated
    public void at(boolean z) {
        da daVar;
        emj emjVar = new emj(this, z);
        emb.d(emjVar);
        ema b = emb.b(this);
        if (b.b.contains(elz.DETECT_SET_USER_VISIBLE_HINT) && emb.e(b, getClass(), emjVar.getClass())) {
            emb.c(b, emjVar);
        }
        if (!this.S && z && this.g < 5 && (daVar = this.B) != null && aw() && this.W) {
            daVar.M(daVar.k(this));
        }
        this.S = z;
        boolean z2 = false;
        if (this.g < 5 && !z) {
            z2 = true;
        }
        this.R = z2;
        if (this.h != null) {
            this.k = Boolean.valueOf(z);
        }
    }

    public void au(Intent intent) {
        aG(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean av() {
        cc ccVar = this.T;
        if (ccVar == null) {
            return false;
        }
        return ccVar.a;
    }

    public final boolean aw() {
        if (this.C != null && this.r) {
            return true;
        }
        return false;
    }

    public final boolean ax() {
        cg cgVar;
        if (this.I) {
            return true;
        }
        if (this.B != null && (cgVar = this.E) != null && cgVar.ax()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ay() {
        if (this.A > 0) {
            return true;
        }
        return false;
    }

    public final boolean az() {
        if (this.g >= 7) {
            return true;
        }
        return false;
    }

    public void f(Context context) {
        Activity activity;
        this.O = true;
        cn cnVar = this.C;
        if (cnVar == null) {
            activity = null;
        } else {
            activity = cnVar.b;
        }
        if (activity != null) {
            this.O = false;
            Y(activity);
        }
    }

    @Deprecated
    public final cg fd() {
        return d(true);
    }

    public final cj fe() {
        cn cnVar = this.C;
        if (cnVar == null) {
            return null;
        }
        return (cj) cnVar.b;
    }

    public void g(Bundle bundle) {
        this.O = true;
        ai();
        da daVar = this.D;
        if (daVar.m > 0) {
            return;
        }
        daVar.t();
    }

    public final Bundle getArguments() {
        return this.m;
    }

    public LayoutInflater gl(Bundle bundle) {
        return aD();
    }

    public cl gm() {
        return new bz(this);
    }

    public void h() {
        this.O = true;
    }

    public void i() {
        this.O = true;
    }

    public void k() {
        this.O = true;
    }

    public void l() {
        this.O = true;
    }

    public void m(Bundle bundle) {
        this.O = true;
    }

    public void n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.D.noteStateNotSaved();
        this.z = true;
        this.aa = new dn(this, aL(), new bo(this, 4));
        View K = K(layoutInflater, viewGroup, bundle);
        this.Q = K;
        if (K != null) {
            this.aa.b();
            if (da.Y(3)) {
                Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.Q + " for Fragment " + this);
            }
            dyx.d(this.Q, this.aa);
            dyy.o(this.Q, this.aa);
            gvf.bm(this.Q, this.aa);
            this.ab.j(this.aa);
            return;
        }
        if (this.aa.a == null) {
            this.aa = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.O = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        F().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.O = true;
    }

    public final int s() {
        cc ccVar = this.T;
        if (ccVar == null) {
            return 0;
        }
        return ccVar.b;
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i) {
        if (this.C != null) {
            da H = H();
            if (H.r != null) {
                H.s.addLast(new cw(this.l, i));
                H.r.c(intent);
                return;
            }
            H.n.i(intent, i);
            return;
        }
        throw new IllegalStateException(a.cc(this, "Fragment ", " not attached to Activity"));
    }

    public final int t() {
        cc ccVar = this.T;
        if (ccVar == null) {
            return 0;
        }
        return ccVar.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.l);
        if (this.F != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.F));
        }
        if (this.H != null) {
            sb.append(" tag=");
            sb.append(this.H);
        }
        sb.append(")");
        return sb.toString();
    }

    public final int u() {
        cc ccVar = this.T;
        if (ccVar == null) {
            return 0;
        }
        return ccVar.d;
    }

    public final int v() {
        cc ccVar = this.T;
        if (ccVar == null) {
            return 0;
        }
        return ccVar.e;
    }

    public Animator w(int i, boolean z, int i2) {
        return null;
    }

    public Context x() {
        cn cnVar = this.C;
        if (cnVar == null) {
            return null;
        }
        return cnVar.c;
    }

    public final Context y() {
        Context x = x();
        if (x != null) {
            return x;
        }
        throw new IllegalStateException(a.cc(this, "Fragment ", " not attached to a context."));
    }

    public final Resources z() {
        return y().getResources();
    }

    public cg(int i) {
        this();
        this.fr = i;
    }

    @Deprecated
    public void aJ() {
    }

    public void ac(boolean z) {
    }

    @Deprecated
    public void ae(Menu menu) {
    }

    public void j(Bundle bundle) {
    }

    @Deprecated
    public void Z(Menu menu, MenuInflater menuInflater) {
    }

    public void aH(int i, int i2) {
    }

    public void ag(View view, Bundle bundle) {
    }
}
