package com.google.android.apps.messaging.ui.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import defpackage.jat;
import defpackage.msk;
import defpackage.qya;
import defpackage.ush;
import defpackage.wfh;
import defpackage.xca;
import defpackage.xyl;
import defpackage.yce;
import defpackage.zqi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ContactListItemView extends zqi implements View.OnClickListener {
    public jat a;
    private ContactIconView b;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static class ContactItemViewRow extends ContactListItemView {
        public ContactItemViewRow(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.apps.messaging.ui.contact.ContactListItemView
        protected final boolean a() {
            return true;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static class ContactItemViewTop extends ContactListItemView {
        public ContactItemViewTop(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.apps.messaging.ui.contact.ContactListItemView
        protected final boolean a() {
            return false;
        }
    }

    public ContactListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected abstract boolean a();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        if (view == this) {
            z = true;
        } else {
            z = false;
        }
        xyl.k(z);
        xyl.k(false);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [armf, java.lang.Object] */
    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        jat jatVar = this.a;
        ((Context) jatVar.d.b()).getClass();
        ((ush) jatVar.b.b()).getClass();
        ((xca) jatVar.f.b()).getClass();
        ((yce) jatVar.g.b()).getClass();
        ((wfh) jatVar.a.b()).getClass();
        ((qya) jatVar.c.b()).getClass();
        ((msk) jatVar.e.b()).getClass();
        this.b = (ContactIconView) findViewById(R.id.contact_icon);
        this.b.h(a());
    }
}
