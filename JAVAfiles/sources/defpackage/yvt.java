package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvt implements rwt, rwo, rwp {
    private final osz a;

    public yvt(osz oszVar) {
        this.a = oszVar;
    }

    private static final void k(MessageCoreData messageCoreData, int i, int i2) {
        if (!aabr.ba(messageCoreData)) {
            return;
        }
        tbb f = ParticipantsTable.f();
        f.K(i2);
        f.M(new rbe(i, messageCoreData, 11));
        f.a().e();
    }

    @Override // defpackage.rwt
    public final void b(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        messageIdType.getClass();
        if (!this.a.a()) {
            return;
        }
        k(messageCoreData, 7, 11);
    }

    @Override // defpackage.rwo
    public final void c(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        if (!this.a.a()) {
            return;
        }
        k(messageCoreData, 8, 10);
    }

    @Override // defpackage.rwo
    public final /* synthetic */ void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.rwo
    public final /* synthetic */ void e(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.rwt
    public final boolean fJ() {
        return this.a.a();
    }

    @Override // defpackage.rwp
    public final /* synthetic */ akrh h() {
        return vcp.p();
    }

    @Override // defpackage.rwp
    public final void i(MessageCoreData messageCoreData) {
        if (!this.a.a()) {
            return;
        }
        k(messageCoreData, 8, 10);
    }

    @Override // defpackage.rwt
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.rwt
    public final /* synthetic */ void fK() {
    }

    @Override // defpackage.rwt
    public final /* synthetic */ void fL() {
    }

    @Override // defpackage.rwo
    public final void g() {
    }

    @Override // defpackage.rwp
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.rwt
    public final /* synthetic */ Object a(MessageCoreData messageCoreData, List list, arpe arpeVar) {
        return messageCoreData;
    }
}
