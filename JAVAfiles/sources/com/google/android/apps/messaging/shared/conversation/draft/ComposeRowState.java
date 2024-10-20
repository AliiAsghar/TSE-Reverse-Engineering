package com.google.android.apps.messaging.shared.conversation.draft;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arrj;
import defpackage.d;
import defpackage.ltv;
import defpackage.qpa;
import defpackage.qpc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ComposeRowState implements Parcelable {
    public static final Parcelable.Creator<ComposeRowState> CREATOR = new ltv(15);
    private final IncomingDraft a;
    private final qpc b;

    public /* synthetic */ ComposeRowState(IncomingDraft incomingDraft, qpc qpcVar, arrj arrjVar) {
        this.a = incomingDraft;
        this.b = qpcVar;
        if (incomingDraft == null && qpcVar == null) {
            throw new qpa();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposeRowState)) {
            return false;
        }
        ComposeRowState composeRowState = (ComposeRowState) obj;
        if (d.F(this.a, composeRowState.a) && this.b == composeRowState.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        IncomingDraft incomingDraft = this.a;
        int i = 0;
        if (incomingDraft == null) {
            hashCode = 0;
        } else {
            hashCode = incomingDraft.hashCode();
        }
        qpc qpcVar = this.b;
        if (qpcVar != null) {
            i = qpcVar.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        return "ComposeRowState(incomingDraft=" + this.a + ", input=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        qpc qpcVar = this.b;
        if (qpcVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(qpcVar.name());
        }
    }
}
