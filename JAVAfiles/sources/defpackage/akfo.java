package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akfo extends RuntimeException {
    public akfo() {
        super("Infinite fetch cycle detected. This occurs when a fetch does not produce a cache hit on the next load from local storage.");
    }
}
