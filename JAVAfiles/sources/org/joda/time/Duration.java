package org.joda.time;

import defpackage.atgk;
import defpackage.atgp;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Duration extends atgp implements Serializable, atgk {
    public static final Duration a = new Duration(0);
    private static final long serialVersionUID = 2471658376918L;

    public Duration(long j) {
        super(j);
    }

    public static Duration millis(long j) {
        if (j == 0) {
            return a;
        }
        return new Duration(j);
    }
}
