package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alpq extends allk implements Serializable {
    public static final alpq a;
    public static final alpq b;
    private final transient alog c;

    static {
        int i = alog.d;
        a = new alpq(alsx.a);
        b = new alpq(alog.r(alst.a));
    }

    public alpq(alog alogVar) {
        this.c = alogVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.alsv
    public final /* bridge */ /* synthetic */ Set a() {
        if (this.c.isEmpty()) {
            return altg.a;
        }
        return new alth(this.c, alss.a);
    }

    Object writeReplace() {
        return new alpp(this.c);
    }
}
