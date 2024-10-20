package com.google.android.rcs.client.messaging.data;

import defpackage.a;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_RcsDestinationId extends RcsDestinationId {
    private final String a;
    private final int b;

    public AutoValue_RcsDestinationId(int i, String str) {
        this.b = i;
        this.a = str;
    }

    @Override // com.google.android.rcs.client.messaging.data.RcsDestinationId
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.data.RcsDestinationId
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RcsDestinationId) {
            RcsDestinationId rcsDestinationId = (RcsDestinationId) obj;
            if (this.b == rcsDestinationId.b() && this.a.equals(rcsDestinationId.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.aS(i);
        return ((i ^ 1000003) * 1000003) ^ this.a.hashCode();
    }
}
