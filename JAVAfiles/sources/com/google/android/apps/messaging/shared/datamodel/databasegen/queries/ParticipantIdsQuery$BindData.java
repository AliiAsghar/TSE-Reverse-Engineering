package com.google.android.apps.messaging.shared.datamodel.databasegen.queries;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aday;
import defpackage.aglz;
import defpackage.agmq;
import defpackage.agnc;
import defpackage.akec;
import defpackage.lbz;
import defpackage.sdr;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ParticipantIdsQuery$BindData extends aglz<lbz, Object, Object, ParticipantIdsQuery$BindData, Object> implements Parcelable {
    public static final Parcelable.Creator<ParticipantIdsQuery$BindData> CREATOR = new sdr(0);
    private String a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ParticipantIdsQuery$BindData() {
    }

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ParticipantIdsQuery [participants.participants__id: %s\n]\n", String.valueOf(this.a));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        lbz lbzVar = (lbz) agmqVar;
        aq();
        this.cJ = lbzVar.dx();
        if (!lbzVar.db(0)) {
        } else {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ParticipantIdsQuery$BindData)) {
            return false;
        }
        ParticipantIdsQuery$BindData participantIdsQuery$BindData = (ParticipantIdsQuery$BindData) obj;
        if (super.aC(participantIdsQuery$BindData.cJ) && Objects.equals(this.a, participantIdsQuery$BindData.a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aglz
    protected final void fo(Parcel parcel) {
        this.a = parcel.readString();
    }

    @Override // defpackage.aglz
    protected final void fp(Parcel parcel) {
        parcel.writeString(this.a);
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "ParticipantIdsQuery -- REDACTED");
        }
        return a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ParticipantIdsQuery$BindData(Parcel parcel) {
        ap(parcel);
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
    }
}
