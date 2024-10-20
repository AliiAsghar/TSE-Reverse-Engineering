package com.google.android.rcs.client.messaging.data;

import defpackage.alor;
import defpackage.alzz;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_ContentType extends ContentType {
    public final String a;
    public final String b;
    public final alor c;

    public AutoValue_ContentType(String str, String str2, alor alorVar) {
        this.a = str;
        this.b = str2;
        this.c = alorVar;
    }

    @Override // com.google.android.rcs.client.messaging.data.ContentType
    public final alor a() {
        return this.c;
    }

    @Override // com.google.android.rcs.client.messaging.data.ContentType
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.data.ContentType
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContentType) {
            ContentType contentType = (ContentType) obj;
            if (this.a.equals(contentType.c()) && this.b.equals(contentType.b()) && alzz.am(this.c, contentType.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
