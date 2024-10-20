package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akam implements FilenameFilter {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ akam(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (!str.endsWith("-wal") && !str.endsWith("-shm")) {
                    if (str.endsWith("-journal")) {
                        str = str.substring(0, str.length() - 8);
                    }
                } else {
                    str = str.substring(0, str.length() - 4);
                }
                if (str.startsWith("SqliteKeyValueCache:") && str.endsWith(":Singleton.db") && !((alor) ((akao) this.a).c).keySet().contains(str)) {
                    return true;
                }
                return false;
            }
            String str2 = ((aalr) this.a).a;
            boolean equals = str2.equals("email");
            boolean endsWith = str.endsWith("_email");
            if ((str2.equals("email") && str.startsWith("db_copy")) || (str.startsWith("mmsdump-") && equals == endsWith)) {
                return true;
            }
            return str.startsWith("smsdump-");
        }
        if (!str.endsWith("-wal") && !str.endsWith("-shm")) {
            if (str.endsWith("-journal")) {
                str = str.substring(0, str.length() - 8);
            }
        } else {
            str = str.substring(0, str.length() - 4);
        }
        if (str.startsWith("SqliteKeyValueCache:") && str.endsWith(".db") && !((alor) ((akan) this.a).b).keySet().contains(str)) {
            return true;
        }
        return false;
    }
}
