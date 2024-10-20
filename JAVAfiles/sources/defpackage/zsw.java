package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.apxm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zsw extends ztt implements akkh, apxq, akkf, aklk, akrw {
    private ztc a;
    private boolean ag;
    private Context d;
    private final eno e = new eno(this);

    @Deprecated
    public zsw() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return ztc.class;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            ztc E = E();
            if (bundle != null) {
                E.i = ruy.b(bundle.getString("conversationIdKey"));
                E.k = bundle.getInt("topPaddingKey");
            }
            if (E.h != zsx.CONVERSATION_DETAILS) {
                viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: zsz
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        alwo alwoVar = ztc.a;
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        layoutParams.height = view.getResources().getDisplayMetrics().heightPixels;
                        view.setLayoutParams(layoutParams);
                    }
                });
            }
            E.j = new FrameLayout(E.e.x());
            E.e(E.k);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 48;
            E.j.setLayoutParams(layoutParams);
            E.j.setClipChildren(false);
            E.j.setClipToPadding(false);
            if (E.b().b) {
                E.j.setOnApplyWindowInsetsListener(new iwv(E, 6));
            }
            E.j.addOnLayoutChangeListener(new fyc(E, 12));
            for (Map.Entry entry : E.c.entrySet()) {
                E.a((zsq) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
            Iterator it = E.b.keySet().iterator();
            while (it.hasNext()) {
                ((zsq) it.next()).g();
            }
            ViewGroup viewGroup2 = E.j;
            akqj.p();
            return viewGroup2;
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

    @Override // defpackage.ztt, defpackage.aiuc, defpackage.cg
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
    public final ztc E() {
        ztc ztcVar = this.a;
        if (ztcVar != null) {
            if (!this.ag) {
                return ztcVar;
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
    public final void aa() {
        aksa b = this.c.b();
        try {
            aQ();
            ztc E = E();
            E.o.a = null;
            Iterator it = E.b.keySet().iterator();
            while (it.hasNext()) {
                ((zsq) it.next()).d();
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final void ak(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        albo.U(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.ak(bundle);
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

    @Override // defpackage.ztt
    protected final /* synthetic */ apxh d() {
        return new aklt(this);
    }

    @Override // defpackage.ztt, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.a == null) {
                    try {
                        Object aS = aS();
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof zsw) {
                            zsw zswVar = (zsw) cgVar;
                            alor m = alor.m(zsx.CONVERSATION, (alog) ((kqm) aS).au.b(), zsx.CONVERSATION_DETAILS, (alog) ((kqm) aS).av.b());
                            xjo xjoVar = (xjo) ((kqm) aS).bh.l.b();
                            alor m2 = alor.m(zsx.CONVERSATION, new zss(true, true), zsx.CONVERSATION_DETAILS, new zss(false, false));
                            apya apyaVar = ((kqm) aS).a.bB;
                            Bundle a = ((kqm) aS).a();
                            aozs aozsVar = (aozs) ((kqm) aS).a.a.dt.b();
                            d.t(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                            zsy zsyVar = (zsy) aowt.f(a, "TIKTOK_FRAGMENT_ARGUMENT", zsy.a, aozsVar);
                            zsyVar.getClass();
                            ztc ztcVar = new ztc(zswVar, m, xjoVar, m2, apyaVar, zsyVar);
                            this.a = ztcVar;
                            ztcVar.q = this;
                            this.Z.c(new akli(this.c, this.e));
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, ztc.class));
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void g(Bundle bundle) {
        boolean z;
        this.c.k();
        try {
            aP(bundle);
            ztc E = E();
            E.o.a = E;
            alog alogVar = (alog) E.f.get(E.h);
            alogVar.getClass();
            int size = alogVar.size();
            for (int i = 0; i < size; i++) {
                zsk zskVar = (zsk) alogVar.get(i);
                zsq a = zskVar.a.a(E, E.i, E.h);
                String str = a.a().a;
                if (bundle == null && !E.d.containsKey(str)) {
                    E.d.put(str, Boolean.valueOf(a.a().b));
                } else if (bundle != null && bundle.containsKey(str)) {
                    E.d.put(str, Boolean.valueOf(bundle.getBoolean(str)));
                }
                if (bundle != null) {
                    z = bundle.getBoolean(str, a.a().b);
                } else {
                    z = a.a().b;
                }
                if (z) {
                    a.f();
                    HashMap hashMap = E.b;
                    zsn zsnVar = zskVar.b;
                    zso zsoVar = new zso();
                    zsoVar.c = 1;
                    zsoVar.d = zsnVar;
                    zsoVar.b(false);
                    hashMap.put(a, zsoVar.a());
                }
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

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void j(Bundle bundle) {
        this.c.k();
        try {
            bc(bundle);
            ztc E = E();
            bundle.putString("conversationIdKey", E.i.a());
            bundle.putInt("topPaddingKey", E.k);
            for (Map.Entry entry : E.d.entrySet()) {
                bundle.putBoolean((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
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

    @Override // defpackage.ztt, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
