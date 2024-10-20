package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.apxm;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyl extends iyv implements akkh, apxq, akkf, aklk, akrw {
    public final eno a = new eno(this);
    private boolean ag;
    private iyn d;
    private Context e;

    @Deprecated
    public iyl() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return iyn.class;
    }

    @Override // defpackage.cg, defpackage.enm
    public final enh N() {
        return this.a;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void X(int i, int i2, Intent intent) {
        Parcelable parcelable;
        String obj;
        aksa f = this.c.f();
        try {
            aO(i, i2, intent);
            iyn E = E();
            if (i == 1000) {
                if (i2 == -1) {
                    if (intent != null) {
                        parcelable = intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                    } else {
                        parcelable = null;
                    }
                    if (parcelable == null) {
                        obj = "";
                    } else {
                        obj = parcelable.toString();
                    }
                    rsd rsdVar = E.c;
                    rsdVar.d.a(rsdVar.a, null, obj, null, null).t();
                    xzb.j("Bugle", "user selected sound ".concat(String.valueOf(obj)));
                } else {
                    xzb.j("Bugle", "user canceled sound selection");
                }
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.iyv, defpackage.aiuc, defpackage.cg
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
    public final iyn E() {
        iyn iynVar = this.d;
        if (iynVar != null) {
            if (!this.ag) {
                return iynVar;
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
        if (this.e == null) {
            this.e = new aklm(this, super.x());
        }
        return this.e;
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

    @Override // defpackage.iyv
    protected final /* synthetic */ apxh d() {
        return new aklt(this);
    }

    @Override // defpackage.iyv, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            try {
                if (!this.ag) {
                    super.f(context);
                    if (this.d == null) {
                        try {
                            Object aS = aS();
                            apya apyaVar = ((kqm) aS).j;
                            krv krvVar = ((kqm) aS).a;
                            apya apyaVar2 = krvVar.mZ;
                            apya apyaVar3 = krvVar.yJ;
                            apya apyaVar4 = ((kqm) aS).k;
                            apya apyaVar5 = krvVar.ee;
                            apwt a = apxv.a(((kqm) aS).l);
                            apya apyaVar6 = ((kqm) aS).q;
                            krv krvVar2 = ((kqm) aS).a;
                            apya apyaVar7 = krvVar2.dn;
                            apxv.a(krvVar2.cu);
                            apwt a2 = apxv.a(((kqm) aS).a.a.gj);
                            apwt a3 = apxv.a(((kqm) aS).r);
                            apwt a4 = apxv.a(((kqm) aS).o);
                            apwt a5 = apxv.a(((kqm) aS).a.pq);
                            apya apyaVar8 = ((kqm) aS).n;
                            apwt a6 = apxv.a(((kqm) aS).a.at);
                            apwt a7 = apxv.a(((kqm) aS).a.z);
                            krv krvVar3 = ((kqm) aS).a;
                            try {
                                apya apyaVar9 = krvVar3.fm;
                                cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                                if (cgVar instanceof iyl) {
                                    iyl iylVar = (iyl) cgVar;
                                    apya apyaVar10 = krvVar3.uq;
                                    Bundle a8 = ((kqm) aS).a();
                                    aozs aozsVar = (aozs) ((kqm) aS).a.a.dt.b();
                                    d.t(a8.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                                    iym iymVar = (iym) aowt.f(a8, "TIKTOK_FRAGMENT_ARGUMENT", iym.a, aozsVar);
                                    iymVar.getClass();
                                    this.d = new iyn(apyaVar, apyaVar2, apyaVar3, apyaVar4, apyaVar5, a, apyaVar6, apyaVar7, a2, a3, a4, a5, apyaVar8, a6, a7, apyaVar9, iylVar, apyaVar10, iymVar);
                                    this.Z.c(new akli(this.c, this.a));
                                } else {
                                    throw new IllegalStateException(hht.e(cgVar, iyn.class));
                                }
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    akqj.p();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (ClassCastException e) {
                            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                        }
                    }
                    akqj.p();
                    return;
                }
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void g(Bundle bundle) {
        this.c.k();
        try {
            aP(bundle);
            iyn E = E();
            ibi ibiVar = (ibi) E.l.b();
            ConversationIdType conversationIdType = E.x;
            boolean z = E.z;
            boolean z2 = E.A;
            qpd qpdVar = E.B;
            rip ripVar = (rip) ibiVar.a.b();
            ripVar.getClass();
            conversationIdType.getClass();
            qpdVar.getClass();
            E.c = new rsd(ripVar, conversationIdType, z, z2);
            xzb.j("Bugle", "showing group options for conversation ".concat(String.valueOf(String.valueOf(E.x))));
            ((akbo) E.q.b()).b(E.D);
            ((akbo) E.q.b()).b(E.E);
            ((akbo) E.q.b()).b(E.H);
            ((akbo) E.q.b()).b(E.F);
            aohs aohsVar = (aohs) E.p.b();
            tby tbyVar = (tby) E.o.b();
            eno enoVar = E.w.a;
            ConversationIdType conversationIdType2 = E.x;
            snf e = sni.e();
            e.w("getNameDataSource");
            e.e(new ivk(15));
            e.h(new ivi(conversationIdType2, 10));
            aohsVar.C(((uac) tbyVar.o).d(e.b(), new ijv(tbyVar, 2), "NAME_KEY".concat(String.valueOf(String.valueOf(conversationIdType2))), enoVar), E.C);
            zgu zguVar = (zgu) E.w.fe();
            if (zguVar != null) {
                if (E.z) {
                    zguVar.setTitle(R.string.people_and_options_activity_title_group);
                }
                zguVar.j();
            }
            E.d = new iyq(E);
            E.e = new iyo(E, ((Boolean) iyr.b.e()).booleanValue());
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

    @Override // defpackage.iyv, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
