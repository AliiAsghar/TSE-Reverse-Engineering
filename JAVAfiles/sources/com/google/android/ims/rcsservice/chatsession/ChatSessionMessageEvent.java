package com.google.android.ims.rcsservice.chatsession;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aozy;
import defpackage.apey;
import defpackage.apfa;
import j$.time.Duration;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ChatSessionMessageEvent extends ChatSessionEvent implements Parcelable {
    public long b;
    public String c;
    public boolean d;
    public int e;
    public Duration f;
    private byte[] k;
    private String l;
    private boolean m;
    private String n;

    public ChatSessionMessageEvent(int i, long j, long j2, String str, boolean z, long j3, String str2, String str3, String str4, byte[] bArr, boolean z2, Duration duration) {
        super(i, j2, j, str2);
        this.e = 0;
        this.n = str3;
        this.c = str;
        this.m = z;
        this.b = j3;
        this.l = str4;
        this.k = bArr;
        this.d = z2;
        this.f = duration;
    }

    @Override // com.google.android.ims.rcsservice.chatsession.ChatSessionEvent, com.google.android.ims.rcsservice.events.Event
    public final void a(Parcel parcel) {
        boolean z;
        super.a(parcel);
        this.b = parcel.readLong();
        boolean z2 = false;
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.m = z;
        this.c = parcel.readString();
        this.e = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.k = bArr;
            parcel.readByteArray(bArr);
            this.l = parcel.readString();
        }
        if (parcel.readInt() == 1) {
            z2 = true;
        }
        this.d = z2;
        this.n = parcel.readString();
        if (parcel.dataAvail() > 0) {
            this.f = Duration.ofSeconds(parcel.readLong());
        } else {
            this.f = Duration.ZERO;
        }
    }

    @Override // com.google.android.ims.rcsservice.chatsession.ChatSessionEvent, com.google.android.ims.rcsservice.events.Event
    protected final void b(Parcel parcel) {
        parcel.writeString(getClass().getName());
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final void e(aozy aozyVar) {
        String str = this.c;
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

    @Override // com.google.android.ims.rcsservice.events.Event
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatSessionMessageEvent) || !super.equals(obj)) {
            return false;
        }
        ChatSessionMessageEvent chatSessionMessageEvent = (ChatSessionMessageEvent) obj;
        if (this.b == chatSessionMessageEvent.b && this.m == chatSessionMessageEvent.m && this.d == chatSessionMessageEvent.d && this.e == chatSessionMessageEvent.e && Arrays.equals(this.k, chatSessionMessageEvent.k) && Objects.equals(this.l, chatSessionMessageEvent.l) && Objects.equals(this.c, chatSessionMessageEvent.c) && Objects.equals(this.n, chatSessionMessageEvent.n) && Objects.equals(this.f, chatSessionMessageEvent.f)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(Arrays.hashCode(this.k)), this.l, Long.valueOf(this.b), Boolean.valueOf(this.m), this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), this.n, this.f);
    }

    @Override // com.google.android.ims.rcsservice.chatsession.ChatSessionEvent, com.google.android.ims.rcsservice.events.Event, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeInt(this.e);
        byte[] bArr = this.k;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.k);
            parcel.writeString(this.l);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.n);
        parcel.writeLong(this.f.getSeconds());
    }

    public ChatSessionMessageEvent(long j, long j2, String str, long j3, int i, String str2, boolean z) {
        this(i, j2, j, str, false, j3, str2, null, null, null, z, Duration.ZERO);
    }

    public ChatSessionMessageEvent(long j, String str, long j2, int i, String str2, boolean z) {
        this(i, 0L, j, str, false, j2, str2, null, null, null, z, Duration.ZERO);
    }

    public ChatSessionMessageEvent(Parcel parcel) {
        super(parcel);
        this.e = 0;
    }
}
