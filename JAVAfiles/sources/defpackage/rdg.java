package defpackage;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessSentMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rdg implements rhp {
    public final armf a;
    public final armf b;

    public rdg(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public final /* bridge */ /* synthetic */ Action a(MessageIdType messageIdType, rve rveVar, Uri uri, Uri uri2, int i, int i2, int i3, int i4, amxb amxbVar, amgt amgtVar) {
        vid vidVar = (vid) this.a.b();
        vidVar.getClass();
        messageIdType.getClass();
        amgtVar.getClass();
        return new ProcessSentMessageAction(vidVar, messageIdType, rveVar, uri, uri2, i, i2, i3, i4, amxbVar, amgtVar);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        vid vidVar = (vid) this.a.b();
        vidVar.getClass();
        parcel.getClass();
        return new ProcessSentMessageAction(vidVar, parcel);
    }
}
