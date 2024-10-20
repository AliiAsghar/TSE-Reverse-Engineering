package com.google.android.ims.provisioning.config;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ServicesConfiguration implements Serializable {
    private static final long serialVersionUID = 5140802812008878397L;
    public int mVideoShareAuth;
    public boolean mPresenceProfile = false;
    public boolean mChatAuth = true;
    public boolean mGroupChatAuth = true;
    public boolean mFtAuth = true;
    public boolean mStandaloneMsgAuth = false;
    public int mGeoLocPullAuth = 0;
    public boolean mGeoLocPushAuth = true;
    public boolean mCallComposerAuth = false;
    public boolean mSharedMapAuth = false;
    public boolean mSharedSketchAuth = false;
    public boolean mPostCallAuth = false;
}
