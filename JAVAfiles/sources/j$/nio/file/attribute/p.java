package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class p {
    public static m a(FileAttribute fileAttribute) {
        Object value;
        if (fileAttribute != null) {
            value = fileAttribute.value();
            if (e(value)) {
                return new n(fileAttribute);
            }
            return k.a(fileAttribute);
        }
        return null;
    }

    public static y b(FileTime fileTime) {
        long millis;
        if (fileTime != null) {
            millis = fileTime.toMillis();
            return y.y(millis);
        }
        return null;
    }

    public static FileAttribute c(m mVar) {
        if (mVar == null) {
            return null;
        }
        if (e(mVar.value())) {
            return new o(mVar);
        }
        return l.a(mVar);
    }

    public static FileTime d(y yVar) {
        FileTime fromMillis;
        if (yVar != null) {
            fromMillis = FileTime.fromMillis(yVar.c0());
            return fromMillis;
        }
        return null;
    }

    private static boolean e(Object obj) {
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (!set.isEmpty()) {
                Object next = set.iterator().next();
                if ((next instanceof C) || j$.adapter.b.t(next)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static /* synthetic */ long f(long j, long j2) {
        long j3 = j / j2;
        if (j - (j2 * j3) == 0) {
            return j3;
        }
        if ((((j ^ j2) >> 63) | 1) < 0) {
            return j3 - 1;
        }
        return j3;
    }

    public static /* synthetic */ long g(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        if ((((j ^ j2) >> 63) | 1) <= 0) {
            return j3 + j2;
        }
        return j3;
    }
}
