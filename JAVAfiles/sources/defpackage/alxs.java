package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alxs {
    public static final alxu a;

    static {
        String[] strArr;
        strArr = alxu.d;
        a = a(strArr);
    }

    private static alxu a(String[] strArr) {
        alyc alycVar;
        try {
            alycVar = alyd.a;
        } catch (NoClassDefFoundError unused) {
            alycVar = null;
        }
        if (alycVar != null) {
            return alycVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (alxu) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th) {
                th = th;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
