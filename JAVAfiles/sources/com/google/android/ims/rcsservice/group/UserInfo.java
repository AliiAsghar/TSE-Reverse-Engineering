package com.google.android.ims.rcsservice.group;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adsv;
import defpackage.albo;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UserInfo implements Parcelable {
    public static final Parcelable.Creator<UserInfo> CREATOR = new adsv(2);
    public final String a;
    public String b;
    public int c;
    public boolean d;
    public boolean e;
    private String f;
    private String g;

    public UserInfo(String str) {
        this.a = str;
    }

    public final void a(String str) {
        String trim = str.trim();
        if (trim.charAt(0) == '\"') {
            int indexOf = trim.indexOf(34, 1);
            this.b = trim.substring(1, indexOf);
            trim = trim.substring(indexOf + 1).trim();
        }
        if (trim.charAt(0) == '<') {
            trim = trim.substring(1);
        }
        if (trim.charAt(trim.length() - 1) == '>') {
            trim = trim.substring(0, trim.length() - 1);
        }
        int indexOf2 = trim.indexOf(59);
        if (indexOf2 >= 0) {
            this.f = trim.substring(0, indexOf2);
            this.g = trim.substring(indexOf2 + 1);
        } else {
            this.f = trim;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        int indexOf;
        if (!(obj instanceof UserInfo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        String str4 = ((UserInfo) obj).f;
        if (str4 == null) {
            if (this.f != null) {
                return false;
            }
            return true;
        }
        int indexOf2 = str4.indexOf(59);
        if (indexOf2 >= 0) {
            str4 = str4.substring(0, indexOf2);
        }
        int indexOf3 = str4.indexOf(58);
        String substring = str4.substring(0, indexOf3);
        String substring2 = str4.substring(indexOf3 + 1);
        int indexOf4 = substring2.indexOf(64);
        String str5 = null;
        if (indexOf4 >= 0) {
            str = substring2.substring(indexOf4 + 1);
            substring2 = substring2.substring(0, indexOf4);
        } else {
            str = null;
        }
        if (!Objects.isNull(this.f)) {
            int indexOf5 = this.f.indexOf(58);
            str3 = this.f.substring(0, indexOf5);
            str2 = this.f.substring(indexOf5 + 1);
        } else {
            str2 = null;
            str3 = null;
        }
        if (!Objects.isNull(str2) && (indexOf = str2.indexOf(64)) >= 0) {
            str5 = str2.substring(indexOf + 1);
            str2 = str2.substring(0, indexOf);
        }
        if (Objects.equals(str3, substring)) {
            if (!Objects.equals(str2, substring2) || !Objects.equals(str5, str)) {
                return false;
            }
            return true;
        }
        return Objects.equals(str2, substring2);
    }

    public final int hashCode() {
        return String.valueOf(this.f).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.f);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.g);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
    }

    public UserInfo(Parcel parcel) {
        this.a = albo.ag(parcel.readString());
        this.f = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.g = parcel.readString();
        this.d = parcel.readByte() == 1;
        this.e = parcel.readByte() == 1;
    }
}
