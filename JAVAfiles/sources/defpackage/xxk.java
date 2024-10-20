package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xxk {
    public final Boolean a;
    public final Boolean b;
    public final ypi c;
    public final ConversationIdType d;
    public final String e;
    public final ResolvedRecipient f;
    public final boolean g;
    public final amfe h;
    public final amzu i;
    public final boolean j;
    public final xxn k;
    public final int l;
    public final int m;
    public final int n;

    public /* synthetic */ xxk(Boolean bool, Boolean bool2, ypi ypiVar, ConversationIdType conversationIdType, String str, ResolvedRecipient resolvedRecipient, boolean z, amfe amfeVar, int i, int i2, int i3, amzu amzuVar, boolean z2, xxn xxnVar, int i4) {
        ypi ypiVar2;
        ConversationIdType conversationIdType2;
        String str2;
        ResolvedRecipient resolvedRecipient2;
        boolean z3;
        amfe amfeVar2;
        int i5;
        Boolean bool3;
        Boolean bool4;
        amzu amzuVar2;
        if ((i4 & 4) != 0) {
            ypiVar2 = ypi.b;
        } else {
            ypiVar2 = ypiVar;
        }
        if ((i4 & 8) != 0) {
            conversationIdType2 = null;
        } else {
            conversationIdType2 = conversationIdType;
        }
        if ((i4 & 16) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i4 & 32) != 0) {
            resolvedRecipient2 = null;
        } else {
            resolvedRecipient2 = resolvedRecipient;
        }
        if ((i4 & 64) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z4 = (!z3) | z;
        if ((i4 & 128) != 0) {
            amfeVar2 = null;
        } else {
            amfeVar2 = amfeVar;
        }
        if ((i4 & 1024) != 0) {
            i5 = 2;
        } else {
            i5 = i3;
        }
        int i6 = i4 & 1;
        if ((i4 & 2) != 0) {
            bool3 = null;
        } else {
            bool3 = bool2;
        }
        if (1 == i6) {
            bool4 = null;
        } else {
            bool4 = bool;
        }
        if ((i4 & 2048) != 0) {
            amzuVar2 = null;
        } else {
            amzuVar2 = amzuVar;
        }
        boolean z5 = ((i4 & 4096) == 0) & z2;
        xxn xxnVar2 = (i4 & 8192) == 0 ? xxnVar : null;
        this.a = bool4;
        this.b = bool3;
        this.c = ypiVar2;
        this.d = conversationIdType2;
        this.e = str2;
        this.f = resolvedRecipient2;
        this.g = z4;
        this.h = amfeVar2;
        this.l = i;
        this.m = i2;
        this.n = i5;
        this.i = amzuVar2;
        this.j = z5;
        this.k = xxnVar2;
        if (bool4 == null && bool3 == null) {
            throw new IllegalArgumentException("At least one status must be updated");
        }
        if (bool4 != null && bool3 != null && !z5 && !d.F(bool4, bool3)) {
            throw new IllegalArgumentException("This API does not support blocking & reporting-not-spam, nor unblocking & reporting spam. Both operations have to move in the same direction.");
        }
        if (str2 != null && str2.length() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (conversationIdType2 == null && ((str2 == null || str2.length() == 0) && resolvedRecipient2 == null)) {
            throw new IllegalArgumentException("We must have a conversation and/or a participant/recipient to update statuses.");
        }
        if (bool3 != null) {
            if (amfeVar2 != null) {
                if (z5) {
                    if (ypiVar2 != null) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (ypiVar2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (z5 && xxnVar2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxk)) {
            return false;
        }
        xxk xxkVar = (xxk) obj;
        if (d.F(this.a, xxkVar.a) && d.F(this.b, xxkVar.b) && this.c == xxkVar.c && d.F(this.d, xxkVar.d) && d.F(this.e, xxkVar.e) && d.F(this.f, xxkVar.f) && this.g == xxkVar.g && this.h == xxkVar.h && this.l == xxkVar.l && this.m == xxkVar.m && this.n == xxkVar.n && this.i == xxkVar.i && this.j == xxkVar.j && d.F(this.k, xxkVar.k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        Boolean bool = this.a;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        Boolean bool2 = this.b;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i2 = hashCode * 31;
        ypi ypiVar = this.c;
        if (ypiVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = ypiVar.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + hashCode3) * 31;
        ConversationIdType conversationIdType = this.d;
        if (conversationIdType == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = conversationIdType.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str = this.e;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        ResolvedRecipient resolvedRecipient = this.f;
        if (resolvedRecipient == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = resolvedRecipient.hashCode();
        }
        int v = (((i5 + hashCode6) * 31) + a.v(this.g)) * 31;
        amfe amfeVar = this.h;
        if (amfeVar == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = amfeVar.hashCode();
        }
        int i6 = (v + hashCode7) * 31;
        int i7 = this.l;
        a.bm(i7);
        int i8 = (i6 + i7) * 31;
        int i9 = this.m;
        a.bm(i9);
        int i10 = (i8 + i9) * 31;
        int i11 = this.n;
        a.bm(i11);
        int i12 = (i10 + i11) * 31;
        amzu amzuVar = this.i;
        if (amzuVar == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = amzuVar.hashCode();
        }
        int v2 = (((i12 + hashCode8) * 31) + a.v(this.j)) * 31;
        xxn xxnVar = this.k;
        if (xxnVar != null) {
            i = xxnVar.hashCode();
        }
        return v2 + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BlockAndReportSpamRequest(blockStatus=");
        sb.append(this.a);
        sb.append(", spamStatus=");
        sb.append(this.b);
        sb.append(", classificationSource=");
        sb.append(this.c);
        sb.append(", conversationId=");
        sb.append(this.d);
        sb.append(", targetParticipantId=");
        sb.append(this.e);
        sb.append(", targetRecipient=");
        sb.append(this.f);
        sb.append(", allowExternalReporting=");
        sb.append(this.g);
        sb.append(", bugleConversationOrigin=");
        sb.append(this.h);
        sb.append(", scope=");
        sb.append((Object) aktp.au(this.l));
        sb.append(", entryPoint=");
        sb.append((Object) aktp.av(this.m));
        sb.append(", dialog=");
        int i = this.n;
        if (i != 0) {
            str = aktp.aw(i);
        } else {
            str = "null";
        }
        sb.append((Object) str);
        sb.append(", spamUserActionType=");
        sb.append(this.i);
        sb.append(", isUndo=");
        sb.append(this.j);
        sb.append(", undoBlockAndReportSpamRequest=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
