package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.CleanTelephonyRawMessagesAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qyx implements rhp {
    final /* synthetic */ Context a;
    final /* synthetic */ xnv b;

    public qyx(Context context, xnv xnvVar) {
        this.a = context;
        this.b = xnvVar;
    }

    @Override // defpackage.rhp
    public final Action c(Parcel parcel) {
        return new CleanTelephonyRawMessagesAction(this.a, this.b, parcel);
    }
}
