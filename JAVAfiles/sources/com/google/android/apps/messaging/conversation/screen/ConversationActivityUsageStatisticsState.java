package com.google.android.apps.messaging.conversation.screen;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a;
import defpackage.alog;
import defpackage.alsx;
import defpackage.amfe;
import defpackage.ijk;
import defpackage.imp;
import defpackage.kmb;
import defpackage.mlo;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationActivityUsageStatisticsState implements Parcelable {
    public static final Parcelable.Creator<ConversationActivityUsageStatisticsState> CREATOR = new imp(4);
    public amfe a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public Boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    public List k;
    public int l;
    public int m;
    private int n;

    public ConversationActivityUsageStatisticsState(Parcel parcel) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.i = 0;
        int i = 1;
        this.l = 1;
        this.m = 1;
        this.n = 1;
        int i2 = alog.d;
        this.k = alsx.a;
        this.a = amfe.b(parcel.readInt());
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt() == 1;
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f = null;
        } else {
            this.f = Boolean.valueOf(readInt == 1);
        }
        this.g = parcel.readInt() == 1;
        this.h = parcel.readInt() == 1;
        this.i = parcel.readInt();
        this.l = a.aG(parcel.readInt());
        this.j = parcel.readInt() == 1;
        int ag = a.ag(parcel.readInt());
        if (ag != 0) {
            this.m = ag;
        }
        int ag2 = a.ag(parcel.readInt());
        if (ag2 != 0) {
            this.n = ag2;
        }
        int[] iArr = new int[parcel.readInt()];
        parcel.readIntArray(iArr);
        this.k = (List) DesugarArrays.stream(iArr).mapToObj(new mlo(i)).collect(Collectors.toCollection(new ijk(11)));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.a.t);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        Boolean bool = this.f;
        int i3 = 1;
        if (bool == null) {
            i2 = -1;
        } else if (bool.booleanValue()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i);
        int i4 = this.l;
        int i5 = i4 - 1;
        if (i4 != 0) {
            parcel.writeInt(i5);
            parcel.writeInt(this.j ? 1 : 0);
            int i6 = this.m;
            int i7 = i6 - 1;
            if (i6 != 0) {
                parcel.writeInt(i7);
                int i8 = this.n;
                int i9 = i8 - 1;
                if (i8 != 0) {
                    parcel.writeInt(i9);
                    parcel.writeInt(this.k.size());
                    parcel.writeIntArray(Collection.EL.stream(this.k).mapToInt(new kmb(i3)).toArray());
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public ConversationActivityUsageStatisticsState(amfe amfeVar) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.i = 0;
        this.l = 1;
        this.m = 1;
        this.n = 1;
        int i = alog.d;
        this.k = alsx.a;
        this.a = amfeVar;
    }
}
