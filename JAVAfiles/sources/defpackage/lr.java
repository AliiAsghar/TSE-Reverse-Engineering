package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lr extends no {
    private final lt c;

    @SafeVarargs
    public lr(lq lqVar, no... noVarArr) {
        lt ltVar;
        int size;
        ni niVar;
        List asList = Arrays.asList(noVarArr);
        this.c = new lt(this, lqVar);
        Iterator it = asList.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                no noVar = (no) it.next();
                ltVar = this.c;
                size = ltVar.e.size();
                if (size < 0 || size > ltVar.e.size()) {
                    break;
                }
                if (noVar.a) {
                    Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
                }
                int size2 = ltVar.e.size();
                while (true) {
                    if (i < size2) {
                        if (((ni) ltVar.e.get(i)).c == noVar) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i == -1) {
                    niVar = null;
                } else {
                    niVar = (ni) ltVar.e.get(i);
                }
                if (niVar == null) {
                    ni niVar2 = new ni(noVar, ltVar, ltVar.b, (nq) ltVar.f.a);
                    ltVar.e.add(size, niVar2);
                    Iterator it2 = ltVar.c.iterator();
                    while (it2.hasNext()) {
                        RecyclerView recyclerView = (RecyclerView) ((WeakReference) it2.next()).get();
                        if (recyclerView != null) {
                            noVar.gJ(recyclerView);
                        }
                    }
                    if (niVar2.a > 0) {
                        ltVar.a.w(ltVar.a(niVar2), niVar2.a);
                    }
                    ltVar.d();
                }
            } else {
                super.A(false);
                return;
            }
        }
        throw new IndexOutOfBoundsException("Index must be between 0 and " + ltVar.e.size() + ". Given:" + size);
    }

    @Override // defpackage.no
    public final int b() {
        Iterator it = this.c.e.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((ni) it.next()).a;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, ql] */
    @Override // defpackage.no
    public final int c(int i) {
        lt ltVar = this.c;
        ls b = ltVar.b(i);
        ni niVar = b.a;
        int b2 = niVar.b.b(((no) niVar.c).c(b.b));
        ltVar.f(b);
        return b2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ql] */
    @Override // defpackage.no
    public final oo e(ViewGroup viewGroup, int i) {
        ni a = this.c.b.a(i);
        return ((no) a.c).e(viewGroup, a.b.a(i));
    }

    @Override // defpackage.no
    public final void g(oo ooVar, int i) {
        lt ltVar = this.c;
        ls b = ltVar.b(i);
        ltVar.d.put(ooVar, b.a);
        ni niVar = b.a;
        ((no) niVar.c).o(ooVar, b.b);
        ltVar.f(b);
    }

    @Override // defpackage.no
    public final void gH(oo ooVar) {
        ((no) this.c.c(ooVar).c).gH(ooVar);
    }

    @Override // defpackage.no
    public final long gI(int i) {
        lt ltVar = this.c;
        ls b = ltVar.b(i);
        ni niVar = b.a;
        ((no) niVar.c).gI(b.b);
        Object obj = niVar.e;
        ltVar.f(b);
        return -1L;
    }

    @Override // defpackage.no
    public final void gJ(RecyclerView recyclerView) {
        lt ltVar = this.c;
        Iterator it = ltVar.c.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        ltVar.c.add(new WeakReference(recyclerView));
        Iterator it2 = ltVar.e.iterator();
        while (it2.hasNext()) {
            ((no) ((ni) it2.next()).c).gJ(recyclerView);
        }
    }

    @Override // defpackage.no
    public final void gK(RecyclerView recyclerView) {
        lt ltVar = this.c;
        int size = ltVar.c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) ltVar.c.get(size);
            if (weakReference.get() == null) {
                ltVar.c.remove(size);
            } else if (weakReference.get() == recyclerView) {
                ltVar.c.remove(size);
                break;
            }
        }
        Iterator it = ltVar.e.iterator();
        while (it.hasNext()) {
            ((no) ((ni) it.next()).c).gK(recyclerView);
        }
    }

    @Override // defpackage.no
    public final int gL(no noVar, oo ooVar, int i) {
        lt ltVar = this.c;
        ni niVar = (ni) ltVar.d.get(ooVar);
        if (niVar == null) {
            return -1;
        }
        int a = i - ltVar.a(niVar);
        int b = ((no) niVar.c).b();
        if (a >= 0 && a < b) {
            return ((no) niVar.c).gL(noVar, ooVar, a);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + a + " which is out of bounds for the adapter with size " + b + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + ooVar + "adapter:" + noVar);
    }

    @Override // defpackage.no
    public final void j(oo ooVar) {
        ((no) this.c.c(ooVar).c).j(ooVar);
    }

    @Override // defpackage.no
    public final void k(oo ooVar) {
        lt ltVar = this.c;
        ni niVar = (ni) ltVar.d.get(ooVar);
        if (niVar != null) {
            ((no) niVar.c).k(ooVar);
            ltVar.d.remove(ooVar);
            return;
        }
        throw new IllegalStateException(a.cd(ltVar, ooVar, "Cannot find wrapper for ", ", seems like it is not bound by this adapter: "));
    }

    @Override // defpackage.no
    public final boolean l(oo ooVar) {
        lt ltVar = this.c;
        ni niVar = (ni) ltVar.d.get(ooVar);
        if (niVar != null) {
            boolean l = ((no) niVar.c).l(ooVar);
            ltVar.d.remove(ooVar);
            return l;
        }
        throw new IllegalStateException(a.cd(ltVar, ooVar, "Cannot find wrapper for ", ", seems like it is not bound by this adapter: "));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(int i) {
        super.C(i);
    }
}
