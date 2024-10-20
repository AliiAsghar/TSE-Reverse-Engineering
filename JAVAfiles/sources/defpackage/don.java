package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import defpackage.don;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
@armg
/* loaded from: classes.dex */
public final class don implements doe {
    public final View a;
    public final dnq b;
    public boolean c;
    public arqr d;
    public arqr e;
    public doj f;
    public dno g;
    public final List h;
    public final arml i;
    public final dmz j;
    public final cbh k;
    public Runnable l;
    private final Executor m;
    private Rect n;

    /* compiled from: PG */
    /* renamed from: don$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<List<? extends dnd>, arnb> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: don$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<dnn, arnb> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            int i = ((dnn) obj).a;
            return arnb.a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final /* synthetic */ a[] e;

        static {
            a aVar = new a("StartInput", 0);
            a = aVar;
            a aVar2 = new a("StopInput", 1);
            b = aVar2;
            a aVar3 = new a("ShowKeyboard", 2);
            c = aVar3;
            a aVar4 = new a("HideKeyboard", 3);
            d = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            e = aVarArr;
            arhi.f(aVarArr);
        }

        private a(String str, int i) {
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public don(View view, cqm cqmVar) {
        dnr dnrVar = new dnr(view);
        final Choreographer choreographer = Choreographer.getInstance();
        Executor executor = new Executor() { // from class: dot
            @Override // java.util.concurrent.Executor
            public final void execute(final Runnable runnable) {
                choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: dos
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        runnable.run();
                    }
                });
            }
        };
        this.a = view;
        this.b = dnrVar;
        this.m = executor;
        this.d = doq.a;
        this.e = dor.a;
        this.f = new doj("", djc.a, 4);
        this.g = dno.a;
        this.h = new ArrayList();
        this.i = armd.b(3, new doo(this));
        this.j = new dmz(cqmVar, dnrVar);
        this.k = new cbh(new a[16]);
    }

    private final void e(a aVar) {
        this.k.n(aVar);
        if (this.l == null) {
            Runnable runnable = new Runnable() { // from class: dom
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
                    View findFocus;
                    don donVar = don.this;
                    donVar.l = null;
                    if (!donVar.a.isFocused() && (findFocus = donVar.a.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                        donVar.k.g();
                        return;
                    }
                    arsb arsbVar = new arsb();
                    arsb arsbVar2 = new arsb();
                    cbh cbhVar = donVar.k;
                    int i = cbhVar.b;
                    if (i > 0) {
                        Object[] objArr = cbhVar.a;
                        int i2 = 0;
                        do {
                            don.a aVar2 = (don.a) objArr[i2];
                            don.a aVar3 = don.a.a;
                            int ordinal = aVar2.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if ((ordinal == 2 || ordinal == 3) && !d.F(arsbVar.a, false)) {
                                        if (aVar2 == don.a.c) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        arsbVar2.a = Boolean.valueOf(z);
                                    }
                                } else {
                                    arsbVar.a = false;
                                    arsbVar2.a = false;
                                }
                            } else {
                                arsbVar.a = true;
                                arsbVar2.a = true;
                            }
                            i2++;
                        } while (i2 < i);
                    }
                    donVar.k.g();
                    if (d.F(arsbVar.a, true)) {
                        donVar.a();
                    }
                    Boolean bool = (Boolean) arsbVar2.a;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            ((dyg) ((dnr) donVar.b).b.a).d();
                        } else {
                            ((dyg) ((dnr) donVar.b).b.a).c();
                        }
                    }
                    if (d.F(arsbVar.a, false)) {
                        donVar.a();
                    }
                }
            };
            this.m.execute(runnable);
            this.l = runnable;
        }
    }

    public final void a() {
        dnr dnrVar = (dnr) this.b;
        dnrVar.b().restartInput(dnrVar.a);
    }

    @Override // defpackage.doe
    @armg
    public final void b(cjp cjpVar) {
        Rect rect;
        float f = cjpVar.e;
        this.n = new Rect(arsk.g(cjpVar.b), arsk.g(cjpVar.c), arsk.g(cjpVar.d), arsk.g(f));
        if (this.h.isEmpty() && (rect = this.n) != null) {
            this.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // defpackage.doe
    public final void c() {
        e(a.a);
    }

    @Override // defpackage.doe
    public final void d(doj dojVar, dno dnoVar, arqr arqrVar, arqr arqrVar2) {
        this.c = true;
        this.f = dojVar;
        this.g = dnoVar;
        this.d = arqrVar;
        this.e = arqrVar2;
        e(a.a);
    }

    @Override // defpackage.doe
    public final void f() {
        this.c = false;
        this.d = AnonymousClass1.a;
        this.e = AnonymousClass2.a;
        this.n = null;
        e(a.b);
    }

    @Override // defpackage.doe
    public final void g(doj dojVar, doj dojVar2) {
        int i;
        int i2;
        int i3;
        boolean z = true;
        if (defpackage.a.bB(this.f.b, dojVar2.b) && d.F(this.f.c, dojVar2.c)) {
            z = false;
        }
        this.f = dojVar2;
        int size = this.h.size();
        for (int i4 = 0; i4 < size; i4++) {
            dof dofVar = (dof) ((WeakReference) this.h.get(i4)).get();
            if (dofVar != null) {
                dofVar.a = dojVar2;
            }
        }
        dmz dmzVar = this.j;
        synchronized (dmzVar.a) {
            dmzVar.h = null;
            dmzVar.j = null;
            dmzVar.i = null;
            dmzVar.k = dmy.a;
            dmzVar.l = null;
            dmzVar.m = null;
        }
        int i5 = -1;
        if (d.F(dojVar, dojVar2)) {
            if (z) {
                dnq dnqVar = this.b;
                long j = dojVar2.b;
                int d = djc.d(j);
                int c = djc.c(j);
                djc djcVar = this.f.c;
                if (djcVar != null) {
                    i3 = djc.d(djcVar.b);
                } else {
                    i3 = -1;
                }
                djc djcVar2 = this.f.c;
                if (djcVar2 != null) {
                    i5 = djc.c(djcVar2.b);
                }
                dnqVar.a(d, c, i3, i5);
                return;
            }
            return;
        }
        if (dojVar != null && (!d.F(dojVar.a(), dojVar2.a()) || (defpackage.a.bB(dojVar.b, dojVar2.b) && !d.F(dojVar.c, dojVar2.c)))) {
            a();
            return;
        }
        int size2 = this.h.size();
        for (int i6 = 0; i6 < size2; i6++) {
            dof dofVar2 = (dof) ((WeakReference) this.h.get(i6)).get();
            if (dofVar2 != null) {
                doj dojVar3 = this.f;
                dnq dnqVar2 = this.b;
                if (dofVar2.d) {
                    dofVar2.a = dojVar3;
                    if (dofVar2.c) {
                        dnr dnrVar = (dnr) dnqVar2;
                        dnrVar.b().updateExtractedText(dnrVar.a, dofVar2.b, dns.a(dojVar3));
                    }
                    djc djcVar3 = dojVar3.c;
                    if (djcVar3 != null) {
                        i = djc.d(djcVar3.b);
                    } else {
                        i = -1;
                    }
                    djc djcVar4 = dojVar3.c;
                    if (djcVar4 != null) {
                        i2 = djc.c(djcVar4.b);
                    } else {
                        i2 = -1;
                    }
                    dnqVar2.a(djc.d(dojVar3.b), djc.c(dojVar3.b), i, i2);
                }
            }
        }
    }

    @Override // defpackage.doe
    public final void h(doj dojVar, dob dobVar, diy diyVar, arqr arqrVar, cjp cjpVar, cjp cjpVar2) {
        dmz dmzVar = this.j;
        synchronized (dmzVar.a) {
            dmzVar.h = dojVar;
            dmzVar.j = dobVar;
            dmzVar.i = diyVar;
            dmzVar.k = arqrVar;
            dmzVar.l = cjpVar;
            dmzVar.m = cjpVar2;
            if (dmzVar.c || dmzVar.b) {
                dmzVar.a();
            }
        }
    }

    @Override // defpackage.doe
    public final void i() {
        e(a.d);
    }

    @Override // defpackage.doe
    public final void k() {
        e(a.c);
    }
}
