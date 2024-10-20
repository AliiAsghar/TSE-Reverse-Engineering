package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ReadDraftDataAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rdj extends rir {
    @Override // defpackage.rhp
    public final Action c(Parcel parcel) {
        return new ReadDraftDataAction(parcel);
    }
}
