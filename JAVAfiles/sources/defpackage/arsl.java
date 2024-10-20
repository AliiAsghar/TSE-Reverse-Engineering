package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arsl implements arsn {
    public Object a;

    @Override // defpackage.arsn
    public final Object c(artm artmVar) {
        throw null;
    }

    @Override // defpackage.arsn
    public final void d(artm artmVar, Object obj) {
        throw null;
    }

    public final String toString() {
        String str;
        Object obj = this.a;
        if (obj != null) {
            Objects.toString(obj);
            str = "value=".concat(obj.toString());
        } else {
            str = "value not initialized yet";
        }
        return a.bW(str, "NotNullProperty(", ")");
    }
}
