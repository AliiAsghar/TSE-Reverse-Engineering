package com.google.android.ims.rcsservice.chatsession;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aozy;
import defpackage.apey;
import defpackage.apfa;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ChatSessionReportEvent extends ChatSessionEvent implements Parcelable {
    public String b;
    public int c;
    private String d;

    public ChatSessionReportEvent(int i, int i2, String str, String str2, int i3) {
        this(i, 0L, i2);
        this.b = str;
        this.d = str2;
        this.c = i3;
    }

    @Override // com.google.android.ims.rcsservice.chatsession.ChatSessionEvent, com.google.android.ims.rcsservice.events.Event
    public final void a(Parcel parcel) {
        super.a(parcel);
        this.b = parcel.readString();
        this.d = parcel.readString();
        this.c = parcel.readInt();
    }

    @Override // com.google.android.ims.rcsservice.chatsession.ChatSessionEvent, com.google.android.ims.rcsservice.events.Event
    protected final void b(Parcel parcel) {
        parcel.writeString(getClass().getName());
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final void e(aozy aozyVar) {
        String str = this.b;
        if (str != null) {
            aozy createBuilder = apey.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apey apeyVar = (apey) createBuilder.b;
            apeyVar.b |= 1;
            apeyVar.c = str;
            apey apeyVar2 = (apey) createBuilder.s();
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            apfa apfaVar = (apfa) aozyVar.b;
            apfa apfaVar2 = apfa.a;
            apeyVar2.getClass();
            apfaVar.d = apeyVar2;
            apfaVar.c = 4;
        }
    }

    @Override // com.google.android.ims.rcsservice.chatsession.ChatSessionEvent, com.google.android.ims.rcsservice.events.Event, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeString(this.d);
        parcel.writeInt(this.c);
    }

    public ChatSessionReportEvent(int i, long j, long j2) {
        super(i, j, j2);
    }

    public ChatSessionReportEvent(int i, String str, String str2, int i2) {
        this(i, 0, str, str2, i2);
    }

    public ChatSessionReportEvent(Parcel parcel) {
        super(parcel);
    }
}
