package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.alvg;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.amdy;
import defpackage.amvm;
import defpackage.qyy;
import defpackage.qzp;
import defpackage.rhl;
import defpackage.wzl;
import defpackage.wzp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class HandleLowStorageAction extends Action<Boolean> implements Parcelable {
    public static final Parcelable.Creator<Action<Boolean>> CREATOR = new qyy(17);
    private final wzl a;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        qzp Nn();
    }

    public HandleLowStorageAction(wzl wzlVar, Parcel parcel) {
        super(parcel, amdy.HANDLE_LOW_STORAGE_ACTION);
        this.a = wzlVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("HandleLowStorageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        boolean z;
        int i;
        String l = this.u.l("deletion_target");
        int hashCode = l.hashCode();
        if (hashCode != -1883682684) {
            if (hashCode == -661444761 && l.equals("MEDIA_MESSAGES")) {
                z = false;
            }
            z = -1;
        } else {
            if (l.equals("OLD_MESSAGES")) {
                z = true;
            }
            z = -1;
        }
        if (z) {
            if (z) {
                i = 2;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            i = 1;
        }
        rhl rhlVar = this.u;
        wzl wzlVar = this.a;
        int i2 = i - 1;
        long d = rhlVar.d("cutoff_duration_millis");
        if (i2 != 0) {
            long epochMilli = wzlVar.b.f().toEpochMilli() - d;
            alvw d2 = wzl.a.d();
            d2.X(alwp.a, "Bugle");
            ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/sms/SmsReleaseStorage", "deleteMessages", 149, "SmsReleaseStorage.java")).q("SmsStorageStatusManager:delete old messages");
            if (wzlVar.c.b(epochMilli) > 0) {
                ((wzp) wzlVar.d.b()).l(amvm.SMS_RELEASE_STORAGE);
            }
        } else {
            alvw d3 = wzl.a.d();
            d3.X(alwp.a, "Bugle");
            ((alvg) ((alvg) d3).h("com/google/android/apps/messaging/shared/sms/SmsReleaseStorage", "deleteMessages", 139, "SmsReleaseStorage.java")).q("SmsStorageStatusManager: delete media messages");
            wzlVar.c.af();
        }
        return true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.HandleLowStorage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
