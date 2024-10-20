package com.google.android.rcs.client.messaging.data;

import defpackage.ajqs;
import defpackage.ajqt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_MessageClass extends MessageClass {
    private final ajqt b;
    private final ajqs c;
    private final boolean d;
    private final boolean e;

    public AutoValue_MessageClass(ajqt ajqtVar, ajqs ajqsVar, boolean z, boolean z2) {
        this.b = ajqtVar;
        this.c = ajqsVar;
        this.d = z;
        this.e = z2;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageClass
    public final ajqs a() {
        return this.c;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageClass
    public final ajqt b() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageClass
    public final boolean c() {
        return this.e;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageClass
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageClass) {
            MessageClass messageClass = (MessageClass) obj;
            if (this.b.equals(messageClass.b()) && this.c.equals(messageClass.a()) && this.d == messageClass.d() && this.e == messageClass.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
        int i2 = 1237;
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((hashCode * 1000003) ^ i) * 1000003;
        if (true == this.e) {
            i2 = 1231;
        }
        return i3 ^ i2;
    }

    public final String toString() {
        ajqs ajqsVar = this.c;
        return "MessageClass{messageSource=" + String.valueOf(this.b) + ", messagePriority=" + String.valueOf(ajqsVar) + ", interworkingSupported=" + this.d + ", dispositionNotificationRequired=" + this.e + "}";
    }
}
