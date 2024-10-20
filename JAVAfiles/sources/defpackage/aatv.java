package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatv extends no {
    public final aatx c;
    public int d;
    private final boolean e;
    private final aats f;
    private final aajt g;

    public aatv(aajt aajtVar, Context context, aats aatsVar) {
        boolean booleanValue = ((Boolean) utw.d.e()).booleanValue();
        this.e = booleanValue;
        this.d = -1;
        this.g = aajtVar;
        this.f = aatsVar;
        aatw aatwVar = null;
        if (booleanValue) {
            String string = context.getResources().getString(R.string.c2o_gif_browser_recents_button_text);
            ahnz.f(context, R.attr.colorOnSurfaceInverse, "GifBrowserCategoryAdapter");
            ahnz.f(context, R.attr.colorOnSurface, "GifBrowserCategoryAdapter");
            aatwVar = new aatw(string, null);
        }
        this.c = new aatx(context, aatwVar);
    }

    @Override // defpackage.no
    public final int b() {
        return this.c.a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [armf, java.lang.Object] */
    @Override // defpackage.no
    public final oo e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.compose2o_gif_browser_category_item_view_m2, viewGroup, false);
        zmr zmrVar = (zmr) this.g.a.b();
        zmrVar.getClass();
        inflate.getClass();
        return new agwe(zmrVar, inflate, this.f);
    }

    @Override // defpackage.no
    public final void g(oo ooVar, int i) {
        boolean z;
        aatx aatxVar = this.c;
        if (i >= aatxVar.a()) {
            return;
        }
        agwe agweVar = (agwe) ooVar;
        aatw b = aatxVar.b(i);
        ((TextView) agweVar.s).setText(b.a);
        agweVar.a.setOnClickListener(((zmr) agweVar.u).a(new zoz(agweVar, b, 14, null)));
        if (i == this.d) {
            z = true;
        } else {
            z = false;
        }
        ((TextView) agweVar.s).setSelected(z);
        agweVar.a.setSelected(z);
    }

    public final int m() {
        int i = this.d;
        if (i == -1) {
            return 1;
        }
        int i2 = i + 11;
        if (!this.e) {
            i2 = i + 12;
        }
        return alzz.u(i2);
    }
}
