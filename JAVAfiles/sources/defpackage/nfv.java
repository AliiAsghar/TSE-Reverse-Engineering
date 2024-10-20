package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class nfv {
    public static final xze a = xze.g("BugleDataModel", "SelfIdentitiesTracker");
    public final qxb b;
    private final armf c;

    public nfv(armf armfVar, qxb qxbVar) {
        this.c = armfVar;
        this.b = qxbVar;
    }

    public final nfw a(qwm qwmVar) {
        ParticipantsTable.BindData a2 = qwmVar.a();
        lig ligVar = (lig) this.c.b();
        Optional.empty();
        return ligVar.h(a2);
    }
}
