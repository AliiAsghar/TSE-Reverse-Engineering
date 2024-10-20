package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class atgp extends atgm implements Serializable, atgk {
    private static final long serialVersionUID = 2581698638990L;
    private volatile long a;

    /* JADX INFO: Access modifiers changed from: protected */
    public atgp(long j) {
        this.a = j;
    }

    @Override // defpackage.atgk
    public long getMillis() {
        return this.a;
    }
}
