package defpackage;

import java.security.Provider;
import java.security.Signature;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class astz implements astx {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public astz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.astx
    public final Signature a(String str) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        Object obj = this.a;
                        if (obj != null) {
                            return Signature.getInstance(str, (Provider) obj);
                        }
                        return Signature.getInstance(str);
                    }
                    Object obj2 = this.a;
                    if (obj2 != null) {
                        return Signature.getInstance(str, (String) obj2);
                    }
                    return Signature.getInstance(str);
                }
                try {
                    return ((asuf) this.a).f.a(str);
                } catch (Exception unused) {
                    return Signature.getInstance(str);
                }
            }
            try {
                return ((asub) this.a).e.a(str);
            } catch (Exception unused2) {
                return Signature.getInstance(str);
            }
        }
        Object obj3 = this.a;
        if (obj3 != null) {
            return Signature.getInstance(str, (String) obj3);
        }
        return Signature.getInstance(str);
    }
}
