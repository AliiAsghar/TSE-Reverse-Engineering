package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yoi {
    public final String a;
    public final MessageIdType b;
    public final int c;

    public yoi(String str, MessageIdType messageIdType, int i) {
        this.a = str;
        this.b = messageIdType;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yoi)) {
            return false;
        }
        yoi yoiVar = (yoi) obj;
        if (d.F(this.a, yoiVar.a) && d.F(this.b, yoiVar.b) && this.c == yoiVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "SpamReport(jsonSpamReport=" + this.a + ", messageId=" + this.b + ", protocol=" + this.c + ")";
    }
}
