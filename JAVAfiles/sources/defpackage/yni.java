package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yni {
    public final long a;
    public List b = null;
    public List c = null;
    public ypm d = null;
    public List e = null;
    public ParticipantsTable.BindData f = null;
    public tqc g = null;
    public List h = null;

    public /* synthetic */ yni(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yni)) {
            return false;
        }
        yni yniVar = (yni) obj;
        if (this.a == yniVar.a && d.F(this.b, yniVar.b) && d.F(this.c, yniVar.c) && d.F(this.d, yniVar.d) && d.F(this.e, yniVar.e) && d.F(this.f, yniVar.f) && this.g == yniVar.g && d.F(this.h, yniVar.h)) {
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
        List list = this.b;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        long j = this.a;
        List list2 = this.c;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int A = (a.A(j) * 31) + hashCode;
        ypm ypmVar = this.d;
        if (ypmVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = ypmVar.hashCode();
        }
        int i2 = ((((A * 31) + hashCode2) * 31) + hashCode3) * 31;
        List list3 = this.e;
        if (list3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list3.hashCode();
        }
        int i3 = (i2 + hashCode4) * 31;
        ParticipantsTable.BindData bindData = this.f;
        if (bindData == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bindData.hashCode();
        }
        int i4 = (i3 + hashCode5) * 31;
        tqc tqcVar = this.g;
        if (tqcVar == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = tqcVar.hashCode();
        }
        int i5 = (i4 + hashCode6) * 31;
        List list4 = this.h;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "SpamLoggingMetadataCache(eventTimestampMillis=" + this.a + ", classifications=" + this.b + ", latestMessages=" + this.c + ", targetMessage=" + this.d + ", participants=" + this.e + ", targetParticipant=" + this.f + ", archiveStatus=" + this.g + ", conversationAndMessageLoggingIds=" + this.h + ")";
    }
}
