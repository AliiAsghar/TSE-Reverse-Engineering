package com.google.android.apps.messaging.shared.datamodel.etouffee.info;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d;
import defpackage.sdr;
import defpackage.uao;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class E2eeInfo implements Parcelable {
    public static final Parcelable.Creator<E2eeInfo> CREATOR = new sdr(10);
    public final List a;

    public E2eeInfo(List<? extends uao> list) {
        list.getClass();
        this.a = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof E2eeInfo) && d.F(this.a, ((E2eeInfo) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "E2eeInfo(e2eeCapabilities=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        List list = this.a;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(((uao) it.next()).name());
        }
    }
}
