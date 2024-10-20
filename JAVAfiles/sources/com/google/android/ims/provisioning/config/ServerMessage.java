package com.google.android.ims.provisioning.config;

import java.io.Serializable;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class ServerMessage implements Serializable {
    private static final long serialVersionUID = -2643052792879731645L;
    public final boolean mHasAcceptButton;
    public final boolean mHasRejectButton;
    public final String mMessage;
    public final String mTitle;

    public ServerMessage(String str, String str2, boolean z, boolean z2) {
        this.mMessage = str;
        this.mTitle = str2;
        this.mHasAcceptButton = z;
        this.mHasRejectButton = z2;
    }
}
