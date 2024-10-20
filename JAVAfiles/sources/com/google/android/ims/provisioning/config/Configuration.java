package com.google.android.ims.provisioning.config;

import defpackage.aczf;
import defpackage.adju;
import defpackage.agkx;
import defpackage.albo;
import defpackage.alhr;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.ynw;
import j$.util.Optional;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Configuration implements Serializable {
    private static final long serialVersionUID = -426160916861745022L;
    public String mDeviceId;
    public ServerMessage mServerMessage;
    public String mTachyonAuthToken;
    public String mVerifiedSmsToken;
    public boolean tachygramEnabled;
    public String tachyonUrl;
    public WelcomeMessage welcomeMessage;
    private static final alvi b = alvi.m("com/google/android/ims/provisioning/config/Configuration");
    public static final Token a = new Token("", 0);
    public int mConfigState = 0;
    public Token mToken = a;
    public int mType = 0;
    public ImsConfiguration mImsConfiguration = new ImsConfiguration();
    public InstantMessageConfiguration mInstantMessageConfiguration = new InstantMessageConfiguration();
    public MediaConfiguration mMediaConfiguration = new MediaConfiguration();
    public CapabilityConfiguration mCapabilityDiscoveryConfiguration = new CapabilityConfiguration();
    public final ConfirmationConfiguration mConfirmationConfiguration = new ConfirmationConfiguration();
    public SecondaryDeviceConfiguration mSecondaryDeviceConfiguration = new SecondaryDeviceConfiguration();
    public PresenceConfiguration mPresenceConfiguration = new PresenceConfiguration();
    public XdmsConfiguration mXdmsConfiguration = new XdmsConfiguration();
    public UserExperienceConfiguration mUserExperienceConfig = new UserExperienceConfiguration();
    public ServicesConfiguration mServicesConfiguration = new ServicesConfiguration();
    public ChatbotConfiguration mChatbotConfiguration = new ChatbotConfiguration();
    public boolean mReconfigRequested = false;
    private final int mMessageTech = 0;
    public int rcsState = 0;
    public String iccids = "";
    public int mValiditySecs = 0;
    public long mLastUpdateSecs = 0;
    public int mVersion = 0;
    private transient alhr c = albo.D(new ynw(this, 16));

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class Token implements Serializable {
        private static final long serialVersionUID = 1;
        public final long mExpirationTime;
        public final String mValue;

        public Token(String str, long j) {
            this.mValue = str;
            this.mExpirationTime = agkx.W().longValue() + TimeUnit.SECONDS.toMillis(j);
        }
    }

    public final long a() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(agkx.W().longValue());
        int i = this.mValiditySecs;
        int i2 = i / 10;
        if (i > 25200) {
            i2 = Math.max(i2, 25200);
        }
        return Math.max(0L, (this.mValiditySecs - i2) - (seconds - this.mLastUpdateSecs));
    }

    public final long b() {
        return Math.max(0L, this.mValiditySecs - (TimeUnit.MILLISECONDS.toSeconds(agkx.W().longValue()) - this.mLastUpdateSecs));
    }

    public final adju c() {
        return (adju) this.c.get();
    }

    public final Optional d() {
        String str = (String) aczf.o().a.aJ.a();
        if (str.isEmpty()) {
            return Optional.ofNullable(this.tachyonUrl);
        }
        alvw g = b.g();
        g.X(alwp.a, "BugleRcsEngine");
        ((alvg) ((alvg) g).h("com/google/android/ims/provisioning/config/Configuration", "getTachyonPhoneChannelUrl", 694, "Configuration.java")).t("Using Tachyon URL override for testing: %s", str);
        return Optional.of(str);
    }

    public final String e() {
        String str;
        StringBuilder sb = new StringBuilder("Type: ");
        sb.append(this.mType);
        sb.append(", Version: ");
        sb.append(this.mVersion);
        sb.append(", Validity: ");
        sb.append(this.mValiditySecs);
        sb.append(", Last updated: ");
        sb.append(this.mLastUpdateSecs);
        sb.append(", Remaining validity: ");
        sb.append(b());
        sb.append(", Reconfiguration requested: ");
        sb.append(this.mReconfigRequested);
        sb.append(", Messaging technology: ");
        if (this.mInstantMessageConfiguration.mMessageTech == 0) {
            str = "SIMPLE_IM";
        } else {
            str = "CPM";
        }
        sb.append(str);
        sb.append(", rcsVolteSingleRegistration: ");
        sb.append(c().B);
        return sb.toString();
    }

    public final String f() {
        Token token = this.mToken;
        String str = token.mValue;
        if (token != a && str != null && !albo.ar("", str)) {
            return str;
        }
        return null;
    }

    public final void g() {
        this.mToken = a;
    }

    public final void h(ImsConfiguration imsConfiguration) {
        this.mImsConfiguration = imsConfiguration;
        this.c = albo.D(new ynw(imsConfiguration, 17));
    }

    public final void i() {
        this.mValiditySecs = 0;
        this.mVersion = 0;
    }

    public final void j(Token token) {
        if (token == null) {
            this.mToken = a;
        } else {
            this.mToken = token;
        }
    }

    public final boolean k() {
        if (f() != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if (this.mValiditySecs == 0 && this.mVersion == 0 && this.mLastUpdateSecs == 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (this.mVersion > 0) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (this.mValiditySecs == 0 && this.mVersion == 0) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (this.mValiditySecs < 0 && this.mVersion < 0 && !this.mReconfigRequested) {
            return false;
        }
        return true;
    }

    public final boolean p() {
        if (m() && !q() && this.mConfigState == 1 && b() > 0) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(agkx.W().longValue());
        int i = this.mValiditySecs;
        int i2 = i / 10;
        if (i > 25200) {
            i2 = Math.max(i2, 25200);
        }
        if (this.mValiditySecs != 0 && seconds - this.mLastUpdateSecs < r2 - i2 && !this.mReconfigRequested) {
            return false;
        }
        return true;
    }

    public final void r() {
        this.mConfigState = 1;
    }
}
