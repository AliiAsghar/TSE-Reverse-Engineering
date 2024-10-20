package com.google.android.gms.fido.u2f.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abzf;
import defpackage.abzm;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StateUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StateUpdate> CREATOR = new abzf(15);
    public final String a;
    private final Type b;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public enum Type implements Parcelable {
        CANCEL("cancel"),
        PAUSE("pause"),
        RESUME("resume"),
        STOP("stop"),
        DEVICE_SELECTION("user_selected_device"),
        SELECT_VIEW("user_selected_view"),
        SELECT_TRANSPORT_VIEW("user_selected_view_for_transport"),
        UPDATE_CURRENT_VIEW("update_current_view");

        public static final Parcelable.Creator<Type> CREATOR = new abzf(14);
        public final String i;

        Type(String str) {
            this.i = str;
        }

        public static Type a(String str) {
            for (Type type : values()) {
                if (str.equals(type.i)) {
                    return type;
                }
            }
            throw new abzm(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.i);
        }
    }

    static {
        new StateUpdate(Type.CANCEL);
        new StateUpdate(Type.PAUSE);
        new StateUpdate(Type.RESUME);
        new StateUpdate(Type.STOP);
    }

    public StateUpdate(Type type) {
        abhg.m(type);
        this.b = type;
        boolean z = true;
        if (!type.equals(Type.CANCEL) && !type.equals(Type.PAUSE) && !type.equals(Type.RESUME) && !type.equals(Type.STOP)) {
            z = false;
        }
        d.s(z);
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StateUpdate)) {
            return false;
        }
        StateUpdate stateUpdate = (StateUpdate) obj;
        if (d.B(this.b, stateUpdate.b) && d.B(this.a, stateUpdate.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Type type = Type.CANCEL;
        return Arrays.hashCode(new Object[]{this.b.i, this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        Type type = Type.CANCEL;
        abhi.q(parcel, 2, this.b.i, false);
        abhi.q(parcel, 3, this.a, false);
        abhi.g(parcel, e);
    }

    public StateUpdate(String str, String str2) {
        try {
            this.b = Type.a(str);
            this.a = str2;
        } catch (abzm e) {
            throw new IllegalArgumentException(e);
        }
    }
}
