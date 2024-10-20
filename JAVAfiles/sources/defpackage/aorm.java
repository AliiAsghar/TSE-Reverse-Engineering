package defpackage;

import com.google.gson.internal.sql.SqlDateTypeAdapter;
import com.google.gson.internal.sql.SqlTimeTypeAdapter;
import com.google.gson.internal.sql.SqlTimestampTypeAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aorm {
    public static final boolean a;
    public static final aooo b;
    public static final aooo c;
    public static final aooo d;

    static {
        boolean z;
        aooo aoooVar;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = SqlDateTypeAdapter.a;
            c = SqlTimeTypeAdapter.a;
            aoooVar = SqlTimestampTypeAdapter.a;
        } else {
            aoooVar = null;
            b = null;
            c = null;
        }
        d = aoooVar;
    }
}
