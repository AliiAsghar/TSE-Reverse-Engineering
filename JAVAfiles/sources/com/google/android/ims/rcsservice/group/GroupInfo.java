package com.google.android.ims.rcsservice.group;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.adsv;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GroupInfo implements Parcelable {
    public static final Parcelable.Creator<GroupInfo> CREATOR = new adsv(0);
    public String a;
    public List b;
    public String c;
    public String d;

    private GroupInfo(List list) {
        this.a = "";
        this.b = list;
        this.c = "";
        this.d = "";
    }

    public final void a(String str) {
        this.c = (String) Optional.ofNullable(str).orElse("");
    }

    public final boolean b() {
        if (TextUtils.isEmpty(this.a) && this.b.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupInfo)) {
            return false;
        }
        GroupInfo groupInfo = (GroupInfo) obj;
        if (Objects.equals(this.a, groupInfo.a) && this.b.equals(groupInfo.b) && Objects.equals(this.c, groupInfo.c) && this.d.equals(groupInfo.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeTypedList(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public GroupInfo() {
        this(new ArrayList());
    }

    public GroupInfo(Parcel parcel) {
        this(new ArrayList());
        this.a = (String) Optional.ofNullable(parcel.readString()).orElse("");
        parcel.readTypedList(this.b, UserInfo.CREATOR);
        this.c = (String) Optional.ofNullable(parcel.readString()).orElse("");
        this.d = (String) Optional.ofNullable(parcel.readString()).orElse("");
    }
}
