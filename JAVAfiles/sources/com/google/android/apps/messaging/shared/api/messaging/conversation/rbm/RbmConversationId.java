package com.google.android.apps.messaging.shared.api.messaging.conversation.rbm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import defpackage.aozy;
import defpackage.d;
import defpackage.ltv;
import defpackage.mph;
import defpackage.mpi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RbmConversationId implements ConversationId {
    public static final Parcelable.Creator<ConversationId> CREATOR = new ltv(10);
    public final ConversationIdType a;
    public final BugleConversationId b;

    public RbmConversationId(ConversationIdType conversationIdType) {
        boolean z = false;
        if (conversationIdType != null && !conversationIdType.b()) {
            z = true;
        }
        d.s(z);
        this.a = conversationIdType;
        this.b = new BugleConversationId(conversationIdType);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final mph a() {
        return mph.RBM;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final String b() {
        return this.a.toString();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final byte[] c() {
        aozy createBuilder = mpi.a.createBuilder();
        mph mphVar = mph.RBM;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((mpi) createBuilder.b).b = mphVar.a();
        String conversationIdType = this.a.toString();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        mpi mpiVar = (mpi) createBuilder.b;
        conversationIdType.getClass();
        mpiVar.c = conversationIdType;
        return ((mpi) createBuilder.s()).toByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RbmConversationId)) {
            return false;
        }
        return this.a.equals(((RbmConversationId) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aozy createBuilder = mpi.a.createBuilder();
        mph mphVar = mph.RBM;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((mpi) createBuilder.b).b = mphVar.a();
        String conversationIdType = this.a.toString();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        mpi mpiVar = (mpi) createBuilder.b;
        conversationIdType.getClass();
        mpiVar.c = conversationIdType;
        Bundle bundle = new Bundle();
        bundle.putParcelable("proto", new ProtoParsers$InternalDontUse(null, (mpi) createBuilder.s()));
        parcel.writeBundle(bundle);
    }
}
