package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.ConfirmationConfiguration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adet implements adew {
    public static final acyz a = aczd.a(188291725);
    private static final acyz v = aczd.a(192639545);
    public adfa b;
    public final aijx c;
    protected final adov d;

    @Deprecated
    public final adjv e;
    public final adjq f;
    public Configuration g;
    public final adev h;
    public final String i;
    public final aduk k;
    public final advp l;
    public final adif m;
    public final aikc n;
    public final adfg o;
    public final adfb p;
    public final adwe q;
    public final adtg r;
    public final acqj s;
    private adig w;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public final List t = new CopyOnWriteArrayList();
    public final adfk u = new ader(this);

    public adet(adev adevVar, String str, Configuration configuration, acqj acqjVar, advp advpVar, Context context, aikc aikcVar, aijx aijxVar, adif adifVar, adov adovVar, adfg adfgVar, adtg adtgVar, adfb adfbVar, adwe adweVar, aneo aneoVar) {
        this.s = acqjVar;
        this.l = advpVar;
        this.i = str;
        this.h = adevVar;
        this.n = aikcVar;
        this.c = aijxVar;
        this.g = configuration;
        adju c = configuration.c();
        int i = configuration.mVersion;
        this.e = new adjv(c, i);
        this.f = new adjq(configuration, i);
        this.k = new aduk(advpVar, actw.a(context.getApplicationContext(), advpVar.a.concat(".ims_refreshable_manager")), aneoVar);
        this.o = adfgVar;
        this.m = adifVar;
        this.d = adovVar;
        this.r = adtgVar;
        this.p = adfbVar;
        this.q = adweVar;
        advr.l(advpVar, "IMS module has been created", new Object[0]);
        adevVar.onImsModuleInitialized();
    }

    private final void o() {
        Configuration configuration;
        adju adjuVar;
        adju adjuVar2;
        if (((Boolean) v.a()).booleanValue() && (configuration = this.g) != null && configuration.c() != null) {
            adju c = this.g.c();
            if (aczf.K()) {
                adjuVar = this.f.a.c();
            } else {
                adjuVar = this.e.a;
            }
            if (!c.equals(adjuVar)) {
                advr.r(this.l, "IMS configuration has been updated after Configuration is updated.", new Object[0]);
                Configuration configuration2 = this.g;
                if (aczf.K()) {
                    adjuVar2 = this.f.a.c();
                } else {
                    adjuVar2 = this.e.a;
                }
                configuration2.h(ImsConfiguration.a(adjuVar2));
            }
        }
    }

    @Override // defpackage.adew
    public final Configuration a() {
        o();
        return this.g;
    }

    @Override // defpackage.adew
    public final ConfirmationConfiguration b() {
        return this.g.mConfirmationConfiguration;
    }

    @Override // defpackage.adew
    public final ImsConfiguration c() {
        o();
        return this.g.mImsConfiguration;
    }

    @Override // defpackage.adew
    public final InstantMessageConfiguration d() {
        return this.g.mInstantMessageConfiguration;
    }

    @Override // defpackage.adew
    public final String e() {
        adju adjuVar;
        adfa adfaVar = this.b;
        if (adfaVar == null) {
            if (aczf.K()) {
                adjuVar = this.f.a.c();
            } else {
                adjuVar = this.e.a;
            }
            return adjuVar.l;
        }
        return adfaVar.d();
    }

    public final void f(adfk adfkVar) {
        this.t.add(adfkVar);
    }

    public final void g(acok acokVar) {
        this.h.onImsModuleStartFailed(acokVar);
    }

    public final void h(acok acokVar) {
        this.h.onImsModuleStopped(acokVar);
    }

    public final void i(acok acokVar) {
        if (!this.j.get()) {
            advr.r(this.l, "IMS module not started yet", new Object[0]);
            return;
        }
        adfa adfaVar = this.b;
        adfaVar.getClass();
        adfaVar.g(acokVar);
    }

    public final synchronized void j(int i) {
        if (this.c == null) {
            advr.h(this.l, "ImsServiceDispatcher is null, should be set before calling start", new Object[0]);
            return;
        }
        if (!this.j.get()) {
            if (this.g.n() && this.g.o()) {
                advr.r(this.l, "Reconfiguration required. Aborting IMS module start.", new Object[0]);
                g(acok.RECONFIGURATION_REQUIRED);
                return;
            }
            try {
                advr.d(this.l, "Start the IMS module", new Object[0]);
                advr.l(this.l, "Starting IMS dispatcher", new Object[0]);
                this.j.set(true);
                if (Objects.isNull(this.b)) {
                    advr.h(this.l, "ImsRegistrationController is null, should be set before calling start", new Object[0]);
                    this.j.set(false);
                    return;
                }
                this.b.i(i);
                if (this.w == null) {
                    ades adesVar = new ades(this);
                    this.w = adesVar;
                    this.m.b(adesVar);
                }
                advr.l(this.l, "IMS module started", new Object[0]);
                return;
            } catch (Exception e) {
                advr.j(e, this.l, "Error while starting IMS module: %s", e.getMessage());
                this.j.set(false);
                return;
            }
        }
        advr.r(this.l, "IMS module already started", new Object[0]);
    }

    @Override // defpackage.adew
    public final synchronized void k(acok acokVar) {
        if (!this.j.get()) {
            advr.r(this.l, "IMS module not started yet", new Object[0]);
            return;
        }
        advr.d(this.l, "Stop the IMS module due to %s", acokVar);
        this.j.set(false);
        adig adigVar = this.w;
        if (adigVar != null) {
            this.m.g(adigVar);
            this.w = null;
        }
        this.d.g(acokVar);
        adfa adfaVar = this.b;
        adfaVar.getClass();
        adfaVar.j(acokVar);
        advr.l(this.l, "IMS module stopped", new Object[0]);
        if (!((Boolean) a.a()).booleanValue()) {
            h(acokVar);
        }
    }

    public final void l(Configuration configuration) {
        advr.d(this.l, "Updating RCS configuration to %d", Integer.valueOf(configuration.mVersion));
        this.g = configuration;
        if (aczf.K()) {
            this.f.a(configuration, configuration.mVersion);
        } else {
            this.e.a(configuration.c(), configuration.mVersion);
        }
    }

    @Override // defpackage.adew
    public final boolean m() {
        adfa adfaVar = this.b;
        if (adfaVar == null) {
            return false;
        }
        return adfaVar.l();
    }

    public final boolean n() {
        return this.j.get();
    }
}
