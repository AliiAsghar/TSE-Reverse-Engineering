package defpackage;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alps implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public alps(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return alpt.p(this.a);
    }
}
