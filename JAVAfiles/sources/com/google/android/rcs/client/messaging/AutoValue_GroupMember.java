package com.google.android.rcs.client.messaging;

import defpackage.ajpu;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_GroupMember extends GroupMember {
    private final String a;
    private final ajpu b;
    private final Optional c;
    private final boolean d;

    public AutoValue_GroupMember(String str, ajpu ajpuVar, Optional optional, boolean z) {
        this.a = str;
        this.b = ajpuVar;
        this.c = optional;
        this.d = z;
    }

    @Override // com.google.android.rcs.client.messaging.GroupMember
    public final ajpu a() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.GroupMember
    public final Optional b() {
        return this.c;
    }

    @Override // com.google.android.rcs.client.messaging.GroupMember
    public final String c() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.GroupMember
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupMember) {
            GroupMember groupMember = (GroupMember) obj;
            if (this.a.equals(groupMember.c()) && this.b.equals(groupMember.a()) && this.c.equals(groupMember.b()) && this.d == groupMember.d()) {
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
        return (hashCode * 1000003) ^ i;
    }
}
