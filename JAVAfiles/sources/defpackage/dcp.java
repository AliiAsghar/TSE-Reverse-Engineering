package defpackage;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcp {
    public static final /* synthetic */ int a = 0;
    private static final Class[] b = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(Object obj) {
        if (obj instanceof cey) {
            cey ceyVar = (cey) obj;
            if (ceyVar.i() != byo.a && ceyVar.i() != cav.a && ceyVar.i() != bzr.a) {
                return false;
            }
            Object a2 = ceyVar.a();
            if (a2 == null) {
                return true;
            }
            return a(a2);
        }
        if ((obj instanceof armh) && (obj instanceof Serializable)) {
            return false;
        }
        Class[] clsArr = b;
        for (int i = 0; i < 7; i++) {
            if (clsArr[i].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }
}
