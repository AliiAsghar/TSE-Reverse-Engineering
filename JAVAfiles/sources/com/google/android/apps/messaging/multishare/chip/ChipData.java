package com.google.android.apps.messaging.multishare.chip;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.a;
import defpackage.arrj;
import defpackage.d;
import defpackage.imp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ChipData implements Parcelable {
    public static final Parcelable.Creator<ChipData> CREATOR = new imp(15);
    public final ChipId a;
    public final String b;
    public final String c;
    public final Uri d;
    public final boolean e;

    public ChipData(ChipId chipId, String str, String str2, Uri uri, boolean z) {
        chipId.getClass();
        str.getClass();
        this.a = chipId;
        this.b = str;
        this.c = str2;
        this.d = uri;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChipData)) {
            return false;
        }
        ChipData chipData = (ChipData) obj;
        if (d.F(this.a, chipData.a) && d.F(this.b, chipData.b) && d.F(this.c, chipData.c) && d.F(this.d, chipData.d) && this.e == chipData.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((hashCode2 * 31) + hashCode) * 31;
        Uri uri = this.d;
        if (uri != null) {
            i = uri.hashCode();
        }
        return ((i2 + i) * 31) + a.v(this.e);
    }

    public final String toString() {
        return "ChipData(chipId=" + this.a + ", text=" + this.b + ", lookupKey=" + this.c + ", photo=" + this.d + ", clip=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("chip_id", this.a);
        bundle.putString(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, this.b);
        bundle.putString("lookup", this.c);
        bundle.putParcelable("photo", this.d);
        bundle.putBoolean("clip", this.e);
        parcel.writeBundle(bundle);
    }

    public /* synthetic */ ChipData(ChipId chipId, String str, String str2, Uri uri, boolean z, int i, arrj arrjVar) {
        this(chipId, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : uri, (!((i & 16) == 0)) | z);
    }
}
