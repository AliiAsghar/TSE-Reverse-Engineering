package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.conversation.draft.EditingData;
import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhc {
    public final String a;
    public final List b;
    public final String c;
    public final boolean d;
    public final MessageId e;
    public final EditingData f;
    public final Instant g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public jhc() {
        this(null, null, null, false, null, null, null, false, 0, false, 1023);
    }

    public static /* synthetic */ jhc c(jhc jhcVar, String str, List list, String str2, boolean z, boolean z2, int i, int i2) {
        String str3;
        List list2;
        String str4;
        boolean z3;
        MessageId messageId;
        EditingData editingData;
        Instant instant;
        boolean z4;
        int i3;
        if ((i2 & 1) != 0) {
            str3 = jhcVar.a;
        } else {
            str3 = str;
        }
        if ((i2 & 2) != 0) {
            list2 = jhcVar.b;
        } else {
            list2 = list;
        }
        if ((i2 & 4) != 0) {
            str4 = jhcVar.c;
        } else {
            str4 = str2;
        }
        if ((i2 & 8) != 0) {
            z3 = jhcVar.d;
        } else {
            z3 = z;
        }
        if ((i2 & 16) != 0) {
            messageId = jhcVar.e;
        } else {
            messageId = null;
        }
        if ((i2 & 32) != 0) {
            editingData = jhcVar.f;
        } else {
            editingData = null;
        }
        if ((i2 & 64) != 0) {
            instant = jhcVar.g;
        } else {
            instant = null;
        }
        if ((i2 & 128) != 0) {
            z4 = jhcVar.h;
        } else {
            z4 = z2;
        }
        if ((i2 & 256) != 0) {
            i3 = jhcVar.j;
        } else {
            i3 = i;
        }
        boolean z5 = jhcVar.i;
        list2.getClass();
        if (i3 != 0) {
            return new jhc(str3, list2, str4, z3, messageId, editingData, instant, z4, i3, z5);
        }
        throw null;
    }

    public final boolean a() {
        String str;
        boolean z;
        String str2;
        boolean z2;
        String str3;
        String str4;
        boolean a = ows.a();
        if (!a ? !((str = this.a) == null || str.length() == 0) : !((str4 = this.a) == null || arsd.M(str4))) {
            z = true;
        } else {
            z = false;
        }
        if (!a ? !((str2 = this.c) == null || str2.length() == 0) : !((str3 = this.c) == null || arsd.M(str3))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || !this.b.isEmpty() || z2 || this.d || this.e != null) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        String str;
        boolean z;
        String str2;
        boolean z2;
        String str3;
        String str4;
        boolean a = ows.a();
        if (!a ? !((str = this.a) == null || str.length() == 0) : !((str4 = this.a) == null || arsd.M(str4))) {
            z = true;
        } else {
            z = false;
        }
        if (!a ? !((str2 = this.c) == null || str2.length() == 0) : !((str3 = this.c) == null || arsd.M(str3))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || !this.b.isEmpty() || z2) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhc)) {
            return false;
        }
        jhc jhcVar = (jhc) obj;
        if (d.F(this.a, jhcVar.a) && d.F(this.b, jhcVar.b) && d.F(this.c, jhcVar.c) && this.d == jhcVar.d && d.F(this.e, jhcVar.e) && d.F(this.f, jhcVar.f) && d.F(this.g, jhcVar.g) && this.h == jhcVar.h && this.j == jhcVar.j && this.i == jhcVar.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = (hashCode * 31) + this.b.hashCode();
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int v = ((((hashCode5 * 31) + hashCode2) * 31) + a.v(this.d)) * 31;
        MessageId messageId = this.e;
        if (messageId == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = messageId.hashCode();
        }
        int i2 = (v + hashCode3) * 31;
        EditingData editingData = this.f;
        if (editingData == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = editingData.hashCode();
        }
        int i3 = (i2 + hashCode4) * 31;
        Instant instant = this.g;
        if (instant != null) {
            i = instant.hashCode();
        }
        int v2 = (((i3 + i) * 31) + a.v(this.h)) * 31;
        int i4 = this.j;
        a.bm(i4);
        return ((v2 + i4) * 31) + a.v(this.i);
    }

    public final String toString() {
        CharSequence charSequence;
        CharSequence charSequence2;
        String str;
        String str2 = this.a;
        String str3 = null;
        if (str2 != null) {
            charSequence = yyb.be(str2);
        } else {
            charSequence = null;
        }
        List list = this.b;
        String str4 = this.c;
        if (str4 != null) {
            charSequence2 = yyb.be(str4);
        } else {
            charSequence2 = null;
        }
        boolean z = this.d;
        MessageId messageId = this.e;
        EditingData editingData = this.f;
        if (editingData != null) {
            str3 = editingData.toString();
        }
        Instant instant = this.g;
        boolean z2 = this.h;
        int i = this.j;
        StringBuilder sb = new StringBuilder("DraftData(text=");
        sb.append((Object) charSequence);
        sb.append(", attachments=");
        sb.append(list);
        sb.append(", subject=");
        sb.append((Object) charSequence2);
        sb.append(", isUrgent=");
        sb.append(z);
        sb.append(", replyToMessageId=");
        sb.append(messageId);
        sb.append(", editingData=");
        sb.append(str3);
        sb.append(", scheduledTime=");
        sb.append(instant);
        sb.append(", isEncrypted=");
        sb.append(z2);
        sb.append(", source=");
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            str = "CLEAR";
                        } else {
                            str = "REPLACER";
                        }
                    } else {
                        str = "MERGED";
                    }
                } else {
                    str = "PERSISTED";
                }
            } else {
                str = "INCOMING";
            }
        } else {
            str = "USER_INPUT";
        }
        sb.append((Object) str);
        sb.append(")");
        return sb.toString();
    }

    public jhc(String str, List list, String str2, boolean z, MessageId messageId, EditingData editingData, Instant instant, boolean z2, int i, boolean z3) {
        list.getClass();
        if (i == 0) {
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = z;
        this.e = messageId;
        this.f = editingData;
        this.g = instant;
        this.h = z2;
        this.j = i;
        this.i = z3;
    }

    public /* synthetic */ jhc(String str, List list, String str2, boolean z, MessageId messageId, EditingData editingData, Instant instant, boolean z2, int i, boolean z3, int i2) {
        this(1 != (i2 & 1) ? str : null, (i2 & 2) != 0 ? arnv.a : list, (i2 & 4) != 0 ? null : str2, ((i2 & 8) == 0) & z, (i2 & 16) != 0 ? null : messageId, (i2 & 32) != 0 ? null : editingData, (i2 & 64) != 0 ? null : instant, ((i2 & 128) == 0) & z2, (i2 & 256) != 0 ? 1 : i, ((i2 & 512) == 0) & z3);
    }
}
