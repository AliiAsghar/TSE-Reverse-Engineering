package com.google.android.apps.messaging.shared.datamodel.data.common;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.rha;
import defpackage.rts;
import defpackage.tbb;
import defpackage.xyo;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ParticipantColor implements ParticipantCoreColor {
    public int a;
    public int b;
    public int c;
    private static final xze d = xze.g("Bugle", "ParticipantColor");
    public static final Parcelable.Creator<ParticipantColor> CREATOR = new rha(9);

    public ParticipantColor() {
        d(null);
    }

    public static ParticipantColor b(String str) {
        try {
            Color.parseColor(str);
            return new ParticipantColor(2, -1, Color.parseColor(str));
        } catch (IllegalArgumentException | NullPointerException e) {
            xyo e2 = d.e();
            e2.H("Unable to parse color from");
            e2.H(str);
            e2.r(e);
            return new ParticipantColor(2, -1, 3622735);
        }
    }

    private final void h(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantCoreColor
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantCoreColor
    public final void c(tbb tbbVar) {
        tbbVar.e(this.b);
        tbbVar.f(this.a);
        tbbVar.n(this.c);
    }

    public final void d(ParticipantColor participantColor) {
        if (participantColor != null) {
            h(participantColor.a, participantColor.b, participantColor.c);
        } else {
            h(0, -1, 0);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(ParticipantsTable.BindData bindData) {
        h(bindData.k(), bindData.h(), bindData.l());
    }

    public final boolean f(ParticipantCoreColor participantCoreColor) {
        if (participantCoreColor.a() == 0 && this.a != 0) {
            return false;
        }
        if (participantCoreColor.a() == 1 && this.a == 2) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        if (this.a == 0) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public ParticipantColor(int i, int i2, int i3) {
        h(i, i2, i3);
    }

    public ParticipantColor(Parcel parcel) {
        h(parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public ParticipantColor(ParticipantColor participantColor) {
        d(participantColor);
    }

    public ParticipantColor(rts rtsVar) {
        this(rtsVar.c, (rtsVar.b & 1) != 0 ? rtsVar.d : -1, rtsVar.e);
    }
}
