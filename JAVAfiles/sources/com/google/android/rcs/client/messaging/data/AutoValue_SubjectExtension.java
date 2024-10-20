package com.google.android.rcs.client.messaging.data;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_SubjectExtension extends SubjectExtension {
    private final Optional a;
    private final Optional b;

    public AutoValue_SubjectExtension(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    @Override // com.google.android.rcs.client.messaging.data.SubjectExtension
    public final Optional a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.data.SubjectExtension
    public final Optional b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SubjectExtension) {
            SubjectExtension subjectExtension = (SubjectExtension) obj;
            if (this.a.equals(subjectExtension.a()) && this.b.equals(subjectExtension.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
