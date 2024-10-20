package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uze {
    public static final agpj a;

    static {
        agov agovVar;
        if (ody.a()) {
            taz e = ParticipantsTable.e();
            e.w("MatrixQueries.containsMatrixParticipant");
            e.e(new uvo(8));
            e.g(new uvo(9));
            agovVar = new agov(e.b());
        } else {
            taz e2 = ParticipantsTable.e();
            e2.w("MatrixQueries.containsMatrixParticipant");
            e2.e(new uvo(10));
            e2.g(new uvo(11));
            agovVar = new agov(e2.b());
        }
        a = agovVar;
    }
}
