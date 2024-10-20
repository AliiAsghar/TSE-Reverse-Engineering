package com.google.android.ims.rcsservice.chatsession;

import android.os.Parcel;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.rcsservice.group.UserInfo;
import com.google.android.rcs.client.messaging.GroupInformation;
import defpackage.adof;
import defpackage.adsh;
import defpackage.advq;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GroupChatSessionEvent extends ChatSessionEvent {
    public String b;
    public GroupInfo c;
    public GroupInformation d;
    private UserInfo e;
    private String f;
    private String k;

    public GroupChatSessionEvent(Parcel parcel) {
        super(parcel);
    }

    @Override // com.google.android.ims.rcsservice.chatsession.ChatSessionEvent, com.google.android.ims.rcsservice.events.Event
    public final void a(Parcel parcel) {
        super.a(parcel);
        this.e = (UserInfo) parcel.readParcelable(getClass().getClassLoader());
        this.b = parcel.readString();
        this.c = (GroupInfo) parcel.readParcelable(getClass().getClassLoader());
        this.f = parcel.readString();
        this.k = parcel.readString();
        this.d = (GroupInformation) parcel.readParcelable(getClass().getClassLoader());
    }

    @Override // com.google.android.ims.rcsservice.chatsession.ChatSessionEvent, com.google.android.ims.rcsservice.events.Event
    protected final void b(Parcel parcel) {
        parcel.writeString(getClass().getName());
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupChatSessionEvent) || !super.equals(obj)) {
            return false;
        }
        GroupChatSessionEvent groupChatSessionEvent = (GroupChatSessionEvent) obj;
        if (Objects.equals(this.e, groupChatSessionEvent.e) && Objects.equals(this.b, groupChatSessionEvent.b) && Objects.equals(this.c, groupChatSessionEvent.c) && Objects.equals(this.f, groupChatSessionEvent.f) && Objects.equals(this.k, groupChatSessionEvent.k) && Objects.equals(this.d, groupChatSessionEvent.d)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.e, this.b, this.c, this.f, this.k, this.d);
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final String toString() {
        return "GroupChatSessionEvent [UserInfo (" + advq.USER_ID.c(this.e) + "), Referrer  (" + advq.USER_ID.c(this.b) + "), GroupInfo  (" + String.valueOf(this.c) + "), GroupInformation  (" + String.valueOf(this.d) + ")]\n" + super.toString();
    }

    @Override // com.google.android.ims.rcsservice.chatsession.ChatSessionEvent, com.google.android.ims.rcsservice.events.Event, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.e, 0);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeString(this.f);
        parcel.writeString(this.k);
        parcel.writeParcelable(this.d, 0);
    }

    public GroupChatSessionEvent(adsh adshVar) {
        super(adshVar.a, adshVar.b, adshVar.c, (String) adshVar.d.map(new adof(10)).orElse(null));
        this.e = (UserInfo) adshVar.d.orElse(null);
        this.b = (String) adshVar.e.orElse(null);
        this.c = (GroupInfo) adshVar.f.orElse(null);
        this.f = (String) adshVar.g.orElse(null);
        this.k = (String) adshVar.h.orElse(null);
        this.d = (GroupInformation) adshVar.i.orElse(null);
    }
}
