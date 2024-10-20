package com.google.android.rcs.client.profile;

import android.content.Context;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.rcsservice.profile.IRcsProfile;
import defpackage.aczf;
import defpackage.ajnv;
import defpackage.ajoa;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.uuh;
import defpackage.ylm;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RcsProfileService extends ajnv<IRcsProfile> {
    private final ylm h;

    static {
        uuh.r(185392834, "convert_null_msisdn_to_empty_string");
    }

    public RcsProfileService(Context context, ajoa ajoaVar, ylm ylmVar) {
        super(IRcsProfile.class, context, ajoaVar, 1, Optional.empty());
        this.h = ylmVar;
    }

    public int getDefaultSharingMethod() {
        return this.h.a();
    }

    @Deprecated
    public int getGroupChatMaximumMessageSize() {
        return this.h.b();
    }

    @Deprecated
    public int getMaxGroupSize() {
        return this.h.c();
    }

    public String getMsisdn() {
        akrh e = aktp.e("RcsProfileService::getMsisdn");
        try {
            String f = this.h.f();
            e.close();
            return f;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    public int getOne2OneChatMaximumMessageSize() {
        return this.h.d();
    }

    public Configuration getRcsConfig() {
        return (Configuration) this.h.e().orElse(null);
    }

    public String getRcsConfigAcsUrl() {
        return this.h.g();
    }

    @Override // defpackage.ajnv
    public String getRcsServiceMetaDataKey() {
        return "ProfileServiceVersions";
    }

    @Override // defpackage.ajnv
    public boolean isConnected() {
        if (((Boolean) aczf.o().a.aD.a()).booleanValue()) {
            return true;
        }
        return super.isConnected();
    }
}
