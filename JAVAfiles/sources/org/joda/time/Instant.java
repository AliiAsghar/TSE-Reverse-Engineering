package org.joda.time;

import defpackage.atfu;
import defpackage.atfz;
import defpackage.atgl;
import defpackage.atgn;
import defpackage.athk;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Instant extends atgn implements Serializable, atgl {
    private static final long serialVersionUID = 3299096530934209741L;
    private final long a;

    public Instant(long j) {
        this.a = j;
    }

    @Override // defpackage.atgl
    public final atfu a() {
        return athk.o;
    }

    @Override // defpackage.atgl
    public long getMillis() {
        return this.a;
    }

    public Instant() {
        this.a = atfz.a();
    }
}
