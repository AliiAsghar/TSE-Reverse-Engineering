package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tzx {
    public static final tzy a(tzf tzfVar) {
        tzfVar.getClass();
        int ordinal = tzfVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return tzy.e;
                    }
                    throw new armm();
                }
                return tzy.f;
            }
            return tzy.g;
        }
        return null;
    }

    public static final boolean b(int i) {
        if (i >= 200 && i < 254) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean c(Status status) {
        if (status == null) {
            return false;
        }
        Status.Code code = Status.Code.OK;
        int ordinal = status.getCode().ordinal();
        if (ordinal != 1 && ordinal != 4 && ordinal != 8 && ordinal != 10 && ordinal != 13 && ordinal != 14) {
            return false;
        }
        return true;
    }

    public static agmh[] d() {
        return MessagesTable.c.ap;
    }
}
