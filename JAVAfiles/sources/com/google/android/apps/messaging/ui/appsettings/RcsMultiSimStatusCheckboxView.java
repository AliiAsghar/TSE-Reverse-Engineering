package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.ajgi;
import defpackage.akec;
import defpackage.akkh;
import defpackage.akkq;
import defpackage.aklg;
import defpackage.aklm;
import defpackage.aklq;
import defpackage.albo;
import defpackage.apxm;
import defpackage.apxq;
import defpackage.hht;
import defpackage.ivs;
import defpackage.iws;
import defpackage.zkh;
import defpackage.zki;
import defpackage.zkk;
import defpackage.znc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RcsMultiSimStatusCheckboxView extends znc implements akkh<zki> {
    public zki a;
    private Context f;

    @Deprecated
    public RcsMultiSimStatusCheckboxView(Context context) {
        super(context);
        g();
    }

    private final void g() {
        if (this.a == null) {
            try {
                zkk zkkVar = (zkk) aS();
                zkh zkhVar = new zkh(this, 0);
                aklq.c(zkhVar);
                try {
                    zki t = zkkVar.t();
                    this.a = t;
                    if (t == null) {
                        aklq.b(zkhVar);
                    }
                    this.a.d = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof apxq) && !(context instanceof apxm.a) && !(context instanceof aklm)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof aklg)) {
                        throw new IllegalStateException(hht.f(this));
                    }
                } catch (Throwable th) {
                    if (this.a == null) {
                        aklq.b(zkhVar);
                    }
                    throw th;
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    @Override // defpackage.akkh
    public final Class C() {
        return zki.class;
    }

    @Override // defpackage.akkh
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final zki E() {
        zki zkiVar = this.a;
        if (zkiVar != null) {
            return zkiVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.ajfq, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (akec.n(getContext())) {
            Context o = akec.o(this);
            Context context = this.f;
            if (context == null) {
                this.f = o;
                return;
            }
            boolean z = true;
            if (context != o && !akec.p(context)) {
                z = false;
            }
            albo.U(z, "onAttach called multiple times with different parent Contexts");
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        g();
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final boolean performClick() {
        String string;
        g();
        zki zkiVar = this.a;
        if (zkiVar.c.isChecked()) {
            ajgi ajgiVar = new ajgi(zkiVar.a);
            ajgiVar.y(zkiVar.a.getString(R.string.disable_rcs_warning_title_v2));
            if (zkiVar.b.length() == 0) {
                string = zkiVar.a.getString(R.string.disable_rcs_warning_text_sim_level);
            } else {
                string = zkiVar.a.getString(R.string.disable_rcs_warning_text_sim_level_phone_number, zkiVar.b);
            }
            ajgiVar.n(string);
            ajgiVar.u(zkiVar.a.getString(R.string.disable_rcs_warning_accept_text), new ivs(zkiVar, 14));
            ajgiVar.p(zkiVar.a.getString(android.R.string.cancel), new iws(8));
            ajgiVar.create().show();
        } else {
            zkiVar.c.f(1);
        }
        return true;
    }

    public RcsMultiSimStatusCheckboxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RcsMultiSimStatusCheckboxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RcsMultiSimStatusCheckboxView(akkq akkqVar) {
        super(akkqVar);
        g();
    }
}
