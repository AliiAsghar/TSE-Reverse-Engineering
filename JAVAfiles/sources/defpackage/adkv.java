package defpackage;

import android.os.Message;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adkv extends adll {
    public final /* synthetic */ adlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adkv(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    private final void q(int i) {
        this.a.aA();
        this.a.ab(apjx.CONFIGURED_STAGE);
        this.a.aD(i);
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "ConfiguredState";
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        adlw adlwVar = this.a;
        String t = adlwVar.t(adlwVar.s, adlwVar.n);
        super.b();
        if (((acxv) this.a.N.b()).a()) {
            ((aday) this.a.O.b()).j(this.a.n).edit().putInt("provisioning_engine_retry_count_key", 0).commit();
            ((aday) this.a.O.b()).q(this.a.n);
        } else {
            adnu.a();
            adlw adlwVar2 = this.a;
            adnu.e(adlwVar2.s, adlwVar2.n).edit().putInt("provisioning_engine_retry_count_key", 0).commit();
            adlw adlwVar3 = this.a;
            adnu.a();
            adnu.f(adlwVar3.s, adlwVar3.n);
        }
        adjl j = this.a.j();
        if (j.d()) {
            this.a.D.d("RCS disabled in ConfiguredState: ".concat(j.a()), new Object[0]);
            this.a.aD(47);
            n(this.a.ag, apkn.RCS_PROVISIONING_DISABLED_STATE);
            return;
        }
        if (((vrn) this.a.L.a()).e(this.a.n).equals(amwt.SUBJECT_TO_BATTERY_OPTIMIZATIONS)) {
            this.a.aB(9);
            n(this.a.af, apkn.RCS_PROVISIONING_ENABLED_STATE);
            return;
        }
        adlw adlwVar4 = this.a;
        adnt adntVar = adlwVar4.A;
        Configuration k = adlwVar4.k();
        adntVar.k(apjx.CONFIGURED_STAGE, adlwVar4.r, true, adlwVar4.n);
        if (k != null) {
            adlw adlwVar5 = this.a;
            final int h = adko.h(k);
            final int i = k.mVersion;
            final int i2 = k.mValiditySecs;
            adnt adntVar2 = adlwVar5.A;
            Optional p = adlwVar5.p();
            if (!adntVar2.i(adntVar2.e(p))) {
                adntVar2.r(new adns() { // from class: adnm
                    @Override // defpackage.adns
                    public final void a(aozy aozyVar) {
                        alor alorVar = adnt.a;
                        if (!aozyVar.b.isMutable()) {
                            aozyVar.u();
                        }
                        int i3 = h;
                        apjr apjrVar = (apjr) aozyVar.b;
                        apjr apjrVar2 = apjr.a;
                        int i4 = i;
                        apjrVar.p = i3 - 1;
                        apjrVar.b |= 4096;
                        if (!aozyVar.b.isMutable()) {
                            aozyVar.u();
                        }
                        long j2 = i4;
                        int i5 = i2;
                        apag apagVar = aozyVar.b;
                        apjr apjrVar3 = (apjr) apagVar;
                        apjrVar3.b |= 8192;
                        apjrVar3.q = j2;
                        if (!apagVar.isMutable()) {
                            aozyVar.u();
                        }
                        apjr apjrVar4 = (apjr) aozyVar.b;
                        apjrVar4.b |= 16384;
                        apjrVar4.r = i5;
                    }
                }, adntVar2.e(p));
            }
        }
        adlw adlwVar6 = this.a;
        adlwVar6.aE.k(adlwVar6.s, apkn.RCS_PROVISIONING_CONFIGURED_STATE, adko.h(k), k.mValiditySecs, adlwVar6.r, new adiw(adlwVar6.n));
        int i3 = 3;
        if (k.m()) {
            adlw adlwVar7 = this.a;
            adlwVar7.x.a(k, adlwVar7.n);
            this.a.aD(31);
            this.a.D.d("Successfully provisioned. Invoke success", new Object[0]);
            adlw adlwVar8 = this.a;
            adlwVar8.aE.l(adlwVar8.s, apkn.RCS_PROVISIONING_CONFIGURED_STATE, 9, adlwVar8.r, new adiw(adlwVar8.n));
            anjs anjsVar = new anjs((char[]) null, (byte[]) null);
            anjsVar.a = 30050;
            if (((Boolean) ((acza) acyu.a().b.b).a()).booleanValue()) {
                String str = k.mVerifiedSmsToken;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = k.mImsConfiguration.mPublicIdentity;
                    if (!TextUtils.isEmpty(str2)) {
                        anjsVar.b = str;
                        anjsVar.e = adwf.k(str2, this.a.C);
                        anjsVar.c = this.a.w.e();
                    }
                }
            }
            anjsVar.d = k.mChatbotConfiguration.chatbotDirectoryUrl;
            adlw adlwVar9 = this.a;
            adlwVar9.t.ifPresent(new adgr(anjsVar, 12));
            this.a.K.ifPresent(new adgr(this, 13));
            if (this.a.q().booleanValue()) {
                adlw adlwVar10 = this.a;
                wke.a(adlwVar10.s, 2, adlwVar10.o);
            }
            adom.b();
            adom.a(this.a.s, 4);
        } else {
            if (((acwk) this.a.Z.b()).a() && this.a.am() && !k.l() && k.mVersion == 0 && !adww.d(this.a.s)) {
                wko wkoVar = (wko) this.a.aa.b();
                String str3 = this.a.n;
                str3.getClass();
                ((alvg) wko.a.g().h("com/google/android/apps/messaging/shared/rcsprovisioning/tychogrpc/FiMultiSyncGrpcSchedulerImpl", "scheduleFiMultiSyncGrpc", 31, "FiMultiSyncGrpcSchedulerImpl.kt")).q("Scheduling FiMultiSyncGrpc work using PWQ.");
                Object b = wkoVar.b.b();
                b.getClass();
                qjh.l((arwe) b, null, new uog(wkoVar, str3, (arpe) null, 11), 3);
            }
            this.a.D.d("Provisioned with disabled config (version <= 0). Invoke failure", new Object[0]);
            adlw adlwVar11 = this.a;
            adlwVar11.aE.l(adlwVar11.s, apkn.RCS_PROVISIONING_CONFIGURED_STATE, 10, adlwVar11.r, new adiw(adlwVar11.n));
            this.a.I();
            if (this.a.q().booleanValue()) {
                adlw adlwVar12 = this.a;
                wke.a(adlwVar12.s, 6, adlwVar12.o);
            }
            adom.b();
            adom.a(this.a.s, 2);
        }
        if (t == null) {
            adlw adlwVar13 = this.a;
            Optional i4 = adlwVar13.z.i(adlwVar13.n);
            if (i4.isPresent()) {
                Configuration configuration = (Configuration) i4.get();
                if (configuration.mVersion == 0 && configuration.mValiditySecs == 0) {
                    this.a.D.d("trigger MSG_REFRESH_CONFIG by Configuration resetClient", new Object[0]);
                    this.a.U(adjj.MSG_REFRESH_CONFIG);
                }
            }
        }
        adlw adlwVar14 = this.a;
        if (true != k.m()) {
            i3 = 10;
        }
        adlwVar14.aB(i3);
        adlw adlwVar15 = this.a;
        adlwVar15.ay(adlwVar15.s, adlwVar15.n);
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_CONFIGURED;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_CONFIGURED_STATE;
    }

    @Override // defpackage.adll
    public final boolean h() {
        return true;
    }

    @Override // defpackage.adll
    public final boolean i() {
        Configuration k = this.a.k();
        if (!k.p()) {
            return false;
        }
        adlw adlwVar = this.a;
        adlwVar.aE.k(adlwVar.s, apkn.RCS_PROVISIONING_CONFIGURED_STATE, adko.h(k), k.mValiditySecs, adlwVar.r, new adiw(adlwVar.n));
        this.a.Z(this);
        return true;
    }

    @Override // defpackage.adll
    public final boolean j() {
        return false;
    }

    @Override // defpackage.admi
    public final boolean k(Message message, adjj adjjVar) {
        this.a.J("ConfiguredState", message);
        int ordinal = adlw.av(message).ordinal();
        if (ordinal != 1) {
            if (ordinal != 11) {
                if (ordinal != 25) {
                    return super.o(message, adjjVar);
                }
                q(45);
                this.a.Y();
                adlw adlwVar = this.a;
                adlwVar.ac(adlwVar.af);
                return true;
            }
            q(48);
            adlw adlwVar2 = this.a;
            adlwVar2.ac(adlwVar2.af);
            return true;
        }
        this.a.F();
        return true;
    }
}
