package com.google.android.ims.provisioning.config;

import defpackage.adju;
import defpackage.brg;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ImsConfiguration implements Serializable {
    private static final long serialVersionUID = -746053072179571299L;
    public String mAuthDigestPassword;
    public String mAuthDigestRealm;
    public String mAuthDigestUsername;
    public String mAuthenticationScheme;
    public String mDomain;
    public String mPcscfAddress;
    public int mPcsfPort;
    public String mPrivateIdentity;
    public String mPsMediaTransport;
    public String mPsRtpTransport;
    public String mPsSipTransport;
    public String mPublicIdentity;
    public String mUserName;
    public String mWifiMediaTransport;
    public String mWifiRtpTransport;
    public String mWifiSipTransport;
    public int mT1 = 500;
    public int mT2 = 9500;
    public int mT4 = 10000;
    public int mLocalSipPort = 5762;
    public float mQ = brg.a;
    public boolean mKeepAlive = false;
    public String mPhoneContext = "";
    public int mRegRetryBaseTime = 1800;
    public int mRegRetryMaxTime = 3600;
    public String mNatUrlFmt = "sip";
    public String mIntUrlFmt = "sip";
    public boolean rcsVolteSingleRegistration = false;

    public static ImsConfiguration a(adju adjuVar) {
        ImsConfiguration imsConfiguration = new ImsConfiguration();
        imsConfiguration.e(adjuVar.a);
        imsConfiguration.c(adjuVar.b);
        imsConfiguration.d(adjuVar.c);
        imsConfiguration.i(adjuVar.d);
        imsConfiguration.g(adjuVar.e);
        imsConfiguration.h(adjuVar.f);
        imsConfiguration.mT1 = adjuVar.g;
        imsConfiguration.mT2 = adjuVar.h;
        imsConfiguration.mT4 = adjuVar.i;
        imsConfiguration.mPrivateIdentity = adjuVar.k;
        imsConfiguration.f(adjuVar.l, adjuVar.m);
        imsConfiguration.mDomain = adjuVar.n;
        imsConfiguration.mQ = adjuVar.o;
        imsConfiguration.mPcscfAddress = adjuVar.p;
        imsConfiguration.mPcsfPort = adjuVar.q;
        imsConfiguration.mKeepAlive = adjuVar.r;
        imsConfiguration.mPhoneContext = adjuVar.s;
        imsConfiguration.mAuthenticationScheme = adjuVar.t;
        imsConfiguration.mAuthDigestUsername = adjuVar.u;
        imsConfiguration.mAuthDigestPassword = adjuVar.v;
        imsConfiguration.mAuthDigestRealm = adjuVar.w;
        imsConfiguration.mRegRetryBaseTime = adjuVar.x;
        imsConfiguration.mRegRetryMaxTime = adjuVar.y;
        imsConfiguration.mNatUrlFmt = adjuVar.z;
        imsConfiguration.mIntUrlFmt = adjuVar.A;
        imsConfiguration.rcsVolteSingleRegistration = adjuVar.B;
        return imsConfiguration;
    }

    public static String b(int i) {
        if (i == 0) {
            return "tel";
        }
        return "sip";
    }

    private static String j(String str) {
        char c;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -169334160) {
                if (hashCode == 2376292 && str.equals("MSRP")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (str.equals("MSRPoTLS")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                return "MSRP";
            }
            if (c == 1) {
                return "MSRPoTLS";
            }
            return "unknown";
        }
        return "unknown";
    }

    private static String k(String str) {
        char c;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 81486) {
                if (hashCode == 2554139 && str.equals("SRTP")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("RTP")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                return "RTP";
            }
            if (c == 1) {
                return "SRTP";
            }
            return "unknown";
        }
        return "unknown";
    }

    private static String l(String str) {
        char c;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1479406420) {
                if (hashCode != -1479406138) {
                    if (hashCode == -1479405428 && str.equals("SIPoUDP")) {
                        c = 2;
                    }
                    c = 65535;
                } else {
                    if (str.equals("SIPoTLS")) {
                        c = 1;
                    }
                    c = 65535;
                }
            } else {
                if (str.equals("SIPoTCP")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                return "SIPoTCP";
            }
            if (c == 1) {
                return "SIPoTLS";
            }
            if (c == 2) {
                return "SIPoUDP";
            }
            return "unknown";
        }
        return "unknown";
    }

    public final void c(String str) {
        this.mPsMediaTransport = j(str);
    }

    public final void d(String str) {
        this.mPsRtpTransport = k(str);
    }

    public final void e(String str) {
        this.mPsSipTransport = l(str);
    }

    public final void f(String str, String str2) {
        this.mPublicIdentity = str;
        this.mUserName = str2;
    }

    public final void g(String str) {
        this.mWifiMediaTransport = j(str);
    }

    public final void h(String str) {
        this.mWifiRtpTransport = k(str);
    }

    public final void i(String str) {
        this.mWifiSipTransport = l(str);
    }
}
