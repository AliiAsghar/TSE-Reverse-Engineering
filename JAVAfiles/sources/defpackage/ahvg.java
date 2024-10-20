package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahvg implements ahvi {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahvg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ahvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ahvi, java.lang.Object] */
    @Override // defpackage.ahvi
    public final Object a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return (String) ((Class) this.a).cast(obj);
                    }
                    return (Boolean) ((Class) this.a).cast(obj);
                }
                return this.a.a((byte[]) obj);
            }
            return (Long) ((Class) this.a).cast(obj);
        }
        return this.a.a(Base64.decode((String) obj, 3));
    }
}
