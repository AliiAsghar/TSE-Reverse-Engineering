package com.google.android.rcs.client.messaging.data;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_FileTransferInformation extends FileTransferInformation {
    public final FileInformation a;
    public final Optional b;
    public final Optional c;

    public AutoValue_FileTransferInformation(FileInformation fileInformation, Optional optional, Optional optional2) {
        this.a = fileInformation;
        this.b = optional;
        this.c = optional2;
    }

    @Override // com.google.android.rcs.client.messaging.data.FileTransferInformation
    public final FileInformation a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.data.FileTransferInformation
    public final Optional b() {
        return this.c;
    }

    @Override // com.google.android.rcs.client.messaging.data.FileTransferInformation
    public final Optional c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FileTransferInformation) {
            FileTransferInformation fileTransferInformation = (FileTransferInformation) obj;
            if (this.a.equals(fileTransferInformation.a()) && this.b.equals(fileTransferInformation.c()) && this.c.equals(fileTransferInformation.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        Optional optional2 = this.b;
        return "FileTransferInformation{fileInformation=" + this.a.toString() + ", thumbnailInformation=" + String.valueOf(optional2) + ", encryptedData=" + String.valueOf(optional) + "}";
    }
}
