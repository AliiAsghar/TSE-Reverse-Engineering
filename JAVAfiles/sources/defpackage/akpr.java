package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akpr {
    public akry a;
    public boolean b;
    public akry c;
    public boolean d;
    public aksa e;
    private final cj f;
    private final Context g;
    private akry h;
    private boolean i;
    private boolean j;
    private aksa k;
    private aksa l;

    public akpr(cj cjVar, Context context) {
        this.f = cjVar;
        this.g = context;
    }

    private final akrl B(akrl akrlVar) {
        akrl e = akrl.e(akrlVar, akrl.d(((aksw) aovp.m(this.g, aksw.class)).A()));
        e.getClass();
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final aksa C(String str, akrl akrlVar) {
        if (akqj.u()) {
            if (akrlVar == null) {
                akrlVar = akrk.a;
            }
            akrlVar.getClass();
            return aktp.f(str, B(akrlVar));
        }
        aksr i = aktp.i(this.g);
        i.getClass();
        if (akrlVar != null) {
            return ((akte) i.d).e(str, akrl.e((akrl) i.b.b(), akrlVar), i.a);
        }
        return i.b(str);
    }

    private final String D(String str) {
        return str + " " + this.g.getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void E(String str, String str2, Intent intent) {
        akrl akrlVar;
        this.c = akqj.c();
        long j = akto.a;
        boolean z = true;
        akry p = akto.p(intent, true);
        akrl akrlVar2 = akrt.a;
        akrj b = akrl.b();
        b.a(akrt.c, new akpp(0));
        akrl f = ((akrl) b).f();
        if (p != null) {
            akqj.g(p);
            this.a = p;
            akrlVar2.getClass();
            akrlVar = B(akrlVar2);
        } else {
            akry akryVar = this.a;
            if (akryVar != null) {
                akqj.g(akryVar);
                akrlVar2.getClass();
                akrlVar = B(akrlVar2);
            } else {
                this.j = akqj.v();
                akry c = akqj.c();
                if (!(c instanceof akvr) || !((akvr) c).a()) {
                    z = false;
                }
                if (akqj.u() && !z) {
                    akrlVar2.getClass();
                    akrlVar2 = B(akrlVar2);
                } else {
                    akry f2 = akqj.f();
                    if (f2 != null) {
                        this.k = f2;
                        akqj.g(f2);
                        this.l = aktp.f(D(str), akrl.e(f, akrt.a(akrs.INTENT_TO_ACTIVITY)));
                    } else {
                        this.k = aktp.i(this.g).c(D(str), akrl.e(akrlVar2, akrt.a(akrs.INTENT_TO_ACTIVITY)));
                    }
                }
                this.a = akqj.c();
                akrlVar = akrlVar2;
            }
        }
        this.e = aktp.f(D(str2), akrl.e(akrlVar, akrt.a(akrs.ACTIVITY_CREATE)));
        aiut.e(new akhg(this, 17));
    }

    private final void F() {
        if (this.i) {
            this.a = null;
            this.i = false;
        }
    }

    private final void G() {
        akry akryVar = this.h;
        if (akryVar != null) {
            this.a = akryVar;
            this.h = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aksa, akry] */
    private final void H() {
        ?? r1;
        if (!this.b) {
            synchronized (akto.c) {
                r1 = akto.d;
                akto.d = null;
            }
            if (r1 != 0) {
                this.b = true;
                this.a = r1;
            }
        }
    }

    private final void I() {
        aksa aksaVar = this.e;
        if (aksaVar == null) {
            return;
        }
        Objects.toString(aksaVar);
        throw new IllegalStateException("Expected lifecycleStepSpan to be null but was: ".concat(aksaVar.toString()));
    }

    public final aksa a() {
        akrl akrlVar = akpw.a;
        aksa C = C("finish", akpw.a);
        akry c = akqj.c();
        this.h = c;
        c.getClass();
        synchronized (akto.c) {
            akto.d = c;
        }
        return new akpo(C, new akpq((aksa) c, 5), 1, null);
    }

    public final aksa b() {
        I();
        return new akpo(C("Back pressed", null), akqj.k(), 2, null);
    }

    public final aksa c() {
        G();
        o("onDestroy", akrt.a(akrs.ACTIVITY_DESTROY));
        return new akpq(this, 0);
    }

    public final aksa d(Intent intent) {
        intent.getClass();
        E("Reintenting into", "onNewIntent", intent);
        return new akpq(this, 2);
    }

    public final aksa e() {
        G();
        o("onPause", akrt.a(akrs.ACTIVITY_PAUSE));
        return new akpq(this, 1);
    }

    public final aksa f() {
        this.c = akqj.c();
        akqj.g(this.a);
        return new akpo(C("onPostResume", null), this, 3);
    }

    public final aksa g() {
        F();
        H();
        o("onResume", akrt.a(akrs.ACTIVITY_RESUME));
        return new akpq(this, 2);
    }

    public final aksa h() {
        F();
        H();
        o("onStart", akrt.a(akrs.ACTIVITY_START));
        return new akpq(this, 2);
    }

    public final aksa i() {
        G();
        o("onStop", akrt.a(akrs.ACTIVITY_STOP));
        return new akpq(this, 1);
    }

    public final aksa j() {
        I();
        return C("onSupportNavigateUp", null);
    }

    public final aksa k() {
        I();
        return C("onUserInteraction", null);
    }

    public final void l() {
        this.f.a().af(new aksp(aktp.i(this.g)));
    }

    public final void m(enf enfVar) {
        int ordinal = enfVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4 && ordinal != 5) {
                Objects.toString(enfVar);
                throw new UnsupportedOperationException("Unknown lifecycle: ".concat(enfVar.toString()));
            }
            p();
            return;
        }
        if (this.d) {
            p();
            this.d = false;
        }
    }

    public final void n() {
        this.i = true;
        if (!this.f.isChangingConfigurations() && !this.f.isFinishing()) {
            this.a = null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    public final void o(String str, akrl akrlVar) {
        this.c = akqj.c();
        akrl e = akrl.e(akrt.a, akrlVar);
        akry akryVar = this.a;
        if (akryVar != null) {
            akqj.g(akryVar);
            e.getClass();
            e = B(e);
        } else {
            this.j = akqj.v();
            if (!akqj.u()) {
                Context context = this.g;
                Class<?> cls = context.getClass();
                aksr i = aktp.i(context);
                this.k = ((akte) i.d).e(cls.getSimpleName() + ": " + str, akrl.e((akrl) i.b.b(), e), i.a);
            } else {
                e.getClass();
                e = B(e);
            }
            this.a = akqj.c();
        }
        this.e = aktp.f(D(str), e);
    }

    public final void p() {
        aksa aksaVar = this.e;
        if (aksaVar != null) {
            aksaVar.close();
            this.e = null;
            if (this.j) {
                this.j = false;
                akqj.p();
            }
            aksa aksaVar2 = this.l;
            if (aksaVar2 != null) {
                aksaVar2.close();
            }
            this.l = null;
            aksa aksaVar3 = this.k;
            if (aksaVar3 != null) {
                aksaVar3.close();
            }
            this.k = null;
            akqj.g(this.c);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final aksa q() {
        I();
        F();
        H();
        if (this.a == null) {
            return C("onActivityResult", null);
        }
        akry c = akqj.c();
        akqj.g(this.a);
        return new akpo(C("onActivityResult", null), c, 0);
    }

    public final aksa r() {
        return C("onConfigurationChanged", null);
    }

    public final aksa s() {
        H();
        Intent intent = this.f.getIntent();
        intent.getClass();
        E("Intenting into", "onCreate", intent);
        return new akpq(this, 2);
    }

    public final aksa t() {
        aksa j = akqj.j();
        if (akqj.u()) {
            return j;
        }
        Context context = this.g;
        return new akpq((Object) aktp.i(context).a(context.getClass(), "onCreatePanelMenu"), 3);
    }

    public final aksa u() {
        I();
        return C("onMenuItemSelected", null);
    }

    public final aksa v() {
        I();
        return C("onOptionsItemSelected", null);
    }

    public final aksa w() {
        I();
        return C("onPictureInPictureModeChanged", null);
    }

    public final aksa x() {
        F();
        akrl akrlVar = akrk.a;
        akrlVar.getClass();
        o("onPostCreate", akrlVar);
        return new akpq(this, 2);
    }

    public final aksa y() {
        return C("onRequestPermissionsResult", null);
    }

    public final aksa z() {
        akrl akrlVar = akrk.a;
        akrlVar.getClass();
        o("onSaveInstanceState", akrlVar);
        return new akpq(this, 1);
    }
}
