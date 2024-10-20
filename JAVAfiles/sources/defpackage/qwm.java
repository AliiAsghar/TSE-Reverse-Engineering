package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public abstract class qwm {
    public abstract ParticipantsTable.BindData a();

    public abstract Optional b();

    public final int c() {
        return a().o() + 1;
    }

    public final int d() {
        return a().o();
    }

    public final int e() {
        return a().p();
    }

    public final int f() {
        return a().q();
    }

    public final SelfIdentityId g() {
        return lga.V(a().M());
    }

    public final String h() {
        return a().Q();
    }

    public final boolean i() {
        if (a().o() != -1) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (a().p() == -1) {
            return true;
        }
        return false;
    }
}
