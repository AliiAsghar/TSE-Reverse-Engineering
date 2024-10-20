package com.google.android.rcs.client.messaging.data;

import defpackage.alog;
import defpackage.alzz;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_GroupEvent extends GroupEvent {
    private final alog a;

    public AutoValue_GroupEvent(alog alogVar) {
        this.a = alogVar;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupEvent
    public final alog a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupEvent) {
            return alzz.at(this.a, ((GroupEvent) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
