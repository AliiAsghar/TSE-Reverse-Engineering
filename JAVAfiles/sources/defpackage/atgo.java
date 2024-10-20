package defpackage;

import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class atgo extends atgn implements Serializable, atgl {
    private static final long serialVersionUID = -6728882245981L;
    public volatile long a;
    public volatile atfu b;

    public atgo() {
        this(atfz.a(), athk.N());
    }

    @Override // defpackage.atgl
    public final atfu a() {
        return this.b;
    }

    @Override // defpackage.atgl
    public final long getMillis() {
        return this.a;
    }

    public atgo(long j, atfu atfuVar) {
        Map map = atfz.a;
        this.b = atfuVar;
        this.a = j;
        if (this.a == Long.MIN_VALUE || this.a == Long.MAX_VALUE) {
            this.b = this.b.a();
        }
    }
}
