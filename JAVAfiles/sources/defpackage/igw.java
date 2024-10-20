package defpackage;

import android.os.Parcelable;
import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class igw implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final Boolean g;
    public final Boolean h;
    public final Integer i;
    public final BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus j;
    public final String k;
    public final int l;

    public igw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        Boolean bool;
        Boolean bool2;
        Integer num;
        BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus participantBlockAndSpamStatus;
        if (obj == this) {
            return true;
        }
        if (obj instanceof igw) {
            igw igwVar = (igw) obj;
            if (this.l == igwVar.l && ((str = this.a) != null ? str.equals(igwVar.a) : igwVar.a == null) && this.b.equals(igwVar.b) && this.c.equals(igwVar.c) && this.d == igwVar.d && this.e == igwVar.e && this.f == igwVar.f && ((bool = this.g) != null ? bool.equals(igwVar.g) : igwVar.g == null) && ((bool2 = this.h) != null ? bool2.equals(igwVar.h) : igwVar.h == null) && ((num = this.i) != null ? num.equals(igwVar.i) : igwVar.i == null) && ((participantBlockAndSpamStatus = this.j) != null ? participantBlockAndSpamStatus.equals(igwVar.j) : igwVar.j == null)) {
                String str2 = this.k;
                String str3 = igwVar.k;
                if (str2 != null ? str2.equals(str3) : str3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i2 = this.l;
        a.aS(i2);
        String str = this.a;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode6 = ((((((i2 ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        int i4 = this.d;
        int i5 = 1237;
        if (true != this.e) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i6 = ((((hashCode6 * 1000003) ^ i4) * 1000003) ^ i) * 1000003;
        if (true == this.f) {
            i5 = 1231;
        }
        int i7 = (i6 ^ i5) * 1000003;
        Boolean bool = this.g;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i8 = (i7 ^ hashCode2) * 1000003;
        Boolean bool2 = this.h;
        if (bool2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool2.hashCode();
        }
        int i9 = (i8 ^ hashCode3) * 1000003;
        Integer num = this.i;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i10 = (i9 ^ hashCode4) * 1000003;
        BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus participantBlockAndSpamStatus = this.j;
        if (participantBlockAndSpamStatus == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = participantBlockAndSpamStatus.hashCode();
        }
        int i11 = (i10 ^ hashCode5) * 1000003;
        String str2 = this.k;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i11 ^ i3;
    }

    public final String toString() {
        return "Input{type=" + hld.i(this.l) + ", targetParticipantId=" + this.a + ", displayDestination=" + this.b + ", conversationId=" + this.c + ", anchorViewId=" + this.d + ", block=" + this.e + ", reportSpam=" + this.f + ", originalBlockStatus=" + this.g + ", originalSpamStatus=" + this.h + ", originalSpamSources=" + this.i + ", participantBlockAndSpamStatus=" + String.valueOf(this.j) + ", lighterConversationId=" + this.k + "}";
    }

    public igw(int i, String str, String str2, String str3, int i2, boolean z, boolean z2, Boolean bool, Boolean bool2, Integer num, BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus participantBlockAndSpamStatus, String str4) {
        this.l = i;
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null displayDestination");
        }
        this.b = str2;
        if (str3 != null) {
            this.c = str3;
            this.d = i2;
            this.e = z;
            this.f = z2;
            this.g = bool;
            this.h = bool2;
            this.i = num;
            this.j = participantBlockAndSpamStatus;
            this.k = str4;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }
}
