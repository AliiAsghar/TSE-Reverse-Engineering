package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rh extends arrp implements arqr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r6v14, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v43, types: [java.lang.Object, ascc] */
    /* JADX WARN: Type inference failed for: r6v46, types: [arzx, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        float f;
        float f2;
        boolean z = false;
        ?? r3 = 0;
        rg rgVar = null;
        switch (this.b) {
            case 0:
                ((qz) obj).getClass();
                rm rmVar = (rm) this.a;
                arnr arnrVar = rmVar.a;
                ListIterator listIterator = arnrVar.listIterator(arnrVar.c);
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object previous = listIterator.previous();
                        if (((rg) previous).b) {
                            r3 = previous;
                        }
                    }
                }
                rg rgVar2 = (rg) r3;
                if (rmVar.b != null) {
                    rmVar.c();
                }
                rmVar.b = rgVar2;
                if (rgVar2 != null) {
                    rgVar2.d();
                }
                return arnb.a;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return Boolean.valueOf(aqjn.aH(this.a, edz.f((View) entry.getValue())));
            case 2:
                qz qzVar = (qz) obj;
                qzVar.getClass();
                rm rmVar2 = (rm) this.a;
                rg rgVar3 = rmVar2.b;
                if (rgVar3 == null) {
                    arnr arnrVar2 = rmVar2.a;
                    ListIterator listIterator2 = arnrVar2.listIterator(arnrVar2.c);
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            ?? previous2 = listIterator2.previous();
                            if (((rg) previous2).b) {
                                rgVar = previous2;
                            }
                        }
                    }
                    rgVar3 = rgVar;
                }
                if (rgVar3 != null) {
                    rgVar3.c(qzVar);
                }
                return arnb.a;
            case 3:
                if (obj == this.a) {
                    return "(this)";
                }
                return String.valueOf(obj);
            case 4:
                if (obj == this.a) {
                    return "(this)";
                }
                return String.valueOf(obj);
            case 5:
                if (obj == this.a) {
                    return "(this)";
                }
                return String.valueOf(obj);
            case 6:
                this.a.cancel(false);
                return arnb.a;
            case 7:
                cle cleVar = (cle) obj;
                if (!Float.isNaN(((dvp) this.a).f) || !Float.isNaN(((dvp) this.a).g)) {
                    float f3 = 0.5f;
                    if (Float.isNaN(((dvp) this.a).f)) {
                        f = 0.5f;
                    } else {
                        f = ((dvp) this.a).f;
                    }
                    if (!Float.isNaN(((dvp) this.a).g)) {
                        f3 = ((dvp) this.a).g;
                    }
                    cleVar.C(cmh.a(f, f3));
                }
                if (!Float.isNaN(((dvp) this.a).h)) {
                    cleVar.u(((dvp) this.a).h);
                }
                if (!Float.isNaN(((dvp) this.a).i)) {
                    cleVar.v(((dvp) this.a).i);
                }
                if (!Float.isNaN(((dvp) this.a).j)) {
                    cleVar.w(((dvp) this.a).j);
                }
                if (!Float.isNaN(((dvp) this.a).k)) {
                    cleVar.D(((dvp) this.a).k);
                }
                if (!Float.isNaN(((dvp) this.a).l)) {
                    cleVar.E(((dvp) this.a).l);
                }
                if (!Float.isNaN(((dvp) this.a).m)) {
                    cleVar.z(((dvp) this.a).m);
                }
                if (!Float.isNaN(((dvp) this.a).n) || !Float.isNaN(((dvp) this.a).o)) {
                    float f4 = 1.0f;
                    if (Float.isNaN(((dvp) this.a).n)) {
                        f2 = 1.0f;
                    } else {
                        f2 = ((dvp) this.a).n;
                    }
                    cleVar.x(f2);
                    if (!Float.isNaN(((dvp) this.a).o)) {
                        f4 = ((dvp) this.a).o;
                    }
                    cleVar.y(f4);
                }
                if (!Float.isNaN(((dvp) this.a).p)) {
                    cleVar.o(((dvp) this.a).p);
                }
                return arnb.a;
            case 8:
                arqg arqgVar = (arqg) obj;
                if (d.F(Looper.myLooper(), Looper.getMainLooper())) {
                    arqgVar.a();
                } else {
                    Handler handler = ((duh) this.a).a;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        ((duh) this.a).a = handler;
                    }
                    handler.post(new ou(arqgVar, 12, r3));
                }
                return arnb.a;
            case 9:
                ((duh) this.a).a();
                return arnb.a;
            case 10:
                if (((Throwable) obj) != null) {
                    ((eij) this.a).h.B(new eis());
                }
                if (((eij) this.a).f.b()) {
                    eip f5 = ((eij) this.a).f();
                    f5.b.set(true);
                    f5.a.a();
                }
                return arnb.a;
            case 11:
                fzu fzuVar = (fzu) obj;
                fzuVar.getClass();
                if (!((Boolean) ((fzi) this.a).d.c()).booleanValue()) {
                    Iterator it = ((fzi) this.a).l.iterator();
                    while (it.hasNext()) {
                        ((arqr) it.next()).a(fzuVar);
                    }
                } else {
                    Handler handler2 = (Handler) ((fzi) this.a).n.a();
                    fzi fziVar = (fzi) this.a;
                    handler2.removeCallbacks(fziVar.o);
                    ((AtomicReference) fziVar.o.a).set(fzuVar);
                    handler2.post(fziVar.o);
                }
                return arnb.a;
            case 12:
                ((gqg) this.a).d.h(null);
                return arnb.a;
            case 13:
                armd.w(this.a);
                return arnb.a;
            case 14:
                return kkc.n((fzu) obj, (gba) this.a);
            case 15:
                WeakReference weakReference = (WeakReference) obj;
                weakReference.getClass();
                if (weakReference.get() == null || weakReference.get() == this.a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                WeakReference weakReference2 = (WeakReference) obj;
                weakReference2.getClass();
                if (weakReference2.get() == null || weakReference2.get() == this.a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 17:
                ((ghw) obj).getClass();
                return ((gze) this.a).call();
            case 18:
                gkd gkdVar = (gkd) obj;
                gkdVar.getClass();
                ((ktk) this.a).c = gkdVar;
                return arnb.a;
            case 19:
                ghm ghmVar = (ghm) obj;
                ghmVar.getClass();
                return ((gid) this.a).c(ghmVar);
            default:
                Object obj2 = ((Object[]) this.a)[((Number) obj).intValue()];
                if (obj2 != null) {
                    return (Byte) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Byte");
        }
    }
}
