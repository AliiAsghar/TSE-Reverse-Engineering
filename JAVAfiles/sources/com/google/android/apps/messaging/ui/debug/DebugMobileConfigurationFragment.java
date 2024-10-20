package com.google.android.apps.messaging.ui.debug;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.aafl;
import defpackage.aajs;
import defpackage.aami;
import defpackage.ahnz;
import defpackage.aiut;
import defpackage.akec;
import defpackage.akkf;
import defpackage.akkh;
import defpackage.akli;
import defpackage.aklk;
import defpackage.aklm;
import defpackage.aklt;
import defpackage.akqj;
import defpackage.akrw;
import defpackage.aksa;
import defpackage.akto;
import defpackage.aktr;
import defpackage.apxh;
import defpackage.apxm;
import defpackage.apxq;
import defpackage.apxx;
import defpackage.arsb;
import defpackage.arwe;
import defpackage.cg;
import defpackage.d;
import defpackage.enh;
import defpackage.eno;
import defpackage.hht;
import defpackage.kqm;
import defpackage.krv;
import defpackage.ks;
import defpackage.wwn;
import defpackage.wwz;
import defpackage.wxb;
import defpackage.zoz;
import j$.util.concurrent.ConcurrentMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DebugMobileConfigurationFragment extends aami implements akkh, apxq, akkf, aklk, akrw {
    private aajs a;
    private boolean ag;
    private Context d;
    private final eno e = new eno(this);

    @Deprecated
    public DebugMobileConfigurationFragment() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return aajs.class;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            E();
            layoutInflater.getClass();
            View inflate = layoutInflater.inflate(R.layout.debug_mobile_configuration_fragment, viewGroup, false);
            inflate.getClass();
            akqj.p();
            return inflate;
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg, defpackage.enm
    public final enh N() {
        return this.e;
    }

    @Override // defpackage.aami, defpackage.aiuc, defpackage.cg
    public final void Y(Activity activity) {
        this.c.k();
        try {
            super.Y(activity);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.akkh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aajs E() {
        aajs aajsVar = this.a;
        if (aajsVar != null) {
            if (!this.ag) {
                return aajsVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.cg
    public final void aG(Intent intent) {
        if (akec.y(intent, x().getApplicationContext())) {
            akto.m(intent);
        }
        super.aG(intent);
    }

    @Override // defpackage.akkf
    @Deprecated
    public final Context aU() {
        if (this.d == null) {
            this.d = new aklm(this, super.x());
        }
        return this.d;
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final aktr aW() {
        return this.c.a;
    }

    @Override // defpackage.aklk
    public final Locale aX() {
        return akec.q(this);
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final void aY(aktr aktrVar, boolean z) {
        this.c.e(aktrVar, z);
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final void aZ(aktr aktrVar) {
        this.c.b = aktrVar;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void ag(View view, Bundle bundle) {
        this.c.k();
        try {
            bf(view, bundle);
            final aajs E = E();
            view.getClass();
            View findViewById = E.a.L().findViewById(R.id.force_sync_button);
            findViewById.getClass();
            ((Button) findViewById).setOnClickListener(new aafl(E, 9));
            ahnz.u(E.b(), new ScrollingMovementMethod());
            wwz a = ((wwn) E.c.b()).a();
            E.e = ((wwn) E.c.b()).p();
            if (E.e.isEmpty()) {
                E.b().setText("No SIMs found");
            } else {
                final arsb arsbVar = new arsb();
                arsbVar.a = new LinkedHashMap();
                for (wxb wxbVar : E.e) {
                    String str = wxbVar.c;
                    str.getClass();
                    if (str.length() != 0) {
                        RadioGroup a2 = E.a();
                        String str2 = "Call ";
                        wxbVar.getClass();
                        String str3 = wxbVar.c;
                        str3.getClass();
                        String str4 = wxbVar.r;
                        String substring = str3.substring(str3.length() - 3);
                        substring.getClass();
                        String str5 = str4 + " " + substring + " sim:";
                        if (true != str3.equals(a.c)) {
                            str2 = "";
                        }
                        if (str3.equals(a.d)) {
                            str2 = str2.concat("Sms ");
                        }
                        if (str3.equals(a.e)) {
                            str2 = str2.concat("Data ");
                        }
                        if (str2.length() > 0) {
                            str5 = a.co(str2, str5, "Default ");
                        }
                        int i = wxbVar.d;
                        ks ksVar = new ks(a2.getContext());
                        ksVar.setText(str5);
                        ksVar.setId(i);
                        ksVar.setHeight(48);
                        a2.addView(ksVar);
                        Map map = (Map) arsbVar.a;
                        Integer valueOf = Integer.valueOf(wxbVar.d);
                        String str6 = wxbVar.c;
                        str6.getClass();
                        map.put(valueOf, str6);
                        String str7 = wxbVar.c;
                        str7.getClass();
                        E.c(str7);
                    }
                }
                E.a().setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: aajr
                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                    public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                        arsb arsbVar2 = arsbVar;
                        Map map2 = (Map) arsbVar2.a;
                        Integer valueOf2 = Integer.valueOf(i2);
                        Object obj = map2.get(valueOf2);
                        obj.getClass();
                        aajs aajsVar = aajs.this;
                        aajsVar.c((String) obj);
                        TextView b = aajsVar.b();
                        Object obj2 = ((Map) arsbVar2.a).get(valueOf2);
                        obj2.getClass();
                        b.setText((CharSequence) ConcurrentMap.EL.getOrDefault(aajsVar.f, obj2, "Press the Refresh button to get flag values from storage"));
                    }
                });
                View findViewById2 = E.a.L().findViewById(R.id.refresh_amber_flags_button);
                findViewById2.getClass();
                ((Button) findViewById2).setOnClickListener(new zoz(arsbVar, E, 12));
            }
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final void ar(boolean z) {
        d.H(z);
    }

    @Override // defpackage.cg
    public final void au(Intent intent) {
        if (akec.y(intent, x().getApplicationContext())) {
            akto.m(intent);
        }
        aG(intent);
    }

    @Override // defpackage.aami
    protected final /* synthetic */ apxh d() {
        return new aklt(this);
    }

    @Override // defpackage.aami, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.a == null) {
                    try {
                        Object aS = aS();
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof DebugMobileConfigurationFragment) {
                            krv krvVar = ((kqm) aS).a;
                            this.a = new aajs((DebugMobileConfigurationFragment) cgVar, krvVar.yn, krvVar.fY, krvVar.fM, (arwe) krvVar.bQ.b());
                            this.Z.c(new akli(this.c, this.e));
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, aajs.class));
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                }
                akqj.p();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final LayoutInflater gl(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater aD = aD();
            LayoutInflater cloneInContext = aD.cloneInContext(new apxm.a(aD, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new aklm(this, cloneInContext));
            akqj.p();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuc, defpackage.cg
    public final void i() {
        aksa a = this.c.a();
        try {
            aV();
            this.ag = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aami, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
