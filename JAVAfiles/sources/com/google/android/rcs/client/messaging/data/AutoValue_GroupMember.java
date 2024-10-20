package com.google.android.rcs.client.messaging.data;

import defpackage.ajqi;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_GroupMember extends GroupMember {
    private final String a;
    private final RcsDestinationId b;
    private final Optional c;
    private final boolean d;
    private final ajqi e;

    public AutoValue_GroupMember(String str, RcsDestinationId rcsDestinationId, Optional optional, boolean z, ajqi ajqiVar) {
        this.a = str;
        this.b = rcsDestinationId;
        this.c = optional;
        this.d = z;
        this.e = ajqiVar;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupMember
    public final ajqi a() {
        return this.e;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupMember
    public final RcsDestinationId b() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupMember
    public final Optional c() {
        return this.c;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupMember
    public final String d() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupMember
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupMember) {
            GroupMember groupMember = (GroupMember) obj;
            if (this.a.equals(groupMember.d()) && this.b.equals(groupMember.b()) && this.c.equals(groupMember.c()) && this.d == groupMember.e() && this.e.equals(groupMember.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ this.e.hashCode();
    }
}
