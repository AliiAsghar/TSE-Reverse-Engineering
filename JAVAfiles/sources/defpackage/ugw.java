package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ugw {
    private static final xze b = xze.g("BugleDataModel", "ParticipantRecoveryOperation");
    public final armf a;
    private final armf c;
    private final armf d;
    private final armf e;
    private final wzs f;
    private final armf g;

    public ugw(armf armfVar, armf armfVar2, armf armfVar3, wzs wzsVar, armf armfVar4, armf armfVar5) {
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = wzsVar;
        this.a = armfVar4;
        this.g = armfVar5;
    }

    public final alog a(List list) {
        Stream map = Collection.EL.stream(list).map(new tyl(this, 11));
        int i = alog.d;
        return (alog) map.collect(alls.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.util.Optional b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugw.b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, int, int):j$.util.Optional");
    }

    public final void c(List list, List list2) {
        boolean z;
        int i;
        int i2;
        alsx alsxVar = (alsx) list;
        if (alsxVar.c != 1) {
            xyo a = b.a();
            a.H("Skip participants restoration");
            a.x("participantsInConversation", alsxVar.c);
            a.q();
            ((mbl) this.e.b()).e("Bugle.Datamodel.Operations.EmptyRecipient.RestoreDestinations", 1);
            return;
        }
        int i3 = 0;
        String M = ((ParticipantsTable.BindData) list.get(0)).M();
        if (list2.size() != 1) {
            z = true;
        } else {
            z = false;
        }
        tbb f = ParticipantsTable.f();
        f.aj("restoreDestinationsInParticipants");
        if (z) {
            f.F("ʼUNKNOWN_SENDER!ʼ");
            f.B("ʼUNKNOWN_SENDER!ʼ");
            f.m("ʼUNKNOWN_SENDER!ʼ");
            i = 2;
        } else {
            msh mshVar = (msh) list2.get(0);
            msh k = ((msk) this.a.b()).k(mshVar);
            uuf uufVar = msw.a;
            armf armfVar = this.a;
            boolean a2 = orf.a();
            msh i4 = ((msk) armfVar.b()).i(k, !a2);
            f.F(mshVar.m());
            f.B(k.m());
            f.m(i4.G(a2).toString());
            i = 3;
        }
        f.M(new tyl(M, 10));
        try {
            if (((Boolean) ((utz) rxr.b.get()).e()).booleanValue()) {
                i3 = ((rxs) this.g.b()).b(f, rya.g);
            } else if (((Boolean) ((utz) rxr.a.get()).e()).booleanValue()) {
                i3 = ((rxs) this.g.b()).a(f.a());
            } else {
                i3 = f.a().e();
            }
            if (i3 == 0) {
                i = 4;
            }
        } catch (SQLiteConstraintException e) {
            if (true != z) {
                i2 = 5;
            } else {
                i2 = 6;
            }
            i = i2;
            xyo e2 = b.e();
            e2.H("Participants constraint failed");
            e2.x("restoreCounterKey", i);
            e2.r(e);
        }
        ((mbl) this.e.b()).e("Bugle.Datamodel.Operations.EmptyRecipient.RestoreDestinations", i);
        xyo a3 = b.a();
        a3.H("Participant restored");
        a3.e(M);
        a3.x("updatedCount", i3);
        a3.x("telephonyRecipients", list2.size());
        a3.x("restoreCounterKey", i);
        a3.q();
    }
}
