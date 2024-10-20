package com.google.android.apps.messaging.ui.attachment;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import defpackage.aabr;
import defpackage.armf;
import defpackage.egl;
import defpackage.gqg;
import defpackage.ish;
import defpackage.lrf;
import defpackage.msk;
import defpackage.mst;
import defpackage.msw;
import defpackage.orf;
import defpackage.qky;
import defpackage.rqz;
import defpackage.rrd;
import defpackage.rry;
import defpackage.rtl;
import defpackage.rtt;
import defpackage.rtu;
import defpackage.uai;
import defpackage.uga;
import defpackage.uli;
import defpackage.uuf;
import defpackage.wfh;
import defpackage.xun;
import defpackage.xux;
import defpackage.xvc;
import defpackage.xyl;
import defpackage.zow;
import defpackage.zoy;
import defpackage.zpc;
import defpackage.zpq;
import defpackage.zpr;
import defpackage.zpt;
import defpackage.zqq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class VCardAttachmentView extends zow implements View.OnLayoutChangeListener, rtt, xun {
    public qky a;
    public zpt b;
    public armf c;
    int d;
    public final rrd e;
    public final boolean f;
    public TextView g;
    public View h;
    public xux i;
    public boolean j;
    public boolean k;
    public gqg l;
    public wfh m;
    private final xux n;
    private final int o;
    private final int p;
    private final int q;
    private TextView r;
    private ContactIconView s;
    private ImageView t;
    private boolean u;
    private boolean v;
    private int w;
    private aabr x;

    public VCardAttachmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.n = new zpc(this);
        this.e = new rrd();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zoy.b);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        this.f = z;
        ColorStateList f = egl.f(context, R.color.message_image_selected_tint_selector);
        f.getClass();
        this.o = f.getDefaultColor();
        this.p = context.getColor(R.color.attachment_vcard_preview_name_text_m2);
        this.q = context.getColor(R.color.attachment_vcard_preview_details_text_m2);
        LayoutInflater from = LayoutInflater.from(getContext());
        if (true != z) {
            i = R.layout.vcard_attachment_view_m2;
        } else {
            i = R.layout.vcard_conversation_attachment_view_m2_consistent;
        }
        from.inflate(i, (ViewGroup) this, true);
        obtainStyledAttributes.recycle();
    }

    private final String m() {
        int measuredWidth = this.r.getMeasuredWidth();
        String m = ((rtu) this.e.a()).m();
        if (measuredWidth != 0 && !TextUtils.isEmpty(m) && m.contains(",")) {
            wfh wfhVar = this.m;
            TextPaint paint = this.r.getPaint();
            getContext().getString(R.string.plus_n);
            return wfhVar.B(m, paint, measuredWidth, R.plurals.plus_n_plural);
        }
        return wfh.y(m);
    }

    private final void n() {
        String m = m();
        if (TextUtils.isEmpty(m)) {
            this.r.setVisibility(8);
        } else {
            this.r.setVisibility(0);
            this.r.setText(m);
        }
    }

    @Override // defpackage.rtt
    public final void a(rtu rtuVar) {
        this.e.e(rtuVar);
        l();
    }

    @Override // defpackage.rtt
    public final void b(rtu rtuVar) {
        this.e.e(rtuVar);
        l();
    }

    @Override // defpackage.xun
    public final void c() {
        if (this.e.g()) {
            this.e.f();
        }
        this.s.i(null);
    }

    @Override // defpackage.xul
    public final void d(boolean z, rry rryVar, Drawable drawable, float[] fArr) {
        boolean au = rryVar.au();
        int f = rryVar.f();
        int c = rryVar.c();
        boolean z2 = true;
        if (this.u == au && this.v == z && this.w == f && this.d == c) {
            z2 = false;
        }
        this.u = au;
        this.v = z;
        setSelected(z);
        this.w = f;
        this.d = c;
        if (z2) {
            if (this.f) {
                if (isSelected()) {
                    k(zpt.f(getContext()));
                    i(zpt.g(getContext()));
                } else {
                    k(this.p);
                    i(this.q);
                }
            } else {
                boolean z3 = this.u;
                zpr zprVar = new zpr();
                zprVar.b(z3);
                zprVar.f(this.w);
                zprVar.d(false);
                zprVar.c(isSelected());
                zprVar.e(this.d);
                zpq q = this.b.q(getContext(), zprVar.a());
                k(q.a);
                i(q.a);
            }
            if (this.f) {
                if (isSelected()) {
                    this.s.setColorFilter(this.o);
                } else {
                    this.s.clearColorFilter();
                }
            }
        }
        boolean isSelected = isSelected();
        if (this.f) {
            GradientDrawable gradientDrawable = (GradientDrawable) ((ViewGroup) getParent()).getBackground().mutate();
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setColor(zpt.c(getContext(), isSelected));
            return;
        }
        ((ViewGroup) getParent()).setBackground(drawable);
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [armf, java.lang.Object] */
    @Override // defpackage.xun
    public final void g(MessagePartCoreData messagePartCoreData, boolean z, int i) {
        this.d = -1;
        gqg gqgVar = this.l;
        Context context = (Context) gqgVar.d.b();
        context.getClass();
        lrf lrfVar = (lrf) gqgVar.a.b();
        lrfVar.getClass();
        xvc xvcVar = (xvc) gqgVar.e.b();
        xvcVar.getClass();
        uga ugaVar = (uga) gqgVar.c.b();
        ugaVar.getClass();
        uli uliVar = (uli) gqgVar.b.b();
        uliVar.getClass();
        messagePartCoreData.getClass();
        h(new rtl(context, lrfVar, xvcVar, ugaVar, uliVar, messagePartCoreData));
    }

    public final void h(rtu rtuVar) {
        if (this.e.g()) {
            if (((rtu) this.e.a()).equals(rtuVar)) {
                return;
            } else {
                this.e.f();
            }
        }
        if (rtuVar != null) {
            this.e.c(rtuVar);
            ((rtu) this.e.a()).c = this;
            this.r.setContentDescription(m());
        }
        l();
    }

    public final void i(int i) {
        this.g.setTextColor(i);
    }

    public final void j(xux xuxVar) {
        this.i = xuxVar;
        if (xuxVar == null) {
            return;
        }
        setOnClickListener(new uai(this, 20));
        setOnLongClickListener(new ish(this, 3));
    }

    public final void k(int i) {
        this.r.setTextColor(i);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [msh, java.lang.Object] */
    protected final void l() {
        String str = null;
        if (this.e.g()) {
            n();
            String l = ((rtu) this.e.a()).l();
            if (!TextUtils.isEmpty(l) && (!this.f || !this.k)) {
                this.g.setVisibility(0);
                uuf uufVar = msw.a;
                boolean a = orf.a();
                String msfVar = ((msk) this.c.b()).i(((msk) this.c.b()).n(l), !a).G(a).toString();
                this.g.setText(wfh.y(msfVar));
                if (this.j) {
                    setContentDescription(msfVar);
                } else {
                    this.g.setContentDescription(msfVar);
                }
            } else {
                this.g.setVisibility(8);
            }
            ContactIconView contactIconView = this.s;
            Uri d = ((rtu) this.e.a()).d();
            long a2 = ((rtu) this.e.a()).a();
            String n = ((rtu) this.e.a()).n();
            long b = ((rtu) this.e.a()).b();
            if (((rtu) this.e.a()).j().isPresent()) {
                str = ((rtu) this.e.a()).j().get().o(((Boolean) new mst(5).get()).booleanValue());
            }
            contactIconView.l(d, a2, n, b, str);
            contactIconView.setClickable(false);
            ((rtu) this.e.a()).k().isPresent();
            return;
        }
        this.r.setText("");
        this.g.setText("");
        this.s.i(null);
        if (this.t != null) {
            xyl.g();
            this.t.setVisibility(4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rrd rrdVar = this.e;
        rqz rqzVar = rrdVar.a;
        if (rqzVar != null) {
            xyl.f(rrdVar.g());
            rrdVar.c(rqzVar);
            rrdVar.a = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.e.g()) {
            rrd rrdVar = this.e;
            xyl.i(rrdVar.a);
            xyl.k(rrdVar.g());
            rrdVar.a = rrdVar.a();
            rrdVar.f();
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.r = (TextView) findViewById(R.id.name);
        this.g = (TextView) findViewById(R.id.details);
        this.s = (ContactIconView) findViewById(R.id.contact_icon);
        this.h = findViewById(R.id.details_container);
        this.r.addOnLayoutChangeListener(this);
        ImageView imageView = (ImageView) findViewById(R.id.add_a_photo);
        this.t = imageView;
        if (imageView != null) {
            imageView.setVisibility(4);
            this.t.setOnClickListener(new zqq(this, 1));
            this.x = new aabr(this.t, null);
        }
        j(this.n);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.e.g() && view == this.r) {
            n();
        }
    }
}
