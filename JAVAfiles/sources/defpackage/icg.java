package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class icg {
    public final long a;
    public final MessageIdType b;
    public final long c;
    private final String d;

    public icg(long j, MessageIdType messageIdType, long j2, String str) {
        this.a = j;
        this.b = messageIdType;
        this.c = j2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icg)) {
            return false;
        }
        icg icgVar = (icg) obj;
        if (this.a == icgVar.a && d.F(this.b, icgVar.b) && this.c == icgVar.c && d.F(this.d, icgVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int A = (a.A(this.a) * 31) + this.b.hashCode();
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((A * 31) + a.A(this.c)) * 31) + hashCode;
    }

    public final String toString() {
        return "BugleAttachmentBackupMetadata(id=" + this.a + ", messageId=" + this.b + ", sizeBytes=" + this.c + ", contentType=" + this.d + ")";
    }
}
