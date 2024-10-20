package com.google.android.rcs.client.messaging.data;

import defpackage.alog;
import defpackage.alzz;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_Message extends Message {
    public final String a;
    private final RcsDestinationId b;
    private final alog c;
    private final Optional d;
    private final Optional e;
    private final alog f;
    private final Optional g;
    private final Optional h;

    public AutoValue_Message(String str, RcsDestinationId rcsDestinationId, alog alogVar, Optional optional, Optional optional2, alog alogVar2, Optional optional3, Optional optional4) {
        this.a = str;
        this.b = rcsDestinationId;
        this.c = alogVar;
        this.d = optional;
        this.e = optional2;
        this.f = alogVar2;
        this.g = optional3;
        this.h = optional4;
    }

    @Override // com.google.android.rcs.client.messaging.data.Message
    public final RcsDestinationId a() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.data.Message
    public final alog b() {
        return this.c;
    }

    @Override // com.google.android.rcs.client.messaging.data.Message
    public final alog c() {
        return this.f;
    }

    @Override // com.google.android.rcs.client.messaging.data.Message
    public final Optional d() {
        return this.h;
    }

    @Override // com.google.android.rcs.client.messaging.data.Message
    public final Optional e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Message) {
            Message message = (Message) obj;
            if (this.a.equals(message.h()) && this.b.equals(message.a()) && alzz.at(this.c, message.b()) && this.d.equals(message.g()) && this.e.equals(message.f()) && alzz.at(this.f, message.c()) && this.g.equals(message.e()) && this.h.equals(message.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.rcs.client.messaging.data.Message
    public final Optional f() {
        return this.e;
    }

    @Override // com.google.android.rcs.client.messaging.data.Message
    public final Optional g() {
        return this.d;
    }

    @Override // com.google.android.rcs.client.messaging.data.Message
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }
}
