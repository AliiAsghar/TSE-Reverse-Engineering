package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aiua extends gfl {
    protected final aite am = new aite();

    @Override // defpackage.cg
    public View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        this.am.g(bundle);
        TypedArray obtainStyledAttributes = y().obtainStyledAttributes(null, gfy.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.ag = obtainStyledAttributes.getResourceId(0, this.ag);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(y());
        View inflate = cloneInContext.inflate(this.ag, viewGroup, false);
        View findViewById = inflate.findViewById(android.R.id.list_container);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            if (!y().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
                recyclerView = (RecyclerView) cloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
                y();
                recyclerView.aj(new LinearLayoutManager());
                recyclerView.af(new gfw(recyclerView));
            }
            if (recyclerView != null) {
                this.c = recyclerView;
                recyclerView.aJ(this.a);
                gfh gfhVar = this.a;
                if (drawable != null) {
                    gfhVar.b = drawable.getIntrinsicHeight();
                } else {
                    gfhVar.b = 0;
                }
                gfhVar.a = drawable;
                gfhVar.d.c.P();
                if (dimensionPixelSize != -1) {
                    gfh gfhVar2 = this.a;
                    gfhVar2.b = dimensionPixelSize;
                    gfhVar2.d.c.P();
                }
                this.a.c = z;
                if (this.c.getParent() == null) {
                    viewGroup2.addView(this.c);
                }
                this.ah.post(this.ai);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    @Override // defpackage.cg
    public void W(Bundle bundle) {
        this.am.a(bundle);
        super.W(bundle);
    }

    @Override // defpackage.cg
    public void X(int i, int i2, Intent intent) {
        super.X(i, i2, intent);
        this.am.K();
    }

    @Override // defpackage.cg
    public void Y(Activity activity) {
        this.am.j();
        super.Y(activity);
    }

    @Override // defpackage.cg
    public final void Z(Menu menu, MenuInflater menuInflater) {
        if (this.am.O()) {
            am(true);
        }
    }

    @Override // defpackage.cg
    public boolean aC(MenuItem menuItem) {
        return this.am.P();
    }

    @Override // defpackage.cg
    public final boolean aI() {
        if (this.am.M()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cg
    public final void aJ() {
        this.am.R();
    }

    @Override // defpackage.cg
    public void aa() {
        this.am.d();
        super.aa();
    }

    @Override // defpackage.cg
    public void ad() {
        this.am.f();
        super.ad();
    }

    @Override // defpackage.cg
    public final void ae(Menu menu) {
        if (this.am.Q()) {
            am(true);
        }
    }

    @Override // defpackage.cg
    public void af() {
        ahmc.al(G());
        this.am.A();
        super.af();
    }

    @Override // defpackage.cg
    public final void at(boolean z) {
        this.am.h(z);
        super.at(z);
    }

    @Override // defpackage.gfl, defpackage.cg
    public void g(Bundle bundle) {
        this.am.y(bundle);
        super.g(bundle);
    }

    @Override // defpackage.gfl, defpackage.cg
    public void h() {
        this.am.b();
        super.h();
    }

    @Override // defpackage.cg
    public void i() {
        this.am.c();
        super.i();
    }

    @Override // defpackage.cg
    public void j(Bundle bundle) {
        this.am.B(bundle);
        PreferenceScreen d = d();
        if (d != null) {
            Bundle bundle2 = new Bundle();
            d.y(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // defpackage.gfl, defpackage.cg
    public void k() {
        ahmc.al(G());
        this.am.C();
        super.k();
    }

    @Override // defpackage.gfl, defpackage.cg
    public void l() {
        this.am.D();
        super.l();
    }

    @Override // defpackage.cg, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.am.L();
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.cg, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.am.N();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // defpackage.cg, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.am.z();
        super.onLowMemory();
    }
}
