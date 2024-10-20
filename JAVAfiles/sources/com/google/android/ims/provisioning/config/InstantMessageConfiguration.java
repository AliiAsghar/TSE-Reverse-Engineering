package com.google.android.ims.provisioning.config;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InstantMessageConfiguration implements Serializable {
    private static final long serialVersionUID = -6080605804746413886L;
    public boolean mAutoAccept;
    public boolean mAutoAcceptGroupChat;
    public boolean mChatAuth;
    public int mChatRevokeTimer;
    public String mConferenceFactoryUri;
    public String mDeferredMessageFunctionUri;
    public String mExploderUri;
    public boolean mFileTransferAutoAcceptSupported;
    public boolean mFtCapAlwaysOn;
    public boolean mFtHttpCapAlwaysOn;
    public String mFtHttpContentServerPassword;
    public String mFtHttpContentServerUri;
    public String mFtHttpContentServerUser;
    public boolean mFtStoreAndForwardEnabled;
    public boolean mFullGroupSandFSupported;
    public boolean mImCapAlwaysOn;
    public int mImSessionStart;
    public boolean mImWarnSF;
    public int mMaxAdhocGroupSize;
    public boolean mPublishPresenceCap;
    public int mReconnectGuardTimer;
    public boolean mSmsFallBackAuth;
    public int mMaxSize1to1 = 0;
    public int mMaxSize1toM = 0;
    public int mMaxSizeFileTransfer = 0;
    public int mWarnSizeFileTransfer = 0;
    public boolean mFtThumbnailSupported = false;
    public String mFtDefaultMechanism = "msrp";
    public int mMessageTech = 0;
    public int mDefaultSharingMethod = -1;
    public int mTimerIdleSecs = 240;
    public int mDeliveryReportTimeout = 300;
    public boolean mAnonymousChat = true;
    public int mMaxConcurrentSession = -1;
    public int mSwitchoverSize = 1300;

    public final boolean a() {
        if (this.mMessageTech == 1) {
            return true;
        }
        return false;
    }
}
