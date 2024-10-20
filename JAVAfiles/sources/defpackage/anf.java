package defpackage;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import defpackage.bwj;
import defpackage.ces;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anf {
    public static final WeakHashMap a = new WeakHashMap();
    public final ajv b;
    public final ajv c;
    public final ajv d;
    public final ajv e;
    public final ajv f;
    public final and g;
    public final boolean h;
    public int i;
    public final alr j;
    private final ajv k = new ajv(4, "captionBar");
    private final ajv l;
    private final ajv m;
    private final ajv n;
    private final anb o;
    private final anb p;
    private final anb q;
    private final anb r;
    private final anb s;
    private final anb t;
    private final anb u;
    private final anb v;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: anf$a$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends arrp implements arqr<bxi, bxh> {
            final /* synthetic */ anf a;
            final /* synthetic */ View b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(anf anfVar, View view) {
                super(1);
                this.a = anfVar;
                this.b = view;
            }

            @Override // defpackage.arqr
            public final /* bridge */ /* synthetic */ Object a(Object obj) {
                anf anfVar = this.a;
                if (anfVar.i == 0) {
                    View view = this.b;
                    edz.k(view, anfVar.j);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(anfVar.j);
                    mka.i(view, anfVar.j);
                }
                anfVar.i++;
                return new ane(this.a, this.b);
            }
        }

        public static final /* synthetic */ anb a(String str) {
            return anl.b(eaq.a, str);
        }

        public static final anf b(bwj bwjVar) {
            anf anfVar;
            View view = (View) bwjVar.g(AndroidCompositionLocals_androidKt.f);
            synchronized (anf.a) {
                WeakHashMap weakHashMap = anf.a;
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new anf(view);
                    weakHashMap.put(view, obj);
                }
                anfVar = (anf) obj;
            }
            boolean I = bwjVar.I(anfVar) | bwjVar.I(view);
            Object h = bwjVar.h();
            if (I || h == bwj.a.a) {
                h = new AnonymousClass1(anfVar, view);
                bwjVar.B(h);
            }
            bxl.c(anfVar, (arqr) h, bwjVar);
            return anfVar;
        }
    }

    public anf(View view) {
        View view2;
        Object obj;
        ajv ajvVar = new ajv(128, "displayCutout");
        this.b = ajvVar;
        ajv ajvVar2 = new ajv(8, "ime");
        this.c = ajvVar2;
        this.l = new ajv(32, "mandatorySystemGestures");
        this.d = new ajv(2, "navigationBars");
        this.e = new ajv(1, "statusBars");
        ajv ajvVar3 = new ajv(7, "systemBars");
        this.f = ajvVar3;
        this.m = new ajv(16, "systemGestures");
        this.n = new ajv(64, "tappableElement");
        this.o = anl.b(eaq.a, "waterfall");
        this.g = new amz(new amz(ajvVar3, ajvVar2), ajvVar);
        this.p = a.a("captionBarIgnoringVisibility");
        this.q = a.a("navigationBarsIgnoringVisibility");
        this.r = a.a("statusBarsIgnoringVisibility");
        this.s = a.a("systemBarsIgnoringVisibility");
        this.t = a.a("tappableElementIgnoringVisibility");
        this.u = a.a("imeAnimationTarget");
        this.v = a.a("imeAnimationSource");
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            obj = view2.getTag(R.id.consume_window_insets_tag);
        } else {
            obj = null;
        }
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        this.h = bool != null ? bool.booleanValue() : true;
        this.j = new alr(this);
    }

    public static /* synthetic */ void c(anf anfVar, efo efoVar) {
        eaq eaqVar;
        Insets waterfallInsets;
        anfVar.k.f(efoVar);
        anfVar.c.f(efoVar);
        anfVar.b.f(efoVar);
        anfVar.d.f(efoVar);
        anfVar.e.f(efoVar);
        anfVar.f.f(efoVar);
        anfVar.m.f(efoVar);
        anfVar.n.f(efoVar);
        anfVar.l.f(efoVar);
        anfVar.p.f(anl.a(efoVar.g(4)));
        anfVar.q.f(anl.a(efoVar.g(2)));
        anfVar.r.f(anl.a(efoVar.g(1)));
        anfVar.s.f(anl.a(efoVar.g(7)));
        anfVar.t.f(anl.a(efoVar.g(64)));
        ecy j = efoVar.j();
        if (j != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                waterfallInsets = j.a.getWaterfallInsets();
                eaqVar = eaq.e(waterfallInsets);
            } else {
                eaqVar = eaq.a;
            }
            anfVar.o.f(anl.a(eaqVar));
        }
        ces.a.g();
    }

    public final void a(efo efoVar) {
        this.v.f(anl.a(efoVar.f(8)));
    }

    public final void b(efo efoVar) {
        this.u.f(anl.a(efoVar.f(8)));
    }
}
