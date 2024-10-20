package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xki extends unp {
    public static final xze a = xze.g("Bugle", "PwqForwardSyncEngineWorkItemHandler");
    public final armf b;
    public final armf c;
    private final armf d;
    private final arwe e;
    private final Context f;

    public xki(armf armfVar, armf armfVar2, armf armfVar3, xnv xnvVar, vyv vyvVar, arwe arweVar, Context context) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        xnvVar.getClass();
        vyvVar.getClass();
        arweVar.getClass();
        context.getClass();
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = arweVar;
        this.f = context;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        unv a2 = xim.a();
        une a3 = unf.a();
        Object e = xim.a.e();
        e.getClass();
        a3.d(((Number) e).intValue());
        a3.c(a2);
        a3.b = ((via) this.d.b()).b(this.f.getString(R.string.forward_sync_foreground_notification_text));
        return a3.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("PwqForwardSyncEngineWorkItemHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        xkg xkgVar = (xkg) apbtVar;
        xkgVar.getClass();
        return qjh.a(arrn.I(this.e, null, null, new xgk(this, xkgVar, (arpe) null, 9), 3));
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = xkg.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }
}
