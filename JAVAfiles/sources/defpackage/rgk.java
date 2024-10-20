package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.SyncNotificationChannelAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rgk implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;

    public rgk(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SyncNotificationChannelAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        ykw ykwVar = (ykw) this.b.b();
        ykwVar.getClass();
        znj znjVar = (znj) this.c.b();
        znjVar.getClass();
        yhu yhuVar = (yhu) this.d.b();
        yhuVar.getClass();
        ((riw) this.e.b()).getClass();
        parcel.getClass();
        return new SyncNotificationChannelAction(context, ykwVar, znjVar, yhuVar, parcel);
    }
}
