package com.google.android.apps.messaging.shared.conversation.draft;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a;
import defpackage.arnv;
import defpackage.arrj;
import defpackage.d;
import defpackage.ltv;
import defpackage.qpb;
import defpackage.yyb;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class IncomingDraft implements Parcelable {
    public static final Parcelable.Creator<IncomingDraft> CREATOR = new ltv(18);
    public final String a;
    public final List b;
    public final String c;
    public final boolean d;
    public final Instant e;
    public final EditingData f;
    public final boolean g;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public static final class Attachment implements Parcelable {
        public static final Parcelable.Creator<Attachment> CREATOR = new ltv(17);
        public final String a;
        public final Uri b;
        public final Long c;

        public Attachment(String str, Uri uri, Long l) {
            str.getClass();
            uri.getClass();
            this.a = str;
            this.b = uri;
            this.c = l;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Attachment)) {
                return false;
            }
            Attachment attachment = (Attachment) obj;
            if (d.F(this.a, attachment.a) && d.F(this.b, attachment.b) && d.F(this.c, attachment.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
            Long l = this.c;
            if (l == null) {
                hashCode = 0;
            } else {
                hashCode = l.hashCode();
            }
            return (hashCode2 * 31) + hashCode;
        }

        public final String toString() {
            return "Attachment(type=" + this.a + ", uri=" + yyb.bf(this.b) + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeParcelable(this.b, i);
            Long l = this.c;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
        }
    }

    public IncomingDraft() {
        this(null, null, null, false, null, null, false, 127, null);
    }

    public static /* synthetic */ IncomingDraft a(IncomingDraft incomingDraft, List list, Instant instant, int i) {
        String str;
        boolean z;
        String str2 = null;
        if ((i & 1) != 0) {
            str = incomingDraft.a;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            list = incomingDraft.b;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str2 = incomingDraft.c;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            z = incomingDraft.d;
        } else {
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            instant = incomingDraft.e;
        }
        EditingData editingData = incomingDraft.f;
        boolean z3 = incomingDraft.g;
        list2.getClass();
        return new IncomingDraft(str, list2, str3, z2, instant, editingData, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncomingDraft)) {
            return false;
        }
        IncomingDraft incomingDraft = (IncomingDraft) obj;
        if (d.F(this.a, incomingDraft.a) && d.F(this.b, incomingDraft.b) && d.F(this.c, incomingDraft.c) && this.d == incomingDraft.d && d.F(this.e, incomingDraft.e) && d.F(this.f, incomingDraft.f) && this.g == incomingDraft.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (hashCode * 31) + this.b.hashCode();
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int v = ((((hashCode4 * 31) + hashCode2) * 31) + a.v(this.d)) * 31;
        Instant instant = this.e;
        if (instant == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = instant.hashCode();
        }
        int i2 = (v + hashCode3) * 31;
        EditingData editingData = this.f;
        if (editingData != null) {
            i = editingData.hashCode();
        }
        return ((i2 + i) * 31) + a.v(this.g);
    }

    public final String toString() {
        CharSequence charSequence;
        CharSequence charSequence2;
        String str = this.a;
        String str2 = null;
        if (str != null) {
            charSequence = yyb.be(str);
        } else {
            charSequence = null;
        }
        List list = this.b;
        String str3 = this.c;
        if (str3 != null) {
            charSequence2 = yyb.be(str3);
        } else {
            charSequence2 = null;
        }
        boolean z = this.d;
        Instant instant = this.e;
        EditingData editingData = this.f;
        if (editingData != null) {
            str2 = editingData.toString();
        }
        return "IncomingDraft(text=" + ((Object) charSequence) + ", attachments=" + list + ", subject=" + ((Object) charSequence2) + ", isUrgent=" + z + ", scheduledTime=" + instant + ", editingData=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        List list = this.b;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Attachment) it.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeSerializable(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.g ? 1 : 0);
    }

    public IncomingDraft(String str, List<Attachment> list, String str2, boolean z, Instant instant, EditingData editingData, boolean z2) {
        list.getClass();
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = z;
        this.e = instant;
        this.f = editingData;
        this.g = z2;
        if (str != null && str.length() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (str2 != null && str2.length() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (str == null && str2 == null && !z && list.isEmpty()) {
            throw new qpb();
        }
    }

    public /* synthetic */ IncomingDraft(String str, List list, String str2, boolean z, Instant instant, EditingData editingData, boolean z2, int i, arrj arrjVar) {
        this(1 == (i & 1) ? null : str, (i & 2) != 0 ? arnv.a : list, (i & 4) != 0 ? null : str2, ((i & 8) == 0) & z, (i & 16) != 0 ? null : instant, (i & 32) == 0 ? editingData : null, ((i & 64) == 0) & z2);
    }
}
