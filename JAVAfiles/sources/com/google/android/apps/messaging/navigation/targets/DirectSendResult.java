package com.google.android.apps.messaging.navigation.targets;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arrj;
import defpackage.d;
import defpackage.imp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface DirectSendResult extends Parcelable {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static final class Add implements DirectSendResult {
        public static final Parcelable.Creator<Add> CREATOR = new imp(18);
        public final EditedMedia a;
        public final String b;

        public Add() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Add)) {
                return false;
            }
            Add add = (Add) obj;
            if (d.F(this.a, add.a) && d.F(this.b, add.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            EditedMedia editedMedia = this.a;
            int i = 0;
            if (editedMedia == null) {
                hashCode = 0;
            } else {
                hashCode = editedMedia.hashCode();
            }
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            return "Add(edit=" + this.a + ", textCaption=" + this.b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            EditedMedia editedMedia = this.a;
            if (editedMedia == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                editedMedia.writeToParcel(parcel, i);
            }
            parcel.writeString(this.b);
        }

        public Add(EditedMedia editedMedia, String str) {
            this.a = editedMedia;
            this.b = str;
        }

        public /* synthetic */ Add(EditedMedia editedMedia, String str, int i, arrj arrjVar) {
            this(1 == (i & 1) ? null : editedMedia, (i & 2) != 0 ? null : str);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static final class Discard implements DirectSendResult {
        public static final Parcelable.Creator<Discard> CREATOR = new imp(19);
        public final String a;

        public Discard() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Discard) && d.F(this.a, ((Discard) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return "Discard(textCaption=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
        }

        public Discard(String str) {
            this.a = str;
        }

        public /* synthetic */ Discard(String str, int i, arrj arrjVar) {
            this(1 == (i & 1) ? null : str);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static final class Send implements DirectSendResult {
        public static final Parcelable.Creator<Send> CREATOR = new imp(20);
        public final EditedMedia a;
        public final String b;

        public Send() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Send)) {
                return false;
            }
            Send send = (Send) obj;
            if (d.F(this.a, send.a) && d.F(this.b, send.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            EditedMedia editedMedia = this.a;
            int i = 0;
            if (editedMedia == null) {
                hashCode = 0;
            } else {
                hashCode = editedMedia.hashCode();
            }
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            return "Send(edit=" + this.a + ", textCaption=" + this.b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            EditedMedia editedMedia = this.a;
            if (editedMedia == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                editedMedia.writeToParcel(parcel, i);
            }
            parcel.writeString(this.b);
        }

        public Send(EditedMedia editedMedia, String str) {
            this.a = editedMedia;
            this.b = str;
        }

        public /* synthetic */ Send(EditedMedia editedMedia, String str, int i, arrj arrjVar) {
            this(1 == (i & 1) ? null : editedMedia, (i & 2) != 0 ? null : str);
        }
    }
}
