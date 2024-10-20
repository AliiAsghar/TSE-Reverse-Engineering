package com.google.android.apps.messaging.ui.vcard;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;
import com.google.android.apps.messaging.ui.vcard.VCardDetailFragment;
import defpackage.abbu;
import defpackage.abbw;
import defpackage.abby;
import defpackage.abca;
import defpackage.alvg;
import defpackage.alvr;
import defpackage.alwp;
import defpackage.d;
import defpackage.fyc;
import defpackage.gqg;
import defpackage.ivf;
import defpackage.qky;
import defpackage.rrb;
import defpackage.rtl;
import defpackage.rtt;
import defpackage.rtu;
import defpackage.xux;
import defpackage.xyl;
import defpackage.xzb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VCardDetailFragment extends abbw implements rtt, xux {
    public final rrb a = new rrb();
    public abbu ag;
    public gqg ah;
    private abby ai;
    public ExpandableListView b;
    public Uri c;
    public Uri d;
    public qky e;

    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        xyl.l(this.c);
        View inflate = layoutInflater.inflate(R.layout.vcard_detail_fragment, viewGroup, false);
        int i = 15;
        inflate.setOnApplyWindowInsetsListener(new ivf(i));
        ExpandableListView expandableListView = (ExpandableListView) inflate.findViewById(R.id.list);
        this.b = expandableListView;
        expandableListView.addOnLayoutChangeListener(new fyc(this, i));
        this.b.setOnChildClickListener(new ExpandableListView.OnChildClickListener() { // from class: abbz
            @Override // android.widget.ExpandableListView.OnChildClickListener
            public final boolean onChildClick(ExpandableListView expandableListView2, View view, int i2, int i3, long j) {
                return VCardDetailFragment.this.p(view);
            }
        });
        rtl m = this.ah.m(this.c);
        m.c = this;
        this.a.c(m);
        return inflate;
    }

    @Override // defpackage.cg
    public final void Z(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.vcard_detail_fragment_menu_m2, menu);
        rrb rrbVar = this.a;
        MenuItem findItem = menu.findItem(R.id.action_add_contact);
        boolean z = false;
        if (rrbVar.g() && ((rtl) this.a.a()).q()) {
            z = true;
        }
        findItem.setVisible(z);
    }

    @Override // defpackage.rtt
    public final void a(rtu rtuVar) {
        this.a.d();
        this.ag.k(R.string.failed_loading_vcard);
        fe().finish();
    }

    @Override // defpackage.cg
    public final boolean aC(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_add_contact) {
            return false;
        }
        this.a.d();
        new abca(this, ((rtl) this.a.a()).o()).e(new Void[0]);
        return true;
    }

    @Override // defpackage.cg
    public final void aa() {
        super.aa();
        if (this.a.g()) {
            this.a.f();
        }
        this.b.setAdapter((ExpandableListAdapter) null);
    }

    @Override // defpackage.rtt
    public final void b(rtu rtuVar) {
        d.s(true);
        this.a.d();
        rtl rtlVar = (rtl) rtuVar;
        d.s(rtlVar.q());
        abby abbyVar = new abby(fe(), rtlVar.p(), this, this.b);
        this.ai = abbyVar;
        this.b.setAdapter(abbyVar);
        if (this.ai.getGroupCount() == 1) {
            this.b.expandGroup(0);
        }
        fe().invalidateOptionsMenu();
    }

    @Override // defpackage.xux
    public final void c(rtu rtuVar) {
        try {
            Intent c = rtuVar.c();
            if (c != null) {
                aG(c);
            }
        } catch (Exception e) {
            alvg alvgVar = (alvg) xzb.a.f();
            alvgVar.X(alwp.a, "Bugle");
            alvgVar.Y(alvr.a);
            ((alvg) ((alvg) alvgVar.g(e)).h("com/google/android/apps/messaging/shared/util/common/LogUtil", "v", 223, "LogUtil.java")).t("%s", "VCardDetailFragment: fail to start activity");
        }
    }

    @Override // defpackage.cg
    public final void g(Bundle bundle) {
        super.g(bundle);
        am(true);
    }

    public final /* synthetic */ boolean p(View view) {
        Intent c;
        if ((view instanceof VCardAttachmentView) && (c = ((rtu) ((VCardAttachmentView) view).e.a()).c()) != null) {
            try {
                aG(c);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        return false;
    }

    @Override // defpackage.xux
    public final void d() {
    }
}
