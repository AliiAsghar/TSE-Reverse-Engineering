package com.google.android.ims.rcsservice.contacts;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.adpn;
import defpackage.adpo;
import defpackage.adse;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ImsCapabilities extends adpo implements Parcelable {
    public static final long k = TimeUnit.SECONDS.toMillis(5);
    public static final Parcelable.Creator<ImsCapabilities> CREATOR = new adse(10);

    public ImsCapabilities(long j) {
        super(j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeLong(this.e);
        parcel.writeInt(this.g);
        parcel.writeStringList(this.i);
        Bundle bundle = new Bundle(this.h.size());
        for (Map.Entry entry : this.h.entrySet()) {
            bundle.putString(((adpn) entry.getKey()).toString(), (String) entry.getValue());
        }
        parcel.writeBundle(bundle);
        parcel.writeLong(this.f);
        if (this.j.isEmpty()) {
            str = null;
        } else {
            str = (String) this.j.get();
        }
        parcel.writeString(str);
    }

    public ImsCapabilities(Parcel parcel) {
        this.c = parcel.readInt() == 1;
        this.e = parcel.readLong();
        this.g = parcel.readInt();
        parcel.readStringList(this.i);
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        readBundle.getClass();
        for (adpn adpnVar : adpn.values()) {
            String string = readBundle.getString(adpnVar.toString());
            if (!TextUtils.isEmpty(string)) {
                this.h.put(adpnVar, string);
            }
        }
        long readLong = parcel.readLong();
        if (readLong > 0) {
            this.f = readLong;
        } else {
            this.f = k;
        }
        this.j = Optional.ofNullable(parcel.readString());
    }

    public ImsCapabilities(adpo adpoVar) {
        super(adpoVar);
    }
}
