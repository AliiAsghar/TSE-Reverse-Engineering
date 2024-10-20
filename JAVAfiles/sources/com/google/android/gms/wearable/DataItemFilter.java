package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.abhi;
import defpackage.acju;
import defpackage.albo;
import defpackage.algv;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DataItemFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataItemFilter> CREATOR = new acju(8);
    public final Uri a;
    public final int b;

    public DataItemFilter(Uri uri, int i) {
        this.a = uri;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DataItemFilter)) {
            return false;
        }
        DataItemFilter dataItemFilter = (DataItemFilter) obj;
        if (!Objects.equals(this.a, dataItemFilter.a) || this.b != dataItemFilter.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, this.a);
        aj.f("filterType", this.b);
        return aj.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Uri uri = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, uri, i, false);
        abhi.m(parcel, 2, this.b);
        abhi.g(parcel, e);
    }
}
