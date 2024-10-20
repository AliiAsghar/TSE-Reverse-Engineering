package defpackage;

import android.text.SpannableString;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksx {
    public final SpannableString a;
    public final long b;
    public final MessageIdType c;

    public ksx() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ksx) {
            ksx ksxVar = (ksx) obj;
            if (this.a.equals(ksxVar.a) && this.b == ksxVar.b && this.c.equals(ksxVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        MessageIdType messageIdType = this.c;
        return "ProblematicMessage{displayText=" + String.valueOf(this.a) + ", timestamp=" + this.b + ", messageId=" + String.valueOf(messageIdType) + "}";
    }

    public ksx(SpannableString spannableString, long j, MessageIdType messageIdType) {
        this.a = spannableString;
        this.b = j;
        this.c = messageIdType;
    }
}
