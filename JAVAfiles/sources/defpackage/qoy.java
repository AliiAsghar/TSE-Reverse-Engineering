package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qoy {
    public final ConversationIdType a;
    public final long b;
    public final amfe c;
    public final SuperSortLabel d;
    public final boolean e;

    public qoy() {
        throw null;
    }

    public static qox a() {
        qox qoxVar = new qox();
        qoxVar.d(SuperSortLabel.ALL);
        qoxVar.c(Long.MAX_VALUE);
        qoxVar.e(false);
        return qoxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qoy) {
            qoy qoyVar = (qoy) obj;
            if (this.a.equals(qoyVar.a) && this.b == qoyVar.b && this.c.equals(qoyVar.c) && this.d.equals(qoyVar.d) && this.e == qoyVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        int hashCode2 = (((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        if (true != this.e) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode2 * 1000003) ^ i;
    }

    public final String toString() {
        SuperSortLabel superSortLabel = this.d;
        amfe amfeVar = this.c;
        return "ConversationDeleterParameters{conversationId=" + String.valueOf(this.a) + ", deleteTimestamp=" + this.b + ", origin=" + String.valueOf(amfeVar) + ", filter=" + String.valueOf(superSortLabel) + ", onlyIfEmpty=" + this.e + "}";
    }

    public qoy(ConversationIdType conversationIdType, long j, amfe amfeVar, SuperSortLabel superSortLabel, boolean z) {
        this.a = conversationIdType;
        this.b = j;
        this.c = amfeVar;
        this.d = superSortLabel;
        this.e = z;
    }
}
