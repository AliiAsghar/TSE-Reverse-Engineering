package defpackage;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentContainerView;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dg {
    public final cg a;
    private final di c;
    private final fdx e;
    private boolean d = false;
    public int b = -1;

    public dg(fdx fdxVar, di diVar, cg cgVar) {
        this.e = fdxVar;
        this.c = diVar;
        this.a = cgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle a() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        cg cgVar = this.a;
        if (cgVar.g == -1 && (bundle = cgVar.h) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new df(this.a));
        if (this.a.g >= 0) {
            Bundle bundle3 = new Bundle();
            this.a.j(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.e.p(this.a, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.a.af.x(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle a = this.a.D.a();
            if (!a.isEmpty()) {
                bundle2.putBundle("childFragmentManager", a);
            }
            if (this.a.Q != null) {
                g();
            }
            SparseArray<? extends Parcelable> sparseArray = this.a.i;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.a.j;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.a.m;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void b() {
        View view;
        View view2;
        cg f = da.f(this.a.P);
        cg cgVar = this.a.E;
        if (f != null && !f.equals(cgVar)) {
            cg cgVar2 = this.a;
            int i = cgVar2.G;
            int i2 = emb.a;
            cgVar2.getClass();
            emn emnVar = new emn(cgVar2, f, i);
            emb.d(emnVar);
            ema b = emb.b(cgVar2);
            if (b.b.contains(elz.DETECT_WRONG_NESTED_HIERARCHY) && emb.e(b, cgVar2.getClass(), emnVar.getClass())) {
                emb.c(b, emnVar);
            }
        }
        di diVar = this.c;
        cg cgVar3 = this.a;
        ViewGroup viewGroup = cgVar3.P;
        int i3 = -1;
        if (viewGroup != null) {
            int indexOf = diVar.a.indexOf(cgVar3);
            int i4 = indexOf - 1;
            while (true) {
                if (i4 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= diVar.a.size()) {
                            break;
                        }
                        cg cgVar4 = (cg) diVar.a.get(indexOf);
                        if (cgVar4.P == viewGroup && (view = cgVar4.Q) != null) {
                            i3 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    cg cgVar5 = (cg) diVar.a.get(i4);
                    if (cgVar5.P == viewGroup && (view2 = cgVar5.Q) != null) {
                        i3 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i4--;
                }
            }
        }
        cg cgVar6 = this.a;
        cgVar6.P.addView(cgVar6.Q, i3);
    }

    final void c() {
        Bundle bundle;
        String str;
        if (this.a.v) {
            return;
        }
        if (da.Y(3)) {
            cg cgVar = this.a;
            Objects.toString(cgVar);
            Log.d("FragmentManager", "moveto CREATE_VIEW: ".concat(String.valueOf(cgVar)));
        }
        Bundle bundle2 = this.a.h;
        ViewGroup viewGroup = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        cg cgVar2 = this.a;
        LayoutInflater J = cgVar2.J(bundle);
        ViewGroup viewGroup2 = cgVar2.P;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = cgVar2.G;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) cgVar2.B.o.a(i);
                    if (viewGroup == null) {
                        cg cgVar3 = this.a;
                        if (!cgVar3.y && !cgVar3.x) {
                            try {
                                str = cgVar3.z().getResourceName(this.a.G);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.a.G) + " (" + str + ") for fragment " + this.a);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        cg cgVar4 = this.a;
                        int i2 = emb.a;
                        cgVar4.getClass();
                        emm emmVar = new emm(cgVar4, viewGroup);
                        emb.d(emmVar);
                        ema b = emb.b(cgVar4);
                        if (b.b.contains(elz.DETECT_WRONG_FRAGMENT_CONTAINER) && emb.e(b, cgVar4.getClass(), emmVar.getClass())) {
                            emb.c(b, emmVar);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + this.a + " for a container view with no id");
                }
            }
        }
        cg cgVar5 = this.a;
        cgVar5.P = viewGroup;
        cgVar5.n(J, viewGroup, bundle);
        if (this.a.Q != null) {
            if (da.Y(3)) {
                cg cgVar6 = this.a;
                Objects.toString(cgVar6);
                Log.d("FragmentManager", "moveto VIEW_CREATED: ".concat(String.valueOf(cgVar6)));
            }
            this.a.Q.setSaveFromParentEnabled(false);
            cg cgVar7 = this.a;
            cgVar7.Q.setTag(R.id.fragment_container_view_tag, cgVar7);
            if (viewGroup != null) {
                b();
            }
            cg cgVar8 = this.a;
            if (cgVar8.I) {
                cgVar8.Q.setVisibility(8);
            }
            if (this.a.Q.isAttachedToWindow()) {
                edx.c(this.a.Q);
            } else {
                View view = this.a.Q;
                view.addOnAttachStateChangeListener(new ib(view, 1));
            }
            this.a.ah();
            fdx fdxVar = this.e;
            cg cgVar9 = this.a;
            fdxVar.s(cgVar9, cgVar9.Q, bundle, false);
            int visibility = this.a.Q.getVisibility();
            this.a.B().l = this.a.Q.getAlpha();
            cg cgVar10 = this.a;
            if (cgVar10.P != null && visibility == 0) {
                View findFocus = cgVar10.Q.findFocus();
                if (findFocus != null) {
                    this.a.al(findFocus);
                    if (da.Y(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.a);
                    }
                }
                this.a.Q.setAlpha(brg.a);
            }
        }
        this.a.g = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        Bundle bundle;
        cg cgVar = this.a;
        if (cgVar.v && cgVar.w && !cgVar.z) {
            if (da.Y(3)) {
                cg cgVar2 = this.a;
                Objects.toString(cgVar2);
                Log.d("FragmentManager", "moveto CREATE_VIEW: ".concat(String.valueOf(cgVar2)));
            }
            Bundle bundle2 = this.a.h;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            cg cgVar3 = this.a;
            cgVar3.n(cgVar3.J(bundle), null, bundle);
            View view = this.a.Q;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                cg cgVar4 = this.a;
                cgVar4.Q.setTag(R.id.fragment_container_view_tag, cgVar4);
                cg cgVar5 = this.a;
                if (cgVar5.I) {
                    cgVar5.Q.setVisibility(8);
                }
                this.a.ah();
                fdx fdxVar = this.e;
                cg cgVar6 = this.a;
                fdxVar.s(cgVar6, cgVar6.Q, bundle, false);
                this.a.g = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0465, code lost:
    
        r14.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x04ed, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0713, code lost:
    
        if (r6 != false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x04ed, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 2322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dg.e():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(ClassLoader classLoader) {
        Bundle bundle = this.a.h;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (this.a.h.getBundle("savedInstanceState") == null) {
                this.a.h.putBundle("savedInstanceState", new Bundle());
            }
            try {
                cg cgVar = this.a;
                cgVar.i = cgVar.h.getSparseParcelableArray("viewState");
                cg cgVar2 = this.a;
                cgVar2.j = cgVar2.h.getBundle("viewRegistryState");
                df dfVar = (df) this.a.h.getParcelable("state");
                if (dfVar != null) {
                    cg cgVar3 = this.a;
                    cgVar3.o = dfVar.m;
                    cgVar3.p = dfVar.n;
                    Boolean bool = cgVar3.k;
                    if (bool != null) {
                        cgVar3.S = bool.booleanValue();
                        this.a.k = null;
                    } else {
                        cgVar3.S = dfVar.o;
                    }
                }
                cg cgVar4 = this.a;
                if (!cgVar4.S) {
                    cgVar4.R = true;
                }
            } catch (BadParcelableException e) {
                cg cgVar5 = this.a;
                Objects.toString(cgVar5);
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment ".concat(String.valueOf(cgVar5)), e);
            }
        }
    }

    final void g() {
        if (this.a.Q != null) {
            if (da.Y(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + this.a + " with view " + this.a.Q);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.a.Q.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.a.i = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.a.aa.b.x(bundle);
            if (!bundle.isEmpty()) {
                this.a.j = bundle;
            }
        }
    }

    public dg(fdx fdxVar, di diVar, cg cgVar, Bundle bundle) {
        this.e = fdxVar;
        this.c = diVar;
        this.a = cgVar;
        cgVar.i = null;
        cgVar.j = null;
        cgVar.A = 0;
        cgVar.w = false;
        cgVar.r = false;
        cg cgVar2 = cgVar.n;
        cgVar.o = cgVar2 != null ? cgVar2.l : null;
        cgVar.n = null;
        cgVar.h = bundle;
        cgVar.m = bundle.getBundle("arguments");
    }

    public dg(fdx fdxVar, di diVar, ClassLoader classLoader, cm cmVar, Bundle bundle) {
        this.e = fdxVar;
        this.c = diVar;
        df dfVar = (df) bundle.getParcelable("state");
        cg b = cmVar.b(dfVar.a);
        b.l = dfVar.b;
        b.v = dfVar.c;
        b.x = dfVar.d;
        b.y = true;
        b.F = dfVar.e;
        b.G = dfVar.f;
        b.H = dfVar.g;
        b.K = dfVar.h;
        b.s = dfVar.i;
        b.J = dfVar.j;
        b.I = dfVar.k;
        b.Y = eng.values()[dfVar.l];
        b.o = dfVar.m;
        b.p = dfVar.n;
        b.S = dfVar.o;
        this.a = b;
        b.h = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        b.ak(bundle2);
        if (da.Y(2)) {
            Objects.toString(b);
            Log.v("FragmentManager", "Instantiated fragment ".concat(String.valueOf(b)));
        }
    }
}
