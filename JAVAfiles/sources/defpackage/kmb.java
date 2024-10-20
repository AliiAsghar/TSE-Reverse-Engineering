package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Objects;
import java.util.Map;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kmb implements ToIntFunction {
    private final /* synthetic */ int a;

    public /* synthetic */ kmb(int i) {
        this.a = i;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.a) {
            case 0:
                return ((kmk) obj).d;
            case 1:
                return ((amgg) obj).u;
            case 2:
                return ((kmk) obj).a();
            case 3:
                if (((kmk) obj).d == 0) {
                    return 0;
                }
                return 1;
            case 4:
                return ((lqv) obj).a();
            case 5:
                return Integer.parseInt(((PartsTable.BindData) obj).z());
            case 6:
                return Integer.parseInt(((PartsTable.BindData) obj).z());
            case 7:
                return ((Integer) ((Map.Entry) obj).getKey()).intValue();
            case 8:
                return ((Integer) Objects.requireNonNullElse((Integer) obj, Integer.MAX_VALUE)).intValue();
            case 9:
                xze xzeVar = yee.a;
                Integer num = ((yel) obj).c;
                num.getClass();
                return num.intValue();
            case 10:
                return ((Integer) obj).intValue();
            default:
                aicv aicvVar = (aicv) obj;
                if (!aicvVar.d.isPresent()) {
                    return 0;
                }
                return aicvVar.d.orElseThrow();
        }
    }
}
