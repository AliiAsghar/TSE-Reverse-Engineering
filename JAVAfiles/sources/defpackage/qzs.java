package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.group.GroupInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qzs {
    public final ParticipantsTable.BindData a;
    public final msh b;
    public final tqc c;
    public final long d;
    public final long e;
    public final rve f;
    public final long g;
    public final long h;
    public final String i;
    public final ConversationIdType j;
    public final boolean k;
    public final boolean l;
    public final long m;
    public final GroupInfo n;
    public final long o;
    public final String p;
    public final Uri q;
    public final String r;
    public final long s;
    public final aozb t;
    public final msh u;

    public qzs() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        GroupInfo groupInfo;
        Uri uri;
        aozb aozbVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qzs) {
            qzs qzsVar = (qzs) obj;
            if (this.a.equals(qzsVar.a) && this.b.equals(qzsVar.b) && this.c.equals(qzsVar.c) && this.d == qzsVar.d && this.e == qzsVar.e && this.f.equals(qzsVar.f) && this.g == qzsVar.g && this.h == qzsVar.h && ((str = this.i) != null ? str.equals(qzsVar.i) : qzsVar.i == null) && this.j.equals(qzsVar.j) && this.k == qzsVar.k && this.l == qzsVar.l && this.m == qzsVar.m && ((groupInfo = this.n) != null ? groupInfo.equals(qzsVar.n) : qzsVar.n == null) && this.o == qzsVar.o && this.p.equals(qzsVar.p) && ((uri = this.q) != null ? uri.equals(qzsVar.q) : qzsVar.q == null) && this.r.equals(qzsVar.r) && this.s == qzsVar.s && ((aozbVar = this.t) != null ? aozbVar.equals(qzsVar.t) : qzsVar.t == null)) {
                msh mshVar = this.u;
                msh mshVar2 = qzsVar.u;
                if (mshVar != null ? mshVar.equals(mshVar2) : mshVar2 == null) {
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
        int hashCode5 = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.e;
        rve rveVar = this.f;
        long j2 = this.d;
        int hashCode6 = (((((hashCode5 * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ rveVar.hashCode();
        String str = this.i;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.g;
        long j4 = this.h;
        int hashCode7 = ((((((((hashCode6 * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ hashCode) * 1000003) ^ this.j.hashCode()) * 1000003;
        int i3 = 1237;
        if (true != this.k) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i4 = (hashCode7 ^ i) * 1000003;
        if (true == this.l) {
            i3 = 1231;
        }
        long j5 = this.m;
        int i5 = (((i4 ^ i3) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        GroupInfo groupInfo = this.n;
        if (groupInfo == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = groupInfo.hashCode();
        }
        long j6 = this.o;
        int hashCode8 = (((((i5 ^ hashCode2) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.p.hashCode()) * 1000003;
        Uri uri = this.q;
        if (uri == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = uri.hashCode();
        }
        int hashCode9 = (((hashCode8 ^ hashCode3) * 1000003) ^ this.r.hashCode()) * 1000003;
        long j7 = this.s;
        int i6 = (hashCode9 ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003;
        aozb aozbVar = this.t;
        if (aozbVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = aozbVar.hashCode();
        }
        int i7 = (i6 ^ hashCode4) * 1000003;
        msh mshVar = this.u;
        if (mshVar != null) {
            i2 = mshVar.hashCode();
        }
        return i7 ^ i2;
    }

    public final String toString() {
        msh mshVar = this.u;
        aozb aozbVar = this.t;
        Uri uri = this.q;
        GroupInfo groupInfo = this.n;
        ConversationIdType conversationIdType = this.j;
        rve rveVar = this.f;
        tqc tqcVar = this.c;
        msh mshVar2 = this.b;
        return "InsertRcsFileTransferInBugleDbParams{rawSender=" + String.valueOf(this.a) + ", senderMessagingIdentity=" + String.valueOf(mshVar2) + ", archiveStatus=" + String.valueOf(tqcVar) + ", sentTimestamp=" + this.d + ", receivedTimestamp=" + this.e + ", rcsMessageId=" + String.valueOf(rveVar) + ", rcsFtSessionId=" + this.g + ", associatedSessionId=" + this.h + ", remoteInstance=" + this.i + ", conversationId=" + String.valueOf(conversationIdType) + ", bot=" + this.k + ", conference=" + this.l + ", threadId=" + this.m + ", groupInfo=" + String.valueOf(groupInfo) + ", fileSize=" + this.o + ", fileName=" + this.p + ", fallbackUri=" + String.valueOf(uri) + ", contentType=" + this.r + ", expiry=" + this.s + ", encryptedData=" + String.valueOf(aozbVar) + ", receivingMessagingIdentity=" + String.valueOf(mshVar) + "}";
    }

    public qzs(ParticipantsTable.BindData bindData, msh mshVar, tqc tqcVar, long j, long j2, rve rveVar, long j3, long j4, String str, ConversationIdType conversationIdType, boolean z, boolean z2, long j5, GroupInfo groupInfo, long j6, String str2, Uri uri, String str3, long j7, aozb aozbVar, msh mshVar2) {
        this.a = bindData;
        this.b = mshVar;
        this.c = tqcVar;
        this.d = j;
        this.e = j2;
        this.f = rveVar;
        this.g = j3;
        this.h = j4;
        this.i = str;
        this.j = conversationIdType;
        this.k = z;
        this.l = z2;
        this.m = j5;
        this.n = groupInfo;
        this.o = j6;
        this.p = str2;
        this.q = uri;
        this.r = str3;
        this.s = j7;
        this.t = aozbVar;
        this.u = mshVar2;
    }
}
