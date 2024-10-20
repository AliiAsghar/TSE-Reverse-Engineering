package com.google.android.apps.messaging.shared.datamodel.etouffee.info;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import defpackage.amkd;
import defpackage.arrj;
import defpackage.d;
import defpackage.sdr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DetailsPageE2eeInfoRequest implements Parcelable {
    public static final Parcelable.Creator<DetailsPageE2eeInfoRequest> CREATOR = new sdr(9);
    public final String a;
    public final Conversation b;
    public final amkd c;

    public DetailsPageE2eeInfoRequest(String str, Conversation conversation, amkd amkdVar) {
        str.getClass();
        amkdVar.getClass();
        this.a = str;
        this.b = conversation;
        this.c = amkdVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailsPageE2eeInfoRequest)) {
            return false;
        }
        DetailsPageE2eeInfoRequest detailsPageE2eeInfoRequest = (DetailsPageE2eeInfoRequest) obj;
        if (d.F(this.a, detailsPageE2eeInfoRequest.a) && d.F(this.b, detailsPageE2eeInfoRequest.b) && this.c == detailsPageE2eeInfoRequest.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Conversation conversation = this.b;
        if (conversation == null) {
            hashCode = 0;
        } else {
            hashCode = conversation.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DetailsPageE2eeInfoRequest(conversationId=" + this.a + ", conversation=" + this.b + ", reason=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
    }

    public /* synthetic */ DetailsPageE2eeInfoRequest(String str, Conversation conversation, amkd amkdVar, int i, arrj arrjVar) {
        this(str, (i & 2) != 0 ? null : conversation, amkdVar);
    }
}
