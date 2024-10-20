package com.google.android.rcs.client.messaging.data;

import defpackage.ajqc;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_FileInformation extends FileInformation {
    public final Optional a;
    public final int b;
    public final ContentType c;
    public final String d;
    public final Instant e;
    public final Optional f;
    public final Optional g;
    public final Optional h;

    public AutoValue_FileInformation(Optional optional, int i, ContentType contentType, String str, Instant instant, Optional optional2, Optional optional3, Optional optional4) {
        this.a = optional;
        this.b = i;
        this.c = contentType;
        this.d = str;
        this.e = instant;
        this.f = optional2;
        this.g = optional3;
        this.h = optional4;
    }

    @Override // com.google.android.rcs.client.messaging.data.FileInformation
    public final int a() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.data.FileInformation
    public final ContentType b() {
        return this.c;
    }

    @Override // com.google.android.rcs.client.messaging.data.FileInformation
    public final ajqc c() {
        return new ajqc(this);
    }

    @Override // com.google.android.rcs.client.messaging.data.FileInformation
    public final Instant d() {
        return this.e;
    }

    @Override // com.google.android.rcs.client.messaging.data.FileInformation
    public final Optional e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FileInformation) {
            FileInformation fileInformation = (FileInformation) obj;
            if (this.a.equals(fileInformation.h()) && this.b == fileInformation.a() && this.c.equals(fileInformation.b()) && this.d.equals(fileInformation.i()) && this.e.equals(fileInformation.d()) && this.f.equals(fileInformation.g()) && this.g.equals(fileInformation.e()) && this.h.equals(fileInformation.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.rcs.client.messaging.data.FileInformation
    @Deprecated
    public final Optional f() {
        return this.h;
    }

    @Override // com.google.android.rcs.client.messaging.data.FileInformation
    public final Optional g() {
        return this.f;
    }

    @Override // com.google.android.rcs.client.messaging.data.FileInformation
    public final Optional h() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    @Override // com.google.android.rcs.client.messaging.data.FileInformation
    public final String i() {
        return this.d;
    }

    public final String toString() {
        Optional optional = this.h;
        Optional optional2 = this.g;
        Optional optional3 = this.f;
        Instant instant = this.e;
        ContentType contentType = this.c;
        return "FileInformation{name=" + String.valueOf(this.a) + ", sizeBytes=" + this.b + ", contentType=" + contentType.toString() + ", url=" + this.d + ", validUntil=" + instant.toString() + ", fileType=" + String.valueOf(optional3) + ", audioPlayingDuration=" + String.valueOf(optional2) + ", encryptedMetadata=" + String.valueOf(optional) + "}";
    }
}
