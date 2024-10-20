package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gnt extends no implements gnu {
    final enh c;
    final da d;
    final uj e;
    public boolean f;
    final hgi g;
    private final uj h;
    private final uj i;
    private gns j;
    private boolean k;

    public gnt(cj cjVar) {
        da a = cjVar.a();
        enh N = cjVar.N();
        this.e = new uj();
        this.h = new uj();
        this.i = new uj();
        this.g = new hgi((byte[]) null, (char[]) null);
        this.f = false;
        this.k = false;
        this.d = a;
        this.c = N;
        super.A(true);
    }

    public static final void K(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    private static long M(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private final Long N(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.i.b(); i2++) {
            if (((Integer) this.i.e(i2)).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.i.c(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    private static String O(String str, long j) {
        return str + j;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List, java.lang.Object] */
    private final void P(long j) {
        ViewParent parent;
        cg cgVar = (cg) this.e.d(j);
        if (cgVar == null) {
            return;
        }
        View view = cgVar.Q;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!I(j)) {
            this.h.i(j);
        }
        if (!cgVar.aw()) {
            this.e.i(j);
            return;
        }
        if (J()) {
            this.k = true;
            return;
        }
        if (cgVar.aw() && I(j)) {
            hgi hgiVar = this.g;
            ArrayList arrayList = new ArrayList();
            Iterator it = hgiVar.a.iterator();
            if (!it.hasNext()) {
                cf b = this.d.b(cgVar);
                hgi.v(arrayList);
                this.h.h(j, b);
            } else {
                throw null;
            }
        }
        hgi hgiVar2 = this.g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = hgiVar2.a.iterator();
        if (!it2.hasNext()) {
            try {
                bd bdVar = new bd(this.d);
                bdVar.n(cgVar);
                bdVar.b();
                this.e.i(j);
                return;
            } finally {
                hgi.v(arrayList2);
            }
        }
        throw null;
    }

    private final void Q(cg cgVar, FrameLayout frameLayout) {
        ((CopyOnWriteArrayList) this.d.y.b).add(new efu(new cv(cgVar, frameLayout), (byte[]) null));
    }

    private static boolean R(String str, String str2) {
        if (str.startsWith(str2) && str.length() > str2.length()) {
            return true;
        }
        return false;
    }

    public abstract cg F(int i);

    public final void G() {
        cg cgVar;
        View view;
        if (this.k && !J()) {
            to toVar = new to();
            for (int i = 0; i < this.e.b(); i++) {
                long c = this.e.c(i);
                if (!I(c)) {
                    toVar.add(Long.valueOf(c));
                    this.i.i(c);
                }
            }
            if (!this.f) {
                this.k = false;
                for (int i2 = 0; i2 < this.e.b(); i2++) {
                    uj ujVar = this.e;
                    uj ujVar2 = this.i;
                    long c2 = ujVar.c(i2);
                    if (!ujVar2.j(c2) && ((cgVar = (cg) this.e.d(c2)) == null || (view = cgVar.Q) == null || view.getParent() == null)) {
                        toVar.add(Long.valueOf(c2));
                    }
                }
            }
            tn tnVar = new tn(toVar);
            while (tnVar.hasNext()) {
                P(((Long) tnVar.next()).longValue());
            }
        }
    }

    @Override // defpackage.gnu
    public final void H(Parcelable parcelable) {
        if (this.h.k() && this.e.k()) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.getClassLoader() == null) {
                bundle.setClassLoader(getClass().getClassLoader());
            }
            for (String str : bundle.keySet()) {
                if (R(str, "f#")) {
                    this.e.h(M(str, "f#"), this.d.g(bundle, str));
                } else if (R(str, "s#")) {
                    long M = M(str, "s#");
                    cf cfVar = (cf) bundle.getParcelable(str);
                    if (I(M)) {
                        this.h.h(M, cfVar);
                    }
                } else {
                    throw new IllegalArgumentException("Unexpected key in savedState: ".concat(String.valueOf(str)));
                }
            }
            if (!this.e.k()) {
                this.k = true;
                this.f = true;
                G();
                Handler handler = new Handler(Looper.getMainLooper());
                fyk fykVar = new fyk(this, 18, null);
                this.c.c(new gno(handler, fykVar, 0));
                handler.postDelayed(fykVar, 10000L);
                return;
            }
            return;
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    public final boolean I(long j) {
        if (j >= 0 && j < b()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean J() {
        return this.d.ab();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List, java.lang.Object] */
    public final void L(oo ooVar) {
        cg cgVar = (cg) this.e.d(ooVar.e);
        if (cgVar != null) {
            FrameLayout C = ooVar.C();
            View view = cgVar.Q;
            if (!cgVar.aw() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            if (cgVar.aw() && view == null) {
                Q(cgVar, C);
                return;
            }
            if (cgVar.aw() && view.getParent() != null) {
                if (view.getParent() != C) {
                    K(view, C);
                    return;
                }
                return;
            }
            if (cgVar.aw()) {
                K(view, C);
                return;
            }
            if (!J()) {
                Q(cgVar, C);
                hgi hgiVar = this.g;
                ArrayList arrayList = new ArrayList();
                Iterator it = hgiVar.a.iterator();
                if (!it.hasNext()) {
                    try {
                        cgVar.ao(false);
                        bd bdVar = new bd(this.d);
                        bdVar.s(cgVar, "f" + ooVar.e);
                        bdVar.o(cgVar, eng.STARTED);
                        bdVar.b();
                        this.j.a(false);
                        return;
                    } finally {
                        hgi.v(arrayList);
                    }
                }
                throw null;
            }
            if (!this.d.w) {
                this.c.c(new gno(this, ooVar, 1));
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // defpackage.no
    public final /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new oo(frameLayout);
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        long j = ooVar.e;
        int id = ooVar.C().getId();
        Long N = N(id);
        if (N != null && N.longValue() != j) {
            P(N.longValue());
            this.i.i(N.longValue());
        }
        this.i.h(j, Integer.valueOf(id));
        long j2 = i;
        if (!this.e.j(j2)) {
            cg F = F(i);
            F.an((cf) this.h.d(j2));
            this.e.h(j2, F);
        }
        if (ooVar.C().isAttachedToWindow()) {
            L(ooVar);
        }
        G();
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void gH(oo ooVar) {
        L(ooVar);
        G();
    }

    @Override // defpackage.no
    public final long gI(int i) {
        return i;
    }

    @Override // defpackage.no
    public final void gJ(RecyclerView recyclerView) {
        boolean z;
        if (this.j == null) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        gns gnsVar = new gns(this);
        this.j = gnsVar;
        gnsVar.b = gns.b(recyclerView);
        gnsVar.e = new gnq(gnsVar);
        gnsVar.b.a.i(gnsVar.e);
        gnsVar.d = new gnp(gnsVar);
        gnsVar.c.D(gnsVar.d);
        gnsVar.a = new gnr(gnsVar, 0);
        gnsVar.c.c.c(gnsVar.a);
    }

    @Override // defpackage.no
    public final void gK(RecyclerView recyclerView) {
        gns gnsVar = this.j;
        ViewPager2 b = gns.b(recyclerView);
        b.a.a.remove(gnsVar.e);
        gnsVar.c.E(gnsVar.d);
        gnsVar.c.c.d(gnsVar.a);
        gnsVar.b = null;
        this.j = null;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void k(oo ooVar) {
        Long N = N(ooVar.C().getId());
        if (N != null) {
            P(N.longValue());
            this.i.i(N.longValue());
        }
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ boolean l(oo ooVar) {
        return true;
    }

    @Override // defpackage.gnu
    public final Parcelable m() {
        Bundle bundle = new Bundle(this.e.b() + this.h.b());
        for (int i = 0; i < this.e.b(); i++) {
            uj ujVar = this.e;
            long c = ujVar.c(i);
            cg cgVar = (cg) ujVar.d(c);
            if (cgVar != null && cgVar.aw()) {
                this.d.N(bundle, O("f#", c), cgVar);
            }
        }
        for (int i2 = 0; i2 < this.h.b(); i2++) {
            long c2 = this.h.c(i2);
            if (I(c2)) {
                bundle.putParcelable(O("s#", c2), (Parcelable) this.h.d(c2));
            }
        }
        return bundle;
    }
}
