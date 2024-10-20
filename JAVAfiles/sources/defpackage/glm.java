package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class glm implements Cloneable {
    public ArrayList h;
    public ArrayList i;
    long o;
    gli p;
    long q;
    public gvf t;
    private glj[] z;
    private static final Animator[] v = new Animator[0];
    private static final int[] w = {2, 1, 3, 4};
    private static final gvf D = new gvf(null);
    private static final ThreadLocal x = new ThreadLocal();
    private final String y = getClass().getName();
    public long a = -1;
    public long b = -1;
    public TimeInterpolator c = null;
    final ArrayList d = new ArrayList();
    final ArrayList e = new ArrayList();
    public gpx r = new gpx();
    public gpx s = new gpx();
    glu f = null;
    public final int[] g = w;
    final ArrayList j = new ArrayList();
    private Animator[] A = v;
    int k = 0;
    private boolean B = false;
    boolean l = false;
    public glm m = null;
    private ArrayList C = null;
    public ArrayList n = new ArrayList();
    public gvf u = D;

    private static void K(gpx gpxVar, View view, glw glwVar) {
        ((vl) gpxVar.b).put(view, glwVar);
        int id = view.getId();
        if (id >= 0) {
            if (((SparseArray) gpxVar.d).indexOfKey(id) >= 0) {
                ((SparseArray) gpxVar.d).put(id, null);
            } else {
                ((SparseArray) gpxVar.d).put(id, view);
            }
        }
        String f = edz.f(view);
        if (f != null) {
            if (((vl) gpxVar.c).containsKey(f)) {
                ((vl) gpxVar.c).put(f, null);
            } else {
                ((vl) gpxVar.c).put(f, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (((uj) gpxVar.a).a(itemIdAtPosition) >= 0) {
                    View view2 = (View) ((uj) gpxVar.a).d(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        ((uj) gpxVar.a).h(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                ((uj) gpxVar.a).h(itemIdAtPosition, view);
            }
        }
    }

    private final void e(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                glw glwVar = new glw(view);
                if (z) {
                    c(glwVar);
                } else {
                    b(glwVar);
                }
                glwVar.c.add(this);
                n(glwVar);
                if (z) {
                    K(this.r, view, glwVar);
                } else {
                    K(this.s, view, glwVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    e(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    private static boolean f(glw glwVar, glw glwVar2, String str) {
        Map map = glwVar2.a;
        Object obj = glwVar.a.get(str);
        Object obj2 = map.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static tm g() {
        ThreadLocal threadLocal = x;
        tm tmVar = (tm) threadLocal.get();
        if (tmVar == null) {
            tm tmVar2 = new tm();
            threadLocal.set(tmVar2);
            return tmVar2;
        }
        return tmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean A(View view) {
        int id = view.getId();
        if ((this.d.size() == 0 && this.e.size() == 0) || this.d.contains(Integer.valueOf(id)) || this.e.contains(view)) {
            return true;
        }
        return false;
    }

    public final void B(glj gljVar) {
        if (this.C == null) {
            this.C = new ArrayList();
        }
        this.C.add(gljVar);
    }

    public final void C(glj gljVar) {
        glm glmVar;
        ArrayList arrayList = this.C;
        if (arrayList != null) {
            if (!arrayList.remove(gljVar) && (glmVar = this.m) != null) {
                glmVar.C(gljVar);
            }
            if (this.C.size() == 0) {
                this.C = null;
            }
        }
    }

    public void D(long j) {
        this.b = j;
    }

    public void E(TimeInterpolator timeInterpolator) {
        this.c = timeInterpolator;
    }

    public void G(long j) {
        this.a = j;
    }

    public void H(ViewGroup viewGroup, gpx gpxVar, gpx gpxVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator a;
        View view;
        Animator animator;
        glw glwVar;
        int i;
        Animator animator2;
        glw glwVar2;
        tm g = g();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        gli gliVar = i().p;
        int i2 = 0;
        while (i2 < size) {
            glw glwVar3 = (glw) arrayList.get(i2);
            glw glwVar4 = (glw) arrayList2.get(i2);
            if (glwVar3 != null && !glwVar3.c.contains(this)) {
                glwVar3 = null;
            }
            if (glwVar4 != null && !glwVar4.c.contains(this)) {
                glwVar4 = null;
            }
            if ((glwVar3 != null || glwVar4 != null) && ((glwVar3 == null || glwVar4 == null || z(glwVar3, glwVar4)) && (a = a(viewGroup, glwVar3, glwVar4)) != null)) {
                if (glwVar4 != null) {
                    View view2 = glwVar4.b;
                    String[] d = d();
                    if (d != null) {
                        glw glwVar5 = new glw(view2);
                        glw glwVar6 = (glw) ((vl) gpxVar2.b).get(view2);
                        animator2 = a;
                        if (glwVar6 != null) {
                            int i3 = 0;
                            while (i3 < d.length) {
                                Map map = glwVar5.a;
                                String str = d[i3];
                                map.put(str, glwVar6.a.get(str));
                                i3++;
                                d = d;
                            }
                        }
                        int i4 = g.d;
                        int i5 = 0;
                        while (true) {
                            if (i5 < i4) {
                                gbl gblVar = (gbl) g.get((Animator) g.d(i5));
                                if (gblVar.e != null && gblVar.f == view2) {
                                    if (((String) gblVar.a).equals(this.y) && ((glw) gblVar.e).equals(glwVar5)) {
                                        glwVar2 = glwVar5;
                                        animator2 = null;
                                        break;
                                    }
                                }
                                i5++;
                            } else {
                                glwVar2 = glwVar5;
                                break;
                            }
                        }
                    } else {
                        animator2 = a;
                        glwVar2 = null;
                    }
                    view = view2;
                    glwVar = glwVar2;
                    animator = animator2;
                } else {
                    view = glwVar3.b;
                    animator = a;
                    glwVar = null;
                }
                if (animator != null) {
                    i = size;
                    gbl gblVar2 = new gbl(view, this.y, this, viewGroup.getWindowId(), glwVar, animator);
                    if (gliVar != null) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animator);
                        animator = animatorSet;
                    }
                    g.put(animator, gblVar2);
                    this.n.add(animator);
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                gbl gblVar3 = (gbl) g.get((Animator) this.n.get(sparseIntArray.keyAt(i6)));
                ((Animator) gblVar3.c).setStartDelay((sparseIntArray.valueAt(i6) - Long.MAX_VALUE) + ((Animator) gblVar3.c).getStartDelay());
            }
        }
    }

    public void I(gvf gvfVar) {
        this.t = gvfVar;
    }

    public void J(gvf gvfVar) {
        if (gvfVar == null) {
            this.u = D;
        } else {
            this.u = gvfVar;
        }
    }

    public Animator a(ViewGroup viewGroup, glw glwVar, glw glwVar2) {
        return null;
    }

    public abstract void b(glw glwVar);

    public abstract void c(glw glwVar);

    public String[] d() {
        return null;
    }

    @Override // 
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public glm clone() {
        try {
            glm glmVar = (glm) super.clone();
            glmVar.n = new ArrayList();
            glmVar.r = new gpx();
            glmVar.s = new gpx();
            glmVar.h = null;
            glmVar.i = null;
            glmVar.p = null;
            glmVar.m = this;
            glmVar.C = null;
            return glmVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final glm i() {
        glu gluVar = this.f;
        if (gluVar != null) {
            return gluVar.i();
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final glw j(View view, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        glu gluVar = this.f;
        if (gluVar != null) {
            return gluVar.j(view, z);
        }
        if (z) {
            arrayList = this.h;
        } else {
            arrayList = this.i;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                glw glwVar = (glw) arrayList.get(i);
                if (glwVar == null) {
                    return null;
                }
                if (glwVar.b == view) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return null;
        }
        if (z) {
            arrayList2 = this.i;
        } else {
            arrayList2 = this.h;
        }
        return (glw) arrayList2.get(i);
    }

    public final glw k(View view, boolean z) {
        gpx gpxVar;
        glu gluVar = this.f;
        if (gluVar != null) {
            return gluVar.k(view, z);
        }
        if (z) {
            gpxVar = this.r;
        } else {
            gpxVar = this.s;
        }
        return (glw) ((vl) gpxVar.b).get(view);
    }

    public String l(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.b != -1) {
            sb.append("dur(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.a != -1) {
            sb.append("dly(");
            sb.append(this.a);
            sb.append(") ");
        }
        if (this.c != null) {
            sb.append("interp(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.d.size() > 0 || this.e.size() > 0) {
            sb.append("tgts(");
            if (this.d.size() > 0) {
                for (int i = 0; i < this.d.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.d.get(i));
                }
            }
            if (this.e.size() > 0) {
                for (int i2 = 0; i2 < this.e.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.e.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void m() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A);
        this.A = v;
        while (true) {
            size--;
            if (size >= 0) {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.cancel();
            } else {
                this.A = animatorArr;
                r(this, gll.c, false);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(ViewGroup viewGroup, boolean z) {
        boolean z2;
        p(z);
        if (this.d.size() <= 0 && this.e.size() <= 0) {
            e(viewGroup, z);
            return;
        }
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= this.d.size()) {
                break;
            }
            View findViewById = viewGroup.findViewById(((Integer) this.d.get(i)).intValue());
            if (findViewById != null) {
                glw glwVar = new glw(findViewById);
                if (z) {
                    c(glwVar);
                } else {
                    b(glwVar);
                    z3 = false;
                }
                glwVar.c.add(this);
                n(glwVar);
                if (z3) {
                    K(this.r, findViewById, glwVar);
                } else {
                    K(this.s, findViewById, glwVar);
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            View view = (View) this.e.get(i2);
            glw glwVar2 = new glw(view);
            if (z) {
                c(glwVar2);
                z2 = true;
            } else {
                b(glwVar2);
                z2 = false;
            }
            glwVar2.c.add(this);
            n(glwVar2);
            if (z2) {
                K(this.r, view, glwVar2);
            } else {
                K(this.s, view, glwVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(boolean z) {
        if (z) {
            ((vl) this.r.b).clear();
            ((SparseArray) this.r.d).clear();
            ((uj) this.r.a).g();
        } else {
            ((vl) this.s.b).clear();
            ((SparseArray) this.s.d).clear();
            ((uj) this.s.a).g();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q() {
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            r(this, gll.b, false);
            for (int i2 = 0; i2 < ((uj) this.r.a).b(); i2++) {
                View view = (View) ((uj) this.r.a).e(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((uj) this.s.a).b(); i3++) {
                View view2 = (View) ((uj) this.s.a).e(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.l = true;
        }
    }

    public final void r(glm glmVar, gll gllVar, boolean z) {
        glm glmVar2 = this.m;
        if (glmVar2 != null) {
            glmVar2.r(glmVar, gllVar, z);
        }
        ArrayList arrayList = this.C;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.C.size();
            glj[] gljVarArr = this.z;
            if (gljVarArr == null) {
                gljVarArr = new glj[size];
            }
            this.z = null;
            glj[] gljVarArr2 = (glj[]) this.C.toArray(gljVarArr);
            for (int i = 0; i < size; i++) {
                gllVar.a(gljVarArr2[i], glmVar);
                gljVarArr2[i] = null;
            }
            this.z = gljVarArr2;
        }
    }

    public void s(View view) {
        if (!this.l) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A);
            this.A = v;
            while (true) {
                size--;
                if (size >= 0) {
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.pause();
                } else {
                    this.A = animatorArr;
                    r(this, gll.d, false);
                    this.B = true;
                    return;
                }
            }
        }
    }

    public void t() {
        long totalDuration;
        tm g = g();
        this.o = 0L;
        for (int i = 0; i < this.n.size(); i++) {
            Animator animator = (Animator) this.n.get(i);
            gbl gblVar = (gbl) g.get(animator);
            if (animator != null && gblVar != null) {
                long j = this.b;
                if (j >= 0) {
                    ((Animator) gblVar.c).setDuration(j);
                }
                long j2 = this.a;
                if (j2 >= 0) {
                    Animator animator2 = (Animator) gblVar.c;
                    animator2.setStartDelay(j2 + animator2.getStartDelay());
                }
                TimeInterpolator timeInterpolator = this.c;
                if (timeInterpolator != null) {
                    ((Animator) gblVar.c).setInterpolator(timeInterpolator);
                }
                this.j.add(animator);
                long j3 = this.o;
                totalDuration = animator.getTotalDuration();
                this.o = Math.max(j3, totalDuration);
            }
        }
        this.n.clear();
    }

    public final String toString() {
        return l("");
    }

    public void u(View view) {
        if (this.B) {
            if (!this.l) {
                ArrayList arrayList = this.j;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A);
                this.A = v;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.A = animatorArr;
                r(this, gll.e, false);
            }
            this.B = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void v() {
        x();
        tm g = g();
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (g.containsKey(animator)) {
                x();
                if (animator != null) {
                    animator.addListener(new glg(this, g));
                    long j = this.b;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.a;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2 + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.c;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new glh(this));
                    animator.start();
                }
            }
        }
        this.n.clear();
        q();
    }

    public void w(long j, long j2) {
        boolean z;
        long totalDuration;
        long j3 = this.o;
        if (j < j2) {
            z = true;
        } else {
            z = false;
        }
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.l = false;
            r(this, gll.a, z);
        }
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A);
        this.A = v;
        for (int i = 0; i < size; i++) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            totalDuration = animator.getTotalDuration();
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), totalDuration));
        }
        this.A = animatorArr;
        if ((j > j3 && j2 <= j3) || (j < 0 && j2 >= 0)) {
            if (j > j3) {
                this.l = true;
            }
            r(this, gll.b, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x() {
        if (this.k == 0) {
            r(this, gll.a, false);
            this.l = false;
        }
        this.k++;
    }

    public boolean y() {
        if (!this.j.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean z(glw glwVar, glw glwVar2) {
        if (glwVar == null || glwVar2 == null) {
            return false;
        }
        String[] d = d();
        if (d != null) {
            for (String str : d) {
                if (!f(glwVar, glwVar2, str)) {
                }
            }
            return false;
        }
        Iterator it = glwVar.a.keySet().iterator();
        while (it.hasNext()) {
            if (f(glwVar, glwVar2, (String) it.next())) {
            }
        }
        return false;
        return true;
    }

    public void F() {
    }

    public void n(glw glwVar) {
    }
}
