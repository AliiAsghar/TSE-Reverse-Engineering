package com.google.android.ims.provisioning.config;

import android.text.TextUtils;
import defpackage.adjp;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SecondaryDeviceConfiguration implements Serializable {
    private static final long serialVersionUID = 3571080866179902281L;
    private boolean mIsChatEnabled;
    private boolean mIsFileTransferEnabled;
    private boolean mIsImageShareEnabled;
    private boolean mIsSendSmsEnabled;
    private boolean mIsVideoShareEnabled;
    private boolean mIsVoiceCallEnabled;

    public SecondaryDeviceConfiguration() {
        this.mIsVoiceCallEnabled = true;
        this.mIsChatEnabled = true;
        this.mIsSendSmsEnabled = true;
        this.mIsFileTransferEnabled = true;
        this.mIsVideoShareEnabled = true;
        this.mIsImageShareEnabled = true;
    }

    private static boolean a(adjp adjpVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String e = adjpVar.e(str);
        if (e == null) {
            e = "";
        }
        if (e.equals("1")) {
            return false;
        }
        return true;
    }

    public SecondaryDeviceConfiguration(adjp adjpVar) {
        this.mIsVoiceCallEnabled = true;
        this.mIsChatEnabled = true;
        this.mIsSendSmsEnabled = true;
        this.mIsFileTransferEnabled = true;
        this.mIsVideoShareEnabled = true;
        this.mIsImageShareEnabled = true;
        this.mIsVoiceCallEnabled = a(adjpVar, "VoiceCall");
        this.mIsChatEnabled = a(adjpVar, "Chat");
        this.mIsSendSmsEnabled = a(adjpVar, "SendSms");
        this.mIsFileTransferEnabled = a(adjpVar, "FileTransfer");
        this.mIsVideoShareEnabled = a(adjpVar, "VideoShare");
        this.mIsImageShareEnabled = a(adjpVar, "ImageShare");
    }
}
