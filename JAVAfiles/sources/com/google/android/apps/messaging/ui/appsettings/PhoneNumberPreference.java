package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import defpackage.aabt;
import defpackage.abul;
import defpackage.ahjj;
import defpackage.ahnz;
import defpackage.ajgi;
import defpackage.akec;
import defpackage.aksr;
import defpackage.albo;
import defpackage.armf;
import defpackage.ebz;
import defpackage.ecc;
import defpackage.gfx;
import defpackage.ise;
import defpackage.ivs;
import defpackage.kn;
import defpackage.msh;
import defpackage.msk;
import defpackage.mst;
import defpackage.wkb;
import defpackage.yjr;
import defpackage.yur;
import defpackage.zkf;
import defpackage.zno;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PhoneNumberPreference extends Preference {
    public boolean D;
    public abul E;
    public ahjj F;
    private final armf G;
    private final armf H;
    public final armf a;

    @Deprecated
    public zno b;
    public String c;
    public String d;
    public Optional e;
    public msh f;
    public String g;
    public boolean h;
    public boolean i;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public interface a {
        msk al();

        yjr gk();

        aksr hI();
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [msk, java.lang.Object] */
    public PhoneNumberPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = "";
        this.e = Optional.empty();
        this.c = "";
        this.g = context.getString(R.string.unknown_phone_number_pref_display_value);
        a aVar = (a) akec.w(context, a.class);
        aVar.getClass();
        this.G = new wkb(aVar, 16);
        wkb wkbVar = new wkb(aVar, 17);
        this.a = wkbVar;
        this.H = new wkb(aVar, 18);
        if (((Boolean) new mst(16).get()).booleanValue()) {
            this.f = wkbVar.b().n(this.g);
        }
    }

    private final boolean ad() {
        if (!this.i) {
            return true;
        }
        return false;
    }

    @Override // androidx.preference.Preference
    public final void a(gfx gfxVar) {
        super.a(gfxVar);
        TextView textView = (TextView) gfxVar.D(android.R.id.title);
        if (textView != null) {
            textView.setSingleLine(false);
        }
    }

    public final void ab(msh mshVar) {
        this.e = Optional.of(mshVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [msk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [msh, java.lang.Object] */
    public final void ac() {
        Object of;
        String u;
        if (!((Boolean) new mst(16).get()).booleanValue()) {
            if (this.h) {
                u = this.b.a;
            } else {
                u = u(k());
            }
            if (TextUtils.isEmpty(u)) {
                u = k();
            }
            String str = this.g;
            if (!TextUtils.isEmpty(u)) {
                if (this.i) {
                    u = ((yjr) this.G.b()).j(u);
                }
            } else {
                u = str;
            }
            n(ebz.a().c(u, ecc.a));
            return;
        }
        if (this.h) {
            of = this.E.b;
        } else {
            String u2 = u("");
            if (TextUtils.isEmpty(u2)) {
                of = this.e;
            } else {
                of = Optional.of(this.a.b().n(u2));
            }
        }
        Optional optional = (Optional) of;
        if (optional.isEmpty() || TextUtils.isEmpty(optional.get().m())) {
            of = this.e;
        }
        msh mshVar = this.f;
        Optional optional2 = (Optional) of;
        msh mshVar2 = mshVar;
        if (optional2.isPresent()) {
            mshVar2 = mshVar;
            if (!TextUtils.isEmpty(optional2.get().m())) {
                mshVar2 = optional2.get();
            }
        }
        String ag = albo.ag(mshVar2.m());
        if (this.i) {
            ag = mshVar2.F().toString();
        }
        n(ebz.a().c(ag, ecc.a));
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        kn knVar = new kn(this.j);
        knVar.setTextSize(0, this.j.getResources().getDimensionPixelSize(R.dimen.phone_number_preference_edit_text_size));
        CharSequence m = m();
        if (m != null && !this.g.contentEquals(m)) {
            knVar.setText(m);
        }
        knVar.setHint(this.g);
        knVar.setInputType(3);
        knVar.setTextAlignment(5);
        knVar.setPadding(0, knVar.getPaddingTop(), 0, knVar.getPaddingBottom());
        knVar.setTextColor(ahnz.d(knVar, R.attr.colorOnSurface));
        knVar.setSelectAllOnFocus(true);
        int dimensionPixelSize = this.j.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        knVar.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        ahnz.t(knVar);
        ajgi ajgiVar = new ajgi(this.j);
        ajgiVar.y(this.q);
        ajgiVar.o(android.R.string.cancel, new ivs(this, 12));
        ajgiVar.t(android.R.string.ok, new ise(this, knVar, 5, null));
        if (this.D) {
            ajgiVar.q(new aabt(this.H.b(), "PhoneNumberPreference::dialog::neutralButtonClicked", new ivs(this, 13), 8));
        }
        if (!TextUtils.isEmpty(this.c)) {
            ajgiVar.n(this.c);
        }
        ajgiVar.z(knVar);
        ajgiVar.create().show();
    }

    public final String k() {
        if (((Boolean) new mst(16).get()).booleanValue()) {
            return (String) this.e.map(new zkf(0)).orElse("");
        }
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [msk, java.lang.Object] */
    public final void l(msh mshVar) {
        msh mshVar2;
        Optional of;
        ?? b = this.a.b();
        if (ad()) {
            mshVar2 = (msh) this.e.orElse(this.f);
        } else {
            mshVar = b.k(mshVar);
            Optional optional = this.e;
            b.getClass();
            mshVar2 = (msh) optional.map(new yur(b, 15)).orElse(this.f);
        }
        if (mshVar.equals(mshVar2)) {
            of = Optional.empty();
        } else {
            of = Optional.of(mshVar);
        }
        if (this.h) {
            this.E.c(of);
        } else {
            String str = (String) of.map(new zkf(1)).orElse("");
            Q(str);
            Y(str);
        }
        ac();
    }

    @Deprecated
    public final void o(String str) {
        String str2;
        Object b = this.G.b();
        if (!ad()) {
            str = ((yjr) b).q(str);
        }
        if (!TextUtils.isEmpty(k())) {
            str2 = ((yjr) b).q(k());
        } else {
            str2 = this.g;
        }
        if (true == str.equals(str2)) {
            str = "";
        }
        if (this.h) {
            this.b.b(str);
        } else {
            Q(str);
            Y(str);
        }
        ac();
    }
}
