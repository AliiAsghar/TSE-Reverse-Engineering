package com.google.android.ims.filetransfer.http;

import com.google.android.ims.filetransfer.http.message.HttpFileTransferPushMessage;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PendingTransferInfo implements Serializable {
    private static final long serialVersionUID = 1713088683668203856L;
    public String mFileId;
    public FileTransferInfo mFileTransferInfo;
    public long mGroupSessionId;
    public HttpFileTransferPushMessage mPushMessage;
    public final String mRemoteParty;
    public String mTransactionId;
    public final Type mType;
    public byte[] uploadPushMessageData;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public enum Type {
        UPLOAD,
        DOWNLOAD
    }

    public PendingTransferInfo(HttpFileTransferPushMessage httpFileTransferPushMessage) {
        this.mType = Type.DOWNLOAD;
        this.mPushMessage = httpFileTransferPushMessage;
        this.mRemoteParty = httpFileTransferPushMessage.mSender;
    }

    public final boolean a() {
        if (this.mGroupSessionId > 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "PendingDownloadInfo (" + String.valueOf(this.mType) + "):\n Remote party: " + this.mRemoteParty + "\n TID: " + this.mTransactionId + "\n File ID: " + this.mFileId + "\n Download info: " + String.valueOf(this.mPushMessage) + "\n Upload info: " + String.valueOf(this.mFileTransferInfo) + "\n Group Session Id: " + this.mGroupSessionId;
    }

    public PendingTransferInfo(String str, long j, String str2, String str3, FileTransferInfo fileTransferInfo) {
        this.mType = Type.UPLOAD;
        this.mRemoteParty = str;
        this.mTransactionId = str2;
        this.mFileId = str3;
        this.mFileTransferInfo = fileTransferInfo;
        this.mGroupSessionId = j;
    }
}
