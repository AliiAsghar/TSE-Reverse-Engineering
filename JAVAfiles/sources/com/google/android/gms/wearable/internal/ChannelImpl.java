package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelClient$Channel;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.ackp;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ChannelImpl extends AbstractSafeParcelable implements Channel, ChannelClient$Channel {
    public static final Parcelable.Creator<ChannelImpl> CREATOR = new ackp(5);
    public final String a;
    public final String b;
    public final String c;

    public ChannelImpl(String str, String str2, String str3) {
        abhg.m(str);
        this.a = str;
        abhg.m(str2);
        this.b = str2;
        abhg.m(str3);
        this.c = str3;
    }

    @Override // com.google.android.gms.wearable.ChannelClient$Channel
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChannelImpl)) {
            return false;
        }
        ChannelImpl channelImpl = (ChannelImpl) obj;
        if (this.a.equals(channelImpl.a) && d.B(channelImpl.b, this.b) && d.B(channelImpl.c, this.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        int i = 0;
        for (char c : this.a.toCharArray()) {
            i += c;
        }
        String trim = this.a.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i;
        }
        return "Channel{token=" + trim + ", nodeId=" + this.b + ", path=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, str, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.q(parcel, 4, this.c, false);
        abhi.g(parcel, e);
    }
}
