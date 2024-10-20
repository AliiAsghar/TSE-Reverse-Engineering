package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.abhi;
import defpackage.acjv;
import defpackage.ackp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ChannelEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChannelEventParcelable> CREATOR = new ackp(4);
    final ChannelImpl a;
    final int b;
    final int c;
    final int d;

    public ChannelEventParcelable(ChannelImpl channelImpl, int i, int i2, int i3) {
        this.a = channelImpl;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void a(acjv acjvVar) {
        int i = this.b;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        Log.w("ChannelEventParcelable", a.bV(i, "Unknown type: "));
                        return;
                    } else {
                        acjvVar.o(this.a);
                        return;
                    }
                }
                acjvVar.n(this.a);
                return;
            }
            acjvVar.p(this.a);
            return;
        }
        acjvVar.m(this.a);
    }

    public final String toString() {
        String str;
        String str2;
        int i = this.b;
        String valueOf = String.valueOf(this.a);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = Integer.toString(i);
                    } else {
                        str = "OUTPUT_CLOSED";
                    }
                } else {
                    str = "INPUT_CLOSED";
                }
            } else {
                str = "CHANNEL_CLOSED";
            }
        } else {
            str = "CHANNEL_OPENED";
        }
        int i2 = this.c;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        str2 = Integer.toString(i2);
                    } else {
                        str2 = "CLOSE_REASON_LOCAL_CLOSE";
                    }
                } else {
                    str2 = "CLOSE_REASON_REMOTE_CLOSE";
                }
            } else {
                str2 = "CLOSE_REASON_DISCONNECTED";
            }
        } else {
            str2 = "CLOSE_REASON_NORMAL";
        }
        return "ChannelEventParcelable[, channel=" + valueOf + ", type=" + str + ", closeReason=" + str2 + ", appErrorCode=" + this.d + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, this.a, i, false);
        abhi.m(parcel, 3, this.b);
        abhi.m(parcel, 4, this.c);
        abhi.m(parcel, 5, this.d);
        abhi.g(parcel, e);
    }
}
