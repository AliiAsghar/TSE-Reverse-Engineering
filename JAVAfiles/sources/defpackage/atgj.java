package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atgj extends atgo implements Cloneable, Serializable, atgl {
    private static final long serialVersionUID = 2852608688135209575L;

    public atgj() {
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public atgj(atgc atgcVar) {
        super(0L, athk.O(atgcVar));
    }
}
