package com.google.android.ims.jibe.service.profile;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.vcard.VCardConstants;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.rcsservice.profile.IRcsProfile;
import com.google.android.ims.rcsservice.profile.RcsProfileServiceResult;
import defpackage.adab;
import defpackage.adnk;
import defpackage.adnv;
import defpackage.adtw;
import defpackage.aduu;
import defpackage.advr;
import defpackage.adwf;
import defpackage.yjr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RcsProfileEngine extends IRcsProfile.Stub {
    private final Context a;
    private final aduu b;
    private final yjr c;
    private final adnv d;
    private final adnk e;

    public RcsProfileEngine(Context context, aduu aduuVar, yjr yjrVar, adnv adnvVar, adnk adnkVar) {
        if (yjrVar != null) {
            this.a = context;
            this.b = aduuVar;
            this.c = yjrVar;
            this.d = adnvVar;
            this.e = adnkVar;
            return;
        }
        throw new IllegalArgumentException("buglePhoneNumberUtils must not be null or getMsisdn() will throw NPE");
    }

    protected int getDefaultSharingMethod(Configuration configuration) {
        if (adab.n()) {
            return 1;
        }
        if (!adab.d()) {
            return -1;
        }
        return configuration.mInstantMessageConfiguration.mDefaultSharingMethod;
    }

    @Override // com.google.android.ims.rcsservice.profile.IRcsProfile
    @Deprecated
    public Bundle getRcsConfig() {
        adtw.d(this.a, Binder.getCallingUid());
        Configuration configuration = (Configuration) this.e.j().orElse(null);
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("Configuration", configuration);
        return bundle;
    }

    @Override // com.google.android.ims.rcsservice.profile.IRcsProfile
    public RcsProfileServiceResult getValue(int i) {
        String str;
        String k;
        RcsProfileServiceResult rcsProfileServiceResult;
        boolean z;
        try {
            adtw.d(this.a, Binder.getCallingUid());
            if (i == 1000) {
                return new RcsProfileServiceResult(1000, (String) this.d.c().orElse(null));
            }
            if (i == 1001) {
                return new RcsProfileServiceResult(1001, null);
            }
            Configuration configuration = (Configuration) this.e.j().orElse(null);
            if (configuration != null && !configuration.n()) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 136) {
                            switch (i) {
                                case VCardConstants.DEFAULT_PREF /* 100 */:
                                    return new RcsProfileServiceResult(i, String.valueOf(configuration.mInstantMessageConfiguration.mImCapAlwaysOn));
                                case 101:
                                    rcsProfileServiceResult = new RcsProfileServiceResult(i, String.valueOf(configuration.mServicesConfiguration.mGroupChatAuth));
                                    break;
                                case 102:
                                    return new RcsProfileServiceResult(i, String.valueOf(configuration.mInstantMessageConfiguration.mMaxAdhocGroupSize));
                                case 103:
                                    return new RcsProfileServiceResult(i, String.valueOf(configuration.mInstantMessageConfiguration.mImSessionStart));
                                default:
                                    switch (i) {
                                        case 120:
                                            return new RcsProfileServiceResult(i, String.valueOf(configuration.mInstantMessageConfiguration.mMaxSizeFileTransfer));
                                        case 121:
                                            return new RcsProfileServiceResult(i, String.valueOf(configuration.mInstantMessageConfiguration.mWarnSizeFileTransfer));
                                        case 122:
                                            return new RcsProfileServiceResult(i, String.valueOf(configuration.mInstantMessageConfiguration.mMaxSize1to1));
                                        case 123:
                                            return new RcsProfileServiceResult(i, String.valueOf(configuration.mInstantMessageConfiguration.mMaxSize1toM));
                                        case 124:
                                            return new RcsProfileServiceResult(i, String.valueOf(configuration.mInstantMessageConfiguration.mAutoAccept));
                                        case 125:
                                            return new RcsProfileServiceResult(i, String.valueOf(configuration.mInstantMessageConfiguration.mAutoAcceptGroupChat));
                                        case 126:
                                            return new RcsProfileServiceResult(i, String.valueOf(configuration.mInstantMessageConfiguration.mFileTransferAutoAcceptSupported));
                                        case 127:
                                            return new RcsProfileServiceResult(i, String.valueOf(configuration.mPresenceConfiguration.mUsePresence));
                                        case 128:
                                            return new RcsProfileServiceResult(i, String.valueOf(configuration.mInstantMessageConfiguration.mFtHttpCapAlwaysOn));
                                        case 129:
                                            return new RcsProfileServiceResult(i, String.valueOf(configuration.mInstantMessageConfiguration.mFtCapAlwaysOn));
                                        case 130:
                                            return new RcsProfileServiceResult(i, String.valueOf(configuration.mServicesConfiguration.mChatAuth));
                                        case 131:
                                            return new RcsProfileServiceResult(i, String.valueOf(!TextUtils.isEmpty(configuration.mInstantMessageConfiguration.mFtHttpContentServerUri)));
                                        case 132:
                                            return new RcsProfileServiceResult(i, String.valueOf(configuration.mServicesConfiguration.mFtAuth));
                                        case 133:
                                            return new RcsProfileServiceResult(i, String.valueOf(configuration.mServicesConfiguration.mGeoLocPushAuth));
                                        case 134:
                                            if (configuration.mServicesConfiguration.mGeoLocPullAuth != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            return new RcsProfileServiceResult(i, String.valueOf(z));
                                        default:
                                            switch (i) {
                                                case 139:
                                                    return new RcsProfileServiceResult(i, String.valueOf(configuration.mInstantMessageConfiguration.mImWarnSF));
                                                case 140:
                                                    return new RcsProfileServiceResult(i, String.valueOf(!configuration.mInstantMessageConfiguration.mFullGroupSandFSupported));
                                                case 141:
                                                    return new RcsProfileServiceResult(i, String.valueOf(configuration.mInstantMessageConfiguration.mDeliveryReportTimeout));
                                                case 142:
                                                    return new RcsProfileServiceResult(i, String.valueOf(getDefaultSharingMethod(configuration)));
                                                default:
                                                    return new RcsProfileServiceResult(16, "Not supported", i, null);
                                            }
                                    }
                            }
                        } else {
                            rcsProfileServiceResult = new RcsProfileServiceResult(i, "false");
                        }
                        return rcsProfileServiceResult;
                    }
                    return new RcsProfileServiceResult(i, this.b.g());
                }
                ImsConfiguration imsConfiguration = configuration.mImsConfiguration;
                String str2 = "";
                if (imsConfiguration != null && (str = imsConfiguration.mPublicIdentity) != null && (k = adwf.k(str, this.c)) != null) {
                    str2 = k;
                }
                return new RcsProfileServiceResult(i, str2);
            }
            return new RcsProfileServiceResult(18, "Configuration not set", i, null);
        } catch (NullPointerException e) {
            advr.i(e, "RcsProfileEngine: NPE while getting value for id: %d", Integer.valueOf(i));
            return new RcsProfileServiceResult(18, "Unable to retrieve value", i, null);
        }
    }
}
