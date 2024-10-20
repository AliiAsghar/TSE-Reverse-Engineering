package com.google.android.ims.provisioning.config;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UserExperienceConfiguration implements Serializable {
    private static final long serialVersionUID = -3518223239618459336L;
    public String breakoutCallLabel;
    public String ipCallLabel;
    public int mFileTransferFallbackDefault;
    public int mMessageFallbackDefault;
    public boolean mAlwaysShowBreakoutCallButton = false;
    public boolean mFullyIntegratedMessagingSupported = true;
    public boolean mOneButtonVideoCall = false;
    public boolean mUserAliasAuth = true;
}
