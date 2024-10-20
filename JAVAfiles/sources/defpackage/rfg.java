package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ReloadCequintParticipantAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rfg implements rjj {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;

    public rfg(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
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
        armfVar6.getClass();
        this.f = armfVar6;
    }

    @Override // defpackage.rjj
    public final /* bridge */ /* synthetic */ Action a(ParticipantsTable.BindData bindData) {
        Context context = (Context) this.a.b();
        context.getClass();
        rrh rrhVar = (rrh) this.c.b();
        rrhVar.getClass();
        rjj rjjVar = (rjj) this.d.b();
        rjjVar.getClass();
        uhg uhgVar = (uhg) this.f.b();
        uhgVar.getClass();
        return new ReloadCequintParticipantAction(context, this.b, rrhVar, rjjVar, this.e, uhgVar, bindData);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        rrh rrhVar = (rrh) this.c.b();
        rrhVar.getClass();
        rjj rjjVar = (rjj) this.d.b();
        rjjVar.getClass();
        uhg uhgVar = (uhg) this.f.b();
        uhgVar.getClass();
        parcel.getClass();
        return new ReloadCequintParticipantAction(context, rrhVar, rjjVar, this.e, uhgVar, parcel);
    }
}
