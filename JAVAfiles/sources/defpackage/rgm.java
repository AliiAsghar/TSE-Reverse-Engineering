package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateAttachmentAfterResizingAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rgm implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;

    public rgm(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
    }

    public final /* bridge */ /* synthetic */ Action a(String str, String str2, String str3, tql tqlVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        ((uie) this.b.b()).getClass();
        rww rwwVar = (rww) this.c.b();
        rwwVar.getClass();
        agnq agnqVar = (agnq) this.d.b();
        agnqVar.getClass();
        str.getClass();
        str2.getClass();
        tqlVar.getClass();
        return new UpdateAttachmentAfterResizingAction(context, rwwVar, agnqVar, str, str2, str3, tqlVar);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        ((uie) this.b.b()).getClass();
        rww rwwVar = (rww) this.c.b();
        rwwVar.getClass();
        agnq agnqVar = (agnq) this.d.b();
        agnqVar.getClass();
        parcel.getClass();
        return new UpdateAttachmentAfterResizingAction(context, rwwVar, agnqVar, parcel);
    }
}
