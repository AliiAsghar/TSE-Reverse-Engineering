package com.google.android.ims.rcsservice.chatsession;

import android.os.Parcel;
import com.google.android.ims.rcsservice.events.SessionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ChatSessionEvent extends SessionEvent {
    public String a;

    public ChatSessionEvent(int i, long j, long j2) {
        this(i, j, j2, null);
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public void a(Parcel parcel) {
        super.a(parcel);
        this.a = parcel.readString();
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    protected void b(Parcel parcel) {
        parcel.writeString(getClass().getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.ims.rcsservice.events.Event
    public final String c() {
        switch (this.h) {
            case 50002:
                return "CHAT SESSION STARTED";
            case 50003:
                return "CHAT SESSION START FAILED";
            case 50005:
                return "CHAT SESSION TERMINATED";
            case 50020:
                return "USER HAS JOINED GROUP CHAT";
            case 50021:
                return "USER HAS LEFT GROUP CHAT";
            case 50030:
                return "MESSAGE SENT SUCCESSFULLY";
            case 50031:
                return "UNABLE TO SEND MESSAGE";
            case 50032:
                return "IMDN REPORT: MESSAGE DISPLAYED TO REMOTE USER";
            case 50035:
                return "IMDN REPORT: MESSAGE DELIVERED TO REMOTE USER";
            case 50038:
                return "MESSAGE NOT YET DELIVERED";
            case 50039:
                return "MESSAGE REVOCATION SENT";
            case 50040:
                return "MESSAGE REVOCATION SEND FAILED";
            case 50044:
                return "MESSAGE DELIVERED VIA SERVER-SIDE SMS FALLBACK";
            case 50045:
                return "MESSAGE DELIVERED VIA SERVER-SIDE MMS FALLBACK";
            case 50046:
                return "CONFERENCE NOTIFY RECEIVED";
            case 50047:
                return "GROUP CHAT SUBJECT CHANGED";
            case 50048:
                return "CPM GROUP MANAGEMENT RESPONSE RECEIVED";
            case 50050:
                return "REMOTE USER COMPOSING STATE CHANGED";
            case 50070:
                return "IMDN REPORT: REPORT SENT SUCCESSFULLY";
            case 50071:
                return "IMDN REPORT: UNABLE TO SEND REPORT";
            case 50072:
                return "CHAT SESSION REFER FAILED";
            default:
                return "UNDEFINED";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.ims.rcsservice.events.SessionEvent, com.google.android.ims.rcsservice.events.Event
    public final String d() {
        int i = (int) this.i;
        if (i != 0) {
            if (i != 1) {
                return super.d();
            }
            return "IS TYPING";
        }
        return "IS NOT TYPING";
    }

    @Override // com.google.android.ims.rcsservice.events.Event, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }

    public ChatSessionEvent(int i, long j, long j2, String str) {
        super(i, j, j2);
        this.a = str;
    }

    public ChatSessionEvent(Parcel parcel) {
        super(parcel);
    }
}
