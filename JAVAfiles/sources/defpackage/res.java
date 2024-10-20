package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class res {
    public final int a;
    public final ContentValues b;
    public final ParticipantsTable.BindData c;
    public final long d;
    public final ConversationIdType e;
    public final boolean f;
    public final long g;
    public final Uri h;
    public final boolean i;
    public final boolean j;
    public final tqc k;
    public final boolean l;
    public final tqr m;
    public final long n;
    public final rev o;
    public final boolean p;

    public res() {
        throw null;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        if (obj == this) {
            return true;
        }
        if (obj instanceof res) {
            res resVar = (res) obj;
            if (this.a == resVar.a && this.b.equals(resVar.b) && this.c.equals(resVar.c) && this.d == resVar.d && this.e.equals(resVar.e) && this.f == resVar.f && this.g == resVar.g && ((uri = this.h) != null ? uri.equals(resVar.h) : resVar.h == null) && this.i == resVar.i && this.j == resVar.j && this.k.equals(resVar.k) && this.l == resVar.l && this.m.equals(resVar.m) && this.n == resVar.n && this.o.equals(resVar.o) && this.p == resVar.p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode2 = ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        int hashCode3 = (((hashCode2 * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode();
        Uri uri = this.h;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        long j2 = this.g;
        long j3 = j2 >>> 32;
        int i5 = 1237;
        if (true != this.f) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i6 = ((((((hashCode3 * 1000003) ^ i) * 1000003) ^ ((int) (j2 ^ j3))) * 1000003) ^ hashCode) * 1000003;
        if (true != this.i) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i7 = (i6 ^ i2) * 1000003;
        if (true != this.j) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        int hashCode4 = (((i7 ^ i3) * 1000003) ^ this.k.hashCode()) * 1000003;
        if (true != this.l) {
            i4 = 1237;
        } else {
            i4 = 1231;
        }
        int hashCode5 = (((hashCode4 ^ i4) * 1000003) ^ this.m.hashCode()) * 1000003;
        long j4 = this.n;
        int hashCode6 = (((hashCode5 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.o.hashCode()) * 1000003;
        if (true == this.p) {
            i5 = 1231;
        }
        return hashCode6 ^ i5;
    }

    public final String toString() {
        rev revVar = this.o;
        tqr tqrVar = this.m;
        tqc tqcVar = this.k;
        Uri uri = this.h;
        ConversationIdType conversationIdType = this.e;
        ParticipantsTable.BindData bindData = this.c;
        return "InsertMessageInBugleDbParams{getSubId=" + this.a + ", getMessageValues=" + this.b.toString() + ", getSender=" + bindData.toString() + ", getThreadId=" + this.d + ", getConversationId=" + conversationIdType.toString() + ", isNewConversation=" + this.f + ", getReceivedTime=" + this.g + ", getMessageUri=" + String.valueOf(uri) + ", isNotified=" + this.i + ", isRead=" + this.j + ", archiveStatus=" + tqcVar.toString() + ", shouldMessageBeIgnored=" + this.l + ", getVerificationStatus=" + tqrVar.toString() + ", getMessageLoggingId=" + this.n + ", getRawMessagingAddress=" + revVar.toString() + ", isAllowedByParents=" + this.p + "}";
    }

    public res(int i, ContentValues contentValues, ParticipantsTable.BindData bindData, long j, ConversationIdType conversationIdType, boolean z, long j2, Uri uri, boolean z2, boolean z3, tqc tqcVar, boolean z4, tqr tqrVar, long j3, rev revVar, boolean z5) {
        this.a = i;
        if (contentValues == null) {
            throw new NullPointerException("Null getMessageValues");
        }
        this.b = contentValues;
        this.c = bindData;
        this.d = j;
        if (conversationIdType != null) {
            this.e = conversationIdType;
            this.f = z;
            this.g = j2;
            this.h = uri;
            this.i = z2;
            this.j = z3;
            if (tqcVar != null) {
                this.k = tqcVar;
                this.l = z4;
                if (tqrVar != null) {
                    this.m = tqrVar;
                    this.n = j3;
                    this.o = revVar;
                    this.p = z5;
                    return;
                }
                throw new NullPointerException("Null getVerificationStatus");
            }
            throw new NullPointerException("Null archiveStatus");
        }
        throw new NullPointerException("Null getConversationId");
    }
}
