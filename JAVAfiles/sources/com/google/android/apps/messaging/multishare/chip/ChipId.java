package com.google.android.apps.messaging.multishare.chip;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import defpackage.d;
import defpackage.imp;
import defpackage.lqn;
import defpackage.msh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ChipId extends Parcelable {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static final class Conversation implements ChipId {
        public static final Parcelable.Creator<Conversation> CREATOR = new imp(16);
        public final ConversationId a;

        public Conversation(ConversationId conversationId) {
            conversationId.getClass();
            this.a = conversationId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Conversation) && d.F(this.a, ((Conversation) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Conversation(conversationId=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Bundle bundle = new Bundle();
            bundle.putParcelable("conversation_id", this.a);
            parcel.writeBundle(bundle);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static final class Identity implements ChipId {
        public static final Parcelable.Creator<Identity> CREATOR = new imp(17);
        public final msh a;

        public Identity(msh mshVar) {
            mshVar.getClass();
            this.a = mshVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Identity) && d.F(this.a, ((Identity) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Identity(messagingIdentity=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Bundle bundle = new Bundle();
            bundle.putParcelable("identity", lqn.n(this.a));
            parcel.writeBundle(bundle);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public interface a {
        lqn QF();
    }
}
