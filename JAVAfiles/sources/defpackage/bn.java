package defpackage;

import android.app.Application;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bn implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public bn(dzm dzmVar, Typeface typeface, int i) {
        this.c = i;
        this.a = dzmVar;
        this.b = typeface;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [ecd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i = 0;
        switch (this.c) {
            case 0:
                dm.a((View) this.a, (Rect) this.b);
                return;
            case 1:
                Object obj = this.b;
                obj.getClass();
                ((dv) this.a).d((du) obj);
                return;
            case 2:
                bc.b((du) this.a, (bq) this.b);
                return;
            case 3:
                bc.b((du) this.a, (bq) this.b);
                return;
            case 4:
                Iterator it = ((bq) this.b).a.iterator();
                while (it.hasNext()) {
                    du duVar = ((br) it.next()).a;
                    View view2 = duVar.a.Q;
                    if (view2 != null) {
                        ef.e(duVar.h, view2, (ViewGroup) this.a);
                    }
                }
                return;
            case 5:
                dv dvVar = (dv) this.a;
                List list = dvVar.b;
                Object obj2 = this.b;
                if (list.contains(obj2)) {
                    du duVar2 = (du) obj2;
                    int i2 = duVar2.h;
                    View view3 = duVar2.a.Q;
                    view3.getClass();
                    ef.e(i2, view3, dvVar.a);
                    return;
                }
                return;
            case 6:
                dv dvVar2 = (dv) this.a;
                List list2 = dvVar2.b;
                Object obj3 = this.b;
                list2.remove(obj3);
                dvVar2.c.remove(obj3);
                return;
            case 7:
                ?? r0 = this.a;
                Object obj4 = this.b;
                try {
                    r0.run();
                    return;
                } finally {
                    ((ez) obj4).a();
                }
            case 8:
                ?? r02 = this.a;
                int size = r02.size();
                while (i < size) {
                    irv irvVar = (irv) r02.get(i);
                    Object obj5 = this.b;
                    oo ooVar = irvVar.a;
                    int i3 = irvVar.b;
                    int i4 = irvVar.c;
                    int i5 = irvVar.d;
                    int i6 = irvVar.e;
                    View view4 = ooVar.a;
                    int i7 = i5 - i3;
                    int i8 = i6 - i4;
                    if (i7 != 0) {
                        view4.animate().translationX(brg.a);
                    }
                    if (i8 != 0) {
                        view4.animate().translationY(brg.a);
                    }
                    ViewPropertyAnimator animate = view4.animate();
                    pg pgVar = (pg) obj5;
                    pgVar.j.add(ooVar);
                    animate.setDuration(((nt) obj5).b()).setListener(new lx(pgVar, ooVar, i7, view4, i8, animate)).start();
                    i++;
                }
                ((ArrayList) this.a).clear();
                ((pg) this.b).g.remove(this.a);
                return;
            case 9:
                ?? r03 = this.a;
                int size2 = r03.size();
                while (i < size2) {
                    ma maVar = (ma) r03.get(i);
                    Object obj6 = this.b;
                    oo ooVar2 = maVar.a;
                    View view5 = null;
                    if (ooVar2 == null) {
                        view = null;
                    } else {
                        view = ooVar2.a;
                    }
                    oo ooVar3 = maVar.b;
                    if (ooVar3 != null) {
                        view5 = ooVar3.a;
                    }
                    if (view != null) {
                        ViewPropertyAnimator duration = view.animate().setDuration(250L);
                        pg pgVar2 = (pg) obj6;
                        pgVar2.l.add(maVar.a);
                        duration.translationX(maVar.e - maVar.c);
                        duration.translationY(maVar.f - maVar.d);
                        duration.alpha(brg.a).setListener(new ly(pgVar2, maVar, duration, view)).start();
                    }
                    if (view5 != null) {
                        ViewPropertyAnimator animate2 = view5.animate();
                        pg pgVar3 = (pg) obj6;
                        pgVar3.l.add(maVar.b);
                        animate2.translationX(brg.a).translationY(brg.a).setDuration(250L).alpha(1.0f).setListener(new lz(pgVar3, maVar, animate2, view5)).start();
                    }
                    i++;
                }
                ((ArrayList) this.a).clear();
                ((pg) this.b).h.remove(this.a);
                return;
            case 10:
                ?? r04 = this.a;
                int size3 = r04.size();
                while (i < size3) {
                    oo ooVar4 = (oo) r04.get(i);
                    Object obj7 = this.b;
                    View view6 = ooVar4.a;
                    ViewPropertyAnimator animate3 = view6.animate();
                    pg pgVar4 = (pg) obj7;
                    pgVar4.i.add(ooVar4);
                    animate3.alpha(1.0f).setDuration(((nt) obj7).a).setListener(new lw(pgVar4, ooVar4, view6, animate3)).start();
                    i++;
                }
                ((ArrayList) this.a).clear();
                ((pg) this.b).f.remove(this.a);
                return;
            case 11:
                ((re) this.b).t((rm) this.a);
                return;
            case 12:
                ((dya) this.b).a = this.a;
                return;
            case 13:
                ((Application) this.b).unregisterActivityLifecycleCallbacks(this.a);
                return;
            case 14:
                try {
                    if (dyb.d != null) {
                        dyb.d.invoke(this.b, this.a, false, "AppCompat recreation");
                        return;
                    } else {
                        dyb.e.invoke(this.b, this.a, false);
                        return;
                    }
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 15:
                ((eal) this.a).b((Typeface) this.b);
                return;
            case 16:
                ((dzm) this.a).b((Typeface) this.b);
                return;
            case 17:
                this.b.accept(this.a);
                return;
            case 18:
                ((dyp) ((fvq) this.b).b).a((Throwable) this.a);
                return;
            case 19:
                Throwable th2 = (Throwable) this.b;
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat(String.valueOf(this.a)), th2);
                throw th2;
            default:
                ept eptVar = (ept) this.b;
                boolean f = eptVar.f();
                Object obj8 = this.a;
                if (f) {
                    eptVar.b(obj8);
                } else {
                    eptVar.c(obj8);
                }
                eptVar.f = 3;
                return;
        }
    }

    public /* synthetic */ bn(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ bn(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public bn(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
