package com.google.android.apps.messaging.conversation.messagelist.tombstone;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.aack;
import defpackage.aacl;
import defpackage.ahnz;
import defpackage.albo;
import defpackage.apwt;
import defpackage.armf;
import defpackage.iry;
import defpackage.isg;
import defpackage.itb;
import defpackage.itz;
import defpackage.iyh;
import defpackage.jh;
import defpackage.lrf;
import defpackage.rry;
import defpackage.ujs;
import defpackage.ujx;
import defpackage.vid;
import defpackage.xwr;
import defpackage.xyl;
import defpackage.yzc;
import defpackage.znj;
import defpackage.zrd;
import defpackage.zxp;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationTombstoneView extends itz implements aacl<ConversationTombstoneView> {
    public rry a;
    public TextView b;
    public TextView c;
    public armf d;
    public apwt e;
    public armf f;
    public apwt g;
    public armf h;
    public armf i;
    public zxp j;
    public aack k;
    public iyh l;
    public vid m;
    public znj n;

    public ConversationTombstoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final void j() {
        if (this.a.f() == 210) {
            ((lrf) this.h.b()).g();
        }
    }

    @Override // defpackage.aacv
    public final void b() {
        j();
        f();
    }

    @Override // defpackage.aacl
    public final rry c() {
        return this.a;
    }

    @Override // defpackage.aacl
    public final void d(Object obj) {
        throw new UnsupportedOperationException("ConversationTombstoneView does not support bindPayload().");
    }

    @Override // defpackage.aacl
    public final void e(aack aackVar) {
        this.k = aackVar;
    }

    public final void f() {
        ((Optional) this.f.b()).ifPresent(new iry(this, 12));
        ((Optional) this.f.b()).ifPresent(new iry(this, 13));
    }

    @Override // defpackage.aacl
    public final void g(rry rryVar, boolean z, boolean z2) {
        String str;
        String Q;
        this.a = rryVar;
        xyl.g();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.tombstone_text_horizontal_padding);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.tombstone_text_vertical_padding);
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.min_touch_target_size);
        setPaddingRelative(0, 0, 0, getContext().getResources().getDimensionPixelSize(R.dimen.message_padding_default));
        setMinimumHeight(dimensionPixelOffset);
        this.b.setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        this.b.setTextColor(ahnz.f(getContext(), R.attr.colorOnSurfaceVariant, "ConversationTombstoneView"));
        f();
        if (this.a.f() == 210) {
            if (((Boolean) this.i.b()).booleanValue()) {
                Q = ujx.c(getContext(), ((itb) this.k).at);
            } else {
                Q = this.a.Q(getContext());
            }
            Spanned fromHtml = Html.fromHtml(albo.ag(Q));
            this.b.setText(fromHtml);
            this.b.setContentDescription(fromHtml.toString());
            setOnClickListener(new jh(this, 14, null));
        } else {
            setOnClickListener(null);
            Optional findAny = Collection.EL.stream((Set) this.g.b()).filter(new isg(this, 2)).findAny();
            if (findAny.isPresent()) {
                ((ujs) findAny.get()).b(this, this.b, this.a, ahnz.d(this, R.attr.colorOnSurfaceVariant));
                str = ((ujs) findAny.get()).a(this.a);
            } else {
                this.b.setText(this.a.Q(getContext()));
                str = "";
            }
            znj znjVar = this.n;
            TextView textView = this.c;
            if (textView != null) {
                rry rryVar2 = this.a;
                if (rryVar2.n) {
                    textView.setText(rryVar2.bb(znjVar));
                    this.c.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
            }
            if (this.b.getText() != null && TextUtils.isEmpty(str)) {
                str = this.b.getText().toString();
            }
            this.b.setContentDescription(xwr.d(getContext().getResources(), str + ", " + this.a.bc(this.n)));
        }
        setSelected(this.l.e(rryVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j = new zrd(this, 1);
        ((Optional) this.e.b()).ifPresent(new iry(this, 14));
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        j();
        f();
        ((Optional) this.e.b()).ifPresent(new iry(this, 15));
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = this.m.a();
        this.b = (TextView) findViewById(R.id.tombstone_message);
        this.c = (TextView) findViewById(R.id.tombstone_timestamp);
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        int q;
        super.setSelected(z);
        if (z) {
            q = yzc.s(getContext());
        } else {
            q = yzc.q(getContext());
        }
        Optional findAny = Collection.EL.stream((Set) this.g.b()).filter(new isg(this, 3)).findAny();
        if (findAny.isPresent() && ((ujs) findAny.get()).d(z)) {
            q = 0;
        }
        this.b.setBackgroundColor(q);
    }

    @Override // defpackage.aacv
    public final /* bridge */ /* synthetic */ View a() {
        return this;
    }
}
