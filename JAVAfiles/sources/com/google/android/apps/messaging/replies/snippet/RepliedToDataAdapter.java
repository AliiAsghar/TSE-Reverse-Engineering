package com.google.android.apps.messaging.replies.snippet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aowt;
import defpackage.armd;
import defpackage.arml;
import defpackage.d;
import defpackage.lhb;
import defpackage.ltu;
import defpackage.ltv;
import defpackage.rvc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RepliedToDataAdapter implements Parcelable {
    public static final Parcelable.Creator<RepliedToDataAdapter> CREATOR = new ltv(0);
    public final ltu a;
    public final MessageIdType b;
    private final arml c;

    public RepliedToDataAdapter(ltu ltuVar) {
        ltuVar.getClass();
        this.a = ltuVar;
        this.b = rvc.b(ltuVar.c);
        this.c = armd.a(new lhb(this, 17));
    }

    public final String a() {
        return (String) this.c.a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof RepliedToDataAdapter) && d.F(this.a, ((RepliedToDataAdapter) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        aowt.g(parcel, this.a);
    }
}
