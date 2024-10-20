package defpackage;

import android.content.res.Configuration;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.ui.common.BugleSearchView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifBrowserActivity;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aats extends aatt implements oy {
    public final GifBrowserActivity a;
    public final anen b;
    public final armf c;
    public final alcn d;
    public final alcm e;
    public final armf f;
    public final abdc g;
    public aatu h;
    public aatv i;
    public RecyclerView j;
    public RecyclerView k;
    public ProgressBar l;
    public ev m;
    public ImageView n;
    public ImageView o;
    public BugleSearchView p;
    public String q;
    public boolean r;
    public String s;
    public final aajq u;
    private final anen w;
    private final xyt x;
    public int t = 1;
    private boolean y = true;

    public aats(GifBrowserActivity gifBrowserActivity, anen anenVar, anen anenVar2, armf armfVar, alcn alcnVar, alcm alcmVar, armf armfVar2, xyt xytVar, abdc abdcVar, aajq aajqVar) {
        this.a = gifBrowserActivity;
        this.b = anenVar;
        this.w = anenVar2;
        this.c = armfVar;
        this.d = alcnVar;
        this.e = alcmVar;
        this.f = armfVar2;
        this.x = xytVar;
        this.g = abdcVar;
        this.u = aajqVar;
    }

    public static int c(Configuration configuration) {
        if (configuration.orientation != 2) {
            return 2;
        }
        return 3;
    }

    private final boolean o(String str) {
        g(true);
        this.s = str;
        if (TextUtils.isEmpty(str) && ((Boolean) utw.d.e()).booleanValue()) {
            f();
            k(null);
            return false;
        }
        k(this.s);
        return true;
    }

    @Override // defpackage.oy
    public final boolean a(String str) {
        if (o(str)) {
            this.e.a(str);
        }
        this.g.i(this.a, this.p);
        return true;
    }

    @Override // defpackage.oy
    public final void b(String str) {
        BugleSearchView bugleSearchView;
        int i;
        if (o(str)) {
            this.e.b(str);
        }
        ImageView imageView = this.n;
        if (imageView != null && (bugleSearchView = this.p) != null) {
            if (true != TextUtils.isEmpty(bugleSearchView.getQuery().toString())) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
        if (this.t == 4 && !this.y) {
            return;
        }
        this.y = false;
        this.t = 4;
        ((mho) this.c.b()).aG(3, this.t, 1);
    }

    public final void d(String str) {
        g(true);
        if (this.p != null) {
            h(true);
        }
        if (TextUtils.isEmpty(str)) {
            f();
        } else {
            this.t = 3;
            this.s = str;
            j();
            this.e.a(str);
        }
        k(str);
    }

    public final void e(amqd amqdVar) {
        this.a.K(amqdVar);
        this.a.finish();
    }

    public final void f() {
        this.t = 2;
        albo.bR(this.b.submit(new ytr(this, 19)), qjc.a(new isn(this, 18)), this.w);
    }

    public final void g(boolean z) {
        int i;
        ProgressBar progressBar = this.l;
        if (true != z) {
            i = 8;
        } else {
            i = 0;
        }
        progressBar.setVisibility(i);
    }

    public final void h(boolean z) {
        aats aatsVar;
        BugleSearchView bugleSearchView = this.p;
        if (bugleSearchView == null) {
            return;
        }
        if (true == z) {
            aatsVar = null;
        } else {
            aatsVar = this;
        }
        bugleSearchView.setOnQueryTextListener(aatsVar);
        if (z) {
            bugleSearchView.setQuery(null, false);
        }
        bugleSearchView.setIconified(z);
    }

    public final void i() {
        d(this.i.c.b(1).b);
        ((mho) this.c.b()).aG(6, this.t, n());
    }

    public final void j() {
        if ((((Boolean) utw.d.e()).booleanValue() && this.t == 2) || ((Boolean) aatz.a.e()).booleanValue()) {
            return;
        }
        albo.bR(((yaq) this.x.a()).f(), qjc.a(new isn(this, 19)), this.w);
    }

    public final boolean k(String str) {
        int i;
        boolean z;
        aatv aatvVar = this.i;
        Integer num = (Integer) aatvVar.c.a.get(albo.ag(str).toLowerCase(Locale.US));
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        int i2 = aatvVar.d;
        if (i != i2) {
            if (i2 >= 0) {
                aatvVar.q(i2);
            }
            aatvVar.d = i;
            if (i >= 0) {
                aatvVar.q(i);
            }
        }
        if (aatvVar.d >= 0) {
            z = true;
        } else {
            z = false;
        }
        this.k.ae(this.i.d);
        return z;
    }

    public final int n() {
        aatv aatvVar = this.i;
        if (aatvVar != null && this.t == 3) {
            return aatvVar.m();
        }
        return 1;
    }
}
