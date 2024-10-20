package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aged {
    static final /* synthetic */ artm[] a;
    public static final alvi b;
    public final agdq c;
    public agdu d;
    public agem e;
    public final ahcn g;
    public final adwo h;
    public final adec i;
    private final da j;
    private final agak k;
    private boolean l;
    public final View.OnLayoutChangeListener f = new fyc(this, 18);
    private final arsn m = new agec(0, this);

    static {
        arrr arrrVar = new arrr(aged.class, "visibleHeight", "getVisibleHeight()I", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar};
        b = alvi.m("com/google/android/libraries/compose/ui/rendering/renderer/Renderer");
    }

    public aged(Context context, adwo adwoVar, da daVar, agdq agdqVar, agak agakVar) {
        this.h = adwoVar;
        this.j = daVar;
        this.c = agdqVar;
        this.k = agakVar;
        this.i = new adec(agdqVar, new afya((Object) this, 2, (char[]) null), new afya((Object) this, 3, (short[]) null), agdl.e);
        this.g = new ahcn(new zay((Object) context, 12, (byte[][]) null), new afyq(context, 17));
    }

    public static /* synthetic */ void l(aged agedVar, int i) {
        agedVar.i(i, false);
    }

    public static /* synthetic */ void m(aged agedVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = agedVar.k.b();
        }
        agedVar.k(i, arrn.r(agedVar.c.a() - i, 0));
    }

    public final int a() {
        return arrn.r(this.k.a(), ((Number) this.g.c()).intValue());
    }

    public final int b() {
        return ((Number) this.m.c(a[0])).intValue();
    }

    public final agee c() {
        cg d = this.j.d(this.c.c.getId());
        if (d instanceof agee) {
            return (agee) d;
        }
        return null;
    }

    public final agem d(agek agekVar) {
        agekVar.getClass();
        agee c = c();
        if (c != null) {
            return (agem) c.G().e(agekVar.name());
        }
        return null;
    }

    public void e() {
        j(0);
        f();
    }

    public final void f() {
        agee c = c();
        if (c != null) {
            afzv.r(this.c, this.j, true, new afyq(c, 15));
        }
        if (this.c.h) {
            this.i.g();
        }
    }

    public final void g(agem agemVar) {
        this.e = null;
        agee c = c();
        if (c != null) {
            agdq agdqVar = this.c;
            da G = c.G();
            G.getClass();
            afzv.r(agdqVar, G, true, new afyq(agemVar, 18));
        }
    }

    public final void h() {
        if (!this.j.ab()) {
            agee c = c();
            int id = this.c.c.getId();
            if (c != null && c.aw()) {
                if (c.aA()) {
                    afzv.r(this.c, this.j, false, new iim(id, 15));
                    return;
                } else {
                    if (!c.aB()) {
                        afzv.r(this.c, this.j, false, new afyq(c, 16));
                        return;
                    }
                    return;
                }
            }
            if (!this.l) {
                afzv.r(this.c, this.j, false, new iim(id, 14));
                this.l = true;
            }
        }
    }

    public void i(int i, boolean z) {
        j(i);
        agee c = c();
        if (c != null) {
            RendererContainer rendererContainer = c.c;
            if (rendererContainer != null) {
                rendererContainer.b(i, z);
            } else {
                c.b = Integer.valueOf(i);
            }
        }
    }

    public final void j(int i) {
        this.m.d(a[0], Integer.valueOf(i));
    }

    public void k(int i, int i2) {
        h();
        i(i2, false);
    }
}
