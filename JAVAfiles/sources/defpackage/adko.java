package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.provisioning.config.ServerMessage;
import com.google.android.ims.provisioning.config.WelcomeMessage;
import j$.util.Optional;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adko {
    private static final alvi e = alvi.m("com/google/android/ims/provisioning/engine/ProvisioningEngineConfigUtils");
    public final aduu a;
    public final adnk b;
    public final adtn c;
    public final armf d;
    private final Context f;
    private final adnt g;
    private final yjr h;
    private final adtl i;
    private final armf j;
    private final armf k;
    private final armf l;
    private final armf m;
    private final armf n;
    private final acoe o;
    private final adaw p;

    public adko(Context context, acoe acoeVar, aduu aduuVar, adnt adntVar, yjr yjrVar, adnk adnkVar, adtn adtnVar, adaw adawVar, adtl adtlVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        this.f = context;
        this.o = acoeVar;
        this.a = aduuVar;
        this.g = adntVar;
        this.h = yjrVar;
        this.b = adnkVar;
        this.c = adtnVar;
        this.p = adawVar;
        this.i = adtlVar;
        this.j = armfVar;
        this.k = armfVar2;
        this.l = armfVar3;
        this.m = armfVar4;
        this.d = armfVar5;
        this.n = armfVar6;
    }

    public static int h(Configuration configuration) {
        if (configuration == null) {
            return 3;
        }
        if (configuration.m()) {
            return 2;
        }
        if (!configuration.n()) {
            int i = configuration.mValiditySecs;
            if (i > 0 && configuration.mVersion == 0) {
                return 6;
            }
            if (i == -1 && configuration.mVersion == -1) {
                return 4;
            }
            return 1;
        }
        return 5;
    }

    private final Configuration i(String str) {
        return this.b.f(str);
    }

    private final void j(Configuration configuration, String str) {
        this.b.u(str, configuration);
        this.o.h(this.f, configuration.mVersion, configuration.b(), configuration.mValiditySecs);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Configuration configuration, String str) {
        advr.c("Set supported network to 3g and wifi", new Object[0]);
        ImsConfiguration imsConfiguration = configuration.mImsConfiguration;
        if (imsConfiguration == null) {
            advr.g("Can't apply config, null ImsConfiguration - this is a bug!", new Object[0]);
            return;
        }
        configuration.mInstantMessageConfiguration.mAnonymousChat = true;
        String str2 = imsConfiguration.mPublicIdentity;
        if (!TextUtils.isEmpty(str2)) {
            String k = adwf.k(str2, this.h);
            advr.c("ProvisioningEngineConfigUtils parsed msisdn:[%s] from publicIdentity:[%s] for simId:[%s]", advq.PHONE_NUMBER.c(k), advq.URI_SIP.c(str2), advq.SIM_ID.c(str));
            yjr yjrVar = this.h;
            String str3 = null;
            if (k != null) {
                try {
                    str3 = yjrVar.s(new yjt(yjrVar.D(k, null).c()));
                } catch (anhk e2) {
                    xyo b = yjr.a.b();
                    b.H("getCountryForPhone: Not able to parse");
                    b.j(k);
                    b.r(e2);
                }
            }
            this.a.o(str3);
            this.a.r(k);
            d(str, k);
            return;
        }
        advr.k("Applied a config with an empty publicIdentity, msisdn and country data won't be available", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final void b(String str) {
        Configuration f = this.b.f(str);
        if (f.mConfigState == 2) {
            f = new Configuration();
        } else {
            f.g();
            f.i();
        }
        j(f, str);
    }

    public final void c(Configuration configuration, Configuration configuration2, String str) {
        if (configuration == null) {
            advr.c("Skipped processing null remote configuration", new Object[0]);
            return;
        }
        advr.k("Configuration update received. Updating \nfrom [%s] \nto [%s]", configuration2.e(), configuration.e());
        int i = configuration.mType;
        if (i == 1) {
            configuration.mReconfigRequested = false;
            configuration.mLastUpdateSecs = System.currentTimeMillis() / 1000;
            j(configuration, str);
            if (aczv.U()) {
                configuration.rcsState = configuration.mVersion;
            }
            if (!configuration.n()) {
                a(configuration, str);
            }
            advr.k("Provisioning refreshed with full configuration", new Object[0]);
            configuration2 = configuration;
        } else if (i != 2 && i != 3) {
            advr.k("Received carrier configuration in an unexpected format.", new Object[0]);
        } else {
            configuration2.mValiditySecs = configuration.mValiditySecs;
            configuration2.mVersion = configuration.mVersion;
            configuration2.mServerMessage = configuration.mServerMessage;
            configuration2.welcomeMessage = configuration.welcomeMessage;
            configuration2.mReconfigRequested = false;
            if (Configuration.a.equals(configuration.mToken)) {
                advr.q("Received configuration with no token or invalid token during refresh.", new Object[0]);
            } else if (!configuration2.mToken.equals(configuration.mToken)) {
                configuration2.j(configuration.mToken);
                advr.k("Received configuration with a new token during refresh", new Object[0]);
            }
            configuration2.mLastUpdateSecs = System.currentTimeMillis() / 1000;
            if (aczv.U()) {
                configuration2.rcsState = configuration2.mVersion;
            }
            j(configuration2, str);
            advr.k("Provisioning refreshed with partial configuration.", new Object[0]);
        }
        Optional of = Optional.of(str);
        ServerMessage serverMessage = configuration2.mServerMessage;
        if (serverMessage != null && serverMessage.mHasAcceptButton && serverMessage.mHasRejectButton && e(configuration, configuration2)) {
            if (!configuration.c().B) {
                of.isPresent();
                this.g.p(18, (String) of.get());
            }
        } else {
            WelcomeMessage welcomeMessage = configuration2.welcomeMessage;
            if (welcomeMessage != null && welcomeMessage.mHasAcceptButton && !welcomeMessage.mHasRejectButton) {
                if (!configuration.c().B) {
                    of.isPresent();
                    this.g.p(20, (String) of.get());
                }
                WelcomeMessage welcomeMessage2 = configuration2.welcomeMessage;
                aozy createBuilder = acun.a.createBuilder();
                String str2 = welcomeMessage2.mMessage;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                acun acunVar = (acun) apagVar;
                str2.getClass();
                acunVar.b = 1 | acunVar.b;
                acunVar.c = str2;
                String str3 = welcomeMessage2.mTitle;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                acun acunVar2 = (acun) apagVar2;
                str3.getClass();
                acunVar2.b = 2 | acunVar2.b;
                acunVar2.d = str3;
                boolean z = welcomeMessage2.mHasAcceptButton;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar3 = createBuilder.b;
                acun acunVar3 = (acun) apagVar3;
                acunVar3.b |= 4;
                acunVar3.e = z;
                boolean z2 = welcomeMessage2.hasSettingsButton;
                if (!apagVar3.isMutable()) {
                    createBuilder.u();
                }
                acun acunVar4 = (acun) createBuilder.b;
                acunVar4.b |= 16;
                acunVar4.g = z2;
                acun acunVar5 = (acun) createBuilder.s();
                Bundle bundle = new Bundle();
                bundle.putByteArray("com.google.android.ims.provisioning.enginge.welcome_message", acunVar5.toByteArray());
                of.ifPresent(new adgr(bundle, 9));
                adjk.c(this.f, 3, bundle);
            }
        }
        Configuration f = this.b.f(str);
        if (!f.m() && f.mConfigState != 3) {
            advr.c("Processed disabled configuration", new Object[0]);
            return;
        }
        if (!f.o()) {
            advr.c("Processed invalid version in configuration", new Object[0]);
        } else if (f(configuration, configuration2)) {
            advr.c("Waiting for user to confirm configuration", new Object[0]);
        } else {
            f.r();
            j(f, str);
        }
    }

    public final void d(String str, String str2) {
        if (((acxv) this.j.b()).a()) {
            ((aday) this.k.b()).s(str, str2);
            return;
        }
        Context context = this.f;
        adnu.a();
        adnu.p(context, str, str2);
    }

    final boolean e(Configuration configuration, Configuration configuration2) {
        if (configuration2.mServerMessage == null) {
            return false;
        }
        if (!configuration2.m() || !configuration2.o()) {
            return true;
        }
        if (configuration2.mConfigState != 0) {
            if (!configuration.c().B) {
                this.g.o(19);
            }
            return false;
        }
        if (configuration.mType != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(Configuration configuration, Configuration configuration2) {
        ServerMessage serverMessage;
        if (!e(configuration, configuration2) || (serverMessage = configuration2.mServerMessage) == null || !serverMessage.mHasRejectButton) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v18, types: [adtm, java.lang.Object] */
    public final Configuration g(Configuration configuration, apkn apknVar, String str, acnz acnzVar, String str2) {
        String str3;
        Optional empty;
        c(configuration, i(str2), str2);
        Configuration i = i(str2);
        if (i != null) {
            acnzVar.k(this.f, apknVar, h(i), i.mValiditySecs, str, new adiw(str2));
            if (aczy.d()) {
                if (((Boolean) this.m.b()).booleanValue()) {
                    str3 = ((wxb) ((wwn) this.l.b()).j(new adiw(str2)).orElse(wxb.a)).n;
                    if (str3.isEmpty()) {
                        alvw i2 = e.i();
                        i2.X(alwp.a, "BugleRcsProvisioning");
                        alvg alvgVar = (alvg) i2;
                        alvgVar.Z(alwk.MEDIUM);
                        ((alvg) alvgVar.h("com/google/android/ims/provisioning/engine/ProvisioningEngineConfigUtils", "persistConfigFileInternal", 247, "ProvisioningEngineConfigUtils.java")).q("No ICCID found for simId when setting ICCID binding for config.");
                        return i(str2);
                    }
                } else {
                    adtn adtnVar = (adtn) this.i.c;
                    wxb d = adtnVar.d();
                    if (d == null) {
                        str3 = (String) adtnVar.c.d();
                    } else {
                        str3 = d.n;
                    }
                }
                if (!str3.isEmpty()) {
                    int i3 = alog.d;
                    List<String> list = alsx.a;
                    String str4 = i.iccids;
                    if (!TextUtils.isEmpty(str4)) {
                        this.g.o(41);
                        list = Arrays.asList(str4.split(","));
                    }
                    try {
                        empty = Optional.of(((aduw) this.p.a).b(str3));
                    } catch (adux e2) {
                        advr.s(e2, "Error while retrieving rcs user identity from Bugle", new Object[0]);
                        empty = Optional.empty();
                    }
                    if (empty.isPresent()) {
                        String str5 = i.c().l;
                        if (!TextUtils.isEmpty(str5)) {
                            String k = adwf.k(str5, this.h);
                            if (!TextUtils.isEmpty(k)) {
                                this.g.o(42);
                                this.i.a.p((String) empty.get(), k);
                            }
                        }
                        for (String str6 : list) {
                            advr.k("binding iccid %s to %s", advq.SIM_ICCID.c(str6), advq.SIM_ICCID.c(empty.get()));
                            ((aduy) this.p.a).k("rcs_user_id_".concat(String.valueOf(str6)), (String) empty.get(), "bugle");
                        }
                    }
                } else {
                    advr.g("not able to bind iccid list because there is no iccid initialized", new Object[0]);
                }
            }
        }
        this.g.j(this.f, apknVar, acnzVar, str, new adiw(str2));
        return i(str2);
    }
}
