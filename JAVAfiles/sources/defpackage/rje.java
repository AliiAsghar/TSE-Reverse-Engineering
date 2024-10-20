package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingMessagesAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateContactDisambiguationAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rje implements rhp {
    private final /* synthetic */ int a;

    public rje(byte[] bArr, int i) {
        this.a = i;
    }

    public static final void a() {
        new ProcessPendingMessagesAction().F(Action.r);
    }

    public static final UpdateContactDisambiguationAction b(Parcel parcel) {
        parcel.getClass();
        return new UpdateContactDisambiguationAction(parcel);
    }

    @Override // defpackage.rhp
    public final /* synthetic */ Action c(Parcel parcel) {
        if (this.a != 0) {
            return b(parcel);
        }
        parcel.getClass();
        return new ProcessPendingMessagesAction(parcel);
    }

    public rje(armf armfVar, int i) {
        this.a = i;
        armfVar.getClass();
    }
}
