package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pg extends nt {
    private static TimeInterpolator m;
    boolean e;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    ArrayList k;
    public ArrayList l;
    private ArrayList n;
    private ArrayList o;
    private ArrayList p;
    private ArrayList q;

    public pg(byte[] bArr) {
        this.e = true;
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    private final void u(List list, oo ooVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ma maVar = (ma) list.get(size);
                if (x(maVar, ooVar) && maVar.a == null && maVar.b == null) {
                    list.remove(maVar);
                }
            } else {
                return;
            }
        }
    }

    private final void v(ma maVar) {
        oo ooVar = maVar.a;
        if (ooVar != null) {
            x(maVar, ooVar);
        }
        oo ooVar2 = maVar.b;
        if (ooVar2 != null) {
            x(maVar, ooVar2);
        }
    }

    private final void w(oo ooVar) {
        if (m == null) {
            m = new ValueAnimator().getInterpolator();
        }
        ooVar.a.animate().setInterpolator(m);
        g(ooVar);
    }

    private final boolean x(ma maVar, oo ooVar) {
        if (maVar.b == ooVar) {
            maVar.b = null;
        } else if (maVar.a == ooVar) {
            maVar.a = null;
        } else {
            return false;
        }
        ooVar.a.setAlpha(1.0f);
        ooVar.a.setTranslationX(brg.a);
        ooVar.a.setTranslationY(brg.a);
        e(ooVar);
        return true;
    }

    @Override // defpackage.nt
    public final void g(oo ooVar) {
        View view = ooVar.a;
        view.animate().cancel();
        int size = this.p.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((irv) this.p.get(size)).a == ooVar) {
                view.setTranslationY(brg.a);
                view.setTranslationX(brg.a);
                e(ooVar);
                this.p.remove(size);
            }
        }
        u(this.q, ooVar);
        if (this.n.remove(ooVar)) {
            view.setAlpha(1.0f);
            e(ooVar);
        }
        if (this.o.remove(ooVar)) {
            view.setAlpha(1.0f);
            e(ooVar);
        }
        int size2 = this.h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.h.get(size2);
            u(arrayList, ooVar);
            if (arrayList.isEmpty()) {
                this.h.remove(size2);
            }
        }
        int size3 = this.g.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.g.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((irv) arrayList2.get(size4)).a == ooVar) {
                    view.setTranslationY(brg.a);
                    view.setTranslationX(brg.a);
                    e(ooVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.g.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList3 = (ArrayList) this.f.get(size5);
                if (arrayList3.remove(ooVar)) {
                    view.setAlpha(1.0f);
                    e(ooVar);
                    if (arrayList3.isEmpty()) {
                        this.f.remove(size5);
                    }
                }
            } else {
                this.k.remove(ooVar);
                this.i.remove(ooVar);
                this.l.remove(ooVar);
                this.j.remove(ooVar);
                q();
                return;
            }
        }
    }

    @Override // defpackage.nt
    public final void h() {
        int size = this.p.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            irv irvVar = (irv) this.p.get(size);
            View view = irvVar.a.a;
            view.setTranslationY(brg.a);
            view.setTranslationX(brg.a);
            e(irvVar.a);
            this.p.remove(size);
        }
        int size2 = this.n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            e((oo) this.n.get(size2));
            this.n.remove(size2);
        }
        int size3 = this.o.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            oo ooVar = (oo) this.o.get(size3);
            ooVar.a.setAlpha(1.0f);
            e(ooVar);
            this.o.remove(size3);
        }
        int size4 = this.q.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            } else {
                v((ma) this.q.get(size4));
            }
        }
        this.q.clear();
        if (!p()) {
            return;
        }
        int size5 = this.g.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.g.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    irv irvVar2 = (irv) arrayList.get(size6);
                    View view2 = irvVar2.a.a;
                    view2.setTranslationY(brg.a);
                    view2.setTranslationX(brg.a);
                    e(irvVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.g.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.f.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.f.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    oo ooVar2 = (oo) arrayList2.get(size8);
                    ooVar2.a.setAlpha(1.0f);
                    e(ooVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.h.size();
        while (true) {
            size9--;
            if (size9 >= 0) {
                ArrayList arrayList3 = (ArrayList) this.h.get(size9);
                int size10 = arrayList3.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        v((ma) arrayList3.get(size10));
                        if (arrayList3.isEmpty()) {
                            this.h.remove(arrayList3);
                        }
                    }
                }
            } else {
                a.H(this.k);
                a.H(this.j);
                a.H(this.i);
                a.H(this.l);
                f();
                return;
            }
        }
    }

    @Override // defpackage.nt
    public final void i() {
        long j;
        long j2;
        boolean isEmpty = this.n.isEmpty();
        boolean isEmpty2 = this.p.isEmpty();
        boolean isEmpty3 = this.q.isEmpty();
        boolean z = !isEmpty3;
        boolean isEmpty4 = this.o.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4) {
            if (!isEmpty3) {
                z = true;
            } else {
                return;
            }
        }
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            oo ooVar = (oo) arrayList.get(i);
            View view = ooVar.a;
            ViewPropertyAnimator animate = view.animate();
            this.k.add(ooVar);
            animate.setDuration(this.b).alpha(brg.a).setListener(new lv(this, ooVar, animate, view)).start();
        }
        this.n.clear();
        if (!isEmpty2) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.p);
            this.g.add(arrayList2);
            this.p.clear();
            bn bnVar = new bn(this, arrayList2, 8, (char[]) null);
            if (!isEmpty) {
                View view2 = ((irv) arrayList2.get(0)).a.a;
                long j3 = this.b;
                int[] iArr = eek.a;
                view2.postOnAnimationDelayed(bnVar, j3);
            } else {
                bnVar.run();
            }
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(this.q);
            this.h.add(arrayList3);
            this.q.clear();
            bn bnVar2 = new bn(this, arrayList3, 9, (char[]) null);
            if (!isEmpty) {
                View view3 = ((ma) arrayList3.get(0)).a.a;
                long j4 = this.b;
                int[] iArr2 = eek.a;
                view3.postOnAnimationDelayed(bnVar2, j4);
            } else {
                bnVar2.run();
            }
        }
        if (!isEmpty4) {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(this.o);
            this.f.add(arrayList4);
            this.o.clear();
            bn bnVar3 = new bn(this, arrayList4, 10, (char[]) null);
            if (isEmpty && isEmpty2 && !z) {
                bnVar3.run();
                return;
            }
            long j5 = 0;
            if (!isEmpty) {
                j = this.b;
            } else {
                j = 0;
            }
            if (!isEmpty2) {
                j2 = b();
            } else {
                j2 = 0;
            }
            if (z) {
                j5 = 250;
            }
            long max = j + Math.max(j2, j5);
            View view4 = ((oo) arrayList4.get(0)).a;
            int[] iArr3 = eek.a;
            view4.postOnAnimationDelayed(bnVar3, max);
        }
    }

    @Override // defpackage.nt
    public final boolean j(oo ooVar, ns nsVar, ns nsVar2) {
        int i;
        int i2;
        if (nsVar != null && ((i = nsVar.a) != (i2 = nsVar2.a) || nsVar.b != nsVar2.b)) {
            return s(ooVar, i, nsVar.b, i2, nsVar2.b);
        }
        w(ooVar);
        ooVar.a.setAlpha(brg.a);
        this.o.add(ooVar);
        return true;
    }

    @Override // defpackage.nt
    public boolean k(oo ooVar, oo ooVar2, ns nsVar, ns nsVar2) {
        int i;
        int i2;
        int i3 = nsVar.a;
        int i4 = nsVar.b;
        if (ooVar2.A()) {
            int i5 = nsVar.a;
            i2 = nsVar.b;
            i = i5;
        } else {
            i = nsVar2.a;
            i2 = nsVar2.b;
        }
        return r(ooVar, ooVar2, i3, i4, i, i2);
    }

    @Override // defpackage.nt
    public final boolean l(oo ooVar, ns nsVar, ns nsVar2) {
        int i;
        int i2;
        int i3 = nsVar.a;
        int i4 = nsVar.b;
        View view = ooVar.a;
        if (nsVar2 == null) {
            i = view.getLeft();
        } else {
            i = nsVar2.a;
        }
        int i5 = i;
        if (nsVar2 == null) {
            i2 = view.getTop();
        } else {
            i2 = nsVar2.b;
        }
        int i6 = i2;
        if (!ooVar.v() && (i3 != i5 || i4 != i6)) {
            view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
            return s(ooVar, i3, i4, i5, i6);
        }
        w(ooVar);
        this.n.add(ooVar);
        return true;
    }

    @Override // defpackage.nt
    public final boolean m(oo ooVar, ns nsVar, ns nsVar2) {
        int i = nsVar.a;
        int i2 = nsVar2.a;
        if (i == i2 && nsVar.b == nsVar2.b) {
            e(ooVar);
            return false;
        }
        return s(ooVar, i, nsVar.b, i2, nsVar2.b);
    }

    @Override // defpackage.nt
    public boolean n(oo ooVar) {
        if (this.e && !ooVar.t()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.nt
    public boolean o(oo ooVar, List list) {
        if (list.isEmpty() && !n(ooVar)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.nt
    public final boolean p() {
        if (this.o.isEmpty() && this.q.isEmpty() && this.p.isEmpty() && this.n.isEmpty() && this.j.isEmpty() && this.k.isEmpty() && this.i.isEmpty() && this.l.isEmpty() && this.g.isEmpty() && this.f.isEmpty() && this.h.isEmpty()) {
            return false;
        }
        return true;
    }

    public final void q() {
        if (!p()) {
            f();
        }
    }

    public boolean r(oo ooVar, oo ooVar2, int i, int i2, int i3, int i4) {
        if (ooVar == ooVar2) {
            return s(ooVar, i, i2, i3, i4);
        }
        float translationX = ooVar.a.getTranslationX();
        float translationY = ooVar.a.getTranslationY();
        float alpha = ooVar.a.getAlpha();
        w(ooVar);
        float f = (i3 - i) - translationX;
        float f2 = (i4 - i2) - translationY;
        ooVar.a.setTranslationX(translationX);
        ooVar.a.setTranslationY(translationY);
        ooVar.a.setAlpha(alpha);
        if (ooVar2 != null) {
            w(ooVar2);
            ooVar2.a.setTranslationX(-((int) f));
            ooVar2.a.setTranslationY(-((int) f2));
            ooVar2.a.setAlpha(brg.a);
        }
        this.q.add(new ma(ooVar, ooVar2, i, i2, i3, i4));
        return true;
    }

    public final boolean s(oo ooVar, int i, int i2, int i3, int i4) {
        View view = ooVar.a;
        int translationX = (int) view.getTranslationX();
        int translationY = (int) ooVar.a.getTranslationY();
        w(ooVar);
        int i5 = i + translationX;
        int i6 = i3 - i5;
        int i7 = i2 + translationY;
        int i8 = i4 - i7;
        if (i6 == 0) {
            i6 = 0;
            if (i8 == 0) {
                e(ooVar);
                return false;
            }
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        this.p.add(new irv(ooVar, i5, i7, i3, i4));
        return true;
    }

    public final void t() {
        this.e = false;
    }

    public pg() {
        this.e = true;
    }
}
