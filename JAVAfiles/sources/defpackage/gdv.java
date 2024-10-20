package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdv extends CancellationException {
    public final ghw a;

    public gdv(ghw ghwVar) {
        super("Cancelled isolated runner");
        this.a = ghwVar;
    }
}
