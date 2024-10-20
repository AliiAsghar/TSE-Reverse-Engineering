package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.diagnostics.DumpDatabaseAction;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmy implements rhp {
    public final armf a;
    public final armf b;
    public final armf c;

    public kmy() {
        throw null;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final DumpDatabaseAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        Map map = (Map) this.c.b();
        map.getClass();
        parcel.getClass();
        return new DumpDatabaseAction(context, this.b, map, parcel);
    }

    public final DumpDatabaseAction b(boolean z) {
        Context context = (Context) this.a.b();
        context.getClass();
        Map map = (Map) this.c.b();
        map.getClass();
        return new DumpDatabaseAction(context, this.b, map, z);
    }

    public kmy(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }
}
