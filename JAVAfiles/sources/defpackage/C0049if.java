package defpackage;

import android.content.Context;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* compiled from: PG */
/* renamed from: if, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049if implements AdapterView.OnItemClickListener, iv {
    Context a;
    public LayoutInflater b;
    ij c;
    public ExpandedMenuView d;
    public iu e;
    public ie f;

    public C0049if(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    public final ListAdapter a() {
        if (this.f == null) {
            this.f = new ie(this);
        }
        return this.f;
    }

    @Override // defpackage.iv
    public final void b(Context context, ij ijVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = ijVar;
        ie ieVar = this.f;
        if (ieVar != null) {
            ieVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.iv
    public final void c(ij ijVar, boolean z) {
        iu iuVar = this.e;
        if (iuVar != null) {
            iuVar.a(ijVar, z);
        }
    }

    @Override // defpackage.iv
    public final void d(iu iuVar) {
        throw null;
    }

    @Override // defpackage.iv
    public final boolean e() {
        return false;
    }

    @Override // defpackage.iv
    public final boolean f(jc jcVar) {
        if (!jcVar.hasVisibleItems()) {
            return false;
        }
        ik ikVar = new ik(jcVar);
        ij ijVar = ikVar.a;
        eu euVar = new eu(ijVar.a);
        ikVar.c = new C0049if(euVar.getContext());
        C0049if c0049if = ikVar.c;
        c0049if.e = ikVar;
        ikVar.a.g(c0049if);
        ListAdapter a = ikVar.c.a();
        er erVar = euVar.a;
        erVar.r = a;
        erVar.s = ikVar;
        View view = ijVar.g;
        if (view != null) {
            erVar.e = view;
        } else {
            euVar.b(ijVar.f);
            euVar.setTitle(ijVar.e);
        }
        euVar.a.p = ikVar;
        ikVar.b = euVar.create();
        ikVar.b.setOnDismissListener(ikVar);
        WindowManager.LayoutParams attributes = ikVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        ikVar.b.show();
        iu iuVar = this.e;
        if (iuVar != null) {
            iuVar.b(jcVar);
            return true;
        }
        return true;
    }

    @Override // defpackage.iv
    public final boolean g(im imVar) {
        return false;
    }

    @Override // defpackage.iv
    public final boolean h(im imVar) {
        return false;
    }

    @Override // defpackage.iv
    public final void i() {
        ie ieVar = this.f;
        if (ieVar != null) {
            ieVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.A(this.f.getItem(i), this, 0);
    }
}
