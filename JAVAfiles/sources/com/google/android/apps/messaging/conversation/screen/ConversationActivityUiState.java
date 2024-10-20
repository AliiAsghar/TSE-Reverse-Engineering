package com.google.android.apps.messaging.conversation.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import defpackage.albo;
import defpackage.alpt;
import defpackage.imp;
import defpackage.ruy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ConversationActivityUiState implements Parcelable, Cloneable {
    public int b;
    public ConversationId c;

    @Deprecated
    Conversation d;
    public boolean e;
    public static final alpt a = alpt.r(3, 7);
    public static final Parcelable.Creator<ConversationActivityUiState> CREATOR = new imp(3);

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public interface a {
        void s();
    }

    public ConversationActivityUiState(int i) {
        this.d = null;
        this.e = false;
        this.c = null;
        this.b = i;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ConversationActivityUiState clone() {
        try {
            return (ConversationActivityUiState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("ConversationActivityUiState: failed to clone(). Is there a mutable reference?", e);
        }
    }

    public final boolean b() {
        if (this.b == 11) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        int i = this.b;
        if (i != 0 && i != 1 && i != 11) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        int i = this.b;
        if (i == 1 || i == 11) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    public final int f(int i) {
        int i2 = this.b;
        if (i2 != 2) {
            if (i2 != 5 && i2 != 7 && i2 != 12 && i2 != 14) {
                return 1;
            }
            return 3;
        }
        if (i != 2) {
            return 2;
        }
        return 4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String b;
        parcel.writeInt(this.b);
        ConversationId conversationId = this.c;
        if (conversationId == null) {
            b = null;
        } else {
            b = conversationId.b();
        }
        parcel.writeString(b);
        parcel.writeParcelable(this.d, i);
    }

    public ConversationActivityUiState(ConversationId conversationId, int i) {
        this.d = null;
        this.e = false;
        this.c = conversationId;
        this.b = i;
    }

    public ConversationActivityUiState(Parcel parcel) {
        this.d = null;
        this.e = false;
        this.b = parcel.readInt();
        this.c = null;
        String readString = parcel.readString();
        if (!albo.ah(readString)) {
            this.c = new BugleConversationId(ruy.b(readString));
        }
        if (parcel.dataAvail() > 0) {
            this.d = (Conversation) parcel.readParcelable(getClass().getClassLoader());
        }
    }
}
